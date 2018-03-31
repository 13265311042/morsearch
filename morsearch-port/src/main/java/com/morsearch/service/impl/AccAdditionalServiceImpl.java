package com.morsearch.service.impl;

import com.morsearch.dao.*;
import com.morsearch.model.*;
import org.springframework.stereotype.Service;


import com.morsearch.common.util.SequenceCreator;

import com.morsearch.common.util.CommonUtil;


import com.morsearch.service.AccAdditionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;


import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;


/**
 * Created by hyt on 2018/3/20.
 */

@Service("AccAdditionalService")
public class AccAdditionalServiceImpl implements AccAdditionalService {

    @Autowired
    private Acc_AdditionalMapper accAdditionalMapper;
    @Autowired
    private SysV_UserFullMapper sysV_userFullMapper;

    @Autowired
    private Acc_WalletMapper accWalletMapper;

    @Autowired
    private Acc_MemoIntegralMapper memointegralmapper;

    @Autowired
    private Acc_MemoAmtMapper acc_memoAmtMapper;

    @Override
    public int addAcc_AdditionalDesign(Acc_Additional aa) {
        return accAdditionalMapper.insertSelective(aa);
    }


    @Override
    public int addRecharge(String smid, String userid, String account,String smno,String sm_name) {

        Acc_Additional additional = new Acc_Additional();

        SysV_UserFull sf = sysV_userFullMapper.getUserDetail(Long.valueOf(userid),16);

        additional.setAa_no("E"+ SequenceCreator.createNewFileName());//充值单号);
        additional.setAa_type((short)1);
        additional.setAa_userid(Long.valueOf(userid));
        additional.setAa_username(sf.getUe_companyname());
        additional.setAa_useraccount(sf.getUr_no());
        additional.setAa_createno(smno);
        additional.setAa_createname(sm_name);
        additional.setAa_account(new BigDecimal(account));
        additional.setAa_createdate(new Date());
        additional.setAa_status((short)0);

        return accAdditionalMapper.insertSelective(additional);
    }

    @Override
    public int updaterecharge(String aid,String userid,String sm_name) {

        Acc_Additional aa = accAdditionalMapper.selectByPrimaryKey(Long.valueOf(aid));
        aa.setAa_status((short)1);
        aa.setAa_confirmno(userid);
        aa.setAa_confirmname(sm_name);
        aa.setAa_confirmdate(new Date());

         accAdditionalMapper.updateByPrimaryKeySelective(aa);

        //增加钱包余额
        Acc_Wallet aw = accWalletMapper.selectByPrimaryKey(aa.getAa_userid());
        if (CommonUtil.isNullOrEmpty(aw)){
            Acc_Wallet accWallet = new Acc_Wallet();
            accWallet.setWl_userid(aa.getAa_userid());
            accWallet.setWl_account(aa.getAa_account());
            accWallet.setWl_countrecharge(1);
            accWallet.setWl_createdate(new Date());

          accWalletMapper.insertSelective(accWallet);

        }else if (!CommonUtil.isNullOrEmpty(aw)){
            if (aw.getWl_account()==null){
                BigDecimal acc = new BigDecimal(0);
               aw.setWl_account(acc.add(aa.getAa_account()));
            }else{
                aw.setWl_account((aw.getWl_account()).add(aa.getAa_account()));
            }

            if (aw.getWl_countrecharge()==null){
                aw.setWl_countrecharge(1);
            }else{
                aw.setWl_countrecharge(aw.getWl_countrecharge()+1);
            }

            aw.setWl_updatedate(new Date());

            accWalletMapper.updateByPrimaryKeySelective(aw);

        }

        Acc_MemoAmt am = new Acc_MemoAmt();  //同时增加明细表数据
        am.setOrderno(aa.getAa_no());
        am.setOrderdate(aa.getAa_createdate());
        am.setOrdertype("add");
        am.setOrdertitle("企业充值");
        am.setOrdersign("+");
        am.setOrderaccount(aa.getAa_account());
        am.setTradeway((byte)0);
        am.setTradename("企业充值");
        am.setCurrency("￥");
        am.setCreateid(aa.getAa_userid());
        am.setAccountid(aa.getAa_userid());

        return acc_memoAmtMapper.insertSelective(am);

    }



    @Override
    public List<Acc_Additional> getAcc_AdditionalList(Map<String, Object> map) {
        return accAdditionalMapper.getAcc_AdditionalList(map);
    }

    @Override
    public Integer getCountAcc_Additional(Map<String, Object> map) {
        return accAdditionalMapper.getCountAcc_Additional(map);
    }

    @Override
    public int saveAcc_Additionaldesign(Acc_Additional aa,Long userid,BigDecimal integral) {
        //同时还需要更改钱包的余额
        //首先查看这个用户钱包的id存不存在
        Acc_Wallet acc_wallet = accWalletMapper.selectByPrimaryKey(userid);
        if(CommonUtil.isNullOrEmpty(acc_wallet)){
        //添加这个钱包的id
            Acc_Wallet aw = new Acc_Wallet();
            aw.setWl_userid(userid);
            aw.setWl_integral(integral);
            aw.setWl_countrecharge(1);//充值次数加一
            aw.setWl_createdate(new Date());
            accWalletMapper.insertSelective(aw);
        }
        if(!CommonUtil.isNullOrEmpty(acc_wallet)){
            acc_wallet.setWl_userid(userid);
            if(CommonUtil.isNullOrEmpty(acc_wallet.getWl_integral())){
                acc_wallet.setWl_integral(integral);
            }
            if(!CommonUtil.isNullOrEmpty(acc_wallet.getWl_integral())){
                acc_wallet.setWl_integral(acc_wallet.getWl_integral().add(integral));
            }
            if(!CommonUtil.isNullOrEmpty(acc_wallet.getWl_countrecharge())){//先判断是否为空
                acc_wallet.setWl_countrecharge(acc_wallet.getWl_countrecharge()+1);
            }
            if(CommonUtil.isNullOrEmpty(acc_wallet.getWl_countrecharge())){
                acc_wallet.setWl_countrecharge(1);
            }
            acc_wallet.setWl_updatedate(new Date());
            accWalletMapper.updateByPrimaryKeySelective(acc_wallet);
        }

        Acc_Additional aaaaa = accAdditionalMapper.getAcc_AdditionalDesignDetail(aa.getAa_id(), 1);

        //同时还要增加设计师明细
        Acc_MemoIntegral ami=new Acc_MemoIntegral();
        ami.setMi_type("5.附加充值");
        ami.setMi_sourceno(aaaaa.getAa_no());//用户充值单号
        ami.setMi_activityid(Long.valueOf(0));
        ami.setMi_activityname("额外充值");
        ami.setMi_integral(integral);
        ami.setMi_accountid(aaaaa.getAa_userid());
        ami.setMi_createid(aaaaa.getAa_userid());
        ami.setMi_date(new Date());
        ami.setMi_typesign("+");
        memointegralmapper.insertSelective(ami);
        return accAdditionalMapper.updateByPrimaryKeySelective(aa);
    }

    @Override
    public Acc_Additional getAcc_AdditionalDesignDetail(long aa_id, int type) {
        return accAdditionalMapper.getAcc_AdditionalDesignDetail(aa_id,type);
    }

    @Override
    public int saveAcc_Additionaldesignstatus(Acc_Additional aa) {
        return accAdditionalMapper.updateByPrimaryKeySelective(aa);
    }

}

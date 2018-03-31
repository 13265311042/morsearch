package com.morsearch.service.impl;

import com.morsearch.common.util.CommonUtil;
import com.morsearch.dao.*;
import com.morsearch.model.*;
import com.morsearch.service.SalesEvaluateService;
import com.morsearch.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by hyt on 2017/11/3.
 */
@Service("salesEvaluateService")
public class SalesEvaluateServiceImpl implements SalesEvaluateService {

    @Resource
    private Sales_EvaluateMapper sales_evaluateMapper;

    @Resource
    private Sys_UserMapper sys_userMapper;

    @Resource
    private Sales_OrderMapper sales_orderMapper;

    @Resource
    private Sys_User_MsgMapper sys_user_msgMapper;

    @Autowired
    private AA_CommMapper commMapper;
    @Resource
    private Award_Evaluate_CountMapper award_evaluate_countmapper;
    @Resource
    private WalletService walletService;

    @Resource
    private SysV_UserFullMapper userfullmapper;

    //评价人列表
    @Override
    public List<Sales_Evaluate> getSales_EvaluateList(Map<String, Object> map) {
        return sales_evaluateMapper.getsales_evaluatelist(map );
    }

    //评价人总数
    @Override
    public int getCountSales_Evaluate(Map<String, Object> map) {
        return sales_evaluateMapper.getCountsales_evaluate(map);
    }

    @Override
    public List<Sales_Evaluate> getlist(Long id) {
        return sales_evaluateMapper.getlist(id);
    }

    @Override
    public int addSales_Evaluate(Long se_salesmanid,Integer anonymity,String se_contentvalue,String se_contentgrade,String se_contentgroup,String no,String name,Long createid,String createno) {
        int iadd=0;

        Sales_Evaluate se = new Sales_Evaluate();
        se.setSe_salesmanid(se_salesmanid);
        se.setSe_orderno(no);
        se.setSe_contentgroup(se_contentgroup);
        se.setSe_contentvalue(se_contentvalue);
        se.setSe_contentgrade(se_contentgrade);
        se.setSe_createdate(new Date());
        if (anonymity==1){
            se.setSe_anonymity(true);
            se.setSe_appraiser("**");
        }else{
            se.setSe_anonymity(false);
            se.setSe_appraiser(name);
        }
        se.setSe_createid(createid);
        se.setSe_createno(createno);

        SysV_UserFull suf=userfullmapper.getUserDetail(createid,6);
        if (suf!=null&&suf.getUr_imageurl()!=null) {
            se.setSe_appraiseimage(suf.getUr_imageurl());
        };
        iadd=sales_evaluateMapper.insertSelective(se);

/*标注用户信息*/
        Sys_User_Msg sm =  sys_user_msgMapper.selectByPrimaryKey(se_salesmanid);
        if (sm!=null) {
            sm.setUm_evaluatesum(CommonUtil.read_int(sm.getUm_evaluatesum())  + Integer.valueOf(se_contentgrade));
            sm.setUm_evaluatecount(CommonUtil.read_int(sm.getUm_evaluatecount()) + 1);
            sys_user_msgMapper.updateByPrimaryKey(sm);
        };

/*标注订单*/
        Long orderid  = sales_orderMapper.getOrderId(no);
        Sales_Order som=new Sales_Order();
        som.setOf_id(orderid);
        som.setOf_flagappraisedesi(true);/*标注设计师已评价*/
        som.setOf_dateappraisedesi(new Date());
        sales_orderMapper.updateByPrimaryKeySelective(som);

/*增加赠送明细 Leoli begin*/
            Map<String,Object> ac=commMapper.getFn_Award_Evaluate(se_salesmanid);
            if (ac!=null&& CommonUtil.convert_Long(ac.get("baid").toString())!=0){
			/*增加明细*/
            Award_Evaluate_Count asc=new Award_Evaluate_Count();
            asc.setSc_activityid(CommonUtil.convert_Long(ac.get("baid").toString()));
            asc.setSc_orderno(no);
            asc.setSc_appraiseid(se_salesmanid);
            asc.setSc_addintegral(new BigDecimal(CommonUtil.convert_Long(ac.get("integral").toString())));
            asc.setSc_isfirst(CommonUtil.convert_boolean(ac.get("isfirst").toString()));
            asc.setSc_userid(createid);
            asc.setSc_createdate(new Date());
            award_evaluate_countmapper.insertSelective(asc);
			/*增加分享人积分*/
            walletService.addintegral(createid,CommonUtil.convert_bigdecimal(ac.get("integral").toString())
                        ,Long.valueOf(ac.get("baid").toString()),ac.get("baname").toString(),"10.设计师评价");
            };
/*增加赠送明细 leoli end*/

        return iadd;

    }
}

package com.morsearch.service.impl;

import com.morsearch.common.util.CommonUtil;
import com.morsearch.dao.*;
import com.morsearch.model.*;
import com.morsearch.service.DesigEvaluateService;
import com.morsearch.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by hyt on 2017/10/24.
 */
@Service("DesigEvaluateService")
public class DesigEvaluateServiceImpl implements DesigEvaluateService{


    @Resource
    private Desig_EvaluateMapper desigEvaluateMapper;

    @Resource
    private Sales_OrderMapper sales_orderMapper;

    @Resource
    private Sys_UserMapper sys_userMapper;

    @Resource
    private Pm_ArchivesMapper pm_archivesMapper;
    @Resource
    private Sys_User_MsgMapper sys_user_msgMapper;
    @Autowired
    private AA_CommMapper commMapper;
    @Resource
    private Award_Evaluate_CountMapper award_evaluate_countmapper;
    @Resource
    private WalletService walletService;

    @Override
    public int updateByPrimaryKey(Desig_Evaluate record) {
        return desigEvaluateMapper.updateByPrimaryKey(record);
    }

    @Override
    public int addDesig_Evaluate(Long designerid, Integer anonymity, String contentvalue, String contentgrade, String de_contentgroup, String no,Long createid) {
        Sys_User su = sys_userMapper.selectByPrimaryKey(createid);
        Desig_Evaluate de = new Desig_Evaluate();
        de.setDe_designerid(designerid);
        de.setDe_orderno(no);
        de.setDe_contentgroup(de_contentgroup);
        de.setDe_contentvalue(contentvalue);
        de.setDe_contentgrade(contentgrade);
        de.setDe_createdate(new Date());
        if (anonymity==1){
            de.setDe_anonymity(true);
            de.setDe_appraiser("**");
        }else{
            de.setDe_anonymity(false);
            de.setDe_appraiser(su.getUr_namenick());
        }
        de.setDe_createid(createid);
        de.setDe_createno(su.getUr_no());
        de.setDe_appraiseimage(su.getUr_imageurl());

        Sys_User_Msg sum = sys_user_msgMapper.selectByPrimaryKey(designerid);
        if (sum.getUm_evaluatesum()==null){
            sum.setUm_evaluatesum(0+Integer.valueOf(contentgrade));
        }else{
            sum.setUm_evaluatesum(sum.getUm_evaluatesum()+Integer.valueOf(contentgrade));
        }
        if (sum.getUm_evaluatecount()==null){
            sum.setUm_evaluatecount(1);
        }else{
            sum.setUm_evaluatecount(sum.getUm_evaluatecount()+1);
        }
        sys_user_msgMapper.updateByPrimaryKeySelective(sum);

        Long oid  = sales_orderMapper.getOrderId(no);
        Sales_Order so = new Sales_Order();
        so.setOf_id(oid);
        so.setOf_flagappraisesale(true);
        so.setOf_dateappraisesale(new Date());
        so.setOf_flagfinish(true);
        sales_orderMapper.updateByPrimaryKeySelective(so);
        int iadd=desigEvaluateMapper.insertSelective(de);

/*增加赠送明细 Leoli begin*/
        Map<String,Object> ac=commMapper.getFn_Award_Evaluate(designerid);
        if (ac!=null&& CommonUtil.convert_Long(ac.get("baid").toString())!=0){
			/*增加明细*/
            Award_Evaluate_Count asc=new Award_Evaluate_Count();
            asc.setSc_activityid(CommonUtil.convert_Long(ac.get("baid").toString()));
            asc.setSc_orderno(no);
            asc.setSc_appraiseid(designerid);
            asc.setSc_addintegral(new BigDecimal(CommonUtil.convert_Long(ac.get("integral").toString())));
            asc.setSc_isfirst(CommonUtil.convert_boolean(ac.get("isfirst").toString()));
            asc.setSc_userid(createid);
            asc.setSc_createdate(new Date());
            award_evaluate_countmapper.insertSelective(asc);
			/*增加分享人积分*/
            walletService.addintegral(createid,CommonUtil.convert_bigdecimal(ac.get("integral").toString())
                    ,Long.valueOf(ac.get("baid").toString()),ac.get("baname").toString(),"11.业务员评价");
        };
/*增加赠送明细 leoli end*/

        return iadd;

    }

    //设计师评价列表
    @Override
    public List<Desig_Evaluate> getDesig_EvaluateList(Map<String, Object> map) {
         return  desigEvaluateMapper.getDesig_EvaluateList(map);
    }

    //设计师评价条数
    @Override
    public int getCountDesig_Evaluate(Map<String, Object> map) {
        return desigEvaluateMapper.getCountDesig_Evaluate(map);
    }

    //设计师评价详情
    @Override
    public Desig_Evaluate getDesignEvaluatedetail(Long id) {
        return desigEvaluateMapper.selectByPrimaryKey(id);
    }

    @Override
    public Desig_Evaluate getDesignEvaluateNo(String no) {
        return desigEvaluateMapper.getDesignEvaluateNo(no);
    }

    @Override
    public int insertcountByPm_Archives(long pa_id) {
        //同时在浏览次数上加一
        Pm_Archives pa = pm_archivesMapper.getArchivesDetail(pa_id, 3);
        if(pa.getPa_count_browse()==null){
            pa.setPa_count_browse(0);
        }
        pa.setPa_count_browse(pa.getPa_count_browse()+1);//浏览加一
        int iadd= pm_archivesMapper.updateByPrimaryKeySelective(pa);
        return iadd;
    }

    @Override
    public List<Desig_Evaluate> getDesignEvaluateContentgrade(Long createid) {
        return desigEvaluateMapper.getDesignEvaluateContentgrade(createid);
    }


}

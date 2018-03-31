package com.morsearch.service;

import com.morsearch.model.Acc_Additional;


import java.util.List;
import java.util.Map;


import java.math.BigDecimal;
import java.util.List;
import java.util.Map;


/**
 * Created by hyt on 2018/3/20.
 */
public interface AccAdditionalService {

    int addAcc_AdditionalDesign(Acc_Additional aa);//额外充值

    int addRecharge(String smid,String userid,String account,String smno,String sm_name);

    int updaterecharge(String aid,String userid,String sm_name);


    List<Acc_Additional> getAcc_AdditionalList(Map<String, Object> map);//列表

    Integer getCountAcc_Additional(Map<String, Object> map);//总数

    int saveAcc_Additionaldesign(Acc_Additional aa,Long userid,BigDecimal integral);//审核

    Acc_Additional getAcc_AdditionalDesignDetail(long l, int type);

    int saveAcc_Additionaldesignstatus(Acc_Additional aa);
}

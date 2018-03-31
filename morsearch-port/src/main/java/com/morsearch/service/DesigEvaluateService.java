package com.morsearch.service;

import com.morsearch.model.Desig_Evaluate;
import com.morsearch.model.Pm_Archives;

import java.util.List;
import java.util.Map;

/**
 * Created by hyt on 2017/10/24.
 */
public interface DesigEvaluateService {


    int updateByPrimaryKey(Desig_Evaluate record);

    int addDesig_Evaluate(Long designerid, Integer anonymity, String contentvalue, String contentgrade, String de_contentgroup, String no, Long id);

    List<Desig_Evaluate> getDesig_EvaluateList(Map<String, Object> map);//列表

    int getCountDesig_Evaluate(Map<String, Object> map);//条数

    Desig_Evaluate getDesignEvaluatedetail(Long id);

    Desig_Evaluate getDesignEvaluateNo(String no);

    int insertcountByPm_Archives(long l);

    List<Desig_Evaluate> getDesignEvaluateContentgrade(Long createid);
}

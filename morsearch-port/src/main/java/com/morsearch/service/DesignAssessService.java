package com.morsearch.service;

import com.morsearch.model.Desig_Evaluate;

import java.util.List;
import java.util.Map;

/**
 * Created by hyt on 2017/10/19.
 */
public interface DesignAssessService {

    List<Desig_Evaluate> getDesigList(Map<String, Object> map);//得到评价列表

    int getDesigListCount(Map<String, Object> map);

}

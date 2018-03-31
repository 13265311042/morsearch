package com.morsearch.service;

import com.morsearch.model.Sales_Evaluate;

import java.util.List;
import java.util.Map;

/**
 * Created by hyt on 2017/11/3.
 */
public interface SalesEvaluateService {

    List<Sales_Evaluate> getSales_EvaluateList(Map<String, Object> map);//评价人列表

    int getCountSales_Evaluate(Map<String, Object> map);//评价人总数

    List<Sales_Evaluate> getlist(Long id);

    int addSales_Evaluate(Long se_salesmanid, Integer anonymity, String se_contentvalue, String se_contentgrade, String se_contentgroup, String no, String name, Long id, String createno);
}

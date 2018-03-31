package com.morsearch.service;

import com.morsearch.model.DesigV_Search_Sales;

import java.util.List;
import java.util.Map;

/**
 * Created by ywh on 2017-11-21.
 */
public interface DesigVsearchSalesService {

    List<DesigV_Search_Sales> getDesigV_Search_SalesList(Map<String, Object> map);//列表

    int getCountDesigV_Search_Sales(Map<String, Object> map);//总数
}

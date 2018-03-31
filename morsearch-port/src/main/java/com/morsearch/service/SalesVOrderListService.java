package com.morsearch.service;

import com.morsearch.model.SalesV_Order_List;

import java.util.List;
import java.util.Map;

/**
 * Created by zuoxiaochao on 2017/11/8.
 */
public interface SalesVOrderListService {

    List<SalesV_Order_List> getSalesVOrderListList(Map<String, Object> map);//查询订单列表

    int getCountSalesVOrderList(Map<String, Object> map);//查询订单的数量
}

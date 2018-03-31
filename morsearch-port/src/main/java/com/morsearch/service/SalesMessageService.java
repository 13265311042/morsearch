package com.morsearch.service;

import com.morsearch.model.Sales_Message;

import java.util.List;
import java.util.Map;

/**
 * Created by hyt on 2017/11/6.
 */
public interface SalesMessageService {

    List<Sales_Message> getSales_MessageList(Map<String, Object> map);//订单对话消息

    int getCountSales_Message(Map<String, Object> map);//订单对话总数

    Sales_Message getSale_Messagedetail(Long id);//获取详情

    int saveSalesMessagedetail(Sales_Message sm);//修改状态
}

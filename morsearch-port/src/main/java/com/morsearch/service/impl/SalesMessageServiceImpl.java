package com.morsearch.service.impl;

import com.morsearch.dao.Sales_MessageMapper;
import com.morsearch.model.Sales_Message;
import com.morsearch.service.SalesMessageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by hyt on 2017/11/6.
 */
@Service("salesMessageService")
public class SalesMessageServiceImpl implements SalesMessageService {

    @Resource
    private Sales_MessageMapper sales_messageMapper;
    //订单对话消息
    @Override
    public List<Sales_Message> getSales_MessageList(Map<String, Object> map) {
        return sales_messageMapper.getSalesMessageList(map);
    }

    //订单对话总数
    @Override
    public int getCountSales_Message(Map<String, Object> map) {
        return sales_messageMapper.getSalesMessageCount(map);
    }

    //得到订单对话详细信息
    @Override
    public Sales_Message getSale_Messagedetail(Long id) {
        return sales_messageMapper.selectByPrimaryKey(id);
    }

    //修改状态
    @Override
    public int saveSalesMessagedetail(Sales_Message sm) {
        return sales_messageMapper.updateByPrimaryKeySelective( sm);
    }
}

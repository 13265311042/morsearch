package com.morsearch.service.impl;

import com.morsearch.dao.SalesV_Order_ListMapper;
import com.morsearch.model.SalesV_Order_List;
import com.morsearch.service.SalesVOrderListService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by hyt on 2017/11/8.
 */
@Service("salesVOrderListService")
public class SalesVOrderListServiceImpl implements SalesVOrderListService{

    @Resource
    private SalesV_Order_ListMapper salesV_order_listMapper;

    @Override
    public List<SalesV_Order_List> getSalesVOrderListList(Map<String, Object> map) {
        return salesV_order_listMapper.getSalesVOrderListList(map);
    }

    @Override
    public int getCountSalesVOrderList(Map<String, Object> map) {
        return salesV_order_listMapper.getCountSalesVOrderList(map);
    }
}

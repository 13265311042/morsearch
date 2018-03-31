package com.morsearch.service.impl;

import com.morsearch.dao.SalesV_Order_personMapper;
import com.morsearch.model.SalesV_Order_person;
import com.morsearch.service.SalesVOrderPersonService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by ywh on 2017-12-19.
 */
@Service("SalesVOrderPersonService")
public class SalesVOrderPersonServiceImpl implements SalesVOrderPersonService{
    @Resource
    private SalesV_Order_personMapper salesV_order_personMapper;


    @Override
    public List<SalesV_Order_person> getSalesV_Order_personlist(Map<String, Object> map) {
        return salesV_order_personMapper.getSalesV_Order_personlist(map);
    }

    @Override
    public List<SalesV_Order_person> getSalesV_Order_personlist1(Map<String, Object> map) {
        return salesV_order_personMapper.getSalesV_Order_personlist1(map);
    }

    @Override
    public List<SalesV_Order_person> getSalesV_Order_personlist2(Map<String, Object> map) {
        return salesV_order_personMapper.getSalesV_Order_personlist2(map);
    }

    @Override
    public int getSalesV_Order_personCount(Map<String, Object> map) {
        return salesV_order_personMapper.getSalesV_Order_personCount(map);
    }
}

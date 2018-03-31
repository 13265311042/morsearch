package com.morsearch.service.impl;

import com.morsearch.dao.MallV_Order_ShowMapper;
import com.morsearch.model.MallV_Order_Show;
import com.morsearch.service.OrderDetailsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by ywh on 2018-1-8.
 */
@Service("OrderDetailsService")
public class OrderDetailsServiceImpl implements OrderDetailsService {
    @Resource
    private MallV_Order_ShowMapper mallV_order_showMapper;


    @Override
    public List<MallV_Order_Show> getMallV_Order_Show(Map<String, Object> map) {
        return mallV_order_showMapper.getMallV_Order_ShowList(map);
    }

    @Override
    public int getMallV_Order_ShowCount(Map<String, Object> map) {
        return mallV_order_showMapper.getMallV_Order_ShowCount(map);
    }

    @Override
    public MallV_Order_Show selectMallV_Order_Show(String  no) {
        return mallV_order_showMapper.selectMallV_Order_Show(no);
    }
}

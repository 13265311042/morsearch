package com.morsearch.service;

import com.morsearch.model.MallV_Order_Show;

import java.util.List;
import java.util.Map;

/**
 * Created by ywh on 2018-1-8.
 */
public interface OrderDetailsService {

    List<MallV_Order_Show> getMallV_Order_Show(Map<String, Object> map);/*列表*/

    int getMallV_Order_ShowCount(Map<String, Object> map);

    MallV_Order_Show selectMallV_Order_Show(String  no);

}

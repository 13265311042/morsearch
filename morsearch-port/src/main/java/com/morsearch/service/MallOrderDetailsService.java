package com.morsearch.service;

import com.morsearch.model.Acc_Wallet;
import com.morsearch.model.Mall_Order;
import com.morsearch.model.Mall_Order_Detail;

import java.math.BigDecimal;

/**
 * Created by ywh on 2018-1-4.
 */
public interface MallOrderDetailsService {

    Mall_Order getorder(String no,int type);

    Mall_Order_Detail getMallOrder(String no);

    Mall_Order getMall_Order(Long  moid);

    int updateMall_Order(String no,String refund);

    int updateByPrimaryKeySelective(Mall_Order record);

    Acc_Wallet selectByPrimaryKey(Long wl_userid);
}

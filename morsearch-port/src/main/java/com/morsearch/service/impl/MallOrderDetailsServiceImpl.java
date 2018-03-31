package com.morsearch.service.impl;

import com.morsearch.dao.Acc_WalletMapper;
import com.morsearch.dao.Mall_OrderMapper;
import com.morsearch.dao.Mall_Order_DetailMapper;
import com.morsearch.model.Acc_Wallet;
import com.morsearch.model.Mall_Order;
import com.morsearch.model.Mall_Order_Detail;
import com.morsearch.service.MallOrderDetailsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * Created by ywh on 2018-1-5.
 */
@Service("MallOrderDetailsService")
public class MallOrderDetailsServiceImpl implements MallOrderDetailsService {
    @Resource
    private Acc_WalletMapper acc_walletMapper;

    @Resource
    private Mall_Order_DetailMapper mall_order_detailMapper;
    @Resource
    private Mall_OrderMapper mall_orderMapper;
    @Override
    public Mall_Order getorder(String no,int type) {
        return mall_orderMapper.getOrderMemo(no, type);
    }

    @Override
    public Mall_Order_Detail getMallOrder(String no) {
        return mall_order_detailMapper.getMallOrder(no);
    }

    @Override
    public Mall_Order getMall_Order(Long moid) {
        return mall_orderMapper.selectByPrimaryKey(moid);
    }

    @Override
    public int updateMall_Order(String no,String refund) {
        Mall_Order mo = mall_orderMapper.getOrderMemo(no,3);
        Acc_Wallet aw = acc_walletMapper.selectByPrimaryKey(mo.getMo_userid());
        BigDecimal volumn = (aw.getWl_integral()).add(new BigDecimal(refund));
        aw.setWl_integral(volumn);

        acc_walletMapper.updateByPrimaryKeySelective(aw);
        mo.setMo_traderefundamount(Long.valueOf(refund));
        mo.setMo_status((byte)9);
        return mall_orderMapper.updateByPrimaryKeySelective(mo);
    }

    @Override
    public int updateByPrimaryKeySelective(Mall_Order record) {
        return mall_orderMapper.updateByPrimaryKeySelective(record);
    }


    @Override
    public Acc_Wallet selectByPrimaryKey(Long wl_userid) {
        return acc_walletMapper.selectByPrimaryKey(wl_userid);
    }
}

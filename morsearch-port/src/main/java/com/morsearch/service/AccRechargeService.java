package com.morsearch.service;

import com.morsearch.model.Acc_Recharge;

import java.util.List;
import java.util.Map;

/**
 * Created by hyt on 2017/11/10.
 */
public interface AccRechargeService {

    List<Acc_Recharge> getAcc_RechargeList(Map<String, Object> map);//余额充值列表

    int getCountAcc_Recharge(Map<String, Object> map);//余额充值数量


}

package com.morsearch.service;

import com.morsearch.model.Acc_Buy;

import java.util.List;
import java.util.Map;

/**
 * Created by hyt on 2017/11/13.
 */

public interface AccBuyService {
    List<Acc_Buy> getAcc_BuyList(Map<String, Object> map);

    int getCountAcc_Buy(Map<String, Object> map);
}

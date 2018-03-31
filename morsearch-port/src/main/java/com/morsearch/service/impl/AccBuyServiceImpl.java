package com.morsearch.service.impl;

import com.morsearch.dao.Acc_BuyMapper;
import com.morsearch.model.Acc_Buy;
import com.morsearch.service.AccBuyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by hyt on 2017/11/13.
 */
@Service("accBuyService")
public class AccBuyServiceImpl implements AccBuyService {

    @Resource
    private Acc_BuyMapper acc_buyMapper;

    @Override
    public List<Acc_Buy> getAcc_BuyList(Map<String, Object> map) {
        return acc_buyMapper.getAcc_BuyList(map);
    }

    @Override
    public int getCountAcc_Buy(Map<String, Object> map) {
        return acc_buyMapper.getCountAcc_Buy(map);
    }
}

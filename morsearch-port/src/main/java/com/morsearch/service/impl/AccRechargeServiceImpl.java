package com.morsearch.service.impl;

import com.morsearch.dao.Acc_RechargeMapper;
import com.morsearch.model.Acc_Recharge;
import com.morsearch.service.AccRechargeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by hyt on 2017/11/10.
 */
@Service("accRechargeService")
public class AccRechargeServiceImpl implements AccRechargeService {

    @Resource
    private Acc_RechargeMapper acc_rechargeMapper;

    @Override
    public List<Acc_Recharge> getAcc_RechargeList(Map<String, Object> map) {
        return acc_rechargeMapper.getAcc_RechargeList(map);
    }

    @Override
    public int getCountAcc_Recharge(Map<String, Object> map) {
        return acc_rechargeMapper.getCountAcc_Recharge(map);
    }
}

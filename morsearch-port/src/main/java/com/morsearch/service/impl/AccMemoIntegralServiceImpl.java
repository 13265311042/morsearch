package com.morsearch.service.impl;

import com.morsearch.dao.Acc_MemoIntegralMapper;
import com.morsearch.model.Acc_MemoIntegral;
import com.morsearch.service.AccMemoIntegralService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by hyt on 2018-2-8.
 */

@Service("AccMemoIntegralService")
public class AccMemoIntegralServiceImpl implements AccMemoIntegralService {

    @Resource
    private Acc_MemoIntegralMapper acc_memoIntegralMapper;

    @Override
    public List<Acc_MemoIntegral> getAcc_MemoIntegralList(Map<String, Object> map) {
        return acc_memoIntegralMapper.getAcc_MemoIntegralList(map);
    }

    @Override
    public int getCountAcc_MemoIntegral(Map<String, Object> map) {
        return acc_memoIntegralMapper.getCountAcc_MemoIntegral(map);
    }
}

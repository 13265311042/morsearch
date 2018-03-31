package com.morsearch.service.impl;

import com.morsearch.dao.MallV_EvaluateMapper;
import com.morsearch.dao.Mall_EvaluateMapper;
import com.morsearch.model.MallV_Evaluate;
import com.morsearch.model.Mall_Evaluate;
import com.morsearch.model.Mall_EvaluateExample;
import com.morsearch.service.MallEvaluateService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by hyt on 2017/12/19.
 */
@Service("MallEvaluateService")
public class MallEvaluateServiceImpl implements MallEvaluateService {

    @Resource
    private Mall_EvaluateMapper mall_evaluateMapper;

    @Resource
    private MallV_EvaluateMapper mallV_evaluateMapper;

    @Override
    public List<Mall_Evaluate> getMall_EvaluateList(Map<String, Object> map) {
        return mall_evaluateMapper.getMall_EvaluateList(map);
    }

    @Override
    public Integer getCountMall_Evaluate(Map<String, Object> map) {
        return mall_evaluateMapper.getCountMall_Evaluate(map);
    }

    @Override
    public List<MallV_Evaluate> getMallV_EvaluateList(Map<String, Object> map) {
        return mallV_evaluateMapper.getMallV_EvaluateList(map);
    }

    @Override
    public Integer getCountMallV_Evaluate(Map<String, Object> map) {
        return mallV_evaluateMapper.getCountMallV_Evaluate(map);
    }
}

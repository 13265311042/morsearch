package com.morsearch.service.impl;

import com.morsearch.dao.AwardV_EvaluateMapper;
import com.morsearch.dao.AwardV_Evaluate_CountMapper;
import com.morsearch.dao.Award_EvaluateMapper;
import com.morsearch.dao.Award_Evaluate_CountMapper;
import com.morsearch.model.*;
import com.morsearch.service.AwardVEvaluateService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by hyt on 2017/12/14.
 */
@Service("AwardVEvaluateService")
public class AwardVEvaluateServiceImpl implements AwardVEvaluateService {

    @Resource
    private AwardV_EvaluateMapper awardV_evaluateMapper;

    @Resource
    private Award_EvaluateMapper award_evaluateMapper;


    @Resource
    private Award_Evaluate_CountMapper award_evaluate_countMapper;

    @Resource
    private AwardV_Evaluate_CountMapper awardv_evaluate_countMapper;
    @Override
    public List<AwardV_Evaluate> getAwardV_EvaluateList(Map<String, Object> map) {
        return awardV_evaluateMapper.getAwardV_EvaluateList(map);
    }

    @Override
    public Integer getCountAwardV_Evaluate(Map<String, Object> map) {
        return awardV_evaluateMapper.getCountAwardV_Evaluate(map);
    }

    @Override
    public int addAward_Evaluate(Award_Evaluate ba) {
        return award_evaluateMapper.insertSelective(ba);
    }

    @Override
    public Award_Evaluate getAward_Evaluatedetail(long l) {
        return award_evaluateMapper.selectByPrimaryKey(l);
    }

    @Override
    public int updateAward_Evaluate(Award_Evaluate ar) {
        return award_evaluateMapper.updateByPrimaryKeySelective(ar);
    }

    @Override
    public int deleteAward_EvaluateById(long l) {
        return award_evaluateMapper.deleteByPrimaryKey(l);
    }

    @Override
    public int updateAward_Evaluatestatus(Award_Evaluate ar) {
        return award_evaluateMapper.updateByPrimaryKeySelective(ar);
    }

    @Override
    public List<AwardV_Evaluate_Count> getAwardV_Evaluate_Countdetaillist(long l) {
        AwardV_Evaluate_CountExample example = new AwardV_Evaluate_CountExample();
        AwardV_Evaluate_CountExample.Criteria criteria = example.createCriteria();
        criteria.andSc_activityidEqualTo(l);
        return awardv_evaluate_countMapper.selectByExample(example);
    }

    @Override
    public List<AwardV_Evaluate_Count> getAwardV_Evaluate_CountList(Map<String, Object> map) {
        return awardv_evaluate_countMapper.getAwardV_Evaluate_CountList(map);
    }

    @Override
    public Integer getCountAwardV_Evaluate_Count(Map<String, Object> map) {
        return awardv_evaluate_countMapper.getCountAwardV_Evaluate_Count(map);
    }

}

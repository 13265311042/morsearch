package com.morsearch.service.impl;

import com.morsearch.dao.*;
import com.morsearch.model.*;
import com.morsearch.service.AwardVService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by hyt on 2017/12/12.
 */
@Service("AwardVService")
public class AwardVServiceImpl implements AwardVService {

    @Resource
    private AwardV_RechargeMapper awardV_rechargeMapper;

    @Resource
    private Award_RechargeMapper award_rechargeMapper;

    @Resource
    private Award_Recharge_RuleMapper award_recharge_ruleMapper;

    @Resource
    private AwardV_Recharge_CountMapper awardv_recharge_countmapper;

    @Override
    public List<AwardV_Recharge> getAwardV_RechargeList(Map<String, Object> map) {
        return awardV_rechargeMapper.getAwardV_RechargeList(map);
    }

    @Override
    public Integer getCountAwardV_Recharge(Map<String, Object> map) {
        return awardV_rechargeMapper.getCountAwardV_Recharge(map);
    }

    @Override
    public int addAward_Recharge(Award_Recharge ba) {
        return award_rechargeMapper.insertSelective(ba);
    }

    @Override
    public int addAward_Recharge_Rule(Award_Recharge_Rule arr) {
        return award_recharge_ruleMapper.insertSelective(arr);
    }

    @Override
    public Award_Recharge getAward_Rechargedetail(long l) {
        return award_rechargeMapper.selectByPrimaryKey(l);
    }

    @Override
    public List<Award_Recharge_Rule> getAward_Recharge_RuleList(long l) {
        Award_Recharge_RuleExample example = new Award_Recharge_RuleExample();
        Award_Recharge_RuleExample.Criteria criteria = example.createCriteria();
        criteria.andArm_baidEqualTo(l);
        return  award_recharge_ruleMapper.selectByExample(example);
    }

    @Override
    public int deleteAward_RechargeById(long l) {
        return award_rechargeMapper.deleteByPrimaryKey(l);
    }

    @Override
    public int updateAward_Rechargestatus(Award_Recharge ar) {
        return award_rechargeMapper.updateByPrimaryKeySelective(ar);
    }

    @Override
    public Award_Recharge_Rule getAward_Recharge_Ruledetail(long l, String arm_index) {
        Award_Recharge_RuleExample example = new Award_Recharge_RuleExample();
        Award_Recharge_RuleExample.Criteria criteria = example.createCriteria();
        criteria.andArm_baidEqualTo(l);
        criteria.andArm_indexEqualTo(arm_index);
        List<Award_Recharge_Rule> arrlist = award_recharge_ruleMapper.selectByExample(example);
        if(arrlist!=null&&arrlist.size()>0){
            return  arrlist.get(0);
        }
        return null;
    }

    @Override
    public int updateAward_Recharge(Award_Recharge ar) {
        return award_rechargeMapper.updateByPrimaryKeySelective(ar);
    }

    @Override
    public int updateAward_Recharge_Rule(Award_Recharge_Rule arr) {
        return award_recharge_ruleMapper.updateByPrimaryKeySelective(arr);
    }

    @Override
    public List<AwardV_Recharge_Count> getAwardV_Recharge_CountList(long l) {
        AwardV_Recharge_CountExample example = new AwardV_Recharge_CountExample();
        AwardV_Recharge_CountExample.Criteria criteria = example.createCriteria();
        criteria.andSc_activityidEqualTo(l);
        return awardv_recharge_countmapper.selectByExample(example);
    }

}

package com.morsearch.service;

import com.morsearch.model.AwardV_Recharge;
import com.morsearch.model.AwardV_Recharge_Count;
import com.morsearch.model.Award_Recharge;
import com.morsearch.model.Award_Recharge_Rule;

import java.util.List;
import java.util.Map;

/**
 * Created by hyt on 2017/12/12.
 */
public interface AwardVService {

    List<AwardV_Recharge> getAwardV_RechargeList(Map<String, Object> map);

    Integer getCountAwardV_Recharge(Map<String, Object> map);

    int addAward_Recharge(Award_Recharge ba);

    int addAward_Recharge_Rule(Award_Recharge_Rule arr);

    Award_Recharge getAward_Rechargedetail(long l);


    List<Award_Recharge_Rule> getAward_Recharge_RuleList(long l);

    int deleteAward_RechargeById(long l);//删除充值活动

    int updateAward_Rechargestatus(Award_Recharge ar);//发布

    Award_Recharge_Rule getAward_Recharge_Ruledetail(long l, String arm_index);

    int updateAward_Recharge(Award_Recharge ar);

    int updateAward_Recharge_Rule(Award_Recharge_Rule arr);

    List<AwardV_Recharge_Count> getAwardV_Recharge_CountList(long l);
}

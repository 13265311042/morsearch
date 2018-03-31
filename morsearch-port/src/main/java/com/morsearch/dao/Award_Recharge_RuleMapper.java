package com.morsearch.dao;

import com.morsearch.model.Award_Recharge_Rule;
import com.morsearch.model.Award_Recharge_RuleExample;
import com.morsearch.model.Award_Recharge_RuleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Award_Recharge_RuleMapper {
    int countByExample(Award_Recharge_RuleExample example);

    int deleteByExample(Award_Recharge_RuleExample example);

    int deleteByPrimaryKey(Award_Recharge_RuleKey key);

    int insert(Award_Recharge_Rule record);

    int insertSelective(Award_Recharge_Rule record);

    List<Award_Recharge_Rule> selectByExample(Award_Recharge_RuleExample example);

    Award_Recharge_Rule selectByPrimaryKey(Award_Recharge_RuleKey key);

    int updateByExampleSelective(@Param("record") Award_Recharge_Rule record, @Param("example") Award_Recharge_RuleExample example);

    int updateByExample(@Param("record") Award_Recharge_Rule record, @Param("example") Award_Recharge_RuleExample example);

    int updateByPrimaryKeySelective(Award_Recharge_Rule record);

    int updateByPrimaryKey(Award_Recharge_Rule record);
}
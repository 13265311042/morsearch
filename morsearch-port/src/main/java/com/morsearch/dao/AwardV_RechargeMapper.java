package com.morsearch.dao;

import com.morsearch.model.AwardV_Recharge;
import com.morsearch.model.AwardV_RechargeExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface AwardV_RechargeMapper {
    int countByExample(AwardV_RechargeExample example);

    int deleteByExample(AwardV_RechargeExample example);

    int insert(AwardV_Recharge record);

    int insertSelective(AwardV_Recharge record);

    List<AwardV_Recharge> selectByExample(AwardV_RechargeExample example);

    int updateByExampleSelective(@Param("record") AwardV_Recharge record, @Param("example") AwardV_RechargeExample example);

    int updateByExample(@Param("record") AwardV_Recharge record, @Param("example") AwardV_RechargeExample example);

    //自定义
    List<AwardV_Recharge> getAwardV_RechargeList(Map<String, Object> map);

    Integer getCountAwardV_Recharge(Map<String, Object> map);
}
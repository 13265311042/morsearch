package com.morsearch.dao;

import com.morsearch.model.AwardV_Recharge_Count;
import com.morsearch.model.AwardV_Recharge_CountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AwardV_Recharge_CountMapper {
    int countByExample(AwardV_Recharge_CountExample example);

    int deleteByExample(AwardV_Recharge_CountExample example);

    int insert(AwardV_Recharge_Count record);

    int insertSelective(AwardV_Recharge_Count record);

    List<AwardV_Recharge_Count> selectByExample(AwardV_Recharge_CountExample example);

    int updateByExampleSelective(@Param("record") AwardV_Recharge_Count record, @Param("example") AwardV_Recharge_CountExample example);

    int updateByExample(@Param("record") AwardV_Recharge_Count record, @Param("example") AwardV_Recharge_CountExample example);
}
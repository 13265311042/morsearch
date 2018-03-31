package com.morsearch.dao;

import com.morsearch.model.Award_Recharge;
import com.morsearch.model.Award_RechargeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Award_RechargeMapper {
    int countByExample(Award_RechargeExample example);

    int deleteByExample(Award_RechargeExample example);

    int deleteByPrimaryKey(Long ba_id);

    int insert(Award_Recharge record);

    int insertSelective(Award_Recharge record);

    List<Award_Recharge> selectByExample(Award_RechargeExample example);

    Award_Recharge selectByPrimaryKey(Long ba_id);

    int updateByExampleSelective(@Param("record") Award_Recharge record, @Param("example") Award_RechargeExample example);

    int updateByExample(@Param("record") Award_Recharge record, @Param("example") Award_RechargeExample example);

    int updateByPrimaryKeySelective(Award_Recharge record);

    int updateByPrimaryKey(Award_Recharge record);
}
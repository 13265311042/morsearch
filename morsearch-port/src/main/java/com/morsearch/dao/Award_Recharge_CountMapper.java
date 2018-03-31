package com.morsearch.dao;

import com.morsearch.model.Award_Recharge_Count;
import com.morsearch.model.Award_Recharge_CountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Award_Recharge_CountMapper {
    int countByExample(Award_Recharge_CountExample example);

    int deleteByExample(Award_Recharge_CountExample example);

    int deleteByPrimaryKey(Long sc_id);

    int insert(Award_Recharge_Count record);

    int insertSelective(Award_Recharge_Count record);

    List<Award_Recharge_Count> selectByExample(Award_Recharge_CountExample example);

    Award_Recharge_Count selectByPrimaryKey(Long sc_id);

    int updateByExampleSelective(@Param("record") Award_Recharge_Count record, @Param("example") Award_Recharge_CountExample example);

    int updateByExample(@Param("record") Award_Recharge_Count record, @Param("example") Award_Recharge_CountExample example);

    int updateByPrimaryKeySelective(Award_Recharge_Count record);

    int updateByPrimaryKey(Award_Recharge_Count record);
}
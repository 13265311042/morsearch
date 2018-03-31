package com.morsearch.dao;

import com.morsearch.model.Award_Evaluate_Count;
import com.morsearch.model.Award_Evaluate_CountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Award_Evaluate_CountMapper {
    int countByExample(Award_Evaluate_CountExample example);

    int deleteByExample(Award_Evaluate_CountExample example);

    int deleteByPrimaryKey(Long sc_id);

    int insert(Award_Evaluate_Count record);

    int insertSelective(Award_Evaluate_Count record);

    List<Award_Evaluate_Count> selectByExample(Award_Evaluate_CountExample example);

    Award_Evaluate_Count selectByPrimaryKey(Long sc_id);

    int updateByExampleSelective(@Param("record") Award_Evaluate_Count record, @Param("example") Award_Evaluate_CountExample example);

    int updateByExample(@Param("record") Award_Evaluate_Count record, @Param("example") Award_Evaluate_CountExample example);

    int updateByPrimaryKeySelective(Award_Evaluate_Count record);

    int updateByPrimaryKey(Award_Evaluate_Count record);
}
package com.morsearch.dao;

import com.morsearch.model.Award_Evaluate;
import com.morsearch.model.Award_EvaluateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Award_EvaluateMapper {
    int countByExample(Award_EvaluateExample example);

    int deleteByExample(Award_EvaluateExample example);

    int deleteByPrimaryKey(Long ba_id);

    int insert(Award_Evaluate record);

    int insertSelective(Award_Evaluate record);

    List<Award_Evaluate> selectByExample(Award_EvaluateExample example);

    Award_Evaluate selectByPrimaryKey(Long ba_id);

    int updateByExampleSelective(@Param("record") Award_Evaluate record, @Param("example") Award_EvaluateExample example);

    int updateByExample(@Param("record") Award_Evaluate record, @Param("example") Award_EvaluateExample example);

    int updateByPrimaryKeySelective(Award_Evaluate record);

    int updateByPrimaryKey(Award_Evaluate record);
}
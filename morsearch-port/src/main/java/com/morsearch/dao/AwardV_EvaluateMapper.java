package com.morsearch.dao;

import com.morsearch.model.AwardV_Evaluate;
import com.morsearch.model.AwardV_EvaluateExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface AwardV_EvaluateMapper {
    int countByExample(AwardV_EvaluateExample example);

    int deleteByExample(AwardV_EvaluateExample example);

    int insert(AwardV_Evaluate record);

    int insertSelective(AwardV_Evaluate record);

    List<AwardV_Evaluate> selectByExample(AwardV_EvaluateExample example);

    int updateByExampleSelective(@Param("record") AwardV_Evaluate record, @Param("example") AwardV_EvaluateExample example);

    int updateByExample(@Param("record") AwardV_Evaluate record, @Param("example") AwardV_EvaluateExample example);

    //自定义
    List<AwardV_Evaluate> getAwardV_EvaluateList(Map<String, Object> map);

    Integer getCountAwardV_Evaluate(Map<String, Object> map);
}
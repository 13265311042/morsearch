package com.morsearch.dao;

import com.morsearch.model.AwardV_Evaluate_Count;
import com.morsearch.model.AwardV_Evaluate_CountExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface AwardV_Evaluate_CountMapper {
    int countByExample(AwardV_Evaluate_CountExample example);

    int deleteByExample(AwardV_Evaluate_CountExample example);

    int insert(AwardV_Evaluate_Count record);

    int insertSelective(AwardV_Evaluate_Count record);

    List<AwardV_Evaluate_Count> selectByExample(AwardV_Evaluate_CountExample example);

    int updateByExampleSelective(@Param("record") AwardV_Evaluate_Count record, @Param("example") AwardV_Evaluate_CountExample example);

    int updateByExample(@Param("record") AwardV_Evaluate_Count record, @Param("example") AwardV_Evaluate_CountExample example);

    List<AwardV_Evaluate_Count> getAwardV_Evaluate_CountList(Map<String, Object> map);//查询特点活动的评价统计列表

    Integer getCountAwardV_Evaluate_Count(Map<String, Object> map);
}
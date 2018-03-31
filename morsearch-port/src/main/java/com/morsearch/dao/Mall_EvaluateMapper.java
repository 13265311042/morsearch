package com.morsearch.dao;

import com.morsearch.model.Mall_Evaluate;
import com.morsearch.model.Mall_EvaluateExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface Mall_EvaluateMapper {
    int countByExample(Mall_EvaluateExample example);

    int deleteByExample(Mall_EvaluateExample example);

    int deleteByPrimaryKey(Long se_id);

    int insert(Mall_Evaluate record);

    int insertSelective(Mall_Evaluate record);

    List<Mall_Evaluate> selectByExample(Mall_EvaluateExample example);

    Mall_Evaluate selectByPrimaryKey(Long se_id);

    int updateByExampleSelective(@Param("record") Mall_Evaluate record, @Param("example") Mall_EvaluateExample example);

    int updateByExample(@Param("record") Mall_Evaluate record, @Param("example") Mall_EvaluateExample example);

    int updateByPrimaryKeySelective(Mall_Evaluate record);

    int updateByPrimaryKey(Mall_Evaluate record);
    //自定义

    List<Mall_Evaluate> getMall_EvaluateList(Map<String, Object> map);

    Integer getCountMall_Evaluate(Map<String, Object> map);
}
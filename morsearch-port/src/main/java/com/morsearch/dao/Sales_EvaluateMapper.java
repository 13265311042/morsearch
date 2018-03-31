package com.morsearch.dao;

import com.morsearch.model.Sales_Evaluate;
import com.morsearch.model.Sales_EvaluateExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface Sales_EvaluateMapper {
    int countByExample(Sales_EvaluateExample example);

    int deleteByExample(Sales_EvaluateExample example);

    int deleteByPrimaryKey(Long se_id);

    int insert(Sales_Evaluate record);

    int insertSelective(Sales_Evaluate record);

    List<Sales_Evaluate> selectByExample(Sales_EvaluateExample example);

    Sales_Evaluate selectByPrimaryKey(Long se_id);

    int updateByExampleSelective(@Param("record") Sales_Evaluate record, @Param("example") Sales_EvaluateExample example);

    int updateByExample(@Param("record") Sales_Evaluate record, @Param("example") Sales_EvaluateExample example);

    int updateByPrimaryKeySelective(Sales_Evaluate record);

    int updateByPrimaryKey(Sales_Evaluate record);

    List<Sales_Evaluate> getsales_evaluatelist(Map<String, Object> map);////评价人列表

    int getCountsales_evaluate(Map<String, Object> map);//评价人总数

    List<Sales_Evaluate> getlist(Long id);
}
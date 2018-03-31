package com.morsearch.dao;

import com.morsearch.model.Desig_Evaluate;
import com.morsearch.model.Desig_EvaluateExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface Desig_EvaluateMapper {
    int countByExample(Desig_EvaluateExample example);

    int deleteByExample(Desig_EvaluateExample example);

    int deleteByPrimaryKey(Long de_id);

    int insert(Desig_Evaluate record);

    int insertSelective(Desig_Evaluate record);

    List<Desig_Evaluate> selectByExample(Desig_EvaluateExample example);

    Desig_Evaluate selectByPrimaryKey(Long de_id);

    int updateByExampleSelective(@Param("record") Desig_Evaluate record, @Param("example") Desig_EvaluateExample example);

    int updateByExample(@Param("record") Desig_Evaluate record, @Param("example") Desig_EvaluateExample example);

    int updateByPrimaryKeySelective(Desig_Evaluate record);

    int updateByPrimaryKey(Desig_Evaluate record);


    List<Desig_Evaluate> getDesigList(Map<String, Object> map);

    int getDesigListCount(Map<String, Object> map);/*列表总数*/

    int addDesig_Evaluate(Desig_Evaluate de);

    List<Desig_Evaluate> getDesig_EvaluateList(Map<String, Object> map);//设计师评价列表

    int getCountDesig_Evaluate(Map<String, Object> map);//列表总数

    Desig_Evaluate getDesignEvaluateNo(String no);

    List<Desig_Evaluate> getDesignEvaluateContentgrade(Long createid);

}
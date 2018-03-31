package com.morsearch.dao;

import com.morsearch.model.MallV_Evaluate;
import com.morsearch.model.MallV_EvaluateExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface MallV_EvaluateMapper {
    int countByExample(MallV_EvaluateExample example);

    int deleteByExample(MallV_EvaluateExample example);

    int insert(MallV_Evaluate record);

    int insertSelective(MallV_Evaluate record);

    List<MallV_Evaluate> selectByExample(MallV_EvaluateExample example);

    int updateByExampleSelective(@Param("record") MallV_Evaluate record, @Param("example") MallV_EvaluateExample example);

    int updateByExample(@Param("record") MallV_Evaluate record, @Param("example") MallV_EvaluateExample example);

    //自定义
    List<MallV_Evaluate> getMallV_EvaluateList(Map<String, Object> map);//后台订单评价列表

    Integer getCountMallV_Evaluate(Map<String, Object> map);//后台订单评价列表的视图
}
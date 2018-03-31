package com.morsearch.dao;

import com.morsearch.model.DesigV_Home_Majob;
import com.morsearch.model.DesigV_Home_MajobExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface DesigV_Home_MajobMapper {
    int countByExample(DesigV_Home_MajobExample example);

    int deleteByExample(DesigV_Home_MajobExample example);

    int insert(DesigV_Home_Majob record);

    int insertSelective(DesigV_Home_Majob record);

    List<DesigV_Home_Majob> selectByExample(DesigV_Home_MajobExample example);

    int updateByExampleSelective(@Param("record") DesigV_Home_Majob record, @Param("example") DesigV_Home_MajobExample example);

    int updateByExample(@Param("record") DesigV_Home_Majob record, @Param("example") DesigV_Home_MajobExample example);

    //自定义
    List<DesigV_Home_Majob> getDesigV_Home_MajobList(Map<String, Object> map);//设计师首页专业列表

    Integer getDesigV_Home_MajobListCount(Map<String, Object> map);//设计师首页专业数量
}
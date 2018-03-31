package com.morsearch.dao;

import com.morsearch.model.DesigV_Collect_Pm;
import com.morsearch.model.DesigV_Collect_PmExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface DesigV_Collect_PmMapper {
    int countByExample(DesigV_Collect_PmExample example);

    int deleteByExample(DesigV_Collect_PmExample example);

    int insert(DesigV_Collect_Pm record);

    int insertSelective(DesigV_Collect_Pm record);

    List<DesigV_Collect_Pm> selectByExample(DesigV_Collect_PmExample example);

    int updateByExampleSelective(@Param("record") DesigV_Collect_Pm record, @Param("example") DesigV_Collect_PmExample example);

    int updateByExample(@Param("record") DesigV_Collect_Pm record, @Param("example") DesigV_Collect_PmExample example);

    List<DesigV_Collect_Pm> getDesigV_Collect_PmList(Map<String, Object> map);//列表

    int getCountDesigV_Collect_Pm(Map<String, Object> map);//总数
}
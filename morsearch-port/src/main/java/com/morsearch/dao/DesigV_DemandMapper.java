package com.morsearch.dao;

import com.morsearch.model.DesigV_Demand;
import com.morsearch.model.DesigV_DemandExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface DesigV_DemandMapper {
    int countByExample(DesigV_DemandExample example);

    int deleteByExample(DesigV_DemandExample example);

    int insert(DesigV_Demand record);

    int insertSelective(DesigV_Demand record);

    List<DesigV_Demand> selectByExample(DesigV_DemandExample example);

    int updateByExampleSelective(@Param("record") DesigV_Demand record, @Param("example") DesigV_DemandExample example);

    int updateByExample(@Param("record") DesigV_Demand record, @Param("example") DesigV_DemandExample example);

    List<DesigV_Demand> getDesigV_DemandList(Map<String, Object> map);

    Integer getCountDesigV_Demand(Map<String, Object> map);

    DesigV_Demand selectByPrimaryKey(Long dd_id);

}
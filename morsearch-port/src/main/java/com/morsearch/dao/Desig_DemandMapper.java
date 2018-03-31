package com.morsearch.dao;

import com.morsearch.model.DesigV_Demand;
import com.morsearch.model.Desig_Demand;
import com.morsearch.model.Desig_DemandExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface Desig_DemandMapper {
    int countByExample(Desig_DemandExample example);

    int deleteByExample(Desig_DemandExample example);

    int deleteByPrimaryKey(Long dd_id);

    int insert(Desig_Demand record);

    int insertSelective(Desig_Demand record);

    List<Desig_Demand> selectByExample(Desig_DemandExample example);

    Desig_Demand selectByPrimaryKey(Long dd_id);

    int updateByExampleSelective(@Param("record") Desig_Demand record, @Param("example") Desig_DemandExample example);

    int updateByExample(@Param("record") Desig_Demand record, @Param("example") Desig_DemandExample example);

    int updateByPrimaryKeySelective(Desig_Demand record);

    int updateByPrimaryKey(Desig_Demand record);

    Desig_Demand selectByprimaryId(Long Ur_id);//通过UserID查询需求

    List<Desig_Demand> getDesig_DemandList(Map<String, Object> map);//列表

    int getCountDesig_Demand(Map<String, Object> map);

    Desig_Demand getDesig_DemandDetail(@Param("dd_id") Long dd_id, @Param("type") int type); /*获取文档明细 type:1。显示收藏和浏览*/

    List<Desig_Demand> getDesig_DemandBackList(Map<String, Object> map);//后台查询

    Integer getCountDesig_DemandBack(Map<String, Object> map);//后台查询

}
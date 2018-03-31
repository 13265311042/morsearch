package com.morsearch.dao;

import com.morsearch.model.Desig_Demand;
import com.morsearch.model.Desig_Project;
import com.morsearch.model.Desig_ProjectExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface Desig_ProjectMapper {
    int countByExample(Desig_ProjectExample example);

    int deleteByExample(Desig_ProjectExample example);

    int insert(Desig_Project record);

    int insertSelective(Desig_Project record);

    List<Desig_Project> selectByExample(Desig_ProjectExample example);

    int updateByExampleSelective(@Param("record") Desig_Project record, @Param("example") Desig_ProjectExample example);

    int updateByExample(@Param("record") Desig_Project record, @Param("example") Desig_ProjectExample example);


    /*自定义*/
    Desig_Project selectByDesig_Project(Long id);

    int updateByPrimaryKeySelective(Desig_Project record);

    int deleteByPrimaryKey(Long sp_id);

    List<Desig_Project> getDesig_ProjectList(Map<String, Object> map);//列表

    int getCountDesig_Project(Map<String, Object> map);//条数

    List<Desig_Project> getDesig_ProjectBackList(Map<String, Object> map);//后台的查询,有一点点区别

    Integer getCountDesig_ProjectBack(Map<String, Object> map);//后台的查询方法,有一点点区别

    Desig_Project getDesig_ProjectDetail(@Param("sp_id") Long sp_id, @Param("type") int type);
}
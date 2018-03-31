package com.morsearch.dao;

import com.morsearch.model.DesigV_Project;
import com.morsearch.model.DesigV_ProjectExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface DesigV_ProjectMapper {
    int countByExample(DesigV_ProjectExample example);

    int deleteByExample(DesigV_ProjectExample example);

    int insert(DesigV_Project record);

    int insertSelective(DesigV_Project record);

    List<DesigV_Project> selectByExample(DesigV_ProjectExample example);

    int updateByExampleSelective(@Param("record") DesigV_Project record, @Param("example") DesigV_ProjectExample example);

    int updateByExample(@Param("record") DesigV_Project record, @Param("example") DesigV_ProjectExample example);



    List<DesigV_Project> getDesigV_ProjectBackList(Map<String, Object> map);//后台的查询,有一点点区别

    Integer getCountDesigV_ProjectBack(Map<String, Object> map);//后台的查询方法,有一点点区别

    DesigV_Project selectDesigV_Project(Long id);

    int updateByPrimaryKeySelective(DesigV_Project record);
}
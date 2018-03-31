package com.morsearch.dao;

import com.morsearch.model.Sys_User_Visiting;
import com.morsearch.model.Sys_User_VisitingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Sys_User_VisitingMapper {
    int countByExample(Sys_User_VisitingExample example);

    int deleteByExample(Sys_User_VisitingExample example);

    int deleteByPrimaryKey(Long uv_id);

    int insert(Sys_User_Visiting record);

    int insertSelective(Sys_User_Visiting record);

    List<Sys_User_Visiting> selectByExampleWithBLOBs(Sys_User_VisitingExample example);

    List<Sys_User_Visiting> selectByExample(Sys_User_VisitingExample example);

    Sys_User_Visiting selectByPrimaryKey(Long uv_id);

    int updateByExampleSelective(@Param("record") Sys_User_Visiting record, @Param("example") Sys_User_VisitingExample example);

    int updateByExampleWithBLOBs(@Param("record") Sys_User_Visiting record, @Param("example") Sys_User_VisitingExample example);

    int updateByExample(@Param("record") Sys_User_Visiting record, @Param("example") Sys_User_VisitingExample example);

    int updateByPrimaryKeySelective(Sys_User_Visiting record);

    int updateByPrimaryKeyWithBLOBs(Sys_User_Visiting record);

    int updateByPrimaryKey(Sys_User_Visiting record);


}
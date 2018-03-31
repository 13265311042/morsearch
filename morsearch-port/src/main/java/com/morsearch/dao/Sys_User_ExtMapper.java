package com.morsearch.dao;

import com.morsearch.model.Sys_User_Ext;
import com.morsearch.model.Sys_User_ExtExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Sys_User_ExtMapper {
    int countByExample(Sys_User_ExtExample example);

    int deleteByExample(Sys_User_ExtExample example);

    int deleteByPrimaryKey(Long ue_userid);

    int insert(Sys_User_Ext record);

    int insertSelective(Sys_User_Ext record);

    List<Sys_User_Ext> selectByExample(Sys_User_ExtExample example);

    Sys_User_Ext selectByPrimaryKey(Long ue_userid);

    int updateByExampleSelective(@Param("record") Sys_User_Ext record, @Param("example") Sys_User_ExtExample example);

    int updateByExample(@Param("record") Sys_User_Ext record, @Param("example") Sys_User_ExtExample example);

    int updateByPrimaryKeySelective(Sys_User_Ext record);

    int updateByPrimaryKey(Sys_User_Ext record);

    List<Sys_User_Ext> getUserID(String name);
}
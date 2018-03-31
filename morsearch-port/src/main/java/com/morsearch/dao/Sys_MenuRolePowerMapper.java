package com.morsearch.dao;

import com.morsearch.model.Sys_MenuRolePower;
import com.morsearch.model.Sys_MenuRolePowerExample;
import com.morsearch.model.Sys_MenuRolePowerKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Sys_MenuRolePowerMapper {
    int countByExample(Sys_MenuRolePowerExample example);

    int deleteByExample(Sys_MenuRolePowerExample example);

    int deleteByPrimaryKey(Sys_MenuRolePowerKey key);

    int insert(Sys_MenuRolePower record);

    int insertSelective(Sys_MenuRolePower record);

    List<Sys_MenuRolePower> selectByExample(Sys_MenuRolePowerExample example);

    Sys_MenuRolePower selectByPrimaryKey(Sys_MenuRolePowerKey key);

    int updateByExampleSelective(@Param("record") Sys_MenuRolePower record, @Param("example") Sys_MenuRolePowerExample example);

    int updateByExample(@Param("record") Sys_MenuRolePower record, @Param("example") Sys_MenuRolePowerExample example);

    int updateByPrimaryKeySelective(Sys_MenuRolePower record);

    int updateByPrimaryKey(Sys_MenuRolePower record);

    /*自定义*/
    List<Sys_MenuRolePower> getRolePowerList(@Param("rp_roleid") Integer rp_roleid, @Param("pageindex") int pageindex, @Param("pagesize") int pagesize);/*角色权限列表*/
    int getRolePowerCount(@Param("roleid") Integer roleid);/*角色权限数量*/

}
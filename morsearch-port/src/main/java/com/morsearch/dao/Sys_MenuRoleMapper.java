package com.morsearch.dao;

import com.morsearch.model.Sys_MenuRole;
import com.morsearch.model.Sys_MenuRoleExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface Sys_MenuRoleMapper {
    int countByExample(Sys_MenuRoleExample example);

    int deleteByExample(Sys_MenuRoleExample example);

    int deleteByPrimaryKey(Integer rl_id);

    int insert(Sys_MenuRole record);

    int insertSelective(Sys_MenuRole record);

    List<Sys_MenuRole> selectByExample(Sys_MenuRoleExample example);

    Sys_MenuRole selectByPrimaryKey(Integer rl_id);

    int updateByExampleSelective(@Param("record") Sys_MenuRole record, @Param("example") Sys_MenuRoleExample example);

    int updateByExample(@Param("record") Sys_MenuRole record, @Param("example") Sys_MenuRoleExample example);

    int updateByPrimaryKeySelective(Sys_MenuRole record);

    int updateByPrimaryKey(Sys_MenuRole record);

    /*自定义*/
    List<Sys_MenuRole> getRoleMenuList(Map<String, Object> map);/*角色权限列表*/
    int getRoleMenuCount(Map<String, Object> map);/*角色权限数量*/

}
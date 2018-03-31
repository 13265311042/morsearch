package com.morsearch.service;

import com.morsearch.model.Sys_MenuRole;
import com.morsearch.model.Sys_MenuRolePower;
import com.morsearch.vo.JsonTreeData;
import java.util.List;
import java.util.Map;

/*角色管理*/

public interface RoleMenuService {
	List<Sys_MenuRole> getRoleMenuList(Map<String, Object> map); /*得到角色列表*/
	int getRoleMenuCount(Map<String, Object> map); /*角色总数量*/


	List<Sys_MenuRolePower> getRolePowerList(Integer sid, int pageindex, int pagesize); /*得到角色权限列表*/
	int getRolePowerListCount(Integer sid); /*角色权限数量*/

	int addRole(Sys_MenuRole cls);/*新增角色*/
	int delRole(Integer sid);/*删除角色*/
	int updateRole(Sys_MenuRole cls);/*修改角色*/
	Sys_MenuRole getRoleDetail(Integer sid);/*读取角色明细*/

	int updateRolePower(List<Sys_MenuRole> cls);/*修改角色权限*/

	List<JsonTreeData> getMenuTree();/*获取菜单权限列表*/

	}

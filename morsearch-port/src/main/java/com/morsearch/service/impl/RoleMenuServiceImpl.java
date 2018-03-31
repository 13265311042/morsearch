package com.morsearch.service.impl;

import com.morsearch.dao.Sys_MenuPowerMapper;
import com.morsearch.dao.Sys_MenuRoleMapper;
import com.morsearch.dao.Sys_MenuRolePowerMapper;
import com.morsearch.model.Sys_MenuPower;
import com.morsearch.model.Sys_MenuRole;
import com.morsearch.model.Sys_MenuRolePower;
import com.morsearch.service.RoleMenuService;
import com.morsearch.vo.JsonTreeData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@Service("roleMenuService")

public class RoleMenuServiceImpl implements RoleMenuService {
	@Autowired
	private Sys_MenuRoleMapper sys_RoleMapper;
	@Autowired
	private Sys_MenuRolePowerMapper sys_RolePowerMapper;
	@Autowired
	private Sys_MenuPowerMapper sys_menupowermapper;

/*
	@Override
	public Sys_Manager loginManger(Sys_Manager manager) {
		return sys_ManagerMapper.loginManger(manager);
	}
*/


	@Override
	public List<Sys_MenuRole> getRoleMenuList(Map<String, Object> map) {
		return null;
	}

	@Override
	public int getRoleMenuCount(Map<String, Object> map) {
		return 0;
	}


	@Override
	public List<Sys_MenuRolePower> getRolePowerList(Integer sid, int pageindex, int pagesize) {
		return sys_RolePowerMapper.getRolePowerList(sid,pageindex,pagesize);
	}


	@Override
	public int getRolePowerListCount(Integer sid) {
		return  0;//sys_RolePowerMapper.getRolePowerListCount(sid);
	}

	@Override
	public int addRole(Sys_MenuRole cls) {
		return 0;
	}

	@Override
	public int delRole(Integer sid) {
		return 0;
	}

	@Override
	public int updateRole(Sys_MenuRole cls) {
		return 0;
	}

	@Override
	public Sys_MenuRole getRoleDetail(Integer sid) {
		return null;
	}

	@Override
	public int updateRolePower(List<Sys_MenuRole> cls) {
		return 0;
	}

	@Override
	public List<JsonTreeData> getMenuTree() {
		List<Sys_MenuPower> sml=sys_menupowermapper.selectByExample(null);
		List<JsonTreeData> jtdl=null;
		if (sml!=null){
			jtdl=new ArrayList<JsonTreeData>();
		for (int ii=0;ii<sml.size();ii++){
			JsonTreeData jt=new JsonTreeData();
			jt.setId(sml.get(ii).getSm_id()+"");
			jt.setPid(sml.get(ii).getSm_parentid()+"");
			jt.setText(sml.get(ii).getSm_name());
			jt.setState("open");
			jt.setChildren(null);
			jtdl.add(jt);
		}
		};

		return jtdl;
	}


}

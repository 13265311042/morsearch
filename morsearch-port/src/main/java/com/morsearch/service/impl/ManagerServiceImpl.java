package com.morsearch.service.impl;

import com.morsearch.dao.Sys_ManagerMapper;
import com.morsearch.model.Sys_Manager;
import com.morsearch.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service("managerService")

public class ManagerServiceImpl implements ManagerService {
	@Autowired
	private Sys_ManagerMapper sys_ManagerMapper;

	@Override
	public Sys_Manager loginManger(String userno,String password) {
		return sys_ManagerMapper.loginManger(userno,password);
	}

	@Override
	public List<Sys_Manager> getManageList(Map<String, Object> map) {
		return sys_ManagerMapper.getmanageList(map);

	}

	@Override
	public int addManager(Sys_Manager manager) {
		return sys_ManagerMapper.insertSelective(manager);
	}

	@Override
	public int delManager(Integer smid) {
		return sys_ManagerMapper.deleteByPrimaryKey(smid);
	}

	@Override
	public int getManageListCount(Map<String, Object> map) {
		return sys_ManagerMapper.getmanageListCount(map);
	}

	@Override
	public int updateManager(Sys_Manager manager) {
		return sys_ManagerMapper.updateByPrimaryKeySelective(manager);
	}

	@Override
	public Sys_Manager getManagerDetail(Integer smid) {
		return sys_ManagerMapper.selectByPrimaryKey(smid);
	}
}

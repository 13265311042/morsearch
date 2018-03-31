package com.morsearch.service;

import com.morsearch.model.Sys_Manager;

import java.util.List;
import java.util.Map;


public interface ManagerService {
	Sys_Manager loginManger(String userno, String password); /*后台登录*/
	List<Sys_Manager> getManageList(Map<String, Object> map); /*得到用户列表 int pagestart,int pagesize*/
	int getManageListCount(Map<String, Object> map);
	int addManager(Sys_Manager manager);/*新增*/
	int delManager(Integer smid);/*删除ID*/
	int updateManager(Sys_Manager manager);/*修改*/
	Sys_Manager getManagerDetail(Integer smid);/*读取明细*/


}

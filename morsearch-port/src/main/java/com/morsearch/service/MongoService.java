package com.morsearch.service;

import com.morsearch.mongo.AdminLoginLog;
import com.morsearch.mongo.AdminLoginLogQuery;
import com.morsearch.mongo.OpertionLog;
import com.morsearch.mongo.OpertionLogQuery;
import com.morsearch.vo.AppPage;

import java.util.List;

/**
 * 管理员操作日志service
 * @author shimingbo
 * @since 2017/6/8
 */


public interface MongoService {

	/**
	 * 添加登陆日志
	 * @param log
	 */
	public void addLoginLog(AdminLoginLog log);
	
	/**
	 * 分页查询登陆日志
	 * @param query
	 * @return
	 */
	public List<AdminLoginLog> queryLoginLog(AppPage page, AdminLoginLogQuery query);
	
	/**
	 * 添加操作日志
	 * @param log
	 */
	public void addOperationLog(OpertionLog log);
	
	/**
	 * 分页查询操作日志
	 * @param query
	 * @return
	 */
	public List<OpertionLog> queryOpertionLog(AppPage page, OpertionLogQuery query);

	public void addOperationLog(String userId, String userName, String menuName, String opertionType, String opertionContent);
}

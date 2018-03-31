package com.morsearch.service.impl;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

import com.morsearch.common.util.DateTimeUtil;
import com.morsearch.mongo.*;
import com.morsearch.service.MongoService;
import com.morsearch.vo.AppPage;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.query.Query;
import org.springframework.stereotype.Service;


@Service("mongoService")

public class MongoServiceImpl implements MongoService {
	

	@Override
	public void addLoginLog(AdminLoginLog log) {
		Datastore datastore = MonogoDBHelper.getDatastore();
		datastore.save(log);
	}

	@Override
	public List<AdminLoginLog> queryLoginLog(AppPage page, AdminLoginLogQuery param) {
		Datastore datastore = MonogoDBHelper.getDatastore();
		Query<AdminLoginLog> query = datastore.createQuery(AdminLoginLog.class);
		if(param.getLoginName()!=null&&!"".equals(param.getLoginName())){
			query.field("username").equal(param.getLoginName());
		}
		if(param.getStartTime()!=null&&!"".equals(param.getStartTime())){
			Date st = DateTimeUtil.getstrToDate(param.getStartTime());
			query.filter("logintime >=", st);
		}
		if(param.getEndTime()!=null&&!"".equals(param.getEndTime())){
			Date et = DateTimeUtil.getstrToDate(param.getEndTime());
			query.filter("logintime <=", et);
		}
		page.setRowcount((int)query.count());
		query.order("-logintime").offset(page.getPagestart()).limit(page.getPagesize());
		return query.asList();
	}

	@Override
	public void addOperationLog(OpertionLog log) {
		Datastore datastore = MonogoDBHelper.getDatastore();
		datastore.save(log);

	}

	@Override
	public List<OpertionLog> queryOpertionLog(AppPage page, OpertionLogQuery param) {
		Datastore datastore = MonogoDBHelper.getDatastore();
		Query<OpertionLog> query = datastore.createQuery(OpertionLog.class);
		if(param.getLoginName()!=null&&!"".equals(param.getLoginName())){
			query.field("username").equal(param.getLoginName());
		}
		if(param.getMenuName()!=null&&!"".equals(param.getMenuName())){
			//query.field("menuName").equal(param.getMenuName());
			Pattern pattern2 = Pattern.compile("^.*" + param.getMenuName()+ ".*$", Pattern.CASE_INSENSITIVE);
			query.filter("menuName", pattern2);
		}

		if(param.getOpertionContent()!=null&&!"".equals(param.getOpertionContent())){
			//query.field("menuName").equal(param.getMenuName());
			Pattern pattern3 = Pattern.compile("^.*" + param.getOpertionContent()+ ".*$", Pattern.CASE_INSENSITIVE);
			query.filter("opertionContent", pattern3);
		}
		if(param.getStartTime()!=null&&!"".equals(param.getStartTime())){
			Date st = DateTimeUtil.getstrToDate(param.getStartTime());
			query.filter("logTime >=", st);
		}
		if(param.getEndTime()!=null&&!"".equals(param.getEndTime())){
			Date et = DateTimeUtil.getstrToDate(param.getEndTime());
			query.filter("logTime <=", et);
		}
		page.setRowcount((int)query.count());
		query.order("-logTime").offset(page.getPagestart()).limit(page.getPagesize());
		return query.asList();
	}

	@Override
	public void addOperationLog(String userId, String userName, String menuName, String opertionType,
			String opertionContent) {
		OpertionLog log = new OpertionLog();
		log.setUserid(userId);
		log.setUsername(userName);
		log.setMenuName(menuName);
		log.setOpertionType(opertionType);
		log.setOpertionContent(opertionContent);
		log.setLogTime(new Date());
		Datastore datastore = MonogoDBHelper.getDatastore();
		datastore.save(log);
	}

	
}

package com.morsearch.controller.back;


import com.morsearch.base.BaseController;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.export.ExcelExportUtils;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.ControllerUtils;
import com.morsearch.common.util.SequenceCreator;
import com.morsearch.model.Acc_Wallet;
import com.morsearch.model.SysV_UserFull;
import com.morsearch.model.Sys_Manager;
import com.morsearch.model.Sys_User;
import com.morsearch.service.ManagerService;
import com.morsearch.service.WalletService;
import com.morsearch.vo.AppDatagrid;
import com.morsearch.vo.AppPage;
import com.morsearch.vo.AppResult;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.*;


/**
 * 后台用户管理
 *

 */
@Controller("BackUserController")
@RequestMapping("/back/")
public class BackUserController extends BaseController {
	@Resource
	private ManagerService managerService;

	private String sm_id;
	private String sm_no;
	private String sm_password;
	private String sm_name;
	private String sm_roleid;

	@Resource
	private WalletService walletService;
	/*用户显示列表*/
	@RequestMapping(value = "managerlist", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
	public String managerlist(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult=new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);
		appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
		String rs = "";
		Boolean flag_pass=true;/*检查内容是否能过*/

		/*处理逻辑 begin*/
		List<Sys_Manager> list=new ArrayList<Sys_Manager>();

		if (flag_pass==true) {
		try {
			/*控制页码 begin*/
			AppPage page = new AppPage();
			page.setPageindex(request.getParameter("pageindex"));/*当前页*/
			page.setPagesize(request.getParameter("pagesize"));/*分页*/
			/*控制页码 end*/
			/*查询条件 begin*/
			Map<String,Object> map=new HashMap<String,Object>();
			map.put("pagestart",page.getPagestart());
			map.put("pagesize",page.getPagesize());
			map.put("sm_no",request.getParameter("sm_no"));
			map.put("sm_name",request.getParameter("sm_name"));
			map.put("sm_phone",request.getParameter("sm_phone"));
			map.put("sm_email",request.getParameter("sm_email"));
			map.put("sm_status",CommonUtil.convert_Byte(request.getParameter("sm_status")));

			map.put("sm_login_date1",CommonUtil.queryTime1(request.getParameter("sm_login_date1"),request.getParameter("sm_login_date2")));
			map.put("sm_login_date2",CommonUtil.queryTime2(request.getParameter("sm_login_date1"),request.getParameter("sm_login_date2")));
			/*查询条件 end*/
			list=managerService.getManageList(map);
			page.setRowcount(managerService.getManageListCount(map));/*记录数*/
			appresult.setPage(page);

		} catch (Exception e) {
			logger.error(e.getMessage());
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
		}
		};
		/*处理逻辑 end*/
		/*返回数据 begin*/
		/*转换easyui读取格式 begin*/
		AppDatagrid dto=new AppDatagrid();
		dto.setRows(list);
		dto.setTotal(appresult.getPage().getRowcount());
/*转换easyui读取格式 end*/

		appresult.setData(dto); /*us*/
		rs=CommonUtil.datatype_convert(request,gson.toJson(appresult));/*处理数据格式*/
		out.print(rs);
		out.close();
		/*返回数据 end*/
		return null;

	}

	/*
    * 读取后台用户明细*/
	@RequestMapping(value = "managerdetail", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
	public String managerdetail(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult=new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);
		appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
		String rs = "";
		sm_id=request.getParameter("sm_id");
		Boolean flag_pass=true;
/*检查参数 begin*/
		if ((sm_id==null || "".equals(sm_id))&&flag_pass==true) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("ID参数不能为空");
			flag_pass = false;
		};

/*检查参数 end*/
/*处理逻辑 begin*/
		Sys_Manager sm=new Sys_Manager();
		if (flag_pass==true) {
			try {
				sm=managerService.getManagerDetail(Integer.parseInt(sm_id));
				if (sm!=null){
					sm.setSm_password(null);/*置为空*/
				}else{
					appresult.setStatus(Constants.RESULT_STATUS_FAIL);
					appresult.setMessage(Constants.RESULT_MESSAGE_NULL);
				}
			} catch (Exception e) {
				logger.error(e.getMessage());
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
			}
		}
/*处理逻辑 end*/
/*返回数据 begin*/
		appresult.setData(sm);
		rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
		out.print(rs);
		out.close();
/*返回数据 end*/
		return null;
	}

	@RequestMapping(value = "managerdel", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
	public String managerdel(HttpServletRequest request, HttpServletResponse response) throws Exception {
	PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
	AppResult appresult=new AppResult();
	appresult.setStatus(Constants.RESULT_STATUS_SUCC);
	appresult.setMessage(Constants.RESULT_DEL_SUCC);
	String rs = "";
	sm_id=request.getParameter("sm_id");
		String sm_sm_id = request.getParameter("sm_sm_id");//确认是否登录
		Boolean flag_pass=true;
/*检查参数 begin*/
	if ((sm_id==null || "".equals(sm_id))&&flag_pass==true) {
		appresult.setStatus(Constants.RESULT_STATUS_FAIL);
		appresult.setMessage("ID参数不能为空");
		flag_pass = false;
	};
		if (CommonUtil.isEmpty(sm_sm_id)&&flag_pass==true) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("请登录");
			flag_pass = false;
		}


/*检查参数 end*/
/*处理逻辑 begin*/
		if (flag_pass==true) {
			try {
				int ii=managerService.delManager(Integer.parseInt(sm_id));
				if (ii==0){appresult.setMessage(Constants.RESULT_DEL_FAIL);};/*提示资料不存在*/
			} catch (Exception e) {
				logger.error(e.getMessage());
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
			}
		}
/*处理逻辑 end*/
/*返回数据 begin*/
		rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
		out.print(rs);
		out.close();
/*返回数据 end*/
		return null;
	}


	@RequestMapping(value = "manageradd", method ={RequestMethod.POST, RequestMethod.GET},produces ={ "application/json;charset=UTF-8" })
	public String manageradd(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult=new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);
		appresult.setMessage(Constants.RESULT_ADD_SUCC);
		String rs = "";
		Boolean flag_pass=true;

		sm_no=request.getParameter("sm_no");
		sm_password=request.getParameter("sm_password");
		sm_name=request.getParameter("sm_name");
/*检查参数 begin*/
		if ((sm_no==null || "".equals(sm_no))&&flag_pass==true) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("帐号不能为空");
			flag_pass = false;
		};
		if ((sm_password==null || "".equals(sm_password))&&flag_pass==true) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("密码不能为空");
			flag_pass = false;
		};
		if ((sm_name==null || "".equals(sm_name))&&flag_pass==true) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("姓名不能为空");
			flag_pass = false;
		};

/*检查参数 end*/

/*处理逻辑 begin*/
		if (flag_pass==true) {
			try {
				Sys_Manager sm=new Sys_Manager();
				sm.setSm_no(sm_no);
				sm.setSm_password(CommonUtil.pwdmd5t2(sm_password));
				sm.setSm_name(sm_name);
				sm.setSm_phone(request.getParameter("sm_phone"));
				sm.setSm_email(request.getParameter("sm_email"));
				sm.setSm_flag_admin(CommonUtil.convert_boolean(request.getParameter("sm_flag_admin")));
				sm.setSm_status(CommonUtil.convert_Byte(request.getParameter("sm_status")));
				sm.setSm_remark(request.getParameter("sm_remark"));

				int ii=managerService.addManager(sm);
				if (ii==0){appresult.setMessage(Constants.RESULT_ADD_FAIL);};/*提示资料不存在*/
			} catch (Exception e) {
				logger.error(e.getMessage());
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
			}
		}
/*处理逻辑 end*/
/*返回数据 begin*/
		rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
		out.print(rs);
		out.close();
/*返回数据 end*/
		return null;
	}




	/*
    * 后台修改保存
    * */
	@RequestMapping(value = "managerupdate", method ={RequestMethod.POST, RequestMethod.GET},produces ={ "application/json;charset=UTF-8" })
	public String managerupdate(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult=new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);
		appresult.setMessage(Constants.RESULT_EDIT_SUCC);
		String rs = "";
		Boolean flag_pass=true;

		sm_id=request.getParameter("sm_id");
		sm_no=request.getParameter("sm_no");
		sm_password=request.getParameter("password");
		sm_name=request.getParameter("sm_name");
/*检查参数 begin*/
		if ((sm_id==null || "".equals(sm_id))&&flag_pass==true) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("ID不能为空");
			flag_pass = false;
		};
		if ((sm_no==null || "".equals(sm_no))&&flag_pass==true) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("帐号不能为空");
			flag_pass = false;
		};
		if(sm_no.equals("admin")){
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("超级用户不可更改密码");
			flag_pass = false;
		}
/*
		if ((sm_password==null || "".equals(sm_password))&&flag_pass==true) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("密码不能为空");
			flag_pass = false;
		};
*/
		if ((sm_name==null || "".equals(sm_name))&&flag_pass==true) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("姓名不能为空");
			flag_pass = false;
		};

/*检查参数 end*/
/*处理逻辑 begin*/
		if (flag_pass==true) {
			try {
				Sys_Manager sm=new Sys_Manager();
				sm.setSm_id(Integer.parseInt(sm_id));
				sm.setSm_no(sm_no);
				sm.setSm_name(sm_name);
				sm.setSm_phone(request.getParameter("sm_phone"));
				sm.setSm_email(request.getParameter("sm_email"));
				sm.setSm_flag_admin(CommonUtil.convert_boolean(request.getParameter("sm_flag_admin")));
				sm.setSm_status(CommonUtil.convert_Byte(request.getParameter("sm_status")));
				sm.setSm_remark(request.getParameter("sm_remark"));
				if (sm_password!=null){sm.setSm_password(CommonUtil.pwdmd5t2(sm_password));};/*有值时修改密码*/
				int ii=managerService.updateManager(sm);
				if (ii==0){
					appresult.setStatus(Constants.RESULT_STATUS_FAIL);
					appresult.setMessage(Constants.RESULT_EDIT_FAIL);};/*提示资料不存在*/
			} catch (Exception e) {
				logger.error(e.getMessage());
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
			}
		}
/*处理逻辑 end*/
/*返回数据 begin*/
		rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
		out.print(rs);
		out.close();
/*返回数据 end*/
		return null;
	}


	/***
	 * 前台用户列表展示
	 * zuoxiaochao
	 */
	@SuppressWarnings({ "unused", "null" })
	@RequestMapping(value = "sys_userlist" ,method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
	public String sys_userlist(HttpServletRequest request, HttpServletResponse response) throws Exception{
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		//设置几个默认的状态
		AppResult appResult = new AppResult();
		appResult.setStatus(Constants.RESULT_STATUS_SUCC);
		appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
		String rs="";
		request.getParameter("ur_register_date1");
		Boolean flag_pass=true;/*检查内容是否能过*/

		String ur_stopflag = request.getParameter("ur_stopflag");//单独查询

		//List<Sys_User> us = new ArrayList<>();
		List<SysV_UserFull> us = new ArrayList<>();//这个表多两个字段

		if(flag_pass == true){
			//查询出版本列表
			try {
				AppPage page = new AppPage();
				page.setPageindex(request.getParameter("pageindex"));/*当前页*/
				page.setPagesize(request.getParameter("pagesize"));/*分页*/
				Map<String,Object> map=new HashMap<String,Object>();
                 /*查询条件 begin*/
				//      map.put("pagestart",page.getPagestart());

				map.put("pagestart",page.getPagestart());
				map.put("pagesize",page.getPagesize());

				map.put("ur_no",request.getParameter("ur_no"));
				map.put("ur_phone",request.getParameter("ur_phone"));
				map.put("ur_email",request.getParameter("ur_email"));
				map.put("ur_namefirst",request.getParameter("ur_namefirst"));//姓氏

				map.put("ur_usertype",CommonUtil.convert_Byte(request.getParameter("ur_usertype")));//这是类型,类型为3的时候,就是企业用户
				if(ur_stopflag==null||ur_stopflag==""){
					map.put("ur_stopflag",CommonUtil.read_dbbit("false"));
				}else{
					map.put("ur_stopflag",CommonUtil.read_dbbit(ur_stopflag));//这个是可以查询的
				}
				map.put("ur_msgflag2",CommonUtil.read_dbbit(request.getParameter("ur_msgflag2")));//是否完善信息
				/*注册日期的查询*/
				map.put("ur_register_date1",CommonUtil.queryTime1(request.getParameter("ur_register_date1"),request.getParameter("ur_register_date2")));
				map.put("ur_register_date2",CommonUtil.queryTime2(request.getParameter("ur_register_date1"),request.getParameter("ur_register_date2")));

				/*登陆日期的查询*/
				map.put("ur_login_date1",CommonUtil.queryTime1(request.getParameter("ur_login_date1"),request.getParameter("ur_login_date2")));
				map.put("ur_login_date2",CommonUtil.queryTime2(request.getParameter("ur_login_date1"),request.getParameter("ur_login_date2")));
				//查询条件
				//us = userService.getuserList(map);
				//page.setRowcount(userService.getCountUser(map));
				us = userService.getuserfullList(map);//附表多两个字段
				page.setRowcount(userService.getCountUserfull(map));//附表多两个字段
				appResult.setPage(page);

				if(!CommonUtil.isNullOrEmpty(us)&&us.size()>0){
					appResult.setStatus(Constants.RESULT_STATUS_SUCC);
					appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
				}
			} catch (Exception e) {
				//打印错误的日志
				logger.error(e.getMessage());
				appResult.setStatus(Constants.RESULT_STATUS_FAIL);
				appResult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
			}
		}
        /*end处理数据*/

        /*begin返回数据*/
		/*转换easyui读取格式 begin*/
		AppDatagrid dto=new AppDatagrid();
		dto.setRows(us);
		dto.setTotal(appResult.getPage().getRowcount());
/*转换easyui读取格式 end*/

		appResult.setData(dto); /*us*/
		//转化为json格式()
		rs = CommonUtil.datatype_convert(request, gson.toJson(appResult));
        /*end返回数据*/

		//处理数据格式
		out.print(rs);
		out.close();
		return null;
	}

	/**
	 * 前台用户详细信息(根据ur_id查询)
	 * */

	@RequestMapping(value = "sys_userdetail", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
	public String sys_userdetail(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult=new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);
		appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
		String rs = "";
		String ur_id=request.getParameter("ur_id");
		Boolean flag_pass=true;
/*检查参数 begin*/
		if (CommonUtil.isEmpty(ur_id)&&flag_pass==true) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("ID参数不能为空");
			flag_pass = false;
		};

/*检查参数 end*/
/*处理逻辑 begin*/
		Sys_User su=new Sys_User();
		if (flag_pass==true) {
			try {
				su= userService.getSysUserDetail(Long.parseLong(ur_id));
				if (su!=null){

				}else{
					appresult.setStatus(Constants.RESULT_STATUS_FAIL);
					appresult.setMessage(Constants.RESULT_MESSAGE_NULL);
				}
			} catch (Exception e) {
				logger.error(e.getMessage());
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
			}
		}
/*处理逻辑 end*/
/*返回数据 begin*/
		appresult.setData(su);
		rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
		out.print(rs);
		out.close();
/*返回数据 end*/
		return null;
	}


	/**
	 * 前台用户修改(基本上只更改停用状态)
	 * */
	@RequestMapping(value = "sys_userupdate", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
	public String sys_userupdate(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult=new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);
		appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
		String rs = "";
		String ur_id=request.getParameter("ur_id");
		String ur_stopflag=request.getParameter("ur_stopflag");
		Boolean flag_pass=true;
		String sm_id = request.getParameter("sm_id");
/*检查参数 begin*/
		if (CommonUtil.isEmpty(ur_id)&&flag_pass==true) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("ID参数不能为空");
			flag_pass = false;
		};
		if(CommonUtil.isEmpty(ur_stopflag)&&flag_pass==true) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("ur_stopflag不能为空");
			flag_pass = false;

		}
		if (CommonUtil.isEmpty(sm_id)&&flag_pass==true) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("请登录");
			flag_pass = false;
		};

		//查询出电话号码所在的停用状态,如果存在非停用,则不让更改状态,直接返回存在用户正在使用
		String ur_phone = userService.getUr_phone(Long.valueOf(ur_id));
		//根据电话再来查询出ur_stopflag
		List<Sys_User> list = userService.getUr_stopflag(ur_phone);
		if(list!=null&&list.size()>1&&CommonUtil.convert_boolean(ur_stopflag).equals(false)){//说明查询到了
			for (int i = 0; i < list.size(); i++) {
				if(list.get(i).getUr_stopflag().equals(false)||"".equals(list.get(i).getUr_stopflag())){
					appresult.setStatus(Constants.RESULT_STATUS_FAIL);
					appresult.setMessage("此电话号码正在被使用");
					flag_pass = false;
				}
			}
		}
/*检查参数 end*/
/*处理逻辑 begin*/
		Sys_User su=new Sys_User();
		if (flag_pass==true) {
			try {
				su.setUr_id(Long.parseLong(ur_id));
				if(!CommonUtil.isEmpty(request.getParameter("ur_stopflag"))){
					su.setUr_stopflag(CommonUtil.convert_boolean(request.getParameter("ur_stopflag")));
				}
				int ii = userService.updateSysUser(su);
				if (ii==0){
					appresult.setStatus(Constants.RESULT_STATUS_FAIL);
					appresult.setMessage(Constants.RESULT_EDIT_FAIL);
				};/*提示资料不存在*/
			} catch (Exception e) {
				logger.error(e.getMessage());
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
			}
		}
/*处理逻辑 end*/
/*返回数据 begin*/
		appresult.setData(su);
		rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
		out.print(rs);
		out.close();
/*返回数据 end*/
		return null;
	}


	/**
	 * 设计师首页业务员添加查询(剩余id) zuoxiaochao
	 * Sys_User
	 */
	@SuppressWarnings({ "unused", "null" })
	@RequestMapping(value = "getsysuserlistid" ,method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
	public String getsysuserlistid(HttpServletRequest request, HttpServletResponse response) throws Exception{
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");

		//设置几个默认的状态
		AppResult appResult = new AppResult();
		appResult.setStatus(Constants.RESULT_STATUS_SUCC);
		appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
		String rs="";

		Boolean flag_pass=true;/*检查内容是否能过*/
		List<Sys_User> us = new ArrayList<>();
		//查询出版本列表
		if(flag_pass == true) {
			try {
				AppPage page = new AppPage();
				page.setPageindex(request.getParameter("pageindex"));/*当前页*/
				page.setPagesize(request.getParameter("pagesize"));/*分页*/
				Map<String, Object> map = new HashMap<String, Object>();
				 /*查询条件 begin*/
				map.put("pagestart", page.getPagestart());
				map.put("pagesize", page.getPagesize());
				//查询条件
				us = userService.getSys_UserListid(map);
				page.setRowcount(userService.getCountSys_Userid(map));
				appResult.setPage(page);

			} catch (Exception e) {
				//打印错误的日志
				logger.error(e.getMessage());
				appResult.setStatus(Constants.RESULT_STATUS_FAIL);
				appResult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
			}
		}
        /*end处理数据*/

        /*begin返回数据*/
		appResult.setData(us);
		//转化为json格式()
		rs = CommonUtil.datatype_convert(request, gson.toJson(appResult));
        /*end返回数据*/

		//处理数据格式
		out.print(rs);
		out.close();
		return null;
	}



	/**
	 * 前台用户删除(直接删除)
	 * */
	@RequestMapping(value = "deletesysuser", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
	public String deletesysuser(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult=new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);
		appresult.setMessage(Constants.RESULT_DEL_SUCC);
		String rs = "";
		String ur_id=request.getParameter("ur_id");//传入的id
		String sm_id = request.getParameter("sm_id");//登录的信息
		Boolean flag_pass=true;
/*检查参数 begin*/
		if (CommonUtil.isEmpty(ur_id)&&flag_pass==true) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("ID参数不能为空");
			flag_pass = false;
		}
		if(CommonUtil.isEmpty(sm_id)&&flag_pass==true) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("请登录");
			flag_pass = false;
		}
/*检查参数 end*/
/*处理逻辑 begin*/
		Sys_User su=new Sys_User();
		if (flag_pass==true) {
			try {
				int ii = userService.savedeleteSysuser(Long.parseLong(ur_id));//删除前台用户
				if (ii==0){
					appresult.setStatus(Constants.RESULT_STATUS_FAIL);
					appresult.setMessage(Constants.RESULT_EDIT_FAIL);
				};/*提示资料不存在*/
			} catch (Exception e) {
				logger.error(e.getMessage());
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
			}
		}
/*处理逻辑 end*/
/*返回数据 begin*/
		appresult.setData(su);
		rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
		out.print(rs);
		out.close();
/*返回数据 end*/
		return null;
	}

	/**
	 * 前台用户导出
	 * SysV_UserFull
	 */
	@SuppressWarnings({ "unused", "null" })
	@RequestMapping(value = "getsysvuserfullexport" ,method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
	public String getsysvuserfullexport(HttpServletRequest request, HttpServletResponse response) throws Exception{
       /* PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");*/

		//设置几个默认的状态
		AppResult appResult = new AppResult();
		appResult.setStatus(Constants.RESULT_STATUS_SUCC);
		appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
		String rs="";

		Boolean flag_pass=true;/*检查内容是否能过*/
		String sm_id=request.getParameter("sm_id");

		if (CommonUtil.isEmpty(sm_id)&&flag_pass==true) {
			appResult.setStatus(Constants.RESULT_STATUS_FAIL);
			appResult.setMessage("请登录");
			flag_pass = false;
		}
		//查询出版本列表
		if(flag_pass == true) {
			try {
				AppPage page = new AppPage();
				page.setPageindex(request.getParameter("pageindex"));
				page.setPagesize(request.getParameter("pagesize"));
				Map<String, Object> map = new HashMap<String, Object>();

				String[] excelheader = new String[]{"电话", "账号","昵称", "性别(1:男,2:女)", "余额",
						"陌币", "注册日期","用户类型"};//27
				String[] excelkey = new String[]{"ur_phone", "ur_no","ur_namenick", "ur_sex", "wl_account",
						"wl_integral","ur_register_date", "ur_login_imei" };//相对应
				OutputStream outs = null;
				List<Object[]> resultexcel = null;

				map.put("pagestart", page.getPagestart());
				map.put("pagesize", 100000);//这里设置的是下载的条数,可以无限大
				map.put("ur_stopflag",CommonUtil.read_dbbit("false"));//这个应该不是停用的

				List<SysV_UserFull> svl=userService.getuserfullList(map);
				int icount=svl.size();
				for (int aa=0;aa<icount;aa++){
					if("2".equals(svl.get(aa).getUr_sex())){
						svl.get(aa).setUr_sex("女");
					}else{
						svl.get(aa).setUr_sex("男");
					}

					if(svl.get(aa).getUr_usertype()==1){
						svl.get(aa).setUr_login_imei("设计师");
					}else if(svl.get(aa).getUr_usertype()==2){
						svl.get(aa).setUr_login_imei("业务员");
					}else if(svl.get(aa).getUr_usertype()==4){
						svl.get(aa).setUr_login_imei("商城");
					}else{

					}
				};

				List<Map<String, Object>> sos =CommonUtil.objectsToMaps(svl);
//*处理对应位置*//*
				resultexcel = ExcelExportUtils.ExcelToResults(excelheader,excelkey, sos);
//*加入输出流*//*
				outs = response.getOutputStream();
//*返回内容*//*
				response.reset();
				response.setContentType("application/vnd.ms-excel;charset=utf-8");
				response.setCharacterEncoding("utf-8");
				String filename = new StringBuilder(SequenceCreator.createNewFileName()+".xls").toString();//"repairorderpayment_export.xls";
				response.setHeader("Content-disposition", "attachment; filename=" + filename);
				Locale locale = null;
				if (locale != null && locale == Locale.TRADITIONAL_CHINESE) {
					ExcelExportUtils.exportExcel(excelheader, outs, resultexcel, true);
				} else {
					ExcelExportUtils.exportExcel(excelheader, outs, resultexcel, true);
					appResult.setStatus(Constants.RESULT_STATUS_SUCC);
					appResult.setMessage("文档导出成功");
				}
			} catch (IOException e) {
				logger.error(e.getMessage());
				appResult.setStatus(Constants.RESULT_STATUS_FAIL);
				appResult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
			}

		};
		//*begin返回数据*//*
		//转化为json格式()
		rs = CommonUtil.datatype_convert(request, gson.toJson(appResult));
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		//*end返回数据

		//处理数据格式
		out.print(rs);
		out.close();
		return null;
	}


	/**
	 * 后台用户导出
	 * SysV_UserFull
	 */
	@SuppressWarnings({ "unused", "null" })
	@RequestMapping(value = "getsysmangagerxport" ,method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
	public String getsysmangagerxportexport(HttpServletRequest request, HttpServletResponse response) throws Exception{
       /* PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");*/

		//设置几个默认的状态
		AppResult appResult = new AppResult();
		appResult.setStatus(Constants.RESULT_STATUS_SUCC);
		appResult.setMessage(Constants.RESULT_MESSAGE_SUCC);
		String rs="";

		Boolean flag_pass=true;/*检查内容是否能过*/
		String sm_id=request.getParameter("sm_id");

		if (CommonUtil.isEmpty(sm_id)&&flag_pass==true) {
			appResult.setStatus(Constants.RESULT_STATUS_FAIL);
			appResult.setMessage("请登录");
			flag_pass = false;
		}
		//查询出版本列表
		if(flag_pass == true) {
			try {
				AppPage page = new AppPage();
				page.setPageindex(request.getParameter("pageindex"));
				page.setPagesize(request.getParameter("pagesize"));
				Map<String, Object> map = new HashMap<String, Object>();

				String[] excelheader = new String[]{"账号", "姓名","电话", "email", "状态",
						"备注"};//27
				String[] excelkey = new String[]{"sm_no", "sm_name","sm_phone", "sm_email", "sm_password",
						"sm_remark" };//相对应
				OutputStream outs = null;
				List<Object[]> resultexcel = null;

				map.put("pagestart", page.getPagestart());
				map.put("pagesize", 100000);//这里设置的是下载的条数,可以无限大

				List<Sys_Manager> svl=managerService.getManageList(map);
				int icount=svl.size();
				for (int aa=0;aa<icount;aa++){
					if(svl.get(aa).getSm_status()==0){
						svl.get(aa).setSm_password("禁用");
					}else if(svl.get(aa).getSm_status()==1) {
						svl.get(aa).setSm_password("正常");
					}else{
					}
				}
				List<Map<String, Object>> sos =CommonUtil.objectsToMaps(svl);
//*处理对应位置*//*
				resultexcel = ExcelExportUtils.ExcelToResults(excelheader,excelkey, sos);
//*加入输出流*//*
				outs = response.getOutputStream();
//*返回内容*//*
				response.reset();
				response.setContentType("application/vnd.ms-excel;charset=utf-8");
				response.setCharacterEncoding("utf-8");
				String filename = new StringBuilder(SequenceCreator.createNewFileName()+".xls").toString();//"repairorderpayment_export.xls";
				response.setHeader("Content-disposition", "attachment; filename=" + filename);
				Locale locale = null;
				if (locale != null && locale == Locale.TRADITIONAL_CHINESE) {
					ExcelExportUtils.exportExcel(excelheader, outs, resultexcel, true);
				} else {
					ExcelExportUtils.exportExcel(excelheader, outs, resultexcel, true);
					appResult.setStatus(Constants.RESULT_STATUS_SUCC);
					appResult.setMessage("文档导出成功");
				}
			} catch (IOException e) {
				logger.error(e.getMessage());
				appResult.setStatus(Constants.RESULT_STATUS_FAIL);
				appResult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
			}

		};
		//*begin返回数据*//*
		//转化为json格式()
		rs = CommonUtil.datatype_convert(request, gson.toJson(appResult));
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		//*end返回数据

		//处理数据格式
		out.print(rs);
		out.close();
		return null;
	}

}

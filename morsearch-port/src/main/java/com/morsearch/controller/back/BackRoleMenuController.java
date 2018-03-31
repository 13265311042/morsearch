package com.morsearch.controller.back;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.morsearch.base.BaseController;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.ControllerUtils;
import com.morsearch.model.Sys_MenuRole;
import com.morsearch.model.Sys_MenuRolePower;
import com.morsearch.service.RoleMenuService;
import com.morsearch.vo.AppDatagrid;
import com.morsearch.vo.AppPage;
import com.morsearch.vo.AppResult;
import com.morsearch.vo.JsonTreeData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
权限管理
leoli
2017.10.12
* */

@Controller("BackRoleMenuController")
@RequestMapping("/back/")

public class BackRoleMenuController extends BaseController {
	@Resource
	private RoleMenuService roleService;

	private String rl_id;
	private String rl_name;
/*	private String sm_password;
	private String sm_name;
*/


	/*用户显示列表*/
	@RequestMapping(value = "getrolemenulist", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
	public String getrolemenulist(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult=new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);
		appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
		String rs = "";
		Boolean flag_pass=true;/*检查内容是否能过*/

		/*处理逻辑 begin*/
		List<Sys_MenuRole> list=new ArrayList<Sys_MenuRole>();

		if (flag_pass==true) {
			try {
			/*控制页码 begin*/
				AppPage page = new AppPage();
				page.setPageindex(request.getParameter("pageindex"));/*当前页*/
				page.setPagesize(request.getParameter("pagesize"));/*分页*/

				Map<String,Object> map=new HashMap<String,Object>();
				map.put("pagestart",page.getPagestart());
				map.put("pagesize",page.getPagesize());
				map.put("rl_name",request.getParameter("rl_name"));
				map.put("rl_stopflag",CommonUtil.read_dbbit(request.getParameter("rl_stopflag")));

				page.setRowcount(roleService.getRoleMenuCount(map));/*记录数*/
				appresult.setPage(page);
			/*控制页码 end*/
				list=roleService.getRoleMenuList(map);

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

		appresult.setData(dto);
		rs=CommonUtil.datatype_convert(request,gson.toJson(appresult));/*处理数据格式*/
		out.print(rs);
		out.close();
		/*返回数据 end*/
		return null;

	}


	/*
    * 读取角色明细*/
	@RequestMapping(value = "getrolemenudetail", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
	public String getrolemenudetail(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult=new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);
		appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
		String rs = "";
		rl_id=request.getParameter("rl_id");
		Boolean flag_pass=true;
/*检查参数 begin*/
		if ((rl_id==null || "".equals(rl_id))&&flag_pass==true) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("ID参数不能为空");
			flag_pass = false;
		};
/*检查参数 end*/
/*处理逻辑 begin*/
		Sys_MenuRole sm=new Sys_MenuRole();
		if (flag_pass==true) {
			try {
				sm= roleService.getRoleDetail(Integer.parseInt(rl_id));
				if (sm==null){
					appresult.setStatus(Constants.RESULT_STATUS_FAIL);
					appresult.setMessage(Constants.RESULT_MESSAGE_NULL);
				};
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

	@RequestMapping(value = "delrolemenu", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
	public String delrolemenu(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult=new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);
		appresult.setMessage(Constants.RESULT_DEL_SUCC);
		String rs = "";
		rl_id=request.getParameter("rl_id");
		Boolean flag_pass=true;
/*检查参数 begin*/
		if ((rl_id==null || "".equals(rl_id))&&flag_pass==true) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("ID参数不能为空");
			flag_pass = false;
		};

/*检查参数 end*/
/*处理逻辑 begin*/
		if (flag_pass==true) {
			try {
				int ii=roleService.delRole(Integer.parseInt(rl_id));
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


	@RequestMapping(value = "addrolemenu", method ={RequestMethod.POST, RequestMethod.GET},produces ={ "application/json;charset=UTF-8" })
	public String addrolemenu(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult=new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);
		appresult.setMessage(Constants.RESULT_ADD_SUCC);
		String rs = "";
		Boolean flag_pass=true;

		rl_name=request.getParameter("rl_name");
/*检查参数 begin*/
		if ((rl_name==null || "".equals(rl_name))&&flag_pass==true) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("角色名称不能为空");
			flag_pass = false;
		};

/*检查参数 end*/

/*处理逻辑 begin*/
		if (flag_pass==true) {
			try {
				Sys_MenuRole sm=new Sys_MenuRole();
				sm.setRl_name(rl_name);
				sm.setRl_remark(request.getParameter("rl_remark"));
				sm.setRl_stopflag(CommonUtil.convert_boolean(request.getParameter("rl_stopflag")));
				int ii=roleService.addRole(sm);
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
    * 修改保存
    * */
	@RequestMapping(value = "updaterolemenu", method ={RequestMethod.POST, RequestMethod.GET},produces ={ "application/json;charset=UTF-8" })
	public String updaterolemenu(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult=new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);
		appresult.setMessage(Constants.RESULT_ADD_SUCC);
		String rs = "";
		Boolean flag_pass=true;

		rl_id=request.getParameter("rl_id");
		rl_name=request.getParameter("rl_name");
/*检查参数 begin*/
		if ((rl_id==null || "".equals(rl_id))&&flag_pass==true) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("ID不能为空");
			flag_pass = false;
		};
		if ((rl_name==null || "".equals(rl_name))&&flag_pass==true) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("角色名称不能为空");
			flag_pass = false;
		};

/*检查参数 end*/

/*处理逻辑 begin*/
		if (flag_pass==true) {
			try {
				Sys_MenuRole sm=new Sys_MenuRole();
				sm.setRl_name(rl_name);
				sm.setRl_remark(request.getParameter("rl_remark"));
				sm.setRl_stopflag(CommonUtil.convert_boolean(request.getParameter("rl_stopflag")));
				int ii=roleService.updateRole(sm);
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
    * 读取角色权限明细*/
	@RequestMapping(value = "getrolemenupowerlist", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
	public String getrolemenupowerlist(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult=new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);
		appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
		String rs = "";
		rl_id=request.getParameter("rl_id");
		Boolean flag_pass=true;
/*检查参数 begin*/
		if ((rl_id==null || "".equals(rl_id))&&flag_pass==true) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("ID参数不能为空");
			flag_pass = false;
		};
/*检查参数 end*/

/*处理逻辑 begin*/
		List<Sys_MenuRolePower> list=new ArrayList<Sys_MenuRolePower>();
		if (flag_pass==true) {
			try {
			/*控制页码 begin*/
				AppPage page = new AppPage();
				page.setPageindex(request.getParameter("pageindex"));/*当前页*/
				page.setPagesize(request.getParameter("pagesize"));/*分页*/
				page.setRowcount(roleService.getRolePowerListCount(Integer.parseInt(rl_id)));/*记录数*/
				page.setPagecount(page.getRowcount()/page.getPagesize()+((page.getRowcount() % page.getPagesize())> 0?1:0));/*页数*/
				appresult.setPage(page);
			/*控制页码 end*/
				list=roleService.getRolePowerList(Integer.parseInt(rl_id),appresult.getPage().getPagestart(),appresult.getPage().getPagesize());
				if (list==null){
					appresult.setStatus(Constants.RESULT_STATUS_FAIL);
					appresult.setMessage(Constants.RESULT_MESSAGE_NULL);
				};

			} catch (Exception e) {
				logger.error(e.getMessage());
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
			}
		}
/*处理逻辑 end*/
/*返回数据 begin*/
		appresult.setData(list);
		rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
		out.print(rs);
		out.close();
/*返回数据 end*/
		return null;
	}

	/*
    * 修改保存
    * */
	@RequestMapping(value = "updaterolemenupower", method ={RequestMethod.POST, RequestMethod.GET},produces ={ "application/json;charset=UTF-8" })
	public String updaterolemenupower(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult=new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);
		appresult.setMessage(Constants.RESULT_ADD_SUCC);
		String rs = "";
		Boolean flag_pass=true;

		rl_id=request.getParameter("rl_id");
		String content=request.getParameter("content");

		content="[{rp_roleid: 1,rp_powerno: \'2\'},{rp_roleid: 1,rp_powerno: \'1\'}]";
/*检查参数 begin*/
		if ((rl_id==null || "".equals(rl_id))&&flag_pass==true) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("ID不能为空");
			flag_pass = false;
		};

		if ((content==null || "".equals(content))&&flag_pass==true) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("content不能为空");
			flag_pass = false;
		};

/*检查参数 end*/

		Gson gson = new Gson();
		List<Sys_MenuRolePower> rp = gson.fromJson(content,new TypeToken<List<Sys_MenuRolePower>>(){}.getType());

/*处理逻辑 begin*/
		if (flag_pass==true) {
			try {
				Sys_MenuRole sm=new Sys_MenuRole();
				sm.setRl_name(rl_name);
				sm.setRl_remark(request.getParameter("rl_remark"));
				sm.setRl_stopflag(CommonUtil.convert_boolean(request.getParameter("rl_stopflag")));
				int ii=roleService.updateRole(sm);
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


/*调用菜单列表
leoli
2018.01.16
* */

	@SuppressWarnings({ "unused", "null" })
	@RequestMapping(value = "getmenupowerlist", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
	public String getmenupowerlist(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult=new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);
		appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
		String rs = "";
	//	String sm_id=request.getParameter("sm_id");
		Boolean flag_pass=true;

/*检查参数 begin*/
/*
		if (flag_pass==true&&(CommonUtil.isEmpty(sm_id)==true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("ID参数不能为空");
			flag_pass = false;
		};
*/

/*检查参数 end*/
/*处理数据 begin*/
		List<JsonTreeData> jtlist = new ArrayList<JsonTreeData>();

		if (flag_pass==true) {
			try {
				jtlist =roleService.getMenuTree();
                jtlist.get(0).setChildren(roleService.getMenuTree());

			} catch (Exception e) {
				logger.error(e.getMessage());
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
			}
		}
/*处理数据 end*/
/*返回数据 begin*/
		appresult.setData(jtlist);
		rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
		out.print(rs);
		out.close();
/*返回数据 end*/
		return null;
	}



}

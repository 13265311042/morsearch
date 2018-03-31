package com.morsearch.controller.front;

import com.morsearch.base.BaseController;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.ControllerUtils;
import com.morsearch.common.util.DateTimeUtil;
import com.morsearch.interceptor.IgnoreAuth;
import com.morsearch.model.*;
import com.morsearch.redis.SerializeUtil;
import com.morsearch.service.*;
import com.morsearch.vo.AppResult;
import com.morsearch.vo.HomeDetail;
import com.morsearch.vo.HomePage;
import net.sf.json.JSONObject;
import org.bouncycastle.util.Strings;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.*;

//首页 Leoli 2017.11.09
// http://localhost:8080/app/test.shtml

@Controller("FrontHomeController")
@RequestMapping("/front/")

public class FrontHomeController extends BaseController {

	private String userid;

	@Resource
	private HomeService homeService;
	@Resource
	private OrderService orderService;
	@Resource
	private BaseRotationService baserotationservice;
	@Resource
	private PmArchivesService pmarchivesservice;

	@Resource
	private MallHomeService mallhomeservice;



/*首页接口
leoli
2017.11.09
* */
	@IgnoreAuth /*不验证*/
	@SuppressWarnings({ "unused", "null" })
	@RequestMapping(value = "gethomepage", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
	public String gethomepage(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult=new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);
		appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
		String rs = "";
		userid=request.getParameter("userid");
		Boolean flag_pass=true;

/*处理数据 begin*/
		HomePage hp=new HomePage();

		if (flag_pass==true) {
			try {
				List<HomeV_Page> list=new ArrayList<HomeV_Page>();/*列表*/
			//	int msgcount=0;/*信息数量*/

				String strlist=redisService.getStringValue(Constants.REDIS_SALEHOME_LIST);
				if (strlist!=null&&"".equals(strlist)){/*读取redis资料*/
					String[] str=strlist.split(",");
					for (int ii=0;ii<str.length;ii++){
						Map<String, String>  mapmp=redisService.getMapValue(Constants.REDIS_SALEHOME_POS+str[ii]);/*读取汇总明细*/
						HomeV_Page hvp=new HomeV_Page();
						hvp.setLongitude(mapmp.get("longitude"));
						hvp.setLatitude(mapmp.get("latitude"));
						hvp.setUserqty(CommonUtil.convert_Long(mapmp.get("userqty")));
						hvp.setCountneed(CommonUtil.convert_bigdecimal(mapmp.get("countneed")));
						hvp.setCountorder(CommonUtil.convert_bigdecimal(mapmp.get("countorder")));
						hvp.setCompanyaddr(mapmp.get("companyaddr"));
						hvp.setGroupid(mapmp.get("groupid"));
						list.add(hvp);
					};
				}else{/*读取数据库资料*/
					list =homeService.getHomePage();
				};

/*过滤用户专业 begin*/
				String filtermajor=commService.getSysConfigValue("open_sales_major");/*查是否过滤业务员专业*/
				if (filtermajor!=null&&"1".equals(filtermajor)) {
					if (CommonUtil.isEmpty(userid) == false && CommonUtil.isNumeric(userid) == true) {
						String willmajor = CommonUtil.read_str(redisService.getMapRow(Constants.REDIS_USER_WILLMAJOR, userid));/*个人意向专业*/
						if (CommonUtil.isEmpty(willmajor) == false) {
							List<HomeV_Page> listOK = new ArrayList<HomeV_Page>();/*列表*/
							int icount = list.size();
							String[] designlist = null; /*默认设计师列表*/
							String[] majorlist = null; /*意向专业列表*/
							String designuserid = null; /*设计师用户ID*/
							String designmajor = null; /*设计师专业*/
							String sgroupid = "";
							Integer icountneed = 0;
							Integer icountorder = 0;
							String signstr = ";";

							Boolean flagdetail = false;
							List<HomeV_Detail> uflistOK = new ArrayList<HomeV_Detail>();/*用户列表*/
							HomeV_Detail ufok = null;

							for (int ii = 0; ii < icount; ii++) { /*小组列表*/
								HomeV_Page hvp = list.get(ii);
								designlist = list.get(ii).getGroupid().toString().split(",");
								uflistOK = new ArrayList<HomeV_Detail>();
								for (int jj = 0; jj < designlist.length; jj++) { /*设计师列表*/
									ufok = null;
									designuserid = designlist[jj];
									flagdetail = false;
									if (willmajor.contains(";") == true) {
										signstr = ";";
									}
									;
									if (willmajor.contains("|") == true) {
										signstr = "|";
									}
									;
									majorlist = willmajor.split(signstr);
									designmajor = redisService.getMapRow(Constants.REDIS_USER_DETAIL, designuserid);
									if (designmajor != null && !"".equals(designmajor)) {
										ufok = (gson.fromJson(designmajor, HomeV_Detail.class));
										designmajor = ufok.getUe_personmajor();
										for (int kk = 0; kk < majorlist.length; kk++) { /*业务员专业列表*/
											if ((signstr + designmajor + signstr).contains(majorlist[kk]) == true) {
												flagdetail = true;
											}
											;
										}
										;
									}
									;
									if (flagdetail == true && ufok != null) {
										uflistOK.add(ufok);
									}
									;
								}
								;
								if (uflistOK != null && uflistOK.size() > 0) {
									sgroupid = "";
									icountneed = 0;
									icountorder = 0;
									for (int mm = 0; mm < uflistOK.size(); mm++) {
										if (!"".equals(sgroupid)) {
											sgroupid = sgroupid + ",";
										}
										;
										sgroupid = sgroupid + uflistOK.get(mm).getUr_id();
										icountneed = icountneed + CommonUtil.read_int(uflistOK.get(mm).getUm_countneed());
										icountorder = icountorder + CommonUtil.read_int(uflistOK.get(mm).getUm_countorder());
									}
									;
									hvp.setGroupid(sgroupid);
									hvp.setCountneed(new BigDecimal(icountneed));
									hvp.setCountorder(new BigDecimal(icountorder));
									hvp.setUserqty((long) uflistOK.size());
									listOK.add(hvp);
								}
								;
							}
							;
							if (listOK != null && listOK.size() > 0) {
								list = listOK;
								listOK = null;
							}
							;
						}
						;
					}
					;
				};
/*过滤用户专业 end*/


/*
				if (CommonUtil.isEmpty(userid)==false) {
					if (redisService.checkValue(Constants.REDIS_USER_MSG)) {
						msgcount = CommonUtil.convert_Int(redisService.getMapRow(Constants.REDIS_USER_MSG, userid));
					}else{
						Sys_User_Msg um = userService.getUserMessage(Long.parseLong(userid));
						if (um!=null){msgcount=um.getUm_msgsumtime();};
					};
				};
*/


				hp.setPoslist(list);
				hp.setRecordcount(list.size());
		//		hp.setUsermsgcount(msgcount);


			} catch (Exception e) {
				logger.error(e.getMessage());
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
			}
		}
/*处理数据 end*/
/*返回数据 begin*/
		appresult.setData(hp);
		rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
		out.print(rs);
		out.close();
/*返回数据 end*/
		return null;
	}


/*读取首页明细
leoli
2017.11.13
* */
	@IgnoreAuth /*不验证*/
	@SuppressWarnings({ "unused", "null" })
	@RequestMapping(value = "gethomedetail", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
	public String gethomedetail(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult=new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);
		appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
		String rs = "";
		String groupid=request.getParameter("groupid");

		String userid = request.getParameter("userid");

		Boolean flag_pass=true;

/*检查参数 begin*/
		if (flag_pass==true&&(CommonUtil.isEmpty(groupid)==true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("groupid参数不能为空");
			flag_pass = false;
		};


/*检查参数 end*/
/*处理数据 begin*/
		HomeDetail hds=new HomeDetail();
//
		if (flag_pass==true) {
			try {
				String[] ss=groupid.split(",");
				String strmm;
				List<HomeV_Detail> hd = new ArrayList<HomeV_Detail>();
				for (int ii=0;ii<ss.length;ii++){
					HomeV_Detail vd=new HomeV_Detail();
					strmm=redisService.getMapRow(Constants.REDIS_USER_DETAIL,ss[ii]);
					if (strmm!=null){
						vd= gson.fromJson(strmm, HomeV_Detail.class);
					}else{
						List<HomeV_Detail>	vdl=homeService.getHomeDetail(Long.parseLong(ss[ii]));
						if (vdl.size()>0){vd=vdl.get(0);};
					};
					hd.add(vd);
				};
				hds.setDetaillist(hd);

/*单人时，显示订单状态 begin*/
				if (ss.length==1&&CommonUtil.isEmpty(userid)==false){
				List<Sales_Order> order=orderService.getOrderPsnDetail(Long.parseLong(userid),Long.parseLong(ss[0]), (byte) 1, (byte) 0,1);
				if (order!=null&&order.size()>0){
					hds.setOrdernewno(order.get(0).getOf_no());
					hds.setOrdernewdate(order.get(0).getOf_dateorder());
				};
				};
/*单人时，显示订单状态 end*/


			} catch (Exception e) {
				logger.error(e.getMessage());
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
			}
		}
/*处理数据 end*/
/*返回数据 begin*/
		appresult.setData(hds);
		rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
		out.print(rs);
		out.close();
/*返回数据 end*/
		return null;
	}




	/*首页查询接口
    leoli
    2017.11.15
    * */
	@IgnoreAuth /*不验证*/
	@SuppressWarnings({ "unused", "null" })
	@RequestMapping(value = "gethomesearch", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
	public String gethomesearch(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult=new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);
		appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
		String rs = "";
		String lng=request.getParameter("lng");
		String lat=request.getParameter("lat");
		String keyword=request.getParameter("keyword");
		Boolean flag_pass=true;

/*检查参数 begin*/
/*
		if (flag_pass==true&&(CommonUtil.isEmpty(lng)==true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("lng参数不能为空");
			flag_pass = false;
		};

		if (flag_pass==true&&(CommonUtil.isEmpty(lat)==true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("lat参数不能为空");
			flag_pass = false;
		};
*/

		if (flag_pass==true&&(CommonUtil.isEmpty(keyword)==true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("keyword参数不能为空");
			flag_pass = false;
		};
/*检查参数 end*/

/*处理数据 begin*/
	//	HomePage hp=new HomePage();
		List<HomeV_Page> list=new ArrayList<HomeV_Page>();/*列表*/
		if (flag_pass==true) {
			try {

				list =homeService.getHomeSearch(lng,lat,keyword);

/*				hp.setPoslist(list);
				hp.setRecordcount(list.size());*/
				if (list.size()== 0) {
					appresult.setStatus(Constants.RESULT_STATUS_FAIL);
					appresult.setMessage(Constants.RESULT_MESSAGE_FAIL);
				}

			} catch (Exception e) {
				logger.error(e.getMessage());
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
			}
		}
/*处理数据 end*/
/*返回数据 begin*/
		appresult.setData(list);
		rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
		out.print(rs);
		out.close();
/*返回数据 end*/
		return null;
	}






	/*生成首页数据接口
    leoli
    2017.11.10
    * */
	@IgnoreAuth /*不验证*/
	@SuppressWarnings({ "unused", "null" })
	@RequestMapping(value = "savehomepage", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
	public String savehomepage(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult=new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);
		appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
		String rs = "";

		try {

/*清空redis*/
			redisService.clearredisdb();

/*清除用户在线状态*/

			List<SysV_UserFull> sul=userService.getUsertypeList(0,0);
			int icount=0;
			for (int ii=0;ii<icount;ii++){
				Sys_User su=new Sys_User();
				su.setUr_id(sul.get(ii).getUr_id());
				su.setUr_login_online(false);
				userService.updatesave(su,null,null);
			};

/*加首页*/
		List<HomeV_Page> hp=new ArrayList<HomeV_Page>();
		List<HomeV_Detail> hd=new ArrayList<HomeV_Detail>();

		hp=homeService.getHomePage();
		hd=homeService.getHomeDetail(-1L);
		int ihpcount=hp.size();
	//	redisService.deleteValue(rediskey);
	//	List<String> hl=new ArrayList<String>();/*列表*/
		String strlist="";
		Map<String, String> mapp = new HashMap<String, String>();/*资料*/
		String stype="";
		for (int ii=0;ii<ihpcount;ii++){
			stype=hp.get(ii).getLongitude()+"*"+hp.get(ii).getLatitude();
			strlist+=stype+",";
			mapp.put("longitude",""+hp.get(ii).getLongitude());
			mapp.put("latitude",""+hp.get(ii).getLatitude());
			mapp.put("userqty",""+hp.get(ii).getUserqty());
			mapp.put("countneed",""+hp.get(ii).getCountneed());
			mapp.put("countorder",""+hp.get(ii).getCountorder());
			mapp.put("companyaddr",""+hp.get(ii).getCompanyaddr());
			mapp.put("groupid",""+hp.get(ii).getGroupid());
			redisService.saveMapValue(Constants.REDIS_SALEHOME_POS+stype,mapp,0);/*存地点*/
			};
		redisService.saveStringValue(Constants.REDIS_SALEHOME_LIST,strlist,0);

/*存明细*/
		int ihdcount=hd.size();
		Map<String, String> mapdetail = new HashMap<String, String>();/*资料*/
		for (int ii=0;ii<ihdcount;ii++){
			mapdetail.put(hd.get(ii).getUr_id()+"",gson.toJson(hd.get(ii)));
		//	redisService.saveMapRow(Constants.REDIS_COMPANYLIST,hd.get(ii).getUe_companyname(),"");/*存公司*/
			};
		redisService.saveMapValue(Constants.REDIS_USER_DETAIL,mapdetail,0);/*存个人明细*/

/*获取用户信息数量*/
		Map<String, String> mapmsg = new HashMap<String, String>();/*资料*/
		List<Sys_User_Msg> um=userService.getUserMsgList();
		icount=um.size();
		for (int ii=0;ii<icount;ii++){
			mapmsg.put(um.get(ii).getUm_userid()+"",CommonUtil.read_int(um.get(ii).getUm_msgsumtime())+"");
		};
		redisService.saveMapValue(Constants.REDIS_USER_MSG,mapmsg,0);/*存个人信息*/

/*用户意向*/
			Map<String, String> mapwillmajor = new HashMap<String, String>();/*资料*/
			List<SysV_UserFull> umw=userService.getUsertypeList(2,1);
			icount=umw.size();
			for (int ii=0;ii<icount;ii++){
				mapwillmajor.put(umw.get(ii).getUr_id()+"",CommonUtil.read_str(umw.get(ii).getUe_willmajor()));
			};
			redisService.saveMapValue(Constants.REDIS_USER_WILLMAJOR,mapwillmajor,0);/*存*/

/*获取订单状态*/
		List<Sales_Order> sos=orderService.getOrderStatusList(1);
		icount=sos.size();
		if (sos!=null) {
		   for(int ii=0;ii<icount;ii++)
			redisService.saveMapRow(Constants.REDIS_ORDER_STATUS,sos.get(ii).getOf_no(),gson.toJson(sos.get(ii))); /*存入订单状态*/
		};


/*存储配置列表*/
			List<Sys_Config> scf=commService.getSysConfigList(null);
			icount=scf.size();
			for (int ii=0;ii<icount;ii++){
				redisService.saveMapRow(Constants.REDIS_SYS_CONFIG,scf.get(ii).getSc_code(),gson.toJson(scf.get(ii)));
			};

/*加轮播图*/
		List<Map<String,String>> brt=baserotationservice.getBase_Rotation_typelist();
		for(int ii=0;ii<brt.size();ii++){
			List<Base_Rotation> brl=baserotationservice.getRotationListshow(brt.get(ii).get("rt_type"),true);
			Map<String, String> mpbr = new HashMap<>();/*资料*/
			for (int jj=0;jj<brl.size();jj++){
				if (CommonUtil.read_boolean(brl.get(jj).getRt_flagstop())==false) {
					mpbr.put(brl.get(jj).getRt_id() + "", gson.toJson(brl.get(jj)));
				};
			};
			if (brl!=null&&brl.size()>0) {
				redisService.saveMapValue(Constants.REDIS_ROTATION+brt.get(ii).get("rt_type"), mpbr, 0);/*存*/
			};
		};

/*商城首页*/
			List<MallV_Home>  mvh=mallhomeservice.getMallV_Home_show(1,null);
			Map<String, String> mvhlist = new HashMap<>();/*资料*/
			for (int jj=0;jj<mvh.size();jj++){
				mvhlist.put(mvh.get(jj).getMh_id() + "", gson.toJson(mvh.get(jj)));
			};
			if (mvhlist!=null&&mvhlist.size()>0) {
					redisService.saveMapValue(Constants.REDIS_MALL_HOME, mvhlist, 0);/*存*/
			};


/*未处理文档切割列表*/
/*
			List<Map<String, Object>> mapcutpm =pmarchivesservice.getPm_Archivesidnocut();
			icount=mapcutpm.size();
			List<String> listcut=new ArrayList<String>();
			for (int ii=0;ii<icount;ii++){
				listcut.add(mapcutpm.get(ii).get("pa_filename").toString()
						+","+String.valueOf(mapcutpm.get(ii).get("pa_id"))+","
						+ mapcutpm.get(ii).get("pa_createdate").toString());
			};
			redisService.saveListValue(Constants.REDIS_ARCHIVES,listcut,0);*/






		} catch (Exception e) {
				logger.error(e.getMessage());
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
		}
/*返回数据 begin*/
		rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
		out.print(rs);
		out.close();
/*返回数据 end*/
		return null;
	}


}

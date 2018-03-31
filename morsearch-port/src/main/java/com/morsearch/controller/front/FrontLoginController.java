package com.morsearch.controller.front;



import com.morsearch.base.BaseController;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.*;
import com.morsearch.interceptor.IgnoreAuth;
import com.morsearch.model.*;
import com.morsearch.vo.AppResult;
import com.morsearch.vo.Login_Msg;
import com.morsearch.vo.UserConfig;
import com.morsearch.vo.UserFrontLogin;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLDecoder;
import java.util.*;


/**
 * 进行管理后台框架界面的类
 *

 */
@Controller("FrontLoginController")
@RequestMapping("/front/")

public class FrontLoginController extends BaseController {

	private Sys_User user;


/*保存登录信息*/
	private UserConfig saveloginmsg(SysV_UserFull user,String phone,String password,String logintoken){
/*shiro 验证 begin*/
/*
        String re=request.getSession().toString();
		UsernamePasswordToken shirotoken = new UsernamePasswordToken(phone,password.trim());
		shirotoken.setRememberMe(true);
		Subject currentUser = SecurityUtils.getSubject();
		currentUser.login(shirotoken);
*/
/*shiro 验证 end*/

/*保存登录 begin*/
		Sys_User uselogin=new Sys_User();
		uselogin.setUr_id(user.getUr_id());
		uselogin.setUr_login_port(user.getUr_login_port());
		uselogin.setUr_login_ver(user.getUr_login_ver());
		uselogin.setUr_login_date(new Date());
		uselogin.setUr_login_online(true);
		if (user.getUr_login_imei()!=null){uselogin.setUr_login_imei(user.getUr_login_imei());};
		userService.updatesave(uselogin,null,null);
/*保存登录 end*/

/*保存用户值到session begin*/
		Login_Msg lm=new Login_Msg();
		lm.setLogintoken(logintoken); /*登录token*/
		lm.setUserno(user.getUr_phone());/* 登录账号*/
		lm.setUsername(user.getUr_namenick() );/* 登录名称*/
		lm.setUserjob(user.getUe_personjob());/* 登录职位*/
		lm.setLogintype(Constants.LOGIN_TYPE_FRONT);/* 表示1表示前端，2前端登录*/
		lm.setLoginsource(user.getUr_login_port());/* 登录来源*/
		lm.setLoginversion(user.getUr_login_ver());/* 登录版本*/
		lm.setLogindate(new Date());/*日期*/
		redisService.saveMapRow(Constants.REDIS_LOGIN_FRONT,user.getUr_id()+"",gson.toJson(lm));

/*保存用户值到session end*/

/*读取配置信息 begin*/

	UserConfig uc=new UserConfig();
	uc.setPath_image_normal(commService.getSysConfigValue("path_image_normal"));/*源图片路径*/
	uc.setPath_image_small(commService.getSysConfigValue("path_image_small"));/*小图片路径*/
	uc.setPath_pdf_source(commService.getSysConfigValue("path_pdf_source"));/*pdf源文件片路径*/
	uc.setPath_pdf_image(commService.getSysConfigValue("path_pdf_image"));/*pdf图片路径*/
//	uc.setPath_cad(commService.getSysConfigValue("path_cad"));/*cad路径*/
//	uc.setPath_bim(commService.getSysConfigValue("path_bim"));/*bim路径*/
	uc.setPath_download(commService.getSysConfigValue("path_download"));/*文件下载*/
	uc.setOrder_time_revoke(commService.getSysConfigValue("order_time_revoke"));/*允许订单撤回时间*/
	uc.setPath_imgsys_normal(commService.getSysConfigValue("path_imgsys_normal"));/*系统图片源文件*/
	uc.setPath_imgsys_small(commService.getSysConfigValue("path_imgsys_small"));/*系统图片小文件*/
	uc.setPath_accessory(commService.getSysConfigValue("path_accessory"));/*附件*/
	uc.setPath_pdf_api(commService.getSysConfigValue("pdf_api"));/*应用服务地址*/

	return uc;
/*读取配置信息 end*/

	};



	/*前端注册接口
    *Leoli 2017.10.11
    * */
	@IgnoreAuth
	@RequestMapping(value = "register", method ={RequestMethod.POST, RequestMethod.GET}, produces ={ "application/json;charset=UTF-8" })
	public String register(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult=new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);
		appresult.setMessage("注册成功");
		String rs = "";


		Boolean flag_pass=true;
		String phone=request.getParameter("phone");
		String code=request.getParameter("code");
		String token=request.getParameter("token");
		String password=request.getParameter("password");
		String source=request.getParameter("source");
		String version=request.getParameter("version");
		String usertype=request.getParameter("usertype");
		String invitationcode = request.getParameter("invitationcode");

		if (phone!=null){phone=phone.trim();};
		if (password!=null){password=password.trim();};
/*检查参数 begin*/
		if (flag_pass==true&&CommonUtil.isEmpty(phone)==true) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("手机号码不能为空");
			flag_pass=false;
		};

		if (flag_pass==true&&CommonUtil.isEmpty(usertype)==true) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("用户类别不能为空");
			flag_pass=false;
		};

		if (flag_pass==true&&CommonUtil.isEmpty(code)==true) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("验证码不能为空");
			flag_pass=false;
		};

		if (flag_pass==true&&CommonUtil.isEmpty(token)==true) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("Token不能为空");
			flag_pass=false;
		};

		if (flag_pass==true&&token!=null&&token.length()<32) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("Token不能少于32位");
			appresult.setErrorcode("4");
			flag_pass=false;
		};


		if (flag_pass==true&&CommonUtil.isEmpty(password)==true) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("登录密码不能为空");
			flag_pass=false;
		};

		if ((password!=null && password.length()<6)&&flag_pass==true) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("登录密码长度不能少于6位");
			flag_pass=false;
		};

		if (flag_pass==true&&CommonUtil.isEmpty(source)==true) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("[source]来源类型不能为空");
			flag_pass=false;
		};
		if (flag_pass==true&&CommonUtil.isEmpty(version)==true) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("[version]版本号不能为空");
			flag_pass=false;
		};

/*查邀请码*/
		if (flag_pass == true &&"1".equals(usertype)) {
				if (flag_pass == true && CommonUtil.isEmpty(invitationcode) == true) {
					appresult.setStatus(Constants.RESULT_STATUS_FAIL);
					appresult.setMessage("邀请码不能为空");
					flag_pass = false;
				}

				if (flag_pass == true) {
					String randomcode = "888888".toLowerCase();  //第一个邀请码
					String randomcode2 = "";
					Long invuserid = userService.getSys_userinvitecode(invitationcode);
					if (invuserid!=null) {randomcode2 =invitationcode.toLowerCase();};
					if (!invitationcode.toLowerCase().equals(randomcode2.toLowerCase()) && !invitationcode.toLowerCase().equals(randomcode)) {
						appresult.setStatus(Constants.RESULT_STATUS_FAIL);
						appresult.setMessage("邀请码错误");
						flag_pass = false;
					}
			};
		};


 /*检验重复*/
		if (flag_pass==true) {
			int ic=userService.getCheckDouble(0,null,phone,null,null);
			Integer diut=0;
			if (ic>0){diut=userService.getUserType(phone,2);};
			if (ic>0&&diut!=4){ /*4为商城用户*/
				switch (diut){
					case 1:
						appresult.setMessage("设计师端已经注册");
						break;
					case 2:
						appresult.setMessage("业务员端已经注册");
						break;
					default:
						appresult.setMessage("当前手机号已经注册");
						break;
				};
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				flag_pass=false;
			};
		};
		if (flag_pass==true) {
			int ic=userService.getCheckDouble(0,null,null,null,token);
			if (ic>0){
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage("当前token值【"+token+"】已经存在");
				appresult.setErrorcode("4");
				flag_pass=false;
			};
		};

/*查验证码*/
		Integer smsid=0;
		if (flag_pass==true) {
			String rut=smsService.saveSmsVerifyResult(phone,1,code,true);
			System.out.print(rut);
			if (!"1".equals(rut.substring(0,1))){
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage(rut);
				flag_pass=false;
			}else{
				smsid= Integer.valueOf(rut.substring(2,rut.length()));
			};
		};

/*检查参数 end*/
/*处理逻辑 begin*/
		if (flag_pass==true) {
			try {
				Sys_User user=new Sys_User();
				user.setUr_phone(phone);
				user.setUr_token(token);
				user.setUr_register_port(source);
				user.setUr_register_ver(version);
				user.setUr_register_date(new Date());
				user.setUr_usertype(Byte.valueOf(usertype));/*用户类型*/
				user.setUr_invitecode(invitationcode);
				user.setUr_password(CommonUtil.pwdmd5t2(password));

				String namenick = request.getParameter("namenick");
				String companyname = request.getParameter("companyname");
				String brand = request.getParameter("brand");
				String workage = request.getParameter("workage");
				String major = request.getParameter("major");
				user.setUr_namenick(CommonUtil.read_str(namenick));
				user.setUr_namefull(CommonUtil.read_str(namenick));
				Sys_User_Ext ue=null;
				if (CommonUtil.isEmpty(companyname)==false ||CommonUtil.isEmpty(brand)==false
						||CommonUtil.isEmpty(workage)==false||CommonUtil.isEmpty(major)==false) {
					ue = new Sys_User_Ext();
					ue.setUe_companyname(companyname);
					ue.setUe_companybrand(brand);
					ue.setUe_personworkage(workage);
					ue.setUe_personmajor(major);
				};
				String c = "";
				if ("1".equals(usertype)){
					Boolean bl = true;
						while (bl==true){
							c = InviteCodeUtils.generateInviteCode();
							List<Sys_User> list = userService.getSysuserinvitecode(c);
							if (list.size()>0){
								bl =true;
							}else {
								bl=false;
							}
						}
					user.setUr_personcode(c);
				}
				userService.addregister(user,ue);/*注册*/



				if (smsid!=0){/*注册码确定*/
					Sys_SmsVerify sms=new Sys_SmsVerify();
					sms.setSv_id(smsid);
					sms.setSv_status((byte) 1);
					sms.setSv_verifytime(new Date());
					smsService.verifyupdate(sms);
				};
				rs=""+user.getUr_id();
			} catch (Exception e) {
				logger.error(e.getMessage());
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
			}
		}
/*处理逻辑 end*/
/*返回数据 begin*/
		appresult.setData(rs);/*返回urid*/
		rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
		out.print(rs);
		out.close();
/*返回数据 end*/
		return null;
	}


	/*绑定第三方
    *Leoli 2017.11.15
    * */
	@IgnoreAuth
	@RequestMapping(value = "bindingthird", method ={RequestMethod.POST, RequestMethod.GET}, produces ={ "application/json;charset=UTF-8" })
	public String bindingthird(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult=new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);
		appresult.setMessage("绑定成功");
		String rs = "";
		String phone=request.getParameter("phone");
		String code=request.getParameter("code");
		String token=request.getParameter("token");
		String unionid=request.getParameter("unionid");
		String mode=request.getParameter("mode");
		String source=request.getParameter("source");
		String version=request.getParameter("version");
		String namenick=request.getParameter("namenick");
		String usertype=request.getParameter("usertype");
		String password=request.getParameter("password");
		if (phone!=null){phone=phone.trim();};
		//if (password!=null){password=password.trim();};
		Boolean flag_pass=true;
/*检查参数 begin*/
		if (flag_pass==true&&CommonUtil.isEmpty(phone)==true) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("手机号码不能为空");
			flag_pass=false;
		};
		if (flag_pass==true&&CommonUtil.isEmpty(usertype)==true) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("[usertype]用户类型不能为空");
			flag_pass=false;
		};
/*
		if (flag_pass==true&&CommonUtil.isEmpty(type)==true) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("验证类别不能为空");
			flag_pass=false;
		};
*/
		if (flag_pass==true&&CommonUtil.isEmpty(mode)==true) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("mode不能为空");
			flag_pass=false;
		};
		if (flag_pass==true&&CommonUtil.isEmpty(code)==true) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("验证码不能为空");
			flag_pass=false;
		};

		if (flag_pass==true&&CommonUtil.isEmpty(token)==true) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("Token不能为空");
			flag_pass=false;
		};
		if (flag_pass==true&&token!=null&&token.length()<32) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("Token不能少于32位");
			appresult.setErrorcode("4");
			flag_pass=false;
		};

		if (flag_pass==true&&CommonUtil.isEmpty(unionid)==true) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("[unionid]不能为空");
			flag_pass=false;
		};

		if (flag_pass==true&&CommonUtil.isEmpty(source)==true) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("[source]来源类型不能为空");
			flag_pass=false;
		};
		if (flag_pass==true&&CommonUtil.isEmpty(version)==true) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("[version]版本号不能为空");
			flag_pass=false;
		};

		if (flag_pass==true&&CommonUtil.isEmpty(namenick)==true) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("[namenick]用户呢称不能为空");

			flag_pass=false;
		};


 /*检验重复*/
		if (flag_pass==true) {
			int ic=userService.getCheckDouble(0,null,null,null,token);
			if (ic>0){
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage("当前token值【"+token+"】已经存在");
				appresult.setErrorcode("4");
				flag_pass=false;
			};
		};

/* 检查不同手机号的相同openid*/
		Long bdid =null;
        if (flag_pass==true) { /*获取第三方账号*/
			Map<String,Object> mp=userService.getThirdAccount(unionid,Integer.parseInt(mode.substring(0,1)));
            if ((mp!=null)&&(mp.get("ur_phone")!=null)&&(CommonUtil.isEmpty(mp.get("ur_phone").toString())==false)&&(!phone.equals(mp.get("ur_phone")))){
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage("已经在{"+mp.get("ur_phone")+"}手机号绑定,请先解绑");
                flag_pass=false;
            };
			if (mp!=null){bdid= (Long) mp.get("ur_id");};
			if (bdid==null){bdid = userService.getUserId(phone,2);};/*获取手机号码账号*/
        };

/*判断是否同端*/
		Integer diut=userService.getUserType(phone,2);
		if (flag_pass == true &&bdid!=null&&("1".equals(usertype)||"2".equals(usertype))&&diut!=4&&diut!=Integer.parseInt(usertype)){
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			if (diut==1){appresult.setMessage("此账号是设计师");};
			if (diut==2){appresult.setMessage("此账号是业务员");};
			flag_pass=false;
		};

/*查邀请码*/
		String invitationcode = request.getParameter("invitationcode");
		if (flag_pass == true &&"1".equals(usertype)&&bdid==null) {/*判断是否注册*/
			if (flag_pass == true && CommonUtil.isEmpty(invitationcode) == true) {
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage("邀请码不能为空");
				flag_pass = false;
			}
			if (flag_pass == true) {
				String randomcode = "888888".toLowerCase();  //第一个邀请码
				String randomcode2 = "";
				Long invuserid = userService.getSys_userinvitecode(invitationcode.toLowerCase());
				if (invuserid!=null) {randomcode2 =invitationcode.toLowerCase();};
				if (!invitationcode.toLowerCase().equals(randomcode2.toLowerCase()) && !invitationcode.toLowerCase().equals(randomcode.toLowerCase())) {
					appresult.setStatus(Constants.RESULT_STATUS_FAIL);
					appresult.setMessage("邀请码错误");
					flag_pass = false;
				}
			};
		};

/*查验证码*/
		Integer smsid=0;
		if (flag_pass==true) {
			String rut=smsService.saveSmsVerifyResult(phone,3,code,true);
			if (!"1".equals(rut.substring(0,1))){
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage(rut);
				flag_pass=false;
			}
			else{
				smsid= Integer.valueOf(rut.substring(2,rut.length()));
			};

		};


/*检查参数 end*/
/*处理逻辑 begin*/
	//	String aa=filterEmoji(URLDecoder.decode(namenick,"UTF-8"));

		UserFrontLogin ul=new UserFrontLogin();
		if (flag_pass==true) {
			try {
				Sys_User userbind  =new Sys_User();
				userbind.setUr_login_port(source);
				userbind.setUr_login_ver(version);
				userbind.setUr_phone(phone);
				userbind.setUr_usertype(Byte.valueOf(usertype));
				userbind.setUr_token(token);
				if ("1".equals(mode.substring(0,1))){userbind.setUr_openid_wx(unionid);};/*微信*/
				if ("2".equals(mode.substring(0,1))){userbind.setUr_openid_qq(unionid);};/*QQ*/
				if ("3".equals(mode.substring(0,1))){userbind.setUr_openid_mini(unionid);};/*小程序*/
				if (bdid!=null){/*绑定*/
					userbind.setUr_id(bdid);
					userService.updatesave(userbind,null,null);/*绑定第三方*/
				}else{/*注册*/
					namenick=EmojiFilter.filterEmoji(namenick);
					userbind.setUr_register_port(source);
					userbind.setUr_register_ver(version);
					userbind.setUr_namenick(namenick);/*用户呢称,过滤表情字符*/
					userbind.setUr_register_date(new Date());
					if (CommonUtil.isEmpty(password)==true){password=unionid;};
					userbind.setUr_password(CommonUtil.pwdmd5t2(password));
					userbind.setUr_invitecode(invitationcode);
					String c = "";
					if ("1".equals(usertype)){
						Boolean bl = true;
						while (bl==true){
							c = InviteCodeUtils.generateInviteCode();
							List<Sys_User> list = userService.getSysuserinvitecode(c);
							if (list.size()>0){
								bl =true;
							}else {
								bl=false;
							}
						}
						userbind.setUr_personcode(c);
					}

					String companyname = request.getParameter("companyname");
					String brand = request.getParameter("brand");
					String workage = request.getParameter("workage");
					String major = request.getParameter("major");
					userbind.setUr_namefull(namenick);
					Sys_User_Ext ue=null;
					if (CommonUtil.isEmpty(companyname)==false ||CommonUtil.isEmpty(brand)==false
							||CommonUtil.isEmpty(workage)==false||CommonUtil.isEmpty(major)==false) {
						ue = new Sys_User_Ext();
						ue.setUe_companyname(companyname);
						ue.setUe_companybrand(brand);
						ue.setUe_personworkage(workage);
						ue.setUe_personmajor(major);
					};

					userService.addregister(userbind,ue);
					bdid=userbind.getUr_id();
				};
/*直接登录 begin*/
				if ("1".equals(mode.substring(0,1))){mode="5";};/*微信*/
				if ("2".equals(mode.substring(0,1))){mode="6";};/*QQ*/
				if ("3".equals(mode.substring(0,1))){mode="7";};/*QQ*/
				SysV_UserFull user = userService.selectLogin(unionid,null, Integer.parseInt(usertype),Integer.parseInt(mode));
				if (user != null && user.getUr_stopflag()!=null && user.getUr_stopflag() == true) {
					appresult.setStatus(Constants.RESULT_STATUS_FAIL);
					appresult.setMessage("此账号已停用，请与客服联系");
					user = null;
				};
				if (user != null) {
					ul.setLogintoken(userService.CreateLoginToken(Constants.REDIS_LOGIN_FRONT,user.getUr_id()));/*建立token值*/
					user.setUr_login_imei(request.getParameter("imei"));
					ul.setConfig(saveloginmsg(user,user.getUr_phone(),user.getUr_password(),ul.getLogintoken()));/*确认后，保存配置*/
					user.setUr_password(null);/*置为空，不返回*/
					ul.setUser(user);

					if (smsid!=0){/*注册码确定*/
						Sys_SmsVerify sms=new Sys_SmsVerify();
						sms.setSv_id(smsid);
						sms.setSv_status((byte) 1);
						sms.setSv_verifytime(new Date());
						smsService.verifyupdate(sms);
					};

				};
			} catch (Exception e) {
				logger.error(e.getMessage());
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage(e.getMessage());
			}
		}
/*处理逻辑 end*/
/*返回数据 begin*/
		appresult.setData(ul);/*返回urid*/
		rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
		out.print(rs);
		out.close();
/*返回数据 end*/
		return null;
	}


/*
* 前端登录接口
* Leoli 2017.10.11
* */

    @IgnoreAuth
	@RequestMapping(value = "login", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
	public String login(HttpServletRequest request, HttpServletResponse response) throws Exception {
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE, PUT");
		response.setHeader("Access-Control-Max-Age", "3600");
		response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept,logintoken");
		response.setHeader("Access-Control-Allow-Credentials","true"); //是否允许浏览器携带用户身份信息（cookie）


		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult=new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);
		appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
		String rs = "";

		String phone=request.getParameter("phone");
		String password=request.getParameter("password");
		String source=request.getParameter("source");
		String version=request.getParameter("version");
		String usertype=request.getParameter("usertype");

		Boolean flag_pass=true;/*检查内容是否能过*/

		if (CommonUtil.isEmpty(usertype)==true){usertype="1";};

		/*检查参数 begin*/
		if (CommonUtil.isEmpty(phone)==true&&flag_pass==true) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("手机号码不能为空");
			flag_pass=false;
		};
		if (flag_pass==true&&CommonUtil.isEmpty(usertype)==true) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("[usertype]用户类型不能为空");
			flag_pass=false;
		};

		if (CommonUtil.isEmpty(password)==true&&flag_pass==true) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("密码不能为空");
			flag_pass=false;
		};
		if (CommonUtil.isEmpty(source)==true&&flag_pass==true) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("[source]来源类型不能为空");
			flag_pass=false;
		};
		if (CommonUtil.isEmpty(version)==true&&flag_pass==true) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("[version]版本号不能为空");
			flag_pass=false;
		};

		Long userid=userService.getUserId(phone,2);
		if (flag_pass==true&&userid==null) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("无此用户");
			flag_pass=false;
		};

		/*检查参数 end*/
		/*处理逻辑 begin*/
		UserFrontLogin ul=new UserFrontLogin();
		if (flag_pass==true) {

			try {
				/*检查注册日期 begin*/
				SysV_UserFull ufpwd=userService.getUser_FullDetail(userid,15);
				if (ufpwd.getUr_register_date()!=null&&(ufpwd.getUr_register_date().getTime()/1000)>1519375500){ /*2.23号之后，用二次加密*/
					password=CommonUtil.pwdmd5t2(password);
				}else{
					password=DigestUtils.md5Hex(password);/*一次加密*/
				};
				/*检查注册日期 end*/

				SysV_UserFull user=new SysV_UserFull();
				user = userService.selectLogin(phone,password, Integer.parseInt(usertype),2);
				if (user == null) {
					appresult.setStatus(Constants.RESULT_STATUS_FAIL);
					appresult.setMessage("用户或密码不正确");
				}
				;
				if (user != null && user.getUr_stopflag()!=null && user.getUr_stopflag() == true) {
					appresult.setStatus(Constants.RESULT_STATUS_FAIL);
					appresult.setMessage("此账号已停用，请与客服联系");
					user = null;
				};

				if (user != null) {
					ul.setLogintoken(userService.CreateLoginToken(Constants.REDIS_LOGIN_FRONT,user.getUr_id()));/*建立token值*/
					user.setUr_login_port(source);
					user.setUr_login_ver(version);
					user.setUr_login_imei(request.getParameter("imei"));
					ul.setConfig(saveloginmsg(user,phone,password,ul.getLogintoken()));/*确认后，保存配置*/
					ul.setUser(user);
				};
			} catch (Exception e) {
				logger.error(e.getMessage());
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
			}
		}

		/*处理逻辑 end*/
		/*返回数据 begin*/
		appresult.setData(ul);
		rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));/*处理数据格式*/
		out.print(rs);
		out.close();
		/*返回数据 end*/
		return null;
	}


	/*
    * 第三方登录接口
    * Leoli 2017.10.11
    * type 1:微信，2:QQ
    * */
	@IgnoreAuth
	@RequestMapping(value = "loginthird", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
	public String loginthird(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult=new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);
		appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
		String rs = "";

		String unionid=request.getParameter("unionid");
		String mode=request.getParameter("mode");
		String source=request.getParameter("source");
		String version=request.getParameter("version");
		String usertype=request.getParameter("usertype");

		Boolean flag_pass=true;/*检查内容是否能过*/
		/*检查参数 begin*/

		if (CommonUtil.isEmpty(unionid)==true&&flag_pass==true) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("[unionid]不能为空");
			flag_pass=false;
		};

		if (flag_pass==true&&CommonUtil.isEmpty(usertype)==true) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("[usertype]用户类型不能为空");
			flag_pass=false;
		};

		if (CommonUtil.isEmpty(mode)==true&&flag_pass==true) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("[mode]不能为空");
			flag_pass=false;
		};
		if (CommonUtil.isEmpty(source)==true&&flag_pass==true) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("[source]来源类型不能为空");
			flag_pass=false;
		};
		if (CommonUtil.isEmpty(version)==true&&flag_pass==true) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("[version]版本号不能为空");
			flag_pass=false;
		};

		/*检查参数 end*/
		/*处理逻辑 begin*/
		UserFrontLogin ul=new UserFrontLogin();
		if (flag_pass==true) {
			try {
				SysV_UserFull user=new SysV_UserFull();
				if ("1".equals(mode.substring(0,1))){mode="5";};/*微信*/
				if ("2".equals(mode.substring(0,1))){mode="6";};/*QQ*/
				if ("3".equals(mode.substring(0,1))){mode="7";};/*QQ*/
				user = userService.selectLogin(unionid,null, Integer.parseInt(usertype),Integer.parseInt(mode));
				if (user == null) {
					appresult.setStatus(Constants.RESULT_STATUS_FAIL);
					appresult.setErrorcode("-2");
					appresult.setMessage("第三方还未绑定");
				};
				if (user != null && user.getUr_stopflag()!=null && user.getUr_stopflag() == true) {
					appresult.setStatus(Constants.RESULT_STATUS_FAIL);
					appresult.setMessage("此账号已停用，请与客服联系");
					appresult.setErrorcode("-1");
					user = null;
				};

				if (user != null) {
					ul.setLogintoken(userService.CreateLoginToken(Constants.REDIS_LOGIN_FRONT,user.getUr_id()));/*建立token值*/
					user.setUr_login_port(source);
					user.setUr_login_ver(version);
					user.setUr_login_imei(request.getParameter("imei"));
					ul.setConfig(saveloginmsg(user,user.getUr_phone(),user.getUr_password(),ul.getLogintoken()));/*确认后，保存配置*/
					user.setUr_password(null);/*置为空，不返回*/
					ul.setUser(user);
				};
			} catch (Exception e) {
				logger.error(e.getMessage());
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
			}
		}
		/*处理逻辑 end*/
		/*返回数据 begin*/
		appresult.setData(ul);
		rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));/*处理数据格式*/
		out.print(rs);
		out.close();
		/*返回数据 end*/
		return null;
	}


	/*
    * 隐式登录接口
    * Leoli 2017.12.08
    * */
	@IgnoreAuth
	@RequestMapping(value = "loginimpl", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
	public String loginimpl(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult=new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);
		appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
		String rs = "";

		String token=request.getParameter("token");
		String imei=request.getParameter("imei");

		String source=request.getParameter("source");
		String version=request.getParameter("version");
		String usertype=request.getParameter("usertype");

		Boolean flag_pass=true;/*检查内容是否能过*/
		/*检查参数 begin*/

		if (CommonUtil.isEmpty(token)==true&&flag_pass==true) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("[token]不能为空");
			flag_pass=false;
		};
		if (CommonUtil.isEmpty(imei)==true&&flag_pass==true) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("[imei]不能为空");
			flag_pass=false;
		};

		if (flag_pass==true&&CommonUtil.isEmpty(usertype)==true) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("[usertype]用户类型不能为空");
			flag_pass=false;
		};

		if (CommonUtil.isEmpty(source)==true&&flag_pass==true) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("[source]来源类型不能为空");
			flag_pass=false;
		};
		if (CommonUtil.isEmpty(version)==true&&flag_pass==true) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("[version]版本号不能为空");
			flag_pass=false;
		};

		/*检查参数 end*/
		/*处理逻辑 begin*/
		UserFrontLogin ul=new UserFrontLogin();
		if (flag_pass==true) {
			try {
				SysV_UserFull user=new SysV_UserFull();
				user = userService.selectLogin(token,imei, Integer.parseInt(usertype),9);
				if (user == null) {
					appresult.setStatus(Constants.RESULT_STATUS_FAIL);
					appresult.setMessage("用户或密码不正确");
				};
				if (user != null && user.getUr_stopflag()!=null && user.getUr_stopflag() == true) {
					appresult.setStatus(Constants.RESULT_STATUS_FAIL);
					appresult.setMessage("此账号已停用，请与客服联系");
					user = null;
				};

				if (user != null) {
					ul.setLogintoken(userService.CreateLoginToken(Constants.REDIS_LOGIN_FRONT,user.getUr_id()));/*建立token值*/
					user.setUr_login_port(source);
					user.setUr_login_ver(version);
					user.setUr_login_imei(request.getParameter("imei"));
					ul.setConfig(saveloginmsg(user,user.getUr_phone(),user.getUr_password(),ul.getLogintoken()));/*确认后，保存配置*/
					user.setUr_password(null);/*置为空，不返回*/
					ul.setUser(user);
				};
			} catch (Exception e) {
				logger.error(e.getMessage());
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
			}
		}
		/*处理逻辑 end*/
		/*返回数据 begin*/
		appresult.setData(ul);
		rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));/*处理数据格式*/
		out.print(rs);
		out.close();
		/*返回数据 end*/
		return null;
	}


/*
APP确认扫描登录
leoli
2017.10.26
logintoken 登录md5值
usertoken 用户md5值
* */
	@IgnoreAuth
	@SuppressWarnings({ "unused", "null" })
	@RequestMapping(value = "savescanlogin", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
	public String savescanlogin(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult=new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);
		appresult.setMessage("登录成功");
		String rs = "";
		String scantoken=request.getParameter("scantoken");
		if (scantoken==null){scantoken=request.getParameter("logintoken");};
		String usertoken=request.getParameter("usertoken");
		Boolean flag_pass=true;

/*检查参数 begin*/
		if (flag_pass==true&&(CommonUtil.isEmpty(scantoken)==true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("登录scantoken参数不能为空");
			flag_pass = false;
		};
		if (flag_pass==true&&(CommonUtil.isEmpty(usertoken)==true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("用户token参数不能为空");
			flag_pass = false;
		};

/*检查参数 end*/
/*处理数据 begin*/
		if (flag_pass==true) {
			try {
				String skey="scanlogin."+scantoken;/*key值*/
				redisService.saveStringValue(skey,usertoken,60*20);/*保留20分钟*/
			} catch (Exception e) {
				logger.error(e.getMessage());
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
			}
		}
/*处理数据 end*/
/*返回数据 begin*/
		rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
		out.print(rs);
		out.close();
/*返回数据 end*/
		return null;
	}

/*
WEB扫描登录
leoli
2017.10.26
logintoken 登录md5值
* */
	@IgnoreAuth
	@SuppressWarnings({ "unused", "null" })
	@RequestMapping(value = "getscanlogin", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
	public String getscanlogin(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult=new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);
		appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
		String rs = "";
		String scantoken=request.getParameter("scantoken");
		if (scantoken==null){scantoken=request.getParameter("logintoken");};
		Boolean flag_pass=true;
		String usertype=request.getParameter("usertype");

/*检查参数 begin*/
		if (flag_pass==true&&(CommonUtil.isEmpty(scantoken)==true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("登录scantoken参数不能为空");
			flag_pass = false;
		};
		if (flag_pass==true&&CommonUtil.isEmpty(usertype)==true) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("[usertype]用户类型不能为空");
			flag_pass=false;
		};

/*检查参数 end*/
/*处理数据 begin*/
		UserFrontLogin ul=new UserFrontLogin();
		if (flag_pass==true) {
			try {
				String skey="scanlogin."+scantoken;/*key值*/
				String svalue=redisService.getStringValue(skey);
				if (svalue!=null){/*确认登录*/
					SysV_UserFull user=new SysV_UserFull();
					user = userService.selectLogin(svalue,"", Integer.parseInt(usertype),4);/*token登录*/
					if (user == null) {
						appresult.setStatus(Constants.RESULT_STATUS_FAIL);
						appresult.setMessage("用户或密码不正确");
					}
					;
					if (user != null && user.getUr_stopflag()!=null && user.getUr_stopflag() == true) {
						appresult.setStatus(Constants.RESULT_STATUS_FAIL);
						appresult.setMessage("此账号已停用，请与客服联系");
						user = null;
					};
					if (user != null) {
						ul.setLogintoken(userService.CreateLoginToken(Constants.REDIS_LOGIN_FRONT,user.getUr_id()));/*建立token值*/
						user.setUr_login_port("1.WEB");
						user.setUr_login_ver("1.0");
					//	user.setUr_login_imei(request.getParameter("imei"));
						ul.setConfig(saveloginmsg(user,user.getUr_phone(),user.getUr_password(),ul.getLogintoken()));/*确认后，保存配置*/
						user.setUr_password(null);/*置为空，不返回*/
						ul.setUser(user);
						redisService.deleteValue(skey);/*删除redis*/
					};
				}else{
					appresult.setStatus(Constants.RESULT_STATUS_FAIL);
					appresult.setMessage("APP端没确认登录,或已失效");
				};

			} catch (Exception e) {
				logger.error(e.getMessage());
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
			}
		}
/*处理数据 end*/
/*返回数据 begin*/
		appresult.setData(ul);
		rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
		out.print(rs);
		out.close();
/*返回数据 end*/
		return null;
	}


	/*
    * 短信登录
    * Leoli 2017.11.27
    *
    * */
	@IgnoreAuth
	@RequestMapping(value = "loginsms", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
	public String loginsms(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult=new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);
		appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
		String rs = "";

		String phone=request.getParameter("phone");
		String code=request.getParameter("code");
		String source=request.getParameter("source");
		String version=request.getParameter("version");
		String usertype=request.getParameter("usertype");

		Boolean flag_pass=true;/*检查内容是否能过*/
		/*检查参数 begin*/
		if (CommonUtil.isEmpty(phone)==true&&flag_pass==true) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("[phone]不能为空");
			flag_pass=false;
		};
		if (flag_pass==true&&CommonUtil.isEmpty(usertype)==true) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("[usertype]用户类型不能为空");
			flag_pass=false;
		};
		if (CommonUtil.isEmpty(code)==true&&flag_pass==true) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("[code]不能为空");
			flag_pass=false;
		};
		if (CommonUtil.isEmpty(source)==true&&flag_pass==true) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("[source]来源类型不能为空");
			flag_pass=false;
		};
		if (CommonUtil.isEmpty(version)==true&&flag_pass==true) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("[version]版本号不能为空");
			flag_pass=false;
		};


/*查验证码*/
		Integer smsid=0;
		if (flag_pass==true) {
			String rut=smsService.saveSmsVerifyResult(phone,4,code,true);
			if (!"1".equals(rut.substring(0,1))){
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage(rut);
				flag_pass=false;
			}else{
				smsid= Integer.valueOf(rut.substring(2,rut.length()));
			};
		};

		/*检查参数 end*/
		/*处理逻辑 begin*/
		UserFrontLogin ul=new UserFrontLogin();
		if (flag_pass==true) {
			try {
				SysV_UserFull user=userService.selectLogin(phone,null, Integer.parseInt(usertype),8);
				if (user == null) {
					appresult.setStatus(Constants.RESULT_STATUS_FAIL);
					appresult.setErrorcode("1");
					appresult.setMessage("此账号还未注册");
				};
				if (user != null && user.getUr_stopflag()!=null && user.getUr_stopflag() == true) {
					appresult.setStatus(Constants.RESULT_STATUS_FAIL);
					appresult.setMessage("此账号已停用，请与客服联系");
					user = null;
				};
				if (user != null) {
					ul.setLogintoken(userService.CreateLoginToken(Constants.REDIS_LOGIN_FRONT,user.getUr_id()));/*建立token值*/
					user.setUr_login_port(source);
					user.setUr_login_ver(version);
					user.setUr_login_imei(request.getParameter("imei"));
					ul.setConfig(saveloginmsg(user,user.getUr_phone(),user.getUr_password(),ul.getLogintoken()));/*确认后，保存配置*/
					user.setUr_password(null);/*置为空，不返回*/
					ul.setUser(user);

					if (smsid!=0){/*注册码确定*/
						Sys_SmsVerify sms=new Sys_SmsVerify();
						sms.setSv_id(smsid);
						sms.setSv_status((byte) 1);
						sms.setSv_verifytime(new Date());
						smsService.verifyupdate(sms);
					};

				};
			} catch (Exception e) {
				logger.error(e.getMessage());
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
			}
		}
		/*处理逻辑 end*/
		/*返回数据 begin*/
		appresult.setData(ul);
		rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));/*处理数据格式*/
		out.print(rs);
		out.close();
		/*返回数据 end*/
		return null;
	}


	/*
    * 设置支付密码
    * Leoli 2017.12.22
    *
    * */
	@RequestMapping(value = "savepaypwd", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
	public String savepaypwd(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult=new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);
		appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
		String rs = "";

		String phone=request.getParameter("phone");
		String code=request.getParameter("code");
		String password=request.getParameter("password");

		Boolean flag_pass=true;/*检查内容是否能过*/
		/*检查参数 begin*/
		if (CommonUtil.isEmpty(phone)==true&&flag_pass==true) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("[phone]不能为空");
			flag_pass=false;
		};
		if (CommonUtil.isEmpty(code)==true&&flag_pass==true) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("[code]不能为空");
			flag_pass=false;
		};
		if (flag_pass==true&&CommonUtil.isEmpty(password)==true) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("[password]用户类型不能为空");
			flag_pass=false;
		};

/*查userid*/
		Long userid=null;
		if (flag_pass==true) {
			userid = userService.getUserId(phone, 2);
			if (userid == null || userid == 0) {
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage("此账号还未注册");
				flag_pass = false;
			};
		};

/*查验证码*/
		Integer smsid=0;
		if (flag_pass==true) {
			String rut=smsService.saveSmsVerifyResult(phone,6,code,true);
			if (!"1".equals(rut.substring(0,1))){
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage(rut);
				flag_pass=false;
			}else{
				smsid= Integer.valueOf(rut.substring(2,rut.length()));
			};
		};


		/*检查参数 end*/
		/*处理逻辑 begin*/
		if (flag_pass==true) {
			try {
				Sys_User su=new Sys_User();
				su.setUr_id(userid);
				su.setUr_pwdpay(CommonUtil.pwdmd5t2(password));
				int iadd=userService.updatesave(su,null,null);
				if (iadd>0){
					if (smsid!=0){/*注册码确定*/
						Sys_SmsVerify sms=new Sys_SmsVerify();
						sms.setSv_id(smsid);
						sms.setSv_status((byte) 1);
						sms.setSv_verifytime(new Date());
						smsService.verifyupdate(sms);
					};
				}else {
					appresult.setStatus(Constants.RESULT_STATUS_FAIL);
					appresult.setMessage("创建支付密码失败");
					user = null;
				}

			} catch (Exception e) {
				logger.error(e.getMessage());
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
			}
		}
		/*处理逻辑 end*/
		/*返回数据 begin*/

		rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));/*处理数据格式*/
		out.print(rs);
		out.close();
		/*返回数据 end*/
		return null;
	}





	public Sys_User getUser() {
		return user;
	}

	public void setUser(Sys_User user) {
		this.user = user;
	}

	
}

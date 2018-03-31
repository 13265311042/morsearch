package com.morsearch.controller.back;


import com.morsearch.base.BaseController;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.ControllerUtils;
import com.morsearch.model.Sys_Manager;
import com.morsearch.service.ManagerService;
import com.morsearch.vo.AppResult;
import com.morsearch.vo.Login_Msg;
import com.morsearch.vo.UserBackLogin;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Random;


/**
 * 后台登录
 */
@Controller("BackLoginController")
@RequestMapping("/back/")
public class BackLoginController extends BaseController {
    @Resource
    private ManagerService managerService;

    //	private Sys_Manager manager;
/*后台登录接口*/
    @RequestMapping(value = "login", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String login(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        String userno = request.getParameter("userno");
        String password = request.getParameter("password");
        String verify = request.getParameter("verify");
        Boolean flag_pass = true;/*检查内容是否能过*/

		/*检查参数 begin*/
        if ((userno == null || "".equals(userno)) && flag_pass == true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("账号不能为空");
            flag_pass = false;
        }
        ;
        if ((password == null || "".equals(password)) && flag_pass == true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("密码不能为空");
            flag_pass = false;
        }
        ;
        if ((verify == null || "".equals(verify)) && flag_pass == true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("验证码不能为空");
            flag_pass = false;
        }
        ;

        String loginvv=redisService.getStringValue("loginback."+request.getSession().getId());
        if (flag_pass == true && (!verify.equals(loginvv))){
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setErrorcode("新:"+request.getSession().getId());
            appresult.setMessage("验证码不正确");
            flag_pass = false;
        };
		/*180秒*/
/*
        if (flag_pass==true&&(request.getSession().getAttribute("logincodetime")!=null)
			&& (System.currentTimeMillis()-(Long)(request.getSession().getAttribute("logincodetime")))/1000>180) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("验证码超时,请重新选择");
			flag_pass=false;
		};
*/


		/*检查参数 end*/
        /*处理逻辑 begin*/
        UserBackLogin ubl = new UserBackLogin();
        if (flag_pass == true) {
            //	Boolean ss=currentUser.isPermitted ("user:create");
            try {
                Sys_Manager manager = managerService.loginManger(userno,CommonUtil.pwdmd5t2(password));
			/**/
                if (manager == null) {
                    appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                    appresult.setMessage("用户或密码不正确");
                }
                ;
                if (manager != null && CommonUtil.read_byte(manager.getSm_status())==0) {
                    appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                    appresult.setMessage("此账号已停用，请与客服联系");
                    manager = null;
                };
                if (manager != null) {
                    ubl.setSm_id(manager.getSm_id());
                    ubl.setSm_no(manager.getSm_no());
                    ubl.setSm_name(manager.getSm_name());
                    ubl.setSm_email(manager.getSm_email());

                    ubl.setPath_download(commService.getSysConfigValue("path_download"));/*文件下载*/
                    ubl.setPath_image_normal(commService.getSysConfigValue("path_image_normal"));/*源图片路径*/
                    ubl.setPath_image_small(commService.getSysConfigValue("path_image_small"));/*小图片路径*/

                    request.getSession().setAttribute(Constants.SESSION_MANAGER, manager);
                    request.getSession().removeAttribute("logincodevalue");
                    request.getSession().removeAttribute("logincodetime");
                    manager.setSm_password(null);
/*
        UsernamePasswordToken token = new UsernamePasswordToken(username,CommonUtil.pwdmd5t2(password));
		token.setRememberMe(true);
		Subject currentUser = SecurityUtils.getSubject();
		currentUser.login(token);
*/

/*保存用户值到session begin*/
                    Login_Msg lm=new Login_Msg();
                    lm.setUserno(manager.getSm_no());/* 登录账号*/
                    lm.setUsername(manager.getSm_name());/* 登录名称*/
                    lm.setUserjob("");/* 登录职位*/
                    lm.setSessionid(request.getSession().getId()); /*线程*/
                    lm.setLogintype(Constants.LOGIN_TYPE_BACK);/* 表示1表示前端，2前端登录*/
                    lm.setLogindate(new Date());/*日期*/
                    redisService.saveMapRow(Constants.REDIS_LOGIN_BACK,manager.getSm_id()+"",gson.toJson(lm));

/*保存用户值到session end*/

                }
                ;

            } catch (Exception e) {
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
            //	return "login";
        }
        ;
		/*处理逻辑 end*/
		/*返回数据 begin*/
        appresult.setData(ubl);
        rs = CommonUtil.datatype_convert(request, gson.toJson(appresult));/*处理数据格式*/
        out.print(rs);
        out.close();
		/*返回数据 end*/
        return null;

    }

    /*得到验证码*/
    @RequestMapping(value = "verify", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String verify(HttpServletRequest request, HttpServletResponse response) throws Exception {
/*
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Access-Control-Allow-Credentials","true");
*/
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";

        try {
            Random random = new Random();
            rs = ((int) (random.nextDouble() * (9999 - 1000 + 1)) + 1000) + "";// 获取4位随机数
            redisService.saveStringValue("loginback."+request.getSession().getId(),rs,120);
            appresult.setErrorcode(request.getSession().getId());

            request.getSession().setAttribute("logincodevalue", rs);
            request.getSession().setAttribute("logincodetime", System.currentTimeMillis());

        } catch (Exception e) {
            logger.error(e.getMessage());
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
        }
		/*处理逻辑 end*/
		/*返回数据 begin*/
        appresult.setData(rs);
        rs = CommonUtil.datatype_convert(request, gson.toJson(appresult));/*处理数据格式*/
        out.print(rs);
        out.close();
		/*返回数据 end*/
        return null;

    }


}

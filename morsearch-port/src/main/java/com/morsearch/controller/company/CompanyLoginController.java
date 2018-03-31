package com.morsearch.controller.company;

import com.morsearch.base.BaseController;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.ControllerUtils;
import com.morsearch.interceptor.IgnoreAuth;
import com.morsearch.model.SysV_UserFull;
import com.morsearch.model.Sys_Manager;
import com.morsearch.model.Sys_User;
import com.morsearch.vo.AppResult;
import com.morsearch.vo.Login_Msg;
import com.morsearch.vo.UserFrontLogin;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Random;

/**
 * Created by ywh on 2017-12-15.
 */
@Controller("CompanyLoginController")
@RequestMapping("/company/")
public class CompanyLoginController extends BaseController {
    /**
     * 登录
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @IgnoreAuth /*不验证权限*/
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "loginuser", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String loginuser(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_ADD_SUCC);
        String rs = "";
        String userno = request.getParameter("userno");
        String password = request.getParameter("password");
        String verify = request.getParameter("verify");
        String sid = request.getParameter("sid");
        Boolean flag_pass = true;/*检查内容是否能过*/

		/*检查参数 begin*/
        if (CommonUtil.isEmpty(sid)==true && flag_pass == true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("[sid]不能为空");
            flag_pass = false;
        }
        ;
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
        };

        if (flag_pass == true && (!verify.equals(redisService.getStringValue("logincrm."+sid)))){
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("验证码不正确");
            flag_pass = false;
        } ;

		/*检查参数 end*/
        /*处理逻辑 begin*/
        UserFrontLogin ul=new UserFrontLogin();
        if (flag_pass == true) {
            try {

                SysV_UserFull user=new SysV_UserFull();
                user = userService.selectLogin(userno,CommonUtil.pwdmd5t2(password),3,1);
                if (user == null) {
                    appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                    appresult.setMessage("用户或密码不正确");
                }
                ;
                if (user != null && user.getUr_stopflag() != null && user.getUr_stopflag() == true) {
                    appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                    appresult.setMessage("此账号已停用，请与客服联系");
                    user = null;
                }
                ;
                if (user != null) {
                    ul.setUser(user);
                    ul.setLogintoken(userService.CreateLoginToken(Constants.REDIS_LOGIN_FRONT,user.getUr_id()));/*建立token值*/

                    Login_Msg lm=new Login_Msg();
                    lm.setUserno(user.getUr_phone());/* 登录账号*/
                    lm.setUsername(user.getUr_namenick() );/* 登录名称*/
                    //lm.setUserjob(user.getUe_personjob());/* 登录职位*/
                    lm.setSessionid(request.getSession().getId()); /*线程*/
                    lm.setLogintype(Constants.LOGIN_TYPE_FRONT);/* 表示1表示前端，2前端登录*/
                    lm.setLoginsource(user.getUr_login_port());/* 登录来源*/
                    lm.setLoginversion(user.getUr_login_ver());/* 登录版本*/
                    lm.setLogintoken(ul.getLogintoken());
                    lm.setLogindate(new Date());/*日期*/
                    redisService.saveMapRow(Constants.REDIS_LOGIN_FRONT,user.getUr_id()+"",gson.toJson(lm));

/*保存用户值到session end*/
                };

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
        appresult.setData(ul);
        rs = CommonUtil.datatype_convert(request, gson.toJson(appresult));/*处理数据格式*/
        out.print(rs);
        out.close();
		/*返回数据 end*/
        return null;

    }

    /*得到验证码*/
    @IgnoreAuth
    @RequestMapping(value = "verifycrm", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/html; charset=utf-8")
    public String verifycrm(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        String sid = request.getParameter("sid");
        Boolean flag_pass = true;/*检查内容是否能过*/

		/*检查参数 begin*/
        if (CommonUtil.isEmpty(sid)==true && flag_pass == true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("[sid]不能为空");
            flag_pass = false;
        }
        ;

        if (flag_pass == true) {
            try {
                Random random = new Random();
                rs = ((int) (random.nextDouble() * (9999 - 1000 + 1)) + 1000) + "";// 获取4位随机数
                redisService.saveStringValue("logincrm." +sid, rs,720);
            } catch (Exception e) {
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
            }
        };
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
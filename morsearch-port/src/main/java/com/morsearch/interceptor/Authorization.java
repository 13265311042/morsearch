package com.morsearch.interceptor;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.ControllerUtils;
import com.morsearch.service.RedisService;
import com.morsearch.vo.ApiCustomException;
import com.morsearch.vo.AppResult;
import com.morsearch.vo.Login_Msg;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * Created by leoli on 2018/3/13.
 * 验证拦截器
 */
public class Authorization extends HandlerInterceptorAdapter {
    @Autowired
    private RedisService redisService;

  //  public static final String LOGIN_USER_KEY = "loginuserkey";
    private Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
    private Logger logger = Logger.getLogger(getClass());

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE, PUT");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept,logintoken");
        response.setHeader("Access-Control-Allow-Credentials","true"); //是否允许浏览器携带用户身份信息（cookie）

        IgnoreAuth annotation;
    //    return true;
     //   String token11 = request.getHeader(Constants.LOGIN_TOKEN_KEY);/*从header中获取token*/
        if (handler instanceof HandlerMethod) {
            annotation = ((HandlerMethod) handler).getMethodAnnotation(IgnoreAuth.class);
        } else {
            return true;
        }
        //如果有@IgnoreAuth注解，则不验证token
        if (annotation != null) {
            return true;
        }

        String token = request.getHeader(Constants.LOGIN_TOKEN_KEY);/*从header中获取token*/
        if (StringUtils.isBlank(token)) {/*如果header中不存在token，则从参数中获取token*/
            token = request.getParameter(Constants.LOGIN_TOKEN_KEY);
        }

        if (StringUtils.isBlank(token)) {/*如果header中不存在token，则从参数中获取token*/
            token = request.getHeader("access-control-request-headers");
            if (token!=null&&token.length()>=42){token=token.substring(10);};
        }
        //token为空
        if (StringUtils.isBlank(token)) {
            CommonUtil.getApiMsgFail(request,response,"请先登录","401");
            return false;
        }


        Login_Msg logintoken=null;
        String rdt=redisService.getMapRow(Constants.LOGIN_TOKEN_KEY,token);
        if (rdt!=null&&!"".equals(rdt)) {logintoken = gson.fromJson(rdt,Login_Msg.class);};
        if (logintoken == null || logintoken.getTime_expire()< System.currentTimeMillis()) {
            CommonUtil.getApiMsgFail(request,response,"token失效，请重新登录","401");
            return false;
        }
        return true;

    }





    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
//        modelAndView.addObject("var", "测试postHandle");
        super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.print("xxx");
        super.afterCompletion(request, response, handler, ex);
    }


}

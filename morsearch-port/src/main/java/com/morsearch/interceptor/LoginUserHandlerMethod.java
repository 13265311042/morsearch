package com.morsearch.interceptor;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.service.RedisService;
import com.morsearch.service.UserService;
import com.morsearch.vo.Login_Msg;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

/**
 * 有@LoginUser注解的方法参数，注入当前登录用户
 *
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-03-23 22:02
 */
public class LoginUserHandlerMethod implements HandlerMethodArgumentResolver {
    @Autowired
    private RedisService redisService;
    private Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();

    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        return parameter.getParameterType().isAssignableFrom(Login_Msg.class) && parameter.hasParameterAnnotation(LoginUser.class);
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer container,
                                  NativeWebRequest request, WebDataBinderFactory factory) throws Exception {
        String token = request.getHeader("logintoken");
        //如果header中不存在token，则从参数中获取token
        if (StringUtils.isBlank(token)) {token = request.getParameter("logintoken");}
        //获取用户信息
        Login_Msg logintoken=null;
        String rdt=redisService.getMapRow(Constants.LOGIN_TOKEN_KEY,token);
        if (rdt!=null&&!"".equals(rdt)) {logintoken = gson.fromJson(rdt,Login_Msg.class);};
        return logintoken;
    }

}

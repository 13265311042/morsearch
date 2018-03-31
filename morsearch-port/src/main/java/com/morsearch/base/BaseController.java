package com.morsearch.base;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.morsearch.model.Sys_User;
import com.morsearch.service.*;
import org.apache.log4j.Logger;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class BaseController {
    protected HttpServletResponse response;
    protected HttpServletRequest request;
    protected Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
    protected Logger logger = Logger.getLogger(getClass());
    //	protected String base_datatype;/*数据格式 json,xml,jsonp*/
    //protected String pageindex;/*页面序号*/
    //protected String pagesize;/*页面数量*/
//	protected int pagecount;/*记录总数*/
    protected int ichangecount;/*改变数量，用于获取新增，修改，删除的记录数量*/
    protected HttpSession session;

    @ModelAttribute
    public void setReqAndRes(HttpServletRequest request, HttpServletResponse response) {
        this.request = request;
        this.response = response;
    }

    //1 获取保存在Session中的用户对象
    protected Sys_User getSessionUser(HttpServletRequest request) {
        return (Sys_User) request.getSession().getAttribute("users");
    }

    //2将用户对象保存到Session中
    protected void setSessionUser(HttpServletRequest request, Sys_User user) {
        request.getSession().setAttribute("users", user);
    }

    //②将用户对象从Session中  移除
    protected void removeSessionUser(HttpServletRequest request) {
        request.getSession().removeAttribute("users");
    }

    //3 获取基于应用程序的url绝对路径
    public final String getBaseUrl(HttpServletRequest request, String url) {
        Assert.hasLength(url, "url不能为空");
        Assert.isTrue(url.startsWith("/"), "必须以/打头");
        return request.getContextPath() + url;
    }

    //4 获取基于应用程序的url绝对路径
    public String getContextUrl() {
        StringBuffer url = this.request.getRequestURL();
        String contextUrl = url.delete(url.length() - this.request.getRequestURI().length(), url.length()).toString();
        return contextUrl;
    }


    @Resource
    protected UserService userService;

    @Resource
    protected CommService commService;

    @Resource
    protected MongoService mongoService;

    @Resource
    protected SmsService smsService;

    @Resource
    protected MessageService messageService;
    @Resource
    protected RedisService redisService;


}

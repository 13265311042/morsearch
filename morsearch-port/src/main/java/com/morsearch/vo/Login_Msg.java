package com.morsearch.vo;

import com.morsearch.common.constant.Constants;

import java.util.Date;

/**
 * 登录存储信息
 * leoli
 * 2018.02.13
 */
public class Login_Msg {
    private String logintoken;/*Token*/
    private Long userid;/*登录ID*/
    private String userno;/*登录账号*/
    private String username;/*登录名称*/
    private String userjob;/**//* 登录职位*/
    private String loginsource;/* 登录来源*/
    private String logintype;/*登录类别 表示1表示前端，2前端登录*/
    private String loginversion;/* 登录版本*/
    private Date logindate;/*登录时间*/
    private String sessionid;/*s线程ID*/
    private Long time_expire;/*过期时间*/
    private Long time_update;/*更新时间*/


    public String getLogintoken() {
        return logintoken;
    }

    public void setLogintoken(String logintoken) {
        this.logintoken = logintoken;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getSessionid() {
        return sessionid;
    }

    public void setSessionid(String sessionid) {
        this.sessionid = sessionid;
    }

    public String getUserno() {
        return userno;
    }

    public void setUserno(String userno) {
        this.userno = userno;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserjob() {
        return userjob;
    }

    public void setUserjob(String userjob) {
        this.userjob = userjob;
    }

    public String getLoginsource() {
        return loginsource;
    }

    public void setLoginsource(String loginsource) {
        this.loginsource = loginsource;
    }

    public String getLogintype() {
        return logintype;
    }

    public void setLogintype(String logintype) {
        this.logintype = logintype;
    }

    public String getLoginversion() {
        return loginversion;
    }

    public void setLoginversion(String loginversion) {
        this.loginversion = loginversion;
    }

    public Date getLogindate() {
        return logindate;
    }

    public void setLogindate(Date logindate) {
        this.logindate = logindate;
    }

    public Long getTime_expire() {
        return time_expire;
    }

    public void setTime_expire(Long time_expire) {
        this.time_expire = time_expire;
    }

    public Long getTime_update() {
        return time_update;
    }

    public void setTime_update(Long time_update) {
        this.time_update = time_update;
    }
}

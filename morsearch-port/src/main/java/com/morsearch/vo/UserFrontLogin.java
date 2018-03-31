package com.morsearch.vo;

import com.morsearch.model.SysV_UserFull;

/**
 * 登录返回资料
 */
public class UserFrontLogin {
    private  SysV_UserFull user; /*用户*/
    private  UserConfig config; /*配置*/
    private  String  logintoken; /*登录令牌*/

    public SysV_UserFull getUser() {
        return user;
    }

    public void setUser(SysV_UserFull user) {
        this.user = user;
    }

    public UserConfig getConfig() {
        return config;
    }

    public void setConfig(UserConfig config) {
        this.config = config;
    }

    public String getLogintoken() {
        return logintoken;
    }

    public void setLogintoken(String logintoken) {
        this.logintoken = logintoken;
    }

}



package com.morsearch.vo;

import com.morsearch.model.SysV_UserFull;

/**
 * 用户表的意向客户接口处理
 * Created by leoli on 2017/10/13.
 */
public class UserCustomer {
    private static final long serialVersionUID = 1L;
    private SysV_UserFull userlist;/*用户列表*/;
    private Sys_WordList_list willcitylist;/*城市列表*/;
    private Base_LableList_list willtypelist;/*企业类型列表*/;
    private Base_LableList_list willmajorlist;/*专业名称*/;
    private Base_LableList_list willjoblist;/*客户职位*/;
    private Base_LableList_list willlevellist;/*客户级别*/;


    public SysV_UserFull getUserlist() {
        return userlist;
    }

    public void setUserlist(SysV_UserFull userlist) {
        this.userlist = userlist;
    }

    public Sys_WordList_list getWillcitylist() {
        return willcitylist;
    }

    public void setWillcitylist(Sys_WordList_list willcitylist) {
        this.willcitylist = willcitylist;
    }

    public Base_LableList_list getWilltypelist() {
        return willtypelist;
    }

    public void setWilltypelist(Base_LableList_list willtypelist) {
        this.willtypelist = willtypelist;
    }

    public Base_LableList_list getWillmajorlist() {
        return willmajorlist;
    }

    public void setWillmajorlist(Base_LableList_list willmajorlist) {
        this.willmajorlist = willmajorlist;
    }

    public Base_LableList_list getWilljoblist() {
        return willjoblist;
    }

    public void setWilljoblist(Base_LableList_list willjoblist) {
        this.willjoblist = willjoblist;
    }

    public Base_LableList_list getWilllevellist() {
        return willlevellist;
    }

    public void setWilllevellist(Base_LableList_list willlevellist) {
        this.willlevellist = willlevellist;
    }
}

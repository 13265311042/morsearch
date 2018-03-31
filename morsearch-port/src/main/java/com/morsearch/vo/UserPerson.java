package com.morsearch.vo;

import com.morsearch.model.Desig_Demand;
import com.morsearch.model.SysV_UserFull;

import java.util.Date;

/**
 *个人详情处理
 * Created by leoli on 2017/10/13.
 */
public class UserPerson {
    private SysV_UserFull userlist;/*用户列表*/;
    private Desig_Demand demand;

    private String ordernewno;
    private Date ordernewdate;
    private int collection;

    public int getCollection() {
        return collection;
    }

    public void setCollection(int collection) {
        this.collection = collection;
    }

    public Desig_Demand getDemand() {
        return demand;
    }

    public void setDemand(Desig_Demand demand) {
        this.demand = demand;
    }

    public SysV_UserFull getUserlist() {
        return userlist;
    }

    public void setUserlist(SysV_UserFull userlist) {
        this.userlist = userlist;
    }

    public String getOrdernewno() {
        return ordernewno;
    }

    public void setOrdernewno(String ordernewno) {
        this.ordernewno = ordernewno;
    }

    public Date getOrdernewdate() {
        return ordernewdate;
    }

    public void setOrdernewdate(Date ordernewdate) {
        this.ordernewdate = ordernewdate;
    }
}

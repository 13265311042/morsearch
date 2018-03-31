package com.morsearch.model;

import java.util.Date;

public class Award_Recharge_Count {
    private Long sc_id;

    private Long sc_activityid;

    private Integer sc_amount;

    private Integer sc_addintegral;

    private Integer sc_addamount;

    private Long sc_userid;

    private Date sc_createdate;

    public Long getSc_id() {
        return sc_id;
    }

    public void setSc_id(Long sc_id) {
        this.sc_id = sc_id;
    }

    public Long getSc_activityid() {
        return sc_activityid;
    }

    public void setSc_activityid(Long sc_activityid) {
        this.sc_activityid = sc_activityid;
    }

    public Integer getSc_amount() {
        return sc_amount;
    }

    public void setSc_amount(Integer sc_amount) {
        this.sc_amount = sc_amount;
    }

    public Integer getSc_addintegral() {
        return sc_addintegral;
    }

    public void setSc_addintegral(Integer sc_addintegral) {
        this.sc_addintegral = sc_addintegral;
    }

    public Integer getSc_addamount() {
        return sc_addamount;
    }

    public void setSc_addamount(Integer sc_addamount) {
        this.sc_addamount = sc_addamount;
    }

    public Long getSc_userid() {
        return sc_userid;
    }

    public void setSc_userid(Long sc_userid) {
        this.sc_userid = sc_userid;
    }

    public Date getSc_createdate() {
        return sc_createdate;
    }

    public void setSc_createdate(Date sc_createdate) {
        this.sc_createdate = sc_createdate;
    }
}
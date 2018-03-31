package com.morsearch.model;

import java.util.Date;

public class Award_Share_Count {
    private Long sc_id;

    private Long sc_activityid;

    private Long sc_share_userid;

    private Integer sc_share_award;

    private Long sc_receive_userid;

    private Integer sc_receive_award;

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

    public Long getSc_share_userid() {
        return sc_share_userid;
    }

    public void setSc_share_userid(Long sc_share_userid) {
        this.sc_share_userid = sc_share_userid;
    }

    public Integer getSc_share_award() {
        return sc_share_award;
    }

    public void setSc_share_award(Integer sc_share_award) {
        this.sc_share_award = sc_share_award;
    }

    public Long getSc_receive_userid() {
        return sc_receive_userid;
    }

    public void setSc_receive_userid(Long sc_receive_userid) {
        this.sc_receive_userid = sc_receive_userid;
    }

    public Integer getSc_receive_award() {
        return sc_receive_award;
    }

    public void setSc_receive_award(Integer sc_receive_award) {
        this.sc_receive_award = sc_receive_award;
    }

    public Date getSc_createdate() {
        return sc_createdate;
    }

    public void setSc_createdate(Date sc_createdate) {
        this.sc_createdate = sc_createdate;
    }
}
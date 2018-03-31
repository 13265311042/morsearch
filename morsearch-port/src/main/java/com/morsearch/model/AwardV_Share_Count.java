package com.morsearch.model;

import java.util.Date;

public class AwardV_Share_Count {
    private Long sc_id;

    private Long sc_activityid;

    private Long sc_share_userid;

    private Integer sc_share_award;

    private Long sc_receive_userid;

    private Integer sc_receive_award;

    private Date sc_createdate;

    private String share_name;

    private String share_phone;

    private String share_invitecode;

    private String receive_name;

    private String receive_phone;

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

    public String getShare_name() {
        return share_name;
    }

    public void setShare_name(String share_name) {
        this.share_name = share_name;
    }

    public String getShare_phone() {
        return share_phone;
    }

    public void setShare_phone(String share_phone) {
        this.share_phone = share_phone;
    }

    public String getShare_invitecode() {
        return share_invitecode;
    }

    public void setShare_invitecode(String share_invitecode) {
        this.share_invitecode = share_invitecode;
    }

    public String getReceive_name() {
        return receive_name;
    }

    public void setReceive_name(String receive_name) {
        this.receive_name = receive_name;
    }

    public String getReceive_phone() {
        return receive_phone;
    }

    public void setReceive_phone(String receive_phone) {
        this.receive_phone = receive_phone;
    }
}
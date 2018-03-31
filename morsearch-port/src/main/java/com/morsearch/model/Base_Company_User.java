package com.morsearch.model;

import java.util.Date;

public class Base_Company_User {
    private Long bcu_id;

    private Long bcu_userid;

    private Byte bcu_type;

    private Long bcu_listuserid;

    private Boolean bcu_confirm1;

    private Boolean bcu_confirm2;

    private Date bcu_createdate;

    private Date bcu_updatedate;

    public Long getBcu_id() {
        return bcu_id;
    }

    public void setBcu_id(Long bcu_id) {
        this.bcu_id = bcu_id;
    }

    public Long getBcu_userid() {
        return bcu_userid;
    }

    public void setBcu_userid(Long bcu_userid) {
        this.bcu_userid = bcu_userid;
    }

    public Byte getBcu_type() {
        return bcu_type;
    }

    public void setBcu_type(Byte bcu_type) {
        this.bcu_type = bcu_type;
    }

    public Long getBcu_listuserid() {
        return bcu_listuserid;
    }

    public void setBcu_listuserid(Long bcu_listuserid) {
        this.bcu_listuserid = bcu_listuserid;
    }

    public Boolean getBcu_confirm1() {
        return bcu_confirm1;
    }

    public void setBcu_confirm1(Boolean bcu_confirm1) {
        this.bcu_confirm1 = bcu_confirm1;
    }

    public Boolean getBcu_confirm2() {
        return bcu_confirm2;
    }

    public void setBcu_confirm2(Boolean bcu_confirm2) {
        this.bcu_confirm2 = bcu_confirm2;
    }

    public Date getBcu_createdate() {
        return bcu_createdate;
    }

    public void setBcu_createdate(Date bcu_createdate) {
        this.bcu_createdate = bcu_createdate;
    }

    public Date getBcu_updatedate() {
        return bcu_updatedate;
    }

    public void setBcu_updatedate(Date bcu_updatedate) {
        this.bcu_updatedate = bcu_updatedate;
    }
}
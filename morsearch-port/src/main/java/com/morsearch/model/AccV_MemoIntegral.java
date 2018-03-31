package com.morsearch.model;

import java.math.BigDecimal;
import java.util.Date;

public class AccV_MemoIntegral {
    private Long mi_id;

    private String mi_type;

    private Long mi_activityid;

    private String mi_activityname;

    private String mi_typesign;

    private String mi_sourceno;

    private Date mi_date;

    private BigDecimal mi_integral;

    private Long mi_accountid;

    private Long mi_createid;

    private String accountname;

    private String createname;

    public Long getMi_id() {
        return mi_id;
    }

    public void setMi_id(Long mi_id) {
        this.mi_id = mi_id;
    }

    public String getMi_type() {
        return mi_type;
    }

    public void setMi_type(String mi_type) {
        this.mi_type = mi_type;
    }

    public Long getMi_activityid() {
        return mi_activityid;
    }

    public void setMi_activityid(Long mi_activityid) {
        this.mi_activityid = mi_activityid;
    }

    public String getMi_activityname() {
        return mi_activityname;
    }

    public void setMi_activityname(String mi_activityname) {
        this.mi_activityname = mi_activityname;
    }

    public String getMi_typesign() {
        return mi_typesign;
    }

    public void setMi_typesign(String mi_typesign) {
        this.mi_typesign = mi_typesign;
    }

    public String getMi_sourceno() {
        return mi_sourceno;
    }

    public void setMi_sourceno(String mi_sourceno) {
        this.mi_sourceno = mi_sourceno;
    }

    public Date getMi_date() {
        return mi_date;
    }

    public void setMi_date(Date mi_date) {
        this.mi_date = mi_date;
    }

    public BigDecimal getMi_integral() {
        return mi_integral;
    }

    public void setMi_integral(BigDecimal mi_integral) {
        this.mi_integral = mi_integral;
    }

    public Long getMi_accountid() {
        return mi_accountid;
    }

    public void setMi_accountid(Long mi_accountid) {
        this.mi_accountid = mi_accountid;
    }

    public Long getMi_createid() {
        return mi_createid;
    }

    public void setMi_createid(Long mi_createid) {
        this.mi_createid = mi_createid;
    }

    public String getAccountname() {
        return accountname;
    }

    public void setAccountname(String accountname) {
        this.accountname = accountname;
    }

    public String getCreatename() {
        return createname;
    }

    public void setCreatename(String createname) {
        this.createname = createname;
    }
}
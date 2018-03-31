package com.morsearch.model;

import java.math.BigDecimal;
import java.util.Date;

public class Award_Evaluate_Count {
    private Long sc_id;

    private Long sc_activityid;

    private String sc_orderno;

    private Long sc_appraiseid;

    private BigDecimal sc_addintegral;

    private Boolean sc_isfirst;

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

    public String getSc_orderno() {
        return sc_orderno;
    }

    public void setSc_orderno(String sc_orderno) {
        this.sc_orderno = sc_orderno;
    }

    public Long getSc_appraiseid() {
        return sc_appraiseid;
    }

    public void setSc_appraiseid(Long sc_appraiseid) {
        this.sc_appraiseid = sc_appraiseid;
    }

    public BigDecimal getSc_addintegral() {
        return sc_addintegral;
    }

    public void setSc_addintegral(BigDecimal sc_addintegral) {
        this.sc_addintegral = sc_addintegral;
    }

    public Boolean getSc_isfirst() {
        return sc_isfirst;
    }

    public void setSc_isfirst(Boolean sc_isfirst) {
        this.sc_isfirst = sc_isfirst;
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
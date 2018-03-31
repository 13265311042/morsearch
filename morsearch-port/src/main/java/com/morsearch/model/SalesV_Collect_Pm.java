package com.morsearch.model;

import java.util.Date;

public class SalesV_Collect_Pm {
    private Long sm_id;

    private Long sm_archivesid;

    private Long sm_createid;

    private String sm_createno;

    private Date sm_createdate;

    private Date dateshort;

    private String pa_title;

    private Long pa_userid;

    private String pa_username;

    public Long getSm_id() {
        return sm_id;
    }

    public void setSm_id(Long sm_id) {
        this.sm_id = sm_id;
    }

    public Long getSm_archivesid() {
        return sm_archivesid;
    }

    public void setSm_archivesid(Long sm_archivesid) {
        this.sm_archivesid = sm_archivesid;
    }

    public Long getSm_createid() {
        return sm_createid;
    }

    public void setSm_createid(Long sm_createid) {
        this.sm_createid = sm_createid;
    }

    public String getSm_createno() {
        return sm_createno;
    }

    public void setSm_createno(String sm_createno) {
        this.sm_createno = sm_createno;
    }

    public Date getSm_createdate() {
        return sm_createdate;
    }

    public void setSm_createdate(Date sm_createdate) {
        this.sm_createdate = sm_createdate;
    }

    public Date getDateshort() {
        return dateshort;
    }

    public void setDateshort(Date dateshort) {
        this.dateshort = dateshort;
    }

    public String getPa_title() {
        return pa_title;
    }

    public void setPa_title(String pa_title) {
        this.pa_title = pa_title;
    }

    public Long getPa_userid() {
        return pa_userid;
    }

    public void setPa_userid(Long pa_userid) {
        this.pa_userid = pa_userid;
    }

    public String getPa_username() {
        return pa_username;
    }

    public void setPa_username(String pa_username) {
        this.pa_username = pa_username;
    }
}
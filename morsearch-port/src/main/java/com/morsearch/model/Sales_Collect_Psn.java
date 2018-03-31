package com.morsearch.model;

import java.util.Date;

public class Sales_Collect_Psn {
    private Long ss_id;

    private Long ss_designerid;

    private Long ss_createid;

    private String ss_createno;

    private Date ss_createdate;

    public Long getSs_id() {
        return ss_id;
    }

    public void setSs_id(Long ss_id) {
        this.ss_id = ss_id;
    }

    public Long getSs_designerid() {
        return ss_designerid;
    }

    public void setSs_designerid(Long ss_designerid) {
        this.ss_designerid = ss_designerid;
    }

    public Long getSs_createid() {
        return ss_createid;
    }

    public void setSs_createid(Long ss_createid) {
        this.ss_createid = ss_createid;
    }

    public String getSs_createno() {
        return ss_createno;
    }

    public void setSs_createno(String ss_createno) {
        this.ss_createno = ss_createno;
    }

    public Date getSs_createdate() {
        return ss_createdate;
    }

    public void setSs_createdate(Date ss_createdate) {
        this.ss_createdate = ss_createdate;
    }
}
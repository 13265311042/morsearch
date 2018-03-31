package com.morsearch.model;

import java.util.Date;

public class Msg_Order {
    private Long mo_id;

    private String mo_orderno;

    private Byte mo_orderstatus;

    private String mo_talkcontent;

    private String mo_title;

    private Boolean mo_flagread;

    private Long mo_desigid;

    private Long mo_salerid;

    private Date mo_createdate;

    public Long getMo_id() {
        return mo_id;
    }

    public void setMo_id(Long mo_id) {
        this.mo_id = mo_id;
    }

    public String getMo_orderno() {
        return mo_orderno;
    }

    public void setMo_orderno(String mo_orderno) {
        this.mo_orderno = mo_orderno;
    }

    public Byte getMo_orderstatus() {
        return mo_orderstatus;
    }

    public void setMo_orderstatus(Byte mo_orderstatus) {
        this.mo_orderstatus = mo_orderstatus;
    }

    public String getMo_talkcontent() {
        return mo_talkcontent;
    }

    public void setMo_talkcontent(String mo_talkcontent) {
        this.mo_talkcontent = mo_talkcontent;
    }

    public String getMo_title() {
        return mo_title;
    }

    public void setMo_title(String mo_title) {
        this.mo_title = mo_title;
    }

    public Boolean getMo_flagread() {
        return mo_flagread;
    }

    public void setMo_flagread(Boolean mo_flagread) {
        this.mo_flagread = mo_flagread;
    }

    public Long getMo_desigid() {
        return mo_desigid;
    }

    public void setMo_desigid(Long mo_desigid) {
        this.mo_desigid = mo_desigid;
    }

    public Long getMo_salerid() {
        return mo_salerid;
    }

    public void setMo_salerid(Long mo_salerid) {
        this.mo_salerid = mo_salerid;
    }

    public Date getMo_createdate() {
        return mo_createdate;
    }

    public void setMo_createdate(Date mo_createdate) {
        this.mo_createdate = mo_createdate;
    }
}
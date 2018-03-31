package com.morsearch.model;

import java.util.Date;

public class MsgV_Order_List {
    private Long mo_id;

    private String mo_orderno;

    private Byte mo_orderstatus;

    private String mo_talkcontent;

    private String mo_title;

    private Boolean mo_flagread;

    private Long mo_desigid;

    private Long mo_salerid;

    private Date mo_createdate;

    private String of_talkhead;

    private String of_talksign;

    private String of_coincode;

    private String of_coinname;

    private String of_coinimage;

    private String statusname;

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

    public String getOf_talkhead() {
        return of_talkhead;
    }

    public void setOf_talkhead(String of_talkhead) {
        this.of_talkhead = of_talkhead;
    }

    public String getOf_talksign() {
        return of_talksign;
    }

    public void setOf_talksign(String of_talksign) {
        this.of_talksign = of_talksign;
    }

    public String getOf_coincode() {
        return of_coincode;
    }

    public void setOf_coincode(String of_coincode) {
        this.of_coincode = of_coincode;
    }

    public String getOf_coinname() {
        return of_coinname;
    }

    public void setOf_coinname(String of_coinname) {
        this.of_coinname = of_coinname;
    }

    public String getOf_coinimage() {
        return of_coinimage;
    }

    public void setOf_coinimage(String of_coinimage) {
        this.of_coinimage = of_coinimage;
    }

    public String getStatusname() {
        return statusname;
    }

    public void setStatusname(String statusname) {
        this.statusname = statusname;
    }
}
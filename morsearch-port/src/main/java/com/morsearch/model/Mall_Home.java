package com.morsearch.model;

import java.util.Date;

public class Mall_Home {
    private Long mh_id;

    private Byte mh_type;

    private Long mh_goodid;

    private Integer mh_index;

    private String mh_remark;

    private Boolean mh_stopflag;

    private String mh_createno;

    private Date mh_createdate;

    private String mh_updateno;

    private Date mh_updatedate;

    public Long getMh_id() {
        return mh_id;
    }

    public void setMh_id(Long mh_id) {
        this.mh_id = mh_id;
    }

    public Byte getMh_type() {
        return mh_type;
    }

    public void setMh_type(Byte mh_type) {
        this.mh_type = mh_type;
    }

    public Long getMh_goodid() {
        return mh_goodid;
    }

    public void setMh_goodid(Long mh_goodid) {
        this.mh_goodid = mh_goodid;
    }

    public Integer getMh_index() {
        return mh_index;
    }

    public void setMh_index(Integer mh_index) {
        this.mh_index = mh_index;
    }

    public String getMh_remark() {
        return mh_remark;
    }

    public void setMh_remark(String mh_remark) {
        this.mh_remark = mh_remark;
    }

    public Boolean getMh_stopflag() {
        return mh_stopflag;
    }

    public void setMh_stopflag(Boolean mh_stopflag) {
        this.mh_stopflag = mh_stopflag;
    }

    public String getMh_createno() {
        return mh_createno;
    }

    public void setMh_createno(String mh_createno) {
        this.mh_createno = mh_createno;
    }

    public Date getMh_createdate() {
        return mh_createdate;
    }

    public void setMh_createdate(Date mh_createdate) {
        this.mh_createdate = mh_createdate;
    }

    public String getMh_updateno() {
        return mh_updateno;
    }

    public void setMh_updateno(String mh_updateno) {
        this.mh_updateno = mh_updateno;
    }

    public Date getMh_updatedate() {
        return mh_updatedate;
    }

    public void setMh_updatedate(Date mh_updatedate) {
        this.mh_updatedate = mh_updatedate;
    }
}
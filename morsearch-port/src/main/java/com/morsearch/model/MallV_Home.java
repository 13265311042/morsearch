package com.morsearch.model;

import java.math.BigDecimal;
import java.util.Date;

public class MallV_Home {
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

    private String mg_title;

    private String mg_subhead;

    private String mg_img1;

    private BigDecimal mg_price;

    private Byte mg_status;

    private String mg_statusname;

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

    public String getMg_title() {
        return mg_title;
    }

    public void setMg_title(String mg_title) {
        this.mg_title = mg_title;
    }

    public String getMg_subhead() {
        return mg_subhead;
    }

    public void setMg_subhead(String mg_subhead) {
        this.mg_subhead = mg_subhead;
    }

    public String getMg_img1() {
        return mg_img1;
    }

    public void setMg_img1(String mg_img1) {
        this.mg_img1 = mg_img1;
    }

    public BigDecimal getMg_price() {
        return mg_price;
    }

    public void setMg_price(BigDecimal mg_price) {
        this.mg_price = mg_price;
    }

    public Byte getMg_status() {
        return mg_status;
    }

    public void setMg_status(Byte mg_status) {
        this.mg_status = mg_status;
    }

    public String getMg_statusname() {
        return mg_statusname;
    }

    public void setMg_statusname(String mg_statusname) {
        this.mg_statusname = mg_statusname;
    }
}
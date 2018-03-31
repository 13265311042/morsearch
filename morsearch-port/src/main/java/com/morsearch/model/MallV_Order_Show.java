package com.morsearch.model;

import java.math.BigDecimal;
import java.util.Date;

public class MallV_Order_Show {
    private Long mod_id;

    private Long mod_goodsid;

    private String mod_goodtitle;

    private String mod_goodimage;

    private String mod_goodcolor;

    private String mod_goodmodel;

    private BigDecimal mod_price;

    private BigDecimal mod_qty;

    private BigDecimal mod_amount;

    private String mo_no;

    private Date mo_dateorder;

    private Long mo_userid;

    private String mo_usernick;

    private Byte mo_status;

    private String statusname;

    public Long getMod_id() {
        return mod_id;
    }

    public void setMod_id(Long mod_id) {
        this.mod_id = mod_id;
    }

    public Long getMod_goodsid() {
        return mod_goodsid;
    }

    public void setMod_goodsid(Long mod_goodsid) {
        this.mod_goodsid = mod_goodsid;
    }

    public String getMod_goodtitle() {
        return mod_goodtitle;
    }

    public void setMod_goodtitle(String mod_goodtitle) {
        this.mod_goodtitle = mod_goodtitle;
    }

    public String getMod_goodimage() {
        return mod_goodimage;
    }

    public void setMod_goodimage(String mod_goodimage) {
        this.mod_goodimage = mod_goodimage;
    }

    public String getMod_goodcolor() {
        return mod_goodcolor;
    }

    public void setMod_goodcolor(String mod_goodcolor) {
        this.mod_goodcolor = mod_goodcolor;
    }

    public String getMod_goodmodel() {
        return mod_goodmodel;
    }

    public void setMod_goodmodel(String mod_goodmodel) {
        this.mod_goodmodel = mod_goodmodel;
    }

    public BigDecimal getMod_price() {
        return mod_price;
    }

    public void setMod_price(BigDecimal mod_price) {
        this.mod_price = mod_price;
    }

    public BigDecimal getMod_qty() {
        return mod_qty;
    }

    public void setMod_qty(BigDecimal mod_qty) {
        this.mod_qty = mod_qty;
    }

    public BigDecimal getMod_amount() {
        return mod_amount;
    }

    public void setMod_amount(BigDecimal mod_amount) {
        this.mod_amount = mod_amount;
    }

    public String getMo_no() {
        return mo_no;
    }

    public void setMo_no(String mo_no) {
        this.mo_no = mo_no;
    }

    public Date getMo_dateorder() {
        return mo_dateorder;
    }

    public void setMo_dateorder(Date mo_dateorder) {
        this.mo_dateorder = mo_dateorder;
    }

    public Long getMo_userid() {
        return mo_userid;
    }

    public void setMo_userid(Long mo_userid) {
        this.mo_userid = mo_userid;
    }

    public String getMo_usernick() {
        return mo_usernick;
    }

    public void setMo_usernick(String mo_usernick) {
        this.mo_usernick = mo_usernick;
    }

    public Byte getMo_status() {
        return mo_status;
    }

    public void setMo_status(Byte mo_status) {
        this.mo_status = mo_status;
    }

    public String getStatusname() {
        return statusname;
    }

    public void setStatusname(String statusname) {
        this.statusname = statusname;
    }
}
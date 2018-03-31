package com.morsearch.model;

import java.math.BigDecimal;
import java.util.Date;

public class MallV_Goods_List {
    private Long mg_id;

    private String mg_title;

    private String mg_subhead;

    private String mg_img1;

    private BigDecimal mg_price;

    private BigDecimal mg_stockqty;

    private Long mg_createid;

    private Date mg_createdate;

    private Date mg_updatedate;

    private Byte mg_status;

    private String statusname;

    public Long getMg_id() {
        return mg_id;
    }

    public void setMg_id(Long mg_id) {
        this.mg_id = mg_id;
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

    public BigDecimal getMg_stockqty() {
        return mg_stockqty;
    }

    public void setMg_stockqty(BigDecimal mg_stockqty) {
        this.mg_stockqty = mg_stockqty;
    }

    public Long getMg_createid() {
        return mg_createid;
    }

    public void setMg_createid(Long mg_createid) {
        this.mg_createid = mg_createid;
    }

    public Date getMg_createdate() {
        return mg_createdate;
    }

    public void setMg_createdate(Date mg_createdate) {
        this.mg_createdate = mg_createdate;
    }

    public Date getMg_updatedate() {
        return mg_updatedate;
    }

    public void setMg_updatedate(Date mg_updatedate) {
        this.mg_updatedate = mg_updatedate;
    }

    public Byte getMg_status() {
        return mg_status;
    }

    public void setMg_status(Byte mg_status) {
        this.mg_status = mg_status;
    }

    public String getStatusname() {
        return statusname;
    }

    public void setStatusname(String statusname) {
        this.statusname = statusname;
    }
}
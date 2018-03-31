package com.morsearch.model;

import java.math.BigDecimal;

public class Mall_Order_Detail {
    private Long mod_id;

    private String mod_orderno;

    private Long mod_goodsid;

    private String mod_goodtitle;

    private String mod_goodimage;

    private String mod_goodcolor;

    private String mod_goodmodel;

    private BigDecimal mod_price;

    private BigDecimal mod_qty;

    private BigDecimal mod_amount;

    public Long getMod_id() {
        return mod_id;
    }

    public void setMod_id(Long mod_id) {
        this.mod_id = mod_id;
    }

    public String getMod_orderno() {
        return mod_orderno;
    }

    public void setMod_orderno(String mod_orderno) {
        this.mod_orderno = mod_orderno;
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
}
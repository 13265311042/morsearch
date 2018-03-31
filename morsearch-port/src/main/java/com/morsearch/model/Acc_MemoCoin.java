package com.morsearch.model;

import java.math.BigDecimal;
import java.util.Date;

public class Acc_MemoCoin {
    private Long orderid;

    private String orderno;

    private Date orderdate;

    private String ordertype;

    private String ordersign;

    private String ordertitle;

    private String ordercoincode;

    private String ordercoinname;

    private BigDecimal ordercoinqty;

    private BigDecimal ordercoinprice;

    private BigDecimal orderaccount;

    private String currency;

    private Long accountid;

    private Long createid;

    public Long getOrderid() {
        return orderid;
    }

    public void setOrderid(Long orderid) {
        this.orderid = orderid;
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno;
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    public String getOrdertype() {
        return ordertype;
    }

    public void setOrdertype(String ordertype) {
        this.ordertype = ordertype;
    }

    public String getOrdersign() {
        return ordersign;
    }

    public void setOrdersign(String ordersign) {
        this.ordersign = ordersign;
    }

    public String getOrdertitle() {
        return ordertitle;
    }

    public void setOrdertitle(String ordertitle) {
        this.ordertitle = ordertitle;
    }

    public String getOrdercoincode() {
        return ordercoincode;
    }

    public void setOrdercoincode(String ordercoincode) {
        this.ordercoincode = ordercoincode;
    }

    public String getOrdercoinname() {
        return ordercoinname;
    }

    public void setOrdercoinname(String ordercoinname) {
        this.ordercoinname = ordercoinname;
    }

    public BigDecimal getOrdercoinqty() {
        return ordercoinqty;
    }

    public void setOrdercoinqty(BigDecimal ordercoinqty) {
        this.ordercoinqty = ordercoinqty;
    }

    public BigDecimal getOrdercoinprice() {
        return ordercoinprice;
    }

    public void setOrdercoinprice(BigDecimal ordercoinprice) {
        this.ordercoinprice = ordercoinprice;
    }

    public BigDecimal getOrderaccount() {
        return orderaccount;
    }

    public void setOrderaccount(BigDecimal orderaccount) {
        this.orderaccount = orderaccount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Long getAccountid() {
        return accountid;
    }

    public void setAccountid(Long accountid) {
        this.accountid = accountid;
    }

    public Long getCreateid() {
        return createid;
    }

    public void setCreateid(Long createid) {
        this.createid = createid;
    }
}
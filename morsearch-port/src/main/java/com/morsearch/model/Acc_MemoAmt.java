package com.morsearch.model;

import java.math.BigDecimal;
import java.util.Date;

public class Acc_MemoAmt {
    private Long orderid;

    private String orderno;

    private Date orderdate;

    private String ordertype;

    private String ordertitle;

    private String ordersign;

    private BigDecimal orderaccount;

    private Byte tradeway;

    private String tradename;

    private String tradeorderno;

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

    public String getOrdertitle() {
        return ordertitle;
    }

    public void setOrdertitle(String ordertitle) {
        this.ordertitle = ordertitle;
    }

    public String getOrdersign() {
        return ordersign;
    }

    public void setOrdersign(String ordersign) {
        this.ordersign = ordersign;
    }

    public BigDecimal getOrderaccount() {
        return orderaccount;
    }

    public void setOrderaccount(BigDecimal orderaccount) {
        this.orderaccount = orderaccount;
    }

    public Byte getTradeway() {
        return tradeway;
    }

    public void setTradeway(Byte tradeway) {
        this.tradeway = tradeway;
    }

    public String getTradename() {
        return tradename;
    }

    public void setTradename(String tradename) {
        this.tradename = tradename;
    }

    public String getTradeorderno() {
        return tradeorderno;
    }

    public void setTradeorderno(String tradeorderno) {
        this.tradeorderno = tradeorderno;
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
package com.morsearch.model;

import java.math.BigDecimal;
import java.util.Date;

public class Acc_Wallet {
    private Long wl_userid;

    private BigDecimal wl_account;

    private BigDecimal wl_integral;

    private BigDecimal wl_deposit;

    private BigDecimal wl_occupied;

    private BigDecimal wl_receiveqty;

    private Integer wl_countbuy;

    private Integer wl_countrecharge;

    private Date wl_createdate;

    private Date wl_updatedate;

    public Long getWl_userid() {
        return wl_userid;
    }

    public void setWl_userid(Long wl_userid) {
        this.wl_userid = wl_userid;
    }

    public BigDecimal getWl_account() {
        return wl_account;
    }

    public void setWl_account(BigDecimal wl_account) {
        this.wl_account = wl_account;
    }

    public BigDecimal getWl_integral() {
        return wl_integral;
    }

    public void setWl_integral(BigDecimal wl_integral) {
        this.wl_integral = wl_integral;
    }

    public BigDecimal getWl_deposit() {
        return wl_deposit;
    }

    public void setWl_deposit(BigDecimal wl_deposit) {
        this.wl_deposit = wl_deposit;
    }

    public BigDecimal getWl_occupied() {
        return wl_occupied;
    }

    public void setWl_occupied(BigDecimal wl_occupied) {
        this.wl_occupied = wl_occupied;
    }

    public BigDecimal getWl_receiveqty() {
        return wl_receiveqty;
    }

    public void setWl_receiveqty(BigDecimal wl_receiveqty) {
        this.wl_receiveqty = wl_receiveqty;
    }

    public Integer getWl_countbuy() {
        return wl_countbuy;
    }

    public void setWl_countbuy(Integer wl_countbuy) {
        this.wl_countbuy = wl_countbuy;
    }

    public Integer getWl_countrecharge() {
        return wl_countrecharge;
    }

    public void setWl_countrecharge(Integer wl_countrecharge) {
        this.wl_countrecharge = wl_countrecharge;
    }

    public Date getWl_createdate() {
        return wl_createdate;
    }

    public void setWl_createdate(Date wl_createdate) {
        this.wl_createdate = wl_createdate;
    }

    public Date getWl_updatedate() {
        return wl_updatedate;
    }

    public void setWl_updatedate(Date wl_updatedate) {
        this.wl_updatedate = wl_updatedate;
    }
}
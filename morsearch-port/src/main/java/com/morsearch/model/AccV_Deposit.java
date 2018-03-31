package com.morsearch.model;

import java.math.BigDecimal;

public class AccV_Deposit {
    private Long ac_userid;

    private String ac_typecode;

    private BigDecimal ac_deposit;

    private BigDecimal ac_occupied;

    private BigDecimal ac_receiveqty;

    private String ac_typename;

    private String ac_typeimage;

    private String ac_typeprice;

    public Long getAc_userid() {
        return ac_userid;
    }

    public void setAc_userid(Long ac_userid) {
        this.ac_userid = ac_userid;
    }

    public String getAc_typecode() {
        return ac_typecode;
    }

    public void setAc_typecode(String ac_typecode) {
        this.ac_typecode = ac_typecode;
    }

    public BigDecimal getAc_deposit() {
        return ac_deposit;
    }

    public void setAc_deposit(BigDecimal ac_deposit) {
        this.ac_deposit = ac_deposit;
    }

    public BigDecimal getAc_occupied() {
        return ac_occupied;
    }

    public void setAc_occupied(BigDecimal ac_occupied) {
        this.ac_occupied = ac_occupied;
    }

    public BigDecimal getAc_receiveqty() {
        return ac_receiveqty;
    }

    public void setAc_receiveqty(BigDecimal ac_receiveqty) {
        this.ac_receiveqty = ac_receiveqty;
    }

    public String getAc_typename() {
        return ac_typename;
    }

    public void setAc_typename(String ac_typename) {
        this.ac_typename = ac_typename;
    }

    public String getAc_typeimage() {
        return ac_typeimage;
    }

    public void setAc_typeimage(String ac_typeimage) {
        this.ac_typeimage = ac_typeimage;
    }

    public String getAc_typeprice() {
        return ac_typeprice;
    }

    public void setAc_typeprice(String ac_typeprice) {
        this.ac_typeprice = ac_typeprice;
    }
}
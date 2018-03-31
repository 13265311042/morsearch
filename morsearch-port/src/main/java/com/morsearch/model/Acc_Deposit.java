package com.morsearch.model;

import java.math.BigDecimal;

public class Acc_Deposit extends Acc_DepositKey {
    private BigDecimal ac_deposit;

    private BigDecimal ac_occupied;

    private BigDecimal ac_receiveqty;

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
}
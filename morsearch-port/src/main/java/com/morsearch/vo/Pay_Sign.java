package com.morsearch.vo;

import java.math.BigDecimal;

/**
 * 返回签名结果
 */
public class Pay_Sign {
    private String orderno;
    private BigDecimal amount;
    private int tradeway;
    private String tradesign;


    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno;
    }

    public int getTradeway() {
        return tradeway;
    }

    public void setTradeway(int tradeway) {
        this.tradeway = tradeway;
    }

    public String getTradesign() {
        return tradesign;
    }

    public void setTradesign(String tradesign) {
        this.tradesign = tradesign;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}

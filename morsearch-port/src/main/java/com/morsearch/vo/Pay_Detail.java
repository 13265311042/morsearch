package com.morsearch.vo;

/**
 * 支付付款明细
 * leoli
 * 2017.10.31
 */
public class Pay_Detail {
    private String trade_id;/*交易ID号*/
    private String trade_no;/*交易单号*/
    private String pmno;/*产品编号*/
    private String pmname;/*产品名称*/
    private String subject;/*购买主题*/
    private String amount;/*付款金额*/

    public String getTrade_id() {
        return trade_id;
    }

    public void setTrade_id(String trade_id) {
        this.trade_id = trade_id;
    }

    public String getTrade_no() {
        return trade_no;
    }

    public void setTrade_no(String trade_no) {
        this.trade_no = trade_no;
    }

    public String getPmno() {
        return pmno;
    }

    public void setPmno(String pmno) {
        this.pmno = pmno;
    }

    public String getPmname() {
        return pmname;
    }

    public void setPmname(String pmname) {
        this.pmname = pmname;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}

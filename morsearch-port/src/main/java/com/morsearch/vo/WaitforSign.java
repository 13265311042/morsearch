package com.morsearch.vo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 处理订单详情
 * Created by ywh on 2018-1-5.
 */
public class WaitforSign {

    //private Long mo_id;

    private Date mo_datepay;

    private Date mo_datesend;

    private Date mo_datedelivery;


    private String mo_logisticsname;

    private String mo_logisticstickets;

    private String mo_logisticsmsg;

    private String mo_usernick;

    private String mo_river;

    private String mo_rivphone;

    private String mo_rivaddress;

    private BigDecimal mo_payamtgoods;

    private BigDecimal mo_payamtfreight;

    private BigDecimal mo_payamtorder;

    private BigDecimal mo_paybalance;

    private String mod_goodtitle;

    private String mod_goodimage;

    private String mod_goodcolor;

    private String mod_goodmodel;

    private BigDecimal mod_price;

    private BigDecimal mod_qty;

    private BigDecimal mod_amount;

    public Date getMo_datedelivery() {
        return mo_datedelivery;
    }

    public void setMo_datedelivery(Date mo_datedelivery) {
        this.mo_datedelivery = mo_datedelivery;
    }
    public Date getMo_datepay() {
        return mo_datepay;
    }

    public void setMo_datepay(Date mo_datepay) {
        this.mo_datepay = mo_datepay;
    }

    public Date getMo_datesend() {
        return mo_datesend;
    }

    public void setMo_datesend(Date mo_datesend) {
        this.mo_datesend = mo_datesend;
    }

    public String getMo_logisticsname() {
        return mo_logisticsname;
    }

    public void setMo_logisticsname(String mo_logisticsname) {
        this.mo_logisticsname = mo_logisticsname;
    }

    public String getMo_logisticstickets() {
        return mo_logisticstickets;
    }

    public void setMo_logisticstickets(String mo_logisticstickets) {
        this.mo_logisticstickets = mo_logisticstickets;
    }

    public String getMo_logisticsmsg() {
        return mo_logisticsmsg;
    }

    public void setMo_logisticsmsg(String mo_logisticsmsg) {
        this.mo_logisticsmsg = mo_logisticsmsg;
    }

    public String getMo_usernick() {
        return mo_usernick;
    }

    public void setMo_usernick(String mo_usernick) {
        this.mo_usernick = mo_usernick;
    }

    public String getMo_river() {
        return mo_river;
    }

    public void setMo_river(String mo_river) {
        this.mo_river = mo_river;
    }

    public String getMo_rivphone() {
        return mo_rivphone;
    }

    public void setMo_rivphone(String mo_rivphone) {
        this.mo_rivphone = mo_rivphone;
    }

    public String getMo_rivaddress() {
        return mo_rivaddress;
    }

    public void setMo_rivaddress(String mo_rivaddress) {
        this.mo_rivaddress = mo_rivaddress;
    }

    public BigDecimal getMo_payamtgoods() {
        return mo_payamtgoods;
    }

    public void setMo_payamtgoods(BigDecimal mo_payamtgoods) {
        this.mo_payamtgoods = mo_payamtgoods;
    }

    public BigDecimal getMo_payamtfreight() {
        return mo_payamtfreight;
    }

    public void setMo_payamtfreight(BigDecimal mo_payamtfreight) {
        this.mo_payamtfreight = mo_payamtfreight;
    }

    public BigDecimal getMo_payamtorder() {
        return mo_payamtorder;
    }

    public void setMo_payamtorder(BigDecimal mo_payamtorder) {
        this.mo_payamtorder = mo_payamtorder;
    }

    public BigDecimal getMo_paybalance() {
        return mo_paybalance;
    }

    public void setMo_paybalance(BigDecimal mo_paybalance) {
        this.mo_paybalance = mo_paybalance;
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

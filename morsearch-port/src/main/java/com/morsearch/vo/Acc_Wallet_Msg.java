package com.morsearch.vo;

import com.morsearch.model.AccV_Deposit;
import com.morsearch.model.Acc_Deposit;

import java.math.BigDecimal;
import java.util.List;

/**
 * 钱包--首页
 * Created by leoli on 2017/10/17.
 */
public class Acc_Wallet_Msg {
    private static final long serialVersionUID = 1L;
    private Long userid;
    private String username;
    private String usersex;
    private String userimage;
    private BigDecimal account;
    private BigDecimal integral;
    private BigDecimal deposit;
    private String currency;

    private Boolean companyishave; /*企业是否存在*/
    private BigDecimal companyaccount; /*企业余额*/
    private BigDecimal companyintegral; /*企业积分*/
    private BigDecimal companydeposit; /*企业数量*/

    private BigDecimal sumaccount; /*汇总余额*/
    private BigDecimal sumintegral; /*汇总积分*/
    private BigDecimal sumdeposit; /*汇总数量*/

    private List<AccV_Deposit> companydepositlist;
    private List<AccV_Deposit> mydeposit;

    private Sys_WordList_list purchaselist;/*购买列表*/;


    public String getUsersex() {
        return usersex;
    }

    public void setUsersex(String usersex) {
        this.usersex = usersex;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public BigDecimal getAccount() {
        return account;
    }

    public void setAccount(BigDecimal account) {
        this.account = account;
    }

    public BigDecimal getIntegral() {
        return integral;
    }

    public void setIntegral(BigDecimal integral) {
        this.integral = integral;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public List<AccV_Deposit> getMydeposit() {
        return mydeposit;
    }

    public void setMydeposit(List<AccV_Deposit> mydeposit) {
        this.mydeposit = mydeposit;
    }

    public Sys_WordList_list getPurchaselist() {
        return purchaselist;
    }

    public void setPurchaselist(Sys_WordList_list purchaselist) {
        this.purchaselist = purchaselist;
    }

    public BigDecimal getDeposit() {
        return deposit;
    }

    public void setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserimage() {
        return userimage;
    }

    public void setUserimage(String userimage) {
        this.userimage = userimage;
    }

    public BigDecimal getCompanyaccount() {
        return companyaccount;
    }

    public void setCompanyaccount(BigDecimal companyaccount) {
        this.companyaccount = companyaccount;
    }

    public BigDecimal getCompanyintegral() {
        return companyintegral;
    }

    public void setCompanyintegral(BigDecimal companyintegral) {
        this.companyintegral = companyintegral;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Boolean getCompanyishave() {
        return companyishave;
    }

    public void setCompanyishave(Boolean companyishave) {
        this.companyishave = companyishave;
    }

    public BigDecimal getCompanydeposit() {
        return companydeposit;
    }

    public void setCompanydeposit(BigDecimal companydeposit) {
        this.companydeposit = companydeposit;
    }

    public BigDecimal getSumaccount() {
        return sumaccount;
    }

    public void setSumaccount(BigDecimal sumaccount) {
        this.sumaccount = sumaccount;
    }

    public BigDecimal getSumintegral() {
        return sumintegral;
    }

    public void setSumintegral(BigDecimal sumintegral) {
        this.sumintegral = sumintegral;
    }

    public BigDecimal getSumdeposit() {
        return sumdeposit;
    }

    public void setSumdeposit(BigDecimal sumdeposit) {
        this.sumdeposit = sumdeposit;
    }

    public List<AccV_Deposit> getCompanydepositlist() {
        return companydepositlist;
    }

    public void setCompanydepositlist(List<AccV_Deposit> companydepositlist) {
        this.companydepositlist = companydepositlist;
    }

}

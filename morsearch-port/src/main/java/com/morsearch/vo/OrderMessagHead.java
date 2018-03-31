package com.morsearch.vo;

import com.morsearch.model.Sales_Message;

import java.util.Date;
import java.util.List;

/**
 * 订单消息列表
 * leoli
 */
public class OrderMessagHead {
    private String orderno; /*订单单号*/
    private String talkhead;/*抬头*/
    private String talkcode;/*内容*/
    private String talkcontent;/*内容*/
    private String talksign;/*署名*/
    private String talkformat;/**/
    private String coincode;/*拜贴code*/
    private String coinname;/*拜贴名称*/
    private String coinimage;/*拜贴图片*/
    private Date datemeet; /*会面日期*/

    private String desig_namenick;/*设计师*/
    private String desig_imageurl;/*设计师*/
    private String companyname;/**/
    private String namenick;/**/
    private String imageurl;/**/
    private String personjob;/**/
    private String adjdatemsg;/*调整信息*/
    private Boolean adjdateread;/*调整是否已读*/
    private Boolean flagfinish;/**/
    private Boolean flagsuccess;/**/
    private int orderstatus;/**/
    private Boolean isoperate;/**/

    public String getDesig_namenick() {
        return desig_namenick;
    }

    public void setDesig_namenick(String desig_namenick) {
        this.desig_namenick = desig_namenick;
    }

    public String getDesig_imageurl() {
        return desig_imageurl;
    }

    public void setDesig_imageurl(String desig_imageurl) {
        this.desig_imageurl = desig_imageurl;
    }

    public int getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(int orderstatus) {
        this.orderstatus = orderstatus;
    }

    public Boolean getIsoperate() {
        return isoperate;
    }

    public void setIsoperate(Boolean isoperate) {
        this.isoperate = isoperate;
    }

    public String getTalkhead() {
        return talkhead;
    }

    public void setTalkhead(String talkhead) {
        this.talkhead = talkhead;
    }

    public String getTalkcontent() {
        return talkcontent;
    }

    public void setTalkcontent(String talkcontent) {
        this.talkcontent = talkcontent;
    }

    public String getTalksign() {
        return talksign;
    }

    public void setTalksign(String talksign) {
        this.talksign = talksign;
    }

    public String getCoinname() {
        return coinname;
    }

    public void setCoinname(String coinname) {
        this.coinname = coinname;
    }

    public String getCoinimage() {
        return coinimage;
    }

    public void setCoinimage(String coinimage) {
        this.coinimage = coinimage;
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno;
    }

    public Date getDatemeet() {
        return datemeet;
    }

    public void setDatemeet(Date datemeet) {
        this.datemeet = datemeet;
    }

    public String getCoincode() {
        return coincode;
    }

    public void setCoincode(String coincode) {
        this.coincode = coincode;
    }

    public String getTalkcode() {
        return talkcode;
    }

    public void setTalkcode(String talkcode) {
        this.talkcode = talkcode;
    }

    public String getTalkformat() {
        return talkformat;
    }

    public void setTalkformat(String talkformat) {
        this.talkformat = talkformat;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getNamenick() {
        return namenick;
    }

    public void setNamenick(String namenick) {
        this.namenick = namenick;
    }

    public String getPersonjob() {
        return personjob;
    }

    public void setPersonjob(String personjob) {
        this.personjob = personjob;
    }

    public String getAdjdatemsg() {
        return adjdatemsg;
    }

    public void setAdjdatemsg(String adjdatemsg) {
        this.adjdatemsg = adjdatemsg;
    }

    public Boolean getAdjdateread() {
        return adjdateread;
    }

    public void setAdjdateread(Boolean adjdateread) {
        this.adjdateread = adjdateread;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public Boolean getFlagfinish() {
        return flagfinish;
    }

    public void setFlagfinish(Boolean flagfinish) {
        this.flagfinish = flagfinish;
    }

    public Boolean getFlagsuccess() {
        return flagsuccess;
    }

    public void setFlagsuccess(Boolean flagsuccess) {
        this.flagsuccess = flagsuccess;
    }
}

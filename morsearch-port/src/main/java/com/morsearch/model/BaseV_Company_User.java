package com.morsearch.model;

import java.util.Date;

public class BaseV_Company_User {
    private Long bcu_id;

    private Long bcu_userid;

    private Byte bcu_type;

    private Long bcu_listuserid;

    private Date bcu_createdate;

    private Date bcu_updatedate;

    private Boolean bcu_confirm1;

    private Boolean bcu_confirm2;

    private String listuserphone;

    private String listusername;

    private String listuserimageurl;

    private String listusersex;

    private String listuserpersonjob;

    private String listuserpersonmajor;

    private String listuserpersonworkage;

    private String listusercompanybrand;

    private String listusercompanyname;

    public Long getBcu_id() {
        return bcu_id;
    }

    public void setBcu_id(Long bcu_id) {
        this.bcu_id = bcu_id;
    }

    public Long getBcu_userid() {
        return bcu_userid;
    }

    public void setBcu_userid(Long bcu_userid) {
        this.bcu_userid = bcu_userid;
    }

    public Byte getBcu_type() {
        return bcu_type;
    }

    public void setBcu_type(Byte bcu_type) {
        this.bcu_type = bcu_type;
    }

    public Long getBcu_listuserid() {
        return bcu_listuserid;
    }

    public void setBcu_listuserid(Long bcu_listuserid) {
        this.bcu_listuserid = bcu_listuserid;
    }

    public Date getBcu_createdate() {
        return bcu_createdate;
    }

    public void setBcu_createdate(Date bcu_createdate) {
        this.bcu_createdate = bcu_createdate;
    }

    public Date getBcu_updatedate() {
        return bcu_updatedate;
    }

    public void setBcu_updatedate(Date bcu_updatedate) {
        this.bcu_updatedate = bcu_updatedate;
    }

    public Boolean getBcu_confirm1() {
        return bcu_confirm1;
    }

    public void setBcu_confirm1(Boolean bcu_confirm1) {
        this.bcu_confirm1 = bcu_confirm1;
    }

    public Boolean getBcu_confirm2() {
        return bcu_confirm2;
    }

    public void setBcu_confirm2(Boolean bcu_confirm2) {
        this.bcu_confirm2 = bcu_confirm2;
    }

    public String getListuserphone() {
        return listuserphone;
    }

    public void setListuserphone(String listuserphone) {
        this.listuserphone = listuserphone;
    }

    public String getListusername() {
        return listusername;
    }

    public void setListusername(String listusername) {
        this.listusername = listusername;
    }

    public String getListuserimageurl() {
        return listuserimageurl;
    }

    public void setListuserimageurl(String listuserimageurl) {
        this.listuserimageurl = listuserimageurl;
    }

    public String getListusersex() {
        return listusersex;
    }

    public void setListusersex(String listusersex) {
        this.listusersex = listusersex;
    }

    public String getListuserpersonjob() {
        return listuserpersonjob;
    }

    public void setListuserpersonjob(String listuserpersonjob) {
        this.listuserpersonjob = listuserpersonjob;
    }

    public String getListuserpersonmajor() {
        return listuserpersonmajor;
    }

    public void setListuserpersonmajor(String listuserpersonmajor) {
        this.listuserpersonmajor = listuserpersonmajor;
    }

    public String getListuserpersonworkage() {
        return listuserpersonworkage;
    }

    public void setListuserpersonworkage(String listuserpersonworkage) {
        this.listuserpersonworkage = listuserpersonworkage;
    }

    public String getListusercompanybrand() {
        return listusercompanybrand;
    }

    public void setListusercompanybrand(String listusercompanybrand) {
        this.listusercompanybrand = listusercompanybrand;
    }

    public String getListusercompanyname() {
        return listusercompanyname;
    }

    public void setListusercompanyname(String listusercompanyname) {
        this.listusercompanyname = listusercompanyname;
    }
}
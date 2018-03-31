package com.morsearch.model;

import java.util.Date;

public class Sys_Manager {
    private Integer sm_id;

    private String sm_no;

    private String sm_password;

    private String sm_name;

    private String sm_phone;

    private String sm_email;

    private String sm_remark;

    private Integer sm_roleid;

    private Integer sm_deptid;

    private Boolean sm_flag_admin;

    private Byte sm_status;

    private Integer sm_createid;

    private Date sm_createdate;

    public Integer getSm_id() {
        return sm_id;
    }

    public void setSm_id(Integer sm_id) {
        this.sm_id = sm_id;
    }

    public String getSm_no() {
        return sm_no;
    }

    public void setSm_no(String sm_no) {
        this.sm_no = sm_no;
    }

    public String getSm_password() {
        return sm_password;
    }

    public void setSm_password(String sm_password) {
        this.sm_password = sm_password;
    }

    public String getSm_name() {
        return sm_name;
    }

    public void setSm_name(String sm_name) {
        this.sm_name = sm_name;
    }

    public String getSm_phone() {
        return sm_phone;
    }

    public void setSm_phone(String sm_phone) {
        this.sm_phone = sm_phone;
    }

    public String getSm_email() {
        return sm_email;
    }

    public void setSm_email(String sm_email) {
        this.sm_email = sm_email;
    }

    public String getSm_remark() {
        return sm_remark;
    }

    public void setSm_remark(String sm_remark) {
        this.sm_remark = sm_remark;
    }

    public Integer getSm_roleid() {
        return sm_roleid;
    }

    public void setSm_roleid(Integer sm_roleid) {
        this.sm_roleid = sm_roleid;
    }

    public Integer getSm_deptid() {
        return sm_deptid;
    }

    public void setSm_deptid(Integer sm_deptid) {
        this.sm_deptid = sm_deptid;
    }

    public Boolean getSm_flag_admin() {
        return sm_flag_admin;
    }

    public void setSm_flag_admin(Boolean sm_flag_admin) {
        this.sm_flag_admin = sm_flag_admin;
    }

    public Byte getSm_status() {
        return sm_status;
    }

    public void setSm_status(Byte sm_status) {
        this.sm_status = sm_status;
    }

    public Integer getSm_createid() {
        return sm_createid;
    }

    public void setSm_createid(Integer sm_createid) {
        this.sm_createid = sm_createid;
    }

    public Date getSm_createdate() {
        return sm_createdate;
    }

    public void setSm_createdate(Date sm_createdate) {
        this.sm_createdate = sm_createdate;
    }
}
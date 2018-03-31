package com.morsearch.model;

import java.util.Date;

public class Sys_SmsVerify {
    private Integer sv_id;

    private String sv_phone;

    private Byte sv_typeindex;

    private String sv_typename;

    private Long sv_userid;

    private String sv_ip;

    private Byte sv_repeat;

    private String sv_code;

    private Date sv_sendtime;

    private Date sv_verifytime;

    private Byte sv_status;

    public Integer getSv_id() {
        return sv_id;
    }

    public void setSv_id(Integer sv_id) {
        this.sv_id = sv_id;
    }

    public String getSv_phone() {
        return sv_phone;
    }

    public void setSv_phone(String sv_phone) {
        this.sv_phone = sv_phone;
    }

    public Byte getSv_typeindex() {
        return sv_typeindex;
    }

    public void setSv_typeindex(Byte sv_typeindex) {
        this.sv_typeindex = sv_typeindex;
    }

    public String getSv_typename() {
        return sv_typename;
    }

    public void setSv_typename(String sv_typename) {
        this.sv_typename = sv_typename;
    }

    public Long getSv_userid() {
        return sv_userid;
    }

    public void setSv_userid(Long sv_userid) {
        this.sv_userid = sv_userid;
    }

    public String getSv_ip() {
        return sv_ip;
    }

    public void setSv_ip(String sv_ip) {
        this.sv_ip = sv_ip;
    }

    public Byte getSv_repeat() {
        return sv_repeat;
    }

    public void setSv_repeat(Byte sv_repeat) {
        this.sv_repeat = sv_repeat;
    }

    public String getSv_code() {
        return sv_code;
    }

    public void setSv_code(String sv_code) {
        this.sv_code = sv_code;
    }

    public Date getSv_sendtime() {
        return sv_sendtime;
    }

    public void setSv_sendtime(Date sv_sendtime) {
        this.sv_sendtime = sv_sendtime;
    }

    public Date getSv_verifytime() {
        return sv_verifytime;
    }

    public void setSv_verifytime(Date sv_verifytime) {
        this.sv_verifytime = sv_verifytime;
    }

    public Byte getSv_status() {
        return sv_status;
    }

    public void setSv_status(Byte sv_status) {
        this.sv_status = sv_status;
    }
}
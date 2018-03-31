package com.morsearch.model;

public class Sys_MenuPower {
    private Long sm_id;

    private String sm_no;

    private String sm_name;

    private Long sm_parentid;

    private Integer sm_ismenu;

    private String sm_menuurl;

    private Boolean sm_stopflag;

    public Long getSm_id() {
        return sm_id;
    }

    public void setSm_id(Long sm_id) {
        this.sm_id = sm_id;
    }

    public String getSm_no() {
        return sm_no;
    }

    public void setSm_no(String sm_no) {
        this.sm_no = sm_no;
    }

    public String getSm_name() {
        return sm_name;
    }

    public void setSm_name(String sm_name) {
        this.sm_name = sm_name;
    }

    public Long getSm_parentid() {
        return sm_parentid;
    }

    public void setSm_parentid(Long sm_parentid) {
        this.sm_parentid = sm_parentid;
    }

    public Integer getSm_ismenu() {
        return sm_ismenu;
    }

    public void setSm_ismenu(Integer sm_ismenu) {
        this.sm_ismenu = sm_ismenu;
    }

    public String getSm_menuurl() {
        return sm_menuurl;
    }

    public void setSm_menuurl(String sm_menuurl) {
        this.sm_menuurl = sm_menuurl;
    }

    public Boolean getSm_stopflag() {
        return sm_stopflag;
    }

    public void setSm_stopflag(Boolean sm_stopflag) {
        this.sm_stopflag = sm_stopflag;
    }
}
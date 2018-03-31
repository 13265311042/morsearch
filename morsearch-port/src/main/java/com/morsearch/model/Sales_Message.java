package com.morsearch.model;

import java.util.Date;

public class Sales_Message {
    private Long sm_id;

    private String sm_orderno;

    private String sm_content;

    private Long sm_salerid;

    private String sm_salername;

    private String sm_salerimage;

    private Boolean sm_salerisread;

    private Long sm_designerid;

    private String sm_designername;

    private String sm_designerimage;

    private Boolean sm_designerisread;

    private Byte sm_type;

    private Date sm_createdate;

    private Boolean sm_flagstop;

    public Long getSm_id() {
        return sm_id;
    }

    public void setSm_id(Long sm_id) {
        this.sm_id = sm_id;
    }

    public String getSm_orderno() {
        return sm_orderno;
    }

    public void setSm_orderno(String sm_orderno) {
        this.sm_orderno = sm_orderno;
    }

    public String getSm_content() {
        return sm_content;
    }

    public void setSm_content(String sm_content) {
        this.sm_content = sm_content;
    }

    public Long getSm_salerid() {
        return sm_salerid;
    }

    public void setSm_salerid(Long sm_salerid) {
        this.sm_salerid = sm_salerid;
    }

    public String getSm_salername() {
        return sm_salername;
    }

    public void setSm_salername(String sm_salername) {
        this.sm_salername = sm_salername;
    }

    public String getSm_salerimage() {
        return sm_salerimage;
    }

    public void setSm_salerimage(String sm_salerimage) {
        this.sm_salerimage = sm_salerimage;
    }

    public Boolean getSm_salerisread() {
        return sm_salerisread;
    }

    public void setSm_salerisread(Boolean sm_salerisread) {
        this.sm_salerisread = sm_salerisread;
    }

    public Long getSm_designerid() {
        return sm_designerid;
    }

    public void setSm_designerid(Long sm_designerid) {
        this.sm_designerid = sm_designerid;
    }

    public String getSm_designername() {
        return sm_designername;
    }

    public void setSm_designername(String sm_designername) {
        this.sm_designername = sm_designername;
    }

    public String getSm_designerimage() {
        return sm_designerimage;
    }

    public void setSm_designerimage(String sm_designerimage) {
        this.sm_designerimage = sm_designerimage;
    }

    public Boolean getSm_designerisread() {
        return sm_designerisread;
    }

    public void setSm_designerisread(Boolean sm_designerisread) {
        this.sm_designerisread = sm_designerisread;
    }

    public Byte getSm_type() {
        return sm_type;
    }

    public void setSm_type(Byte sm_type) {
        this.sm_type = sm_type;
    }

    public Date getSm_createdate() {
        return sm_createdate;
    }

    public void setSm_createdate(Date sm_createdate) {
        this.sm_createdate = sm_createdate;
    }

    public Boolean getSm_flagstop() {
        return sm_flagstop;
    }

    public void setSm_flagstop(Boolean sm_flagstop) {
        this.sm_flagstop = sm_flagstop;
    }
}
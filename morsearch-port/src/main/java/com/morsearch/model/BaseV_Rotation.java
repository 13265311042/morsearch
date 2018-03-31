package com.morsearch.model;

import java.util.Date;

public class BaseV_Rotation {
    private Long rt_id;

    private String rt_type;

    private Integer rt_index;

    private String rt_title;

    private Byte rt_mode;

    private String rt_location;

    private Boolean rt_flagstop;

    private String rt_remark;

    private String rt_createno;

    private Date rt_createdate;

    private String rt_updateno;

    private Date rt_updatedate;

    private String modename;

    public Long getRt_id() {
        return rt_id;
    }

    public void setRt_id(Long rt_id) {
        this.rt_id = rt_id;
    }

    public String getRt_type() {
        return rt_type;
    }

    public void setRt_type(String rt_type) {
        this.rt_type = rt_type;
    }

    public Integer getRt_index() {
        return rt_index;
    }

    public void setRt_index(Integer rt_index) {
        this.rt_index = rt_index;
    }

    public String getRt_title() {
        return rt_title;
    }

    public void setRt_title(String rt_title) {
        this.rt_title = rt_title;
    }

    public Byte getRt_mode() {
        return rt_mode;
    }

    public void setRt_mode(Byte rt_mode) {
        this.rt_mode = rt_mode;
    }

    public String getRt_location() {
        return rt_location;
    }

    public void setRt_location(String rt_location) {
        this.rt_location = rt_location;
    }

    public Boolean getRt_flagstop() {
        return rt_flagstop;
    }

    public void setRt_flagstop(Boolean rt_flagstop) {
        this.rt_flagstop = rt_flagstop;
    }

    public String getRt_remark() {
        return rt_remark;
    }

    public void setRt_remark(String rt_remark) {
        this.rt_remark = rt_remark;
    }

    public String getRt_createno() {
        return rt_createno;
    }

    public void setRt_createno(String rt_createno) {
        this.rt_createno = rt_createno;
    }

    public Date getRt_createdate() {
        return rt_createdate;
    }

    public void setRt_createdate(Date rt_createdate) {
        this.rt_createdate = rt_createdate;
    }

    public String getRt_updateno() {
        return rt_updateno;
    }

    public void setRt_updateno(String rt_updateno) {
        this.rt_updateno = rt_updateno;
    }

    public Date getRt_updatedate() {
        return rt_updatedate;
    }

    public void setRt_updatedate(Date rt_updatedate) {
        this.rt_updatedate = rt_updatedate;
    }

    public String getModename() {
        return modename;
    }

    public void setModename(String modename) {
        this.modename = modename;
    }
}
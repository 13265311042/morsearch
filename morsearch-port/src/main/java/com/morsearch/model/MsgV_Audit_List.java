package com.morsearch.model;

import java.util.Date;

public class MsgV_Audit_List {
    private String typecode;

    private String typename;

    private Long sp_id;

    private String sp_no;

    private String sp_title;

    private Boolean sp_flag_auditread;

    private Boolean sp_flag_adminread;

    private String sp_adminremark;

    private Long sp_createid;

    private Date sp_createdate;

    private Long sp_confirmid;

    private Date sp_confirmdate;

    private Byte sp_status;

    private String statusname;

    public String getTypecode() {
        return typecode;
    }

    public void setTypecode(String typecode) {
        this.typecode = typecode;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public Long getSp_id() {
        return sp_id;
    }

    public void setSp_id(Long sp_id) {
        this.sp_id = sp_id;
    }

    public String getSp_no() {
        return sp_no;
    }

    public void setSp_no(String sp_no) {
        this.sp_no = sp_no;
    }

    public String getSp_title() {
        return sp_title;
    }

    public void setSp_title(String sp_title) {
        this.sp_title = sp_title;
    }

    public Boolean getSp_flag_auditread() {
        return sp_flag_auditread;
    }

    public void setSp_flag_auditread(Boolean sp_flag_auditread) {
        this.sp_flag_auditread = sp_flag_auditread;
    }

    public Boolean getSp_flag_adminread() {
        return sp_flag_adminread;
    }

    public void setSp_flag_adminread(Boolean sp_flag_adminread) {
        this.sp_flag_adminread = sp_flag_adminread;
    }

    public String getSp_adminremark() {
        return sp_adminremark;
    }

    public void setSp_adminremark(String sp_adminremark) {
        this.sp_adminremark = sp_adminremark;
    }

    public Long getSp_createid() {
        return sp_createid;
    }

    public void setSp_createid(Long sp_createid) {
        this.sp_createid = sp_createid;
    }

    public Date getSp_createdate() {
        return sp_createdate;
    }

    public void setSp_createdate(Date sp_createdate) {
        this.sp_createdate = sp_createdate;
    }

    public Long getSp_confirmid() {
        return sp_confirmid;
    }

    public void setSp_confirmid(Long sp_confirmid) {
        this.sp_confirmid = sp_confirmid;
    }

    public Date getSp_confirmdate() {
        return sp_confirmdate;
    }

    public void setSp_confirmdate(Date sp_confirmdate) {
        this.sp_confirmdate = sp_confirmdate;
    }

    public Byte getSp_status() {
        return sp_status;
    }

    public void setSp_status(Byte sp_status) {
        this.sp_status = sp_status;
    }

    public String getStatusname() {
        return statusname;
    }

    public void setStatusname(String statusname) {
        this.statusname = statusname;
    }
}
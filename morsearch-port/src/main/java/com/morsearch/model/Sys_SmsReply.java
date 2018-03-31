package com.morsearch.model;

import java.util.Date;

public class Sys_SmsReply {
    private Long sr_id;

    private String sr_phone;

    private String sr_content;

    private Date sr_sendtime;

    private Date sr_processtime;

    private String sr_remark;

    private Byte sr_status;

    public Long getSr_id() {
        return sr_id;
    }

    public void setSr_id(Long sr_id) {
        this.sr_id = sr_id;
    }

    public String getSr_phone() {
        return sr_phone;
    }

    public void setSr_phone(String sr_phone) {
        this.sr_phone = sr_phone;
    }

    public String getSr_content() {
        return sr_content;
    }

    public void setSr_content(String sr_content) {
        this.sr_content = sr_content;
    }

    public Date getSr_sendtime() {
        return sr_sendtime;
    }

    public void setSr_sendtime(Date sr_sendtime) {
        this.sr_sendtime = sr_sendtime;
    }

    public Date getSr_processtime() {
        return sr_processtime;
    }

    public void setSr_processtime(Date sr_processtime) {
        this.sr_processtime = sr_processtime;
    }

    public String getSr_remark() {
        return sr_remark;
    }

    public void setSr_remark(String sr_remark) {
        this.sr_remark = sr_remark;
    }

    public Byte getSr_status() {
        return sr_status;
    }

    public void setSr_status(Byte sr_status) {
        this.sr_status = sr_status;
    }
}
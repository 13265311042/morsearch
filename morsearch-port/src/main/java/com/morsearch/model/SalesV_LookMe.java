package com.morsearch.model;

import java.util.Date;

public class SalesV_LookMe {
    private Long sl_id;

    private Long sl_salesmanid;

    private Long sl_desginerid;

    private Date sl_createdate;

    private String desginer_name;

    private String desginer_job;

    private String desginer_message;

    private String desginer_imageurl;

    private String dateshort;

    public Long getSl_id() {
        return sl_id;
    }

    public void setSl_id(Long sl_id) {
        this.sl_id = sl_id;
    }

    public Long getSl_salesmanid() {
        return sl_salesmanid;
    }

    public void setSl_salesmanid(Long sl_salesmanid) {
        this.sl_salesmanid = sl_salesmanid;
    }

    public Long getSl_desginerid() {
        return sl_desginerid;
    }

    public void setSl_desginerid(Long sl_desginerid) {
        this.sl_desginerid = sl_desginerid;
    }

    public Date getSl_createdate() {
        return sl_createdate;
    }

    public void setSl_createdate(Date sl_createdate) {
        this.sl_createdate = sl_createdate;
    }

    public String getDesginer_name() {
        return desginer_name;
    }

    public void setDesginer_name(String desginer_name) {
        this.desginer_name = desginer_name;
    }

    public String getDesginer_job() {
        return desginer_job;
    }

    public void setDesginer_job(String desginer_job) {
        this.desginer_job = desginer_job;
    }

    public String getDesginer_message() {
        return desginer_message;
    }

    public void setDesginer_message(String desginer_message) {
        this.desginer_message = desginer_message;
    }

    public String getDesginer_imageurl() {
        return desginer_imageurl;
    }

    public void setDesginer_imageurl(String desginer_imageurl) {
        this.desginer_imageurl = desginer_imageurl;
    }

    public String getDateshort() {
        return dateshort;
    }

    public void setDateshort(String dateshort) {
        this.dateshort = dateshort;
    }
}
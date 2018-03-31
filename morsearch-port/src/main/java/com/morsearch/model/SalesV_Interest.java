package com.morsearch.model;

import java.util.Date;

public class SalesV_Interest {
    private Long si_id;

    private Long si_salesmanid;

    private Long si_pmid;

    private String si_pmtitle;

    private Long si_desginerid;

    private Date si_createdate;

    private String desginer_name;

    private String desginer_job;

    private String desginer_message;

    private String desginer_imageurl;

    private String dateshort;

    public Long getSi_id() {
        return si_id;
    }

    public void setSi_id(Long si_id) {
        this.si_id = si_id;
    }

    public Long getSi_salesmanid() {
        return si_salesmanid;
    }

    public void setSi_salesmanid(Long si_salesmanid) {
        this.si_salesmanid = si_salesmanid;
    }

    public Long getSi_pmid() {
        return si_pmid;
    }

    public void setSi_pmid(Long si_pmid) {
        this.si_pmid = si_pmid;
    }

    public String getSi_pmtitle() {
        return si_pmtitle;
    }

    public void setSi_pmtitle(String si_pmtitle) {
        this.si_pmtitle = si_pmtitle;
    }

    public Long getSi_desginerid() {
        return si_desginerid;
    }

    public void setSi_desginerid(Long si_desginerid) {
        this.si_desginerid = si_desginerid;
    }

    public Date getSi_createdate() {
        return si_createdate;
    }

    public void setSi_createdate(Date si_createdate) {
        this.si_createdate = si_createdate;
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
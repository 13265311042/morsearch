package com.morsearch.model;

import java.util.Date;

public class Sales_Interest {
    private Long si_id;

    private Long si_salesmanid;

    private Long si_pmid;

    private String si_pmtitle;

    private Long si_desginerid;

    private Date si_createdate;

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
}
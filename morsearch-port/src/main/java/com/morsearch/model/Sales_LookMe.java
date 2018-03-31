package com.morsearch.model;

import java.util.Date;

public class Sales_LookMe {
    private Long sl_id;

    private Long sl_salesmanid;

    private Long sl_desginerid;

    private Date sl_createdate;

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
}
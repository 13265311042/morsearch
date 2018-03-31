package com.morsearch.vo;

import com.morsearch.model.HomeV_Detail;

import java.util.Date;
import java.util.List;

/**
 * Created by hyt on 2017/12/4.
 */
public class HomeDetail {
    private List<HomeV_Detail> detaillist;
    private String ordernewno;
    private Date ordernewdate;

    public List<HomeV_Detail> getDetaillist() {
        return detaillist;
    }

    public void setDetaillist(List<HomeV_Detail> detaillist) {
        this.detaillist = detaillist;
    }

    public String getOrdernewno() {
        return ordernewno;
    }

    public void setOrdernewno(String ordernewno) {
        this.ordernewno = ordernewno;
    }

    public Date getOrdernewdate() {
        return ordernewdate;
    }

    public void setOrdernewdate(Date ordernewdate) {
        this.ordernewdate = ordernewdate;
    }
}

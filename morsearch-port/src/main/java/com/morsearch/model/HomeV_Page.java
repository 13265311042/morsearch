package com.morsearch.model;

import java.math.BigDecimal;

public class HomeV_Page {
    private String longitude;

    private String latitude;

    private Long userqty;

    private BigDecimal countneed;

    private BigDecimal countorder;

    private String companyaddr;

    private String groupid;

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public Long getUserqty() {
        return userqty;
    }

    public void setUserqty(Long userqty) {
        this.userqty = userqty;
    }

    public BigDecimal getCountneed() {
        return countneed;
    }

    public void setCountneed(BigDecimal countneed) {
        this.countneed = countneed;
    }

    public BigDecimal getCountorder() {
        return countorder;
    }

    public void setCountorder(BigDecimal countorder) {
        this.countorder = countorder;
    }

    public String getCompanyaddr() {
        return companyaddr;
    }

    public void setCompanyaddr(String companyaddr) {
        this.companyaddr = companyaddr;
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid;
    }
}
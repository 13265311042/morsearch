package com.morsearch.model;

public class AwardV_Recharge {
    private Long ba_id;

    private String ba_name;

    private String ba_datebegin;

    private String ba_dateend;

    private Long ba_createid;

    private Byte ba_status;

    private String statusname;

    private String activityname;

    public Long getBa_id() {
        return ba_id;
    }

    public void setBa_id(Long ba_id) {
        this.ba_id = ba_id;
    }

    public String getBa_name() {
        return ba_name;
    }

    public void setBa_name(String ba_name) {
        this.ba_name = ba_name;
    }

    public String getBa_datebegin() {
        return ba_datebegin;
    }

    public void setBa_datebegin(String ba_datebegin) {
        this.ba_datebegin = ba_datebegin;
    }

    public String getBa_dateend() {
        return ba_dateend;
    }

    public void setBa_dateend(String ba_dateend) {
        this.ba_dateend = ba_dateend;
    }

    public Long getBa_createid() {
        return ba_createid;
    }

    public void setBa_createid(Long ba_createid) {
        this.ba_createid = ba_createid;
    }

    public Byte getBa_status() {
        return ba_status;
    }

    public void setBa_status(Byte ba_status) {
        this.ba_status = ba_status;
    }

    public String getStatusname() {
        return statusname;
    }

    public void setStatusname(String statusname) {
        this.statusname = statusname;
    }

    public String getActivityname() {
        return activityname;
    }

    public void setActivityname(String activityname) {
        this.activityname = activityname;
    }
}
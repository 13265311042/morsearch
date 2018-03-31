package com.morsearch.model;

public class Base_City {
    private Integer bc_cityid;

    private String bc_cityname;

    private Integer bc_prvid;

    private String bc_prvname;

    private String bc_code;

    private Byte bc_delflag;

    public Integer getBc_cityid() {
        return bc_cityid;
    }

    public void setBc_cityid(Integer bc_cityid) {
        this.bc_cityid = bc_cityid;
    }

    public String getBc_cityname() {
        return bc_cityname;
    }

    public void setBc_cityname(String bc_cityname) {
        this.bc_cityname = bc_cityname;
    }

    public Integer getBc_prvid() {
        return bc_prvid;
    }

    public void setBc_prvid(Integer bc_prvid) {
        this.bc_prvid = bc_prvid;
    }

    public String getBc_prvname() {
        return bc_prvname;
    }

    public void setBc_prvname(String bc_prvname) {
        this.bc_prvname = bc_prvname;
    }

    public String getBc_code() {
        return bc_code;
    }

    public void setBc_code(String bc_code) {
        this.bc_code = bc_code;
    }

    public Byte getBc_delflag() {
        return bc_delflag;
    }

    public void setBc_delflag(Byte bc_delflag) {
        this.bc_delflag = bc_delflag;
    }
}
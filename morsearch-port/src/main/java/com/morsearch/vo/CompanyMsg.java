package com.morsearch.vo;

import java.util.Date;

/**
 * Created by hyt on 2018/2/11.
 */
public class CompanyMsg {
    private Long ur_id;
    private String ur_no;
    private String companyname;
    private String companytype;
    private Date  ur_register_date;

    public Long getUr_id() {
        return ur_id;
    }

    public void setUr_id(Long ur_id) {
        this.ur_id = ur_id;
    }

    public String getUr_no() {
        return ur_no;
    }

    public void setUr_no(String ur_no) {
        this.ur_no = ur_no;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public Date getUr_register_date() {
        return ur_register_date;
    }

    public void setUr_register_date(Date ur_register_date) {
        this.ur_register_date = ur_register_date;
    }

    public String getCompanytype() {
        return companytype;
    }

    public void setCompanytype(String companytype) {
        this.companytype = companytype;
    }
}

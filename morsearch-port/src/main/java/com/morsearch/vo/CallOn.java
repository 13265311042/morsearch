package com.morsearch.vo;

/**
 * 拜贴内容
 * Created by ywh on 2017-11-09.
 */
public class CallOn {

    private String personjob;
    private String companyname;
    private String namenick;
    private String content; //内容

    public String getPersonjob() {
        return personjob;
    }

    public void setPersonjob(String personjob) {
        this.personjob = personjob;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getNamenick() {
        return namenick;
    }

    public void setNamenick(String namenick) {
        this.namenick = namenick;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }
}

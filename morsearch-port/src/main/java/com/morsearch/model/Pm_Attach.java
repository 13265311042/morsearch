package com.morsearch.model;

import java.util.Date;

public class Pm_Attach {
    private Long aa_id;

    private Long aa_archivesid;

    private String aa_filetitle;

    private String aa_filename;

    private String aa_filetype;

    private Integer aa_pagecount;

    private Date aa_createdate;

    public Long getAa_id() {
        return aa_id;
    }

    public void setAa_id(Long aa_id) {
        this.aa_id = aa_id;
    }

    public Long getAa_archivesid() {
        return aa_archivesid;
    }

    public void setAa_archivesid(Long aa_archivesid) {
        this.aa_archivesid = aa_archivesid;
    }

    public String getAa_filetitle() {
        return aa_filetitle;
    }

    public void setAa_filetitle(String aa_filetitle) {
        this.aa_filetitle = aa_filetitle;
    }

    public String getAa_filename() {
        return aa_filename;
    }

    public void setAa_filename(String aa_filename) {
        this.aa_filename = aa_filename;
    }

    public String getAa_filetype() {
        return aa_filetype;
    }

    public void setAa_filetype(String aa_filetype) {
        this.aa_filetype = aa_filetype;
    }

    public Integer getAa_pagecount() {
        return aa_pagecount;
    }

    public void setAa_pagecount(Integer aa_pagecount) {
        this.aa_pagecount = aa_pagecount;
    }

    public Date getAa_createdate() {
        return aa_createdate;
    }

    public void setAa_createdate(Date aa_createdate) {
        this.aa_createdate = aa_createdate;
    }
}
package com.morsearch.model;

import java.util.Date;

public class DesigV_Search_Archives {
    private Long pa_id;

    private String pa_title;

    private String pa_major;

    private String pa_style;

    private String pa_features;

    private Integer pa_count_collect;

    private Integer pa_count_browse;

    private Date createdate;

    private String createname;

    private Long pa_createid;

    public Long getPa_createid() {
        return pa_createid;
    }

    public void setPa_createid(Long pa_createid) {
        this.pa_createid = pa_createid;
    }

    public Long getPa_id() {
        return pa_id;
    }

    public void setPa_id(Long pa_id) {
        this.pa_id = pa_id;
    }

    public String getPa_title() {
        return pa_title;
    }

    public void setPa_title(String pa_title) {
        this.pa_title = pa_title;
    }

    public String getPa_major() {
        return pa_major;
    }

    public void setPa_major(String pa_major) {
        this.pa_major = pa_major;
    }

    public String getPa_style() {
        return pa_style;
    }

    public void setPa_style(String pa_style) {
        this.pa_style = pa_style;
    }

    public String getPa_features() {
        return pa_features;
    }

    public void setPa_features(String pa_features) {
        this.pa_features = pa_features;
    }

    public Integer getPa_count_collect() {
        return pa_count_collect;
    }

    public void setPa_count_collect(Integer pa_count_collect) {
        this.pa_count_collect = pa_count_collect;
    }

    public Integer getPa_count_browse() {
        return pa_count_browse;
    }

    public void setPa_count_browse(Integer pa_count_browse) {
        this.pa_count_browse = pa_count_browse;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getCreatename() {
        return createname;
    }

    public void setCreatename(String createname) {
        this.createname = createname;
    }
}
package com.morsearch.vo;

import com.morsearch.model.Pm_Attach;

import java.util.List;

/**
 * 判断是否已有文件
 * Created by ywh on 2017-11-13.
 */
public class Pm_Ar {
    private  Long id;
    private  String pa_title;
    private  String pa_major;
    private  String pa_style;
    private  String pa_features;
    private  String pa_content;
    private List<Pm_Attach> list;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Pm_Attach> getList() {
        return list;
    }

    public void setList(List<Pm_Attach> list) {
        this.list = list;
    }

    public String getPa_content() {
        return pa_content;
    }

    public void setPa_content(String pa_content) {
        this.pa_content = pa_content;
    }

    public String getPa_features() {
        return pa_features;
    }

    public void setPa_features(String pa_features) {
        this.pa_features = pa_features;
    }

    public String getPa_style() {
        return pa_style;
    }

    public void setPa_style(String pa_style) {
        this.pa_style = pa_style;
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
}

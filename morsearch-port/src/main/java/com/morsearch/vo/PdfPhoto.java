package com.morsearch.vo;

import java.util.List;

/**
 * 用于PDF切割图片返回
 * Created by ywh on 2018-1-18.
 */
public class PdfPhoto {

    private Integer pa_pagecount;

    private String ur_phone;

    private String url;

    private List<String> list;

    public String getUr_phone() {
        return ur_phone;
    }

    public void setUr_phone(String ur_phone) {
        this.ur_phone = ur_phone;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getPa_pagecount() {
        return pa_pagecount;
    }

    public void setPa_pagecount(Integer pa_pagecount) {
        this.pa_pagecount = pa_pagecount;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}

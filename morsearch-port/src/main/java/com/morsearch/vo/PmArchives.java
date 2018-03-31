package com.morsearch.vo;

import com.morsearch.common.constant.Constants;
import com.morsearch.model.Pm_Attach;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.util.List;

/**
 * Created by ywh on 2017-11-02.
 * 修改资料（获取资料详情）
 */
public class PmArchives {
    private  String pa_title;
    private  String pa_major;
    private  String pa_style;
    private  String pa_features;
    private  String pa_content;
    private  List<Pm_Attach> list;


    public List<Pm_Attach> getList() {
        return list;
    }

    public void setList(List<Pm_Attach> list) {

        this.list = list;
    }

    public String getPa_title() {
        return pa_title;
    }

    public void setPa_title(String pa_title) {
        this.pa_title = pa_title;
    }

    public String getPa_content() {
        return pa_content;
    }

    public void setPa_content(String pa_content) {
        this.pa_content = pa_content;
    }

    public String getPa_major() {
        return pa_major;
    }

    public void setPa_major(String pa_major) {
        this.pa_major = pa_major;
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
}

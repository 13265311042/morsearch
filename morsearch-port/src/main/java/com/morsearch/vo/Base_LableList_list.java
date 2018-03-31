package com.morsearch.vo;

import com.morsearch.model.Base_LableList;

import java.util.List;

/**
 * 标签列表扩展
 * Created by leoli on 2017/10/16.
 */
public class Base_LableList_list {
    private static final long serialVersionUID = 1L;
    private  String type; /*编号*/
    private  String title; /*标题*/


    private Boolean allowflag;/*允许用户新增*/
    private List<Base_LableList> list;/*企业类型列表*/;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Base_LableList> getList() {
        return list;
    }

    public void setList(List<Base_LableList> list) {
        this.list = list;
    }

    public Boolean getAllowflag() {
        return allowflag;
    }

    public void setAllowflag(Boolean allowflag) {
        this.allowflag = allowflag;
    }

}

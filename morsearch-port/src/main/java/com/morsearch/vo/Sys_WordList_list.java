package com.morsearch.vo;

import com.morsearch.model.Base_LableList;
import com.morsearch.model.Sys_WordList;

import java.util.List;

/**
 * 用词列表扩展
 * Created by leoli on 2017/10/16.
 */
public class Sys_WordList_list {
    private static final long serialVersionUID = 1L;
    private  String type; /*编号*/
    private  String title; /*标题*/
    private List<Sys_WordList> list;/*企业类型列表*/;

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

    public List<Sys_WordList> getList() {
        return list;
    }

    public void setList(List<Sys_WordList> list) {
        this.list = list;
    }
}

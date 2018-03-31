package com.morsearch.vo;

import com.morsearch.model.Base_LableList;

import java.util.List;

/**
 * 用于专业 品牌 年限 返回列表
 * Created by ywh on 2018-3-5.
 */
public class LablelistVo {

    private List<Base_LableList> jorlist;

    private List<Base_LableList> brandlist;

    private List<Base_LableList> workagelist;

    public List<Base_LableList> getJorlist() {
        return jorlist;
    }

    public void setJorlist(List<Base_LableList> jorlist) {
        this.jorlist = jorlist;
    }

    public List<Base_LableList> getBrandlist() {
        return brandlist;
    }

    public void setBrandlist(List<Base_LableList> brandlist) {
        this.brandlist = brandlist;
    }

    public List<Base_LableList> getWorkagelist() {
        return workagelist;
    }

    public void setWorkagelist(List<Base_LableList> workagelist) {
        this.workagelist = workagelist;
    }
}

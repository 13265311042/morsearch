package com.morsearch.vo;

import com.morsearch.model.Base_LableList;

import java.util.List;

/**
 * 用于回显评价分类
 * Created by ywh on 2017-11-23.
 */


public class Contentgroup {

    private List<Base_LableList> list1;
    private List<Base_LableList> list2;

    public List<Base_LableList> getList1() {
        return list1;
    }

    public void setList1(List<Base_LableList> list1) {
        this.list1 = list1;
    }

    public List<Base_LableList> getList2() {
        return list2;
    }

    public void setList2(List<Base_LableList> list2) {
        this.list2 = list2;
    }
}

package com.morsearch.vo;

import com.morsearch.model.Base_LableList;
import com.morsearch.model.Sales_Order;

import java.util.List;

/**
 * 用于设计师评论回显
 * Created by ywh on 2017-11-27.
 */
public class Designer_comment {

    Sales_Order ordermemo;
    List<Base_LableList> list1;
    List<Base_LableList> list2;

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

    public Sales_Order getOrdermemo() {
        return ordermemo;
    }

    public void setOrdermemo(Sales_Order ordermemo) {
        this.ordermemo = ordermemo;
    }
}

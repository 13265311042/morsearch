package com.morsearch.vo;



import com.morsearch.model.Pm_Features;
import com.morsearch.model.Pm_Style;

import java.util.List;

/**
 * 产品特性
 * Created by ywh on 2017-10-30.
 */
public class Pm_Features_list {

    private Pm_Style list;
    private  List<Pm_Features> list1;
    private  List<Pm_Features> list2;

    public List<Pm_Features> getList2() {
        return list2;
    }

    public void setList2(List<Pm_Features> list2) {
        this.list2 = list2;
    }

    public Pm_Style getList() {
        return list;
    }

    public void setList(Pm_Style list) {
        this.list = list;
    }

    public List<Pm_Features> getList1() {
        return list1;
    }

    public void setList1(List<Pm_Features> list1) {
        this.list1 = list1;
    }
}

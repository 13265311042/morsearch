package com.morsearch.vo;

import com.morsearch.model.Pm_Archives;
import com.morsearch.model.Sales_Evaluate;
import com.morsearch.model.SysV_UserFull;

import java.util.List;

/**
 * 设计师端人员详情处理
 * Created by ywh on 2017-11-15.
 */
public class StylistPersonnelDetails {

    private SysV_UserFull userFull;
    private int collection;

    public int getCollection() {
        return collection;
    }

    public void setCollection(int collection) {
        this.collection = collection;
    }

    public SysV_UserFull getUserFull() {
        return userFull;
    }

    public void setUserFull(SysV_UserFull userFull) {
        this.userFull = userFull;
    }


    }


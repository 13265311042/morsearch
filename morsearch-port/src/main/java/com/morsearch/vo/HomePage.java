package com.morsearch.vo;

import com.morsearch.model.HomeV_Page;
import com.morsearch.model.SysV_UserFull;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hyt on 2017/11/9.
 */
public class HomePage {
    private int usermsgcount ;
    private int recordcount ;
    private  List<HomeV_Page> poslist;

    public int getUsermsgcount() {
        return usermsgcount;
    }

    public void setUsermsgcount(int usermsgcount) {
        this.usermsgcount = usermsgcount;
    }

    public List<HomeV_Page> getPoslist() {
        return poslist;
    }

    public void setPoslist(List<HomeV_Page> poslist) {
        this.poslist = poslist;
    }

    public int getRecordcount() {
        return recordcount;
    }

    public void setRecordcount(int recordcount) {
        this.recordcount = recordcount;
    }
}

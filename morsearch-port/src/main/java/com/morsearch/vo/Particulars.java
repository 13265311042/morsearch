package com.morsearch.vo;

import com.morsearch.model.Pm_Archives;
import com.morsearch.model.Pm_Attach;
import com.morsearch.model.SysV_UserFull;

import java.util.List;

/**
 * Created by ywh on 2017-11-21.
 * 设计师web端资料详情
 */
public class Particulars {

    //private Desis_Collect_pm desisCollectPm;

    private Integer contentgrade;

    private String collect;

    private Pm_Archives pmArchives;//文件资料

    private SysV_UserFull userlist; //上传者资料

    private List<Pm_Attach> pmAttach; //附文件列表

    public String getCollect() {
        return collect;
    }

    public void setCollect(String collect) {
        this.collect = collect;
    }

    public Integer getContentgrade() {
        return contentgrade;
    }

    public void setContentgrade(Integer contentgrade) {
        this.contentgrade = contentgrade;
    }

    public Pm_Archives getPmArchives() {
        return pmArchives;
    }

    public void setPmArchives(Pm_Archives pmArchives) {
        this.pmArchives = pmArchives;
    }

    public SysV_UserFull getUserlist() {
        return userlist;
    }

    public void setUserlist(SysV_UserFull userlist) {
        this.userlist = userlist;
    }

    public List<Pm_Attach> getPmAttach() {
        return pmAttach;
    }

    public void setPmAttach(List<Pm_Attach> pmAttach) {
        this.pmAttach = pmAttach;
    }
}

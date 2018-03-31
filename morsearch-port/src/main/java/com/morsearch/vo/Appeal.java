package com.morsearch.vo;

import com.morsearch.model.Base_LableList;
import com.morsearch.model.Sys_User;

import java.util.List;

/**
 * 去申诉回显
 * Created by ywh on 2017-11-01.
 */
public class Appeal {
   private  String  ur_namenick;
    private  String  ur_imageurl;
    private  String  ue_personjob;

   private List<Base_LableList> list;



    public List<Base_LableList> getList() {
        return list;
    }

    public void setList(List<Base_LableList> list) {
        this.list = list;
    }

    public String getUr_namenick() {
        return ur_namenick;
    }

    public void setUr_namenick(String ur_namenick) {
        this.ur_namenick = ur_namenick;
    }


    public String getUe_personjob() {
        return ue_personjob;
    }

    public void setUe_personjob(String ue_personjob) {
        this.ue_personjob = ue_personjob;
    }

    public String getUr_imageurl() {
        return ur_imageurl;
    }

    public void setUr_imageurl(String ur_imageurl) {
        this.ur_imageurl = ur_imageurl;
    }
}

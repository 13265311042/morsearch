package com.morsearch.vo;

import com.morsearch.model.Sys_User_Msg;

/**
 * Created by hyt on 2018/1/11.
 */
public class Sys_User_MsgVo extends Sys_User_Msg {
    private String um_lookmedateshort;
    private String um_interestdateshort;

    public String getUm_lookmedateshort() {
        return um_lookmedateshort;
    }

    public void setUm_lookmedateshort(String um_lookmedateshort) {
        this.um_lookmedateshort = um_lookmedateshort;
    }

    public String getUm_interestdateshort() {
        return um_interestdateshort;
    }

    public void setUm_interestdateshort(String um_interestdateshort) {
        this.um_interestdateshort = um_interestdateshort;
    }
}

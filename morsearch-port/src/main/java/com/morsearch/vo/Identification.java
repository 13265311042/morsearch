package com.morsearch.vo;

/**
 * 用于个人认证
 * Created by ywh on 2018-1-16.
 */
public class Identification {

    private  Long userid;

    private  Byte ue_membertype;

    private  String uv_image;

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Byte getUe_membertype() {
        return ue_membertype;
    }

    public void setUe_membertype(Byte ue_membertype) {
        this.ue_membertype = ue_membertype;
    }

    public String getUv_image() {
        return uv_image;
    }

    public void setUv_image(String uv_image) {
        this.uv_image = uv_image;
    }
}

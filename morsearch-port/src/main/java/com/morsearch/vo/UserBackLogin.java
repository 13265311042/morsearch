package com.morsearch.vo;

/**
 * Created by hyt on 2017/12/26.
 */
public class UserBackLogin {
    private Integer sm_id;
    private String sm_no;
    private String sm_name;
    private String sm_email;
    private String path_image_normal;/*源图片路径*/
    private  String path_image_small;/*小图片路径*/
    private  String path_download;

    public Integer getSm_id() {
        return sm_id;
    }

    public void setSm_id(Integer sm_id) {
        this.sm_id = sm_id;
    }

    public String getSm_no() {
        return sm_no;
    }

    public void setSm_no(String sm_no) {
        this.sm_no = sm_no;
    }

    public String getSm_email() {
        return sm_email;
    }

    public void setSm_email(String sm_email) {
        this.sm_email = sm_email;
    }

    public String getSm_name() {
        return sm_name;
    }

    public void setSm_name(String sm_name) {
        this.sm_name = sm_name;
    }

    public String getPath_image_normal() {
        return path_image_normal;
    }

    public void setPath_image_normal(String path_image_normal) {
        this.path_image_normal = path_image_normal;
    }

    public String getPath_image_small() {
        return path_image_small;
    }

    public void setPath_image_small(String path_image_small) {
        this.path_image_small = path_image_small;
    }

    public String getPath_download() {
        return path_download;
    }

    public void setPath_download(String path_download) {
        this.path_download = path_download;
    }
}

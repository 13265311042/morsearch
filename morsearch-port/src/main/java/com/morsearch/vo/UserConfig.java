package com.morsearch.vo;

/**
 * 用户登录读取配置资料
 */
public class UserConfig {

        private String path_image_normal;/*源图片路径*/
        private  String path_image_small;/*小图片路径*/
        private  String path_download;
        private  String path_accessory;/*附件*/
        private  String path_pdf_source;/*pdf源文件片路径*/
        private  String path_pdf_image;/*pdf图片路径*/
        private  String path_cad;/*cad路径*/
        private  String path_bim;/*bim路径*/
        private  String path_imgsys_normal;/*系统图片原图*/
        private  String path_imgsys_small; /*系统图片小图*/
        private  String order_time_revoke;//允许订单撤回时间(秒)
        private  String path_pdf_api;/*调用API*/


    public String getPath_pdf_api() {
        return path_pdf_api;
    }

    public void setPath_pdf_api(String path_pdf_api) {
        this.path_pdf_api = path_pdf_api;
    }

    public String getPath_download() {
        return path_download;
    }

    public void setPath_download(String path_download) {
        this.path_download = path_download;
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

        public String getPath_pdf_source() {
            return path_pdf_source;
        }

        public void setPath_pdf_source(String path_pdf_source) {
            this.path_pdf_source = path_pdf_source;
        }

        public String getPath_pdf_image() {
            return path_pdf_image;
        }

        public void setPath_pdf_image(String path_pdf_image) {
            this.path_pdf_image = path_pdf_image;
        }

        public String getPath_cad() {
            return path_cad;
        }

        public void setPath_cad(String path_cad) {
            this.path_cad = path_cad;
        }

        public String getPath_bim() {
            return path_bim;
        }

        public void setPath_bim(String path_bim) {
            this.path_bim = path_bim;
        }

    public String getOrder_time_revoke() {
        return order_time_revoke;
    }

    public void setOrder_time_revoke(String order_time_revoke) {
        this.order_time_revoke = order_time_revoke;
    }

    public String getPath_imgsys_normal() {
        return path_imgsys_normal;
    }

    public void setPath_imgsys_normal(String path_imgsys_normal) {
        this.path_imgsys_normal = path_imgsys_normal;
    }

    public String getPath_imgsys_small() {
        return path_imgsys_small;
    }

    public void setPath_imgsys_small(String path_imgsys_small) {
        this.path_imgsys_small = path_imgsys_small;
    }

    public String getPath_accessory() {
        return path_accessory;
    }

    public void setPath_accessory(String path_accessory) {
        this.path_accessory = path_accessory;
    }
}

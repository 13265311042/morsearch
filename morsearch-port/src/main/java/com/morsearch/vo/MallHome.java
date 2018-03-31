package com.morsearch.vo;

import com.morsearch.model.Base_Rotation;
import com.morsearch.model.MallV_Goods_List;
import com.morsearch.model.MallV_Home;

import java.util.List;

/**
 * 商城首页
 * leoli
 * Created by hyt on 2018/1/9.
 */
public class MallHome {
    private  String path_image_normal;/*图片一般路径*/
    private  String path_image_small;/*图片切割路径*/
    private List<Base_Rotation> rotationlist;/*轮播图列表*/
    private List<MallV_Home> hotlist; /*热门列表*/
    private List<MallV_Home> brandlist; /*品牌列表*/

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

    public List<Base_Rotation> getRotationlist() {
        return rotationlist;
    }

    public void setRotationlist(List<Base_Rotation> rotationlist) {
        this.rotationlist = rotationlist;
    }

    public List<MallV_Home> getHotlist() {
        return hotlist;
    }

    public void setHotlist(List<MallV_Home> hotlist) {
        this.hotlist = hotlist;
    }

    public List<MallV_Home> getBrandlist() {
        return brandlist;
    }

    public void setBrandlist(List<MallV_Home> brandlist) {
        this.brandlist = brandlist;
    }
}

package com.morsearch.vo;

import com.morsearch.model.DesigV_Home_Archives_List;
import com.morsearch.model.DesigV_Home_Brand_List;
import com.morsearch.model.DesigV_Home_Majob_List;
import com.morsearch.model.DesigV_Home_Sales_List;

import java.util.List;

/**
 * 设计师首页
 * Created by hyt on 2017/12/5.
 */
public class DesHome {
    private  String path_image_normal;/*图片一般路径*/
    private  String path_image_small;/*图片切割路径*/

    private List<DesigV_Home_Archives_List> archiveslist; /*产品*/
    private List<DesigV_Home_Brand_List> brandlist; /*品牌*/
    private List<DesigV_Home_Majob_List> majoblist; /*专业*/
    private List<DesigV_Home_Sales_List> saleslist; /*业务员*/

    public List<DesigV_Home_Archives_List> getArchiveslist() {
        return archiveslist;
    }

    public void setArchiveslist(List<DesigV_Home_Archives_List> archiveslist) {
        this.archiveslist = archiveslist;
    }

    public List<DesigV_Home_Brand_List> getBrandlist() {
        return brandlist;
    }

    public void setBrandlist(List<DesigV_Home_Brand_List> brandlist) {
        this.brandlist = brandlist;
    }

    public List<DesigV_Home_Majob_List> getMajoblist() {
        return majoblist;
    }

    public void setMajoblist(List<DesigV_Home_Majob_List> majoblist) {
        this.majoblist = majoblist;
    }

    public List<DesigV_Home_Sales_List> getSaleslist() {
        return saleslist;
    }

    public void setSaleslist(List<DesigV_Home_Sales_List> saleslist) {
        this.saleslist = saleslist;
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
}

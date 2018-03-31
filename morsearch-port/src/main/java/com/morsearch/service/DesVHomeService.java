package com.morsearch.service;

import com.morsearch.model.*;

import java.util.List;
import java.util.Map;

/**
 * Created by hyt on 2017/11/22.
 */
public interface DesVHomeService {
    List<DesigV_Home_Archives> getDesigV_Home_ArchivesList(Map<String, Object> map);//设计师首页文档列表

    Integer getDesigV_Home_ArchivesListCount(Map<String, Object> map);//设计师首页文档数量

    List<DesigV_Home_Brand> getDesigV_Home_BrandList(Map<String, Object> map);//设计师首页品牌列表

    Integer getDesigV_Home_BrandListCount(Map<String, Object> map);//设计师首页品牌数量

    List<DesigV_Home_Majob> getDesigV_Home_MajobList(Map<String, Object> map);//设计师首页专业列表

    Integer getDesigV_Home_MajobListCount(Map<String, Object> map);//设计师首页专业数量

    List<DesigV_Home_Sales> getDesigV_Home_SalesList(Map<String, Object> map);//设计师首页业务员列表

    Integer getDesigV_Home_SalesListCount(Map<String, Object> map);//设计师首页业务员数量

    int addDesig_Home(Desig_Home dh);

    int deleteDesig_HomeById(long l);//删除

    Desig_Home getDesig_Homedetail(long l);

    int updateDesig_Home(Desig_Home dh);

    List<DesigV_Home_Archives_List> getDesHomePage_Archives();/*设计师首页*/
    List<DesigV_Home_Brand_List> getDesHomePage_Brand();/*设计师首页*/
    List<DesigV_Home_Majob_List> getDesHomePage_Majob();/*设计师首页*/
    List<DesigV_Home_Sales_List> getDesHomePage_Sales();/*设计师首页*/

    Long getDesHomePage_Archives_homeid(Long paid);/*获取单个文档资料*/
}

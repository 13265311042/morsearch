package com.morsearch.service;

import com.morsearch.model.Pm_Archives;
import com.morsearch.model.Pm_Attach;
import org.springframework.context.ApplicationContext;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.util.List;
import java.util.Map;

/**
 * Created by ywh on 2017-10-31.
 */
public interface PmArchivesService {

    int insertSelective(Pm_Archives record);
    int updateByPrimaryKeySelective(Long id, String title, String major, String style, String features, String content, List<MultipartFile> files);
    int updateByPrimaryKey(Pm_Archives record);
    List<Pm_Archives> getPmArchivesList(Map<String, Object> map); /*得到用户列表 int pagestart,int pagesize*/
    int getPmArchivesListCount(Map<String, Object> map);
    List<Pm_Archives> getPmarchives(String title);

    int getPm_Archives(String id, String userid, String createno);

    Pm_Archives getPm_Archives1(Long id);

    List<Pm_Archives> getList(Long Id);
    Pm_Attach getPmattch(Long id);

    int addtPmArchives(ApplicationContext Context, String title, String major, String style, String features, String content
            , Long ur_id, String createno, CommonsMultipartFile file, List<MultipartFile> files);

    List<Pm_Archives> getPm_ArchivesList(Map<String, Object> map);//得到产品档案列表

    int getCountPm_Archives(Map<String, Object> map);//得到产品档案总数

    int  updatePm_Archives(Pm_Archives record);//更新产品档案

    Pm_Archives getArchivesDetail(Long paid, int type); /*获取文档明细 type:1。显示收藏和浏览*/

    List<Long> getPm_Archivesidlist();


    List<Pm_Archives> getPm_ArchivesListid(Map<String, Object> map);//首页文档添加的除去id的方法

    Integer getCountPm_Archivesid(Map<String, Object> map);//首页文档添加的除去id的方法

    List<Map<String, Object>> getPm_Archivesidnocut();/*读取未切割列表*/


}

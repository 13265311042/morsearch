package com.morsearch.dao;

import com.morsearch.model.Pm_Archives;
import com.morsearch.model.Pm_ArchivesExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface Pm_ArchivesMapper {
    int countByExample(Pm_ArchivesExample example);

    int deleteByExample(Pm_ArchivesExample example);

    int deleteByPrimaryKey(Long pa_id);

    int insert(Pm_Archives record);

    int insertSelective(Pm_Archives record);

    List<Pm_Archives> selectByExample(Pm_ArchivesExample example);

    Pm_Archives selectByPrimaryKey(Long pa_id);

    int updateByExampleSelective(@Param("record") Pm_Archives record, @Param("example") Pm_ArchivesExample example);

    int updateByExample(@Param("record") Pm_Archives record, @Param("example") Pm_ArchivesExample example);

    int updateByPrimaryKeySelective(Pm_Archives record);

    int updateByPrimaryKey(Pm_Archives record);

    //自定义

    List<Pm_Archives> getPmArchivesList(Map<String, Object> map); /*得到用户列表 int pagestart,int pagesize*/

    int getPmArchivesListCount(Map<String, Object> map);

    List<Pm_Archives> getPmarchives(String title);

    List<Pm_Archives> getPm_ArchivesList(Map<String, Object> map);//得到产品档案列表zuoxiaochao

    int getCountPm_Archives(Map<String, Object> map);//得到产品档案总数zuoxiaochao

    List<Pm_Archives> getList(Long id);

    Pm_Archives getPm_Archives(Long pa_id);

    Pm_Archives getArchivesDetail(@Param("paid") Long paid, @Param("type") int type); /*获取文档明细 type:1。显示收藏和浏览*/

    List<Long> getPm_Archivesidlist();

    List<Pm_Archives> getPm_ArchivesListid(Map<String, Object> map);//首页文档添加的除去id的方法

    Integer getCountPm_Archivesid(Map<String, Object> map);//首页文档添加的除去id的方法

    List<Map<String, Object>> getPm_Archivesidnocut();/*读取未切割列表*/

    List<Pm_Archives> get_Pmarchives(@Param("title") String title, @Param("id") Long id);

}
package com.morsearch.dao;

import com.morsearch.model.DesigV_Search_Archives;
import com.morsearch.model.DesigV_Search_ArchivesExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface DesigV_Search_ArchivesMapper {
    int countByExample(DesigV_Search_ArchivesExample example);

    int deleteByExample(DesigV_Search_ArchivesExample example);

    int insert(DesigV_Search_Archives record);

    int insertSelective(DesigV_Search_Archives record);

    List<DesigV_Search_Archives> selectByExample(DesigV_Search_ArchivesExample example);

    int updateByExampleSelective(@Param("record") DesigV_Search_Archives record, @Param("example") DesigV_Search_ArchivesExample example);

    int updateByExample(@Param("record") DesigV_Search_Archives record, @Param("example") DesigV_Search_ArchivesExample example);

  /*自定义*/
    List<DesigV_Search_Archives> getDesigV_Search_ArchivesList(Map<String, Object> map);//列表

    int getCountDesigV_Search_Archives(Map<String, Object> map);//总数
}
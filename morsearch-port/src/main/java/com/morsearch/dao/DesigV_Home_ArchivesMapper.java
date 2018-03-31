package com.morsearch.dao;

import com.morsearch.model.DesigV_Home_Archives;
import com.morsearch.model.DesigV_Home_ArchivesExample;
import java.util.List;
import java.util.Map;

import com.morsearch.model.DesigV_Home_Brand;
import org.apache.ibatis.annotations.Param;

public interface DesigV_Home_ArchivesMapper {
    int countByExample(DesigV_Home_ArchivesExample example);

    int deleteByExample(DesigV_Home_ArchivesExample example);

    int insert(DesigV_Home_Archives record);

    int insertSelective(DesigV_Home_Archives record);

    List<DesigV_Home_Archives> selectByExample(DesigV_Home_ArchivesExample example);

    int updateByExampleSelective(@Param("record") DesigV_Home_Archives record, @Param("example") DesigV_Home_ArchivesExample example);

    int updateByExample(@Param("record") DesigV_Home_Archives record, @Param("example") DesigV_Home_ArchivesExample example);

    //自定义的方法
    List<DesigV_Home_Archives> getDesigV_Home_ArchivesList(Map<String, Object> map);//设计师首页文档列表

    Integer getDesigV_Home_ArchivesListCount(Map<String, Object> map);//设计师首页文档数量

    List<DesigV_Home_Brand> getDesigV_Home_BrandList(Map<String, Object> map);//设计师首页品牌列表

    Integer getDesigV_Home_BrandListCount(Map<String, Object> map);//设计师首页品牌数量
}
package com.morsearch.dao;

import com.morsearch.model.Base_Version;
import com.morsearch.model.Base_VersionExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface Base_VersionMapper {
    int countByExample(Base_VersionExample example);

    int deleteByExample(Base_VersionExample example);

    int deleteByPrimaryKey(Long av_id);

    int insert(Base_Version record);

    int insertSelective(Base_Version record);

    List<Base_Version> selectByExample(Base_VersionExample example);

    Base_Version selectByPrimaryKey(Long av_id);

    int updateByExampleSelective(@Param("record") Base_Version record, @Param("example") Base_VersionExample example);

    int updateByExample(@Param("record") Base_Version record, @Param("example") Base_VersionExample example);

    int updateByPrimaryKeySelective(Base_Version record);

    int updateByPrimaryKey(Base_Version record);

    //查询版本的列表
    List<Base_Version> getVersionList(Map<String, Object> map);
    //查询版本的条数
    int getVersionListCount(Map<String, Object> map);

    Base_Version selectByPrimaryNo(Integer av_versioncode);

    Base_Version getversion(String type);
}
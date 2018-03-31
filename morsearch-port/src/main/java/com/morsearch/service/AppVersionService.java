package com.morsearch.service;

import com.morsearch.model.Base_Version;

import java.util.List;
import java.util.Map;

/**
 * Created by ywh on 2017-10-25.
 */
public interface AppVersionService {

    Base_Version selectByPrimaryKey(Long av_id);

    Base_Version selectByPrimaryNo(Integer av_versioncode);

    //查询版本的列表
    List<Base_Version> getVersionList(Map<String, Object> map);
    //查询版本的条数
    int getVersionListCount(Map<String, Object> map);

    Base_Version getversion(String type);

}

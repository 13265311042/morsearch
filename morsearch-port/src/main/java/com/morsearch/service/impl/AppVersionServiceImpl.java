package com.morsearch.service.impl;

import com.morsearch.dao.Base_VersionMapper;
import com.morsearch.model.Base_Version;
import com.morsearch.service.AppVersionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by hyt on 2017-10-25.
 */
@Service("AppVersionService")
public class AppVersionServiceImpl implements AppVersionService{


    @Resource
    private Base_VersionMapper base_versionMapper;

    @Override
    public Base_Version getversion(String type) {
        return base_versionMapper.getversion(type);
    }

    @Override
    public Base_Version selectByPrimaryKey(Long av_id) {
        return base_versionMapper.selectByPrimaryKey(av_id);
    }

    @Override
    public List<Base_Version> getVersionList(Map<String, Object> map) {
        return base_versionMapper.getVersionList(map);
    }

    @Override
    public int getVersionListCount(Map<String, Object> map) {
        return base_versionMapper.getVersionListCount(map);
    }

    @Override
    public Base_Version selectByPrimaryNo(Integer av_versioncode) {
        return base_versionMapper.selectByPrimaryNo(av_versioncode);
    }
}

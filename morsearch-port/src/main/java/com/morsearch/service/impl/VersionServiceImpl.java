package com.morsearch.service.impl;

import com.morsearch.common.util.FtpUtil;
import com.morsearch.dao.Base_VersionMapper;
import com.morsearch.model.Base_Version;
import com.morsearch.service.VersionService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * Created by hyt on 2017/10/19.
 */

@Service("VersionService")

public class VersionServiceImpl implements VersionService {

    @Resource
    private Base_VersionMapper base_versionMapper;

    @Override
    public List<Base_Version> getVersionList(Map<String,Object> map) {
        return base_versionMapper.getVersionList(map);
    }

    @Override
    public int getCountVersion(Map<String, Object> map) {
        return base_versionMapper.getVersionListCount(map);
    }

    @Override
    public int addVersion(Base_Version bv) {
        return base_versionMapper.insertSelective(bv);
    }

    @Override
    public int deleteVersionById(Long av_id) {
        return base_versionMapper.deleteByPrimaryKey(av_id);
    }

    @Override
    public Base_Version getVersiondetail(Long av_id) {
       return base_versionMapper.selectByPrimaryKey(av_id);
    }

    @Override
    public int updateVersion(Base_Version bv) {
        return base_versionMapper.updateByPrimaryKeySelective(bv);
    }

    @Override
    public void upload(MultipartFile myfile) throws Exception{

        Properties p = new Properties();
        InputStream is = null;
        is=Thread.currentThread().getContextClassLoader().getResourceAsStream("ftp.properties");
        p.load(is);
        String ADDRESS = p.getProperty("FTP_ADDRESS");
        String PORT = p.getProperty("FTP_PORT");
        String USERNAME = p.getProperty("FTP_USERNAME");
        String PASSWORD = p.getProperty("FTP_PASSWORD");
        if(!myfile.isEmpty()){
            String NewName=myfile.getOriginalFilename();
            int port = Integer.parseInt(PORT);
            FtpUtil.uploadFile(ADDRESS, port, USERNAME, PASSWORD, "download", NewName, myfile.getInputStream());
        }

    }
}

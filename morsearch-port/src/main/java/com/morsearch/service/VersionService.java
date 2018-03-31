package com.morsearch.service;

import com.morsearch.model.Base_Version;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

/**
 * Created by hyt on 2017/10/19.
 */
public interface VersionService {
    List<Base_Version> getVersionList(Map<String, Object> map);//得到版本列表
    int getCountVersion(Map<String, Object> map);//得到版本条数
    int addVersion(Base_Version bv);//添加版本
    int deleteVersionById(Long av_id);//删除版本
    Base_Version getVersiondetail(Long av_id);//得到版本的详细的信息
    int updateVersion(Base_Version bv);//更新版本

    void upload(MultipartFile myfile) throws Exception;//上传文件
}

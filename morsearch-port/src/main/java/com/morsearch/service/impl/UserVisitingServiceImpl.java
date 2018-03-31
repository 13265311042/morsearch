package com.morsearch.service.impl;

import com.morsearch.common.util.FtpUtil;
import com.morsearch.common.util.SequenceCreator;
import com.morsearch.dao.Sys_UserMapper;
import com.morsearch.dao.Sys_User_VisitingMapper;
import com.morsearch.model.Sys_User;
import com.morsearch.model.Sys_User_Visiting;
import com.morsearch.service.UserVisitingService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.annotation.Resource;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by ywh on 2018-1-16.
 *
 *
 */
@Service("UserVisitingService")
public class UserVisitingServiceImpl implements UserVisitingService {


    @Resource
    private Sys_User_VisitingMapper sysUserVisitingMapper;
    @Resource
    private Sys_UserMapper userMapper;

    @Override
    public Sys_User_Visiting selectByPrimaryKey(Long uv_id) {
        return sysUserVisitingMapper.selectByPrimaryKey(uv_id);
    }

    @Override
    public int saveSys_User_Visiting(String userid, String base, CommonsMultipartFile photo) {
        int rut=0;
        try{
        Properties p = new Properties();
        InputStream is = null;
        is=Thread.currentThread().getContextClassLoader().getResourceAsStream("ftp.properties");
        p.load(is);
        String ADDRESS = p.getProperty("FTP_ADDRESS");
        String PORT = p.getProperty("FTP_PORT");
        String USERNAME = p.getProperty("FTP_USERNAME");
        String PASSWORD = p.getProperty("FTP_PASSWORD");

            String filename = SequenceCreator.createNewFileName() + ".jpg";
            Boolean ftprut= FtpUtil.uploadFile(ADDRESS, Integer.parseInt(PORT), USERNAME, PASSWORD, "images/visitingcard", filename, photo.getInputStream());
            if (ftprut==true) {
                Sys_User_Visiting suv = new Sys_User_Visiting();
                suv.setUv_id(Long.valueOf(userid));
                suv.setUv_image(filename);
                suv.setUv_body(base);
                Sys_User su = new Sys_User();
                su.setUr_id(Long.valueOf(userid));
                su.setUr_leveltype((byte)1);
                userMapper.updateByPrimaryKeySelective(su);
                rut = sysUserVisitingMapper.insertSelective(suv);
            }
        }catch (Exception e) {
                return 0;
        }

        return rut;
    }
}

package com.morsearch.service.impl;

import com.morsearch.dao.BaseV_Company_UserMapper;
import com.morsearch.model.BaseV_Company_User;
import com.morsearch.service.BaseVCompanyUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by ywh on 2017-12-14.
 */
@Service("BaseVCompanyUserService")
public class BaseVCompanyUserServiceImpl implements BaseVCompanyUserService {
    @Resource
    private BaseV_Company_UserMapper baseV_company_userMapper;

    @Override
    public List<BaseV_Company_User> getBaseV_Company_UserList(Map<String, Object> map) {
        return baseV_company_userMapper.getBaseV_Company_UserList(map);
    }

    @Override
    public List<BaseV_Company_User> getBaseV_Company_UserList1(Map<String, Object> map) {
        return baseV_company_userMapper.getBaseV_Company_UserList1(map);
    }

    @Override
    public int getCountBaseV_Company_User(Map<String, Object> map) {
        return baseV_company_userMapper.getCountBaseV_Company_User(map);
    }



}

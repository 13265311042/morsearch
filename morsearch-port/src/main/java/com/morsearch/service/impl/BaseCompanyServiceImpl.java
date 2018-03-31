package com.morsearch.service.impl;

import com.morsearch.dao.Base_CompanyMapper;
import com.morsearch.dao.Base_Company_UserMapper;
import com.morsearch.model.Base_Company;
import com.morsearch.model.Base_Company_User;
import com.morsearch.service.BaseCompanyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by ywh on 2017-12-13.
 */
@Service("BaseCompanyService")
public class BaseCompanyServiceImpl implements BaseCompanyService{
        @Resource
        private Base_CompanyMapper base_companyMapper;
        @Resource
        private Base_Company_UserMapper base_company_userMapper;

    @Override
    public Map<String,Object> selectBase_Company(Long id) {
        return base_companyMapper.selectBase_Company(id);
    }

    @Override
    public Base_Company getBase_Company(Long id) {
        return base_companyMapper.getBase_Company(id);
    }

    @Override
    public int insertSelective(Base_Company record) {
        return base_companyMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKeySelective(Base_Company record) {
        return base_companyMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<Base_Company_User> selectBase_Company_User(Integer id) {
        return base_company_userMapper.selectBase_Company_User(id);
    }

    @Override
    public int insertSelective(Base_Company_User record) {
        return base_company_userMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKeySelective(Base_Company_User record) {
        return base_company_userMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<Map<String,Object>>  getBaseCompanyID(String cy_name) {
        return base_companyMapper.getBaseCompanyID(cy_name);
    }

    @Override
    public List<Base_Company_User> selectByid(Integer id) {
        return base_company_userMapper.selectByid(id);
    }

    @Override
    public List<Base_Company> getBase_CompanyList(Map<String, Object> map) {
        return base_companyMapper.getBase_CompanyList(map);
    }

    @Override
    public int getCountBase_Company(Map<String, Object> map) {
        return base_companyMapper.getCountBase_Company(map);
    }
}

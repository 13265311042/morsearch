package com.morsearch.service;

import com.morsearch.model.Base_Company;
import com.morsearch.model.Base_Company_User;

import java.util.List;
import java.util.Map;

/**
 * Created by ywh on 2017-12-13.
 */
public interface BaseCompanyService {

    Map<String,Object> selectBase_Company(Long id);

    Base_Company getBase_Company(Long id);

    int insertSelective(Base_Company record);

    int updateByPrimaryKeySelective(Base_Company record);

    List<Base_Company_User> selectBase_Company_User(Integer id);

    int insertSelective(Base_Company_User record);

    int updateByPrimaryKeySelective(Base_Company_User record);

    List<Map<String,Object>>  getBaseCompanyID(String cy_name);

    List<Base_Company_User> selectByid(Integer id);

    List<Base_Company> getBase_CompanyList(Map<String, Object> map);/*列表*/

    int getCountBase_Company(Map<String, Object> map);

}

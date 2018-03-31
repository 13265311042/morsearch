package com.morsearch.dao;

import com.morsearch.model.Base_Company;
import com.morsearch.model.Base_CompanyExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface Base_CompanyMapper {
    int countByExample(Base_CompanyExample example);

    int deleteByExample(Base_CompanyExample example);

    int deleteByPrimaryKey(Integer cy_id);

    int insert(Base_Company record);

    int insertSelective(Base_Company record);

    List<Base_Company> selectByExample(Base_CompanyExample example);

    Base_Company selectByPrimaryKey(Integer cy_id);

    int updateByExampleSelective(@Param("record") Base_Company record, @Param("example") Base_CompanyExample example);

    int updateByExample(@Param("record") Base_Company record, @Param("example") Base_CompanyExample example);

    int updateByPrimaryKeySelective(Base_Company record);

    int updateByPrimaryKey(Base_Company record);

    /*自定义*/
    Map<String,Object> selectBase_Company(Long id);

    List<Map<String,Object>>  getBaseCompanyID(String cy_name);

    List<Base_Company> getBase_CompanyList(Map<String, Object> map);/*列表*/

    int getCountBase_Company(Map<String, Object> map);

    Base_Company getBase_Company(Long id);
}
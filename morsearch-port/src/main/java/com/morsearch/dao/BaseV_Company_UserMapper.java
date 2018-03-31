package com.morsearch.dao;

import com.morsearch.model.BaseV_Company_User;
import com.morsearch.model.BaseV_Company_UserExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface BaseV_Company_UserMapper {
    int countByExample(BaseV_Company_UserExample example);

    int deleteByExample(BaseV_Company_UserExample example);

    int insert(BaseV_Company_User record);

    int insertSelective(BaseV_Company_User record);

    List<BaseV_Company_User> selectByExample(BaseV_Company_UserExample example);

    int updateByExampleSelective(@Param("record") BaseV_Company_User record, @Param("example") BaseV_Company_UserExample example);

    int updateByExample(@Param("record") BaseV_Company_User record, @Param("example") BaseV_Company_UserExample example);

    List<BaseV_Company_User> getBaseV_Company_UserList(Map<String, Object> map); //列表

    int getCountBaseV_Company_User(Map<String, Object> map);//数量

    BaseV_Company_User getBaseV_Company_User(Long id);

    List<BaseV_Company_User> getBaseV_Company_UserList1(Map<String, Object> map); //列表
}
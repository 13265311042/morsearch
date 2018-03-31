package com.morsearch.dao;

import com.morsearch.model.Base_Company_User;
import com.morsearch.model.Base_Company_UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Base_Company_UserMapper {
    int countByExample(Base_Company_UserExample example);

    int deleteByExample(Base_Company_UserExample example);

    int deleteByPrimaryKey(Long bcu_id);

    int insert(Base_Company_User record);

    int insertSelective(Base_Company_User record);

    List<Base_Company_User> selectByExample(Base_Company_UserExample example);

    Base_Company_User selectByPrimaryKey(Long bcu_id);

    int updateByExampleSelective(@Param("record") Base_Company_User record, @Param("example") Base_Company_UserExample example);

    int updateByExample(@Param("record") Base_Company_User record, @Param("example") Base_Company_UserExample example);

    int updateByPrimaryKeySelective(Base_Company_User record);

    int updateByPrimaryKey(Base_Company_User record);

    List<Base_Company_User> selectBase_Company_User(Integer id);

    List<Base_Company_User> selectByid(Integer id);
}
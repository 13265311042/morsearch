package com.morsearch.dao;

import com.morsearch.model.Base_City;
import com.morsearch.model.Base_CityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Base_CityMapper {
    int countByExample(Base_CityExample example);

    int deleteByExample(Base_CityExample example);

    int deleteByPrimaryKey(Integer bc_cityid);

    int insert(Base_City record);

    int insertSelective(Base_City record);

    List<Base_City> selectByExample(Base_CityExample example);

    Base_City selectByPrimaryKey(Integer bc_cityid);

    int updateByExampleSelective(@Param("record") Base_City record, @Param("example") Base_CityExample example);

    int updateByExample(@Param("record") Base_City record, @Param("example") Base_CityExample example);

    int updateByPrimaryKeySelective(Base_City record);

    int updateByPrimaryKey(Base_City record);
}
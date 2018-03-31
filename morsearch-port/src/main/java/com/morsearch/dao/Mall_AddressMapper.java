package com.morsearch.dao;

import com.morsearch.model.Mall_Address;
import com.morsearch.model.Mall_AddressExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface Mall_AddressMapper {
    int countByExample(Mall_AddressExample example);

    int deleteByExample(Mall_AddressExample example);

    int deleteByPrimaryKey(Long ma_id);

    int insert(Mall_Address record);

    int insertSelective(Mall_Address record);

    List<Mall_Address> selectByExample(Mall_AddressExample example);

    Mall_Address selectByPrimaryKey(Long ma_id);

    int updateByExampleSelective(@Param("record") Mall_Address record, @Param("example") Mall_AddressExample example);

    int updateByExample(@Param("record") Mall_Address record, @Param("example") Mall_AddressExample example);

    int updateByPrimaryKeySelective(Mall_Address record);

    int updateByPrimaryKey(Mall_Address record);


    /*自定义*/
    List<Mall_Address> getMall_AddressList(Map<String, Object> map);//列表

    int getCountMall_Address(Map<String, Object> map);//条数

    Mall_Address selectMall_Address(Long id);

}
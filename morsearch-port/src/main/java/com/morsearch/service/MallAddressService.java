package com.morsearch.service;

import com.morsearch.model.Mall_Address;

import java.util.List;
import java.util.Map;

/**
 * Created by ywh on 2017-12-13.
 */
public interface MallAddressService {

    int insertSelective(Mall_Address record);

    int updateByPrimaryKeySelective(Mall_Address record);

    List<Mall_Address> getMall_AddressList(Map<String, Object> map);//列表

    int getCountMall_Address(Map<String, Object> map);//条数

    Mall_Address selectMall_Address(Long id);
}

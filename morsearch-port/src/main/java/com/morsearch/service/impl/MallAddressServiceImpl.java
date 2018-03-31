package com.morsearch.service.impl;

import com.morsearch.dao.Mall_AddressMapper;
import com.morsearch.model.Mall_Address;
import com.morsearch.service.MallAddressService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by ywh on 2017-12-13.
 */
@Service("MallAddressService")
public class MallAddressServiceImpl implements MallAddressService{
    @Resource
    private Mall_AddressMapper mall_addressMapper;

    @Override
    public int insertSelective(Mall_Address record) {
        return mall_addressMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKeySelective(Mall_Address record) {
        return mall_addressMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<Mall_Address> getMall_AddressList(Map<String, Object> map) {
        return mall_addressMapper.getMall_AddressList(map);
    }

    @Override
    public int getCountMall_Address(Map<String, Object> map) {
        return mall_addressMapper.getCountMall_Address(map);
    }

    @Override
    public Mall_Address selectMall_Address(Long id) {
        return mall_addressMapper.selectMall_Address(id);
    }
}

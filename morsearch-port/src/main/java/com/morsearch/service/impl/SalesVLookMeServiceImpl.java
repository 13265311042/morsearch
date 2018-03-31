package com.morsearch.service.impl;

import com.morsearch.dao.SalesV_LookMeMapper;
import com.morsearch.model.SalesV_LookMe;
import com.morsearch.service.SalesVLookMeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by hyt on 2017/10/24.
 */

@Service("SalesVLookMeService")
public class SalesVLookMeServiceImpl implements SalesVLookMeService {


    @Autowired
    private SalesV_LookMeMapper salesV_lookMeMapper;

    public SalesVLookMeServiceImpl() {
        super();
    }

    @Override
    public int getLookListCount(Map<String, Object> map) {
        return salesV_lookMeMapper.getLookListCount(map);
    }

    @Override
    public List<SalesV_LookMe> getLookList(Map<String, Object> map) {
        return salesV_lookMeMapper.getLookList(map);
    }
}

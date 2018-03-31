package com.morsearch.service.impl;

import com.morsearch.dao.SalesV_InterestMapper;
import com.morsearch.model.SalesV_Interest;
import com.morsearch.service.SalesVInterestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by hyt on 2017/10/25.
 */
@Service("SalesVInterestService")
public class SalesVInterestServiceImpl implements SalesVInterestService {

@Resource
private SalesV_InterestMapper salesV_interestMapper;


    @Override
    public List<SalesV_Interest> getinterestList(Map<String, Object> map) {
        return salesV_interestMapper.getInterestList(map);
    }

    @Override
    public int getinterestListCount(Map<String, Object> map) {
        return salesV_interestMapper.getInterestListCount(map);
    }
}

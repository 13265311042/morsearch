package com.morsearch.service;

import com.morsearch.model.SalesV_Interest;
import com.morsearch.model.SalesV_LookMe;

import java.util.List;
import java.util.Map;

/**
 * Created by hyt on 2017/10/25.
 */
public interface SalesVInterestService {

    List<SalesV_Interest> getinterestList(Map<String, Object> map);//得到评价列表

    int getinterestListCount(Map<String, Object> map);
}

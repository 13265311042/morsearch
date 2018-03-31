package com.morsearch.service;

import com.morsearch.model.Acc_Largess;
import com.morsearch.model.Acc_LargessKey;

import java.util.List;
import java.util.Map;

/**
 * Created by ywh on 2017-11-30.
 */
public interface AccLargessService {

    List<Acc_Largess> getAcc_LargessList(Map<String, Object> map); //列表

    int getCountAcc_Largess(Map<String, Object> map);//数量

    Acc_Largess getAcc_Largess(Long id);

    int insertSelective(Acc_Largess record);

    int updateByPrimaryKeySelective(Acc_Largess record);

    int deleteByAcc_Largess(int id);
}

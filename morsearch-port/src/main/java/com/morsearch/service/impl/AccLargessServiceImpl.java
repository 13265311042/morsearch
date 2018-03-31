package com.morsearch.service.impl;

import com.morsearch.dao.Acc_LargessMapper;
import com.morsearch.model.Acc_Largess;
import com.morsearch.service.AccLargessService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by ywh on 2017-11-30.
 */
@Service("AccLargessService")
public class AccLargessServiceImpl implements AccLargessService{

    @Resource
    private Acc_LargessMapper acc_largessMapper;
    @Override
    public List<Acc_Largess> getAcc_LargessList(Map<String, Object> map) {
        return acc_largessMapper.getAcc_LargessList(map);
    }

    @Override
    public int getCountAcc_Largess(Map<String, Object> map) {
        return acc_largessMapper.getCountAcc_Largess(map);
    }

    @Override
    public int insertSelective(Acc_Largess record) {
        return acc_largessMapper.insertSelective(record);
    }

    @Override
    public int deleteByAcc_Largess(int id) {
        return acc_largessMapper.deleteByAcc_Largess(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Acc_Largess record) {
        return acc_largessMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public Acc_Largess getAcc_Largess(Long id) {
        return acc_largessMapper.getAcc_Largess(id);
    }
}

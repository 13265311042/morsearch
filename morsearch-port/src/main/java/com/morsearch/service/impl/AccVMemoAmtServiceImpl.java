package com.morsearch.service.impl;

import com.morsearch.dao.AccV_MemoAmtMapper;
import com.morsearch.model.AccV_MemoAmt;
import com.morsearch.service.AccVMemoAmtService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by ywh on 2017-12-21.
 */
@Service("AccVMemoAmtService")
public class AccVMemoAmtServiceImpl implements AccVMemoAmtService{
    @Resource
    private AccV_MemoAmtMapper accV_memoAmtMapper;

    @Override
    public List<AccV_MemoAmt> getAccV_MemoAmtlist(Map<String, Object> map) {
        return accV_memoAmtMapper.getAccV_MemoAmtlist(map);
    }

    @Override
    public int getCountAccV_MemoAmt(Map<String, Object> map) {
        return accV_memoAmtMapper.getCountAccV_MemoAmt(map);
    }
}

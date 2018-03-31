package com.morsearch.service;

import com.morsearch.model.AccV_MemoAmt;

import java.util.List;
import java.util.Map;

/**
 * Created by ywh on 2017-12-21.
 */
public interface AccVMemoAmtService {

    List<AccV_MemoAmt> getAccV_MemoAmtlist(Map<String, Object> map);//列表

    int getCountAccV_MemoAmt(Map<String, Object> map);//总数

}

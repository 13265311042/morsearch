package com.morsearch.service;

import com.morsearch.model.Acc_MemoIntegral;

import java.util.List;
import java.util.Map;

/**
 * Created by ywh on 2018-2-8.
 */
public interface AccMemoIntegralService {

    List<Acc_MemoIntegral> getAcc_MemoIntegralList(Map<String, Object> map); //列表

    int getCountAcc_MemoIntegral(Map<String, Object> map);//数量

}

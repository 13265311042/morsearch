package com.morsearch.service;

import com.morsearch.model.MallV_Evaluate;
import com.morsearch.model.Mall_Evaluate;

import java.util.List;
import java.util.Map;

/**
 * Created by hyt on 2017/12/19.
 */
public interface MallEvaluateService {


    List<Mall_Evaluate> getMall_EvaluateList(Map<String, Object> map);//查看评论列表

    Integer getCountMall_Evaluate(Map<String, Object> map);//评论列表条数

    List<MallV_Evaluate> getMallV_EvaluateList(Map<String, Object> map);//后台订单评价列表

    Integer getCountMallV_Evaluate(Map<String, Object> map);//后台订单评价列表的视图
}

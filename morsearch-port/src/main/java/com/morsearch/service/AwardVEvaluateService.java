package com.morsearch.service;

import com.morsearch.model.*;

import java.util.List;
import java.util.Map;

/**
 * Created by hyt on 2017/12/14.
 */
public interface AwardVEvaluateService {
    List<AwardV_Evaluate> getAwardV_EvaluateList(Map<String, Object> map);

    Integer getCountAwardV_Evaluate(Map<String, Object> map);

    int addAward_Evaluate(Award_Evaluate ba);

    Award_Evaluate getAward_Evaluatedetail(long l);

    int updateAward_Evaluate(Award_Evaluate ar);

    int deleteAward_EvaluateById(long l);//删除

    int updateAward_Evaluatestatus(Award_Evaluate ar);//发布

    List<AwardV_Evaluate_Count> getAwardV_Evaluate_Countdetaillist(long l);//查询评价赠送统计

    List<AwardV_Evaluate_Count> getAwardV_Evaluate_CountList(Map<String, Object> map);//查询特点活动的评价统计列表

    Integer getCountAwardV_Evaluate_Count(Map<String, Object> map);//记录查询的总数
}

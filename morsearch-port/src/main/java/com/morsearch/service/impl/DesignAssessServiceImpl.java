package com.morsearch.service.impl;

import com.morsearch.dao.Desig_EvaluateMapper;
import com.morsearch.model.Desig_Evaluate;
import com.morsearch.service.DesignAssessService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by hyt on 2017/10/19.
 */

@Service("DesignAssessService")
public class DesignAssessServiceImpl implements DesignAssessService{
    @Resource
    private Desig_EvaluateMapper desig_evaluateMapper;

    @Override
    public List<Desig_Evaluate> getDesigList(Map<String, Object> map) {
        return desig_evaluateMapper.getDesigList(map);
    }


    @Override
    public int getDesigListCount(Map<String, Object> map) {
        return desig_evaluateMapper.getDesigListCount(map);
    }
}

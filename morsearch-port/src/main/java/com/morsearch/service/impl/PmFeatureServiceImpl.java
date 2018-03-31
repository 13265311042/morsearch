package com.morsearch.service.impl;

import com.morsearch.common.util.CommonUtil;
import com.morsearch.dao.Pm_FeaturesMapper;
import com.morsearch.model.Pm_Features;
import com.morsearch.model.Pm_FeaturesExample;
import com.morsearch.model.Pm_Style;
import com.morsearch.service.PmFeaturesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by ywh on 2017-10-30.
 */
@Service("PmFeaturesService")
public class PmFeatureServiceImpl implements PmFeaturesService{
    @Autowired
    private Pm_FeaturesMapper pm_featuresMapper;

    @Override
    public int insertSelective(Pm_Features record) {
        return pm_featuresMapper.insertSelective(record);
    }

    @Override
    public List<Pm_Features> getFeaturesList(Long id) {
        return pm_featuresMapper.getFeaturesList(id);
    }

    @Override
    public int getFeaturesListCount(Long pf_styleid, String pf_name) {
        Pm_FeaturesExample ll = new Pm_FeaturesExample();

        Pm_FeaturesExample.Criteria criteria = ll.createCriteria();
		/*我添加的这个条件*/
        if (!CommonUtil.isNullOrEmpty(pf_styleid)) {
            criteria.andPf_styleidEqualTo(pf_styleid);
        }
        if (pf_name != null) {
            criteria.andPf_nameEqualTo(pf_name);
        }
        return pm_featuresMapper.getFeaturesListCount(pf_styleid,pf_name);
    }

    @Override
    public List<Pm_Features> getPm_FeaturesList(Map<String, Object> map) {
        return pm_featuresMapper.getPm_FeaturesList(map);
    }

    @Override
    public int getCountPm_Features(Map<String, Object> map) {
        return pm_featuresMapper.getCountPm_Features(map);
    }

    @Override
    public Pm_Features getPm_Features(Long id) {
        return pm_featuresMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updatePm_Features(Pm_Features record) {
        return pm_featuresMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int addPm_Features(Pm_Features pf) {
        return pm_featuresMapper.insertSelective(pf);
    }

    @Override
    public int deletePm_feature(long l) {
        return pm_featuresMapper.deleteByPrimaryKey(l);
    }


}

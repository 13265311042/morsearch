package com.morsearch.service;

import com.morsearch.model.Pm_Features;
import com.morsearch.model.Pm_Style;

import java.util.List;
import java.util.Map;

/**
 * Created by ywh on 2017-10-30.
 */
public interface PmFeaturesService {

    int getFeaturesListCount(Long pf_styleid, String pf_name);/*查询数量*/

    int insertSelective(Pm_Features record);

    List<Pm_Features> getFeaturesList(Long id);

    List<Pm_Features> getPm_FeaturesList(Map<String, Object> map);//产品特性的列表

    int getCountPm_Features(Map<String, Object> map);//产品特性的数量

    Pm_Features getPm_Features(Long id);//查询产品特性的详细信息

    int updatePm_Features(Pm_Features record);//修改

    int addPm_Features(Pm_Features pf);//产品特性添加

    int deletePm_feature(long l);//产品特性删除
}

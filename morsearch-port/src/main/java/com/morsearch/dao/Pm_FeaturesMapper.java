package com.morsearch.dao;

import com.morsearch.model.Pm_Features;
import com.morsearch.model.Pm_FeaturesExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface Pm_FeaturesMapper {
    int countByExample(Pm_FeaturesExample example);

    int deleteByExample(Pm_FeaturesExample example);

    int deleteByPrimaryKey(Long pf_id);

    int insert(Pm_Features record);

    int insertSelective(Pm_Features record);

    List<Pm_Features> selectByExample(Pm_FeaturesExample example);

    Pm_Features selectByPrimaryKey(Long pf_id);

    int updateByExampleSelective(@Param("record") Pm_Features record, @Param("example") Pm_FeaturesExample example);

    int updateByExample(@Param("record") Pm_Features record, @Param("example") Pm_FeaturesExample example);

    int updateByPrimaryKeySelective(Pm_Features record);

    int updateByPrimaryKey(Pm_Features record);

    int getFeaturesListCount(@Param("pf_styleid") Long pf_styleid, @Param("pf_name") String pf_name);/*查询标签类型数量*/

    List<Pm_Features> getFeaturesList(Long id);

    List<Pm_Features> getPm_FeaturesList(Map<String, Object> map);//产品特性的列表

    int getCountPm_Features(Map<String, Object> map);//产品特性的数量
}
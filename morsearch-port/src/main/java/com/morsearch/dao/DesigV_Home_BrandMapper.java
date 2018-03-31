package com.morsearch.dao;

import com.morsearch.model.DesigV_Home_Brand;
import com.morsearch.model.DesigV_Home_BrandExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface DesigV_Home_BrandMapper {
    int countByExample(DesigV_Home_BrandExample example);

    int deleteByExample(DesigV_Home_BrandExample example);

    int insert(DesigV_Home_Brand record);

    int insertSelective(DesigV_Home_Brand record);

    List<DesigV_Home_Brand> selectByExample(DesigV_Home_BrandExample example);

    int updateByExampleSelective(@Param("record") DesigV_Home_Brand record, @Param("example") DesigV_Home_BrandExample example);

    int updateByExample(@Param("record") DesigV_Home_Brand record, @Param("example") DesigV_Home_BrandExample example);

    //自定义
    List<DesigV_Home_Brand> getDesigV_Home_BrandList(Map<String, Object> map);//设计师首页品牌列表

    Integer getDesigV_Home_BrandListCount(Map<String, Object> map);//设计师首页品牌数量
}
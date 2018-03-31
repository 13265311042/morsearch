package com.morsearch.dao;

import com.morsearch.model.MallV_Home;
import com.morsearch.model.MallV_HomeExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface MallV_HomeMapper {
    int countByExample(MallV_HomeExample example);

    int deleteByExample(MallV_HomeExample example);

    int insert(MallV_Home record);

    int insertSelective(MallV_Home record);

    List<MallV_Home> selectByExample(MallV_HomeExample example);

    int updateByExampleSelective(@Param("record") MallV_Home record, @Param("example") MallV_HomeExample example);

    int updateByExample(@Param("record") MallV_Home record, @Param("example") MallV_HomeExample example);

    //自定义
    List<MallV_Home> getMallV_HomeList(Map<String, Object> map);//热门商品还是品牌商品

    Integer getCountMallV_Home(Map<String, Object> map);//热门商品或者品牌商品的数量

    List<MallV_Home> getMallV_Home_show(@Param("type") Integer type,@Param("mhid") Long mhid);//商品


}
package com.morsearch.dao;

import com.morsearch.model.MallV_Goods_List;
import com.morsearch.model.MallV_Goods_ListExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface MallV_Goods_ListMapper {
    int countByExample(MallV_Goods_ListExample example);

    int deleteByExample(MallV_Goods_ListExample example);

    int insert(MallV_Goods_List record);

    int insertSelective(MallV_Goods_List record);

    List<MallV_Goods_List> selectByExample(MallV_Goods_ListExample example);

    int updateByExampleSelective(@Param("record") MallV_Goods_List record, @Param("example") MallV_Goods_ListExample example);

    int updateByExample(@Param("record") MallV_Goods_List record, @Param("example") MallV_Goods_ListExample example);

    //自定义
    List<MallV_Goods_List> getMallV_Goods_ListList(Map<String, Object> map);//后台商品列表

    Integer getCountMallV_Goods_List(Map<String, Object> map);//后台商品数量
}
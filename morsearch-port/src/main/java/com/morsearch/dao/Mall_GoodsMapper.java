package com.morsearch.dao;

import com.morsearch.model.Mall_Goods;
import com.morsearch.model.Mall_GoodsExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface Mall_GoodsMapper {
    int countByExample(Mall_GoodsExample example);

    int deleteByExample(Mall_GoodsExample example);

    int deleteByPrimaryKey(Long mg_id);

    int insert(Mall_Goods record);

    int insertSelective(Mall_Goods record);

    List<Mall_Goods> selectByExampleWithBLOBs(Mall_GoodsExample example);

    List<Mall_Goods> selectByExample(Mall_GoodsExample example);

    Mall_Goods selectByPrimaryKey(Long mg_id);

    int updateByExampleSelective(@Param("record") Mall_Goods record, @Param("example") Mall_GoodsExample example);

    int updateByExampleWithBLOBs(@Param("record") Mall_Goods record, @Param("example") Mall_GoodsExample example);

    int updateByExample(@Param("record") Mall_Goods record, @Param("example") Mall_GoodsExample example);

    int updateByPrimaryKeySelective(Mall_Goods record);

    int updateByPrimaryKeyWithBLOBs(Mall_Goods record);

    int updateByPrimaryKey(Mall_Goods record);

/*自定义*/
    Mall_Goods getGoodsMemo(@Param("mg_id") Long mg_id, @Param("type") int type);/*查相关明细*/

    Mall_Goods getMall_Goodsdetail(@Param("mg_id") long l, @Param("type") int type);//查看商城商品详细信息

    List<Mall_Goods> getMall_GoodsListid1(Map<String, Object> map);//详情mall_goods

    Integer getCountMall_Goodsid1(Map<String, Object> map);//数量

    List<Mall_Goods> getMall_GoodsListid2(Map<String, Object> map);//详情mall_goods

    Integer getCountMall_Goodsid2(Map<String, Object> map);//数量


}
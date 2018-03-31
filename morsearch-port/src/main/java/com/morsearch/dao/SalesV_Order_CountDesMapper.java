package com.morsearch.dao;

import com.morsearch.model.SalesV_Order_CountDes;
import com.morsearch.model.SalesV_Order_CountDesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalesV_Order_CountDesMapper {
    int countByExample(SalesV_Order_CountDesExample example);

    int deleteByExample(SalesV_Order_CountDesExample example);

    int insert(SalesV_Order_CountDes record);

    int insertSelective(SalesV_Order_CountDes record);

    List<SalesV_Order_CountDes> selectByExample(SalesV_Order_CountDesExample example);

    int updateByExampleSelective(@Param("record") SalesV_Order_CountDes record, @Param("example") SalesV_Order_CountDesExample example);

    int updateByExample(@Param("record") SalesV_Order_CountDes record, @Param("example") SalesV_Order_CountDesExample example);

/*自定义*/

    SalesV_Order_CountDes getDesOrderCount(@Param("userid") Long userid);/*设计师统计数量订单状态*/

}
package com.morsearch.dao;

import com.morsearch.model.MallV_Order;
import com.morsearch.model.MallV_OrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MallV_OrderMapper {
    int countByExample(MallV_OrderExample example);

    int deleteByExample(MallV_OrderExample example);

    int insert(MallV_Order record);

    int insertSelective(MallV_Order record);

    List<MallV_Order> selectByExample(MallV_OrderExample example);

    int updateByExampleSelective(@Param("record") MallV_Order record, @Param("example") MallV_OrderExample example);

    int updateByExample(@Param("record") MallV_Order record, @Param("example") MallV_OrderExample example);
}
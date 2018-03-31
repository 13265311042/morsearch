package com.morsearch.dao;

import com.morsearch.model.Msg_Order;
import com.morsearch.model.Msg_OrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Msg_OrderMapper {
    int countByExample(Msg_OrderExample example);

    int deleteByExample(Msg_OrderExample example);

    int deleteByPrimaryKey(Long mo_id);

    int insert(Msg_Order record);

    int insertSelective(Msg_Order record);

    List<Msg_Order> selectByExample(Msg_OrderExample example);

    Msg_Order selectByPrimaryKey(Long mo_id);

    int updateByExampleSelective(@Param("record") Msg_Order record, @Param("example") Msg_OrderExample example);

    int updateByExample(@Param("record") Msg_Order record, @Param("example") Msg_OrderExample example);

    int updateByPrimaryKeySelective(Msg_Order record);

    int updateByPrimaryKey(Msg_Order record);
}
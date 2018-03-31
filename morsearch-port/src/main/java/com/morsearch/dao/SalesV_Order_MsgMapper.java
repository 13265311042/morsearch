package com.morsearch.dao;

import com.morsearch.model.SalesV_Order_Msg;
import com.morsearch.model.SalesV_Order_MsgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalesV_Order_MsgMapper {
    int countByExample(SalesV_Order_MsgExample example);

    int deleteByExample(SalesV_Order_MsgExample example);

    int insert(SalesV_Order_Msg record);

    int insertSelective(SalesV_Order_Msg record);

    List<SalesV_Order_Msg> selectByExample(SalesV_Order_MsgExample example);

    int updateByExampleSelective(@Param("record") SalesV_Order_Msg record, @Param("example") SalesV_Order_MsgExample example);

    int updateByExample(@Param("record") SalesV_Order_Msg record, @Param("example") SalesV_Order_MsgExample example);
}
package com.morsearch.dao;

import com.morsearch.model.MsgV_Order_List;
import com.morsearch.model.MsgV_Order_ListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsgV_Order_ListMapper {
    int countByExample(MsgV_Order_ListExample example);

    int deleteByExample(MsgV_Order_ListExample example);

    int insert(MsgV_Order_List record);

    int insertSelective(MsgV_Order_List record);

    List<MsgV_Order_List> selectByExample(MsgV_Order_ListExample example);

    int updateByExampleSelective(@Param("record") MsgV_Order_List record, @Param("example") MsgV_Order_ListExample example);

    int updateByExample(@Param("record") MsgV_Order_List record, @Param("example") MsgV_Order_ListExample example);
}
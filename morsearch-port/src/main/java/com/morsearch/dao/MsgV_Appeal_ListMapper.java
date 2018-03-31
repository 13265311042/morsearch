package com.morsearch.dao;

import com.morsearch.model.MsgV_Appeal_List;
import com.morsearch.model.MsgV_Appeal_ListExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface MsgV_Appeal_ListMapper {
    int countByExample(MsgV_Appeal_ListExample example);

    int deleteByExample(MsgV_Appeal_ListExample example);

    int insert(MsgV_Appeal_List record);

    int insertSelective(MsgV_Appeal_List record);

    List<MsgV_Appeal_List> selectByExample(MsgV_Appeal_ListExample example);

    int updateByExampleSelective(@Param("record") MsgV_Appeal_List record, @Param("example") MsgV_Appeal_ListExample example);

    int updateByExample(@Param("record") MsgV_Appeal_List record, @Param("example") MsgV_Appeal_ListExample example);

    /*自定义*/
    List<MsgV_Appeal_List> getSalesV_Appeal_MsgList(Map<String, Object> map);//列表
    int getCountSalesV_Appeal_Msg(Map<String, Object> map);//条数

}
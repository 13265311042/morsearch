package com.morsearch.dao;

import com.morsearch.model.MsgV_Audit_List;
import com.morsearch.model.MsgV_Audit_ListExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface MsgV_Audit_ListMapper {
    int countByExample(MsgV_Audit_ListExample example);

    int deleteByExample(MsgV_Audit_ListExample example);

    int insert(MsgV_Audit_List record);

    int insertSelective(MsgV_Audit_List record);

    List<MsgV_Audit_List> selectByExample(MsgV_Audit_ListExample example);

    int updateByExampleSelective(@Param("record") MsgV_Audit_List record, @Param("example") MsgV_Audit_ListExample example);

    int updateByExample(@Param("record") MsgV_Audit_List record, @Param("example") MsgV_Audit_ListExample example);


/*自定义*/

    List<MsgV_Audit_List> getMsgV_Audit_ListList(Map<String, Object> map);//列表

    int getCountMsgV_Audit_List(Map<String, Object> map);//条数

}
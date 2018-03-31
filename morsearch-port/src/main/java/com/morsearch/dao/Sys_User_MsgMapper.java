package com.morsearch.dao;

import com.morsearch.model.Sys_User_Msg;
import com.morsearch.model.Sys_User_MsgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Sys_User_MsgMapper {
    int countByExample(Sys_User_MsgExample example);

    int deleteByExample(Sys_User_MsgExample example);

    int deleteByPrimaryKey(Long um_userid);

    int insert(Sys_User_Msg record);

    int insertSelective(Sys_User_Msg record);

    List<Sys_User_Msg> selectByExample(Sys_User_MsgExample example);

    Sys_User_Msg selectByPrimaryKey(Long um_userid);

    int updateByExampleSelective(@Param("record") Sys_User_Msg record, @Param("example") Sys_User_MsgExample example);

    int updateByExample(@Param("record") Sys_User_Msg record, @Param("example") Sys_User_MsgExample example);

    int updateByPrimaryKeySelective(Sys_User_Msg record);

    int updateByPrimaryKey(Sys_User_Msg record);

/*自定义*/
    Sys_User_Msg getUserMsgDetail(@Param("userid") Long userid, @Param("type") int type);/*获取消息明细*/



}
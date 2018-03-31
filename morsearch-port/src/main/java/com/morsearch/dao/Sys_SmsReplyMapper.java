package com.morsearch.dao;

import com.morsearch.model.Sys_SmsReply;
import com.morsearch.model.Sys_SmsReplyExample;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Sys_SmsReplyMapper {
    int countByExample(Sys_SmsReplyExample example);

    int deleteByExample(Sys_SmsReplyExample example);

    int deleteByPrimaryKey(Long sr_id);

    int insert(Sys_SmsReply record);

    int insertSelective(Sys_SmsReply record);

    List<Sys_SmsReply> selectByExample(Sys_SmsReplyExample example);

    Sys_SmsReply selectByPrimaryKey(Long sr_id);

    int updateByExampleSelective(@Param("record") Sys_SmsReply record, @Param("example") Sys_SmsReplyExample example);

    int updateByExample(@Param("record") Sys_SmsReply record, @Param("example") Sys_SmsReplyExample example);

    int updateByPrimaryKeySelective(Sys_SmsReply record);

    int updateByPrimaryKey(Sys_SmsReply record);


}
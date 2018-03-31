package com.morsearch.dao;

import com.morsearch.model.Sys_SmsMessage;
import com.morsearch.model.Sys_SmsMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Sys_SmsMessageMapper {
    int countByExample(Sys_SmsMessageExample example);

    int deleteByExample(Sys_SmsMessageExample example);

    int deleteByPrimaryKey(Integer sm_id);

    int insert(Sys_SmsMessage record);

    int insertSelective(Sys_SmsMessage record);

    List<Sys_SmsMessage> selectByExample(Sys_SmsMessageExample example);

    Sys_SmsMessage selectByPrimaryKey(Integer sm_id);

    int updateByExampleSelective(@Param("record") Sys_SmsMessage record, @Param("example") Sys_SmsMessageExample example);

    int updateByExample(@Param("record") Sys_SmsMessage record, @Param("example") Sys_SmsMessageExample example);

    int updateByPrimaryKeySelective(Sys_SmsMessage record);

    int updateByPrimaryKey(Sys_SmsMessage record);
}
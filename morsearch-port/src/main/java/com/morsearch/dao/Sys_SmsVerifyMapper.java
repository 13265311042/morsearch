package com.morsearch.dao;

import com.morsearch.model.Sys_SmsVerify;
import com.morsearch.model.Sys_SmsVerifyExample;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Sys_SmsVerifyMapper {
    int countByExample(Sys_SmsVerifyExample example);

    int deleteByExample(Sys_SmsVerifyExample example);

    int deleteByPrimaryKey(Integer sv_id);

    int insert(Sys_SmsVerify record);

    int insertSelective(Sys_SmsVerify record);

    List<Sys_SmsVerify> selectByExample(Sys_SmsVerifyExample example);

    Sys_SmsVerify selectByPrimaryKey(Integer sv_id);

    int updateByExampleSelective(@Param("record") Sys_SmsVerify record, @Param("example") Sys_SmsVerifyExample example);

    int updateByExample(@Param("record") Sys_SmsVerify record, @Param("example") Sys_SmsVerifyExample example);

    int updateByPrimaryKeySelective(Sys_SmsVerify record);

    int updateByPrimaryKey(Sys_SmsVerify record);

    /*自定义*/
    int getPhoneCount(@Param("phone") String phone, @Param("typeindex") int typeindex, @Param("todaymintime") Date todaymintime, @Param("todaymaxtime") Date todaymaxtime);/*得到手机数量*/
    Sys_SmsVerify getPhoneVerifylast(@Param("phone") String phone, @Param("typeindex") int typeindex);/*读取手机最后一条验证码*/
//    Sys_SmsVerify getCodeVerify(@Param("code") String code);

}
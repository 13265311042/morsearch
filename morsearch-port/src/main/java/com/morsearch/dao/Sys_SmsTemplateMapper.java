package com.morsearch.dao;

import com.morsearch.model.Sys_SmsTemplate;
import com.morsearch.model.Sys_SmsTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Sys_SmsTemplateMapper {
    int countByExample(Sys_SmsTemplateExample example);

    int deleteByExample(Sys_SmsTemplateExample example);

    int deleteByPrimaryKey(Integer st_id);

    int insert(Sys_SmsTemplate record);

    int insertSelective(Sys_SmsTemplate record);

    List<Sys_SmsTemplate> selectByExample(Sys_SmsTemplateExample example);

    Sys_SmsTemplate selectByPrimaryKey(Integer st_id);

    int updateByExampleSelective(@Param("record") Sys_SmsTemplate record, @Param("example") Sys_SmsTemplateExample example);

    int updateByExample(@Param("record") Sys_SmsTemplate record, @Param("example") Sys_SmsTemplateExample example);

    int updateByPrimaryKeySelective(Sys_SmsTemplate record);

    int updateByPrimaryKey(Sys_SmsTemplate record);
}
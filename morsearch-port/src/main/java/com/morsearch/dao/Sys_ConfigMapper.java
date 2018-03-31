package com.morsearch.dao;

import com.morsearch.model.Sys_Config;
import com.morsearch.model.Sys_ConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Sys_ConfigMapper {
    int countByExample(Sys_ConfigExample example);

    int deleteByExample(Sys_ConfigExample example);

    int deleteByPrimaryKey(String sc_code);

    int insert(Sys_Config record);

    int insertSelective(Sys_Config record);

    List<Sys_Config> selectByExample(Sys_ConfigExample example);

    Sys_Config selectByPrimaryKey(String sc_code);

    int updateByExampleSelective(@Param("record") Sys_Config record, @Param("example") Sys_ConfigExample example);

    int updateByExample(@Param("record") Sys_Config record, @Param("example") Sys_ConfigExample example);

    int updateByPrimaryKeySelective(Sys_Config record);

    int updateByPrimaryKey(Sys_Config record);

    Sys_Config getSys_Configvalue(String name);
}
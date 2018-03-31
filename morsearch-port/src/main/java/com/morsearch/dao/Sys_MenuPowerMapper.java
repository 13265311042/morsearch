package com.morsearch.dao;

import com.morsearch.model.Sys_MenuPower;
import com.morsearch.model.Sys_MenuPowerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Sys_MenuPowerMapper {
    int countByExample(Sys_MenuPowerExample example);

    int deleteByExample(Sys_MenuPowerExample example);

    int deleteByPrimaryKey(Long sm_id);

    int insert(Sys_MenuPower record);

    int insertSelective(Sys_MenuPower record);

    List<Sys_MenuPower> selectByExample(Sys_MenuPowerExample example);

    Sys_MenuPower selectByPrimaryKey(Long sm_id);

    int updateByExampleSelective(@Param("record") Sys_MenuPower record, @Param("example") Sys_MenuPowerExample example);

    int updateByExample(@Param("record") Sys_MenuPower record, @Param("example") Sys_MenuPowerExample example);

    int updateByPrimaryKeySelective(Sys_MenuPower record);

    int updateByPrimaryKey(Sys_MenuPower record);
}
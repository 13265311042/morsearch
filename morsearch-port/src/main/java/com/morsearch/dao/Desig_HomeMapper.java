package com.morsearch.dao;

import com.morsearch.model.Desig_Home;
import com.morsearch.model.Desig_HomeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Desig_HomeMapper {
    int countByExample(Desig_HomeExample example);

    int deleteByExample(Desig_HomeExample example);

    int deleteByPrimaryKey(Long dh_id);

    int insert(Desig_Home record);

    int insertSelective(Desig_Home record);

    List<Desig_Home> selectByExample(Desig_HomeExample example);

    Desig_Home selectByPrimaryKey(Long dh_id);

    int updateByExampleSelective(@Param("record") Desig_Home record, @Param("example") Desig_HomeExample example);

    int updateByExample(@Param("record") Desig_Home record, @Param("example") Desig_HomeExample example);

    int updateByPrimaryKeySelective(Desig_Home record);

    int updateByPrimaryKey(Desig_Home record);
}
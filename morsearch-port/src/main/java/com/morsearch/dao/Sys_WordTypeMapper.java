package com.morsearch.dao;

import com.morsearch.model.Sys_WordList;
import com.morsearch.model.Sys_WordType;
import com.morsearch.model.Sys_WordTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Sys_WordTypeMapper {
    int countByExample(Sys_WordTypeExample example);

    int deleteByExample(Sys_WordTypeExample example);

    int deleteByPrimaryKey(String st_type);

    int insert(Sys_WordType record);

    int insertSelective(Sys_WordType record);

    List<Sys_WordType> selectByExample(Sys_WordTypeExample example);

    Sys_WordType selectByPrimaryKey(String st_type);

    int updateByExampleSelective(@Param("record") Sys_WordType record, @Param("example") Sys_WordTypeExample example);

    int updateByExample(@Param("record") Sys_WordType record, @Param("example") Sys_WordTypeExample example);

    int updateByPrimaryKeySelective(Sys_WordType record);

    int updateByPrimaryKey(Sys_WordType record);


}
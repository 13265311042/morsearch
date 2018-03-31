package com.morsearch.dao;

import com.morsearch.model.Mall_Home;
import com.morsearch.model.Mall_HomeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Mall_HomeMapper {
    int countByExample(Mall_HomeExample example);

    int deleteByExample(Mall_HomeExample example);

    int deleteByPrimaryKey(Long mh_id);

    int insert(Mall_Home record);

    int insertSelective(Mall_Home record);

    List<Mall_Home> selectByExample(Mall_HomeExample example);

    Mall_Home selectByPrimaryKey(Long mh_id);

    int updateByExampleSelective(@Param("record") Mall_Home record, @Param("example") Mall_HomeExample example);

    int updateByExample(@Param("record") Mall_Home record, @Param("example") Mall_HomeExample example);

    int updateByPrimaryKeySelective(Mall_Home record);

    int updateByPrimaryKey(Mall_Home record);
}
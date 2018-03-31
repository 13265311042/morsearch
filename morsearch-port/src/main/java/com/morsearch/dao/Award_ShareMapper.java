package com.morsearch.dao;

import java.util.List;

import com.morsearch.model.Award_Share;
import com.morsearch.model.Award_ShareExample;
import org.apache.ibatis.annotations.Param;

public interface Award_ShareMapper {
    int countByExample(Award_ShareExample example);

    int deleteByExample(Award_ShareExample example);

    int deleteByPrimaryKey(Long ba_id);

    int insert(Award_Share record);

    int insertSelective(Award_Share record);

    List<Award_Share> selectByExample(Award_ShareExample example);

    Award_Share selectByPrimaryKey(Long ba_id);

    int updateByExampleSelective(@Param("record") Award_Share record, @Param("example") Award_ShareExample example);

    int updateByExample(@Param("record") Award_Share record, @Param("example") Award_ShareExample example);

    int updateByPrimaryKeySelective(Award_Share record);

    int updateByPrimaryKey(Award_Share record);
}
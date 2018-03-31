package com.morsearch.dao;

import com.morsearch.model.AccV_MemoCoin;
import com.morsearch.model.AccV_MemoCoinExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccV_MemoCoinMapper {
    int countByExample(AccV_MemoCoinExample example);

    int deleteByExample(AccV_MemoCoinExample example);

    int insert(AccV_MemoCoin record);

    int insertSelective(AccV_MemoCoin record);

    List<AccV_MemoCoin> selectByExample(AccV_MemoCoinExample example);

    int updateByExampleSelective(@Param("record") AccV_MemoCoin record, @Param("example") AccV_MemoCoinExample example);

    int updateByExample(@Param("record") AccV_MemoCoin record, @Param("example") AccV_MemoCoinExample example);
}
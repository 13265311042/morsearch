package com.morsearch.dao;

import com.morsearch.model.AccV_MemoIntegral;
import com.morsearch.model.AccV_MemoIntegralExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccV_MemoIntegralMapper {
    int countByExample(AccV_MemoIntegralExample example);

    int deleteByExample(AccV_MemoIntegralExample example);

    int insert(AccV_MemoIntegral record);

    int insertSelective(AccV_MemoIntegral record);

    List<AccV_MemoIntegral> selectByExample(AccV_MemoIntegralExample example);

    int updateByExampleSelective(@Param("record") AccV_MemoIntegral record, @Param("example") AccV_MemoIntegralExample example);

    int updateByExample(@Param("record") AccV_MemoIntegral record, @Param("example") AccV_MemoIntegralExample example);
}
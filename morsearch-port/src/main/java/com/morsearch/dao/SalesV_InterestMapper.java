package com.morsearch.dao;

import com.morsearch.model.SalesV_Interest;
import com.morsearch.model.SalesV_InterestExample;
import java.util.List;
import java.util.Map;

import com.morsearch.model.SalesV_LookMe;
import org.apache.ibatis.annotations.Param;

public interface SalesV_InterestMapper {
    int countByExample(SalesV_InterestExample example);

    int deleteByExample(SalesV_InterestExample example);

    int insert(SalesV_Interest record);

    int insertSelective(SalesV_Interest record);

    List<SalesV_Interest> selectByExample(SalesV_InterestExample example);

    int updateByExampleSelective(@Param("record") SalesV_Interest record, @Param("example") SalesV_InterestExample example);

    int updateByExample(@Param("record") SalesV_Interest record, @Param("example") SalesV_InterestExample example);

    List<SalesV_Interest> getInterestList(Map<String, Object> map);

    int getInterestListCount(Map<String, Object> map);

}
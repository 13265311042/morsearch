package com.morsearch.dao;

import com.morsearch.model.SalesV_Collect_Pm;
import com.morsearch.model.SalesV_Collect_PmExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface SalesV_Collect_PmMapper {
    int countByExample(SalesV_Collect_PmExample example);

    int deleteByExample(SalesV_Collect_PmExample example);

    int insert(SalesV_Collect_Pm record);

    int insertSelective(SalesV_Collect_Pm record);

    List<SalesV_Collect_Pm> selectByExample(SalesV_Collect_PmExample example);

    int updateByExampleSelective(@Param("record") SalesV_Collect_Pm record, @Param("example") SalesV_Collect_PmExample example);

    int updateByExample(@Param("record") SalesV_Collect_Pm record, @Param("example") SalesV_Collect_PmExample example);

    List<SalesV_Collect_Pm> getSalesV_Collect_PmList(Map<String, Object> map);
    Integer getCountSalesV_Collect_Pm(Map<String, Object> map);
}
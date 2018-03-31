package com.morsearch.dao;

import com.morsearch.model.SalesV_Collect_Psn;
import com.morsearch.model.SalesV_Collect_PsnExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface SalesV_Collect_PsnMapper {
    int countByExample(SalesV_Collect_PsnExample example);

    int deleteByExample(SalesV_Collect_PsnExample example);

    int insert(SalesV_Collect_Psn record);

    int insertSelective(SalesV_Collect_Psn record);

    List<SalesV_Collect_Psn> selectByExample(SalesV_Collect_PsnExample example);

    int updateByExampleSelective(@Param("record") SalesV_Collect_Psn record, @Param("example") SalesV_Collect_PsnExample example);

    int updateByExample(@Param("record") SalesV_Collect_Psn record, @Param("example") SalesV_Collect_PsnExample example);

    List<SalesV_Collect_Psn> getSalesV_Collect_PsnList(Map<String, Object> map);
    Integer getCountSalesV_Collect_Psn(Map<String, Object> map);

}
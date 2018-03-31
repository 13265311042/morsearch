package com.morsearch.dao;

import com.morsearch.model.DesigV_Collect_Pm;
import com.morsearch.model.DesigV_Collect_Psn;
import com.morsearch.model.DesigV_Collect_PsnExample;
import java.util.List;
import java.util.Map;

import com.morsearch.model.Desig_Collect_Psn;
import org.apache.ibatis.annotations.Param;

public interface DesigV_Collect_PsnMapper {
    int countByExample(DesigV_Collect_PsnExample example);

    int deleteByExample(DesigV_Collect_PsnExample example);

    int insert(DesigV_Collect_Psn record);

    int insertSelective(DesigV_Collect_Psn record);

    List<DesigV_Collect_Psn> selectByExample(DesigV_Collect_PsnExample example);

    int updateByExampleSelective(@Param("record") DesigV_Collect_Psn record, @Param("example") DesigV_Collect_PsnExample example);

    int updateByExample(@Param("record") DesigV_Collect_Psn record, @Param("example") DesigV_Collect_PsnExample example);

    List<DesigV_Collect_Psn> getDesigV_Collect_PsnList(Map<String, Object> map);

    Integer getCountDesigV_Collect_Psn(Map<String, Object> map);

    Desig_Collect_Psn getDesig_Collect_Psn(Long ds_salerid, Long ds_createid);
}
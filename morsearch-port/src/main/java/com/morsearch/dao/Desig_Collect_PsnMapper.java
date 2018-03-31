package com.morsearch.dao;

import com.morsearch.model.Desig_Collect_Psn;
import com.morsearch.model.Desig_Collect_PsnExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Desig_Collect_PsnMapper {
    int countByExample(Desig_Collect_PsnExample example);

    int deleteByExample(Desig_Collect_PsnExample example);

    int deleteByPrimaryKey(Long ds_id);

    int insert(Desig_Collect_Psn record);

    int insertSelective(Desig_Collect_Psn record);

    List<Desig_Collect_Psn> selectByExample(Desig_Collect_PsnExample example);

    Desig_Collect_Psn selectByPrimaryKey(Long ds_id);

    int updateByExampleSelective(@Param("record") Desig_Collect_Psn record, @Param("example") Desig_Collect_PsnExample example);

    int updateByExample(@Param("record") Desig_Collect_Psn record, @Param("example") Desig_Collect_PsnExample example);

    int updateByPrimaryKeySelective(Desig_Collect_Psn record);

    int updateByPrimaryKey(Desig_Collect_Psn record);

    Desig_Collect_Psn getDesig_Collect_Psn2(@Param("ds_salerid") Long ds_salerid,@Param("ds_createid") Long ds_createid);

}
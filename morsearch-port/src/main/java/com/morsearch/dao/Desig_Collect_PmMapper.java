package com.morsearch.dao;

import com.morsearch.model.Desig_Collect_Pm;
import com.morsearch.model.Desig_Collect_PmExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Desig_Collect_PmMapper {
    int countByExample(Desig_Collect_PmExample example);

    int deleteByExample(Desig_Collect_PmExample example);

    int deleteByPrimaryKey(Long dm_id);

    int insert(Desig_Collect_Pm record);

    int insertSelective(Desig_Collect_Pm record);

    List<Desig_Collect_Pm> selectByExample(Desig_Collect_PmExample example);

    Desig_Collect_Pm selectByPrimaryKey(Long dm_id);

    int updateByExampleSelective(@Param("record") Desig_Collect_Pm record, @Param("example") Desig_Collect_PmExample example);

    int updateByExample(@Param("record") Desig_Collect_Pm record, @Param("example") Desig_Collect_PmExample example);

    int updateByPrimaryKeySelective(Desig_Collect_Pm record);

    int updateByPrimaryKey(Desig_Collect_Pm record);

    Desig_Collect_Pm  getDesig_Collect_Pm(@Param("dm_archivesid") Long dm_archivesid,@Param("dm_createid") Long dm_createid);


}
package com.morsearch.dao;

import com.morsearch.model.Pm_Attach;
import com.morsearch.model.Pm_AttachExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Pm_AttachMapper {
    int countByExample(Pm_AttachExample example);

    int deleteByExample(Pm_AttachExample example);

    int deleteByPrimaryKey(Long aa_id);

    int insert(Pm_Attach record);

    int insertSelective(Pm_Attach record);

    List<Pm_Attach> selectByExample(Pm_AttachExample example);

    Pm_Attach selectByPrimaryKey(Long aa_id);

    int updateByExampleSelective(@Param("record") Pm_Attach record, @Param("example") Pm_AttachExample example);

    int updateByExample(@Param("record") Pm_Attach record, @Param("example") Pm_AttachExample example);

    int updateByPrimaryKeySelective(Pm_Attach record);

    int updateByPrimaryKey(Pm_Attach record);

    List<Pm_Attach> selectByPrimaryname(Long id);

    List<Pm_Attach> selectByPid(String aa_filetitle);

    int deleteBy(@Param("aa_id") Long aa_id);

    Pm_Attach selectByname(@Param("aa_archivesid") String aa_archivesid, @Param("aa_filetitle") String aa_filetitle);

}
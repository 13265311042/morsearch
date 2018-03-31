package com.morsearch.dao;

import com.morsearch.model.PmV_Archives_share;
import com.morsearch.model.PmV_Archives_shareExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmV_Archives_shareMapper {
    int countByExample(PmV_Archives_shareExample example);

    int deleteByExample(PmV_Archives_shareExample example);

    int insert(PmV_Archives_share record);

    int insertSelective(PmV_Archives_share record);

    List<PmV_Archives_share> selectByExample(PmV_Archives_shareExample example);

    int updateByExampleSelective(@Param("record") PmV_Archives_share record, @Param("example") PmV_Archives_shareExample example);

    int updateByExample(@Param("record") PmV_Archives_share record, @Param("example") PmV_Archives_shareExample example);

    List<PmV_Archives_share> getShare(@Param("pa_companyname") String pa_companyname, @Param("ur_id") Long ur_id);

    PmV_Archives_share getArchivesShare(Long pa_id);


}
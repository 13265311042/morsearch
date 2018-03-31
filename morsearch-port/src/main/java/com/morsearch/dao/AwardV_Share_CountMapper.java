package com.morsearch.dao;

import com.morsearch.model.AwardV_Share_Count;
import com.morsearch.model.AwardV_Share_CountExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface AwardV_Share_CountMapper {
    int countByExample(AwardV_Share_CountExample example);

    int deleteByExample(AwardV_Share_CountExample example);

    int insert(AwardV_Share_Count record);

    int insertSelective(AwardV_Share_Count record);

    List<AwardV_Share_Count> selectByExample(AwardV_Share_CountExample example);

    int updateByExampleSelective(@Param("record") AwardV_Share_Count record, @Param("example") AwardV_Share_CountExample example);

    int updateByExample(@Param("record") AwardV_Share_Count record, @Param("example") AwardV_Share_CountExample example);


    //自定义
    List<AwardV_Share_Count> getAwardV_Share_CountList(Map<String, Object> map);

    Integer getCountAwardV_Share_Count(Map<String, Object> map);

    List<AwardV_Share_Count> getAwardVShareCountList(Map<String, Object> map);

    int getCountAwardVShareCount(Map<String, Object> map);


}
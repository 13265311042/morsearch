package com.morsearch.dao;

import com.morsearch.model.BaseV_Rotation;
import com.morsearch.model.BaseV_RotationExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface BaseV_RotationMapper {
    int countByExample(BaseV_RotationExample example);

    int deleteByExample(BaseV_RotationExample example);

    int insert(BaseV_Rotation record);

    int insertSelective(BaseV_Rotation record);

    List<BaseV_Rotation> selectByExample(BaseV_RotationExample example);

    int updateByExampleSelective(@Param("record") BaseV_Rotation record, @Param("example") BaseV_RotationExample example);

    int updateByExample(@Param("record") BaseV_Rotation record, @Param("example") BaseV_RotationExample example);

    //自定义
    List<BaseV_Rotation> getBaseV_RotationList(Map<String, Object> map);

    Integer getCountBaseV_Rotation(Map<String, Object> map);
}
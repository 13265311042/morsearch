package com.morsearch.dao;

import com.morsearch.model.Base_Rotation;
import com.morsearch.model.Base_RotationExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface Base_RotationMapper {
    int countByExample(Base_RotationExample example);

    int deleteByExample(Base_RotationExample example);

    int deleteByPrimaryKey(Long rt_id);

    int insert(Base_Rotation record);

    int insertSelective(Base_Rotation record);

    List<Base_Rotation> selectByExample(Base_RotationExample example);

    Base_Rotation selectByPrimaryKey(Long rt_id);

    int updateByExampleSelective(@Param("record") Base_Rotation record, @Param("example") Base_RotationExample example);

    int updateByExample(@Param("record") Base_Rotation record, @Param("example") Base_RotationExample example);

    int updateByPrimaryKeySelective(Base_Rotation record);

    int updateByPrimaryKey(Base_Rotation record);


    List<Map<String,String>> getBase_Rotation_typelist(); /*获取类别*/
    List<Base_Rotation> getBase_Rotation_list(@Param("type") String type);
    String getBase_Rotation_typecode(@Param("rtid") Long rtid);

    List<Base_Rotation> getRotationlist(String type);

}
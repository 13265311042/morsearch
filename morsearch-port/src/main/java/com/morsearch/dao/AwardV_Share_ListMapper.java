package com.morsearch.dao;

import com.morsearch.model.AwardV_Share_List;
import com.morsearch.model.AwardV_Share_ListExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface AwardV_Share_ListMapper {
    int countByExample(AwardV_Share_ListExample example);

    int deleteByExample(AwardV_Share_ListExample example);

    int insert(AwardV_Share_List record);

    int insertSelective(AwardV_Share_List record);

    List<AwardV_Share_List> selectByExample(AwardV_Share_ListExample example);

    int updateByExampleSelective(@Param("record") AwardV_Share_List record, @Param("example") AwardV_Share_ListExample example);

    int updateByExample(@Param("record") AwardV_Share_List record, @Param("example") AwardV_Share_ListExample example);


    //自定义
    List<AwardV_Share_List> getAwardV_Share_ListList(Map<String, Object> map);//列表

    Integer getCountAwardV_Share_List(Map<String, Object> map);//总数

}
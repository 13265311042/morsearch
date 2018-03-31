package com.morsearch.dao;

import com.morsearch.model.DesigV_Home_Brand_List;
import com.morsearch.model.DesigV_Home_Brand_ListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DesigV_Home_Brand_ListMapper {
    int countByExample(DesigV_Home_Brand_ListExample example);

    int deleteByExample(DesigV_Home_Brand_ListExample example);

    int insert(DesigV_Home_Brand_List record);

    int insertSelective(DesigV_Home_Brand_List record);

    List<DesigV_Home_Brand_List> selectByExample(DesigV_Home_Brand_ListExample example);

    int updateByExampleSelective(@Param("record") DesigV_Home_Brand_List record, @Param("example") DesigV_Home_Brand_ListExample example);

    int updateByExample(@Param("record") DesigV_Home_Brand_List record, @Param("example") DesigV_Home_Brand_ListExample example);
}
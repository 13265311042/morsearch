package com.morsearch.dao;

import com.morsearch.model.HomeV_Detail;
import com.morsearch.model.HomeV_DetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HomeV_DetailMapper {
    int countByExample(HomeV_DetailExample example);

    int deleteByExample(HomeV_DetailExample example);

    int insert(HomeV_Detail record);

    int insertSelective(HomeV_Detail record);

    List<HomeV_Detail> selectByExample(HomeV_DetailExample example);

    int updateByExampleSelective(@Param("record") HomeV_Detail record, @Param("example") HomeV_DetailExample example);

    int updateByExample(@Param("record") HomeV_Detail record, @Param("example") HomeV_DetailExample example);
}
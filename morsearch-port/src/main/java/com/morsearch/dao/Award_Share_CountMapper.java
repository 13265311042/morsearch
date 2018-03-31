package com.morsearch.dao;

import com.morsearch.model.Award_Share_Count;
import com.morsearch.model.Award_Share_CountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Award_Share_CountMapper {
    int countByExample(Award_Share_CountExample example);

    int deleteByExample(Award_Share_CountExample example);

    int deleteByPrimaryKey(Long sc_id);

    int insert(Award_Share_Count record);

    int insertSelective(Award_Share_Count record);

    List<Award_Share_Count> selectByExample(Award_Share_CountExample example);

    Award_Share_Count selectByPrimaryKey(Long sc_id);

    int updateByExampleSelective(@Param("record") Award_Share_Count record, @Param("example") Award_Share_CountExample example);

    int updateByExample(@Param("record") Award_Share_Count record, @Param("example") Award_Share_CountExample example);

    int updateByPrimaryKeySelective(Award_Share_Count record);

    int updateByPrimaryKey(Award_Share_Count record);
}
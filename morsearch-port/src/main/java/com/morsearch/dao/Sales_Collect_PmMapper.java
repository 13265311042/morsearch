package com.morsearch.dao;

import com.morsearch.model.Sales_Collect_Pm;
import com.morsearch.model.Sales_Collect_PmExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Sales_Collect_PmMapper {
    int countByExample(Sales_Collect_PmExample example);

    int deleteByExample(Sales_Collect_PmExample example);

    int deleteByPrimaryKey(Long sm_id);

    int insert(Sales_Collect_Pm record);

    int insertSelective(Sales_Collect_Pm record);

    List<Sales_Collect_Pm> selectByExample(Sales_Collect_PmExample example);

    Sales_Collect_Pm selectByPrimaryKey(Long sm_id);

    int updateByExampleSelective(@Param("record") Sales_Collect_Pm record, @Param("example") Sales_Collect_PmExample example);

    int updateByExample(@Param("record") Sales_Collect_Pm record, @Param("example") Sales_Collect_PmExample example);

    int updateByPrimaryKeySelective(Sales_Collect_Pm record);

    int updateByPrimaryKey(Sales_Collect_Pm record);
}
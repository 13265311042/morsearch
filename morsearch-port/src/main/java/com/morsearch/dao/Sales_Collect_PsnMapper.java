package com.morsearch.dao;

import com.morsearch.model.Sales_Collect_Psn;
import com.morsearch.model.Sales_Collect_PsnExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Sales_Collect_PsnMapper {
    int countByExample(Sales_Collect_PsnExample example);

    int deleteByExample(Sales_Collect_PsnExample example);

    int deleteByPrimaryKey(Long ss_id);

    int insert(Sales_Collect_Psn record);

    int insertSelective(Sales_Collect_Psn record);

    List<Sales_Collect_Psn> selectByExample(Sales_Collect_PsnExample example);

    Sales_Collect_Psn selectByPrimaryKey(Long ss_id);

    int updateByExampleSelective(@Param("record") Sales_Collect_Psn record, @Param("example") Sales_Collect_PsnExample example);

    int updateByExample(@Param("record") Sales_Collect_Psn record, @Param("example") Sales_Collect_PsnExample example);

    int updateByPrimaryKeySelective(Sales_Collect_Psn record);

    int updateByPrimaryKey(Sales_Collect_Psn record);

    Sales_Collect_Psn getSales_Collect_Psn(@Param("ss_designerid") Long ss_designerid, @Param("ss_createid") Long ss_createid);
}
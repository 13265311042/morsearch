package com.morsearch.dao;

import com.morsearch.model.Sales_Interest;
import com.morsearch.model.Sales_InterestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Sales_InterestMapper {
    int countByExample(Sales_InterestExample example);

    int deleteByExample(Sales_InterestExample example);

    int deleteByPrimaryKey(Long si_id);

    int insert(Sales_Interest record);

    int insertSelective(Sales_Interest record);

    List<Sales_Interest> selectByExample(Sales_InterestExample example);

    Sales_Interest selectByPrimaryKey(Long si_id);

    int updateByExampleSelective(@Param("record") Sales_Interest record, @Param("example") Sales_InterestExample example);

    int updateByExample(@Param("record") Sales_Interest record, @Param("example") Sales_InterestExample example);

    int updateByPrimaryKeySelective(Sales_Interest record);

    int updateByPrimaryKey(Sales_Interest record);
}
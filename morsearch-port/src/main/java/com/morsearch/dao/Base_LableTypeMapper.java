package com.morsearch.dao;

import com.morsearch.model.Base_LableType;
import com.morsearch.model.Base_LableTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Base_LableTypeMapper {
    int countByExample(Base_LableTypeExample example);

    int deleteByExample(Base_LableTypeExample example);

    int deleteByPrimaryKey(String bt_type);

    int insert(Base_LableType record);

    int insertSelective(Base_LableType record);

    List<Base_LableType> selectByExample(Base_LableTypeExample example);

    Base_LableType selectByPrimaryKey(String bt_type);

    int updateByExampleSelective(@Param("record") Base_LableType record, @Param("example") Base_LableTypeExample example);

    int updateByExample(@Param("record") Base_LableType record, @Param("example") Base_LableTypeExample example);

    int updateByPrimaryKeySelective(Base_LableType record);

    int updateByPrimaryKey(Base_LableType record);
}
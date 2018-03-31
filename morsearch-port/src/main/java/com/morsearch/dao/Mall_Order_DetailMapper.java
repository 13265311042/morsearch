package com.morsearch.dao;

import com.morsearch.model.Mall_Order_Detail;
import com.morsearch.model.Mall_Order_DetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Mall_Order_DetailMapper {
    int countByExample(Mall_Order_DetailExample example);

    int deleteByExample(Mall_Order_DetailExample example);

    int deleteByPrimaryKey(Long mod_id);

    int insert(Mall_Order_Detail record);

    int insertSelective(Mall_Order_Detail record);

    List<Mall_Order_Detail> selectByExample(Mall_Order_DetailExample example);

    Mall_Order_Detail selectByPrimaryKey(Long mod_id);

    int updateByExampleSelective(@Param("record") Mall_Order_Detail record, @Param("example") Mall_Order_DetailExample example);

    int updateByExample(@Param("record") Mall_Order_Detail record, @Param("example") Mall_Order_DetailExample example);

    int updateByPrimaryKeySelective(Mall_Order_Detail record);

    int updateByPrimaryKey(Mall_Order_Detail record);



    Mall_Order_Detail getMallOrder(String no);
}
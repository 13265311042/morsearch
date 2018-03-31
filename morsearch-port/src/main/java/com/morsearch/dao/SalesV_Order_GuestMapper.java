package com.morsearch.dao;

import com.morsearch.model.SalesV_Order_Guest;
import com.morsearch.model.SalesV_Order_GuestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalesV_Order_GuestMapper {
    int countByExample(SalesV_Order_GuestExample example);

    int deleteByExample(SalesV_Order_GuestExample example);

    int insert(SalesV_Order_Guest record);

    int insertSelective(SalesV_Order_Guest record);

    List<SalesV_Order_Guest> selectByExample(SalesV_Order_GuestExample example);

    int updateByExampleSelective(@Param("record") SalesV_Order_Guest record, @Param("example") SalesV_Order_GuestExample example);

    int updateByExample(@Param("record") SalesV_Order_Guest record, @Param("example") SalesV_Order_GuestExample example);
}
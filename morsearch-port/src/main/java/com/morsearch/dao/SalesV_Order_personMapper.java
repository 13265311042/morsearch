package com.morsearch.dao;

import com.morsearch.model.SalesV_Order_person;
import com.morsearch.model.SalesV_Order_personExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface SalesV_Order_personMapper {
    int countByExample(SalesV_Order_personExample example);

    int deleteByExample(SalesV_Order_personExample example);

    int insert(SalesV_Order_person record);

    int insertSelective(SalesV_Order_person record);

    List<SalesV_Order_person> selectByExample(SalesV_Order_personExample example);

    int updateByExampleSelective(@Param("record") SalesV_Order_person record, @Param("example") SalesV_Order_personExample example);

    int updateByExample(@Param("record") SalesV_Order_person record, @Param("example") SalesV_Order_personExample example);

    List<SalesV_Order_person> getSalesV_Order_personlist(Map<String, Object> map);/*列表*/
    List<SalesV_Order_person> getSalesV_Order_personlist1(Map<String, Object> map);/*列表*/
    List<SalesV_Order_person> getSalesV_Order_personlist2(Map<String, Object> map);/*列表*/

    int getSalesV_Order_personCount(Map<String, Object> map);
}
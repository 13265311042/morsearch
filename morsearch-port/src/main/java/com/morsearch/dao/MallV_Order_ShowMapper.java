package com.morsearch.dao;

import com.morsearch.model.MallV_Order_Show;
import com.morsearch.model.MallV_Order_ShowExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface MallV_Order_ShowMapper {
    int countByExample(MallV_Order_ShowExample example);

    int deleteByExample(MallV_Order_ShowExample example);

    int insert(MallV_Order_Show record);

    int insertSelective(MallV_Order_Show record);

    List<MallV_Order_Show> selectByExample(MallV_Order_ShowExample example);

    int updateByExampleSelective(@Param("record") MallV_Order_Show record, @Param("example") MallV_Order_ShowExample example);

    int updateByExample(@Param("record") MallV_Order_Show record, @Param("example") MallV_Order_ShowExample example);


    /*自定义*/
    List<MallV_Order_Show> getMallV_Order_ShowList(Map<String, Object> map);/*列表*/

    int getMallV_Order_ShowCount(Map<String, Object> map);

    MallV_Order_Show selectMallV_Order_Show(String  no);
}
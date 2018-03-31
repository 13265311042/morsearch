package com.morsearch.dao;

import com.morsearch.model.Mall_Order;
import com.morsearch.model.Mall_OrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Mall_OrderMapper {
    int countByExample(Mall_OrderExample example);

    int deleteByExample(Mall_OrderExample example);

    int deleteByPrimaryKey(Long mo_id);

    int insert(Mall_Order record);

    int insertSelective(Mall_Order record);

    List<Mall_Order> selectByExample(Mall_OrderExample example);

    Mall_Order selectByPrimaryKey(Long mo_id);

    int updateByExampleSelective(@Param("record") Mall_Order record, @Param("example") Mall_OrderExample example);

    int updateByExample(@Param("record") Mall_Order record, @Param("example") Mall_OrderExample example);

    int updateByPrimaryKeySelective(Mall_Order record);

    int updateByPrimaryKey(Mall_Order record);

/*自定义*/
    Mall_Order getOrderMemo(@Param("orderno") String orderno, @Param("type") int type);/*根据订单号查相关明细*/

    //Mall_Order getorder(Long id,String no);

    Mall_Order getMall_Order(Long  moid);


}
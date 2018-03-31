package com.morsearch.dao;

import com.morsearch.model.SalesV_Order_Sms;
import com.morsearch.model.SalesV_Order_SmsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalesV_Order_SmsMapper {
    int countByExample(SalesV_Order_SmsExample example);

    int deleteByExample(SalesV_Order_SmsExample example);

    int insert(SalesV_Order_Sms record);

    int insertSelective(SalesV_Order_Sms record);

    List<SalesV_Order_Sms> selectByExample(SalesV_Order_SmsExample example);

    int updateByExampleSelective(@Param("record") SalesV_Order_Sms record, @Param("example") SalesV_Order_SmsExample example);

    int updateByExample(@Param("record") SalesV_Order_Sms record, @Param("example") SalesV_Order_SmsExample example);

/*自定义*/
    List<SalesV_Order_Sms> getOrderSmsNotice(@Param("type") Integer type, @Param("orderno") String orderno
            , @Param("createid") Long createid); /*获取订单短信需要的资料*/

}
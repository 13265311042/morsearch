package com.morsearch.service.impl;

import com.morsearch.common.util.SequenceCreator;
import com.morsearch.dao.SalesV_LookMeMapper;
import com.morsearch.dao.Sales_AppealMapper;
import com.morsearch.dao.Sales_OrderMapper;
import com.morsearch.model.Sales_Appeal;
import com.morsearch.model.Sales_AppealExample;
import com.morsearch.model.Sales_Order;
import com.morsearch.model.Sys_User_Msg;
import com.morsearch.service.AppealService;
import com.morsearch.service.MessageService;
import com.morsearch.service.OrderService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Created by ywh on 2017-10-25.
 */
@Service("AppealService")
public class AppealServiceImpl implements AppealService{
    @Resource
    private Sales_AppealMapper sales_appealMapper;
    @Resource
    private Sales_OrderMapper sales_orderMapper;
    @Resource
    private OrderService orderService;
    @Resource
    private MessageService messageService;


    @Override
    public int countByExample(Sales_AppealExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(Sales_AppealExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Long sp_id) {
        return 0;
    }

    @Override
    public int insert(Sales_Appeal record) {
        return 0;
    }

    public AppealServiceImpl() {
        super();
    }

    @Override
    public int insertSelective(String orderno,  String contentgroup, String contentvalue, Date Date, Long createid, String createno) {
        int iadd=0;
/*查订单资料*/
        Sales_Order som = sales_orderMapper.getOrderMemo(orderno,0);
/*新增申诉*/
        Sales_Appeal appeal = new Sales_Appeal();
        appeal.setSp_designerid(som.getOf_custid());
        appeal.setSp_no(SequenceCreator.createnumber("", 5));
        appeal.setSp_orderno(orderno);
        appeal.setSp_contentgroup(contentgroup);
        appeal.setSp_contentvalue(contentvalue);
        appeal.setSp_createdate(new Date());
        appeal.setSp_createid(createid);
        appeal.setSp_createno(createno);
        appeal.setSp_status((byte)1);
        iadd+=sales_appealMapper.insertSelective(appeal);

/*更新设计师申诉消息 begin*/
        Sys_User_Msg msg=new Sys_User_Msg();
        msg.setUm_userid(som.getOf_custid());
        msg.setUm_dsg_appealtime(1);
        msg.setUm_dsg_appealdate(new Date());
        iadd=iadd+messageService.UserMsgCount(msg);
/*更新设计师申诉消息 end*/

/*更新订单状态*/
        Sales_Order so=new Sales_Order();
        so.setOf_id(som.getOf_id());
        so.setOf_appealstatus((byte)2); //订单表状态更改
        iadd+=sales_orderMapper.updateByPrimaryKeySelective(so);
        orderService.saveOrderStatusToRedis(orderno,null, (byte) 0,(byte)2);/*/*保存订单状态到redis*/

        return iadd;

    }

    @Override
    public Sales_Appeal selectByPrimaryNo(String orderno) {
        return sales_appealMapper.selectByPrimaryNo(orderno);
    }

    @Override
    public List<Sales_Appeal> selectByExample(Sales_AppealExample example) {
        return null;
    }

    @Override
    public Sales_Appeal selectByPrimaryKey(Long sp_id) {
        return null;
    }

    @Override
    public int updateByExampleSelective(@Param("record") Sales_Appeal record, @Param("example") Sales_AppealExample example) {
        return 0;
    }

    @Override
    public int updateByExample(@Param("record") Sales_Appeal record, @Param("example") Sales_AppealExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Sales_Appeal record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Sales_Appeal record) {
        return 0;
    }
}

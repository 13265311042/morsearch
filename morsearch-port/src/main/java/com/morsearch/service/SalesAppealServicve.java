package com.morsearch.service;

import com.morsearch.model.Sales_Appeal;

import java.util.List;
import java.util.Map;

/**
 * Created by hyt on 2017/11/13.
 */
public interface SalesAppealServicve {

    List<Sales_Appeal> getSales_AppealList(Map<String, Object> map);//业务员申述列表

    int getCountSales_Appeal(Map<String, Object> map);//业务员申述总数

    int updateSales_Appealstatus(Sales_Appeal sa);//更改状态

    Sales_Appeal getSales_Appealdetail(long l);//得到业务员申述表每一条详细信息
}

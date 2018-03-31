package com.morsearch.service;


import com.morsearch.model.MsgV_Appeal_List;

import java.util.List;
import java.util.Map;

/**
 * Created by ywh on 2017-11-24.
 */
public interface SalesVAppealMsgService {

    List<MsgV_Appeal_List> getSalesV_Appeal_MsgList(Map<String, Object> map);//列表

    int getCountSalesV_Appeal_Msg(Map<String, Object> map);//条数

    int updateMegApple(String nolist);

}

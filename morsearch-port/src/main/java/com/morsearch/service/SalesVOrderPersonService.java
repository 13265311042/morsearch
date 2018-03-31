package com.morsearch.service;

import com.morsearch.model.SalesV_Order_person;

import java.util.List;
import java.util.Map;

/**
 * Created by ywh on 2017-12-19.
 */
public interface SalesVOrderPersonService {

    List<SalesV_Order_person> getSalesV_Order_personlist(Map<String, Object> map);/*列表*/
    List<SalesV_Order_person> getSalesV_Order_personlist1(Map<String, Object> map);/*列表*/
    List<SalesV_Order_person> getSalesV_Order_personlist2(Map<String, Object> map);/*列表*/

    int getSalesV_Order_personCount(Map<String, Object> map);
}

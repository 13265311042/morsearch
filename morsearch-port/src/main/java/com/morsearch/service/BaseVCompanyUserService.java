package com.morsearch.service;

import com.morsearch.model.Acc_Largess;
import com.morsearch.model.BaseV_Company_User;

import java.util.List;
import java.util.Map;

/**
 * Created by ywh on 2017-12-14.
 */
public interface BaseVCompanyUserService {

    List<BaseV_Company_User> getBaseV_Company_UserList(Map<String, Object> map); //列表
    List<BaseV_Company_User> getBaseV_Company_UserList1(Map<String, Object> map); //列表

    int getCountBaseV_Company_User(Map<String, Object> map);//数量




}

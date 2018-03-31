package com.morsearch.service;

import com.morsearch.model.MsgV_Audit_List;

import java.util.List;
import java.util.Map;

/**
 * Created by ywh on 2017-11-24.
 */
public interface MsgVAuditListService {


    List<MsgV_Audit_List> getMsgV_Audit_ListList(Map<String, Object> map);//列表

    int getCountMsgV_Audit_List(Map<String, Object> map);//条数

    int updateMegAudit(String nolist);
}

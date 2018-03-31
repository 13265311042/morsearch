package com.morsearch.service.impl;

import com.morsearch.dao.Desig_DemandMapper;
import com.morsearch.dao.MsgV_Audit_ListMapper;
import com.morsearch.dao.Sales_AppealMapper;
import com.morsearch.model.Desig_Demand;
import com.morsearch.model.MsgV_Audit_List;
import com.morsearch.model.Sales_Appeal;
import com.morsearch.service.MsgVAuditListService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by ywh on 2017-11-24.
 */
@Service("MsgVAuditListService")
public class MsgVAuditListServiceImpl implements MsgVAuditListService {

    @Resource
    private MsgV_Audit_ListMapper msgV_audit_listMapper;

    @Resource
    private Desig_DemandMapper desig_demandMapper;

    @Resource
    private Sales_AppealMapper sales_appealMapper;
    @Override
    public List<MsgV_Audit_List> getMsgV_Audit_ListList(Map<String, Object> map) {
        return msgV_audit_listMapper.getMsgV_Audit_ListList(map);
    }

    @Override
    public int getCountMsgV_Audit_List(Map<String, Object> map) {
        return msgV_audit_listMapper.getCountMsgV_Audit_List(map);
    }

    @Override
    public int updateMegAudit(String nolist) {
        String[] strlist={nolist};
        int iadd=0;
        if (nolist.contains("|")==true){strlist=nolist.split("\\|");};
        if (nolist.contains(";")==true){strlist=nolist.split(";");};
        for (int ii=0;ii<strlist.length;ii++){
            Desig_Demand dd = desig_demandMapper.selectByPrimaryKey(Long.valueOf(strlist[ii]));
            dd.setDd_flag_adminread(true);
            iadd+=desig_demandMapper.updateByPrimaryKeySelective(dd);
        };
        return iadd;
    }
}

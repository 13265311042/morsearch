package com.morsearch.service.impl;

import com.morsearch.dao.MsgV_Appeal_ListMapper;
import com.morsearch.dao.Sales_AppealMapper;
import com.morsearch.model.MsgV_Appeal_List;
import com.morsearch.model.Sales_Appeal;
import com.morsearch.service.SalesVAppealMsgService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by ywh on 2017-11-24.
 */
@Service("SalesVAppealMsgService")
public class SalesVAppealMsgServiceImpl implements SalesVAppealMsgService{


    @Resource
    private MsgV_Appeal_ListMapper salesV_appeal_msgMapper;
    @Resource
    private Sales_AppealMapper sales_appealMapper;

    @Override
    public List<MsgV_Appeal_List> getSalesV_Appeal_MsgList(Map<String, Object> map) {
        return salesV_appeal_msgMapper.getSalesV_Appeal_MsgList(map);
    }

    @Override
    public int getCountSalesV_Appeal_Msg(Map<String, Object> map) {
        return salesV_appeal_msgMapper.getCountSalesV_Appeal_Msg(map);
    }

    @Override
    public int updateMegApple(String nolist) {
        String[] strlist={nolist};
        int iadd=0;
        if (nolist.contains("|")==true){strlist=nolist.split("\\|");};
        if (nolist.contains(";")==true){strlist=nolist.split(";");};
        for (int ii=0;ii<strlist.length;ii++){
            Sales_Appeal sa = sales_appealMapper.selectByPrimaryNo(strlist[ii]);
            sa.setSp_flagdesread(true);
            iadd+=sales_appealMapper.updateByPrimaryKeySelective(sa);
        };
        return iadd;
    }
}

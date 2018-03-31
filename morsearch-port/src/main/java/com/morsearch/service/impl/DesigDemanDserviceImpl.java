package com.morsearch.service.impl;

import com.morsearch.dao.DesigV_DemandMapper;
import com.morsearch.dao.Desig_DemandMapper;
import com.morsearch.model.DesigV_Demand;
import com.morsearch.model.Desig_Demand;
import com.morsearch.model.Sys_User_Msg;
import com.morsearch.service.DesigDemandService;
import com.morsearch.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by hyt on 2017/10/19.
 */
@Service("DesigDemandService")
public class DesigDemanDserviceImpl implements DesigDemandService{

    @Autowired
    private Desig_DemandMapper desig_demandMapper;

    @Autowired
    private DesigV_DemandMapper desigV_demandMapper;

    @Resource
    private MessageService messageService;


    @Override
    public Desig_Demand selectByPrimaryID(Long Ur_id) {
        return desig_demandMapper.selectByprimaryId(Ur_id);
    }

    @Override
    public List<Desig_Demand> getDesig_DemandList(Map<String, Object> map) {
        return desig_demandMapper.getDesig_DemandList(map);
    }

    @Override
    public int getCountDesig_Demand(Map<String, Object> map) {
        return desig_demandMapper.getCountDesig_Demand(map);
    }

    @Override
    public Desig_Demand getDesig_DemandDetail(Long dd_id, int type) {
        return desig_demandMapper.getDesig_DemandDetail(dd_id,type);
    }

    @Override
    public int updateByPrimaryKeySelective(Desig_Demand record) {
        return desig_demandMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public Desig_Demand selectByPrimaryKey(Long dd_id) {
        return desig_demandMapper.selectByPrimaryKey(dd_id);
    }

    @Override
    public int insertSelective(Desig_Demand record) {
        return desig_demandMapper.insertSelective(record);
    }

    @Override
    public List<Desig_Demand> getDesig_DemandBackList(Map<String, Object> map) {
        return desig_demandMapper.getDesig_DemandBackList(map);
    }

    @Override
    public Integer getCountDesig_DemandBack(Map<String, Object> map) {
        return desig_demandMapper.getCountDesig_DemandBack(map);
    }

    @Override
    public int updateDesig_Demand(Desig_Demand dd) {
        int iadd=0;
        iadd=desig_demandMapper.updateByPrimaryKeySelective(dd);
        Desig_Demand ddr=desig_demandMapper.getDesig_DemandDetail(dd.getDd_id(),5);
/*更新设计师审核消息 begin*/
        Sys_User_Msg msg=new Sys_User_Msg();
        msg.setUm_userid(ddr.getDd_createid());
        msg.setUm_dsg_audittime(1);
        msg.setUm_dsg_auditdate(new Date());
        iadd=iadd+messageService.UserMsgCount(msg);
/*更新设计师审核消息 end*/
        return iadd;
    }

    @Override
    public List<DesigV_Demand> getDesigV_DemandList(Map<String, Object> map) {//需求审核列表
        return desigV_demandMapper.getDesigV_DemandList(map);
    }

    @Override
    public Integer getCountDesigV_Demand(Map<String, Object> map) {
        return desigV_demandMapper.getCountDesigV_Demand(map);
    }

    @Override
    public DesigV_Demand getDesigV_DemandDetail(long l) {
        return desigV_demandMapper.selectByPrimaryKey(l);
    }

}

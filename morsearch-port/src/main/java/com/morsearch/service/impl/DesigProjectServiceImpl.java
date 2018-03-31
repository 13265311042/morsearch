package com.morsearch.service.impl;

import com.morsearch.dao.Desig_ProjectMapper;
import com.morsearch.dao.Sys_WordListMapper;
import com.morsearch.model.Desig_Project;
import com.morsearch.model.Sys_User_Msg;
import com.morsearch.service.DesigProjectService;
import com.morsearch.service.MessageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by ywh on 2017-11-22.
 */
@Service("DesigProjectService")
public class DesigProjectServiceImpl implements DesigProjectService{
    @Resource
    private Desig_ProjectMapper desig_projectMapper;
    @Resource
    private Sys_WordListMapper sys_wordListMapper;
    @Resource
    private MessageService messageService;

    @Override
    public int insertSelective(Desig_Project record) {
        return desig_projectMapper.insertSelective(record);
    }

    @Override
    public String getWordTypeCode(String sw_name) {
        return sys_wordListMapper.getWordTypeCode(sw_name);
    }

    @Override
    public int deleteByPrimaryKey(Long sp_id) {
        return desig_projectMapper.deleteByPrimaryKey(sp_id);
    }

    @Override
    public List<Desig_Project> getDesig_ProjectList(Map<String, Object> map) {
        return desig_projectMapper.getDesig_ProjectList(map);
    }

    @Override
    public int getCountDesig_Project(Map<String, Object> map) {
        return desig_projectMapper.getCountDesig_Project(map);
    }


    @Override
    public int updateByPrimaryKeySelective(Desig_Project record) {
        return desig_projectMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public Desig_Project selectByDesig_Project(Long id) {
        return desig_projectMapper.selectByDesig_Project(id);
    }

    @Override
    public List<Desig_Project> getDesig_ProjectBackList(Map<String, Object> map) {
        return desig_projectMapper.getDesig_ProjectBackList(map);
    }

    @Override
    public Integer getCountDesig_ProjectBack(Map<String, Object> map) {
        return desig_projectMapper.getCountDesig_ProjectBack(map);
    }

    @Override
    public Desig_Project getDesig_ProjectDetail(long l, int type) {
        return desig_projectMapper.getDesig_ProjectDetail(l,type);
    }

    @Override
    public int updateDesig_Project(Desig_Project dd) {
        int iadd=desig_projectMapper.updateByPrimaryKeySelective(dd);

        Desig_Project ddr=desig_projectMapper.getDesig_ProjectDetail(dd.getSp_id(),5);
/*更新设计师审核消息 begin*/
        Sys_User_Msg msg=new Sys_User_Msg();
        msg.setUm_userid(ddr.getSp_createid());
        msg.setUm_dsg_audittime(1);
        msg.setUm_dsg_auditdate(new Date());
        iadd=iadd+messageService.UserMsgCount(msg);
/*更新设计师审核消息 end*/

        return iadd;
    }
}

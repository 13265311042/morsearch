package com.morsearch.dao;

import com.morsearch.model.Sys_Manager;
import com.morsearch.model.Sys_ManagerExample;
import java.util.List;
import java.util.Map;

import com.morsearch.model.Sys_UserExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component("sys_ManagerMapper")

public interface Sys_ManagerMapper {
    int countByExample(Sys_ManagerExample example);

    int deleteByExample(Sys_ManagerExample example);

    int deleteByPrimaryKey(Integer sm_id);

    int insert(Sys_Manager record);

    int insertSelective(Sys_Manager record);

    List<Sys_Manager> selectByExample(Sys_ManagerExample example);

    Sys_Manager selectByPrimaryKey(Integer sm_id);

    int updateByExampleSelective(@Param("record") Sys_Manager record, @Param("example") Sys_ManagerExample example);

    int updateByExample(@Param("record") Sys_Manager record, @Param("example") Sys_ManagerExample example);

    int updateByPrimaryKeySelective(Sys_Manager record);

    int updateByPrimaryKey(Sys_Manager record);

/*自定义*/
    Sys_Manager loginManger(@Param("userno") String userno, @Param("password") String password);/*登录后台*/
    List<Sys_Manager> getmanageList(Map<String, Object> map);/*用户列表*/
    int getmanageListCount(Map<String, Object> map);/*用户列表总数*/

}
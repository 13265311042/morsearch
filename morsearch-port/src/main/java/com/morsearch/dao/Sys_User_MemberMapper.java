package com.morsearch.dao;

import com.morsearch.model.Sys_User_Member;
import com.morsearch.model.Sys_User_MemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Sys_User_MemberMapper {
    int countByExample(Sys_User_MemberExample example);

    int deleteByExample(Sys_User_MemberExample example);

    int deleteByPrimaryKey(Integer mb_id);

    int insert(Sys_User_Member record);

    int insertSelective(Sys_User_Member record);

    List<Sys_User_Member> selectByExample(Sys_User_MemberExample example);

    Sys_User_Member selectByPrimaryKey(Integer mb_id);

    int updateByExampleSelective(@Param("record") Sys_User_Member record, @Param("example") Sys_User_MemberExample example);

    int updateByExample(@Param("record") Sys_User_Member record, @Param("example") Sys_User_MemberExample example);

    int updateByPrimaryKeySelective(Sys_User_Member record);

    int updateByPrimaryKey(Sys_User_Member record);
}
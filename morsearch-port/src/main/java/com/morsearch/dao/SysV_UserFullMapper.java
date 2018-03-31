package com.morsearch.dao;

import com.morsearch.model.SysV_UserFull;
import com.morsearch.model.SysV_UserFullExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface SysV_UserFullMapper {
    int countByExample(SysV_UserFullExample example);

    int deleteByExample(SysV_UserFullExample example);

    int insert(SysV_UserFull record);

    int insertSelective(SysV_UserFull record);

    List<SysV_UserFull> selectByExample(SysV_UserFullExample example);

    int updateByExampleSelective(@Param("record") SysV_UserFull record, @Param("example") SysV_UserFullExample example);

    int updateByExample(@Param("record") SysV_UserFull record, @Param("example") SysV_UserFullExample example);

    /*自定义*/
    SysV_UserFull getUserDetail(@Param("ur_id") Long ur_id, @Param("type") int type);/*获取用户明细，type分类获取字段*/
    SysV_UserFull selectLogin(@Param("account") String account, @Param("password") String password, @Param("usertype") int usertype, @Param("mode") int mode);/*登录*/
    SysV_UserFull selectthird(@Param("openid") String openid, @Param("type") int type);/*登录*/

    List<SysV_UserFull> getUsertypeList(@Param("usertype") int usertype, @Param("type") int type);/*获取用户列表*/

    List<SysV_UserFull> getSysV_UserFullList(Map<String, Object> map);//的列表

    int getCountSysV_UserFull(Map<String, Object> map);

    List<SysV_UserFull> getuserfullList(Map<String, Object> map);

    Integer getCountUserfull(Map<String, Object> map);
}
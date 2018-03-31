package com.morsearch.dao;

import com.morsearch.model.SysV_UserFull;
import com.morsearch.model.Sys_User;
import com.morsearch.model.Sys_UserExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface Sys_UserMapper {
    int countByExample(Sys_UserExample example);

    int deleteByExample(Sys_UserExample example);

    int deleteByPrimaryKey(Long ur_id);

    int insert(Sys_User record);

    int insertSelective(Sys_User record);

    List<Sys_User> selectByExample(Sys_UserExample example);

    Sys_User selectByPrimaryKey(Long ur_id);

    int updateByExampleSelective(@Param("record") Sys_User record, @Param("example") Sys_UserExample example);

    int updateByExample(@Param("record") Sys_User record, @Param("example") Sys_UserExample example);

    int updateByPrimaryKeySelective(Sys_User record);

    int updateByPrimaryKey(Sys_User record);

    /*自定义*/
    List<Sys_User> getuserList(@Param("pageindex") int pageindex, @Param("pagesize") int pagesize);/*用户列表*/
    List<Sys_User> getuserList(Map<String, Object> map);/*用户列表*/
    int getuserListCount();/*用户列表总数*/
    int getCheckDouble(@Param("usertype") Integer usertype,@Param("ur_no") String ur_no, @Param("ur_phone") String ur_phone, @Param("ur_email") String ur_email, @Param("ur_token") String ur_token);/*检查账号是否重复*/
    Long getUserId(@Param("account") String account, @Param("type") int type);/*通过账号获取ID,1.ur_no,2.ur_phone,3.ur_email,4.ur_token,5.wxopenid,6.qqopenid*/
    String getUserType(@Param("account") String account, @Param("type") int type);/*通过ID获取类别*/

    int getCountUser(Map<String, Object> map);/*用户列表总数*/
    Map<String,Object> getThirdAccount(@Param("openid") String account, @Param("type") int type);/*检验第三方获取账号,1.wxopenid,2.qqopenid*/

    List<Sys_User> getSys_UserListid(Map<String, Object> map);//设计师首页业务员添加所有的id查询的列表

    Integer getCountSys_Userid(Map<String, Object> map);//设计师首页业务员添加所有的id查询的总数

    Sys_User loginUser(Sys_User user); /*客户关系管理系统登录*/


    Long getSys_userinvitecode(String invitecode); /*邀请码验证*/

    String selectByPrimaryKeyDm_createno(long id);//根据设计师id查询出设计师的昵称

    List<Sys_User> getSysuserinvitecode(String code);

    String getUr_phone(long ur_id);

    int adduserdel(@Param("userid") Long userid);
}
package com.morsearch.service;

import com.morsearch.model.SysV_UserFull;
import com.morsearch.model.Sys_User;
import com.morsearch.model.Sys_User_Ext;
import com.morsearch.model.Sys_User_Msg;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.util.List;
import java.util.Map;


public interface UserService {
	int insertsave(Sys_User ur, Sys_User_Ext ut, Sys_User_Msg um);/*用户新增，主表和扩展表同时保存，触发事务,若其中一个，另一个可以用null代替*/
	int updatesave(Sys_User ur, Sys_User_Ext ut, Sys_User_Msg um);/*用户修改，主表和扩展表同时保存，触发事务,若其中一个，另一个可以用null代替*/
	int updateByPrimaryKey(Sys_User record);
	int addregister(Sys_User ur,Sys_User_Ext ue);/*注册*/
	Sys_User selectByUserName(String ur_name);
	Sys_User getUser_MainDetail(Long ID); /*获取主表明细*/
	Sys_User_Ext getUser_ExtDetail(Long ID);/*获取扩展表明细*/


    SysV_UserFull selectLogin(String account, String password, int usertype, int mode);/*获取登录资料 1为帐号，2为手机，3为邮箱，4为token,5为微信，6为QQ*/
	List<Sys_User> getuserList(int pageindex, int pagesize); /*得到用户列表*/
	List<Sys_User> getuserList(Map<String, Object> map);/*真正得到用户列表*/
	int getuserListCount();
	int getCountUser(Map<String, Object> map);
	int getCheckDouble(int usertype,String ur_no, String ur_phone, String ur_email, String ur_token);/*检查账号是否重复*/
	Long getUserId(String account, int type);/*通过账号获取ID*/
	Integer getUserType(String account, int type);/*通过ID获取usertype*/

	SysV_UserFull getUser_FullDetail(Long ur_id, int type);/*获取用户明细，包含主表和扩展表，type分类获取字段*/

	Sys_User_Msg getUserMessage(Long userid);/*读取用户消息资料*/
	List<Sys_User_Msg> getUserMsgList();/*获取用户信息列表*/


	Sys_User getSysUserDetail(Long ur_id);//查询前台用户详细信息
	int updateSysUser(Sys_User su);//更改信息

	Boolean isUserId(Long userid);//查询是否有此用户

	int saveredis_home_base(Long userid);/*保存home的基本资料，接口redis资料,用户id,注：放在事务处理后的接口位置*/
	int saveredis_home_count(Long userid, int addneed, int addorder);/*保存home的需求量,注：放在事务处理后的接口位置*/

	Map<String,String> getUserPosTeam(String lng, String lat);/*获取小组坐标*/

	Map<String,Object> getThirdAccount(String openid, int type);/*检验第三方获取账号 1.wxopenid,2.qqopenid*/

	List<Sys_User> getSys_UserListid(Map<String, Object> map);//设计师首页业务员添加所有的id查询的列表

	Integer getCountSys_Userid(Map<String, Object> map);//设计师首页业务员添加所有的id查询的总数

	List<Sys_User_Ext> getUserID(String name);

	Sys_User loginUser(Sys_User user); /*客户关系管理系统登录*/

	List<SysV_UserFull> getUsertypeList(int usertype, int type);/*获取用户列表*/
	List<Map<String,Object>> getCompanyNameList(String keyword);/*获取公司列表 leoli*/


	int updateT(String id, CommonsMultipartFile file, String filename);


	Long getSys_userinvitecode(String invitecode);

	List<Sys_User> getSysuserinvitecode(String code);

	List<SysV_UserFull> getSysV_UserFullList(Map<String, Object> map);//的列表

	int getCountSysV_UserFull(Map<String, Object> map);

	int saveCompanyuser(String no,String pwd,String namenick,String companyname,String companybrand,String tagproduct,String remark);

	int savedeleteSysuser(long l);//主要处理删除的逻辑

	int savedeletealluser(long l);//删除user表和附表

	String getUr_phone(long ur_id);//根据用户id查询用户的电话

	List<Sys_User> getUr_stopflag(String ur_phone);//根据电话查询所有的用户

	List<SysV_UserFull> getuserfullList(Map<String, Object> map);

	Integer getCountUserfull(Map<String, Object> map);

	Integer saveAllImageUrl(Long userid,String filename);/*更新图片新地址*/

	String CreateLoginToken(String logintype,long userid);/*建立登录token*/


}
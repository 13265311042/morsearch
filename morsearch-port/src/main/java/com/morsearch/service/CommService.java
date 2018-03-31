package com.morsearch.service;

import com.morsearch.model.Base_LableList;
import com.morsearch.model.Base_Rotation;
import com.morsearch.model.Sys_Config;
import com.morsearch.model.Sys_WordList;
import com.morsearch.vo.Base_LableList_list;
import com.morsearch.vo.Sys_WordList_list;

import java.util.Date;
import java.util.List;
import java.util.Map;


/*公用Service*/

public interface CommService {
	String LoginUser(String userno, String password); /*登录*/
	String getPermissiin(String sm_no); /*得到权限*/
	String getRole(String sm_no); /*得到角色*/

	/*按类别获取标签列表 showflag为false时，只取名称和编号，stopflag为假时，不取停用记录，strselect有值时打勾*/
	/*getLableList("2007',false,false,"")*/
	Base_LableList_list getLableList(String bl_type, String strselect);
	/*按类别获取用词列表 showflag为false时，只取名称和编号，strselect有值时打勾*/
	Sys_WordList_list getSys_WordList(String sw_type, int flag, String strselect);

	List<Sys_WordList> getSys_WordListSingle(String sw_type);/*返回单一的列表*/

	Sys_WordList getSys_WordCodeDetail(String type, String code);/*通过代码获取明细*/

	String getSys_WordList(String name);


	String getSysConfigValue(String code);/*读取系统配置*/
	List<Sys_Config> getSysConfigList(String code);/*获取系统配置列表*/

	String getPmArchivesTitle(Long pmid);/*通过ID获取title*/

	String getDateToShortStr(Date dt);/*转简短日期*/


	Sys_Config getSys_Configvalue(String name);

	String getDm_createno(long id);//前台用户通过id查询出用户的昵称,设计师,业务员

	String getPmArchivesfilename(Long pmid);/*通过ID获取文件名称*/

	Map<String,Object> getFn_Award_Share(String task,Long userid,String yqm);/*查赠送资料-多类*/

	String getFn_ReadLoginValue(String type,String userid,String mode);/*读取登录值*/





}

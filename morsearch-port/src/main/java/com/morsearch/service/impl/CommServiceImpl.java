package com.morsearch.service.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.dao.*;
import com.morsearch.model.*;
import com.morsearch.service.CommService;
import com.morsearch.service.RedisService;
import com.morsearch.vo.Base_LableList_list;
import com.morsearch.vo.Login_Msg;
import com.morsearch.vo.Sys_WordList_list;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/*公用Service*/

@Service("CommService")

public class CommServiceImpl implements CommService {
	@Autowired
	private AA_CommMapper aa_CommMapper;
	@Autowired
	private Base_LableListMapper base_LableListMapper;
	@Autowired
	private Base_LableTypeMapper base_LableTypeMapper;
	@Autowired
	private Sys_WordListMapper sys_WordMapper;
	@Autowired
	private Sys_ConfigMapper sys_ConfigMapper;
	@Autowired
	private Sys_UserMapper sys_userMapper;


	@Resource
	private RedisService redisService;
	private Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();


	@Override
	public String LoginUser(String userno, String password) {
		return aa_CommMapper.LoginUser(userno,password);
	}

	@Override
	public String getPermissiin(String sm_no) {
		return aa_CommMapper.getPermission(sm_no);
	}

	@Override
	public String getRole(String sm_no) {
		return aa_CommMapper.getRole(sm_no);
	}

	/*按类别获取标签列表 showflag为false时，只取名称和编号，stopflag为假时，不取停用记录，strselect有值时打勾*/
	@Override
	public Base_LableList_list getLableList(String bl_type,String strselect) {
		Base_LableList_list  list=new Base_LableList_list();
		Base_LableType lt=base_LableTypeMapper.selectByPrimaryKey(bl_type);
		list.setType(bl_type);
		list.setTitle(lt.getBt_name());
		list.setAllowflag(lt.getBt_allowflag());
		list.setList(base_LableListMapper.getLableList(bl_type,false));
		/*处理选择*/
		if (strselect!=null&&!"".equals(strselect)) {/**/
			if (strselect.contains("|")==true){strselect="|"+strselect+"|";};
			if (strselect.contains(";")==true){strselect=";"+strselect+";";};
			for (int i = 0; i < list.getList().size(); i++) {
				list.getList().get(i).setBl_selectflag(strselect.contains(list.getList().get(i).getBl_name()));
			} ;

		};
		return list;
	}

	/*按类别获取用词列表 showflag为false时，只取名称和编号，strselect有值时打勾*/
	@Override
	public Sys_WordList_list getSys_WordList(String sw_type, int flag, String strselect) {
		Sys_WordList_list  list=new Sys_WordList_list();
		list.setType(sw_type);
		list.setTitle(sys_WordMapper.getWordTypeName(sw_type));
		list.setList(sys_WordMapper.getSysWordList(sw_type,flag));
		/*处理选择*/
		if (strselect!=null&&!"".equals(strselect)) {/**/
			if (strselect.contains("|")==true){strselect="|"+strselect+"|";};
			if (strselect.contains(";")==true){strselect=";"+strselect+";";};
			for (int i = 0; i < list.getList().size(); i++) {
				list.getList().get(i).setSw_selectflag(strselect.contains(list.getList().get(i).getSw_name()));
			} ;
		};
		return list;
	}

	@Override
	public List<Sys_WordList> getSys_WordListSingle(String sw_type) {
		return sys_WordMapper.getSysWordList(sw_type,2);
	}

	@Override
	public Sys_WordList getSys_WordCodeDetail(String type, String code) {
		Sys_WordListExample ll = new Sys_WordListExample();
		Sys_WordListExample.Criteria criteria = ll.createCriteria();
		criteria.andSw_typeEqualTo(type);
		criteria.andSw_codeEqualTo(code);
		List<Sys_WordList> sw=sys_WordMapper.selectByExample(ll);
		if (sw!=null&&sw.size()>0){
			return  sys_WordMapper.selectByExample(ll).get(0);
			}
		else{
			return  null;
		}
		//sys_WordMapper.getSys_WordCodeDetail(type,code);
	}

	@Override
	public String getSys_WordList(String name) {
		return sys_WordMapper.getWordTypeCode(name);
	}


	@Override
/*读取系统配置*/
	public String getSysConfigValue(String code) {
		String rut="";
		rut=redisService.getMapRow(Constants.REDIS_SYS_CONFIG,code);
		if (rut!=null){
			rut= (gson.fromJson(rut, Sys_Config.class)).getSc_value();
		}else{
			Sys_Config sc=sys_ConfigMapper.selectByPrimaryKey(code);
			if (sc!=null){rut=sc.getSc_value();};
		};
		return rut;
	}

	@Override
	public List<Sys_Config> getSysConfigList(String code) {
		List<Sys_Config> scl=new ArrayList<Sys_Config>();
		if (code!=null&&!"".equals(code)){
			scl.add(sys_ConfigMapper.selectByPrimaryKey(code));
		}else{
			scl=sys_ConfigMapper.selectByExample(null);
		};
		return  scl;
	}

	@Override
	public String getPmArchivesTitle(Long pmid) {
		return aa_CommMapper.getPmArchivesTitle(pmid);
	}

	@Override
	public String getDateToShortStr(Date dt) {
		return aa_CommMapper.getDateToShortStr(dt);
	}

	@Override
	public Sys_Config getSys_Configvalue(String name) {
		return sys_ConfigMapper.getSys_Configvalue(name);
	}

	@Override
	public String getDm_createno(long id) {
		return sys_userMapper.selectByPrimaryKeyDm_createno(id);
	}

	@Override
	public String getPmArchivesfilename(Long pmid) {
		return aa_CommMapper.getPmArchivesfilename(pmid);
	}

	@Override
	public Map<String, Object> getFn_Award_Share(String task, Long userid, String yqm) {
		return aa_CommMapper.getFn_Award_Share(task,userid,yqm);
	}

	@Override
	public String getFn_ReadLoginValue(String type,String userid,String mode) {
		String rut="";
		if (type.equals(Constants.LOGIN_TYPE_FRONT)){type=Constants.REDIS_LOGIN_FRONT;};
		if (type.equals(Constants.LOGIN_TYPE_BACK)){type=Constants.REDIS_LOGIN_BACK;};
		String lms=redisService.getMapRow(type,userid+"");
		if (lms!=null&&!"".equals(lms)){
			Login_Msg lm= (gson.fromJson(lms, Login_Msg.class));
			switch (mode){
				case "sessionid":
					rut=lm.getSessionid();
					break;
				case "userno":
					rut=lm.getUserno();
					break;
				case "username":
					rut=lm.getUsername();
					break;
				case "userjob":
					rut=lm.getUserjob();
					break;
				case "loginsource":
					rut=lm.getLoginsource();
					break;
				case "logintype":
					rut=lm.getLogintype();
					break;
				case "loginversion":
					rut=lm.getLoginversion();
					break;
				case "logindate":
					rut= String.valueOf(lm.getLogindate());
					break;
				case "name.job":
					rut=lm.getUsername()+"   "+ CommonUtil.read_str(lm.getUserjob());
					break;
			};

		}
		if (rut==null){rut="";};
		return rut;
	}


}

package com.morsearch.service.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.*;
import com.morsearch.dao.*;
import com.morsearch.model.*;
import com.morsearch.service.CommService;
import com.morsearch.service.RedisService;
import com.morsearch.service.UserService;
import com.morsearch.service.WalletService;
import com.morsearch.vo.Login_Msg;
import org.apache.commons.codec.digest.DigestUtils;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.annotation.Resource;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.*;


@Service("userService")

public class UserServiceImpl implements UserService {

	public UserServiceImpl() {
		super();
	}
	/**
	 *
	 */
	@Autowired
	private Sys_UserMapper userMapper;
	@Autowired
	private Sys_User_ExtMapper ueMapper;
	@Autowired
	private SysV_UserFullMapper ufMapper;
	@Autowired
	private Sys_User_MsgMapper umMapper;
	@Resource
	protected RedisService redisService;
	@Autowired
	private HomeV_DetailMapper DetailMapper;
	@Autowired
	private HomeV_PageMapper pageMapper;
	@Autowired
	private AA_CommMapper commMapper;
	@Resource
	private CommService commService;
	@Resource
	private Base_CompanyMapper baseCompanyMapper;
	@Resource
	private Award_Share_CountMapper award_share_count;
	@Autowired
	private Acc_WalletMapper WalletMapper;
	@Autowired
	private Acc_MemoIntegralMapper memointegralmapper;
	@Resource
	private WalletService walletService;
	@Resource
	private UserService userService;
	@Resource
	private SysV_UserFullMapper sysV_userFullMapper;

	private Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();

	@Override
	public int insertsave(Sys_User ur, Sys_User_Ext ut,Sys_User_Msg um) {
		int rut = 0;
		if (ur != null) {
			rut = userMapper.insertSelective(ur);
		};
		if (ut != null) {
			ut.setUe_userid(ur.getUr_id());
			rut += ueMapper.insertSelective(ut);
		};
		if (um != null) {
			um.setUm_userid(ur.getUr_id());
			rut += umMapper.insertSelective(um);
		};

		/*增加注册*/
		Map<String,Object> ac=commMapper.getFn_Award_Share("1",ur.getUr_id(),ur.getUr_invitecode());
		if (ac!=null&& CommonUtil.convert_Long(ac.get("baid").toString())!=0){
			/*增加明细*/
			Award_Share_Count asc=new Award_Share_Count();
			asc.setSc_activityid(CommonUtil.convert_Long(ac.get("baid").toString()));
			asc.setSc_share_userid(CommonUtil.convert_Long(ac.get("sharedid").toString()));
			asc.setSc_share_award(CommonUtil.convert_Int(ac.get("share_gift").toString()));
			asc.setSc_receive_userid(CommonUtil.convert_Long(ac.get("receiveid").toString()));
			asc.setSc_receive_award(CommonUtil.convert_Int(ac.get("receive_gift").toString()));
			asc.setSc_createdate(new Date());
			award_share_count.insertSelective(asc);
			if (ac.get("sharedid")!=null&& CommonUtil.convert_Long(ac.get("sharedid").toString())!=0){
			/*增加分享人积分*/
				walletService.addintegral(Long.valueOf(ac.get("sharedid").toString())
						,CommonUtil.convert_bigdecimal(ac.get("share_gift").toString())
						,Long.valueOf(ac.get("baid").toString()),ac.get("baname").toString(),"1.注册");
			};
			if (ac.get("receiveid")!=null&& CommonUtil.convert_Long(ac.get("receiveid").toString())!=0){
			/*增加被分享人积分*/
				walletService.addintegral(Long.valueOf(ac.get("receiveid").toString())
						,CommonUtil.convert_bigdecimal(ac.get("receive_gift").toString())
						,Long.valueOf(ac.get("baid").toString()),ac.get("baname").toString(),"1.注册");
			};


		};
		return rut;
	}

	@Override
	public int updateByPrimaryKey(Sys_User record) {
		return userMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int addregister(Sys_User ur,Sys_User_Ext ue) {
		int rut = 0;
/*检查用户 begin*/
		Long bdid = userService.getUserId(ur.getUr_phone(),2);/*获取手机号码账号*/
		if (bdid!=null){
			ur.setUr_id(bdid);
			rut += userMapper.updateByPrimaryKeySelective(ur);
			if (ue!=null) {
				ue.setUe_userid(bdid);
				rut += ueMapper.updateByPrimaryKeySelective(ue);
			};
		}else{
			rut += userMapper.insertSelective(ur);
			if (ue==null){ue =new Sys_User_Ext();};
			ue.setUe_userid(ur.getUr_id());
			rut += ueMapper.insertSelective(ue);
			Sys_User_Msg um=new Sys_User_Msg();
			um.setUm_userid(ur.getUr_id());
			rut += umMapper.insertSelective(um);
		};


/*增加注册*/
		Map<String,Object> ac=commMapper.getFn_Award_Share("1",ur.getUr_id(),ur.getUr_invitecode());
		if (ac!=null&& CommonUtil.convert_Long(ac.get("baid").toString())!=0){
			/*增加明细*/
			Award_Share_Count asc=new Award_Share_Count();
			asc.setSc_activityid(CommonUtil.convert_Long(ac.get("baid").toString()));
			asc.setSc_share_userid(CommonUtil.convert_Long(ac.get("sharedid").toString()));
			asc.setSc_share_award(CommonUtil.convert_Int(ac.get("share_gift").toString()));
			asc.setSc_receive_userid(CommonUtil.convert_Long(ac.get("receiveid").toString()));
			asc.setSc_receive_award(CommonUtil.convert_Int(ac.get("receive_gift").toString()));
			asc.setSc_createdate(new Date());
			award_share_count.insertSelective(asc);
			if (ac.get("sharedid")!=null&& CommonUtil.convert_Long(ac.get("sharedid").toString())!=0){
			/*增加分享人积分*/
				walletService.addintegral(Long.valueOf(ac.get("sharedid").toString())
						,CommonUtil.convert_bigdecimal(ac.get("share_gift").toString())
						,Long.valueOf(ac.get("baid").toString()),ac.get("baname").toString(),"1.注册");
			};
			if (ac.get("receiveid")!=null&& CommonUtil.convert_Long(ac.get("receiveid").toString())!=0){
			/*增加被分享人积分*/
			walletService.addintegral(Long.valueOf(ac.get("receiveid").toString())
				,CommonUtil.convert_bigdecimal(ac.get("receive_gift").toString())
				,Long.valueOf(ac.get("baid").toString()),ac.get("baname").toString(),"1.注册");
			};

		};
		return rut;
	}

	@Override
	public SysV_UserFull getUser_FullDetail(Long ur_id, int type) {
		return ufMapper.getUserDetail(ur_id,type);
	}

	@Override
	public Sys_User_Msg getUserMessage(Long userid) {
		Sys_User_Msg um=umMapper.selectByPrimaryKey(userid);
		return um;
	}


	@Override
	public Sys_User getSysUserDetail(Long ur_id) {
		return userMapper.selectByPrimaryKey(ur_id);
	}

	@Override
	public int updateSysUser(Sys_User su) {
		return userMapper.updateByPrimaryKeySelective(su);
	}

	@Override
	public Boolean isUserId(Long userid) {
		/*返回是否有此值*/
		Sys_UserExample ll=new Sys_UserExample();
		Sys_UserExample.Criteria criteria = ll.createCriteria();
		criteria.andUr_idEqualTo(userid);
		int i=userMapper.countByExample(ll);
		return i>=1?true:false;
	}


	@Override
	public int updatesave(Sys_User ur, Sys_User_Ext ut,Sys_User_Msg um) {
		int rut=0;
		int iattr=0;
		if (ur!=null){rut=userMapper.updateByPrimaryKeySelective(ur);};
		if (ut!=null){
			iattr=ueMapper.updateByPrimaryKeySelective(ut);
			if (iattr==0){iattr=ueMapper.insertSelective(ut);};
			rut+=iattr;
		};
		if (um!=null){
			iattr=umMapper.updateByPrimaryKeySelective(um);
			if (iattr==0){iattr=umMapper.insertSelective(um);};
			rut+=iattr;
		};
		return rut;
	}


	@Override
	public Sys_User selectByUserName(String ur_name) {
		return null;
	}

	@Override
	public Sys_User getUser_MainDetail(Long ID) {
		return userMapper.selectByPrimaryKey(ID);
	}

	@Override
	public Sys_User_Ext getUser_ExtDetail(Long ID) {
		return ueMapper.selectByPrimaryKey(ID);
	}

	@Override
	public SysV_UserFull selectLogin(String account,String password,int usertype,int mode) {
		return ufMapper.selectLogin(account,password,usertype,mode);
	}

	@Override
	public List<Sys_User> getuserList(int pageindex, int pagesize) {
		return userMapper.getuserList(pageindex, pagesize);
	}

	@Override
	public List<Sys_User> getuserList(Map<String, Object> map) {
		return userMapper.getuserList(map);
	}

	@Override
	public int getuserListCount() {
		return userMapper.getuserListCount();
	}

	@Override
	public int getCountUser(Map<String, Object> map) {
		return userMapper.getCountUser(map);
	}

	@Override
	public int getCheckDouble(int usertype,String ur_no, String ur_phone, String ur_email,String ur_token) {
		return userMapper.getCheckDouble(usertype,ur_no,ur_phone,ur_email,ur_token);
	}

	@Override
	public Long getUserId(String account, int type) {
		return userMapper.getUserId(account,type);
	}

	@Override
	public Integer getUserType(String account, int type) {
		String aa=userMapper.getUserType(account,type);
		if (aa==null){aa="0";};
		return Integer.parseInt(aa);
	}

	@Override
	public List<Sys_User_Msg> getUserMsgList() {
		return umMapper.selectByExample(null);
	}


/*保存home接口redis资料,用户id,简称，需要增加数量，注：放在事务处理后的接口位置*/
	@Override
	public int saveredis_home_base(Long userid) {
		System.out.print("saveredis_home_base 1:"+userid);
		try{
/*获取新值 begin*/
		HomeV_DetailExample ll = new HomeV_DetailExample();
		HomeV_DetailExample.Criteria criteria = ll.createCriteria();
		criteria.andUr_idEqualTo(userid);
		HomeV_Detail hdnow=DetailMapper.selectByExample(ll).get(0);
/*获取新值 end*/
		String strmm=redisService.getMapRow(Constants.REDIS_USER_DETAIL,userid+"");
		String posnow=hdnow.getUe_teamlongitude()+"*"+hdnow.getUe_teamlatitude();/*当前坐标*/
		HomeV_Detail hdold=null;
		if (strmm!=null) {hdold = gson.fromJson(strmm, HomeV_Detail.class);};/*旧值*/

/*更新坐标旧值 begin*/
		if ((hdold!=null)&&(!hdnow.getUe_companylongitude().equals(hdold.getUe_companylongitude())||
				!hdnow.getUe_companylatitude().equals(hdold.getUe_companylatitude()))){
				HomeV_Page hpold=pageMapper.getHomePageDetail(hdold.getUe_teamlongitude(),hdold.getUe_teamlatitude());
				String posold=hdold.getUe_teamlongitude()+"*"+hdold.getUe_teamlatitude();
				if (hpold==null){
					redisService.deleteValue(Constants.REDIS_SALEHOME_POS+posold); /*删除没人员的主表*/
				}else{
					savepagepos(posold,hpold); /*更新主表*/
				};
			redisService.saveStringValue(Constants.REDIS_SALEHOME_LIST,pageMapper.getHomePagelist(),0);/*更新坐标list*/
		};
		if (hdold==null){redisService.saveStringValue(Constants.REDIS_SALEHOME_LIST,pageMapper.getHomePagelist(),0);};/*新用户更新坐标list*/
/*改变坐标 end*/
		redisService.saveMapRow(Constants.REDIS_USER_DETAIL,userid+"",gson.toJson(hdnow));/*存个人*/
/*保存主表新 begin*/
		HomeV_Page hpnow=pageMapper.getHomePageDetail(hdnow.getUe_teamlongitude(),hdnow.getUe_teamlatitude());
		savepagepos(posnow,hpnow);
/*保存主表 end*/
			return 1;
		}
		catch (Exception ex){
			return 0;
		}
	}

	@Override
	public int saveredis_home_count(Long userid,int addneed,int addorder) {

		try {
			String strmm = redisService.getMapRow(Constants.REDIS_USER_DETAIL, userid + "");
			HomeV_Detail hd=gson.fromJson(strmm, HomeV_Detail.class);
			hd.setUm_countneed(hd.getUm_countneed()+addneed);
			hd.setUm_countorder(hd.getUm_countorder()+addorder);
			redisService.saveMapRow(Constants.REDIS_USER_DETAIL,userid+"",gson.toJson(hd));/*存个人*/

/*修改主库*/
			String strpos=hd.getUe_teamlongitude()+"*"+hd.getUe_teamlatitude();
			redisService.saveMapRow(Constants.REDIS_SALEHOME_POS+strpos,"countneed",
					(CommonUtil.convert_Int(redisService.getMapRow(Constants.REDIS_SALEHOME_POS+strpos,"countneed"))+addneed)+"");/*存地点*/
			redisService.saveMapRow(Constants.REDIS_SALEHOME_POS+strpos,"countorder",
					(CommonUtil.convert_Int(redisService.getMapRow(Constants.REDIS_SALEHOME_POS+strpos,"countorder"))+addorder)+"");/*存地点*/
			return 1;
		}
		catch (Exception ex){
			return 0;
		}
	}


	/*保存主坐标*/
	private void savepagepos(String pos,HomeV_Page hp){
		Map<String, String> mapp = new HashMap<>();/*资料*/
		mapp.put("longitude",""+hp.getLongitude());
		mapp.put("latitude",""+hp.getLatitude());
		mapp.put("userqty",""+hp.getUserqty());
		mapp.put("countneed",""+hp.getCountneed());
		mapp.put("countorder",""+hp.getCountorder());
		mapp.put("companyaddr",""+hp.getCompanyaddr());
		mapp.put("groupid",""+hp.getGroupid());
		redisService.saveMapValue(Constants.REDIS_SALEHOME_POS+pos,mapp,0);/*存地点*/

	};

	@Override
	public Map<String, String> getUserPosTeam(String lng, String lat) {
		return commMapper.getUserPosTeam(lng,lat);
	}

	@Override
	public Map<String, Object> getThirdAccount(String openid, int type) {
		return userMapper.getThirdAccount(openid,type);
	}

	@Override
	public List<Sys_User> getSys_UserListid(Map<String, Object> map) {
		return userMapper.getSys_UserListid(map);
	}

	@Override
	public Integer getCountSys_Userid(Map<String, Object> map) {
		return userMapper.getCountSys_Userid(map);
	}


	@Override
	public List<Sys_User_Ext> getUserID(String name) {
		return ueMapper.getUserID(name);
	}

	@Override
	public Sys_User loginUser(Sys_User user) {
		return userMapper.loginUser(user);
	}

	@Override
	public List<SysV_UserFull> getUsertypeList(int usertype, int type) {
		return ufMapper.getUsertypeList(usertype,type);
	}

	@Override
	public  List<Map<String,Object>> getCompanyNameList(String keyword) {
		return commMapper.getCompanyNameList(keyword);
	}

	@Override
	public int updateT(String userid, CommonsMultipartFile file,String filename) {
		int rut=0;
		try {
			Properties p = new Properties();
			InputStream is = null;
			is=Thread.currentThread().getContextClassLoader().getResourceAsStream("ftp.properties");
			p.load(is);
			String ADDRESS = p.getProperty("FTP_ADDRESS");
			String PORT = p.getProperty("FTP_PORT");
			String USERNAME = p.getProperty("FTP_USERNAME");
			String PASSWORD = p.getProperty("FTP_PASSWORD");
			Sys_User user1 = userMapper.selectByPrimaryKey(Long.valueOf(userid));
			if (user1.getUr_imageurl() == null || "".equals(user1.getUr_imageurl().trim())) {
				filename = SequenceCreator.createNewFileName() + ".jpg";
			} else {
				filename = user1.getUr_imageurl();
			}
			Boolean ftprut=FtpUtil.uploadFile(ADDRESS, Integer.parseInt(PORT), USERNAME, PASSWORD, "images", filename, file.getInputStream());
			if (ftprut==true) {
				Sys_User user = new Sys_User();
				user.setUr_id(Long.valueOf(userid));
				user.setUr_imageurl(filename);
				rut = userMapper.updateByPrimaryKeySelective(user);
/*更新相关图片新地址 leoli begin */
				if (filename!=null&&!filename.equals(user1.getUr_imageurl())){
					userService.saveAllImageUrl(Long.valueOf(userid),filename);
				};
/*更新相关图片新地址 leoli end */

/*调用文档接口 leoli begin */
				String httppath=commService.getSysConfigValue("pdf_api");
				if (CommonUtil.isEmpty(httppath)==true){return  0;};/*没设置文档服务器*/
				httppath=httppath+"/imagesapi?filename="+filename;
				JSONObject jsonObject =new JSONObject(HttpConnection.get(httppath));
				if ("0".equals(jsonObject.get("status"))){return  0;};
/*调用文档接口 end*/

/*
				redisService.saveListRow(Constants.REDIS_PERSONIMAGE,filename+","+userid+","
						+ DateTimeUtil.getDateTostr(new Date()));
*/
			}
		}catch (Exception e) {
			e.printStackTrace();
			return 0;
		}

		return rut;
	}

	@Override
	public Long getSys_userinvitecode(String invitecode) {
		return userMapper.getSys_userinvitecode(invitecode);
	}

	@Override
	public List<Sys_User> getSysuserinvitecode(String code) {
		return userMapper.getSysuserinvitecode(code);
	}

	@Override
	public List<SysV_UserFull> getSysV_UserFullList(Map<String, Object> map) {
		return ufMapper.getSysV_UserFullList(map);
	}

	@Override
	public int getCountSysV_UserFull(Map<String, Object> map) {
		return ufMapper.getCountSysV_UserFull(map);
	}

	@Override
	public int saveCompanyuser(String no, String pwd,String namenick, String companyname, String companybrand, String tagproduct, String remark) {
		int rut = 0;
		Sys_User su = new Sys_User();
		su.setUr_no(no);
		su.setUr_password(CommonUtil.pwdmd5t2(pwd));
		su.setUr_namenick(namenick);
		su.setUr_usertype((byte)3);
		su.setUr_register_date(new Date());
		rut += userMapper.insertSelective(su);

		if (rut==1){
		Sys_User_Ext ue = new Sys_User_Ext();
		ue.setUe_userid(su.getUr_id());
		ue.setUe_companyname(companyname);
		ue.setUe_companybrand(companybrand);
		ue.setUe_tagproduct(tagproduct);
		ue.setUe_remark(remark);
			rut += ueMapper.insertSelective(ue);
		}

		if (rut==2){
			Base_Company bc = new Base_Company();
			bc.setCy_remark(remark);
			bc.setCy_trade(companybrand);
			bc.setCy_tagproduct(tagproduct);
			bc.setCy_userid(su.getUr_id());
			bc.setCy_createdate(new Date());
			rut += baseCompanyMapper.insertSelective(bc);
		}

		return rut;
	}

	@Override
	public int savedeleteSysuser(long ur_id) {
		//可能根本没有这个余额用户
		//查询出的所有的钱包id,查询
		int count_userid = walletService.getCount_userid(ur_id);
		if(count_userid>0){
		//查询余额
			Acc_Wallet walletDetail = walletService.getWalletDetail(ur_id);
			BigDecimal wl_account = walletDetail.getWl_account();
			if(!CommonUtil.isNullOrEmpty(wl_account)){
				if(wl_account!=null&&wl_account.longValue()>0){//如果有余额
					//更改状态
					Sys_User sys_user = new Sys_User();
					sys_user.setUr_id(ur_id);
					sys_user.setUr_stopflag(true);//设置为停用
					return userService.updateSysUser(sys_user);//前台用户修改
				}
				return userService.savedeletealluser(ur_id);//删除的逻辑
			}
		}


		return userService.savedeletealluser(ur_id);//删除的逻辑
	}

	@Override
	@Transactional
	public int savedeletealluser(long ur_id) {
		int i = userMapper.deleteByPrimaryKey(ur_id);//删除成功再删除
		if(i!=0){
			ueMapper.deleteByPrimaryKey(ur_id);//删除附加表
			umMapper.deleteByPrimaryKey(ur_id);
			/*WalletMapper.deleteByPrimaryKey(ur_id);//这个钱包也要删除*/
		}
		userMapper.adduserdel(ur_id);/*保存删除的表*/
		return i;
	}

	@Override
	public String getUr_phone(long ur_id) {
		return userMapper.getUr_phone(ur_id);
	}

	@Override
	public List<Sys_User> getUr_stopflag(String ur_phone) {
		Sys_UserExample example = new Sys_UserExample();
		Sys_UserExample.Criteria criteria = example.createCriteria();
		criteria.andUr_phoneEqualTo(ur_phone);
		List<Sys_User> list = userMapper.selectByExample(example);
		return list;
	}

	@Override
	public List<SysV_UserFull> getuserfullList(Map<String, Object> map) {
		return sysV_userFullMapper.getuserfullList(map);
	}

	@Override
	public Integer getCountUserfull(Map<String, Object> map) {
		return sysV_userFullMapper.getCountUserfull(map);
	}

	@Override
/*更新图片新地址*/
	public Integer saveAllImageUrl(Long userid, String filename) {
		int iadd=0;
		iadd+=commMapper.update_Message_image_saler(userid,filename);
		iadd+=commMapper.update_Message_image_desig(userid,filename);
		return iadd;
	}


	//12小时后过期
	private final static int EXPIRE = 3600 * 12;
	@Override
	/*建立登录token*/
	public String CreateLoginToken(String logintype,long userid) {
		String token =null;
		Login_Msg msg=null;
		String rdt="";
/*查logintoken begin*/
		rdt=redisService.getMapRow(logintype,userid+"");
		if (rdt!=null&&!"".equals(rdt)) {
			msg=gson.fromJson(rdt,Login_Msg.class);
			if (msg!=null&&msg.getLogintoken()!=null){token=msg.getLogintoken();}

		};
/*查logintoken end*/

/*查token登录*/
		if (token != null) {
			rdt=redisService.getMapRow(Constants.LOGIN_TOKEN_KEY,token);
			msg = gson.fromJson(rdt,Login_Msg.class);
		}else{
			msg=null;
		};

		if (msg != null && msg.getTime_expire()< System.currentTimeMillis()) {/*超时重取*/
			redisService.removeMapRow(Constants.LOGIN_TOKEN_KEY,token);
			msg=null;
		}

		if (msg == null) {
			token=CharUtil.getRandomStr(32);
			msg = new Login_Msg();
			msg.setUserid(userid);
			msg.setTime_expire(System.currentTimeMillis()+EXPIRE*1000);/*只在重新生成时规定，读取时不变更*/
		};
		msg.setLogintoken(token);
		msg.setTime_update(System.currentTimeMillis());
		redisService.saveMapRow(Constants.LOGIN_TOKEN_KEY,token,gson.toJson(msg));
		return token;
	}


}






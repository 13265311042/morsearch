package com.morsearch.common.constant;

import com.alibaba.fastjson.JSON;

import java.math.BigDecimal;


/**
 * 公共常量定义
 * 
 * @author
 */
public class Constants {
	//生产域名
	public static final String DOMAIN= "http://www.morsearch.com";
	//测试域名
	public static final String testDomain = "http://test.morsearch.com";

	//拜帖设计师收入比例
	public static final BigDecimal order_desgi_sclae =new BigDecimal(0.8);

/*

	//redis主机IP地址
	public static final String REDIS_HOST = "192.168.1.27";
	//redis主机端口
	public static final Integer REDIS_PORT = 6379;
*/

	public static final String WX_APPID_WEB="wx6c8f35edfaec4531";
	public static final String WX_SECRET_WEB="11ce80856e9f7c16fe085ac13eaae773";

	public static final String WX_APPID_MINI="wx92d6d9551ed904f4";
	public static final String WX_SECRET_MINI="0c66cca8816345f85151de8329f385ba";

/*短信模板*/
	public static final String SMS_NOTICE_NEW_DESIGN="221799"; /*新单设计师提醒*/
	public static final String SMS_MEET_DESIGN="218013"; /*设计师会面提醒*/
	public static final String SMS_MEET_SALES="218022"; /*业务员会面提醒*/


	public static final String LOGIN_TOKEN_KEY = "logintoken";

	// Client客户端类型
	public static final int CLIENT_TYPE_PC = 1;// PC端
	public static final int CLIENT_TYPE_WEB = 2;// WEB端
	public static final int CLIENT_TYPE_ANDROID = 3;// 安卓
	public static final int CLIENT_TYPE_IOS = 4;// ios
	public static final int CLIENT_TYPE_WEIXIN = 5;// 微信端

	// JSON 结果返回状态
	public static final int RESULT_STATUS_SUCC = 1;// 状态成功
	public static final int RESULT_STATUS_FAIL = 0;// 状态失败
	public static final String RESULT_MESSAGE_SUCC = "资料获取成功";//
	public static final String RESULT_MESSAGE_FAIL = "资料获取失败";//
	public static final String RESULT_MESSAGE_NULL = "没有资料";//
	public static final String RESULT_DEL_SUCC = "资料删除成功";//
	public static final String RESULT_DEL_FAIL = "资料删除失败";//
	public static final String RESULT_ADD_SUCC = "资料新增成功";//
	public static final String RESULT_ADD_FAIL = "资料新增失败";//
	public static final String RESULT_EDIT_SUCC = "资料修改成功";//
	public static final String RESULT_EDIT_FAIL = "资料修改失败";//
	public static final String RESULT_MESSAGE_UNUSUAL = "系统资料异常";//
	public static final String RESULT_MESSAGE_NOSID = "缺少SID参数";//

	public static final int DEFAULT_PAGESIZE =10;/*缺省页页数量*/

/* Session 名称*/
	public static final String SESSION_MANAGER = "manager"; // 后台管理
	public static final String SESSION_USER = "user"; //  前端登录

/* 文件路径*/
	public static final String FILE_IMAGES = "/opt/data/images"; // 图片存储路径
	public static final String FILE_PDF = "/opt/data/pdf"; //  PDF存储路径
	public static final String FILE_IMAGES_PDF = "/opt/data/images_pdf"; //  PDF转图片存储路径
	public static final String FILE_DOWNLOAD = "/opt/data/download"; //  版本更新路径
	public static final String FILE_FUJIAN = "/opt/data/accessory"; //附件储存地址
	public static final String FILE_IMGSYS = "/opt/data/imgsys_normal"; //储存系统图片


/*登录信息*/
	public static final String LOGIN_TYPE_FRONT = "1"; /*前端登录*/
	public static final String LOGIN_TYPE_BACK = "2"; /*后台登录*/

	/* 系统参数*/
	public static final String COMPANY_TEL = "0755-83785034"; // 公司电话
	public static final int ORDER_PLANCLOSE_TIME =7; /*订单计划自动关闭天数,默认7天*/


	//友盟推送账号
	public static final String PUSH_DEFAULT_TICKER = "陌搜信息";
	public static final String PUSH_DEFAULT_TITLE_PJ = "陌搜评价提醒";
	public static final String PUSH_DEFAULT_TITLE_HM = "陌搜会面提醒";
	public static final String PUSH_DEFAULT_ALIAS_TYPE = "ms"; //morsearch
/*
	public static final String PUSH_TICKER_NEWORDER = "陌搜拜贴";
	public static final String PUSH_TICKER_RECEIVE= "陌搜拜贴接收";
*/

	/* SMS模板*/
	public static final int SMS_EXPRIATIONTIME =10; /* 验证时间*/

	/* 订单状态，在of_flagfinish为完成标识下，不能修改订单状态
	*订单状态:1发送,2接收，3拜访，4.撤回，5.不合适，6.评价，7.完成*/
	public static final int ORDER_STATUS_FASONG =1; /* 发送*/
	public static final int ORDER_STATUS_JIESHOU =2; /* 接收*/
	public static final int ORDER_STATUS_BAIFAN =3; /* 拜访*/
	public static final int ORDER_STATUS_CHEHUI =4; /* 撤回*/
	public static final int ORDER_STATUS_BUHESHI =5; /* 不合适*/
	public static final int ORDER_STATUS_PINGJIE =6; /* 评价*/
	public static final int ORDER_STATUS_WANCHENG =7; /* 完成*/

	/* 申述状态，of_appealstatus，不能修改订单状态
	*0.还没到申述，1.去申述，2.申述中，3.已完成,4.放弃申述*/
	public static final int ORDER_APPEAL_QSJ =1; /* 去申述*/
	public static final int ORDER_STATUS_SJZ =2; /* 申述中*/
	public static final int ORDER_STATUS_WC =3; /* 已完成*/
	public static final int ORDER_STATUS_FQ =4; /* 放弃申述*/



	/*标签类别 */
	public static final String LABLETYPE_QIYETYPE ="1001"; /* 业务员企业类型*/
	public static final String LABLETYPE_MAJOR ="1002"; /* 专业名称*/
	public static final String LABLETYPE_JOB ="1003"; /* 职位列表*/
	public static final String LABLETYPE_LEVEL ="1004"; /* 级别*/
	public static final String LABLETYPE_NANXIAN ="1005"; /* 从业年限*/
	public static final String LABLETYPE_JINGYONG ="1006"; /* 用户登录禁用原因*/
	public static final String LABLETYPE_BRAND ="1007"; /* 公司品牌*/



	public static final String LABLETYPE_DESIGTYPE ="2000"; /* 设计师企业类型*/
	public static final String LABLETYPE_SEJIPINGJIE ="2001"; /* 设计师评价*/
	public static final String LABLETYPE_DESIGLEVEL ="2005";/*设计师职级*/
	public static final String LABLETYPE_DESIGJOB ="2006";/*设计师职称*/
	public static final String LABLETYPE_YWYSS ="2007"; /* 业务员申述*/


	public static final String LABLETYPE_YEWUPINGJIE ="3001"; /* 业务员评价*/


	/*系统用词 */
	public static final String WORD_CITY ="1001"; /* 城市列表*/
	public static final String WORD_ORDERTYPE ="1002"; /* 我的拜贴*/
	public static final String WORD_ORDERPRICE ="1003"; /*拜贴单价*/
	public static final String WORD_CZLY ="1004"; /*充值来源*/



	/*帐户 */
	public static final String ACC_CURRENCY ="￥"; /* 城市列表*/

	/*检查图片宽高大小 */
	public static final String IMAGE_WH_PERSON ="400*400"; /* 检查个人图片大小-高*宽*/


	/*拜贴 */
	public static final int ORDER_TIME_REVOKE =7200; /* 订单允许撤回时间 秒*/



	// 支付类型
	public static final String PAYTYPE_ABC_DC = "1"; // 农行卡支付
	public static final String PAYTYPE_IC = "2"; // 国际卡支付
	public static final String PAYTYPE_ABC_CC = "3"; // 农行贷记卡支付
	public static final String PAYTYPE_INTERBANK_PAYMEN = "5"; // 基于第三方的跨行支付
	public static final String PAYTYPE_UNIONPAY = "6"; // 银联跨行支付
	public static final String PAYTYPE_COMPANY_ACCOUNT = "7"; // 对公户
	public static final String PAYTYPE_COALITION = "A"; // 支付方式合并
	// 支付交易渠道
	public static final String PAYLINKTYPE_INTERNET = "1"; // Internet网络接入
	public static final String PAYLINKTYPE_MOBILE = "2"; // 手机网络接入
	public static final String PAYLINKTYPE_DIGITAL_TELEVISION = "3"; // 数字电视网络接入
	public static final String PAYLINKTYPE_SMART_CLIENT = "4"; // 智能客户端

	// 用户来源
	public static final int USER_ORGIN_WEB = 1;// 网站注册
	public static final int USER_ORGIN_CODE = 2;// 二维码扫描
	public static final int USER_ORGIN_MANAGE = 3;// 后台
	public static final int USER_ORGIN_APP = 4;// app


	// Redis关键字
	public static final String REDIS_ORDER_STATUS ="order.status";/*存入订单状态*/
	public static final String REDIS_DESHOME_ARCHIVES ="deshome.archives";/*设计师首页*/
	public static final String REDIS_DESHOME_BRAND ="deshome.brand";/*设计师首页*/
	public static final String REDIS_DESHOME_MAJOB ="deshome.majob";/*设计师首页*/
	public static final String REDIS_DESHOME_SALES ="deshome.sales";/*设计师首页*/
	public static final String REDIS_LOGIN_FRONT ="loginfront";/*登录前端*/
	public static final String REDIS_LOGIN_BACK ="loginback";/*登录后台*/

	public static final String REDIS_USER_DETAIL ="user.detail";/*用户明细*/
	public static final String REDIS_USER_MSG ="user.msg";/*用户信息*/
	public static final String REDIS_USER_WILLMAJOR ="user.willmajor";/*用户意向*/
	public static final String REDIS_COMPANYLIST ="companylist";/*公司列表*/

	public static final String REDIS_SALEHOME_LIST ="salehome.list";/*业务员首页列表*/
	public static final String REDIS_SALEHOME_POS ="salehome.pos.";/*业务员首页坐标*/

	public static final String REDIS_SYS_CONFIG ="sys.config";/*存入配置*/

	public static final String REDIS_PAY_BUY ="pay.buy.";/*存入*/
	public static final String REDIS_PAY_RECHARGE ="pay.recharge.";/*存入*/

	public static final String REDIS_ROTATION ="rotation.";/*轮播图*/

	public static final String REDIS_MALL_HOME ="Mall.Home";/*商城首页*/

//	public static final String REDIS_ARCHIVES ="archives";/*处理文档*/

//	public static final String REDIS_PERSONIMAGE ="personimage";/*个人图像*/

/*
	支付通道
*/

	public static enum Pay_Trade {
		ye(0,"余额支付"),
		ali(1,"支付宝"),
		wx(2,"微信支付"),
		bank(3,"银行卡"),
		company(4,"企业支付"),
		aliweb(5,"支付宝WEB"),
		wxweb(6,"微信WEB");
		private int value;
		private String title;
		//构造函数
		private Pay_Trade(int value,String title) {
			this.value = value;
			this.title = title;
		}
		public int getValue() {
			return value;
		}
		public void setValue(int value) {
			this.value = value;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		@Override
		public String toString() {
			return "{value:"+this.value + ",title:" + this.title+"}";
		}
		public static String getTitle(int value) {
			for (Pay_Trade delayedType : Pay_Trade.values()) {
				if (delayedType.getValue() == value) {
					return delayedType.getTitle();
				}
			}
			return null;
		}
	}








	// 上传图片路径
	// 验证码失效时间/分钟
	public static final int LOSE_EFFICACY = 10;
	// 验证码类型
	public static final int VERIFICATION_CODE_REG = 1;// 注册
	public static final int VERIFICATION_CODE_WXIN_REG = 2;// 微信注册
	// 账户金额上限
	public static final String maxAmount = "10000";
	// 管理员初始化密码
	public static final String USER_INIT_PASSWORD = "admin";
	// 客服初始化密码
	public static final String USER_SERVICE_INIT_PASSWORD = "kf123456";
	// 业务员初始化密码
	public static final String USER_CLERK_INIT_PASSWORD = "yw123456";
	// 后台添加用户默认密码
	public static final String USER_ADD_INIT_PASSWORD = "123456";
	// 商品新品时间天数
	public static final int GOODS_NEW_DAY = -7;// 商品新品时间天数
	// 是否热门搜索
	public static final int SEARCH_RECORD_ISHOT_YES = 1;// 是
	public static final int SEARCH_RECORD_ISHOT_NO = 2;// 否
	// 搜索类型
	public static final int SEARCH_RECORD_TYPE_MALL = 1;// 商城
	public static final int SEARCH_RECORD_TYPE_ONLINE = 2;// 在线
	// 用户状态
	public static final int USER_STATUS_NORMAL = 1;// 正常状态
	public static final int USER_STATUS_FORBIDDEN = 2;// 禁用状态
	// 订单来源
	public static final int GOODS_ORDERS_ORGIN_ONLINE = 1;// 网上订单
	public static final int GOODS_ORDERS_ORGIN_PHONE = 2;// 电话订单
	// 用户手机验证状态
	public static final int USER_VERIFYPHONESTATUS_NO = 1;// 未验证
	public static final int USER_VERIFYPHONESTATUS_YES = 2;// 已验证
	// 用户邮箱验证状态
	public static final int USER_VERIFYEMAILSTATUS_NO = 1;// 未验证
	public static final int USER_VERIFYEMAILSTATUS_YES = 2;// 已验证
	// 用户收货地址状态
	public static final int ADDRESS_DETAILS_DEFUALT_NO = 1;// 正常
	public static final int ADDRESS_DETAILS_DEFUALT_YES = 2;// 默认
	// 图片配置 标题配置状态
	public static final int PT_STATUS_SAVE = 1;// 保存
	public static final int PT_STATUS_YES = 2;// 已发布
	public static final int PT_STATUS_NO = 3;// 已取消
	// 短信模板状态
	public static final int SMSMODEL_STATUS_UNUSED = 1;// 未启用
	public static final int SMSMODEL_STATUS_USED = 2;// 已启用

	// 银行请求返回结果
	public static class PayResult {

		public Integer flag; // 请求状态 0：失败；1：成功！
		public String msg;
		public JSON data; // 返回数据

		public PayResult() {
		}

		public PayResult(Integer flag, String msg, JSON data) {
			flag = this.flag;
			msg = this.msg;
			data = this.data;
		}

		public Integer getFlag() {
			return flag;
		}

		public void setFlag(Integer flag) {
			this.flag = flag;
		}

		public String getMsg() {
			return msg;
		}

		public void setMsg(String msg) {
			this.msg = msg;
		}

		public JSON getData() {
			return data;
		}

		public void setData(JSON data) {
			this.data = data;
		}
	}

	public enum PayQueryStatus { // 查询交易状态
		UNPAY("01"), // 未支付
		NONRESPONSE("02"), // 无回应
		CASHOUT("03"), // 已请款
		SUCCESS("04"), // 成功
		REFUNDED("05"), // 已退款
		AUTHORIZED("07"), // 授权已确认
		UNAUTHORIZED("00"), // 授权取消
		FAILED("99"); // 失败

		private String value;

		private PayQueryStatus(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		public boolean verify(String statu) {
			return getValue().equals(statu);
		}
	}

}
package com.morsearch.controller.front;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.morsearch.base.BaseController;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.ControllerUtils;
import com.morsearch.common.util.SequenceCreator;
import com.morsearch.controller.comm.PayAliController;
import com.morsearch.controller.comm.PayWxController;
import com.morsearch.model.*;
import com.morsearch.service.WalletService;
import com.morsearch.vo.*;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.*;

/*钱包管理接口
 Leoli
2017.10.17
*/

@Controller("FrontWalletController")
@RequestMapping("/front/")


public class FrontWalletController extends BaseController {
	@Resource
	private WalletService walletService;
 	private  String userid;//用户id



/*订单支付接口
leoli
2017.10.19
ur_id,typecode,typeqty,balance,tradeway
处理订单，等银行支付接口，一定要放在service层，采用事务
* */

	@SuppressWarnings({ "unused", "null" })
	@RequestMapping(value = "addbuy", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
	public String addbuy(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult=new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);
		appresult.setMessage(Constants.RESULT_ADD_SUCC);
		String rs = "";
		userid=request.getParameter("userid");
		Boolean flag_pass=true;
		String typecode=request.getParameter("typecode");/*代码*/
		String typeqty=request.getParameter("typeqty");/*数量*/
		String tradeway=request.getParameter("tradeway");/*支付类别*/
		String balance=request.getParameter("balance");/*余额*/
		if (balance==null||"".equals(balance)){balance="0";};
/*检查参数 begin*/
		if (flag_pass==true&&(CommonUtil.isEmpty(userid)==true )) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("userid参数不能为空");
			flag_pass = false;
		};

		if (flag_pass==true&&(CommonUtil.isEmpty(typecode)==true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("类别代码不能为空");
			flag_pass = false;
		};

		if (flag_pass==true&&(CommonUtil.isEmpty(typeqty)==true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("数量不能为空");
			flag_pass = false;
		};

		if (flag_pass==true&&(CommonUtil.isEmpty(tradeway)==true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("支付类型不能为空");
			flag_pass = false;
		};

/*判断是否为数字*/
		if (flag_pass==true&&(balance!=null)&&CommonUtil.isBool(balance)==false) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("balance不是布尔型");
			flag_pass = false;
		};

/*检查参数 end*/
/*处理数据 begin*/
		if (flag_pass==true) {
			try {
				Acc_Buy ab=new Acc_Buy();
				ab.setAb_no(SequenceCreator.createnumber("B",5));
				ab.setAb_coincode(typecode);
				ab.setAb_coinqty(new BigDecimal(typeqty));
				ab.setAb_tradeway(Byte.valueOf(tradeway));
				ab.setAb_createid(Long.parseLong(userid));
				ab.setAb_accountid(Long.parseLong(userid));/*支付账号*/
				ab.setAb_createno(commService.getFn_ReadLoginValue(Constants.LOGIN_TYPE_FRONT,userid,"userno"));
				ab.setAb_createdate(new Date());
				ab.setAb_status((byte) 0);/*默认为0*/
				ab.setAb_sourcename(commService.getFn_ReadLoginValue(Constants.LOGIN_TYPE_FRONT,userid,"loginsource"));
				ab.setAb_sourceversion(commService.getFn_ReadLoginValue(Constants.LOGIN_TYPE_FRONT,userid,"loginversion"));
				Boolean bb=("1".equals(balance)||"true".equals(balance.toLowerCase()));
				int ii=walletService.addBuy(ab,bb);/*保存订单*/
				Pay_Sign ps=new Pay_Sign();
				ps.setOrderno(ab.getAb_no());
				ps.setAmount(ab.getAb_payamtactual());
				if (ii==1) {
					Acc_Buy paybuy=walletService.getBuyDetail(ab.getAb_no());
					Pay_Detail pd=new Pay_Detail();
					pd.setTrade_id(paybuy.getAb_id()+"");
					pd.setSubject("购买拜贴");
					pd.setTrade_no(ab.getAb_no());
					pd.setPmno("gm");
					pd.setPmname("购买拜贴");
					java.text.DecimalFormat df=new java.text.DecimalFormat("0.00");/*支付必须转两位小数点*/
					pd.setAmount(df.format(ab.getAb_payamtactual()));
					if (paybuy.getAb_tradeway()==1) {/*支付宝*/
						ps.setTradeway(1);
						ps.setTradesign(PayAliController.payalitosign(pd));
					};
					if (paybuy.getAb_tradeway()==2) {/*微信*/
						ps.setTradeway(2);
						ps.setTradesign(PayWxController.paywxtosign(pd,"APP"));
					};
				}
				appresult.setData(ps);

			} catch (Exception e) {
				logger.error(e.getMessage());
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage(e.getMessage().toString());
				if ("余额不足".equals(e.getMessage())){appresult.setErrorcode("-1");};
/*
				if ("lowprice".equals(e.getMessage())){
					appresult.setMessage("运行环境不是测试状态，不能标超低价");
				}
*/
			}
		}
/*处理数据 end*/
/*返回数据 begin*/
		rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
		out.print(rs);
		out.close();
/*返回数据 end*/
		return null;
	}


/*
我的钱包
Leoli 2017.10.17
获取首页
urid
type 1.显示所有资料，2显示明细数量，3.只显示总数量
* */
	@SuppressWarnings({ "unused", "null" })
	@RequestMapping(value = "getwalletmsg", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
	public String getwalletmsg() throws Exception {
		//Login_Msg aa=@LoginUser();

/*
		String token = request.getHeader("logintoken");
		//如果header中不存在token，则从参数中获取token
		if (StringUtils.isBlank(token)) {
			token = request.getParameter("logintoken");
		}
*/


		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult=new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);
		appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);

		String rs = "";
		userid=request.getParameter("userid");
		String type=request.getParameter("type");
		Boolean flag_pass=true;

/*检查参数 begin*/
		if (flag_pass==true&&(CommonUtil.isEmpty(userid)==true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("userid参数不能为空");
			flag_pass = false;
		};
		if (flag_pass==true&&(CommonUtil.isEmpty(type)==true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("type参数不能为空");
			flag_pass = false;
		};

		if (flag_pass==true&&(userService.isUserId(Long.parseLong(userid))==false)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("无此用户");
			flag_pass = false;
		};


/*检查参数 end*/
/*处理数据 begin*/
		Acc_Wallet_Msg wt = new Acc_Wallet_Msg();

		if (flag_pass==true) {
			try {
				SysV_UserFull sv=userService.getUser_FullDetail(Long.parseLong(userid),5);
				wt.setUserid(sv.getUr_id());
				wt.setUsername(sv.getUr_namenick());
				wt.setUserimage(sv.getUr_imageurl());
				wt.setUsersex(sv.getUr_sex());

				Map<String,Object> aca=walletService.getAccCompanyAccount(Long.parseLong(userid));/*获取个人相关企业的余额帐户 leoli*/
				if (aca!=null){
					wt.setCompanyishave(true);
					wt.setCompanyaccount((BigDecimal) aca.get("wl_account"));
					wt.setCompanyintegral((BigDecimal) aca.get("wl_integral"));
					wt.setCompanydeposit((BigDecimal) aca.get("wl_deposit"));
				}else{
					wt.setCompanyishave(false);
				};

				/*查钱包*/
				Acc_Wallet wl=walletService.getWalletDetail(Long.parseLong(userid));
				if (wl!=null){
					wt.setAccount(wl.getWl_account());
					wt.setIntegral(wl.getWl_integral());
					wt.setDeposit(wl.getWl_deposit());
					wt.setCurrency(Constants.ACC_CURRENCY);
				};

				if (Integer.parseInt(type)==1||Integer.parseInt(type)==2) {
					List<AccV_Deposit> ad = walletService.getDepositList(Long.parseLong(userid));
					wt.setMydeposit(ad);

					if (aca!=null) {
						List<AccV_Deposit> adcpy = walletService.getDepositList((Long) aca.get("wl_userid"));
						wt.setCompanydepositlist(adcpy);
					};

				};
				if (Integer.parseInt(type)==1) { /*显示所有*/
					Sys_WordList_list pl = commService.getSys_WordList(Constants.WORD_ORDERTYPE, 2, null);/*获取拜贴*/
					wt.setPurchaselist(pl);
				};

				wt.setSumaccount(CommonUtil.read_decimal(wt.getAccount()).add(CommonUtil.read_decimal(wt.getCompanyaccount())));
				wt.setSumintegral(CommonUtil.read_decimal(wt.getIntegral()).add(CommonUtil.read_decimal(wt.getCompanyintegral())));
				wt.setSumdeposit(CommonUtil.read_decimal(wt.getDeposit()).add(CommonUtil.read_decimal(wt.getCompanydeposit())));


			} catch (Exception e) {
				logger.error(e.getMessage());
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
			}
		}
/*处理数据 end*/
/*返回数据 begin*/
		appresult.setData(wt);
		rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
		out.print(rs);
		out.close();
/*返回数据 end*/
		return null;
	}


	/*
    我的钱包
    Leoli 2017.10.18
    获取钱包明细
    urid
    * */

	@SuppressWarnings({ "unused", "null" })
	@RequestMapping(value = "getwalletmemo", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
	public String getwalletmemo(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult=new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);
		appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
		String rs = "";
		userid=request.getParameter("userid");
		Boolean flag_pass=true;

/*检查参数 begin*/
		if (flag_pass==true&&(CommonUtil.isEmpty(userid)==true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("[userid]参数不能为空");
			flag_pass = false;
		};
/*检查参数 end*/
/*处理数据 begin*/
		List<Acc_MemoAmt> wm = new ArrayList<Acc_MemoAmt>();
		if (flag_pass==true) {
			try {
			/*控制页码 begin*/
				AppPage page = new AppPage();
				page.setPageindex(request.getParameter("pageindex"));/*当前页*/
				page.setPagesize(request.getParameter("pagesize"));/*分页*/
			/*控制页码 end*/
			/*查询条件 begin*/
				Map<String,Object> map=new HashMap<String,Object>();
				map.put("pagestart",page.getPagestart());
				map.put("pagesize",page.getPagesize());
				map.put("userid",Long.parseLong(userid));
			/*查询条件 end*/
				wm=walletService.getAcc_Wallet_Memo_Amt_list(map);
				page.setRowcount(walletService.getAcc_Wallet_Memo_Amt_count(map));/*记录数*/
				appresult.setPage(page);

				if (wm==null && wm.size()==0) {
					appresult.setStatus(Constants.RESULT_STATUS_FAIL);
					appresult.setMessage(Constants.RESULT_MESSAGE_FAIL);
				}

			} catch (Exception e) {
				logger.error(e.getMessage());
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
			}
		}
/*处理数据 end*/
/*返回数据 begin*/
		appresult.setData(wm);
		rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
		out.print(rs);
		out.close();
/*返回数据 end*/
		return null;
	}


	/*获取充值支付接口
    leoli
    2017.11.08
    userid,code,tradeway,cls
    处理订单，等银行支付接口，一定要放在service层，采用事务
    * */
	@SuppressWarnings({ "unused", "null" })
	@RequestMapping(value = "getrecharge", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
	public String getrecharge(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult=new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);
		appresult.setMessage(Constants.RESULT_ADD_SUCC);
		String rs = "";
		Boolean flag_pass=true;

		Sys_WordList_list us = new Sys_WordList_list();

		if (flag_pass==true) {
			try {
				us =commService.getSys_WordList(Constants.WORD_ORDERPRICE,0,"");
				if (us==null) {
					appresult.setStatus(Constants.RESULT_STATUS_FAIL);
					appresult.setMessage(Constants.RESULT_MESSAGE_FAIL);
				}

			} catch (Exception e) {
				logger.error(e.getMessage());
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
			}
		}
/*处理数据 end*/
/*返回数据 begin*/
		appresult.setData(us);
		rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
		out.print(rs);
		out.close();
/*返回数据 end*/
		return null;
	}


/*充值支付接口
leoli
2017.11.08
userid,code,tradeway,source
处理订单，等银行支付接口，一定要放在service层，采用事务
* */
	@SuppressWarnings({ "unused", "null" })
	@RequestMapping(value = "addrecharge", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
	public String addrecharge(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult=new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);
		appresult.setMessage(Constants.RESULT_ADD_SUCC);
		String rs = "";
		userid=request.getParameter("userid");
		Boolean flag_pass=true;
		String code=request.getParameter("code");/*代码*/
		String tradeway=request.getParameter("tradeway");/*支付类别*/
		String source=request.getParameter("source");/*活动来源*/
		String type=request.getParameter("type");/*用户类别*/
		if (CommonUtil.isEmpty(source)==true){source="0";};
		if (CommonUtil.isEmpty(type)==true){type="1";};
/*检查参数 begin*/
		if (flag_pass==true&&(CommonUtil.isEmpty(userid)==true )) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("userid参数不能为空");
			flag_pass = false;
		};

		if (flag_pass==true&&(CommonUtil.isEmpty(code)==true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("金额类别不能为空");
			flag_pass = false;
		};

		if (flag_pass==true&&(CommonUtil.isEmpty(tradeway)==true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("支付通道不能为空");
			flag_pass = false;
		};

		if (flag_pass==true&&(CommonUtil.isEmpty(code)==false)&&("1".equals(type))) {
			Sys_WordList sw=commService.getSys_WordCodeDetail(Constants.WORD_ORDERPRICE,code);
			if (sw==null){
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage("无此【"+code+"】金额类别");
				flag_pass = false;
			};
		};
/*检查参数 end*/
/*处理数据 begin*/
		if (flag_pass==true) {
			try {
				Acc_Recharge ab=new Acc_Recharge();
				ab.setAr_no(SequenceCreator.createnumber("C",5));
				if (code.length()>6){code=code.substring(0,6);};
				ab.setAr_typecode(code);
				ab.setAr_activityid(Long.valueOf(source));/*来源*/
				ab.setAr_tradeway(Byte.valueOf(tradeway));
				ab.setAr_createid(Long.parseLong(userid));
				ab.setAr_createno( commService.getFn_ReadLoginValue(Constants.LOGIN_TYPE_FRONT,userid,"userno"));
				ab.setAr_createdate(new Date());
				ab.setAr_status((byte) 0);/*默认为0*/
				ab.setAr_sourcename(commService.getFn_ReadLoginValue(Constants.LOGIN_TYPE_FRONT,userid,"loginsource"));
				ab.setAr_sourceversion(commService.getFn_ReadLoginValue(Constants.LOGIN_TYPE_FRONT,userid,"loginversion"));
				int ii=walletService.addRecharge(ab, Integer.parseInt(type));/*保存充值*/
				/*处理第三方支付*/
				if (ii>0) {
					Acc_Recharge paybuy=walletService.getRechargeDetail(ab.getAr_no());
					Pay_Detail pd=new Pay_Detail();
					pd.setTrade_id(paybuy.getAr_id()+"");
					pd.setSubject("陌搜充值");
					pd.setTrade_no(ab.getAr_no());
					pd.setPmno("cz");
					pd.setPmname("陌搜充值");
					java.text.DecimalFormat df=new java.text.DecimalFormat("0.00");/*支付必须转两位小数点*/
					pd.setAmount(df.format(ab.getAr_priceactual()));
					Pay_Sign ps=new Pay_Sign();
					ps.setOrderno(ab.getAr_no());
					ps.setAmount(ab.getAr_priceactual());

					ps.setTradeway(paybuy.getAr_tradeway());
					if (paybuy.getAr_tradeway()==1) {/*支付宝*/
						ps.setTradesign(PayAliController.payalitosign(pd));
						appresult.setData(ps);
					};
					if (paybuy.getAr_tradeway()==2) {/*微信*/
						ps.setTradesign(PayWxController.paywxtosign(pd,"APP"));
						appresult.setData(ps);
					};
					if (paybuy.getAr_tradeway()==5) {/*H5支付宝*/
					//	ps.setTradesign(PayAliController.fn_aliqrcode(pd.getTrade_no(),pd.getAmount(),pd.getSubject()));
						AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do", PayAliController.APP_ID, PayAliController.APP_PRIVATE_KEY, "json","GBK", PayAliController.ALIPAY_PUBLIC_KEY, "RSA2");
						AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();//创建API对应的request
						alipayRequest.setReturnUrl(PayAliController.NOTIFY_URL);
						alipayRequest.setNotifyUrl(PayAliController.NOTIFY_URL);//在公共参数中设置回跳和通知地址
						alipayRequest.setBizContent("{" +
								"    \"out_trade_no\":\"" +pd.getTrade_no()+ "\"," +
								"    \"total_amount\":"+pd.getAmount()+"," +
								"    \"subject\":\""+pd.getSubject()+"\"," +
								"    \"body\":\""+pd.getSubject()+"\"," +
								"    \"product_code\":\"FAST_INSTANT_TRADE_PAY\"," +
								"    \"extend_params\":{" +
								"    }" +
								"  }");//填充业务参数
						//   try {
						String rut = alipayClient.pageExecute(alipayRequest).getBody(); //调用SDK生成表单
						redisService.saveStringValue("aliweb."+pd.getTrade_no(),rut,360);
						ps.setTradesign("aliweb."+pd.getTrade_no());


						appresult.setData(ps);
					};
					if (paybuy.getAr_tradeway()==6) {/*H5微信*/
						ps.setTradesign(PayWxController.paywxtosign(pd,"NATIVE"));
						appresult.setData(ps);
					};
				}

			} catch (Exception e) {
				logger.error(e.getMessage());
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage(e.getMessage());
			}
		}
/*处理数据 end*/
/*返回数据 begin*/
		rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
		out.print(rs);
		out.close();
/*返回数据 end*/
		return null;
	}


/*获取支付结果状态
leoli
2017.12.22
 * type 类别，1.购买，2.充值
 * orderno,订单单号
* */


	@SuppressWarnings({ "unused", "null" })
	@RequestMapping(value = "getpaystatus", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
	public String getpaystatus(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult=new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_SUCC);
		appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
		String rs = "";
		String type=request.getParameter("type");
		String orderno=request.getParameter("orderno");
		Boolean flag_pass=true;

/*检查参数 begin*/

		if (flag_pass==true&&(CommonUtil.isEmpty(type)==true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("type参数不能为空");
			flag_pass = false;
		};
		if (flag_pass==true&&(CommonUtil.isEmpty(orderno)==true)) {
			appresult.setStatus(Constants.RESULT_STATUS_FAIL);
			appresult.setMessage("orderno参数不能为空");
			flag_pass = false;
		};

/*检查参数 end*/
/*处理数据 begin*/
		if (flag_pass==true) {
			try {
				if ("1".equals(type)){rs=redisService.getStringValue(Constants.REDIS_PAY_BUY+orderno);};
				if ("2".equals(type)){rs=redisService.getStringValue(Constants.REDIS_PAY_RECHARGE+orderno);};
				if (rs==null || "".equals(rs)) {
					appresult.setStatus(Constants.RESULT_STATUS_FAIL);
					appresult.setMessage("无此订单状态，请进入订单页面查看");
				}

			} catch (Exception e) {
				logger.error(e.getMessage());
				appresult.setStatus(Constants.RESULT_STATUS_FAIL);
				appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
			}
		}
/*处理数据 end*/
/*返回数据 begin*/
		appresult.setData(rs);
		rs= CommonUtil.datatype_convert(request,gson.toJson(appresult));
/*处理数据格式*/
		out.print(rs);
		out.close();
/*返回数据 end*/
		return null;
	}




}

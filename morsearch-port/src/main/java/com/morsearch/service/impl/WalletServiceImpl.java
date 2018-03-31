package com.morsearch.service.impl;

import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.dao.*;
import com.morsearch.model.*;
import com.morsearch.service.CommService;
import com.morsearch.service.LableListService;
import com.morsearch.service.RedisService;
import com.morsearch.service.WalletService;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;


@Service("walletService")

public class WalletServiceImpl implements WalletService {
	@Autowired
	private Acc_WalletMapper WalletMapper;
	@Autowired
	private AccV_DepositMapper DepositVMapper;
	@Autowired
	private AA_CommMapper aa_CommMapper;
	@Autowired
	private Sys_WordListMapper sys_WordMapper;
	@Autowired
	private Acc_BuyMapper acc_BuyMapper;
	@Autowired
	private Acc_DepositMapper depositMapper;
	@Resource
	private CommService commService;
	@Autowired
	private Acc_RechargeMapper rechargemapper;
	@Autowired
	private Acc_MemoAmtMapper accmemomapper;
	@Autowired
	private Acc_MemoCoinMapper memocoinMapper;
	@Autowired
	private Acc_MemoIntegralMapper memointegralmapper;
/*
	@Autowired
	private Award_RechargeMapper award_rechargemapper;
*/
	@Autowired
	private Award_Recharge_CountMapper recharge_countmapper;
	@Resource
	private RedisService redisService;

	@Resource
	private Acc_WalletMapper acc_walletMapper;

	@Override
	public Acc_Wallet getWalletDetail(Long userid) {
		return WalletMapper.selectByPrimaryKey(userid);
	}

	@Override
	public List<AccV_Deposit> getDepositList(Long userid) {
		AccV_DepositExample ll=new AccV_DepositExample();
		AccV_DepositExample.Criteria criteria = ll.createCriteria();
		criteria.andAc_useridEqualTo(userid);
		List<AccV_Deposit> so=DepositVMapper.selectByExample(ll);
/*补没有的*/
		List<Sys_WordList> sw=sys_WordMapper.getAcc_DepositNoType(userid);
		if (sw!=null){
			if (so==null){so=new ArrayList<AccV_Deposit>();};
			for (int ii=0;ii<sw.size();ii++){
			AccV_Deposit ad=new AccV_Deposit();
			ad.setAc_typecode(sw.get(ii).getSw_code());
			ad.setAc_typename(sw.get(ii).getSw_name());
			ad.setAc_typeimage(sw.get(ii).getSw_imageurl());
			ad.setAc_typeprice(sw.get(ii).getSw_value());
			ad.setAc_deposit(new BigDecimal(0));
			so.add(sw.get(ii).getSw_index()-1,ad);
			};
		};
		return so;
	}

	@Override
	public int addBuy(Acc_Buy record,Boolean isteampay) throws Exception {
		int icode; /*第三方支付*/
		/*定位价格及金额 begin*/
		Sys_WordListExample ll=new Sys_WordListExample();
		Sys_WordListExample.Criteria criteria = ll.createCriteria();
		criteria.andSw_typeEqualTo(Constants.WORD_ORDERTYPE);/*拜贴类型*/
		criteria.andSw_codeEqualTo(record.getAb_coincode());
		Sys_WordList sw=sys_WordMapper.selectByExample(ll).get(0);
/*检查定价问题 重要 begin*/
		if ((Double.parseDouble(sw.getSw_value())<10)&&(!"1".equals(commService.getSysConfigValue("debug_open")))){
			throw new Exception("系统异常,超低价");/**/
		};
/*检查定价问题 重要 end*/
		record.setAb_coinname(sw.getSw_name());
		record.setAb_coinimage(sw.getSw_imageurl());
		record.setAb_coinprice(new BigDecimal(sw.getSw_value()));
		record.setAb_payamtorder(record.getAb_coinprice().multiply(record.getAb_coinqty()));
		/*定位价格及金额 end*/

/*查余额 begin*/
		record.setAb_paybalance(new BigDecimal(0));
		if (record.getAb_tradeway()==4){
			isteampay=false;/*企业支付放在后面检查余额*/
			record.setAb_paybalance(record.getAb_payamtorder());
		};/*企业支付，不能组合支付*/

		if (record.getAb_tradeway()==0 || isteampay==true){ /*余额支付，或组合支付*/
		Acc_Wallet aw=WalletMapper.selectByPrimaryKey(record.getAb_accountid());
		if (aw==null){aw=new Acc_Wallet();};
		if (aw.getWl_account()==null){aw.setWl_account(new BigDecimal(0));};
		if (aw.getWl_account().compareTo(record.getAb_payamtorder())==1){/*大于*/
			record.setAb_paybalance(record.getAb_payamtorder());
			}else{ /*小于或等于*/
			record.setAb_paybalance(aw.getWl_account());
			};
			/*确认支付后会有仓库处理余额及数量*/
		};
/*查余额 end*/

/*处理赠送 begin*/
/*
		Map<String,Long> ac=aa_CommMapper.getAccCalcLargess("0",record.getAb_coinqty().intValue());*/
/*默认0为购买赠送类别*//*

		System.out.print(ac.toString());
		record.setAb_addcoinqty(new BigDecimal(ac.get("addcoinqty")));*/
/*赠送拜贴*//*

		record.setAb_addintegral(new BigDecimal(ac.get("addintegral")));*/
/*赠送积分*//*



/*处理赠送 end*/

		record.setAb_payamtactual(record.getAb_payamtorder().subtract(record.getAb_paybalance()));/*实际支付*/
		if (record.getAb_addcoinqty()==null){record.setAb_addcoinqty(new BigDecimal(0));};
		if (record.getAb_addintegral()==null){record.setAb_addintegral(new BigDecimal(0));};
		if (record.getAb_paybalance()==null){record.setAb_paybalance(new BigDecimal(0));};
		record.setAb_sumcoinqty(record.getAb_coinqty().add(record.getAb_addcoinqty()));/*总数量*/

/*处理支付 begin*/
		if ( isteampay==true&&record.getAb_payamtactual().compareTo(new BigDecimal(0))==1){
			icode=-1;/*余额不够*/
			System.out.print("amount not pay");
			throw new Exception("余额不足");/**/
		};
/*余额够买*/
		if (record.getAb_payamtactual().compareTo(new BigDecimal(0))==0){
			saveBuyPay(record,true);/*确认付款*/
			record.setAb_status((byte) 1);/*已付款*/
			record.setAb_tradeway((byte)0);/*标记余额支付*/
			icode=0;/*余额成功*/
		}else{
			icode=1; /*第三方支付*/
		};
		record.setAb_tradename(Constants.Pay_Trade.getTitle(record.getAb_tradeway()));/*支付通道*/
		acc_BuyMapper.insertSelective(record);

/*增加redis缓存付款结果，有效期一个小时,用于检查状态*/
		redisService.saveStringValue(Constants.REDIS_PAY_BUY+record.getAb_no(),record.getAb_status()+"",3600);

		return icode;
	}

	/*确认购买付款 不更新状态，只更新仓库*/
	@Override
	public void saveBuyPay(Acc_Buy record,boolean addflag) throws Exception {

		if (record.getAb_status()==1&&addflag==true){return;};/*购买，防止第三方多次异步调用更新*/
		if (record.getAb_status()==2&&addflag==false){return;};/*退货，防止第三方多次异步调用*/

		if (record.getAb_addintegral()==null){record.setAb_addintegral(new BigDecimal(0));};
		if (record.getAb_paybalance()==null){record.setAb_paybalance(new BigDecimal(0));};

/*处理钱包总额*/
		if (record.getAb_tradeway()==4){/*企业支付，不能组合支付*/
			record.setAb_paybalance(record.getAb_payamtorder());
			Map<String,Object> aca=getAccCompanyAccount(record.getAb_createid());/*获取个人相关企业的余额帐户 leoli*/
			if (aca!=null){
				record.setAb_accountid((Long) aca.get("wl_userid"));
			};
		};

		Acc_Wallet aw=WalletMapper.selectByPrimaryKey(record.getAb_accountid());
		if (aw==null){aw=new Acc_Wallet();};
		if (addflag==true) {/*购买*/
			aw.setWl_account(CommonUtil.read_decimal(aw.getWl_account()).subtract(record.getAb_paybalance()));/*去余额*/
			aw.setWl_integral(CommonUtil.read_decimal(aw.getWl_integral()).add(record.getAb_addintegral())); /*赠送积分*/
			aw.setWl_deposit(CommonUtil.read_decimal(aw.getWl_deposit()).add(record.getAb_sumcoinqty())); /*总数量*/
			aw.setWl_countbuy(CommonUtil.read_int(aw.getWl_countbuy())+1);
		}else{/*退款*/
			aw.setWl_account(CommonUtil.read_decimal(aw.getWl_account()).add(record.getAb_paybalance()));/*去余额*/
			aw.setWl_integral(CommonUtil.read_decimal(aw.getWl_integral()).subtract(record.getAb_addintegral())); /*赠送积分*/
			aw.setWl_deposit(CommonUtil.read_decimal(aw.getWl_deposit()).subtract(record.getAb_sumcoinqty())); /*总数量*/
			aw.setWl_countbuy(CommonUtil.read_int(aw.getWl_countbuy())-1);
		};
		if (aw.getWl_account().compareTo(new BigDecimal(0))==-1){
			System.out.print("amount not pay");
			throw new Exception("余额不足付款，请重新购买");/*防止延迟支付，导致余额已被使用*/
			};
		if (aw.getWl_userid()==null||aw.getWl_userid()==0){ /*新增*/
				aw.setWl_userid(record.getAb_accountid());
				aw.setWl_createdate(new Date());
				WalletMapper.insertSelective(aw);
			}else{ /*修改*/
				aw.setWl_updatedate(new Date());
				WalletMapper.updateByPrimaryKeySelective(aw);
		};
/*处理拜贴仓库*/
		Acc_DepositKey adk=new Acc_DepositKey();
		adk.setAc_userid(record.getAb_accountid());
		adk.setAc_typecode(record.getAb_coincode());
		Acc_Deposit ad1=depositMapper.selectByPrimaryKey(adk);

		if (ad1==null){
			ad1=new Acc_Deposit();
			ad1.setAc_userid(record.getAb_accountid());
			ad1.setAc_typecode(record.getAb_coincode());
			ad1.setAc_deposit(record.getAb_sumcoinqty());
			depositMapper.insertSelective(ad1);
		}else{
			if (addflag==true) {/*购买*/
				ad1.setAc_deposit(CommonUtil.read_decimal(ad1.getAc_deposit()).add(record.getAb_sumcoinqty()));
			}else{/*退款*/
				ad1.setAc_deposit(CommonUtil.read_decimal(ad1.getAc_deposit()).subtract(record.getAb_sumcoinqty()));
			};
			depositMapper.updateByPrimaryKeySelective(ad1);
		};


/*增加明细 begin*/
		/*余额*/
		if (new BigDecimal(0).compareTo(record.getAb_paybalance())==-1){
			Acc_MemoAmt am1=new Acc_MemoAmt();
			am1.setOrderno(record.getAb_no());
			am1.setOrderdate(new Date());
			am1.setCurrency("￥");
			am1.setAccountid(record.getAb_accountid());
			am1.setCreateid(record.getAb_createid());
			am1.setOrderaccount(record.getAb_paybalance());
			am1.setTradeway((byte) 0);
			am1.setTradename(Constants.Pay_Trade.getTitle(record.getAb_tradeway()));
			am1.setTradeorderno("");
			if (addflag==true) {/*购买*/
				am1.setOrdertype("gm");
				am1.setOrdertitle("购买");
				am1.setOrdersign("-");
				am1.setTradeorderno(record.getAb_tradeorderno());
			}else{/*退款*/
				am1.setOrdertype("gm");
				am1.setOrdertitle("退款");
				am1.setOrdersign("+");
				am1.setTradeorderno(record.getAb_traderefundno());
			};
			accmemomapper.insertSelective(am1);
		};
/*增加金额支付明细 begin*/
		if (new BigDecimal(0).compareTo(record.getAb_payamtactual())==-1){
			Acc_MemoAmt am1=new Acc_MemoAmt();
			am1.setOrderno(record.getAb_no());
			am1.setOrderdate(new Date());
			am1.setCurrency("￥");
			am1.setAccountid(record.getAb_accountid());
			am1.setCreateid(record.getAb_createid());
			am1.setOrderaccount(record.getAb_payamtactual());
			am1.setTradeway(record.getAb_tradeway());
			am1.setTradename(Constants.Pay_Trade.getTitle(record.getAb_tradeway()));
			am1.setTradeorderno("");
			am1.setOrdertype("gm");
			if (addflag==true) {/*购买*/
				am1.setOrdertitle("购买");
				am1.setOrdersign("-");
				am1.setTradeorderno(record.getAb_tradeorderno());
			}else{/*退款*/
				am1.setOrdertitle("退款");
				am1.setOrdersign("+");
				am1.setTradeorderno(record.getAb_traderefundno());
			};
			accmemomapper.insertSelective(am1);
		};
/*增加金额支付明细 end*/

/*增加拜贴支出信息 个人帐户 begin*/
		Acc_MemoCoin amc=new Acc_MemoCoin();
		amc.setOrderno(record.getAb_no());
		amc.setOrderdate(new Date());
		amc.setOrdercoincode(record.getAb_coincode());
		amc.setOrdercoinname(record.getAb_coinname());
		amc.setOrdercoinqty(record.getAb_sumcoinqty());
		amc.setOrdercoinprice(record.getAb_coinprice() );
		amc.setOrderaccount(amc.getOrdercoinprice().multiply(amc.getOrdercoinqty()));
		amc.setCurrency("￥");
		amc.setAccountid(record.getAb_accountid());
		amc.setCreateid(record.getAb_createid());
	if (addflag==true) {/*购买*/
		amc.setOrdertype("收入");
		amc.setOrdersign("+");
		amc.setOrdertitle("购买"+record.getAb_coinname()+"拜贴");
	}else{/*退款*/
		amc.setOrdertype("支出");
		amc.setOrdersign("-");
		amc.setOrdertitle("退款"+record.getAb_coinname()+"拜贴");
	};
		memocoinMapper.insertSelective(amc);
/*增加拜贴支出信息 end*/

/*处理积分 begin*/
		if (new BigDecimal(0).compareTo(record.getAb_addintegral())==-1){
			Acc_MemoIntegral ami=new Acc_MemoIntegral();
			ami.setMi_type("4.购买");
			ami.setMi_sourceno(record.getAb_no());
			ami.setMi_integral(record.getAb_addintegral());
			ami.setMi_accountid(record.getAb_accountid());
			ami.setMi_createid(record.getAb_createid());
			ami.setMi_date(new Date());
			ami.setMi_activityid(record.getAb_activityid());
			ami.setMi_activityname(record.getAb_activityname());
			if (addflag==true) {/*购买*/
				ami.setMi_typesign("+");
			}else{/*退款*/
				ami.setMi_typesign("-");
			};
			memointegralmapper.insertSelective(ami);
		};
/*处理积分 end*/


	}


	@Override
	public int saveBuy(Acc_Buy record,int statusflag) throws Exception {
		/*验证实际支付和收到金额是否相同*/
		if (statusflag==1&&record.getAb_tradeamount().compareTo(record.getAb_payamtactual()) == 0){saveBuyPay(record,true);};/*确认付款*/
		if (statusflag==1&&record.getAb_tradeamount().compareTo(record.getAb_payamtactual()) != 0){statusflag=4;};/*支付异常*/

		if (statusflag==2){saveBuyPay(record,false);};/*确认退款*/
		record.setAb_status((byte) statusflag);
		int iadd=acc_BuyMapper.updateByPrimaryKeySelective(record);

/*增加redis缓存付款结果，有效期一个小时*/
		redisService.saveStringValue(Constants.REDIS_PAY_BUY+record.getAb_no(),record.getAb_status()+"",3600);

		return iadd;
	}

	@Override
	public int delBuy(Long userid) {
		return 0;
	}

	@Override
	public Acc_Buy getBuyDetail(String buyno) {
		Acc_BuyExample ll=new Acc_BuyExample();
		Acc_BuyExample.Criteria criteria = ll.createCriteria();
		criteria.andAb_noEqualTo(buyno);
		return acc_BuyMapper.selectByExample(ll).get(0);
		/*acc_BuyMapper.selectByNo(buyno);*/
	}

	@Override
	public List<Acc_Buy> getBuyList(Long userid) {
		return null;
	}

	@Override
	public int getBuyCount() {
		return 0;
	}

	@Override
	public int addWithdraw(Acc_Withdraw record) {
		return 0;
	}

	@Override
	public int updateWithdraw(Acc_Withdraw record) {
		return 0;
	}

	@Override
	public int delWithdraw(Long userid) {
		return 0;
	}

	@Override
	public List<Acc_Withdraw> getWithdrawList(Long userid) {
		return null;
	}

	@Override
	public int getWithdrawCount() {
		return 0;
	}

	@Override
	public List<Acc_MemoAmt> getAcc_Wallet_Memo_Amt_list(Map<String, Object> map) {
		return aa_CommMapper.getAcc_Wallet_Memo_Amt_list(map);
	}

	@Override
	public int getAcc_Wallet_Memo_Amt_count(Map<String, Object> map) {
		return aa_CommMapper.getAcc_Wallet_Memo_Amt_count(map);
	}

	@Override
	public List<Acc_MemoCoin> getAcc_Wallet_Memo_Coin_list(Map<String, Object> map) {
		return aa_CommMapper.getAcc_Wallet_Memo_Coin_list(map);
	}

	@Override
	public int getAcc_Wallet_Memo_Coin_count(Map<String, Object> map) {
		return aa_CommMapper.getAcc_Wallet_Memo_Coin_count(map);
	}

	@Override
	public int addRecharge(Acc_Recharge record,int type) throws Exception {
		if (type==1) {/*个人*/
/*定位价格及金额 begin*/
			Sys_WordListExample ll = new Sys_WordListExample();
			Sys_WordListExample.Criteria criteria = ll.createCriteria();
			criteria.andSw_typeEqualTo(Constants.WORD_ORDERPRICE);/*拜贴类型*/
			criteria.andSw_codeEqualTo(record.getAr_typecode());
			Sys_WordList sw = sys_WordMapper.selectByExample(ll).get(0);
/*检查定价问题 重要 begin*/
			if ((Double.parseDouble(sw.getSw_value()) < 10) && (!"1".equals(commService.getSysConfigValue("debug_open")))) {
				throw new Exception("系统异常,超低价");/*超低价*/
			};
/*检查定价问题 重要 end*/
			record.setAr_typename(sw.getSw_name());
			record.setAr_priceorder(new BigDecimal(sw.getSw_include()));/*账面单价*/
			record.setAr_priceactual(new BigDecimal(sw.getSw_value()));/*支付单价*/
/*定位价格及金额 end*/
			if (CommonUtil.read_long(record.getAr_activityid())==0){record.setAr_activityname("个人充值");};
		};

		if (type==2) {/*公司*/
			record.setAr_priceorder(new BigDecimal(record.getAr_typecode()));
			record.setAr_priceactual(new BigDecimal(record.getAr_typecode()));
			if (CommonUtil.read_long(record.getAr_activityid())==0){record.setAr_activityname("企业充值");};
		};

/*处理赠送 begin*/
		int bisdefault=0;
		if (record.getAr_activityid()==null||record.getAr_activityid()==0){bisdefault=1;};
		Map<String,Object> ac=aa_CommMapper.getFn_Award_Recharge(type+"",record.getAr_activityid(),record.getAr_priceorder().intValue(),bisdefault);/*购买赠送类别*/
		if (ac!=null&&((Long)ac.get("baid"))!=0) {
			record.setAr_addintegral(new BigDecimal(ac.get("addintegral").toString()));/*赠送积分*/
			record.setAr_addamount(new BigDecimal(ac.get("addamount").toString())); /*赠送金额*/
			record.setAr_priceactual(record.getAr_priceactual().multiply(new BigDecimal(String.valueOf(ac.get("discount")))));/*支付单价*/
			record.setAr_activityid((Long) ac.get("baid"));
			record.setAr_activityname(ac.get("baname").toString());
		};
		if (record.getAr_addamount()==null){record.setAr_addamount(new BigDecimal(0));};
		if (record.getAr_addintegral()==null){record.setAr_addintegral(new BigDecimal(0));};
		record.setAr_sumamount(record.getAr_priceorder().add(record.getAr_addamount()));/*总金额*/

/*处理赠送 end*/

		record.setAr_tradename(Constants.Pay_Trade.getTitle(record.getAr_tradeway()));/*支付通道*/
/*缓存*/
		redisService.saveStringValue(Constants.REDIS_PAY_RECHARGE+record.getAr_no(),record.getAr_status()+"",3600);

		return rechargemapper.insertSelective(record);
	}

	@Override
	public Acc_Recharge getRechargeDetail(String orderno) {
		Acc_RechargeExample ll=new Acc_RechargeExample();
		Acc_RechargeExample.Criteria criteria = ll.createCriteria();
		criteria.andAr_noEqualTo(orderno);
		return rechargemapper.selectByExample(ll).get(0);
	}

	@Override
	public int saveRecharge(Acc_Recharge record, int statusflag) throws Exception {
		/*验证实际支付和收到金额是否相同*/
		if (statusflag==1&&record.getAr_tradeamount().compareTo(record.getAr_priceactual()) == 0){saveRechargePay(record,true);};/*确认付款*/
		if (statusflag==1&&record.getAr_tradeamount().compareTo(record.getAr_priceactual()) != 0){statusflag=4;};/*支付异常*/

		if (statusflag==2){saveRechargePay(record,false);};/*确认退款*/
		record.setAr_status((byte) statusflag);
		int iadd=rechargemapper.updateByPrimaryKeySelective(record);
/*缓存*/
		redisService.saveStringValue(Constants.REDIS_PAY_RECHARGE+record.getAr_no(),record.getAr_status()+"",3600);
		return iadd;
	}

	@Override
	public void saveRechargePay(Acc_Recharge record, boolean addflag) throws Exception {
		if (record.getAr_status()==1&&addflag==true){return;};/*购买，防止第三方多次异步调用更新*/
		if (record.getAr_status()==2&&addflag==false){return;};/*退货，防止第三方多次异步调用*/

/*处理钱包总额*/
		Acc_Wallet aw=WalletMapper.selectByPrimaryKey(record.getAr_createid());
		if (aw==null){aw=new Acc_Wallet();};
		if (addflag==true) {/*充值*/
				aw.setWl_account(CommonUtil.read_decimal(aw.getWl_account()).add(record.getAr_sumamount()));/*去余额*/
				aw.setWl_integral(CommonUtil.read_decimal(aw.getWl_integral()).add(record.getAr_addintegral())); /*赠送积分*/
				aw.setWl_countrecharge(CommonUtil.read_int(aw.getWl_countrecharge())+1);
			}else{/*退款*/
				aw.setWl_account(CommonUtil.read_decimal(aw.getWl_account()).subtract(record.getAr_sumamount()));/*去余额*/
				aw.setWl_integral(CommonUtil.read_decimal(aw.getWl_integral()).subtract(record.getAr_addintegral())); /*赠送积分*/
				aw.setWl_countrecharge(CommonUtil.read_int(aw.getWl_countrecharge())-1);
			};
		if (aw.getWl_userid()==null||aw.getWl_userid()==0){ /*新增*/
			aw.setWl_userid(record.getAr_createid());
			aw.setWl_createdate(new Date());
			WalletMapper.insertSelective(aw);
		}else{ /*修改*/
			aw.setWl_updatedate(new Date());
			WalletMapper.updateByPrimaryKeySelective(aw);
		};

/*增加明细 begin*/
			Acc_MemoAmt am1=new Acc_MemoAmt();
			am1.setOrderno(record.getAr_no());
			am1.setOrderdate(new Date());
			am1.setCurrency("￥");
			am1.setAccountid(record.getAr_createid());
			am1.setCreateid(record.getAr_createid());
			am1.setOrderaccount(record.getAr_priceactual());
			am1.setTradeway(record.getAr_tradeway());
			am1.setTradename(Constants.Pay_Trade.getTitle(record.getAr_tradeway()));
			am1.setTradeorderno("");
			if (addflag==true) {/*购买*/
				am1.setOrdertype("cz");
				am1.setOrdertitle("充值");
				am1.setOrdersign("+");
				am1.setTradeorderno(record.getAr_tradeorderno());
			}else{/*退款*/
				am1.setOrdertype("cz");
				am1.setOrdertitle("充值退款");
				am1.setOrdersign("-");
				am1.setTradeorderno(record.getAr_traderefundno());
			};
			accmemomapper.insertSelective(am1);
/*增加明细 end*/

/*处理积分 begin*/
		if (new BigDecimal(0).compareTo(record.getAr_addintegral())==-1){
			Acc_MemoIntegral ami=new Acc_MemoIntegral();
			ami.setMi_type("2.充值");
			ami.setMi_sourceno(record.getAr_no());
			ami.setMi_integral(record.getAr_addintegral());
			ami.setMi_accountid(record.getAr_createid());
			ami.setMi_createid(record.getAr_createid());
			ami.setMi_date(new Date());
			ami.setMi_activityid(record.getAr_activityid());
			ami.setMi_activityname(record.getAr_activityname());
			if (addflag==true) {/*购买*/
				ami.setMi_typesign("+");
			}else{/*退款*/
				ami.setMi_typesign("-");
			};
			memointegralmapper.insertSelective(ami);
		};
/*处理积分 end*/

/*赠送统计 begin*/
		if (record.getAr_activityid()!=null&&record.getAr_activityid()!=0){
			Award_Recharge_Count arc=new Award_Recharge_Count();
			arc.setSc_activityid(record.getAr_activityid());
			arc.setSc_userid(record.getAr_createid());
			arc.setSc_createdate(new Date());
			if (addflag==true) {
				arc.setSc_amount(record.getAr_priceorder().intValue());
				arc.setSc_addamount(record.getAr_addamount().intValue());
				arc.setSc_addintegral(record.getAr_addintegral().intValue());
			}else{/*退款*/
				arc.setSc_amount(0-record.getAr_priceorder().intValue());
				arc.setSc_addamount(0-record.getAr_addamount().intValue());
				arc.setSc_addintegral(0-record.getAr_addintegral().intValue());
			};
			recharge_countmapper.insertSelective(arc);
		};
/*处理积分 end*/



	}

	@Override
	public Map<String, Object> getAccCompanyAccount(Long userid) {
		return aa_CommMapper.getAccCompanyAccount(userid);
	}

	@Override
	public int addintegral(Long userid,BigDecimal integral,Long baid,String baname,String taskname) {
		int iadd=0;
		/*增加魔币*/
		Acc_Wallet aw=WalletMapper.selectByPrimaryKey(userid);
		if (aw==null){aw=new Acc_Wallet();};
		aw.setWl_integral(CommonUtil.read_decimal(aw.getWl_integral()).add(integral)); /*赠送积分*/
		if (aw.getWl_userid()==null||aw.getWl_userid()==0){ /*新增*/
			aw.setWl_userid(userid);
			aw.setWl_createdate(new Date());
			iadd+=WalletMapper.insertSelective(aw);
		}else{ /*修改*/
			aw.setWl_updatedate(new Date());
			iadd+=WalletMapper.updateByPrimaryKeySelective(aw);
		};
		/*增加被积分明细*/
		Acc_MemoIntegral ami=new Acc_MemoIntegral();
		ami.setMi_type(taskname); //"1.注册"
		ami.setMi_sourceno(baname);
		ami.setMi_integral(integral);
		ami.setMi_accountid(userid);
		ami.setMi_createid(userid);
		ami.setMi_date(new Date());
		ami.setMi_activityid(baid);
		ami.setMi_activityname(baname);
		ami.setMi_typesign("+");
		iadd+=memointegralmapper.insertSelective(ami);
		return iadd;
	}

	@Override
	public Acc_Wallet getIntegral(Long userid) {
		return WalletMapper.getIntegral(userid);
	}

	@Override
	public int getCount_userid(long ur_id) {
		return acc_walletMapper.getCount_userid(ur_id);
	}

	@Override
	public int savenideshop_order_status(String orderno) {
		int iadd=aa_CommMapper.savenideshop_order_status(orderno); /*改状态*/
		iadd+=aa_CommMapper.savenideshop_order_kcqty(orderno);/*去库存*/
		return iadd;

	}

}

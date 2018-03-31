package com.morsearch.service;

import com.morsearch.model.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;


/*钱包service
*
* */

public interface WalletService {
	Acc_Wallet getWalletDetail(Long userid);/*读取明细*/
	List<AccV_Deposit> getDepositList(Long userid); /*获取列表*/

/*Acc_Buy 接口*/
	int addBuy(Acc_Buy record, Boolean isteampay)  throws Exception;/*新增,isteampay 是否组合支付*/
	void saveBuyPay(Acc_Buy record, boolean addflag)  throws Exception;/*确认付款或退款*/
	int saveBuy(Acc_Buy record, int statusflag) throws Exception;/*修改,statusflag订单状态*/
	int delBuy(Long userid);/*删除ID*/
	Acc_Buy getBuyDetail(String buyno);/*根据订单号获取明细*/
	List<Acc_Buy> getBuyList(Long userid); /*获取列表*/
	int getBuyCount();/*查询数量*/

/*Acc_Withdraw 接口*/
	int addWithdraw(Acc_Withdraw record);/*新增*/
	int updateWithdraw(Acc_Withdraw record);/*修改*/
	int delWithdraw(Long userid);/*删除ID*/
	List<Acc_Withdraw> getWithdrawList(Long userid); /*获取列表*/
	int getWithdrawCount();/*查询数量*/

	List<Acc_MemoAmt> getAcc_Wallet_Memo_Amt_list(Map<String, Object> map);/*获取钱包明细*/
	int getAcc_Wallet_Memo_Amt_count(Map<String, Object> map);/*获取钱包明细*/

	List<Acc_MemoCoin> getAcc_Wallet_Memo_Coin_list(Map<String, Object> map);/*获取魔币明细*/
	int getAcc_Wallet_Memo_Coin_count(Map<String, Object> map);/*获取魔币明细*/

	/*充值 接口*/
	int addRecharge(Acc_Recharge record, int type)  throws Exception;/*充值新增*/
	Acc_Recharge getRechargeDetail(String orderno);/*根据充值单号获取明细*/
	int saveRecharge(Acc_Recharge record, int statusflag) throws Exception;/*修改,statusflag订单状态*/
	void saveRechargePay(Acc_Recharge record, boolean addflag)  throws Exception;/*确认付款或退款*/

	Map<String,Object> getAccCompanyAccount(Long userid);/*获取个人相关企业的余额帐户 leoli*/

	int addintegral(Long userid, BigDecimal integral, Long baid, String baname, String taskname);/*增加魔币积分*/


	Acc_Wallet getIntegral(Long userid);

	int getCount_userid(long ur_id);//查询出删除用户到底有没有钱包

	int savenideshop_order_status(String orderno);/*更新商城订单状态*/

}

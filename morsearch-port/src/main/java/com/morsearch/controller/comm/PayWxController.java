package com.morsearch.controller.comm;

import com.morsearch.base.BaseController;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.*;
import com.morsearch.interceptor.IgnoreAuth;
import com.morsearch.model.Acc_Buy;
import com.morsearch.model.Acc_Recharge;
import com.morsearch.service.OrderService;
import com.morsearch.service.WalletService;
import com.morsearch.vo.AppResult;
import com.morsearch.vo.Pay_Detail;
import com.morsearch.vo.Pay_Sign;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.jdom.JDOMException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.security.Security;
import java.text.SimpleDateFormat;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
/**/



/*微信支付接口
 Leoli 2017.11.16
 */


@Controller("PayWxController")
@RequestMapping("/front/")

public class PayWxController extends BaseController {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
    /*微信参数配置*/
    public static String APP_ID = "wx7c2b9749e1ad6680";
    public static String MCH_ID = "1490809092";
    public static String NOTIFYURL = "http://port.morsearch.com/front/paywxnotify.shtml";
    //http://test.morsearch.com/front/paywxnotify.shtml
//    public static String paywxrefund = "http://port.morsearch.com/morsearch/front/paywxrefund.shtml";
    public static String API_KEY = "x9zso91nu4p5xuy1zysoeac8pne1z09a";

    @Resource
    private OrderService orderService;
    @Resource
    private WalletService walletService;


    /*
    微信二次签名
    leoli
    2017.11.06
    */
    public static String paywxtosign(Pay_Detail pd,String trade_type) throws Exception {
        Map<String, String> map = weixinPrePay(pd.getTrade_no(), pd.getAmount(), pd.getPmname(),trade_type);
        SortedMap<String, Object> parameterMap = new TreeMap<String, Object>();
        parameterMap.put("appid", APP_ID);
        parameterMap.put("partnerid", MCH_ID);
        parameterMap.put("prepayid", map.get("prepay_id"));
        parameterMap.put("package", "Sign=WXPay");
        parameterMap.put("noncestr", map.get("nonce_str"));  //PayWxUtil.getRandomString(32)
        parameterMap.put("timestamp", System.currentTimeMillis() / 1000);
//		parameterMap.put("body",pd.getPmname());/*+"|"+pd.getPmno()+"|"+pd.getTrade_id()*/
        parameterMap.put("code_url", map.get("code_url"));
        String sign = PayWxUtil.createSign("UTF-8", parameterMap);
        //	parameterMap.put("sign1", map.get("sign"));
        parameterMap.put("sign", sign);
        JSONObject jsonObject = JSONObject.fromObject(parameterMap);
        return jsonObject.toString();

    }


/*
微信一次签名
leoli
2017.11.06
*/

    public static Map<String, String> weixinPrePay(String sn, String totalAmount, String description,String trade_type) {
        if ("".equals(trade_type)){trade_type="APP";};
        SortedMap<String, Object> parameterMap = new TreeMap<String, Object>();
        parameterMap.put("appid", APP_ID);
        parameterMap.put("mch_id", MCH_ID);
        parameterMap.put("body", StringUtils.abbreviate(description.replaceAll("[^0-9a-zA-Z\\u4e00-\\u9fa5 ]", ""), 600));
        parameterMap.put("nonce_str", PayWxUtil.getRandomString(32));//
        parameterMap.put("out_trade_no", sn);
        parameterMap.put("fee_type", "CNY");
        BigDecimal total = new BigDecimal(Double.parseDouble(totalAmount) * 100);// totalAmount.multiply(new BigDecimal(100));
        java.text.DecimalFormat df = new java.text.DecimalFormat("0");
        parameterMap.put("total_fee", df.format(total));
        parameterMap.put("spbill_create_ip", "127.0.0.1");
        parameterMap.put("notify_url", NOTIFYURL);
        parameterMap.put("trade_type",trade_type); /*NATIVE  APP*/
        String sign = PayWxUtil.createSign("UTF-8", parameterMap);
        parameterMap.put("sign", sign);
        String requestXML = PayWxUtil.getRequestXml(parameterMap);
        String result = PayWxUtil.httpsRequest("https://api.mch.weixin.qq.com/pay/unifiedorder", "POST", requestXML);
        Map<String, String> map = null;
        try {
            map = PayWxUtil.doXMLParse(result);
        } catch (JDOMException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return map;
    }


/*微信支付异步调用
leoli
2017.11.06
* */
    @IgnoreAuth /*不验证*/
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "paywxnotify", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public void paywxnotify(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("paywxnotify");

        InputStream inStream;
        inStream = request.getInputStream();
        ByteArrayOutputStream outSteam = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int len = 0;
        while ((len = inStream.read(buffer)) != -1) {
            outSteam.write(buffer, 0, len);
        }
        outSteam.close();
        inStream.close();
        String result = new String(outSteam.toByteArray(), "utf-8");// 获取微信调用我们notify_url的返回信息
        if (CommonUtil.isEmpty(result) == true) {
            return;
        }
        ;
        Map<Object, Object> map = Xmlutil.xml2map(result, false);

        if (map.get("return_code").equals("SUCCESS")) {
            try {
            int iflag = 0;
/*交易支付成功 begin*/
            if ("B".equals(map.get("out_trade_no").toString().toUpperCase().substring(0, 1))) {/*购买*/
                Acc_Buy ab = walletService.getBuyDetail(map.get("out_trade_no").toString());
                if (ab != null) {
                //    ab.setAb_tradeway((byte) 2);/*微信*/
                    ab.setAb_no(map.get("out_trade_no").toString());// 商户订单号
              //      ab.setAb_tradename(map.get("openid").toString());/*买家*/
                    ab.setAb_tradecard(map.get("openid").toString());/*买家*/
                    ab.setAb_tradeorderno(map.get("transaction_id").toString());// 交易号
                    ab.setAb_tradeamount((new BigDecimal(map.get("total_fee").toString())).divide(new BigDecimal(100)));// 支付金额
                    ab.setAb_tradeorderdate(sdf.parse(map.get("time_end").toString())); /*交易日期*/
                    if (ab.getAb_status() == 0 && "SUCCESS".equals(weixinquery(ab.getAb_no()).toUpperCase())) {/*加入在线查询状态，防止钓鱼*/
                        iflag = walletService.saveBuy(ab, 1);/*付款 service实现事务更新*/
                    }
                    ;
                }
                ;
            }
            ;

            if ("C".equals(map.get("out_trade_no").toString().toUpperCase().substring(0, 1))) {/*充值*/
                Acc_Recharge ar = walletService.getRechargeDetail(map.get("out_trade_no").toString());
                if (ar != null) {
                    ar.setAr_no(map.get("out_trade_no").toString());// 商户订单号
                    ar.setAr_tradecard(map.get("openid").toString());/*买家*/
                    ar.setAr_tradeorderno(map.get("transaction_id").toString());// 交易号
                    ar.setAr_tradeamount((new BigDecimal(map.get("total_fee").toString())).divide(new BigDecimal(100)));// 支付金额
                    ar.setAr_tradeorderdate(sdf.parse(map.get("time_end").toString())); /*交易日期*/
                    if (ar.getAr_status() == 0 && "SUCCESS".equals(weixinquery(ar.getAr_no()).toUpperCase())) {/*加入在线查询状态，防止钓鱼*/
                        iflag = walletService.saveRecharge(ar, 1);/*付款 service实现事务更新*/
                    }
                    ;
                }
                ;
            }
            ;

            /*商城*/
            if ("M".equals(map.get("out_trade_no").toString().toUpperCase().substring(0, 1))) {
                if ("SUCCESS".equals(weixinquery(map.get("out_trade_no").toString().toUpperCase()).toUpperCase())) {/*加入在线查询状态，防止钓鱼*/
                    iflag =walletService.savenideshop_order_status(map.get("out_trade_no").toString());/*付款 service实现事务更新*/
                }
            }
            ;



            if (iflag > 0) {
                response.getWriter().write(Xmlutil.setXml("SUCCESS", "OK"));/*告诉微信已经收到通知了*/
            }
            ;

        }catch (Exception ex){
            ex.printStackTrace();
        };

        }
        if (map.get("return_code").equals("FAIL")) {
            response.getWriter().write(Xmlutil.setXml("SUCCESS", "FAIL"));/*告诉微信已经收到通知了*/
        }

        response.getWriter().flush();

    }

/*微信接口退款
leoli
2017.11.06
* */
    @IgnoreAuth /*不验证*/
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "paywxrefund", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public void paywxrefund(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.print("paywxrefund");

        InputStream inStream;
        inStream = request.getInputStream();
        ByteArrayOutputStream outSteam = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int len = 0;
        while ((len = inStream.read(buffer)) != -1) {
            outSteam.write(buffer, 0, len);
        }
        outSteam.close();
        inStream.close();
        String result = new String(outSteam.toByteArray(), "utf-8");// 获取微信调用我们notify_url的返回信息
        Map<Object, Object> map_all = Xmlutil.xml2map(result, false);
        //   String aa=map_all.get("req_info").toString();
        Security.addProvider(new BouncyCastleProvider());
        String aa = decryptData(map_all.get("req_info").toString());
        Map<Object, Object> map = Xmlutil.xml2map(aa, false);
        if (map.get("refund_status").equals("SUCCESS")) {
            int iflag = 0;
/*交易退款成功 begin*/
            if ("B".equals(map.get("out_trade_no").toString().toUpperCase().substring(0, 1))) {/*购买*/
                Acc_Buy ab = walletService.getBuyDetail(map.get("out_trade_no").toString());
                if (ab != null) {
                    ab.setAb_traderefundno(map.get("out_refund_no").toString());// 支付宝交易号
                    ab.setAb_traderefunddate(DateTimeUtil.getstrToDate(map.get("success_time").toString())); /*交易日期*/
                    ab.setAb_traderefundamount((new BigDecimal(map.get("total_fee").toString())).divide(new BigDecimal(100)));// 支付金额
                    if (ab.getAb_status() == 1 && "REFUND".equals(weixinquery(ab.getAb_no()).toUpperCase())) {/*加入在线查询状态，防止钓鱼*/
                        iflag = walletService.saveBuy(ab, 2);/*退款 service实现事务更新*/
                    }
                    ;
                    if (iflag > 0) {
                        response.getWriter().write(Xmlutil.setXml("SUCCESS", "OK"));/*告诉微信已经收到通知了*/
                    }
                    ;
                }
                ;
            }
            ;

            if ("C".equals(map.get("out_trade_no").toString().toUpperCase().substring(0, 1))) {/*充值*/
                Acc_Recharge ar = walletService.getRechargeDetail(map.get("out_trade_no").toString());
                if (ar != null) {
                    ar.setAr_traderefundno(map.get("out_refund_no").toString());// 支付宝交易号
                    ar.setAr_traderefunddate(DateTimeUtil.getstrToDate(map.get("success_time").toString())); /*交易日期*/
                    ar.setAr_traderefundamount((new BigDecimal(map.get("total_fee").toString())).divide(new BigDecimal(100)));// 支付金额
                    if (ar.getAr_status() == 1 && "REFUND".equals(weixinquery(ar.getAr_no()).toUpperCase())) {/*加入在线查询状态，防止钓鱼*/
                        iflag = walletService.saveRecharge(ar, 2);/*退款 service实现事务更新*/
                    }
                    ;
                    if (iflag > 0) {
                        response.getWriter().write(Xmlutil.setXml("SUCCESS", "OK"));/*告诉微信已经收到通知了*/
                    }
                    ;
                }
                ;
            }
            ;

        }
        ;
        if (map_all.get("return_code").equals("FAIL")) {
            response.getWriter().write(Xmlutil.setXml("SUCCESS", "FAIL"));/*告诉微信已经收到通知了*/
        }

        response.getWriter().flush();

    }


	/*查询订单状态
    leoli
    加入在线查询状态，防止钓鱼
    <xml>
       <appid>wx2421b1c4370ec43b</appid>
       <mch_id>10000100</mch_id>
       <nonce_str>ec2316275641faa3aacf3cc599e8730f</nonce_str>
       <transaction_id>1008450740201411110005820873</transaction_id>
       <sign>FDD167FAA73459FD921B144BAF4F4CA2</sign>
    </xml>
    * */

/*查微信订单*/

    public static String weixinquery(String orderno) throws Exception {
        SortedMap<String, Object> parameterMap = new TreeMap<String, Object>();
        parameterMap.put("appid", APP_ID);
        parameterMap.put("mch_id", MCH_ID);
        parameterMap.put("nonce_str", PayWxUtil.getRandomString(32));//
        parameterMap.put("out_trade_no", orderno);
        String sign = PayWxUtil.createSign("UTF-8", parameterMap);
        parameterMap.put("sign", sign);
        String requestXML = PayWxUtil.getRequestXml(parameterMap);
        String result = PayWxUtil.httpsRequest("https://api.mch.weixin.qq.com/pay/orderquery", "POST", requestXML);
        Map<String, String> map = PayWxUtil.doXMLParse(result);
        return map.get("trade_state");
    }


    @IgnoreAuth /*不验证*/
    @SuppressWarnings({"unused", "null"})
    @RequestMapping(value = "paywxrefundwx", method = {RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String paywxrefundwx(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult = new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        String sm_id = request.getParameter("sm_id");
        Boolean flag_pass = true;

        Security.addProvider(new BouncyCastleProvider());
        String str = decryptData("xYb1L+uwa/ivY2r4uyULNp5dm31hgelz5/Ek+XYTRwPRNwX21i3ORhtNgI2OVbDzN6cHCMVYMKopAgT3d4ObQxm8OaQMJjHapWOKvpMEoRMlbYot+RSPuYj5PABaI8zFwcIfAI7ewkyJ0mcoO56x2JEDyjl+dBFKJfvlsLTZKBjOkrtLbPUIGDZHZV1y4ER8DGSgcEKRtTPvqPvNlryPdlVSEhSdv5knrZSa9NrumYt0KU0/oIv+HRVT7ml/GDXZAFuT2Sp6jFui8EOzq0LX99Fy7gYUyf8XgFFCVr5ikaSF7Bv2qCbGdsB0VdyN2SXFv++cFVubpPVGGQpMeQFP1fRUf+bM9bdWt0ISCw5PY6sE5XeEaXWgAq1nlROYJjn/HfI8nZmVgZhb9qFUBqbHm9x0eKcmoPdY3ErYa2hKuxO6FXSjf+OrrZBrOyOIgy4OM7xzJGH3p4so26UBY5Q9/Lshu1W5SVJJT02Z+cMA8Qaihs2JlaajF2UAbG9gZGkoZtIqTctOzczmA39waKuP/E/sY3SXwouQNQa056UNCwy1wbdBn9shmDU8VxHsqWoBOPJ6NFQxB5VQS3mjFYLIJ9xsDkpGZVg+GE8hdw371LuYeVa4aXNRFbV6OMBYPH3mRlubw/dysLHHOXH7rzTHkFi0IfQ/7ZauhYoMCSCgRSX3vu6bUzuAGVw8eQk7D7mKMSr36XynqBVhauUjTYxjDckZTF6wFcDxtCbjYWYPdmKwn6p0fAvla2KJWorLz/7NeYrTVkbhaRaQIMV5RkI3AP3D2BBw9Pnbv9cZwzE/N2SoFics7yIZONiQ4zXPDl1nDbb+RCXXzwKnDfb2dhpjEBRLEQFjcwBeSLV7+N90V3sUf5X705u3kEfSBGKmrdw7R/On0LKuEVk1L3hvxBpeuv3l4ImfrSI+osfxP0QBSQAhCQc9sDBsld8n0kxZblZVUIkx9dbhrdG2ytBnYgS6P9+fIsNQXDKyou7CiNW3dItKdTkTTTbaeAGQrY0WHsNtcBpjPxGS2Q8WtyPViTPJmRxlIgrTw1YIo8GRjMVMOvgS2BtZfiYTdDi71vbBoBjzoTJ/ce3nQ7eJboLHtmh0dg==");
        rs = str;
        Map<Object, Object> req_info = PayWxUtil.doXMLParse(str);//  Xmlutil.xml2map(str, false);
        if (req_info.get("refund_status").equals("SUCCESS")) {
            int iflag = 0;
            //	String[] bv=map.get("body").split("\\|");/*区分版本--产品名称|产品编号 "购买|GM"*/
/*交易支付成功 begin*/
            if ("B".equals(req_info.get("out_trade_no").toString().substring(0, 1))) {/*购买*/
                Acc_Buy ab = walletService.getBuyDetail(req_info.get("out_trade_no").toString());
                if (ab != null) {
                    ab.setAb_tradeway((byte) 2);/*支付宝*/
                    ab.setAb_no(req_info.get("out_trade_no").toString());// 商户订单号
                    ab.setAb_tradeorderno(req_info.get("transaction_id").toString());// 交易号
                    ab.setAb_tradeamount((new BigDecimal(req_info.get("total_fee").toString())).divide(new BigDecimal(100)));// 支付金额
                    ab.setAb_tradeorderdate(DateTimeUtil.getstrToDate(req_info.get("success_time").toString())); /*交易日期*/
                    if (ab.getAb_status() == 1 && "SUCCESS".equals(weixinquery(ab.getAb_no()).toUpperCase())) {/*加入在线查询状态，防止钓鱼*/
                        iflag = walletService.saveBuy(ab, 2);/*退款 service实现事务更新*/
                    }
                    ;
                    if (iflag > 0) {
                        response.getWriter().write(Xmlutil.setXml("SUCCESS", "OK"));/*告诉微信已经收到通知了*/
                    }
                    ;
                }
                ;
            }
        }
        ;

/*检查参数 begin*/


/*检查参数 end*/
/*处理数据 begin*/

/*处理数据 end*/
/*返回数据 begin*/
        appresult.setData(rs);
        rs = CommonUtil.datatype_convert(request, gson.toJson(appresult));
/*处理数据格式*/
        out.print(rs);
        out.close();
/*返回数据 end*/
        return null;
    }





/*
* 微信解码 begin
* */

    private static final String ALGORITHM = "AES";/*密钥算法 */
    private static final String ALGORITHM_MODE_PADDING = "AES/ECB/PKCS7Padding";
    /**
     * 加解密算法/工作模式/填充方式
     */
    private static SecretKeySpec key = new SecretKeySpec(PayMD5Util.MD5Encode("x9zso91nu4p5xuy1zysoeac8pne1z09a", "UTF-8").toLowerCase().getBytes(), ALGORITHM);

    /**
     * AES加密
     *
     * @param data
     * @return
     * @throws Exception
     */
    public static String encryptData(String data) throws Exception {
        Cipher cipher = Cipher.getInstance(ALGORITHM_MODE_PADDING);// 创建密码器
        cipher.init(Cipher.ENCRYPT_MODE, key);// 初始化
        return PayBase64.encode(cipher.doFinal(data.getBytes()));
    }

/*
* 微信解码 end
* */

    /**
     * AES解密
     *
     * @param base64Data
     * @return
     * @throws Exception
     */
    public static String decryptData(String base64Data) throws Exception {
        Cipher cipher = Cipher.getInstance(ALGORITHM_MODE_PADDING);
        cipher.init(Cipher.DECRYPT_MODE, key);
        return new String(cipher.doFinal(PayBase64.decode(base64Data)));
    }

/*
* 微信解码 end
* */



/*
* 获取微信网站支付
* leoli 2017.12.25
* */
    @IgnoreAuth /*不验证*/
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getpaywxqrcode", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getpaywxqrcode(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult=new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass=true;

        String orderno=request.getParameter("orderno");
        String amount=request.getParameter("amount");
        String subject=request.getParameter("subject");
/*检查参数 begin*/
        if (flag_pass==true&&CommonUtil.isEmpty(orderno)==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("{orderno}不能为空");
            flag_pass=false;
        };
        if (flag_pass==true&&CommonUtil.isEmpty(amount)==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("{amount}不能为空");
            flag_pass=false;
        };
        if (flag_pass==true&&CommonUtil.isEmpty(subject)==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("{subject}不能为空");
            flag_pass=false;
        };

/*检查参数 end*/
/*处理数据 begin*/
//        Pay_Sign ps=new Pay_Sign();
        if (flag_pass==true) {

            try {
                Pay_Detail pd=new Pay_Detail();
                pd.setTrade_no(orderno);
                pd.setSubject(subject);
                pd.setPmname(subject);
                pd.setAmount(amount);
                rs=PayWxController.paywxtosign(pd,"NATIVE");
            } catch (Exception e) {
                logger.error(e.getMessage());
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(e.getMessage().toString());
            }
        };
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

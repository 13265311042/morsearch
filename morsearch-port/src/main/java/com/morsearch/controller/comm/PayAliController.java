package com.morsearch.controller.comm;

import com.alibaba.fastjson.JSONObject;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.AlipayTradePayModel;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.alipay.api.request.AlipayTradePayRequest;
import com.alipay.api.request.AlipayTradeQueryRequest;
import com.alipay.api.request.AlipayTradeWapPayRequest;
import com.alipay.api.response.AlipayTradePagePayResponse;
import com.alipay.api.response.AlipayTradePayResponse;
import com.alipay.api.response.AlipayTradeQueryResponse;
import com.alipay.api.response.AlipayTradeWapPayResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.morsearch.base.BaseController;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.*;
import com.morsearch.interceptor.IgnoreAuth;
import com.morsearch.model.Acc_Buy;
import com.morsearch.model.Acc_Recharge;
import com.morsearch.service.OrderService;
import com.morsearch.service.RedisService;
import com.morsearch.service.WalletService;
import com.morsearch.vo.AppResult;
import com.morsearch.vo.PayAliBizContent;
import com.morsearch.vo.Pay_Detail;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 支付宝接口
 * leoli
 * 2017.10.27
 */
@Controller("PayAliController")
@RequestMapping("/front/")

public class PayAliController extends BaseController {
    @Resource
    private OrderService orderService;
    @Resource
    private WalletService walletService;

    // 支付宝重要参数
    public static String APP_ID = "2017102309477557";
    public static final String PID = "2088821501120444"; /** 支付宝账户登录授权业务：入参pid值 */
    public static String NOTIFY_URL = "http://port.morsearch.com/front/payalinotify.shtml";/*异步通知*/
    public static String CHARSET = "UTF-8"; /*UTF-8  GBK*/

    public static String APP_PRIVATE_KEY = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQC19vrNw5HXxps6\n" +
            "3Q7RWJc6ylIluYsC3wZqC8sMI2sR3P2zNeM1PDM4WzoLESfaQRs6UyNKadfAaQiI\n" +
            "XTTrgzqeem/lN8R809Tgr1hAUqtmupAfLWsLClX+DOQoj+DM1IGVBcZEsHUm3XGw\n" +
            "PfGG1m6W/vWB4vku801CR761B/RDl8EmcVNkim4oJQrzeM/QmlCmz/YhG8nH673K\n" +
            "bwb1hDda7YhhrDUg223U9Mz7dwgGWRMx3LqDQirVsdT0uEIQGGL/NEld3gm9LoYQ\n" +
            "Z+oTFBk0xWpDl9jANjoP+wOecf3gZU8LUTZ0AWR+Wl2gDUI1/9plFXil0ci2L+gJ\n" +
            "sZRnG1tZAgMBAAECggEAUs0mZ4d80BFiBbEd0wlbF7eFFgGOTioqgwsGxGlBiYlk\n" +
            "MK5uy4SvUg/BI9QUrG4/85RtVKlBMh8ZcOPo9tpqTD8ut8Feueay0eM4Z1y2/jIa\n" +
            "7vT95rI3WzmGgSanhs2Ugbl09UDOrnbKCwbE5zSgcjlmgkpEVacFGwoGr94EutSI\n" +
            "z8qjxFqJGFoFqPm7WR/Reee7tGDIonskRcV7K9dPInpziY6r8FrC6xVM4q1NulY+\n" +
            "a805BBFWNXnYKzEuYpl4NS6E9hGrzYmOstV8QakbTcvZUfHSCtfeXuggKotHMp6l\n" +
            "CIHyrD8uqnItW/bmRynf7Vlcw2XydicY1sCD45CjmQKBgQDgQ0aZjHqTXyZLUSz4\n" +
            "1T4kQIKDx0+TZxIohqv3T0vjACIIs/9LyL9BaNPAmCl0KTWvpNzWHMZOh37p00hZ\n" +
            "tkdhF9PxenmuG7nnxaLf0jvihDofVTGE50uODmjdYbhdiogFQd9MYbFR453qfAWz\n" +
            "EA8l3uV5xHLrYF+1tmrapQ8wTwKBgQDPt05WWAQzsX+8VDx0OJt8X35PyiCR5JYE\n" +
            "twiaTuWRnSM/OkivmPviwOfKplgzkZAGXA4eLbRXuRtdxe83RscchtBz3i89VcPU\n" +
            "+HHq9l956fIfZMRXr/hyo7BohOgI+n6s6Hot7+QgU0YBd3dklj0Ci24Ted9fTNaB\n" +
            "jzMzEfZn1wKBgAR/9ROxqOf6GcebGl7n0HZjwPqp7iPUBp4/jYXJ1oj4gLZR/kZk\n" +
            "AcprMwyDQRmulgAvO6skKqp6t4YzkhkSuj3tf3gx7+0Za1KGOa1qB3+VDaGBURwM\n" +
            "lAyGp34BrvRZij8owjVDJI6zFYEV+ftM0DD/VvVphrDIX0NDJMO8WiCrAoGBAIyr\n" +
            "aEsDOn1DpO0G4xYWS/5zsVgZ2+rRsmMpDZNrAP+XOoqUTytUYKlU2OUduDfcSXx1\n" +
            "FT6M10hdXNIpvPJjZW7FQiBmBPn1vjTZuFRWW5x1ufpWxL1Zt9jzUAHImFeURPuW\n" +
            "SUAY6RaXLp7JqDqfoFu7z2UzMPoaUF7XeuYIMSZrAoGAdv62k4uDYJscbqzUT/I+\n" +
            "sZkMJyMIOlkMGd+oELg4AQx96SCr9QReHR+wD3rMBN4nF9sI0guSbO95i8ulFo99\n" +
            "WhNhmgSIHK8TkAj4DKypNtwJnQ7caiUex3+qm4K7svNjdWmo9cFEoJ+q4cZMWUfD\n" +
            "PAYZ/H2HclpiuaCxAY2Xs1U=\n";
    public static String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAx98++QiGcrtfEOP3jlvhdGuPeNo25CCLJbxvx1w5AC7Qtd12KLaD9/pPGM4Qg/F/DL3BVKGM8uS8ecz2jIbrM4sFa2WD2xuA2VbXRyYK50vRrDhnF3y/kkqw82L0naRZ15RxKtBcZ0VB7r2iTaM2aTbL1VUUjxumVqpex2ZalN4evbqQ5pM21MR7kZHfCzB52CYzL4vVzeg4HsgQyGmXaKHso6TpIkOTrYlgajisplum37pNNLmQo/xh6+dnvqTBHon+R03EuPCtV6riFAscNdbNIo3DoMEv7lJHHOh8Yq48Z00JmKndz/y3agwoAKJcAgyZVjiFmIZbQ8fufbdd6wIDAQAB";



    public static String buildOrderParam(Map<String, String> map,Boolean flagencode) {
        List<String> keys = new ArrayList<String>(map.keySet());
        if (flagencode==false){Collections.sort(keys);};// key排序
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < keys.size() - 1; i++) {
            String key = keys.get(i);
            String value = map.get(key);
            sb.append(buildKeyValue(key, value, flagencode));
            sb.append("&");
        }
        String tailKey = keys.get(keys.size() - 1);
        String tailValue = map.get(tailKey);
        sb.append(buildKeyValue(tailKey, tailValue, flagencode));
        return sb.toString();
    }

    private static String buildKeyValue(String key, String value, boolean isEncode) {
        StringBuilder sb = new StringBuilder();
        sb.append(key);
        sb.append("=");
        if (isEncode) {
            try {
                sb.append(URLEncoder.encode(value,CHARSET).replace("+", "%20"));//.replace("+", "%20"));
            } catch (UnsupportedEncodingException e) {
                sb.append(value);
            }
        } else {
            sb.append(value);
        }
        return sb.toString();
    }


    public static String alisign(String content, String privateKey) {
        try {
            PKCS8EncodedKeySpec priPKCS8 = new PKCS8EncodedKeySpec(PayBase64.decode(privateKey));
            KeyFactory keyf = KeyFactory.getInstance("RSA");
            PrivateKey priKey = keyf.generatePrivate(priPKCS8);
            java.security.Signature signature = java.security.Signature.getInstance("SHA256WithRSA");
            signature.initSign(priKey);
            signature.update(content.getBytes(CHARSET));
            byte[] signed = signature.sign();
            return PayBase64.encode(signed);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }





/*转换签名*/
    public static String payalitosign(Pay_Detail pd){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        PayAliBizContent info =new PayAliBizContent();
        info.body =pd.getPmname()+"|"+pd.getPmno()+"|"+pd.getTrade_id();//   "8888|9999";
        info.subject =pd.getSubject();
        info. out_trade_no =pd.getTrade_no();
        info. total_amount =pd.getAmount();
        info. timeout_express = "30m"; /*订单超时时间*/

        Gson gsoninfo =new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();/*独立，调用了static*/
        Map<String, String> keyValues = new HashMap<String, String>();
        keyValues.put("biz_content",gsoninfo.toJson(info));
        keyValues.put("method", "alipay.trade.app.pay");
        keyValues.put("charset",CHARSET);
        keyValues.put("product_code", "1.0");
        keyValues.put("notify_url",NOTIFY_URL);
        keyValues.put("version", "1.0");
        keyValues.put("app_id", APP_ID);
        keyValues.put("pid", PID);
        keyValues.put("timestamp",sdf.format(new Date()));
        keyValues.put("sign_type","RSA2");
        keyValues.put("product_id", "APP_FAST_LOGIN");
        String orderParam=buildOrderParam(keyValues,true);
        String signParam=buildOrderParam(keyValues,false);
        //   String oriSign =  AlipaySignature.rsaSign(signParam.toString(), APP_PRIVATE_KEY, charset);
        String oriSign =alisign(signParam, APP_PRIVATE_KEY);
        try {
            oriSign = URLEncoder.encode(oriSign,CHARSET);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        orderParam=orderParam+"&sign=" +oriSign;
        return orderParam;

    };


    /**
     * 支付宝支付成功后.会回调该接口
     *
     * @param request
     * @return
     * @throws UnsupportedEncodingException
     */
    @IgnoreAuth /*不验证*/
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "payalinotify", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public void payalinotify(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.print("payalinotify");

        Map<String, String> params = new HashMap<String, String>();
        Map<String, String[]> requestParams = request.getParameterMap();
        for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext();) {
            String name = iter.next();
            String[] values = requestParams.get(name);
            String valueStr = "";
            for (int i = 0; i < values.length; i++) {
                valueStr = (i == values.length - 1) ? valueStr + values[i] : valueStr + values[i] + ",";
            }
            // 乱码解决，这段代码在出现乱码时使用。如果mysign和sign不相等也可以使用这段代码转化
            // valueStr = new String(valueStr.getBytes("ISO-8859-1"), "gbk");
            params.put(name, valueStr);
        }
        boolean signVerified = false;
        if (params!=null){
        try {
            signVerified = AlipaySignature.rsaCheckV1(params, ALIPAY_PUBLIC_KEY,params.get("charset"),"RSA2"); /* "utf-8"*/
        } catch (AlipayApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            response.getWriter().write("rsaCheckV1 fail");

        }
        };
        // 调用SDK验证签名
        if (signVerified) {
            // TODO 验签成功后
            // 按照支付结果异步通知中的描述，对支付结果中的业务内容进行1\2\3\4二次校验，校验成功后在response中返回success，校验失败返回failure
            /*trade_no 支付宝交易号*/
            //"trade_status" -> "TRADE_SUCCESS"支付状态，"trade_status" -> "TRADE_CLOSED"--关闭状态
            int iflag =0;
        //    String[] bv=params.get("body").split("\\|");/*区分版本--产品名称|产品编号 "购买|GM"*/
/*交易支付成功 begin*/
            //if ("gm".equals(bv[1].toLowerCase())) {/*购买*/
            if ("B".equals(params.get("out_trade_no").toString().toUpperCase().substring(0, 1))) {/*购买*/
                    Acc_Buy ab = walletService.getBuyDetail(params.get("out_trade_no"));
                    if (ab != null) {
                    //    ab.setAb_tradeway((byte) 1);/*支付宝*/
                        ab.setAb_no(params.get("out_trade_no"));// 商户订单号
                    //    ab.setAb_tradename(params.get("buyer_id"));/*买家*/
                        ab.setAb_tradecard(params.get("buyer_logon_id"));/*买家*/
                        ab.setAb_tradeamount(new BigDecimal(params.get("total_amount")));// 支付金额
                        ab.setAb_tradeorderno(params.get("trade_no"));// 支付宝交易号
                        if (ab.getAb_status()==0&&"TRADE_SUCCESS".equals(params.get("trade_status").toUpperCase())==true
                                &&("TRADE_SUCCESS".equals(payaliquery(ab.getAb_no(),ab.getAb_tradeorderno()).toUpperCase()))) {/*购买成功,加状态，防止多次异步 */
                            ab.setAb_tradeorderdate(DateTimeUtil.getstrToDate(params.get("gmt_payment"))); /*交易日期*/
                            iflag=walletService.saveBuy(ab, 1);/*付款 service实现事务更新*/
                        };
                        if (ab.getAb_status()==1&&"TRADE_CLOSED".equals(params.get("trade_status").toUpperCase())==true
                                &&("TRADE_CLOSED".equals(payaliquery(ab.getAb_no(),ab.getAb_tradeorderno()).toUpperCase()))) {/*退款成功,加状态，防止多次异步 */
                            ab.setAb_traderefundno(params.get("out_biz_no"));// 支付宝交易号
                            ab.setAb_traderefunddate(DateTimeUtil.getstrToDate(params.get("gmt_refund"))); /*交易日期*/
                            ab.setAb_traderefunddate(DateTimeUtil.getstrToDate(params.get("gmt_refund"))); /*交易日期*/
                            ab.setAb_traderefundamount(new BigDecimal(params.get("total_amount")));// 支付金额
                            iflag = walletService.saveBuy(ab, 2);/*退款 service实现事务更新*/
                        };

                    };
             } ;

//            if ("cz".equals(bv[1].toLowerCase())) {/*充值*/
            if ("C".equals(params.get("out_trade_no").toString().toUpperCase().substring(0, 1))) {/*购买*/
                Acc_Recharge ar = walletService.getRechargeDetail(params.get("out_trade_no"));
                if (ar != null) {
                //    ar.setAr_tradeway((byte) 1);/*支付宝*/
                    ar.setAr_no(params.get("out_trade_no"));// 商户订单号
                 //   ar.setAr_tradename(params.get("buyer_id"));/*买家*/
                    ar.setAr_tradecard(params.get("buyer_logon_id"));/*买家*/
                    ar.setAr_tradeamount(new BigDecimal(params.get("total_amount")));// 支付金额
                    ar.setAr_tradeorderno(params.get("trade_no"));// 支付宝交易号
                    if (ar.getAr_status()==0&&"TRADE_SUCCESS".equals(params.get("trade_status").toUpperCase())==true
                            &&("TRADE_SUCCESS".equals(payaliquery(ar.getAr_no(),ar.getAr_tradeorderno()).toUpperCase()))) {/*购买成功,加状态，防止多次异步 */
                        ar.setAr_tradeorderdate(DateTimeUtil.getstrToDate(params.get("gmt_payment"))); /*交易日期*/
                        iflag=walletService.saveRecharge(ar, 1);/*付款 service实现事务更新*/
                    };
                    if (ar.getAr_status()==1&&"TRADE_CLOSED".equals(params.get("trade_status").toUpperCase())==true
                            &&("TRADE_CLOSED".equals(payaliquery(ar.getAr_no(),ar.getAr_tradeorderno()).toUpperCase()))) {/*退款成功,加状态，防止多次异步 */
                        ar.setAr_traderefundno(params.get("out_biz_no"));// 支付宝交易号
                        ar.setAr_traderefunddate(DateTimeUtil.getstrToDate(params.get("gmt_refund"))); /*交易日期*/
                        ar.setAr_traderefundamount(new BigDecimal(params.get("total_amount")));// 支付金额
                        iflag = walletService.saveRecharge(ar, 2);/*退款 service实现事务更新*/
                    };
                };
            } ;

            if (iflag>0){response.getWriter().write("success");};

        } else {
            // TODO 验签失败则记录异常日志，并在response中返回failure.
            System.out.println("验证失败,不去更新状态");
            response.getWriter().write("fail");
        }

        response.getWriter().flush();

    }

/*支付宝web调用接口
leoli
2018.02.12
* */
    @IgnoreAuth /*不验证*/
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "payaliweb", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public void payaliweb(HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.setHeader("Content-type", "text/html;charset=GBK");
/*
		response.setHeader("Access-Control-Allow-Origin","*");
		response.setHeader("Access-Control-Allow-Credentials","true");
*/
        BufferedWriter bw=new BufferedWriter(response.getWriter());
        String sm=request.getParameter("sm");

        if ((CommonUtil.isEmpty(sm)==false)) {
/*
            BASE64Decoder decoder = new BASE64Decoder();
            byte[] bytes = decoder.decodeBuffer(sm);
            String aa=new String(bytes, "UTF-8");
*/
            String skey=redisService.getStringValue(sm);
            if (skey!=null){bw.write(skey);};
        }else{
            bw.write("sm参数不能为空");
        };
        bw.flush();
    }


/*
* 查询支付宝订单状态，防止被钓鱼
* leoli 2017.11.06
* */
    public String payaliquery(String out_trade_no,String trade_no) throws Exception {
    AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do",APP_ID,APP_PRIVATE_KEY,"json","GBK",ALIPAY_PUBLIC_KEY,"RSA2");
    AlipayTradeQueryRequest request1 = new AlipayTradeQueryRequest();
    request1.setBizContent("{" +"\"out_trade_no\":\""+out_trade_no+"\"," +
            "\"trade_no\":\""+trade_no+"\"" +"  }");
    AlipayTradeQueryResponse response1 = alipayClient.execute(request1);
    if(response1.isSuccess()){
        return response1.getTradeStatus();
    } else {
        return "fail";
    }
    }

/*获取qrcode函数*/
    public static String fn_aliqrcode(String orderno, String amount, String subject) throws UnsupportedEncodingException, AlipayApiException {
        String rut=null;
        AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do", APP_ID, APP_PRIVATE_KEY, "json","GBK", ALIPAY_PUBLIC_KEY, "RSA2");
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();//创建API对应的request
        alipayRequest.setReturnUrl(NOTIFY_URL);
        alipayRequest.setNotifyUrl(NOTIFY_URL);//在公共参数中设置回跳和通知地址
        alipayRequest.setBizContent("{" +
                "    \"out_trade_no\":\"" +orderno+ "\"," +
                "    \"total_amount\":"+amount+"," +
                "    \"subject\":\""+subject+"\"," +
                "    \"body\":\""+subject+"\"," +
                "    \"product_code\":\"FAST_INSTANT_TRADE_PAY\"," +
                "    \"extend_params\":{" +
                "    }" +
                "  }");//填充业务参数
     //   try {
            rut = alipayClient.pageExecute(alipayRequest).getBody(); //调用SDK生成表单


            BASE64Encoder be = new BASE64Encoder();
//            rut = be.encode(rut.getBytes("UTF-8")); /* 转为baes64,内容太长，及有特殊符号*/
        rut = be.encode(rut.getBytes("UTF-8")); /* 转为baes64,内容太长，及有特殊符号*/
            rut = rut.replaceAll(" ", "+");
/*
        解析baes64:
        BASE64Decoder decoder = new BASE64Decoder();
        byte[] bytes = decoder.decodeBuffer(rs2);
        String aa=new String(bytes, "UTF-8");
        System.out.println(aa);
*/
     //   } catch (AlipayApiException e) {
     //       rut=null;
    //        e.printStackTrace();
    //    }
        return rut;
    };

/*
* 获取支付宝网站支付
* leoli 2017.12.14
* */
    @IgnoreAuth /*不验证*/
    @SuppressWarnings({ "unused", "null" })
    @RequestMapping(value = "getpayaliqrcode", method ={RequestMethod.POST, RequestMethod.GET}, produces = "text/json; charset=utf-8")
    public String getpayaliqrcode(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
        AppResult appresult=new AppResult();
        appresult.setStatus(Constants.RESULT_STATUS_SUCC);
        appresult.setMessage(Constants.RESULT_MESSAGE_SUCC);
        String rs = "";
        Boolean flag_pass=true;

        String orderno=request.getParameter("orderno");
        String amount=request.getParameter("amount");
        String subject=request.getParameter("subject");
//        String paybody=request.getParameter("paybody");
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
/*
        if (flag_pass==true&&CommonUtil.isEmpty(paybody)==true) {
            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
            appresult.setMessage("{paybody}不能为空");
            flag_pass=false;
        };
*/

/*检查参数 end*/
/*处理数据 begin*/
        if (flag_pass==true) {
            try{
//            rs=fn_aliqrcode(orderno,amount,subject);
                AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do", APP_ID, APP_PRIVATE_KEY, "json","GBK", ALIPAY_PUBLIC_KEY, "RSA2");
                AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();//创建API对应的request
                alipayRequest.setReturnUrl(NOTIFY_URL);
                alipayRequest.setNotifyUrl(NOTIFY_URL);//在公共参数中设置回跳和通知地址
                alipayRequest.setBizContent("{" +
                        "    \"out_trade_no\":\"" +orderno+ "\"," +
                        "    \"total_amount\":"+amount+"," +
                        "    \"subject\":\""+subject+"\"," +
                        "    \"body\":\""+subject+"\"," +
                        "    \"product_code\":\"FAST_INSTANT_TRADE_PAY\"," +
                        "    \"extend_params\":{" +
                        "    }" +
                        "  }");//填充业务参数
                //   try {
                rs = alipayClient.pageExecute(alipayRequest).getBody(); //调用SDK生成表单

                redisService.saveStringValue("key",rs,0);



            } catch (Exception e) {
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage(e.getMessage());
                e.printStackTrace();
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

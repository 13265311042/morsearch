package com.morsearch.vo;

import com.morsearch.common.util.CommonUtil;

/**
 * Created by hyt on 2017/11/2.
 */
public class PayWXPrepay {
    private static String unifiedorder = "https://api.mch.weixin.qq.com/pay/unifiedorder";
    private static String orderquery = "https://api.mch.weixin.qq.com/pay/orderquery";
    private String appid;                // 应用ID            微信开放平台审核通过的应用APPID
    private String mch_id;                // 商户号            微信支付分配的商户号
    private String nonce_str = CommonUtil.getUUID(true);        // 随机字符串        随机字符串，不长于32位
    private String sign;                // 签名
    private String body;                // 商品描述        商品描述交易字段格式根据不同的应用场景按照以下格式：APP——需传入应用市场上的APP名字-实际商品名称，天天爱消除-游戏充值。
    private String out_trade_no;        // 商户订单号        商户系统内部的订单号,32个字符内、可包含字母
    private String total_fee;            // 总金额            订单总金额，单位为分
    private String spbill_create_ip;    // 终端IP            用户端实际ip
    private String notify_url;            // 通知地址        接收微信支付异步通知回调地址，通知url必须为直接可访问的url，不能携带参数。
    private String trade_type;            // 交易类型        支付类型
    private String partnerKey;
    private String attach;                // 附加数据        附加数据，在查询API和支付通知中原样返回，该字段主要用于商户携带订单的自定义数据
    private String prepay_id;            // 预支付订单号


    public static String getOrderquery() {
        return orderquery;
    }

    public static void setOrderquery(String orderquery) {
        PayWXPrepay.orderquery = orderquery;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getMch_id() {
        return mch_id;
    }

    public void setMch_id(String mch_id) {
        this.mch_id = mch_id;
    }

    public String getNonce_str() {
        return nonce_str;
    }

    public void setNonce_str(String nonce_str) {
        this.nonce_str = nonce_str;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    public String getTotal_fee() {
        return total_fee;
    }

    public void setTotal_fee(String total_fee) {
        this.total_fee = total_fee;
    }

    public String getSpbill_create_ip() {
        return spbill_create_ip;
    }

    public void setSpbill_create_ip(String spbill_create_ip) {
        this.spbill_create_ip = spbill_create_ip;
    }

    public String getNotify_url() {
        return notify_url;
    }

    public void setNotify_url(String notify_url) {
        this.notify_url = notify_url;
    }

    public String getTrade_type() {
        return trade_type;
    }

    public void setTrade_type(String trade_type) {
        this.trade_type = trade_type;
    }

    public String getPartnerKey() {
        return partnerKey;
    }

    public void setPartnerKey(String partnerKey) {
        this.partnerKey = partnerKey;
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public String getPrepay_id() {
        return prepay_id;
    }

    public void setPrepay_id(String prepay_id) {
        this.prepay_id = prepay_id;
    }
};
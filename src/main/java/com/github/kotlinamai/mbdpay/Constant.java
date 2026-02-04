package com.github.kotlinamai.mbdpay;

/**
 * 面包多支付接口常量。
 */
public class Constant {
    /**
     * API 基础地址。
     */
    public static final String BASE_URL = "https://api.niucodata.com";
    /**
     * 获取微信用户 openid 的跳转地址（前端页面地址）。
     */
    public static final String OPENID = "https://p.mbd.pub/openid";

    /**
     * 微信支付：JSAPI 下单接口。
     */
    public static final String WX_JSAPI = BASE_URL + "/release/wx/prepay";

    /**
     * 微信支付：H5 下单接口。
     */
    public static final String WX_H5 = BASE_URL + "/release/wx/prepay";

    /**
     * 支付宝支付：下单接口。
     */
    public static final String ALI_PAY = BASE_URL + "/release/alipay/pay";

    /**
     * 退款接口。
     */
    public static final String REFUND = BASE_URL + "/release/main/refund";

    /**
     * 订单查询接口。
     */
    public static final String SEARCH_ORDER = BASE_URL + "/release/main/search_order";

}

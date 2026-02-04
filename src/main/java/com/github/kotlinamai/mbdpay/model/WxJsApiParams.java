package com.github.kotlinamai.mbdpay.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

public class WxJsApiParams {

    /**
     * 必选 是
     * 类型 string
     * 说明 用户的openid，参见获取openid
     */
    @SerializedName("openid")
    private String openid;

    /**
     * 必选 是
     * 类型 string
     * 说明 支付描述，一般为商品名称
     */
    @SerializedName("description")
    private String description;

    /**
     * 必选 是
     * 类型 number
     * 说明 金额，单位为分
     */
    @SerializedName("amount_total")
    private int amountTotal;

    /**
     * 必选 否
     * 类型 string
     * 说明 订单号，如不填，面包多将随机生成订单号
     */
    @SerializedName("out_trade_no")
    private String outTradeNo;

    /**
     * 必选 是
     * 类型 string
     * 说明 支付后跳转地址
     */
    @SerializedName("callback_url")
    private String callbackUrl;

    public WxJsApiParams() {
    }

    public WxJsApiParams(String openid, String description, int amountTotal, String outTradeNo, String callbackUrl) {
        this.openid = openid;
        this.description = description;
        this.amountTotal = amountTotal;
        this.outTradeNo = outTradeNo;
        this.callbackUrl = callbackUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmountTotal() {
        return amountTotal;
    }

    public void setAmountTotal(int amountTotal) {
        this.amountTotal = amountTotal;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WxJsApiParams that = (WxJsApiParams) o;
        return amountTotal == that.amountTotal
                && Objects.equals(openid, that.openid)
                && Objects.equals(description, that.description)
                && Objects.equals(outTradeNo, that.outTradeNo)
                && Objects.equals(callbackUrl, that.callbackUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(openid, description, amountTotal, outTradeNo, callbackUrl);
    }

    @Override
    public String toString() {
        return "WxJsApiParams{" +
                "openid='" + openid + '\'' +
                ", description='" + description + '\'' +
                ", amountTotal=" + amountTotal +
                ", outTradeNo='" + outTradeNo + '\'' +
                ", callbackUrl='" + callbackUrl + '\'' +
                '}';
    }

    public static final class Builder {
        private String openid;
        private String description;
        private int amountTotal;
        private String outTradeNo;
        private String callbackUrl;

        private Builder() {
        }

        public Builder openid(String openid) {
            this.openid = openid;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder amountTotal(int amountTotal) {
            this.amountTotal = amountTotal;
            return this;
        }

        public Builder outTradeNo(String outTradeNo) {
            this.outTradeNo = outTradeNo;
            return this;
        }

        public Builder callbackUrl(String callbackUrl) {
            this.callbackUrl = callbackUrl;
            return this;
        }

        public WxJsApiParams build() {
            return new WxJsApiParams(openid, description, amountTotal, outTradeNo, callbackUrl);
        }
    }

}

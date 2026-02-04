package com.github.kotlinamai.mbdpay.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

public class AliPayParams {

    /**
     * 必选 是
     * 类型 string
     * 说明 支付后跳转的URL地址
     */
    @SerializedName("url")
    private String url;

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
     * 必选 否
     * 类型 string
     * 说明 支付后跳转地址，如不填会只显示「支付成功」
     */
    @SerializedName("callback_url")
    private String callbackUrl;

    public AliPayParams() {
    }

    public AliPayParams(String url, String description, int amountTotal, String outTradeNo, String callbackUrl) {
        this.url = url;
        this.description = description;
        this.amountTotal = amountTotal;
        this.outTradeNo = outTradeNo;
        this.callbackUrl = callbackUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
        AliPayParams that = (AliPayParams) o;
        return amountTotal == that.amountTotal
                && Objects.equals(url, that.url)
                && Objects.equals(description, that.description)
                && Objects.equals(outTradeNo, that.outTradeNo)
                && Objects.equals(callbackUrl, that.callbackUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, description, amountTotal, outTradeNo, callbackUrl);
    }

    @Override
    public String toString() {
        return "AliPayParams{" +
                "url='" + url + '\'' +
                ", description='" + description + '\'' +
                ", amountTotal=" + amountTotal +
                ", outTradeNo='" + outTradeNo + '\'' +
                ", callbackUrl='" + callbackUrl + '\'' +
                '}';
    }

    public static final class Builder {
        private String url;
        private String description;
        private int amountTotal;
        private String outTradeNo;
        private String callbackUrl;

        private Builder() {
        }

        public Builder url(String url) {
            this.url = url;
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

        public AliPayParams build() {
            return new AliPayParams(url, description, amountTotal, outTradeNo, callbackUrl);
        }
    }

}

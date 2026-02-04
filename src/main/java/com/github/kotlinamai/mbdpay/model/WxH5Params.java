package com.github.kotlinamai.mbdpay.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

public class WxH5Params {

    /**
     * 必选 是
     * 类型 string
     * 说明 固定为 h5
     */
    @SerializedName("channel")
    private String channel;

    /**
     * 必选 是
     * 类型 string
     * 说明 支付描述，一般为商品名称
     */
    @SerializedName("description")
    private String description;

    /**
     * 必选 否
     * 类型 string
     * 说明 订单号，如不填，面包多将随机生成订单号
     */
    @SerializedName("out_trade_no")
    private String outTradeNo;

    /**
     * 必选 是
     * 类型 number
     * 说明 金额，单位为分
     */
    @SerializedName("amount_total")
    private int amountTotal;

    public WxH5Params() {
    }

    public WxH5Params(String channel, String description, String outTradeNo, int amountTotal) {
        this.channel = channel;
        this.description = description;
        this.outTradeNo = outTradeNo;
        this.amountTotal = amountTotal;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public int getAmountTotal() {
        return amountTotal;
    }

    public void setAmountTotal(int amountTotal) {
        this.amountTotal = amountTotal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WxH5Params that = (WxH5Params) o;
        return amountTotal == that.amountTotal
                && Objects.equals(channel, that.channel)
                && Objects.equals(description, that.description)
                && Objects.equals(outTradeNo, that.outTradeNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(channel, description, outTradeNo, amountTotal);
    }

    @Override
    public String toString() {
        return "WxH5Params{" +
                "channel='" + channel + '\'' +
                ", description='" + description + '\'' +
                ", outTradeNo='" + outTradeNo + '\'' +
                ", amountTotal=" + amountTotal +
                '}';
    }

    public static final class Builder {
        private String channel;
        private String description;
        private String outTradeNo;
        private int amountTotal;

        private Builder() {
        }

        public Builder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder outTradeNo(String outTradeNo) {
            this.outTradeNo = outTradeNo;
            return this;
        }

        public Builder amountTotal(int amountTotal) {
            this.amountTotal = amountTotal;
            return this;
        }

        public WxH5Params build() {
            return new WxH5Params(channel, description, outTradeNo, amountTotal);
        }
    }

}

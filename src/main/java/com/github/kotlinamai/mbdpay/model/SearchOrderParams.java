package com.github.kotlinamai.mbdpay.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

public class SearchOrderParams {

    /**
     * 必选 是
     * 类型 string
     * 说明 订单号（也支持微信/支付宝流水号）
     */
    @SerializedName("out_trade_no")
    private String outTradeNo;

    public SearchOrderParams() {
    }

    public SearchOrderParams(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SearchOrderParams that = (SearchOrderParams) o;
        return Objects.equals(outTradeNo, that.outTradeNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(outTradeNo);
    }

    @Override
    public String toString() {
        return "SearchOrderParams{" +
                "outTradeNo='" + outTradeNo + '\'' +
                '}';
    }

    public static final class Builder {
        private String outTradeNo;

        private Builder() {
        }

        public Builder outTradeNo(String outTradeNo) {
            this.outTradeNo = outTradeNo;
            return this;
        }

        public SearchOrderParams build() {
            return new SearchOrderParams(outTradeNo);
        }
    }

}

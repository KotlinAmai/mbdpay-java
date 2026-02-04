package com.github.kotlinamai.mbdpay.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

public class RefundParams {

    /**
     * 必选 是
     * 类型 string
     * 说明 订单号
     */
    @SerializedName("order_id")
    private String orderId;

    public RefundParams() {
    }

    public RefundParams(String orderId) {
        this.orderId = orderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RefundParams that = (RefundParams) o;
        return Objects.equals(orderId, that.orderId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId);
    }

    @Override
    public String toString() {
        return "RefundParams{" +
                "orderId='" + orderId + '\'' +
                '}';
    }

    public static final class Builder {
        private String orderId;

        private Builder() {
        }

        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        public RefundParams build() {
            return new RefundParams(orderId);
        }
    }

}

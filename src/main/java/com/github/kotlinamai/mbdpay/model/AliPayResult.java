package com.github.kotlinamai.mbdpay.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * 支付宝下单返回。
 */
public class AliPayResult extends Result {

    /**
     * 支付宝唤起参数/表单内容。
     */
    @SerializedName("body")
    private String body;

    public AliPayResult() {
        super();
    }

    public AliPayResult(String error, String body) {
        super(error);
        this.body = body;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof AliPayResult)) return false;
        AliPayResult other = (AliPayResult) o;
        if (!other.canEqual(this)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(this.body, other.body);
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof AliPayResult;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.body);
    }

    @Override
    public String toString() {
        return "AliPayResult(super=" + super.toString() + ", body=" + this.body + ")";
    }

}

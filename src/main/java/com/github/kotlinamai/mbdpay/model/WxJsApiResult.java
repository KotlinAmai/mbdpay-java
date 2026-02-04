package com.github.kotlinamai.mbdpay.model;

import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WxJsApiResult extends Result {

    /**
     * appId
     */
    @SerializedName("appId")
    private String appId;

    /**
     * timeStamp
     */
    @SerializedName("timeStamp")
    private String timeStamp;

    /**
     * nonceStr
     */
    @SerializedName("nonceStr")
    private String nonceStr;

    /**
     * package
     */
    @SerializedName("package")
    private String packageName;

    /**
     * signType
     */
    @SerializedName("signType")
    private String signType;

    /**
     * paySign
     */
    @SerializedName("paySign")
    private String paySign;

    public WxJsApiResult() {
        super();
    }

    public WxJsApiResult(String error, String appId, String timeStamp, String nonceStr, String packageName, String signType, String paySign) {
        super(error);
        this.appId = appId;
        this.timeStamp = timeStamp;
        this.nonceStr = nonceStr;
        this.packageName = packageName;
        this.signType = signType;
        this.paySign = paySign;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getNonceStr() {
        return nonceStr;
    }

    public void setNonceStr(String nonceStr) {
        this.nonceStr = nonceStr;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getSignType() {
        return signType;
    }

    public void setSignType(String signType) {
        this.signType = signType;
    }

    public String getPaySign() {
        return paySign;
    }

    public void setPaySign(String paySign) {
        this.paySign = paySign;
    }

    public Map<String, String> getPayParams() {
        HashMap<String, String> map = new HashMap<>();
        map.put("appId", this.appId);
        map.put("timeStamp", this.timeStamp);
        map.put("nonceStr", this.nonceStr);
        map.put("package", this.packageName);
        map.put("signType", this.signType);
        map.put("paySign", this.paySign);
        return map;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof WxJsApiResult)) return false;
        WxJsApiResult other = (WxJsApiResult) o;
        if (!other.canEqual(this)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(this.appId, other.appId)
                && Objects.equals(this.timeStamp, other.timeStamp)
                && Objects.equals(this.nonceStr, other.nonceStr)
                && Objects.equals(this.packageName, other.packageName)
                && Objects.equals(this.signType, other.signType)
                && Objects.equals(this.paySign, other.paySign);
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof WxJsApiResult;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.appId, this.timeStamp, this.nonceStr, this.packageName, this.signType, this.paySign);
    }

    @Override
    public String toString() {
        return "WxJsApiResult(super=" + super.toString() +
                ", appId=" + this.appId +
                ", timeStamp=" + this.timeStamp +
                ", nonceStr=" + this.nonceStr +
                ", packageName=" + this.packageName +
                ", signType=" + this.signType +
                ", paySign=" + this.paySign +
                ")";
    }

}

package com.github.kotlinamai.mbdpay.notice;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

public class NoticeDataChargeSucceeded implements NoticeData {

    /**
     * description
     * 类型 string
     * 说明 商品描述
     */
    @SerializedName("description")
    private String description;

    /**
     * out_trade_no
     * 类型 string
     * 说明 订单号
     */
    @SerializedName("out_trade_no")
    private String outTradeNo;

    /**
     * amount
     * 类型 int
     * 说明 金额，单位为分
     */
    @SerializedName("amount")
    private int amount;

    /**
     * openid
     * 类型 string
     * 说明 支付者 openid (仅微信支付)
     */
    @SerializedName("openid")
    private String openid;

    /**
     * charge_id
     * 类型 string
     * 说明 支付渠道流水号
     */
    @SerializedName("charge_id")
    private String chargeId;

    /**
     * payway
     * 类型 int
     * 说明 支付渠道，微信支付为 1 ，支付宝支付为 2
     */
    @SerializedName("payway")
    private int payway;

    public NoticeDataChargeSucceeded() {
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

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getChargeId() {
        return chargeId;
    }

    public void setChargeId(String chargeId) {
        this.chargeId = chargeId;
    }

    public int getPayway() {
        return payway;
    }

    public void setPayway(int payway) {
        this.payway = payway;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NoticeDataChargeSucceeded that = (NoticeDataChargeSucceeded) o;
        return amount == that.amount
                && payway == that.payway
                && Objects.equals(description, that.description)
                && Objects.equals(outTradeNo, that.outTradeNo)
                && Objects.equals(openid, that.openid)
                && Objects.equals(chargeId, that.chargeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, outTradeNo, amount, openid, chargeId, payway);
    }

    @Override
    public String toString() {
        return "NoticeDataChargeSucceeded{" +
                "description='" + description + '\'' +
                ", outTradeNo='" + outTradeNo + '\'' +
                ", amount=" + amount +
                ", openid='" + openid + '\'' +
                ", chargeId='" + chargeId + '\'' +
                ", payway=" + payway +
                '}';
    }

}

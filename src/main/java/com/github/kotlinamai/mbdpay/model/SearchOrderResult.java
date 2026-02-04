package com.github.kotlinamai.mbdpay.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * 订单查询接口返回。
 */
public class SearchOrderResult extends Result {


    /**
     * 面包多订单 ID。
     */
    @SerializedName("order_id")
    private String orderId;

    /**
     * 支付渠道流水号（微信/支付宝侧）。
     */
    @SerializedName("charge_id")
    private String chargeId;

    /**
     * 支付描述，一般为商品名称。
     */
    @SerializedName("description")
    private String description;

    /**
     * 分账 ID（如有）。
     */
    @SerializedName("share_id")
    private String shareId;

    /**
     * 分账状态（如有）。
     */
    @SerializedName("share_state")
    private String shareState;

    /**
     * 订单金额（单位：分），由接口返回为字符串。
     */
    @SerializedName("amount")
    private String amount;

    /**
     * 订单状态。
     */
    @SerializedName("state")
    private String state;

    /**
     * 创建时间。
     */
    @SerializedName("create_time")
    private String createTime;

    /**
     * 支付渠道（微信=1，支付宝=2）。
     */
    @SerializedName("payway")
    private int payway;

    /**
     * 退款状态。
     */
    @SerializedName("refund_state")
    private String refundState;

    /**
     * 退款金额（单位：分），由接口返回为字符串。
     */
    @SerializedName("refund_amount")
    private String refundAmount;

    public SearchOrderResult() {
        super();
    }

    public SearchOrderResult(String error, String orderId, String chargeId, String description, String shareId, String shareState, String amount, String state, String createTime, int payway, String refundState, String refundAmount) {
        super(error);
        this.orderId = orderId;
        this.chargeId = chargeId;
        this.description = description;
        this.shareId = shareId;
        this.shareState = shareState;
        this.amount = amount;
        this.state = state;
        this.createTime = createTime;
        this.payway = payway;
        this.refundState = refundState;
        this.refundAmount = refundAmount;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getChargeId() {
        return chargeId;
    }

    public void setChargeId(String chargeId) {
        this.chargeId = chargeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getShareId() {
        return shareId;
    }

    public void setShareId(String shareId) {
        this.shareId = shareId;
    }

    public String getShareState() {
        return shareState;
    }

    public void setShareState(String shareState) {
        this.shareState = shareState;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public int getPayway() {
        return payway;
    }

    public void setPayway(int payway) {
        this.payway = payway;
    }

    public String getRefundState() {
        return refundState;
    }

    public void setRefundState(String refundState) {
        this.refundState = refundState;
    }

    public String getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(String refundAmount) {
        this.refundAmount = refundAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof SearchOrderResult)) return false;
        SearchOrderResult other = (SearchOrderResult) o;
        if (!other.canEqual(this)) return false;
        if (!super.equals(o)) return false;
        return this.payway == other.payway
                && Objects.equals(this.orderId, other.orderId)
                && Objects.equals(this.chargeId, other.chargeId)
                && Objects.equals(this.description, other.description)
                && Objects.equals(this.shareId, other.shareId)
                && Objects.equals(this.shareState, other.shareState)
                && Objects.equals(this.amount, other.amount)
                && Objects.equals(this.state, other.state)
                && Objects.equals(this.createTime, other.createTime)
                && Objects.equals(this.refundState, other.refundState)
                && Objects.equals(this.refundAmount, other.refundAmount);
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof SearchOrderResult;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.orderId, this.chargeId, this.description, this.shareId, this.shareState, this.amount, this.state, this.createTime, this.payway, this.refundState, this.refundAmount);
    }

    @Override
    public String toString() {
        return "SearchOrderResult(super=" + super.toString() +
                ", orderId=" + this.orderId +
                ", chargeId=" + this.chargeId +
                ", description=" + this.description +
                ", shareId=" + this.shareId +
                ", shareState=" + this.shareState +
                ", amount=" + this.amount +
                ", state=" + this.state +
                ", createTime=" + this.createTime +
                ", payway=" + this.payway +
                ", refundState=" + this.refundState +
                ", refundAmount=" + this.refundAmount +
                ")";
    }

}

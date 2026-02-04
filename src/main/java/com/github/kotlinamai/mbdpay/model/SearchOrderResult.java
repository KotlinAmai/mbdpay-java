package com.github.kotlinamai.mbdpay.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

public class SearchOrderResult extends Result {


    /**
     * order_id
     */
    @SerializedName("order_id")
    private String orderId;

    /**
     * charge_id
     */
    @SerializedName("charge_id")
    private String chargeId;

    /**
     * description
     */
    @SerializedName("description")
    private String description;

    /**
     * share_id
     */
    @SerializedName("share_id")
    private String shareId;

    /**
     * share_state
     */
    @SerializedName("share_state")
    private String shareState;

    /**
     * amount
     */
    @SerializedName("amount")
    private String amount;

    /**
     * state
     */
    @SerializedName("state")
    private String state;

    /**
     * create_time
     */
    @SerializedName("create_time")
    private String createTime;

    /**
     * payway
     */
    @SerializedName("payway")
    private int payway;

    /**
     * refund_state
     */
    @SerializedName("refund_state")
    private String refundState;

    /**
     * refund_amount
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

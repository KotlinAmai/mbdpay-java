package com.github.kotlinamai.mbdpay.notice;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

public class NoticeDataComplaint implements NoticeData {

    /**
     * out_trade_no
     * 类型 string
     * 说明 订单号
     */
    @SerializedName("out_trade_no")
    private String outTradeNo;

    /**
     * complaint_detail
     * 类型 string
     * 说明 投诉详情
     */
    @SerializedName("complaint_detail")
    private String complaintDetail;

    /**
     * amount
     * 类型 int
     * 说明 订单金额，单位为分
     */
    @SerializedName("amount")
    private int amount;

    /**
     * payer_phone
     * 类型 string
     * 说明 投诉者电话
     */
    @SerializedName("payer_phone")
    private String payerPhone;

    public NoticeDataComplaint() {
    }

    public NoticeDataComplaint(String outTradeNo, String complaintDetail, int amount, String payerPhone) {
        this.outTradeNo = outTradeNo;
        this.complaintDetail = complaintDetail;
        this.amount = amount;
        this.payerPhone = payerPhone;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public String getComplaintDetail() {
        return complaintDetail;
    }

    public void setComplaintDetail(String complaintDetail) {
        this.complaintDetail = complaintDetail;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getPayerPhone() {
        return payerPhone;
    }

    public void setPayerPhone(String payerPhone) {
        this.payerPhone = payerPhone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NoticeDataComplaint that = (NoticeDataComplaint) o;
        return amount == that.amount
                && Objects.equals(outTradeNo, that.outTradeNo)
                && Objects.equals(complaintDetail, that.complaintDetail)
                && Objects.equals(payerPhone, that.payerPhone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(outTradeNo, complaintDetail, amount, payerPhone);
    }

    @Override
    public String toString() {
        return "NoticeDataComplaint{" +
                "outTradeNo='" + outTradeNo + '\'' +
                ", complaintDetail='" + complaintDetail + '\'' +
                ", amount=" + amount +
                ", payerPhone='" + payerPhone + '\'' +
                '}';
    }

}

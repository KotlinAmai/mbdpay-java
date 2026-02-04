package com.github.kotlinamai.mbdpay.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

public class RefundResult extends Result {

    /**
     * code
     */
    @SerializedName("code")
    private int code;

    /**
     * info
     */
    @SerializedName("info")
    private String info;

    public RefundResult() {
        super();
    }

    public RefundResult(String error, int code, String info) {
        super(error);
        this.code = code;
        this.info = info;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof RefundResult)) return false;
        RefundResult other = (RefundResult) o;
        if (!other.canEqual(this)) return false;
        if (!super.equals(o)) return false;
        return this.code == other.code && Objects.equals(this.info, other.info);
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof RefundResult;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.code, this.info);
    }

    @Override
    public String toString() {
        return "RefundResult(super=" + super.toString() + ", code=" + this.code + ", info=" + this.info + ")";
    }

}

package com.github.kotlinamai.mbdpay.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * 微信 H5 下单返回。
 */
public class WxH5Result extends Result {

    /**
     * 跳转微信 H5 收银台的 URL。
     */
    @SerializedName("h5_url")
    private String h5Url;

    public WxH5Result() {
        super();
    }

    public WxH5Result(String error, String h5Url) {
        super(error);
        this.h5Url = h5Url;
    }

    public String getH5Url() {
        return h5Url;
    }

    public void setH5Url(String h5Url) {
        this.h5Url = h5Url;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof WxH5Result)) return false;
        WxH5Result other = (WxH5Result) o;
        if (!other.canEqual(this)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(this.h5Url, other.h5Url);
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof WxH5Result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.h5Url);
    }

    @Override
    public String toString() {
        return "WxH5Result(super=" + super.toString() + ", h5Url=" + this.h5Url + ")";
    }

}

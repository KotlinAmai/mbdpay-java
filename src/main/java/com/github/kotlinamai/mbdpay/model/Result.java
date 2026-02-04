package com.github.kotlinamai.mbdpay.model;

import java.util.Objects;

public abstract class Result {

    /**
     * error
     */
    private String error;

    protected Result() {
    }

    protected Result(String error) {
        this.error = error;
    }

    public boolean isSuccess(){
        return this.error == null || "".equals(error);
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Result)) return false;
        Result other = (Result) o;
        if (!other.canEqual(this)) return false;
        return Objects.equals(this.error, other.error);
    }

    protected boolean canEqual(Object other) {
        return other instanceof Result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.error);
    }

    @Override
    public String toString() {
        return "Result(error=" + this.error + ")";
    }

}

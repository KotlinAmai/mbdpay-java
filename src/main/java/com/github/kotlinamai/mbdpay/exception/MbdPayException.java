package com.github.kotlinamai.mbdpay.exception;

/**
 * SDK 内部统一异常类型。
 * <p>
 * 主要用于包装网络请求失败、签名/解析失败等错误。
 */
public class MbdPayException extends Exception {

    public MbdPayException() {
    }

    public MbdPayException(String message) {
        super(message);
    }

    public MbdPayException(String message, Throwable cause) {
        super(message, cause);
    }

    public MbdPayException(Throwable cause) {
        super(cause);
    }

    public MbdPayException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

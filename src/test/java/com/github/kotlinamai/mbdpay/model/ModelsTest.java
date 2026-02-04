package com.github.kotlinamai.mbdpay.model;

import com.github.kotlinamai.mbdpay.notice.Notice;
import com.github.kotlinamai.mbdpay.notice.NoticeDataComplaint;
import com.github.kotlinamai.mbdpay.notice.NoticeType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ModelsTest {

    @Test
    void paramsBuilders_keepExistingUsage() {
        AliPayParams ali = AliPayParams.builder()
                .url("u")
                .description("d")
                .amountTotal(1)
                .outTradeNo("o")
                .callbackUrl("c")
                .build();
        assertEquals("u", ali.getUrl());
        assertEquals("d", ali.getDescription());
        assertEquals(1, ali.getAmountTotal());
        assertEquals("o", ali.getOutTradeNo());
        assertEquals("c", ali.getCallbackUrl());

        WxH5Params h5 = WxH5Params.builder()
                .channel("h5")
                .description("d2")
                .outTradeNo("o2")
                .amountTotal(2)
                .build();
        assertEquals("h5", h5.getChannel());
        assertEquals("d2", h5.getDescription());
        assertEquals("o2", h5.getOutTradeNo());
        assertEquals(2, h5.getAmountTotal());

        WxJsApiParams jsApi = WxJsApiParams.builder()
                .openid("openid")
                .description("d3")
                .amountTotal(3)
                .outTradeNo("o3")
                .callbackUrl("cb")
                .build();
        assertEquals("openid", jsApi.getOpenid());
        assertEquals("d3", jsApi.getDescription());
        assertEquals(3, jsApi.getAmountTotal());
        assertEquals("o3", jsApi.getOutTradeNo());
        assertEquals("cb", jsApi.getCallbackUrl());

        RefundParams refund = RefundParams.builder()
                .orderId("order")
                .build();
        assertEquals("order", refund.getOrderId());

        SearchOrderParams search = SearchOrderParams.builder()
                .outTradeNo("out")
                .build();
        assertEquals("out", search.getOutTradeNo());
    }

    @Test
    void result_isSuccessDependsOnError() {
        AliPayResult ok = new AliPayResult();
        ok.setError("");
        assertTrue(ok.isSuccess());

        AliPayResult fail = new AliPayResult();
        fail.setError("bad");
        assertFalse(fail.isSuccess());
    }

    @Test
    void notice_builderWorks() {
        NoticeDataComplaint data = new NoticeDataComplaint("o", "d", 1, "p");
        Notice notice = Notice.builder()
                .type(NoticeType.complaint)
                .data(data)
                .build();
        assertEquals(NoticeType.complaint, notice.getType());
        assertEquals(data, notice.getData());
    }
}


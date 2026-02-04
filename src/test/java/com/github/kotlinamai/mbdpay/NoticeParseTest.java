package com.github.kotlinamai.mbdpay;

import com.github.kotlinamai.mbdpay.exception.MbdPayException;
import com.github.kotlinamai.mbdpay.notice.Notice;
import com.github.kotlinamai.mbdpay.notice.NoticeDataChargeSucceeded;
import com.github.kotlinamai.mbdpay.notice.NoticeDataComplaint;
import com.github.kotlinamai.mbdpay.notice.NoticeType;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class NoticeParseTest {

    @Test
    void parseNotice_json_chargeSucceeded() throws Exception {
        String json = "{\"type\":\"charge_succeeded\",\"data\":{\"description\":\"d\",\"out_trade_no\":\"o\",\"amount\":1,\"openid\":\"x\",\"charge_id\":\"c\",\"payway\":1}}";
        MbdPayClient client = new MbdPayClient("appId", "appKey");
        Notice notice = client.parseNotice(json);
        assertEquals(NoticeType.charge_succeeded, notice.getType());
        NoticeDataChargeSucceeded data = assertInstanceOf(NoticeDataChargeSucceeded.class, notice.getData());
        assertEquals("d", data.getDescription());
        assertEquals("o", data.getOutTradeNo());
        assertEquals(1, data.getAmount());
        assertEquals("x", data.getOpenid());
        assertEquals("c", data.getChargeId());
        assertEquals(1, data.getPayway());
    }

    @Test
    void parseNotice_json_complaint() throws Exception {
        String json = "{\"type\":\"complaint\",\"data\":{\"out_trade_no\":\"o\",\"complaint_detail\":\"detail\",\"amount\":2,\"payer_phone\":\"138\"}}";
        MbdPayClient client = new MbdPayClient("appId", "appKey");
        Notice notice = client.parseNotice(json);
        assertEquals(NoticeType.complaint, notice.getType());
        NoticeDataComplaint data = assertInstanceOf(NoticeDataComplaint.class, notice.getData());
        assertEquals("o", data.getOutTradeNo());
        assertEquals("detail", data.getComplaintDetail());
        assertEquals(2, data.getAmount());
        assertEquals("138", data.getPayerPhone());
    }

    @Test
    void parseNotice_map_complaint() throws Exception {
        Map<String, Object> data = new HashMap<>();
        data.put("out_trade_no", "o");
        data.put("complaint_detail", "detail");
        data.put("amount", 2);
        data.put("payer_phone", "138");

        Map<String, Object> map = new HashMap<>();
        map.put("type", "complaint");
        map.put("data", data);

        MbdPayClient client = new MbdPayClient("appId", "appKey");
        Notice notice = client.parseNotice(map);
        assertEquals(NoticeType.complaint, notice.getType());
        NoticeDataComplaint parsed = assertInstanceOf(NoticeDataComplaint.class, notice.getData());
        assertEquals("o", parsed.getOutTradeNo());
        assertEquals("detail", parsed.getComplaintDetail());
        assertEquals(2, parsed.getAmount());
        assertEquals("138", parsed.getPayerPhone());
    }

    @Test
    void parseNotice_unknownType_throws() {
        String json = "{\"type\":\"unknown\",\"data\":{}}";
        MbdPayClient client = new MbdPayClient("appId", "appKey");
        assertThrows(IllegalArgumentException.class, () -> client.parseNotice(json));
    }

    @Test
    void parseNotice_invalidData_throwsMbdPayException() {
        String json = "{\"type\":\"complaint\",\"data\":[]}";
        MbdPayClient client = new MbdPayClient("appId", "appKey");
        assertThrows(MbdPayException.class, () -> client.parseNotice(json));
    }
}


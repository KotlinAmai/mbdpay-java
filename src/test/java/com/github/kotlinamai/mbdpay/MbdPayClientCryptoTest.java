package com.github.kotlinamai.mbdpay;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MbdPayClientCryptoTest {

    @Test
    void md5_matchesKnownValue() throws Exception {
        assertEquals("098f6bcd4621d373cade4e832627b4f6", MbdPayClient.md5("test"));
    }
}

package com.github.kotlinamai.mbdpay;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QueryStringBuilderTest {

    @Test
    void build_sortsKeysAndKeepsValueInsertionOrder() {
        String qs = QueryStringBuilder.create()
                .put("b", "2")
                .put("a", "1")
                .put("a", "3")
                .build();
        assertEquals("a=1&a=3&b=2", qs);
    }

    @Test
    void build_handlesVarargsPut() {
        String qs = QueryStringBuilder.create()
                .put("k", "v1", "v2")
                .build();
        assertEquals("k=v1&k=v2", qs);
    }
}


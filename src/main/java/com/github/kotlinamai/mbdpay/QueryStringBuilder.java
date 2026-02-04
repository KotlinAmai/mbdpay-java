package com.github.kotlinamai.mbdpay;

import java.util.*;

/**
 * 用于拼接查询字符串（Query String）的简单工具。
 * <p>
 * 规则：
 * <ul>
 *     <li>按 key 字典序排序输出</li>
 *     <li>同一个 key 的多个 value 按插入顺序输出</li>
 * </ul>
 * 不会对 key/value 做 URL 编码，调用方需自行保证安全性。
 */
public class QueryStringBuilder {

    private final Map<String, List<String>> builder;

    public static QueryStringBuilder create() {
        return new QueryStringBuilder();
    }

    private QueryStringBuilder() {
        this.builder = new HashMap<>();
    }

    /**
     * 添加一个 key 对应的多个 value。
     *
     * @param key    参数名
     * @param values 参数值列表
     */
    public QueryStringBuilder put(String key, String... values) {
        List<String> list = this.builder.get(key);
        if (list == null) {
            list = new ArrayList<>();
        }
        list.addAll(Arrays.asList(values));
        this.builder.put(key, list);
        return this;
    }

    /**
     * 添加一个 key=value。
     *
     * @param key   参数名
     * @param value 参数值
     */
    public QueryStringBuilder put(String key, String value) {
        List<String> list = this.builder.get(key);
        if (list == null) {
            list = new ArrayList<>();
        }
        list.add(value);
        this.builder.put(key, list);
        return this;
    }

    /**
     * 构建查询字符串，例如：a=1&b=2。
     */
    public String build() {
        StringBuilder builder = new StringBuilder();
        String[] keys = this.builder.keySet()
                .stream()
                .sorted()
                .toArray(String[]::new);
        for (String key : keys) {
            List<String> values = this.builder.get(key);
            for (String value : values) {
                if (builder.length() > 0) {
                    builder.append('&');
                }
                builder.append(key);
                builder.append('=');
                builder.append(value);
            }
        }
        return builder.toString();
    }

}

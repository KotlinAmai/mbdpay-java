package com.github.kotlinamai.mbdpay.notice;

import java.util.Objects;

/**
 * Webhook 通知
 */
public class Notice {

    /**
     * type
     */
    private NoticeType type;

    /**
     * data
     */
    private NoticeData data;

    public Notice() {
    }

    public Notice(NoticeType type, NoticeData data) {
        this.type = type;
        this.data = data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public NoticeType getType() {
        return type;
    }

    public void setType(NoticeType type) {
        this.type = type;
    }

    public NoticeData getData() {
        return data;
    }

    public void setData(NoticeData data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notice notice = (Notice) o;
        return type == notice.type && Objects.equals(data, notice.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, data);
    }

    @Override
    public String toString() {
        return "Notice{" +
                "type=" + type +
                ", data=" + data +
                '}';
    }

    public static final class Builder {
        private NoticeType type;
        private NoticeData data;

        private Builder() {
        }

        public Builder type(NoticeType type) {
            this.type = type;
            return this;
        }

        public Builder data(NoticeData data) {
            this.data = data;
            return this;
        }

        public Notice build() {
            return new Notice(type, data);
        }
    }

}

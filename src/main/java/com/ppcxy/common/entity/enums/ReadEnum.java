package com.ppcxy.common.entity.enums;

/**
 * <p>Date: 13-2-7 上午11:44
 * <p>Version: 1.0
 */
public enum ReadEnum {
    TRUE(Boolean.TRUE, "已读"), FALSE(Boolean.FALSE, "未读");

    private final Boolean value;
    private final String info;

    private ReadEnum(Boolean value, String info) {
        this.value = value;
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public Boolean getValue() {
        return value;
    }
}

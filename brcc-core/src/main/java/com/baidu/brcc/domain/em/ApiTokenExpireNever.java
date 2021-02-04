/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.domain.em;

public enum ApiTokenExpireNever {
    TRUE((byte) 1, "TRUE"),

    FALSE((byte) 0, "FALSE");

    private Byte value;
    private String name;

    ApiTokenExpireNever(Byte value, String name) {
        this.value = value;
        this.name = name;
    }

    public Byte getValue() {
        return value;
    }

    public void setValue(Byte value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

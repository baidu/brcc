/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.domain.em;

// 管理类型，0：普通，1：UUAP
public enum UserType {
    NORMAL((byte) 0, "普通"),

    UUAP((byte) 1, "UUAP");

    private Byte value;
    private String name;

    UserType(Byte value, String name) {
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

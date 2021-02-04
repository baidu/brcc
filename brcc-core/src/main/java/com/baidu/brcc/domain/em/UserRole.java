/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.domain.em;
// 管理类型，0：普通，1：工程，2：产品线, 3: 系统管理员
public enum UserRole {
    NORMAL((byte) 0, "普通"),

    PROJECT((byte) 1, "工程"),

    PRODUCT((byte) 2, "产品线"),

    SYSADMIN((byte) 3, "系统管理员");

    private Byte value;
    private String name;

    UserRole(Byte value, String name) {
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

package com.baidu.brcc.domain.em;

public enum LoadType {
    PROJECT((byte) 0, "工程"),

    ENVIRONMENT((byte) 1, "环境"),

    VERSION((byte) 2, "版本"),

    GROUP((byte) 3, "分组");



    private Byte value;
    private String name;

    LoadType(Byte value, String name) {
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

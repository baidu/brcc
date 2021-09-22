package com.baidu.brcc.domain.em;

public enum FileFormat {
    PROPERTIES((byte) 0, "properties"),

    YAML((byte) 1, "yaml");

    private Byte value;
    private String name;

    FileFormat(Byte value, String name) {
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

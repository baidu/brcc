package com.baidu.brcc.domain.em;

public enum FileImportType {
    STOP((byte) 0, "终止导入"),

    OVERWRITE((byte) 1, "覆盖");

    private Byte value;
    private String name;

    FileImportType(Byte value, String name) {
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

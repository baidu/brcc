package com.baidu.brcc.domain.em;

public enum SortType {
    DESC("desc", "降序"),

    ASC("asc", "升序");

    private String value;
    private String name;

    SortType(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

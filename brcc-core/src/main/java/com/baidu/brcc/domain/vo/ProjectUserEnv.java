package com.baidu.brcc.domain.vo;

import java.util.List;

public class ProjectUserEnv {

    // 0: 普通成员， 1：管理员
    private Byte isAdmin;

    private List<ProjectUserEnvItem> itemList;

    public ProjectUserEnv() {

    }

    private ProjectUserEnv(Builder builder) {
        setIsAdmin(builder.isAdmin);
        setItemList(builder.itemList);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Byte getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Byte isAdmin) {
        this.isAdmin = isAdmin;
    }

    public List<ProjectUserEnvItem> getItemList() {
        return itemList;
    }

    public void setItemList(List<ProjectUserEnvItem> itemList) {
        this.itemList = itemList;
    }

    public static final class Builder {
        private Byte isAdmin;
        private List<ProjectUserEnvItem> itemList;

        private Builder() {
        }

        public Builder isAdmin(Byte val) {
            isAdmin = val;
            return this;
        }

        public Builder itemList(List<ProjectUserEnvItem> val) {
            itemList = val;
            return this;
        }

        public ProjectUserEnv build() {
            return new ProjectUserEnv(this);
        }
    }
}

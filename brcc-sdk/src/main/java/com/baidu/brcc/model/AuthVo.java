/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.model;

public class AuthVo {
    // 工程ID
    private Long projectId;

    // 工程名称
    private String projectName;

    // 访问工程的 api token
    private String token;

    // 是否永不过期，
    // true-永不过期，
    // false-根据expiredTime判断是否过期
    private boolean neverExpired;

    // 过期时间，时间戳形式，单位为毫秒
    private long expiredTime;

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public boolean isNeverExpired() {
        return neverExpired;
    }

    public void setNeverExpired(boolean neverExpired) {
        this.neverExpired = neverExpired;
    }

    public long getExpiredTime() {
        return expiredTime;
    }

    public void setExpiredTime(long expiredTime) {
        this.expiredTime = expiredTime;
    }
}

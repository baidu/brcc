/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.dto;

import com.baidu.brcc.domain.BrccInstance;

public class BrccInstanceDto extends BrccInstance {
    // 1 - 生效， 0-未生效
    private Byte status;

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}

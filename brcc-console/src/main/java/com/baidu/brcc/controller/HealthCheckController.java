/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baidu.brcc.domain.base.R;

/**
 * 服务存活检测探测
 */
@RestController
public class HealthCheckController {
    @GetMapping("check")
    public R check() {
        return R.ok();
    }
}

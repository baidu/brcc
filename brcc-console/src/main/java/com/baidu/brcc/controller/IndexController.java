/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baidu.brcc.domain.base.R;
import com.baidu.brcc.domain.vo.NoticeVo;

import lombok.extern.slf4j.Slf4j;

/**
 * 首页相关统计接口
 */
@Slf4j
@RestController
@RequestMapping("index")
public class IndexController {

    @GetMapping("notice")
    public R notice() {
        // TODO 新增配置功能
        Long pv = System.currentTimeMillis()/2 * 10;
        Map<String, Long> overview = new HashMap<String, Long>(){
            {
                put("产品线", 12L);
                put("工程量", 673L);
                put("配置项", 1292221L);
                put("用户数", 237L);
                put("日均访问数", pv);
            }
        };

        List<String> intro = new ArrayList<>();
        intro.add("配置中心统一管理应用的资源配置信息，多是K-V结构，如memcached、" +
                "db、redis等的配置，使配置信息不散落在各个项目，简化配置的维护；");
        intro.add("支持多环境、多版本资源的管理，可以在不改变应用源码的情况下无缝切换配置。");
        intro.add("配置服务的主要价值就是把系统各个环境，包括开发、" +
                "测试和线上的所有配置内容统一管理起来");

        Map<String, String> onDuty = new HashMap<>();
        Map<String, String> manual = new HashMap<>();

        NoticeVo noticeVo = NoticeVo.newBuilder()
                .overview(overview)
                .intro(intro)
                .onDuty(onDuty)
                .manual(manual)
                .build();

        return R.ok(noticeVo);
    }

}

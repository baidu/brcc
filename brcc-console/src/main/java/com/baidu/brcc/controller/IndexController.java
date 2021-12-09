/*
 * Copyright (c) Baidu Inc. All rights reserved.
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.baidu.brcc.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import com.baidu.brcc.annotation.LoginUser;
import com.baidu.brcc.domain.ProductUser;
import com.baidu.brcc.domain.ProductUserExample;
import com.baidu.brcc.domain.User;
import com.baidu.brcc.domain.vo.CountVo;
import com.baidu.brcc.service.ProductUserService;
import org.checkerframework.checker.units.qual.C;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baidu.brcc.domain.ConfigItemExample;
import com.baidu.brcc.domain.ProductExample;
import com.baidu.brcc.domain.ProjectExample;
import com.baidu.brcc.domain.UserExample;
import com.baidu.brcc.domain.base.R;
import com.baidu.brcc.domain.em.Deleted;
import com.baidu.brcc.domain.vo.NoticeVo;
import com.baidu.brcc.service.ConfigItemService;
import com.baidu.brcc.service.ProductService;
import com.baidu.brcc.service.ProjectService;
import com.baidu.brcc.service.UserService;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

import lombok.extern.slf4j.Slf4j;

import static com.baidu.brcc.common.ErrorStatusMsg.NON_LOGIN_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.NON_LOGIN_STATUS;

/**
 * 首页相关统计接口
 */
@Slf4j
@RestController
@RequestMapping("index")
public class IndexController {

    @Autowired
    ProductService productService;

    @Autowired
    ProductUserService productUserService;

    @Autowired
    ProjectService projectService;

    @Autowired
    ConfigItemService configItemService;

    @Autowired
    UserService userService;

    Cache<String, Long> cache = CacheBuilder.newBuilder().expireAfterWrite(2, TimeUnit.MINUTES).build();

    @GetMapping("notice")
    public R notice() {
        // TODO 新增配置功能
        Long productCnt = cache.getIfPresent("productCnt");
        if (productCnt == null) {
            productCnt = productService.countByExample(ProductExample.newBuilder().build());
            cache.put("productCnt", productCnt);
        }

        Long projectCnt = cache.getIfPresent("projectCnt");
        if (projectCnt == null) {
            projectCnt = projectService.countByExample(ProjectExample.newBuilder()
                    .build()
                    .createCriteria()
                    .andDeletedEqualTo(Deleted.OK.getValue())
                    .toExample()
            );
            cache.put("projectCnt", projectCnt);
        }

        Long configItemCnt = cache.getIfPresent("configItemCnt");
        if (configItemCnt == null) {
            configItemCnt = configItemService.countByExample(ConfigItemExample.newBuilder()
                    .build()
                    .createCriteria()
                    .andDeletedEqualTo(Deleted.OK.getValue())
                    .toExample()
            );
            cache.put("configItemCnt", configItemCnt);
        }

        Long userCnt = cache.getIfPresent("userCnt");
        if (userCnt == null) {
            userCnt = userService.countByExample(UserExample.newBuilder().build());
            cache.put("userCnt", userCnt);
        }
        Map<String, Long> overview = new HashMap<String, Long>();
        overview.put("产品线数", productCnt);
        overview.put("工程数", projectCnt);
        overview.put("配置项数", configItemCnt);
        overview.put("用户数", userCnt);

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

    @PostMapping("count")
    public R<CountVo> notice(@RequestBody List<Long> productIds) {
        Long projectCnt = projectService.countByExample(ProjectExample.newBuilder()
                    .build()
                    .createCriteria()
                    .andDeletedEqualTo(Deleted.OK.getValue())
                    .andProductIdIn(productIds)
                    .toExample()
            );

        Long configItemCnt = configItemService.countByExample(ConfigItemExample.newBuilder()
                    .build()
                    .createCriteria()
                    .andDeletedEqualTo(Deleted.OK.getValue())
                    .andProductIdIn(productIds)
                    .toExample()
            );
        CountVo countVo = new CountVo();
        countVo.setProjectCnt(projectCnt);
        countVo.setConfigCnt(configItemCnt);
        return R.ok(countVo);
    }

}

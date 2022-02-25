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

import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_ID_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_ID_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_NOT_EXISTS_STATUS;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import com.baidu.brcc.domain.em.GrayFlag;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.baidu.brcc.annotation.LoginUser;
import com.baidu.brcc.domain.BrccInstance;
import com.baidu.brcc.domain.BrccInstanceExample;
import com.baidu.brcc.domain.User;
import com.baidu.brcc.domain.Version;
import com.baidu.brcc.domain.base.Pagination;
import com.baidu.brcc.domain.base.R;
import com.baidu.brcc.domain.em.Deleted;
import com.baidu.brcc.domain.em.Flag;
import com.baidu.brcc.domain.meta.MetaVersion;
import com.baidu.brcc.dto.BrccInstanceDto;
import com.baidu.brcc.service.BrccInstanceService;
import com.baidu.brcc.service.VersionService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(path={"console/instance","instance"})
public class BrccInstanceController {

    @Autowired
    private BrccInstanceService brccInstanceService;

    @Autowired
    private VersionService versionService;

    @GetMapping("list")
    public R<List<BrccInstanceDto>> pagination(
            @RequestParam(name = "versionId", required = false) Long versionId,
            @RequestParam(name = "pageNo", required = false, defaultValue = "1")
                    Integer pageNo,
            @RequestParam(name = "pageSize", required = false, defaultValue = "50")
                    Integer pageSize,
            @LoginUser User user
    ) {
        if (versionId == null || versionId <= 0) {
            return R.error(VERSION_ID_NOT_EXISTS_STATUS, VERSION_ID_NOT_EXISTS_MSG);
        }

        Version version = versionService.selectByPrimaryKey(versionId,
                MetaVersion.COLUMN_NAME_ID,
                MetaVersion.COLUMN_NAME_PROJECTID,
                MetaVersion.COLUMN_NAME_NAME,
                MetaVersion.COLUMN_NAME_CHECKSUM
        );

        if (version == null) {
            return R.error(VERSION_NOT_EXISTS_STATUS, VERSION_NOT_EXISTS_MSG);
        }

        AtomicInteger active = new AtomicInteger(0);
        AtomicInteger notActive = new AtomicInteger(0);
        List<BrccInstanceDto> brccInstances = brccInstanceService.selectByExample(BrccInstanceExample.newBuilder()
                        .orderByClause("`id` desc")
                        .build()
                        .createCriteria()
                        .andVersionIdEqualTo(versionId)
                        .toExample(),
                bo -> {
                    BrccInstanceDto dto = BrccInstance.copyFrom(bo, new BrccInstanceDto());
                    if (StringUtils.equals(bo.getCurrentChecksum(), version.getCheckSum())) {
                        dto.setStatus(Flag.TRUE.getValue());
                        active.incrementAndGet();
                    } else {
                        dto.setStatus(Flag.FALSE.getValue());
                        notActive.incrementAndGet();
                    }
                    return dto;

                }
        );

        Map<String, Integer> ext = new HashMap<>();
        ext.put("total", brccInstances == null ? 0 : brccInstances.size());
        ext.put("active", active.get());
        ext.put("notActive", notActive.get());
        return R.ok(brccInstances, ext);
    }

    @PostMapping("delete/{id}")
    public R delete(@PathVariable("id") Long id) {
        int cnt = brccInstanceService.deleteByPrimaryKey(id);
        return R.ok(cnt);
    }

}

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
package com.baidu.brcc.service.impl;

import com.baidu.brcc.dao.GrayRuleMapper;
import com.baidu.brcc.dao.base.BaseMapper;
import com.baidu.brcc.domain.GrayRule;
import com.baidu.brcc.domain.GrayRuleExample;
import com.baidu.brcc.domain.User;
import com.baidu.brcc.domain.Version;
import com.baidu.brcc.domain.VersionExample;
import com.baidu.brcc.domain.em.Deleted;
import com.baidu.brcc.domain.em.GrayFlag;
import com.baidu.brcc.domain.exception.BizException;
import com.baidu.brcc.domain.meta.MetaGrayRule;
import com.baidu.brcc.domain.meta.MetaVersion;
import com.baidu.brcc.domain.vo.GrayRuleReq;
import com.baidu.brcc.service.GrayRuleService;
import com.baidu.brcc.service.VersionService;
import com.baidu.brcc.service.base.GenericServiceImpl;
import com.baidu.brcc.utils.time.DateTimeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;

import static com.baidu.brcc.common.ErrorStatusMsg.GRAY_RULE_EXIST_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.GRAY_RULE_EXIST_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.GRAY_VERSION_ID_NOT_EXIST_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.GRAY_VERSION_ID_NOT_EXIST_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.GRAY_VERSION_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.GRAY_VERSION_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_ID_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_ID_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.VERSION_NOT_EXISTS_STATUS;

@Service("grayRuleService")
public class GrayRuleServiceImpl extends GenericServiceImpl<GrayRule, Long, GrayRuleExample> implements GrayRuleService {
    @Autowired
    private GrayRuleMapper grayRuleMapper;

    @Autowired
    private VersionService versionService;

    @Override
    public BaseMapper<GrayRule, Long, GrayRuleExample> getMapper() {
        return grayRuleMapper;
    }

    @Override
    public GrayRuleExample newExample() {
        return GrayRuleExample.newBuilder().build();
    }

    @Override
    public GrayRuleExample newIdInExample(List<Long> ids) {
        return GrayRuleExample.newBuilder().build().createCriteria().andIdIn(ids).toExample();
    }

    @Transactional
    @Override
    public Long saveGrayRule(Long grayVersionId, GrayRuleReq grayRuleReq, User loginUser) {
        Long id = null;
        Date now = DateTimeUtils.now();
        GrayRule grayRule = selectOneByExample(GrayRuleExample.newBuilder()
                .build()
                .createCriteria()
                .andGrayVersionIdEqualTo(grayVersionId)
                .andRuleIdEqualTo(grayRuleReq.getGrayInfoId())
                .andDeletedEqualTo(Deleted.OK.getValue())
                .toExample()
        );
        if (grayRule == null) {
            // 新增
            GrayRule insert = GrayRule.newBuilder()
                    .grayVersionId(grayVersionId)
                    .ruleId(grayRuleReq.getGrayInfoId())
                    .ruleContent(grayRuleReq.getRuleContent())
                    .deleted(Deleted.OK.getValue())
                    .updateTime(now)
                    .createTime(now)
                    .build();
            insert(insert);
            id = insert.getId();
        } else {
            if (grayRuleReq.getRuleContent().equals("")) {
                grayRule.setDeleted(Deleted.DELETE.getValue());
                grayRule.setUpdateTime(now);
                updateByPrimaryKeySelective(grayRule);
            }else{
            grayRule.setRuleContent(grayRuleReq.getRuleContent());
            grayRule.setUpdateTime(now);
            updateByPrimaryKeySelective(grayRule);
            id = grayRule.getId();
        }
        }
        return id;
    }

    @Override
    public List<GrayRule> selectByGrayVersionId(Long grayVersionId) {
        if (null == grayVersionId || grayVersionId <= 0) {
            throw new BizException(GRAY_VERSION_ID_NOT_EXIST_STATUS, GRAY_VERSION_ID_NOT_EXIST_MSG);
        }
        Version grayVersion = versionService.selectByPrimaryKey(grayVersionId);
        if (grayVersion == null || grayVersion.getDeleted().equals(Deleted.DELETE.getValue())) {
            throw new BizException(GRAY_VERSION_NOT_EXISTS_STATUS, GRAY_VERSION_NOT_EXISTS_MSG);
        }
        List<GrayRule> grayRules = selectByExample(GrayRuleExample.newBuilder()
                        .build()
                        .createCriteria()
                        .andGrayVersionIdEqualTo(grayVersionId)
                        .andDeletedEqualTo(Deleted.OK.getValue())
                        .toExample()
        );
        if (grayRules == null) {
            throw new BizException(VERSION_NOT_EXISTS_STATUS, VERSION_NOT_EXISTS_MSG);
        }
        return grayRules;
    }

}

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
package com.baidu.brcc.dto;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;

import com.baidu.brcc.common.InstanceEventType;
import com.baidu.brcc.domain.BrccInstance;

import lombok.Data;

@Data
public class InstanceInfoEventDto {
    private InstanceEventType eventType;
    private String versionId;
    private String idc;
    private String containerId;
    private String clientIp;
    private String appName;
    private String sdkVersion;
    private String updateCallback;
    private String checkSum;
    private String netCost;
    private String versionName;
    private String envId;

    public BrccInstance toBrccInstance() {
        BrccInstance instance = new BrccInstance();
        if (StringUtils.isNotBlank(versionId)) {
            try {
                instance.setVersionId(Long.parseLong(versionId));
            } catch (Exception ex) {
                instance.setVersionId(null);
            }
        }
        instance.setClientVersion(sdkVersion);
        instance.setIdc(idc);
        instance.setIp(clientIp);
        instance.setCurrentChecksum(checkSum);
        instance.setCurrentChecksumTime(new Date());
        instance.setHeartbeatTime(new Date());
        instance.setContainerId(containerId);
        instance.setAppName(appName);
        if (StringUtils.isNotBlank(updateCallback)) {
            try {
                instance.setEnableUpdateCallback(Byte.parseByte(updateCallback));
            } catch (Exception ex) {
                instance.setEnableUpdateCallback(null);
            }
        }
        if (StringUtils.isNotBlank(netCost)) {
            try {
                instance.setNetCost(Integer.parseInt(netCost));
            } catch (Exception ex) {
                instance.setNetCost(null);
            }
        }
        return instance;
    }

}

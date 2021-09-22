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
package com.baidu.brcc.domain.vo;

import java.util.List;
import java.util.Map;

public class NoticeVo {

    // 概览
    private Map<String, Long> overview;

    // 手册
    private Map<String, String> manual;

    // 值班人
    private Map<String, String> onDuty;

    // 简介
    private List<String> intro;

    public NoticeVo() {

    }

    private NoticeVo(Builder builder) {
        setOverview(builder.overview);
        setManual(builder.manual);
        setOnDuty(builder.onDuty);
        setIntro(builder.intro);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Map<String, Long> getOverview() {
        return overview;
    }

    public void setOverview(Map<String, Long> overview) {
        this.overview = overview;
    }

    public Map<String, String> getManual() {
        return manual;
    }

    public void setManual(Map<String, String> manual) {
        this.manual = manual;
    }

    public Map<String, String> getOnDuty() {
        return onDuty;
    }

    public void setOnDuty(Map<String, String> onDuty) {
        this.onDuty = onDuty;
    }

    public List<String> getIntro() {
        return intro;
    }

    public void setIntro(List<String> intro) {
        this.intro = intro;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("NoticeVo{");
        sb.append("overview=").append(overview);
        sb.append(", manual=").append(manual);
        sb.append(", onDuty=").append(onDuty);
        sb.append(", intro=").append(intro);
        sb.append('}');
        return sb.toString();
    }


    public static final class Builder {
        private Map<String, Long> overview;
        private Map<String, String> manual;
        private Map<String, String> onDuty;
        private List<String> intro;

        private Builder() {
        }

        public Builder overview(Map<String, Long> val) {
            overview = val;
            return this;
        }

        public Builder manual(Map<String, String> val) {
            manual = val;
            return this;
        }

        public Builder onDuty(Map<String, String> val) {
            onDuty = val;
            return this;
        }

        public Builder intro(List<String> val) {
            intro = val;
            return this;
        }

        public NoticeVo build() {
            return new NoticeVo(this);
        }
    }
}

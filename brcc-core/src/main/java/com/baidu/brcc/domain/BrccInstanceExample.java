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
package com.baidu.brcc.domain;

import com.baidu.brcc.domain.base.BaseExample;
import com.baidu.brcc.domain.base.BaseExampleBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class BrccInstanceExample extends BaseExample {

    protected List<Criteria> oredCriteria;

    private BrccInstanceExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * 实例信息
     */
    private BrccInstanceExample(Builder builder) {
        this.start = builder.getStart();
        this.limit = builder.getLimit();
        this.orderByClause = builder.getOrderByClause();
        this.distinct = builder.isDistinct();
        this.columns = builder.getColumns();
        this.oredCriteria = new ArrayList<>();
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria(this);
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {

        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            return andIdEqualTo(value, Boolean.TRUE);
        }

        public Criteria andIdEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            return andIdNotEqualTo(value, Boolean.TRUE);
        }

        public Criteria andIdNotEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            return andIdGreaterThan(value, Boolean.TRUE);
        }

        public Criteria andIdGreaterThan(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            return andIdGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            return andIdLessThan(value, Boolean.TRUE);
        }

        public Criteria andIdLessThan(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            return andIdLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andIdLessThanOrEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(Collection<Long> values, Boolean condition) {
            if (condition == null || !condition) {
                return (Criteria) this;
            }
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(Collection<Long> values, Boolean condition) {
            if (condition == null || !condition) {
                return (Criteria) this;
            }
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(Collection<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(Collection<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdcIsNull() {
            addCriterion("idc is null");
            return (Criteria) this;
        }

        public Criteria andIdcIsNotNull() {
            addCriterion("idc is not null");
            return (Criteria) this;
        }

        public Criteria andIdcEqualTo(String value) {
            return andIdcEqualTo(value, Boolean.TRUE);
        }

        public Criteria andIdcEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("idc =", value, "idc");
            return (Criteria) this;
        }

        public Criteria andIdcNotEqualTo(String value) {
            return andIdcNotEqualTo(value, Boolean.TRUE);
        }

        public Criteria andIdcNotEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("idc <>", value, "idc");
            return (Criteria) this;
        }

        public Criteria andIdcGreaterThan(String value) {
            return andIdcGreaterThan(value, Boolean.TRUE);
        }

        public Criteria andIdcGreaterThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("idc >", value, "idc");
            return (Criteria) this;
        }

        public Criteria andIdcGreaterThanOrEqualTo(String value) {
            return andIdcGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andIdcGreaterThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("idc >=", value, "idc");
            return (Criteria) this;
        }

        public Criteria andIdcLessThan(String value) {
            return andIdcLessThan(value, Boolean.TRUE);
        }

        public Criteria andIdcLessThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("idc <", value, "idc");
            return (Criteria) this;
        }

        public Criteria andIdcLessThanOrEqualTo(String value) {
            return andIdcLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andIdcLessThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("idc <=", value, "idc");
            return (Criteria) this;
        }

        public Criteria andIdcLike(String value) {
            return andIdcLike(value, Boolean.TRUE);
        }

        public Criteria andIdcLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("idc like", value, "idc");
            return (Criteria) this;
        }

        public Criteria andIdcLikeLeft(String value) {
            return andIdcLikeLeft(value, Boolean.TRUE);
        }

        public Criteria andIdcLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            addCriterion("idc like", value, "idc");
            return (Criteria) this;
        }

        public Criteria andIdcLikeRight(String value) {
            return andIdcLikeRight(value, Boolean.TRUE);
        }

        public Criteria andIdcLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("idc like", value, "idc");
            return (Criteria) this;
        }

        public Criteria andIdcLikeBoth(String value) {
            return andIdcLikeBoth(value, Boolean.TRUE);
        }

        public Criteria andIdcLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("idc like", value, "idc");
            return (Criteria) this;
        }

        public Criteria andIdcNotLike(String value) {
            return andIdcNotLike(value, Boolean.TRUE);
        }

        public Criteria andIdcNotLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("idc not like", value, "idc");
            return (Criteria) this;
        }

        public Criteria andIdcNotLikeLeft(String value) {
            return andIdcNotLikeLeft(value, Boolean.TRUE);
        }

        public Criteria andIdcNotLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            addCriterion("idc not like", value, "idc");
            return (Criteria) this;
        }

        public Criteria andIdcNotLikeRight(String value) {
            return andIdcNotLikeRight(value, Boolean.TRUE);
        }

        public Criteria andIdcNotLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("idc not like", value, "idc");
            return (Criteria) this;
        }

        public Criteria andIdcNotLikeBoth(String value) {
            return andIdcNotLikeBoth(value, Boolean.TRUE);
        }

        public Criteria andIdcNotLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("idc not like", value, "idc");
            return (Criteria) this;
        }

        public Criteria andIdcIn(Collection<String> values, Boolean condition) {
            if (condition == null || !condition) {
                return (Criteria) this;
            }
            addCriterion("idc in", values, "idc");
            return (Criteria) this;
        }

        public Criteria andIdcNotIn(Collection<String> values, Boolean condition) {
            if (condition == null || !condition) {
                return (Criteria) this;
            }
            addCriterion("idc not in", values, "idc");
            return (Criteria) this;
        }

        public Criteria andIdcIn(Collection<String> values) {
            addCriterion("idc in", values, "idc");
            return (Criteria) this;
        }

        public Criteria andIdcNotIn(Collection<String> values) {
            addCriterion("idc not in", values, "idc");
            return (Criteria) this;
        }

        public Criteria andIdcBetween(String value1, String value2) {
            addCriterion("idc between", value1, value2, "idc");
            return (Criteria) this;
        }

        public Criteria andIdcNotBetween(String value1, String value2) {
            addCriterion("idc not between", value1, value2, "idc");
            return (Criteria) this;
        }

        public Criteria andContainerIdIsNull() {
            addCriterion("container_id is null");
            return (Criteria) this;
        }

        public Criteria andContainerIdIsNotNull() {
            addCriterion("container_id is not null");
            return (Criteria) this;
        }

        public Criteria andContainerIdEqualTo(String value) {
            return andContainerIdEqualTo(value, Boolean.TRUE);
        }

        public Criteria andContainerIdEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("container_id =", value, "containerId");
            return (Criteria) this;
        }

        public Criteria andContainerIdNotEqualTo(String value) {
            return andContainerIdNotEqualTo(value, Boolean.TRUE);
        }

        public Criteria andContainerIdNotEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("container_id <>", value, "containerId");
            return (Criteria) this;
        }

        public Criteria andContainerIdGreaterThan(String value) {
            return andContainerIdGreaterThan(value, Boolean.TRUE);
        }

        public Criteria andContainerIdGreaterThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("container_id >", value, "containerId");
            return (Criteria) this;
        }

        public Criteria andContainerIdGreaterThanOrEqualTo(String value) {
            return andContainerIdGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andContainerIdGreaterThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("container_id >=", value, "containerId");
            return (Criteria) this;
        }

        public Criteria andContainerIdLessThan(String value) {
            return andContainerIdLessThan(value, Boolean.TRUE);
        }

        public Criteria andContainerIdLessThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("container_id <", value, "containerId");
            return (Criteria) this;
        }

        public Criteria andContainerIdLessThanOrEqualTo(String value) {
            return andContainerIdLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andContainerIdLessThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("container_id <=", value, "containerId");
            return (Criteria) this;
        }

        public Criteria andContainerIdLike(String value) {
            return andContainerIdLike(value, Boolean.TRUE);
        }

        public Criteria andContainerIdLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("container_id like", value, "containerId");
            return (Criteria) this;
        }

        public Criteria andContainerIdLikeLeft(String value) {
            return andContainerIdLikeLeft(value, Boolean.TRUE);
        }

        public Criteria andContainerIdLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            addCriterion("container_id like", value, "containerId");
            return (Criteria) this;
        }

        public Criteria andContainerIdLikeRight(String value) {
            return andContainerIdLikeRight(value, Boolean.TRUE);
        }

        public Criteria andContainerIdLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("container_id like", value, "containerId");
            return (Criteria) this;
        }

        public Criteria andContainerIdLikeBoth(String value) {
            return andContainerIdLikeBoth(value, Boolean.TRUE);
        }

        public Criteria andContainerIdLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("container_id like", value, "containerId");
            return (Criteria) this;
        }

        public Criteria andContainerIdNotLike(String value) {
            return andContainerIdNotLike(value, Boolean.TRUE);
        }

        public Criteria andContainerIdNotLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("container_id not like", value, "containerId");
            return (Criteria) this;
        }

        public Criteria andContainerIdNotLikeLeft(String value) {
            return andContainerIdNotLikeLeft(value, Boolean.TRUE);
        }

        public Criteria andContainerIdNotLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            addCriterion("container_id not like", value, "containerId");
            return (Criteria) this;
        }

        public Criteria andContainerIdNotLikeRight(String value) {
            return andContainerIdNotLikeRight(value, Boolean.TRUE);
        }

        public Criteria andContainerIdNotLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("container_id not like", value, "containerId");
            return (Criteria) this;
        }

        public Criteria andContainerIdNotLikeBoth(String value) {
            return andContainerIdNotLikeBoth(value, Boolean.TRUE);
        }

        public Criteria andContainerIdNotLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("container_id not like", value, "containerId");
            return (Criteria) this;
        }

        public Criteria andContainerIdIn(Collection<String> values, Boolean condition) {
            if (condition == null || !condition) {
                return (Criteria) this;
            }
            addCriterion("container_id in", values, "containerId");
            return (Criteria) this;
        }

        public Criteria andContainerIdNotIn(Collection<String> values, Boolean condition) {
            if (condition == null || !condition) {
                return (Criteria) this;
            }
            addCriterion("container_id not in", values, "containerId");
            return (Criteria) this;
        }

        public Criteria andContainerIdIn(Collection<String> values) {
            addCriterion("container_id in", values, "containerId");
            return (Criteria) this;
        }

        public Criteria andContainerIdNotIn(Collection<String> values) {
            addCriterion("container_id not in", values, "containerId");
            return (Criteria) this;
        }

        public Criteria andContainerIdBetween(String value1, String value2) {
            addCriterion("container_id between", value1, value2, "containerId");
            return (Criteria) this;
        }

        public Criteria andContainerIdNotBetween(String value1, String value2) {
            addCriterion("container_id not between", value1, value2, "containerId");
            return (Criteria) this;
        }

        public Criteria andAppNameIsNull() {
            addCriterion("app_name is null");
            return (Criteria) this;
        }

        public Criteria andAppNameIsNotNull() {
            addCriterion("app_name is not null");
            return (Criteria) this;
        }

        public Criteria andAppNameEqualTo(String value) {
            return andAppNameEqualTo(value, Boolean.TRUE);
        }

        public Criteria andAppNameEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("app_name =", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotEqualTo(String value) {
            return andAppNameNotEqualTo(value, Boolean.TRUE);
        }

        public Criteria andAppNameNotEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("app_name <>", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameGreaterThan(String value) {
            return andAppNameGreaterThan(value, Boolean.TRUE);
        }

        public Criteria andAppNameGreaterThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("app_name >", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameGreaterThanOrEqualTo(String value) {
            return andAppNameGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andAppNameGreaterThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("app_name >=", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLessThan(String value) {
            return andAppNameLessThan(value, Boolean.TRUE);
        }

        public Criteria andAppNameLessThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("app_name <", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLessThanOrEqualTo(String value) {
            return andAppNameLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andAppNameLessThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("app_name <=", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLike(String value) {
            return andAppNameLike(value, Boolean.TRUE);
        }

        public Criteria andAppNameLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("app_name like", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLikeLeft(String value) {
            return andAppNameLikeLeft(value, Boolean.TRUE);
        }

        public Criteria andAppNameLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            addCriterion("app_name like", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLikeRight(String value) {
            return andAppNameLikeRight(value, Boolean.TRUE);
        }

        public Criteria andAppNameLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("app_name like", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLikeBoth(String value) {
            return andAppNameLikeBoth(value, Boolean.TRUE);
        }

        public Criteria andAppNameLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("app_name like", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotLike(String value) {
            return andAppNameNotLike(value, Boolean.TRUE);
        }

        public Criteria andAppNameNotLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("app_name not like", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotLikeLeft(String value) {
            return andAppNameNotLikeLeft(value, Boolean.TRUE);
        }

        public Criteria andAppNameNotLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            addCriterion("app_name not like", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotLikeRight(String value) {
            return andAppNameNotLikeRight(value, Boolean.TRUE);
        }

        public Criteria andAppNameNotLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("app_name not like", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotLikeBoth(String value) {
            return andAppNameNotLikeBoth(value, Boolean.TRUE);
        }

        public Criteria andAppNameNotLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("app_name not like", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameIn(Collection<String> values, Boolean condition) {
            if (condition == null || !condition) {
                return (Criteria) this;
            }
            addCriterion("app_name in", values, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotIn(Collection<String> values, Boolean condition) {
            if (condition == null || !condition) {
                return (Criteria) this;
            }
            addCriterion("app_name not in", values, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameIn(Collection<String> values) {
            addCriterion("app_name in", values, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotIn(Collection<String> values) {
            addCriterion("app_name not in", values, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameBetween(String value1, String value2) {
            addCriterion("app_name between", value1, value2, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotBetween(String value1, String value2) {
            addCriterion("app_name not between", value1, value2, "appName");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("ip is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("ip is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            return andIpEqualTo(value, Boolean.TRUE);
        }

        public Criteria andIpEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("ip =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            return andIpNotEqualTo(value, Boolean.TRUE);
        }

        public Criteria andIpNotEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("ip <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            return andIpGreaterThan(value, Boolean.TRUE);
        }

        public Criteria andIpGreaterThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("ip >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            return andIpGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andIpGreaterThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("ip >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            return andIpLessThan(value, Boolean.TRUE);
        }

        public Criteria andIpLessThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("ip <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            return andIpLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andIpLessThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("ip <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            return andIpLike(value, Boolean.TRUE);
        }

        public Criteria andIpLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("ip like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLikeLeft(String value) {
            return andIpLikeLeft(value, Boolean.TRUE);
        }

        public Criteria andIpLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            addCriterion("ip like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLikeRight(String value) {
            return andIpLikeRight(value, Boolean.TRUE);
        }

        public Criteria andIpLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("ip like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLikeBoth(String value) {
            return andIpLikeBoth(value, Boolean.TRUE);
        }

        public Criteria andIpLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("ip like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            return andIpNotLike(value, Boolean.TRUE);
        }

        public Criteria andIpNotLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("ip not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLikeLeft(String value) {
            return andIpNotLikeLeft(value, Boolean.TRUE);
        }

        public Criteria andIpNotLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            addCriterion("ip not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLikeRight(String value) {
            return andIpNotLikeRight(value, Boolean.TRUE);
        }

        public Criteria andIpNotLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("ip not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLikeBoth(String value) {
            return andIpNotLikeBoth(value, Boolean.TRUE);
        }

        public Criteria andIpNotLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("ip not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(Collection<String> values, Boolean condition) {
            if (condition == null || !condition) {
                return (Criteria) this;
            }
            addCriterion("ip in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(Collection<String> values, Boolean condition) {
            if (condition == null || !condition) {
                return (Criteria) this;
            }
            addCriterion("ip not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(Collection<String> values) {
            addCriterion("ip in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(Collection<String> values) {
            addCriterion("ip not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("ip between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("ip not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andClientVersionIsNull() {
            addCriterion("client_version is null");
            return (Criteria) this;
        }

        public Criteria andClientVersionIsNotNull() {
            addCriterion("client_version is not null");
            return (Criteria) this;
        }

        public Criteria andClientVersionEqualTo(String value) {
            return andClientVersionEqualTo(value, Boolean.TRUE);
        }

        public Criteria andClientVersionEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("client_version =", value, "clientVersion");
            return (Criteria) this;
        }

        public Criteria andClientVersionNotEqualTo(String value) {
            return andClientVersionNotEqualTo(value, Boolean.TRUE);
        }

        public Criteria andClientVersionNotEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("client_version <>", value, "clientVersion");
            return (Criteria) this;
        }

        public Criteria andClientVersionGreaterThan(String value) {
            return andClientVersionGreaterThan(value, Boolean.TRUE);
        }

        public Criteria andClientVersionGreaterThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("client_version >", value, "clientVersion");
            return (Criteria) this;
        }

        public Criteria andClientVersionGreaterThanOrEqualTo(String value) {
            return andClientVersionGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andClientVersionGreaterThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("client_version >=", value, "clientVersion");
            return (Criteria) this;
        }

        public Criteria andClientVersionLessThan(String value) {
            return andClientVersionLessThan(value, Boolean.TRUE);
        }

        public Criteria andClientVersionLessThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("client_version <", value, "clientVersion");
            return (Criteria) this;
        }

        public Criteria andClientVersionLessThanOrEqualTo(String value) {
            return andClientVersionLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andClientVersionLessThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("client_version <=", value, "clientVersion");
            return (Criteria) this;
        }

        public Criteria andClientVersionLike(String value) {
            return andClientVersionLike(value, Boolean.TRUE);
        }

        public Criteria andClientVersionLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("client_version like", value, "clientVersion");
            return (Criteria) this;
        }

        public Criteria andClientVersionLikeLeft(String value) {
            return andClientVersionLikeLeft(value, Boolean.TRUE);
        }

        public Criteria andClientVersionLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            addCriterion("client_version like", value, "clientVersion");
            return (Criteria) this;
        }

        public Criteria andClientVersionLikeRight(String value) {
            return andClientVersionLikeRight(value, Boolean.TRUE);
        }

        public Criteria andClientVersionLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("client_version like", value, "clientVersion");
            return (Criteria) this;
        }

        public Criteria andClientVersionLikeBoth(String value) {
            return andClientVersionLikeBoth(value, Boolean.TRUE);
        }

        public Criteria andClientVersionLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("client_version like", value, "clientVersion");
            return (Criteria) this;
        }

        public Criteria andClientVersionNotLike(String value) {
            return andClientVersionNotLike(value, Boolean.TRUE);
        }

        public Criteria andClientVersionNotLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("client_version not like", value, "clientVersion");
            return (Criteria) this;
        }

        public Criteria andClientVersionNotLikeLeft(String value) {
            return andClientVersionNotLikeLeft(value, Boolean.TRUE);
        }

        public Criteria andClientVersionNotLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            addCriterion("client_version not like", value, "clientVersion");
            return (Criteria) this;
        }

        public Criteria andClientVersionNotLikeRight(String value) {
            return andClientVersionNotLikeRight(value, Boolean.TRUE);
        }

        public Criteria andClientVersionNotLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("client_version not like", value, "clientVersion");
            return (Criteria) this;
        }

        public Criteria andClientVersionNotLikeBoth(String value) {
            return andClientVersionNotLikeBoth(value, Boolean.TRUE);
        }

        public Criteria andClientVersionNotLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("client_version not like", value, "clientVersion");
            return (Criteria) this;
        }

        public Criteria andClientVersionIn(Collection<String> values, Boolean condition) {
            if (condition == null || !condition) {
                return (Criteria) this;
            }
            addCriterion("client_version in", values, "clientVersion");
            return (Criteria) this;
        }

        public Criteria andClientVersionNotIn(Collection<String> values, Boolean condition) {
            if (condition == null || !condition) {
                return (Criteria) this;
            }
            addCriterion("client_version not in", values, "clientVersion");
            return (Criteria) this;
        }

        public Criteria andClientVersionIn(Collection<String> values) {
            addCriterion("client_version in", values, "clientVersion");
            return (Criteria) this;
        }

        public Criteria andClientVersionNotIn(Collection<String> values) {
            addCriterion("client_version not in", values, "clientVersion");
            return (Criteria) this;
        }

        public Criteria andClientVersionBetween(String value1, String value2) {
            addCriterion("client_version between", value1, value2, "clientVersion");
            return (Criteria) this;
        }

        public Criteria andClientVersionNotBetween(String value1, String value2) {
            addCriterion("client_version not between", value1, value2, "clientVersion");
            return (Criteria) this;
        }

        public Criteria andEnableUpdateCallbackIsNull() {
            addCriterion("enable_update_callback is null");
            return (Criteria) this;
        }

        public Criteria andEnableUpdateCallbackIsNotNull() {
            addCriterion("enable_update_callback is not null");
            return (Criteria) this;
        }

        public Criteria andEnableUpdateCallbackEqualTo(Byte value) {
            return andEnableUpdateCallbackEqualTo(value, Boolean.TRUE);
        }

        public Criteria andEnableUpdateCallbackEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("enable_update_callback =", value, "enableUpdateCallback");
            return (Criteria) this;
        }

        public Criteria andEnableUpdateCallbackNotEqualTo(Byte value) {
            return andEnableUpdateCallbackNotEqualTo(value, Boolean.TRUE);
        }

        public Criteria andEnableUpdateCallbackNotEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("enable_update_callback <>", value, "enableUpdateCallback");
            return (Criteria) this;
        }

        public Criteria andEnableUpdateCallbackGreaterThan(Byte value) {
            return andEnableUpdateCallbackGreaterThan(value, Boolean.TRUE);
        }

        public Criteria andEnableUpdateCallbackGreaterThan(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("enable_update_callback >", value, "enableUpdateCallback");
            return (Criteria) this;
        }

        public Criteria andEnableUpdateCallbackGreaterThanOrEqualTo(Byte value) {
            return andEnableUpdateCallbackGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andEnableUpdateCallbackGreaterThanOrEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("enable_update_callback >=", value, "enableUpdateCallback");
            return (Criteria) this;
        }

        public Criteria andEnableUpdateCallbackLessThan(Byte value) {
            return andEnableUpdateCallbackLessThan(value, Boolean.TRUE);
        }

        public Criteria andEnableUpdateCallbackLessThan(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("enable_update_callback <", value, "enableUpdateCallback");
            return (Criteria) this;
        }

        public Criteria andEnableUpdateCallbackLessThanOrEqualTo(Byte value) {
            return andEnableUpdateCallbackLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andEnableUpdateCallbackLessThanOrEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("enable_update_callback <=", value, "enableUpdateCallback");
            return (Criteria) this;
        }

        public Criteria andEnableUpdateCallbackIn(Collection<Byte> values, Boolean condition) {
            if (condition == null || !condition) {
                return (Criteria) this;
            }
            addCriterion("enable_update_callback in", values, "enableUpdateCallback");
            return (Criteria) this;
        }

        public Criteria andEnableUpdateCallbackNotIn(Collection<Byte> values, Boolean condition) {
            if (condition == null || !condition) {
                return (Criteria) this;
            }
            addCriterion("enable_update_callback not in", values, "enableUpdateCallback");
            return (Criteria) this;
        }

        public Criteria andEnableUpdateCallbackIn(Collection<Byte> values) {
            addCriterion("enable_update_callback in", values, "enableUpdateCallback");
            return (Criteria) this;
        }

        public Criteria andEnableUpdateCallbackNotIn(Collection<Byte> values) {
            addCriterion("enable_update_callback not in", values, "enableUpdateCallback");
            return (Criteria) this;
        }

        public Criteria andEnableUpdateCallbackBetween(Byte value1, Byte value2) {
            addCriterion("enable_update_callback between", value1, value2, "enableUpdateCallback");
            return (Criteria) this;
        }

        public Criteria andEnableUpdateCallbackNotBetween(Byte value1, Byte value2) {
            addCriterion("enable_update_callback not between", value1, value2, "enableUpdateCallback");
            return (Criteria) this;
        }

        public Criteria andLastChecksumIsNull() {
            addCriterion("last_checksum is null");
            return (Criteria) this;
        }

        public Criteria andLastChecksumIsNotNull() {
            addCriterion("last_checksum is not null");
            return (Criteria) this;
        }

        public Criteria andLastChecksumEqualTo(String value) {
            return andLastChecksumEqualTo(value, Boolean.TRUE);
        }

        public Criteria andLastChecksumEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("last_checksum =", value, "lastChecksum");
            return (Criteria) this;
        }

        public Criteria andLastChecksumNotEqualTo(String value) {
            return andLastChecksumNotEqualTo(value, Boolean.TRUE);
        }

        public Criteria andLastChecksumNotEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("last_checksum <>", value, "lastChecksum");
            return (Criteria) this;
        }

        public Criteria andLastChecksumGreaterThan(String value) {
            return andLastChecksumGreaterThan(value, Boolean.TRUE);
        }

        public Criteria andLastChecksumGreaterThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("last_checksum >", value, "lastChecksum");
            return (Criteria) this;
        }

        public Criteria andLastChecksumGreaterThanOrEqualTo(String value) {
            return andLastChecksumGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andLastChecksumGreaterThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("last_checksum >=", value, "lastChecksum");
            return (Criteria) this;
        }

        public Criteria andLastChecksumLessThan(String value) {
            return andLastChecksumLessThan(value, Boolean.TRUE);
        }

        public Criteria andLastChecksumLessThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("last_checksum <", value, "lastChecksum");
            return (Criteria) this;
        }

        public Criteria andLastChecksumLessThanOrEqualTo(String value) {
            return andLastChecksumLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andLastChecksumLessThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("last_checksum <=", value, "lastChecksum");
            return (Criteria) this;
        }

        public Criteria andLastChecksumLike(String value) {
            return andLastChecksumLike(value, Boolean.TRUE);
        }

        public Criteria andLastChecksumLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("last_checksum like", value, "lastChecksum");
            return (Criteria) this;
        }

        public Criteria andLastChecksumLikeLeft(String value) {
            return andLastChecksumLikeLeft(value, Boolean.TRUE);
        }

        public Criteria andLastChecksumLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            addCriterion("last_checksum like", value, "lastChecksum");
            return (Criteria) this;
        }

        public Criteria andLastChecksumLikeRight(String value) {
            return andLastChecksumLikeRight(value, Boolean.TRUE);
        }

        public Criteria andLastChecksumLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("last_checksum like", value, "lastChecksum");
            return (Criteria) this;
        }

        public Criteria andLastChecksumLikeBoth(String value) {
            return andLastChecksumLikeBoth(value, Boolean.TRUE);
        }

        public Criteria andLastChecksumLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("last_checksum like", value, "lastChecksum");
            return (Criteria) this;
        }

        public Criteria andLastChecksumNotLike(String value) {
            return andLastChecksumNotLike(value, Boolean.TRUE);
        }

        public Criteria andLastChecksumNotLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("last_checksum not like", value, "lastChecksum");
            return (Criteria) this;
        }

        public Criteria andLastChecksumNotLikeLeft(String value) {
            return andLastChecksumNotLikeLeft(value, Boolean.TRUE);
        }

        public Criteria andLastChecksumNotLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            addCriterion("last_checksum not like", value, "lastChecksum");
            return (Criteria) this;
        }

        public Criteria andLastChecksumNotLikeRight(String value) {
            return andLastChecksumNotLikeRight(value, Boolean.TRUE);
        }

        public Criteria andLastChecksumNotLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("last_checksum not like", value, "lastChecksum");
            return (Criteria) this;
        }

        public Criteria andLastChecksumNotLikeBoth(String value) {
            return andLastChecksumNotLikeBoth(value, Boolean.TRUE);
        }

        public Criteria andLastChecksumNotLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("last_checksum not like", value, "lastChecksum");
            return (Criteria) this;
        }

        public Criteria andLastChecksumIn(Collection<String> values, Boolean condition) {
            if (condition == null || !condition) {
                return (Criteria) this;
            }
            addCriterion("last_checksum in", values, "lastChecksum");
            return (Criteria) this;
        }

        public Criteria andLastChecksumNotIn(Collection<String> values, Boolean condition) {
            if (condition == null || !condition) {
                return (Criteria) this;
            }
            addCriterion("last_checksum not in", values, "lastChecksum");
            return (Criteria) this;
        }

        public Criteria andLastChecksumIn(Collection<String> values) {
            addCriterion("last_checksum in", values, "lastChecksum");
            return (Criteria) this;
        }

        public Criteria andLastChecksumNotIn(Collection<String> values) {
            addCriterion("last_checksum not in", values, "lastChecksum");
            return (Criteria) this;
        }

        public Criteria andLastChecksumBetween(String value1, String value2) {
            addCriterion("last_checksum between", value1, value2, "lastChecksum");
            return (Criteria) this;
        }

        public Criteria andLastChecksumNotBetween(String value1, String value2) {
            addCriterion("last_checksum not between", value1, value2, "lastChecksum");
            return (Criteria) this;
        }

        public Criteria andLastChecksumTimeIsNull() {
            addCriterion("last_checksum_time is null");
            return (Criteria) this;
        }

        public Criteria andLastChecksumTimeIsNotNull() {
            addCriterion("last_checksum_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastChecksumTimeEqualTo(Date value) {
            return andLastChecksumTimeEqualTo(value, Boolean.TRUE);
        }

        public Criteria andLastChecksumTimeEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("last_checksum_time =", value, "lastChecksumTime");
            return (Criteria) this;
        }

        public Criteria andLastChecksumTimeNotEqualTo(Date value) {
            return andLastChecksumTimeNotEqualTo(value, Boolean.TRUE);
        }

        public Criteria andLastChecksumTimeNotEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("last_checksum_time <>", value, "lastChecksumTime");
            return (Criteria) this;
        }

        public Criteria andLastChecksumTimeGreaterThan(Date value) {
            return andLastChecksumTimeGreaterThan(value, Boolean.TRUE);
        }

        public Criteria andLastChecksumTimeGreaterThan(Date value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("last_checksum_time >", value, "lastChecksumTime");
            return (Criteria) this;
        }

        public Criteria andLastChecksumTimeGreaterThanOrEqualTo(Date value) {
            return andLastChecksumTimeGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andLastChecksumTimeGreaterThanOrEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("last_checksum_time >=", value, "lastChecksumTime");
            return (Criteria) this;
        }

        public Criteria andLastChecksumTimeLessThan(Date value) {
            return andLastChecksumTimeLessThan(value, Boolean.TRUE);
        }

        public Criteria andLastChecksumTimeLessThan(Date value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("last_checksum_time <", value, "lastChecksumTime");
            return (Criteria) this;
        }

        public Criteria andLastChecksumTimeLessThanOrEqualTo(Date value) {
            return andLastChecksumTimeLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andLastChecksumTimeLessThanOrEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("last_checksum_time <=", value, "lastChecksumTime");
            return (Criteria) this;
        }

        public Criteria andLastChecksumTimeIn(Collection<Date> values, Boolean condition) {
            if (condition == null || !condition) {
                return (Criteria) this;
            }
            addCriterion("last_checksum_time in", values, "lastChecksumTime");
            return (Criteria) this;
        }

        public Criteria andLastChecksumTimeNotIn(Collection<Date> values, Boolean condition) {
            if (condition == null || !condition) {
                return (Criteria) this;
            }
            addCriterion("last_checksum_time not in", values, "lastChecksumTime");
            return (Criteria) this;
        }

        public Criteria andLastChecksumTimeIn(Collection<Date> values) {
            addCriterion("last_checksum_time in", values, "lastChecksumTime");
            return (Criteria) this;
        }

        public Criteria andLastChecksumTimeNotIn(Collection<Date> values) {
            addCriterion("last_checksum_time not in", values, "lastChecksumTime");
            return (Criteria) this;
        }

        public Criteria andLastChecksumTimeBetween(Date value1, Date value2) {
            addCriterion("last_checksum_time between", value1, value2, "lastChecksumTime");
            return (Criteria) this;
        }

        public Criteria andLastChecksumTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_checksum_time not between", value1, value2, "lastChecksumTime");
            return (Criteria) this;
        }

        public Criteria andCurrentChecksumIsNull() {
            addCriterion("current_checksum is null");
            return (Criteria) this;
        }

        public Criteria andCurrentChecksumIsNotNull() {
            addCriterion("current_checksum is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentChecksumEqualTo(String value) {
            return andCurrentChecksumEqualTo(value, Boolean.TRUE);
        }

        public Criteria andCurrentChecksumEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("current_checksum =", value, "currentChecksum");
            return (Criteria) this;
        }

        public Criteria andCurrentChecksumNotEqualTo(String value) {
            return andCurrentChecksumNotEqualTo(value, Boolean.TRUE);
        }

        public Criteria andCurrentChecksumNotEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("current_checksum <>", value, "currentChecksum");
            return (Criteria) this;
        }

        public Criteria andCurrentChecksumGreaterThan(String value) {
            return andCurrentChecksumGreaterThan(value, Boolean.TRUE);
        }

        public Criteria andCurrentChecksumGreaterThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("current_checksum >", value, "currentChecksum");
            return (Criteria) this;
        }

        public Criteria andCurrentChecksumGreaterThanOrEqualTo(String value) {
            return andCurrentChecksumGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andCurrentChecksumGreaterThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("current_checksum >=", value, "currentChecksum");
            return (Criteria) this;
        }

        public Criteria andCurrentChecksumLessThan(String value) {
            return andCurrentChecksumLessThan(value, Boolean.TRUE);
        }

        public Criteria andCurrentChecksumLessThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("current_checksum <", value, "currentChecksum");
            return (Criteria) this;
        }

        public Criteria andCurrentChecksumLessThanOrEqualTo(String value) {
            return andCurrentChecksumLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andCurrentChecksumLessThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("current_checksum <=", value, "currentChecksum");
            return (Criteria) this;
        }

        public Criteria andCurrentChecksumLike(String value) {
            return andCurrentChecksumLike(value, Boolean.TRUE);
        }

        public Criteria andCurrentChecksumLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("current_checksum like", value, "currentChecksum");
            return (Criteria) this;
        }

        public Criteria andCurrentChecksumLikeLeft(String value) {
            return andCurrentChecksumLikeLeft(value, Boolean.TRUE);
        }

        public Criteria andCurrentChecksumLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            addCriterion("current_checksum like", value, "currentChecksum");
            return (Criteria) this;
        }

        public Criteria andCurrentChecksumLikeRight(String value) {
            return andCurrentChecksumLikeRight(value, Boolean.TRUE);
        }

        public Criteria andCurrentChecksumLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("current_checksum like", value, "currentChecksum");
            return (Criteria) this;
        }

        public Criteria andCurrentChecksumLikeBoth(String value) {
            return andCurrentChecksumLikeBoth(value, Boolean.TRUE);
        }

        public Criteria andCurrentChecksumLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("current_checksum like", value, "currentChecksum");
            return (Criteria) this;
        }

        public Criteria andCurrentChecksumNotLike(String value) {
            return andCurrentChecksumNotLike(value, Boolean.TRUE);
        }

        public Criteria andCurrentChecksumNotLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("current_checksum not like", value, "currentChecksum");
            return (Criteria) this;
        }

        public Criteria andCurrentChecksumNotLikeLeft(String value) {
            return andCurrentChecksumNotLikeLeft(value, Boolean.TRUE);
        }

        public Criteria andCurrentChecksumNotLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            addCriterion("current_checksum not like", value, "currentChecksum");
            return (Criteria) this;
        }

        public Criteria andCurrentChecksumNotLikeRight(String value) {
            return andCurrentChecksumNotLikeRight(value, Boolean.TRUE);
        }

        public Criteria andCurrentChecksumNotLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("current_checksum not like", value, "currentChecksum");
            return (Criteria) this;
        }

        public Criteria andCurrentChecksumNotLikeBoth(String value) {
            return andCurrentChecksumNotLikeBoth(value, Boolean.TRUE);
        }

        public Criteria andCurrentChecksumNotLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("current_checksum not like", value, "currentChecksum");
            return (Criteria) this;
        }

        public Criteria andCurrentChecksumIn(Collection<String> values, Boolean condition) {
            if (condition == null || !condition) {
                return (Criteria) this;
            }
            addCriterion("current_checksum in", values, "currentChecksum");
            return (Criteria) this;
        }

        public Criteria andCurrentChecksumNotIn(Collection<String> values, Boolean condition) {
            if (condition == null || !condition) {
                return (Criteria) this;
            }
            addCriterion("current_checksum not in", values, "currentChecksum");
            return (Criteria) this;
        }

        public Criteria andCurrentChecksumIn(Collection<String> values) {
            addCriterion("current_checksum in", values, "currentChecksum");
            return (Criteria) this;
        }

        public Criteria andCurrentChecksumNotIn(Collection<String> values) {
            addCriterion("current_checksum not in", values, "currentChecksum");
            return (Criteria) this;
        }

        public Criteria andCurrentChecksumBetween(String value1, String value2) {
            addCriterion("current_checksum between", value1, value2, "currentChecksum");
            return (Criteria) this;
        }

        public Criteria andCurrentChecksumNotBetween(String value1, String value2) {
            addCriterion("current_checksum not between", value1, value2, "currentChecksum");
            return (Criteria) this;
        }

        public Criteria andCurrentChecksumTimeIsNull() {
            addCriterion("current_checksum_time is null");
            return (Criteria) this;
        }

        public Criteria andCurrentChecksumTimeIsNotNull() {
            addCriterion("current_checksum_time is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentChecksumTimeEqualTo(Date value) {
            return andCurrentChecksumTimeEqualTo(value, Boolean.TRUE);
        }

        public Criteria andCurrentChecksumTimeEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("current_checksum_time =", value, "currentChecksumTime");
            return (Criteria) this;
        }

        public Criteria andCurrentChecksumTimeNotEqualTo(Date value) {
            return andCurrentChecksumTimeNotEqualTo(value, Boolean.TRUE);
        }

        public Criteria andCurrentChecksumTimeNotEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("current_checksum_time <>", value, "currentChecksumTime");
            return (Criteria) this;
        }

        public Criteria andCurrentChecksumTimeGreaterThan(Date value) {
            return andCurrentChecksumTimeGreaterThan(value, Boolean.TRUE);
        }

        public Criteria andCurrentChecksumTimeGreaterThan(Date value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("current_checksum_time >", value, "currentChecksumTime");
            return (Criteria) this;
        }

        public Criteria andCurrentChecksumTimeGreaterThanOrEqualTo(Date value) {
            return andCurrentChecksumTimeGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andCurrentChecksumTimeGreaterThanOrEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("current_checksum_time >=", value, "currentChecksumTime");
            return (Criteria) this;
        }

        public Criteria andCurrentChecksumTimeLessThan(Date value) {
            return andCurrentChecksumTimeLessThan(value, Boolean.TRUE);
        }

        public Criteria andCurrentChecksumTimeLessThan(Date value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("current_checksum_time <", value, "currentChecksumTime");
            return (Criteria) this;
        }

        public Criteria andCurrentChecksumTimeLessThanOrEqualTo(Date value) {
            return andCurrentChecksumTimeLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andCurrentChecksumTimeLessThanOrEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("current_checksum_time <=", value, "currentChecksumTime");
            return (Criteria) this;
        }

        public Criteria andCurrentChecksumTimeIn(Collection<Date> values, Boolean condition) {
            if (condition == null || !condition) {
                return (Criteria) this;
            }
            addCriterion("current_checksum_time in", values, "currentChecksumTime");
            return (Criteria) this;
        }

        public Criteria andCurrentChecksumTimeNotIn(Collection<Date> values, Boolean condition) {
            if (condition == null || !condition) {
                return (Criteria) this;
            }
            addCriterion("current_checksum_time not in", values, "currentChecksumTime");
            return (Criteria) this;
        }

        public Criteria andCurrentChecksumTimeIn(Collection<Date> values) {
            addCriterion("current_checksum_time in", values, "currentChecksumTime");
            return (Criteria) this;
        }

        public Criteria andCurrentChecksumTimeNotIn(Collection<Date> values) {
            addCriterion("current_checksum_time not in", values, "currentChecksumTime");
            return (Criteria) this;
        }

        public Criteria andCurrentChecksumTimeBetween(Date value1, Date value2) {
            addCriterion("current_checksum_time between", value1, value2, "currentChecksumTime");
            return (Criteria) this;
        }

        public Criteria andCurrentChecksumTimeNotBetween(Date value1, Date value2) {
            addCriterion("current_checksum_time not between", value1, value2, "currentChecksumTime");
            return (Criteria) this;
        }

        public Criteria andVersionIdIsNull() {
            addCriterion("version_id is null");
            return (Criteria) this;
        }

        public Criteria andVersionIdIsNotNull() {
            addCriterion("version_id is not null");
            return (Criteria) this;
        }

        public Criteria andVersionIdEqualTo(Long value) {
            return andVersionIdEqualTo(value, Boolean.TRUE);
        }

        public Criteria andVersionIdEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("version_id =", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andGrayVersionIdEqualTo(Long value) {
            return andGrayVersionIdEqualTo(value, Boolean.TRUE);
        }

        public Criteria andGrayVersionIdEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("gray_version_id =", value, "GrayVersionId");
            return (Criteria) this;
        }

        public Criteria andGrayFlagEqualTo(Byte value) {
            return andGrayFlagEqualTo(value, Boolean.TRUE);
        }

        public Criteria andGrayFlagEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("gray_flag =", value, "GrayFlag");
            return (Criteria) this;
        }

        public Criteria andVersionIdNotEqualTo(Long value) {
            return andVersionIdNotEqualTo(value, Boolean.TRUE);
        }

        public Criteria andVersionIdNotEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("version_id <>", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdGreaterThan(Long value) {
            return andVersionIdGreaterThan(value, Boolean.TRUE);
        }

        public Criteria andVersionIdGreaterThan(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("version_id >", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdGreaterThanOrEqualTo(Long value) {
            return andVersionIdGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andVersionIdGreaterThanOrEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("version_id >=", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdLessThan(Long value) {
            return andVersionIdLessThan(value, Boolean.TRUE);
        }

        public Criteria andVersionIdLessThan(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("version_id <", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdLessThanOrEqualTo(Long value) {
            return andVersionIdLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andVersionIdLessThanOrEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("version_id <=", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdIn(Collection<Long> values, Boolean condition) {
            if (condition == null || !condition) {
                return (Criteria) this;
            }
            addCriterion("version_id in", values, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdNotIn(Collection<Long> values, Boolean condition) {
            if (condition == null || !condition) {
                return (Criteria) this;
            }
            addCriterion("version_id not in", values, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdIn(Collection<Long> values) {
            addCriterion("version_id in", values, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdNotIn(Collection<Long> values) {
            addCriterion("version_id not in", values, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdBetween(Long value1, Long value2) {
            addCriterion("version_id between", value1, value2, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdNotBetween(Long value1, Long value2) {
            addCriterion("version_id not between", value1, value2, "versionId");
            return (Criteria) this;
        }

        public Criteria andNetCostIsNull() {
            addCriterion("net_cost is null");
            return (Criteria) this;
        }

        public Criteria andNetCostIsNotNull() {
            addCriterion("net_cost is not null");
            return (Criteria) this;
        }

        public Criteria andNetCostEqualTo(Integer value) {
            return andNetCostEqualTo(value, Boolean.TRUE);
        }

        public Criteria andNetCostEqualTo(Integer value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("net_cost =", value, "netCost");
            return (Criteria) this;
        }

        public Criteria andNetCostNotEqualTo(Integer value) {
            return andNetCostNotEqualTo(value, Boolean.TRUE);
        }

        public Criteria andNetCostNotEqualTo(Integer value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("net_cost <>", value, "netCost");
            return (Criteria) this;
        }

        public Criteria andNetCostGreaterThan(Integer value) {
            return andNetCostGreaterThan(value, Boolean.TRUE);
        }

        public Criteria andNetCostGreaterThan(Integer value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("net_cost >", value, "netCost");
            return (Criteria) this;
        }

        public Criteria andNetCostGreaterThanOrEqualTo(Integer value) {
            return andNetCostGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andNetCostGreaterThanOrEqualTo(Integer value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("net_cost >=", value, "netCost");
            return (Criteria) this;
        }

        public Criteria andNetCostLessThan(Integer value) {
            return andNetCostLessThan(value, Boolean.TRUE);
        }

        public Criteria andNetCostLessThan(Integer value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("net_cost <", value, "netCost");
            return (Criteria) this;
        }

        public Criteria andNetCostLessThanOrEqualTo(Integer value) {
            return andNetCostLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andNetCostLessThanOrEqualTo(Integer value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("net_cost <=", value, "netCost");
            return (Criteria) this;
        }

        public Criteria andNetCostIn(Collection<Integer> values, Boolean condition) {
            if (condition == null || !condition) {
                return (Criteria) this;
            }
            addCriterion("net_cost in", values, "netCost");
            return (Criteria) this;
        }

        public Criteria andNetCostNotIn(Collection<Integer> values, Boolean condition) {
            if (condition == null || !condition) {
                return (Criteria) this;
            }
            addCriterion("net_cost not in", values, "netCost");
            return (Criteria) this;
        }

        public Criteria andNetCostIn(Collection<Integer> values) {
            addCriterion("net_cost in", values, "netCost");
            return (Criteria) this;
        }

        public Criteria andNetCostNotIn(Collection<Integer> values) {
            addCriterion("net_cost not in", values, "netCost");
            return (Criteria) this;
        }

        public Criteria andNetCostBetween(Integer value1, Integer value2) {
            addCriterion("net_cost between", value1, value2, "netCost");
            return (Criteria) this;
        }

        public Criteria andNetCostNotBetween(Integer value1, Integer value2) {
            addCriterion("net_cost not between", value1, value2, "netCost");
            return (Criteria) this;
        }

        public Criteria andHeartbeatTimeIsNull() {
            addCriterion("heartbeat_time is null");
            return (Criteria) this;
        }

        public Criteria andHeartbeatTimeIsNotNull() {
            addCriterion("heartbeat_time is not null");
            return (Criteria) this;
        }

        public Criteria andHeartbeatTimeEqualTo(Date value) {
            return andHeartbeatTimeEqualTo(value, Boolean.TRUE);
        }

        public Criteria andHeartbeatTimeEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("heartbeat_time =", value, "heartbeatTime");
            return (Criteria) this;
        }

        public Criteria andHeartbeatTimeNotEqualTo(Date value) {
            return andHeartbeatTimeNotEqualTo(value, Boolean.TRUE);
        }

        public Criteria andHeartbeatTimeNotEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("heartbeat_time <>", value, "heartbeatTime");
            return (Criteria) this;
        }

        public Criteria andHeartbeatTimeGreaterThan(Date value) {
            return andHeartbeatTimeGreaterThan(value, Boolean.TRUE);
        }

        public Criteria andHeartbeatTimeGreaterThan(Date value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("heartbeat_time >", value, "heartbeatTime");
            return (Criteria) this;
        }

        public Criteria andHeartbeatTimeGreaterThanOrEqualTo(Date value) {
            return andHeartbeatTimeGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andHeartbeatTimeGreaterThanOrEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("heartbeat_time >=", value, "heartbeatTime");
            return (Criteria) this;
        }

        public Criteria andHeartbeatTimeLessThan(Date value) {
            return andHeartbeatTimeLessThan(value, Boolean.TRUE);
        }

        public Criteria andHeartbeatTimeLessThan(Date value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("heartbeat_time <", value, "heartbeatTime");
            return (Criteria) this;
        }

        public Criteria andHeartbeatTimeLessThanOrEqualTo(Date value) {
            return andHeartbeatTimeLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andHeartbeatTimeLessThanOrEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("heartbeat_time <=", value, "heartbeatTime");
            return (Criteria) this;
        }

        public Criteria andHeartbeatTimeIn(Collection<Date> values, Boolean condition) {
            if (condition == null || !condition) {
                return (Criteria) this;
            }
            addCriterion("heartbeat_time in", values, "heartbeatTime");
            return (Criteria) this;
        }

        public Criteria andHeartbeatTimeNotIn(Collection<Date> values, Boolean condition) {
            if (condition == null || !condition) {
                return (Criteria) this;
            }
            addCriterion("heartbeat_time not in", values, "heartbeatTime");
            return (Criteria) this;
        }

        public Criteria andHeartbeatTimeIn(Collection<Date> values) {
            addCriterion("heartbeat_time in", values, "heartbeatTime");
            return (Criteria) this;
        }

        public Criteria andHeartbeatTimeNotIn(Collection<Date> values) {
            addCriterion("heartbeat_time not in", values, "heartbeatTime");
            return (Criteria) this;
        }

        public Criteria andHeartbeatTimeBetween(Date value1, Date value2) {
            addCriterion("heartbeat_time between", value1, value2, "heartbeatTime");
            return (Criteria) this;
        }

        public Criteria andHeartbeatTimeNotBetween(Date value1, Date value2) {
            addCriterion("heartbeat_time not between", value1, value2, "heartbeatTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            return andCreateTimeEqualTo(value, Boolean.TRUE);
        }

        public Criteria andCreateTimeEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            return andCreateTimeNotEqualTo(value, Boolean.TRUE);
        }

        public Criteria andCreateTimeNotEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            return andCreateTimeGreaterThan(value, Boolean.TRUE);
        }

        public Criteria andCreateTimeGreaterThan(Date value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            return andCreateTimeGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            return andCreateTimeLessThan(value, Boolean.TRUE);
        }

        public Criteria andCreateTimeLessThan(Date value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            return andCreateTimeLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(Collection<Date> values, Boolean condition) {
            if (condition == null || !condition) {
                return (Criteria) this;
            }
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(Collection<Date> values, Boolean condition) {
            if (condition == null || !condition) {
                return (Criteria) this;
            }
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(Collection<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(Collection<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        private BrccInstanceExample example;

        protected Criteria(BrccInstanceExample example) {
            super();
            this.example = example;
        }

        public BrccInstanceExample toExample() {
            return this.example;
        }

        public Criteria addCustomerCriteria(String condition) {
            addCriterion(condition);
            return this;
        }

        public Criteria addCustomerCriteria(String condition, Boolean bCondition) {
            if (bCondition == null || !bCondition){
                return (Criteria) this;
            }
            addCriterion(condition);
            return this;
        }

        /**
         * 举例: exists(select 1 from b where b.aid = a.id and b.id=#{criterion.value})
         */
        public Criteria addCustomerCriteria(String condition, Object value) {
             addCriterion(condition,value,"customerCondition");
            return this;
        }

        public CriterionGroup andGroupCriterion() {
            CriterionGroup group = new CriterionGroup("");
            group.type = 1;
            group.criteria = this;
            criteria.add(group);
            return group;
        }

        public CriterionGroup andGroupCriterion(Boolean condition) {
            CriterionGroup group = new CriterionGroup("");
            group.type = 1;
            group.criteria = this;
            if (condition) {
                criteria.add(group);
            }
            return group;
        }
    }

    public static class Criterion {

        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        /**
         * // 0 - 普通, 1 - CriterionGroup
         */
        protected byte type;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        public byte getType() {
            return type;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof Collection<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }

    public static class CriterionGroup extends Criterion {

        private Criteria criteria;

        protected List<Criterion> inlineOrCriteria;

        public Criteria getCriteria() {
            return criteria;
        }

        public List<Criterion> getInlineOrCriteria() {
            return inlineOrCriteria;
        }

        protected CriterionGroup(String condition) {
            super(condition);
        }

        protected CriterionGroup(String condition, Object value, String typeHandler) {
            super(condition, value, typeHandler);
        }

        protected CriterionGroup(String condition, Object value) {
            super(condition, value);
        }

        protected CriterionGroup(String condition, Object value, Object secondValue, String typeHandler) {
            super(condition, value, secondValue, typeHandler);
        }

        protected CriterionGroup(String condition, Object value, Object secondValue) {
            super(condition, value, secondValue);
        }

        public CriterionGroup or(Criterion criterion) {
            if (inlineOrCriteria == null) {
                inlineOrCriteria = new ArrayList<>();
            }
            inlineOrCriteria.add(criterion);
            return this;
        }

        public Criteria toCriteria() {
            return criteria;
        }

        public CriterionGroup orIdIsNull() {
            Criterion criterion = new Criterion("id is null");
            return or(criterion);
        }

        public CriterionGroup orIdIsNotNull() {
            Criterion criterion = new Criterion("id is not null");
            return or(criterion);
        }

        public CriterionGroup orIdEqualTo(Long value) {
            return orIdEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orIdEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("id =", value, "id");
            return or(criterion);
        }

        public CriterionGroup orIdNotEqualTo(Long value) {
            return orIdNotEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orIdNotEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("id <>", value, "id");
            return or(criterion);
        }

        public CriterionGroup orIdGreaterThan(Long value) {
            return orIdGreaterThan(value, Boolean.TRUE);
        }

        public CriterionGroup orIdGreaterThan(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("id >", value, "id");
            return or(criterion);
        }

        public CriterionGroup orIdGreaterThanOrEqualTo(Long value) {
            return orIdGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orIdGreaterThanOrEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("id >=", value, "id");
            return or(criterion);
        }

        public CriterionGroup orIdLessThan(Long value) {
            return orIdLessThan(value, Boolean.TRUE);
        }

        public CriterionGroup orIdLessThan(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("id <", value, "id");
            return or(criterion);
        }

        public CriterionGroup orIdLessThanOrEqualTo(Long value) {
            return orIdLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orIdLessThanOrEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("id <=", value, "id");
            return or(criterion);
        }

        public CriterionGroup orIdIn(Collection<Long> values) {
            Criterion criterion = new Criterion("id in", values, "id");
            return or(criterion);
        }

        public CriterionGroup orIdNotIn(Collection<Long> values) {
            Criterion criterion = new Criterion("id not in", values, "id");
            return or(criterion);
        }

        public CriterionGroup orIdBetween(Long value1, Long value2) {
            Criterion criterion = new Criterion("id between", value1, value2, "id");
            return or(criterion);
        }

        public CriterionGroup orIdNotBetween(Long value1, Long value2) {
            Criterion criterion = new Criterion("id not between", value1, value2, "id");
            return or(criterion);
        }

        public CriterionGroup orIdcIsNull() {
            Criterion criterion = new Criterion("idc is null");
            return or(criterion);
        }

        public CriterionGroup orIdcIsNotNull() {
            Criterion criterion = new Criterion("idc is not null");
            return or(criterion);
        }

        public CriterionGroup orIdcEqualTo(String value) {
            return orIdcEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orIdcEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("idc =", value, "idc");
            return or(criterion);
        }

        public CriterionGroup orIdcNotEqualTo(String value) {
            return orIdcNotEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orIdcNotEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("idc <>", value, "idc");
            return or(criterion);
        }

        public CriterionGroup orIdcGreaterThan(String value) {
            return orIdcGreaterThan(value, Boolean.TRUE);
        }

        public CriterionGroup orIdcGreaterThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("idc >", value, "idc");
            return or(criterion);
        }

        public CriterionGroup orIdcGreaterThanOrEqualTo(String value) {
            return orIdcGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orIdcGreaterThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("idc >=", value, "idc");
            return or(criterion);
        }

        public CriterionGroup orIdcLessThan(String value) {
            return orIdcLessThan(value, Boolean.TRUE);
        }

        public CriterionGroup orIdcLessThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("idc <", value, "idc");
            return or(criterion);
        }

        public CriterionGroup orIdcLessThanOrEqualTo(String value) {
            return orIdcLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orIdcLessThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("idc <=", value, "idc");
            return or(criterion);
        }

        public CriterionGroup orIdcLike(String value) {
            return orIdcLike(value, Boolean.TRUE);
        }

        public CriterionGroup orIdcLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("idc like", value, "idc");
            return or(criterion);
        }

        public CriterionGroup orIdcLikeLeft(String value) {
            return orIdcLikeLeft(value, Boolean.TRUE);
        }

        public CriterionGroup orIdcLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            Criterion criterion = new Criterion("idc like", value, "idc");
            return or(criterion);
        }

        public CriterionGroup orIdcLikeRight(String value) {
            return orIdcLikeRight(value, Boolean.TRUE);
        }

        public CriterionGroup orIdcLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("idc like", value, "idc");
            return or(criterion);
        }

        public CriterionGroup orIdcLikeBoth(String value) {
            return orIdcLikeBoth(value, Boolean.TRUE);
        }

        public CriterionGroup orIdcLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("idc like", value, "idc");
            return or(criterion);
        }

        public CriterionGroup orIdcNotLike(String value) {
            return orIdcNotLike(value, Boolean.TRUE);
        }

        public CriterionGroup orIdcNotLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("idc not like", value, "idc");
            return or(criterion);
        }

        public CriterionGroup orIdcNotLikeLeft(String value) {
            return orIdcNotLikeLeft(value, Boolean.TRUE);
        }

        public CriterionGroup orIdcNotLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            Criterion criterion = new Criterion("idc not like", value, "idc");
            return or(criterion);
        }

        public CriterionGroup orIdcNotLikeRight(String value) {
            return orIdcNotLikeRight(value, Boolean.TRUE);
        }

        public CriterionGroup orIdcNotLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("idc not like", value, "idc");
            return or(criterion);
        }

        public CriterionGroup orIdcNotLikeBoth(String value) {
            return orIdcNotLikeBoth(value, Boolean.TRUE);
        }

        public CriterionGroup orIdcNotLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("idc not like", value, "idc");
            return or(criterion);
        }

        public CriterionGroup orIdcIn(Collection<String> values) {
            Criterion criterion = new Criterion("idc in", values, "idc");
            return or(criterion);
        }

        public CriterionGroup orIdcNotIn(Collection<String> values) {
            Criterion criterion = new Criterion("idc not in", values, "idc");
            return or(criterion);
        }

        public CriterionGroup orIdcBetween(String value1, String value2) {
            Criterion criterion = new Criterion("idc between", value1, value2, "idc");
            return or(criterion);
        }

        public CriterionGroup orIdcNotBetween(String value1, String value2) {
            Criterion criterion = new Criterion("idc not between", value1, value2, "idc");
            return or(criterion);
        }

        public CriterionGroup orContainerIdIsNull() {
            Criterion criterion = new Criterion("container_id is null");
            return or(criterion);
        }

        public CriterionGroup orContainerIdIsNotNull() {
            Criterion criterion = new Criterion("container_id is not null");
            return or(criterion);
        }

        public CriterionGroup orContainerIdEqualTo(String value) {
            return orContainerIdEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orContainerIdEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("container_id =", value, "containerId");
            return or(criterion);
        }

        public CriterionGroup orContainerIdNotEqualTo(String value) {
            return orContainerIdNotEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orContainerIdNotEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("container_id <>", value, "containerId");
            return or(criterion);
        }

        public CriterionGroup orContainerIdGreaterThan(String value) {
            return orContainerIdGreaterThan(value, Boolean.TRUE);
        }

        public CriterionGroup orContainerIdGreaterThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("container_id >", value, "containerId");
            return or(criterion);
        }

        public CriterionGroup orContainerIdGreaterThanOrEqualTo(String value) {
            return orContainerIdGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orContainerIdGreaterThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("container_id >=", value, "containerId");
            return or(criterion);
        }

        public CriterionGroup orContainerIdLessThan(String value) {
            return orContainerIdLessThan(value, Boolean.TRUE);
        }

        public CriterionGroup orContainerIdLessThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("container_id <", value, "containerId");
            return or(criterion);
        }

        public CriterionGroup orContainerIdLessThanOrEqualTo(String value) {
            return orContainerIdLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orContainerIdLessThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("container_id <=", value, "containerId");
            return or(criterion);
        }

        public CriterionGroup orContainerIdLike(String value) {
            return orContainerIdLike(value, Boolean.TRUE);
        }

        public CriterionGroup orContainerIdLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("container_id like", value, "containerId");
            return or(criterion);
        }

        public CriterionGroup orContainerIdLikeLeft(String value) {
            return orContainerIdLikeLeft(value, Boolean.TRUE);
        }

        public CriterionGroup orContainerIdLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            Criterion criterion = new Criterion("container_id like", value, "containerId");
            return or(criterion);
        }

        public CriterionGroup orContainerIdLikeRight(String value) {
            return orContainerIdLikeRight(value, Boolean.TRUE);
        }

        public CriterionGroup orContainerIdLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("container_id like", value, "containerId");
            return or(criterion);
        }

        public CriterionGroup orContainerIdLikeBoth(String value) {
            return orContainerIdLikeBoth(value, Boolean.TRUE);
        }

        public CriterionGroup orContainerIdLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("container_id like", value, "containerId");
            return or(criterion);
        }

        public CriterionGroup orContainerIdNotLike(String value) {
            return orContainerIdNotLike(value, Boolean.TRUE);
        }

        public CriterionGroup orContainerIdNotLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("container_id not like", value, "containerId");
            return or(criterion);
        }

        public CriterionGroup orContainerIdNotLikeLeft(String value) {
            return orContainerIdNotLikeLeft(value, Boolean.TRUE);
        }

        public CriterionGroup orContainerIdNotLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            Criterion criterion = new Criterion("container_id not like", value, "containerId");
            return or(criterion);
        }

        public CriterionGroup orContainerIdNotLikeRight(String value) {
            return orContainerIdNotLikeRight(value, Boolean.TRUE);
        }

        public CriterionGroup orContainerIdNotLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("container_id not like", value, "containerId");
            return or(criterion);
        }

        public CriterionGroup orContainerIdNotLikeBoth(String value) {
            return orContainerIdNotLikeBoth(value, Boolean.TRUE);
        }

        public CriterionGroup orContainerIdNotLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("container_id not like", value, "containerId");
            return or(criterion);
        }

        public CriterionGroup orContainerIdIn(Collection<String> values) {
            Criterion criterion = new Criterion("container_id in", values, "containerId");
            return or(criterion);
        }

        public CriterionGroup orContainerIdNotIn(Collection<String> values) {
            Criterion criterion = new Criterion("container_id not in", values, "containerId");
            return or(criterion);
        }

        public CriterionGroup orContainerIdBetween(String value1, String value2) {
            Criterion criterion = new Criterion("container_id between", value1, value2, "containerId");
            return or(criterion);
        }

        public CriterionGroup orContainerIdNotBetween(String value1, String value2) {
            Criterion criterion = new Criterion("container_id not between", value1, value2, "containerId");
            return or(criterion);
        }

        public CriterionGroup orAppNameIsNull() {
            Criterion criterion = new Criterion("app_name is null");
            return or(criterion);
        }

        public CriterionGroup orAppNameIsNotNull() {
            Criterion criterion = new Criterion("app_name is not null");
            return or(criterion);
        }

        public CriterionGroup orAppNameEqualTo(String value) {
            return orAppNameEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orAppNameEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("app_name =", value, "appName");
            return or(criterion);
        }

        public CriterionGroup orAppNameNotEqualTo(String value) {
            return orAppNameNotEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orAppNameNotEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("app_name <>", value, "appName");
            return or(criterion);
        }

        public CriterionGroup orAppNameGreaterThan(String value) {
            return orAppNameGreaterThan(value, Boolean.TRUE);
        }

        public CriterionGroup orAppNameGreaterThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("app_name >", value, "appName");
            return or(criterion);
        }

        public CriterionGroup orAppNameGreaterThanOrEqualTo(String value) {
            return orAppNameGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orAppNameGreaterThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("app_name >=", value, "appName");
            return or(criterion);
        }

        public CriterionGroup orAppNameLessThan(String value) {
            return orAppNameLessThan(value, Boolean.TRUE);
        }

        public CriterionGroup orAppNameLessThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("app_name <", value, "appName");
            return or(criterion);
        }

        public CriterionGroup orAppNameLessThanOrEqualTo(String value) {
            return orAppNameLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orAppNameLessThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("app_name <=", value, "appName");
            return or(criterion);
        }

        public CriterionGroup orAppNameLike(String value) {
            return orAppNameLike(value, Boolean.TRUE);
        }

        public CriterionGroup orAppNameLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("app_name like", value, "appName");
            return or(criterion);
        }

        public CriterionGroup orAppNameLikeLeft(String value) {
            return orAppNameLikeLeft(value, Boolean.TRUE);
        }

        public CriterionGroup orAppNameLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            Criterion criterion = new Criterion("app_name like", value, "appName");
            return or(criterion);
        }

        public CriterionGroup orAppNameLikeRight(String value) {
            return orAppNameLikeRight(value, Boolean.TRUE);
        }

        public CriterionGroup orAppNameLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("app_name like", value, "appName");
            return or(criterion);
        }

        public CriterionGroup orAppNameLikeBoth(String value) {
            return orAppNameLikeBoth(value, Boolean.TRUE);
        }

        public CriterionGroup orAppNameLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("app_name like", value, "appName");
            return or(criterion);
        }

        public CriterionGroup orAppNameNotLike(String value) {
            return orAppNameNotLike(value, Boolean.TRUE);
        }

        public CriterionGroup orAppNameNotLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("app_name not like", value, "appName");
            return or(criterion);
        }

        public CriterionGroup orAppNameNotLikeLeft(String value) {
            return orAppNameNotLikeLeft(value, Boolean.TRUE);
        }

        public CriterionGroup orAppNameNotLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            Criterion criterion = new Criterion("app_name not like", value, "appName");
            return or(criterion);
        }

        public CriterionGroup orAppNameNotLikeRight(String value) {
            return orAppNameNotLikeRight(value, Boolean.TRUE);
        }

        public CriterionGroup orAppNameNotLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("app_name not like", value, "appName");
            return or(criterion);
        }

        public CriterionGroup orAppNameNotLikeBoth(String value) {
            return orAppNameNotLikeBoth(value, Boolean.TRUE);
        }

        public CriterionGroup orAppNameNotLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("app_name not like", value, "appName");
            return or(criterion);
        }

        public CriterionGroup orAppNameIn(Collection<String> values) {
            Criterion criterion = new Criterion("app_name in", values, "appName");
            return or(criterion);
        }

        public CriterionGroup orAppNameNotIn(Collection<String> values) {
            Criterion criterion = new Criterion("app_name not in", values, "appName");
            return or(criterion);
        }

        public CriterionGroup orAppNameBetween(String value1, String value2) {
            Criterion criterion = new Criterion("app_name between", value1, value2, "appName");
            return or(criterion);
        }

        public CriterionGroup orAppNameNotBetween(String value1, String value2) {
            Criterion criterion = new Criterion("app_name not between", value1, value2, "appName");
            return or(criterion);
        }

        public CriterionGroup orIpIsNull() {
            Criterion criterion = new Criterion("ip is null");
            return or(criterion);
        }

        public CriterionGroup orIpIsNotNull() {
            Criterion criterion = new Criterion("ip is not null");
            return or(criterion);
        }

        public CriterionGroup orIpEqualTo(String value) {
            return orIpEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orIpEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("ip =", value, "ip");
            return or(criterion);
        }

        public CriterionGroup orIpNotEqualTo(String value) {
            return orIpNotEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orIpNotEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("ip <>", value, "ip");
            return or(criterion);
        }

        public CriterionGroup orIpGreaterThan(String value) {
            return orIpGreaterThan(value, Boolean.TRUE);
        }

        public CriterionGroup orIpGreaterThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("ip >", value, "ip");
            return or(criterion);
        }

        public CriterionGroup orIpGreaterThanOrEqualTo(String value) {
            return orIpGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orIpGreaterThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("ip >=", value, "ip");
            return or(criterion);
        }

        public CriterionGroup orIpLessThan(String value) {
            return orIpLessThan(value, Boolean.TRUE);
        }

        public CriterionGroup orIpLessThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("ip <", value, "ip");
            return or(criterion);
        }

        public CriterionGroup orIpLessThanOrEqualTo(String value) {
            return orIpLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orIpLessThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("ip <=", value, "ip");
            return or(criterion);
        }

        public CriterionGroup orIpLike(String value) {
            return orIpLike(value, Boolean.TRUE);
        }

        public CriterionGroup orIpLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("ip like", value, "ip");
            return or(criterion);
        }

        public CriterionGroup orIpLikeLeft(String value) {
            return orIpLikeLeft(value, Boolean.TRUE);
        }

        public CriterionGroup orIpLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            Criterion criterion = new Criterion("ip like", value, "ip");
            return or(criterion);
        }

        public CriterionGroup orIpLikeRight(String value) {
            return orIpLikeRight(value, Boolean.TRUE);
        }

        public CriterionGroup orIpLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("ip like", value, "ip");
            return or(criterion);
        }

        public CriterionGroup orIpLikeBoth(String value) {
            return orIpLikeBoth(value, Boolean.TRUE);
        }

        public CriterionGroup orIpLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("ip like", value, "ip");
            return or(criterion);
        }

        public CriterionGroup orIpNotLike(String value) {
            return orIpNotLike(value, Boolean.TRUE);
        }

        public CriterionGroup orIpNotLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("ip not like", value, "ip");
            return or(criterion);
        }

        public CriterionGroup orIpNotLikeLeft(String value) {
            return orIpNotLikeLeft(value, Boolean.TRUE);
        }

        public CriterionGroup orIpNotLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            Criterion criterion = new Criterion("ip not like", value, "ip");
            return or(criterion);
        }

        public CriterionGroup orIpNotLikeRight(String value) {
            return orIpNotLikeRight(value, Boolean.TRUE);
        }

        public CriterionGroup orIpNotLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("ip not like", value, "ip");
            return or(criterion);
        }

        public CriterionGroup orIpNotLikeBoth(String value) {
            return orIpNotLikeBoth(value, Boolean.TRUE);
        }

        public CriterionGroup orIpNotLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("ip not like", value, "ip");
            return or(criterion);
        }

        public CriterionGroup orIpIn(Collection<String> values) {
            Criterion criterion = new Criterion("ip in", values, "ip");
            return or(criterion);
        }

        public CriterionGroup orIpNotIn(Collection<String> values) {
            Criterion criterion = new Criterion("ip not in", values, "ip");
            return or(criterion);
        }

        public CriterionGroup orIpBetween(String value1, String value2) {
            Criterion criterion = new Criterion("ip between", value1, value2, "ip");
            return or(criterion);
        }

        public CriterionGroup orIpNotBetween(String value1, String value2) {
            Criterion criterion = new Criterion("ip not between", value1, value2, "ip");
            return or(criterion);
        }

        public CriterionGroup orClientVersionIsNull() {
            Criterion criterion = new Criterion("client_version is null");
            return or(criterion);
        }

        public CriterionGroup orClientVersionIsNotNull() {
            Criterion criterion = new Criterion("client_version is not null");
            return or(criterion);
        }

        public CriterionGroup orClientVersionEqualTo(String value) {
            return orClientVersionEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orClientVersionEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("client_version =", value, "clientVersion");
            return or(criterion);
        }

        public CriterionGroup orClientVersionNotEqualTo(String value) {
            return orClientVersionNotEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orClientVersionNotEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("client_version <>", value, "clientVersion");
            return or(criterion);
        }

        public CriterionGroup orClientVersionGreaterThan(String value) {
            return orClientVersionGreaterThan(value, Boolean.TRUE);
        }

        public CriterionGroup orClientVersionGreaterThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("client_version >", value, "clientVersion");
            return or(criterion);
        }

        public CriterionGroup orClientVersionGreaterThanOrEqualTo(String value) {
            return orClientVersionGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orClientVersionGreaterThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("client_version >=", value, "clientVersion");
            return or(criterion);
        }

        public CriterionGroup orClientVersionLessThan(String value) {
            return orClientVersionLessThan(value, Boolean.TRUE);
        }

        public CriterionGroup orClientVersionLessThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("client_version <", value, "clientVersion");
            return or(criterion);
        }

        public CriterionGroup orClientVersionLessThanOrEqualTo(String value) {
            return orClientVersionLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orClientVersionLessThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("client_version <=", value, "clientVersion");
            return or(criterion);
        }

        public CriterionGroup orClientVersionLike(String value) {
            return orClientVersionLike(value, Boolean.TRUE);
        }

        public CriterionGroup orClientVersionLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("client_version like", value, "clientVersion");
            return or(criterion);
        }

        public CriterionGroup orClientVersionLikeLeft(String value) {
            return orClientVersionLikeLeft(value, Boolean.TRUE);
        }

        public CriterionGroup orClientVersionLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            Criterion criterion = new Criterion("client_version like", value, "clientVersion");
            return or(criterion);
        }

        public CriterionGroup orClientVersionLikeRight(String value) {
            return orClientVersionLikeRight(value, Boolean.TRUE);
        }

        public CriterionGroup orClientVersionLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("client_version like", value, "clientVersion");
            return or(criterion);
        }

        public CriterionGroup orClientVersionLikeBoth(String value) {
            return orClientVersionLikeBoth(value, Boolean.TRUE);
        }

        public CriterionGroup orClientVersionLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("client_version like", value, "clientVersion");
            return or(criterion);
        }

        public CriterionGroup orClientVersionNotLike(String value) {
            return orClientVersionNotLike(value, Boolean.TRUE);
        }

        public CriterionGroup orClientVersionNotLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("client_version not like", value, "clientVersion");
            return or(criterion);
        }

        public CriterionGroup orClientVersionNotLikeLeft(String value) {
            return orClientVersionNotLikeLeft(value, Boolean.TRUE);
        }

        public CriterionGroup orClientVersionNotLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            Criterion criterion = new Criterion("client_version not like", value, "clientVersion");
            return or(criterion);
        }

        public CriterionGroup orClientVersionNotLikeRight(String value) {
            return orClientVersionNotLikeRight(value, Boolean.TRUE);
        }

        public CriterionGroup orClientVersionNotLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("client_version not like", value, "clientVersion");
            return or(criterion);
        }

        public CriterionGroup orClientVersionNotLikeBoth(String value) {
            return orClientVersionNotLikeBoth(value, Boolean.TRUE);
        }

        public CriterionGroup orClientVersionNotLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("client_version not like", value, "clientVersion");
            return or(criterion);
        }

        public CriterionGroup orClientVersionIn(Collection<String> values) {
            Criterion criterion = new Criterion("client_version in", values, "clientVersion");
            return or(criterion);
        }

        public CriterionGroup orClientVersionNotIn(Collection<String> values) {
            Criterion criterion = new Criterion("client_version not in", values, "clientVersion");
            return or(criterion);
        }

        public CriterionGroup orClientVersionBetween(String value1, String value2) {
            Criterion criterion = new Criterion("client_version between", value1, value2, "clientVersion");
            return or(criterion);
        }

        public CriterionGroup orClientVersionNotBetween(String value1, String value2) {
            Criterion criterion = new Criterion("client_version not between", value1, value2, "clientVersion");
            return or(criterion);
        }

        public CriterionGroup orEnableUpdateCallbackIsNull() {
            Criterion criterion = new Criterion("enable_update_callback is null");
            return or(criterion);
        }

        public CriterionGroup orEnableUpdateCallbackIsNotNull() {
            Criterion criterion = new Criterion("enable_update_callback is not null");
            return or(criterion);
        }

        public CriterionGroup orEnableUpdateCallbackEqualTo(Byte value) {
            return orEnableUpdateCallbackEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orEnableUpdateCallbackEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("enable_update_callback =", value, "enableUpdateCallback");
            return or(criterion);
        }

        public CriterionGroup orEnableUpdateCallbackNotEqualTo(Byte value) {
            return orEnableUpdateCallbackNotEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orEnableUpdateCallbackNotEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("enable_update_callback <>", value, "enableUpdateCallback");
            return or(criterion);
        }

        public CriterionGroup orEnableUpdateCallbackGreaterThan(Byte value) {
            return orEnableUpdateCallbackGreaterThan(value, Boolean.TRUE);
        }

        public CriterionGroup orEnableUpdateCallbackGreaterThan(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("enable_update_callback >", value, "enableUpdateCallback");
            return or(criterion);
        }

        public CriterionGroup orEnableUpdateCallbackGreaterThanOrEqualTo(Byte value) {
            return orEnableUpdateCallbackGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orEnableUpdateCallbackGreaterThanOrEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("enable_update_callback >=", value, "enableUpdateCallback");
            return or(criterion);
        }

        public CriterionGroup orEnableUpdateCallbackLessThan(Byte value) {
            return orEnableUpdateCallbackLessThan(value, Boolean.TRUE);
        }

        public CriterionGroup orEnableUpdateCallbackLessThan(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("enable_update_callback <", value, "enableUpdateCallback");
            return or(criterion);
        }

        public CriterionGroup orEnableUpdateCallbackLessThanOrEqualTo(Byte value) {
            return orEnableUpdateCallbackLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orEnableUpdateCallbackLessThanOrEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("enable_update_callback <=", value, "enableUpdateCallback");
            return or(criterion);
        }

        public CriterionGroup orEnableUpdateCallbackIn(Collection<Byte> values) {
            Criterion criterion = new Criterion("enable_update_callback in", values, "enableUpdateCallback");
            return or(criterion);
        }

        public CriterionGroup orEnableUpdateCallbackNotIn(Collection<Byte> values) {
            Criterion criterion = new Criterion("enable_update_callback not in", values, "enableUpdateCallback");
            return or(criterion);
        }

        public CriterionGroup orEnableUpdateCallbackBetween(Byte value1, Byte value2) {
            Criterion criterion = new Criterion("enable_update_callback between", value1, value2, "enableUpdateCallback");
            return or(criterion);
        }

        public CriterionGroup orEnableUpdateCallbackNotBetween(Byte value1, Byte value2) {
            Criterion criterion = new Criterion("enable_update_callback not between", value1, value2, "enableUpdateCallback");
            return or(criterion);
        }

        public CriterionGroup orLastChecksumIsNull() {
            Criterion criterion = new Criterion("last_checksum is null");
            return or(criterion);
        }

        public CriterionGroup orLastChecksumIsNotNull() {
            Criterion criterion = new Criterion("last_checksum is not null");
            return or(criterion);
        }

        public CriterionGroup orLastChecksumEqualTo(String value) {
            return orLastChecksumEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orLastChecksumEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("last_checksum =", value, "lastChecksum");
            return or(criterion);
        }

        public CriterionGroup orLastChecksumNotEqualTo(String value) {
            return orLastChecksumNotEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orLastChecksumNotEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("last_checksum <>", value, "lastChecksum");
            return or(criterion);
        }

        public CriterionGroup orLastChecksumGreaterThan(String value) {
            return orLastChecksumGreaterThan(value, Boolean.TRUE);
        }

        public CriterionGroup orLastChecksumGreaterThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("last_checksum >", value, "lastChecksum");
            return or(criterion);
        }

        public CriterionGroup orLastChecksumGreaterThanOrEqualTo(String value) {
            return orLastChecksumGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orLastChecksumGreaterThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("last_checksum >=", value, "lastChecksum");
            return or(criterion);
        }

        public CriterionGroup orLastChecksumLessThan(String value) {
            return orLastChecksumLessThan(value, Boolean.TRUE);
        }

        public CriterionGroup orLastChecksumLessThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("last_checksum <", value, "lastChecksum");
            return or(criterion);
        }

        public CriterionGroup orLastChecksumLessThanOrEqualTo(String value) {
            return orLastChecksumLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orLastChecksumLessThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("last_checksum <=", value, "lastChecksum");
            return or(criterion);
        }

        public CriterionGroup orLastChecksumLike(String value) {
            return orLastChecksumLike(value, Boolean.TRUE);
        }

        public CriterionGroup orLastChecksumLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("last_checksum like", value, "lastChecksum");
            return or(criterion);
        }

        public CriterionGroup orLastChecksumLikeLeft(String value) {
            return orLastChecksumLikeLeft(value, Boolean.TRUE);
        }

        public CriterionGroup orLastChecksumLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            Criterion criterion = new Criterion("last_checksum like", value, "lastChecksum");
            return or(criterion);
        }

        public CriterionGroup orLastChecksumLikeRight(String value) {
            return orLastChecksumLikeRight(value, Boolean.TRUE);
        }

        public CriterionGroup orLastChecksumLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("last_checksum like", value, "lastChecksum");
            return or(criterion);
        }

        public CriterionGroup orLastChecksumLikeBoth(String value) {
            return orLastChecksumLikeBoth(value, Boolean.TRUE);
        }

        public CriterionGroup orLastChecksumLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("last_checksum like", value, "lastChecksum");
            return or(criterion);
        }

        public CriterionGroup orLastChecksumNotLike(String value) {
            return orLastChecksumNotLike(value, Boolean.TRUE);
        }

        public CriterionGroup orLastChecksumNotLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("last_checksum not like", value, "lastChecksum");
            return or(criterion);
        }

        public CriterionGroup orLastChecksumNotLikeLeft(String value) {
            return orLastChecksumNotLikeLeft(value, Boolean.TRUE);
        }

        public CriterionGroup orLastChecksumNotLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            Criterion criterion = new Criterion("last_checksum not like", value, "lastChecksum");
            return or(criterion);
        }

        public CriterionGroup orLastChecksumNotLikeRight(String value) {
            return orLastChecksumNotLikeRight(value, Boolean.TRUE);
        }

        public CriterionGroup orLastChecksumNotLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("last_checksum not like", value, "lastChecksum");
            return or(criterion);
        }

        public CriterionGroup orLastChecksumNotLikeBoth(String value) {
            return orLastChecksumNotLikeBoth(value, Boolean.TRUE);
        }

        public CriterionGroup orLastChecksumNotLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("last_checksum not like", value, "lastChecksum");
            return or(criterion);
        }

        public CriterionGroup orLastChecksumIn(Collection<String> values) {
            Criterion criterion = new Criterion("last_checksum in", values, "lastChecksum");
            return or(criterion);
        }

        public CriterionGroup orLastChecksumNotIn(Collection<String> values) {
            Criterion criterion = new Criterion("last_checksum not in", values, "lastChecksum");
            return or(criterion);
        }

        public CriterionGroup orLastChecksumBetween(String value1, String value2) {
            Criterion criterion = new Criterion("last_checksum between", value1, value2, "lastChecksum");
            return or(criterion);
        }

        public CriterionGroup orLastChecksumNotBetween(String value1, String value2) {
            Criterion criterion = new Criterion("last_checksum not between", value1, value2, "lastChecksum");
            return or(criterion);
        }

        public CriterionGroup orLastChecksumTimeIsNull() {
            Criterion criterion = new Criterion("last_checksum_time is null");
            return or(criterion);
        }

        public CriterionGroup orLastChecksumTimeIsNotNull() {
            Criterion criterion = new Criterion("last_checksum_time is not null");
            return or(criterion);
        }

        public CriterionGroup orLastChecksumTimeEqualTo(Date value) {
            return orLastChecksumTimeEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orLastChecksumTimeEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("last_checksum_time =", value, "lastChecksumTime");
            return or(criterion);
        }

        public CriterionGroup orLastChecksumTimeNotEqualTo(Date value) {
            return orLastChecksumTimeNotEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orLastChecksumTimeNotEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("last_checksum_time <>", value, "lastChecksumTime");
            return or(criterion);
        }

        public CriterionGroup orLastChecksumTimeGreaterThan(Date value) {
            return orLastChecksumTimeGreaterThan(value, Boolean.TRUE);
        }

        public CriterionGroup orLastChecksumTimeGreaterThan(Date value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("last_checksum_time >", value, "lastChecksumTime");
            return or(criterion);
        }

        public CriterionGroup orLastChecksumTimeGreaterThanOrEqualTo(Date value) {
            return orLastChecksumTimeGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orLastChecksumTimeGreaterThanOrEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("last_checksum_time >=", value, "lastChecksumTime");
            return or(criterion);
        }

        public CriterionGroup orLastChecksumTimeLessThan(Date value) {
            return orLastChecksumTimeLessThan(value, Boolean.TRUE);
        }

        public CriterionGroup orLastChecksumTimeLessThan(Date value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("last_checksum_time <", value, "lastChecksumTime");
            return or(criterion);
        }

        public CriterionGroup orLastChecksumTimeLessThanOrEqualTo(Date value) {
            return orLastChecksumTimeLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orLastChecksumTimeLessThanOrEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("last_checksum_time <=", value, "lastChecksumTime");
            return or(criterion);
        }

        public CriterionGroup orLastChecksumTimeIn(Collection<Date> values) {
            Criterion criterion = new Criterion("last_checksum_time in", values, "lastChecksumTime");
            return or(criterion);
        }

        public CriterionGroup orLastChecksumTimeNotIn(Collection<Date> values) {
            Criterion criterion = new Criterion("last_checksum_time not in", values, "lastChecksumTime");
            return or(criterion);
        }

        public CriterionGroup orLastChecksumTimeBetween(Date value1, Date value2) {
            Criterion criterion = new Criterion("last_checksum_time between", value1, value2, "lastChecksumTime");
            return or(criterion);
        }

        public CriterionGroup orLastChecksumTimeNotBetween(Date value1, Date value2) {
            Criterion criterion = new Criterion("last_checksum_time not between", value1, value2, "lastChecksumTime");
            return or(criterion);
        }

        public CriterionGroup orCurrentChecksumIsNull() {
            Criterion criterion = new Criterion("current_checksum is null");
            return or(criterion);
        }

        public CriterionGroup orCurrentChecksumIsNotNull() {
            Criterion criterion = new Criterion("current_checksum is not null");
            return or(criterion);
        }

        public CriterionGroup orCurrentChecksumEqualTo(String value) {
            return orCurrentChecksumEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orCurrentChecksumEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("current_checksum =", value, "currentChecksum");
            return or(criterion);
        }

        public CriterionGroup orCurrentChecksumNotEqualTo(String value) {
            return orCurrentChecksumNotEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orCurrentChecksumNotEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("current_checksum <>", value, "currentChecksum");
            return or(criterion);
        }

        public CriterionGroup orCurrentChecksumGreaterThan(String value) {
            return orCurrentChecksumGreaterThan(value, Boolean.TRUE);
        }

        public CriterionGroup orCurrentChecksumGreaterThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("current_checksum >", value, "currentChecksum");
            return or(criterion);
        }

        public CriterionGroup orCurrentChecksumGreaterThanOrEqualTo(String value) {
            return orCurrentChecksumGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orCurrentChecksumGreaterThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("current_checksum >=", value, "currentChecksum");
            return or(criterion);
        }

        public CriterionGroup orCurrentChecksumLessThan(String value) {
            return orCurrentChecksumLessThan(value, Boolean.TRUE);
        }

        public CriterionGroup orCurrentChecksumLessThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("current_checksum <", value, "currentChecksum");
            return or(criterion);
        }

        public CriterionGroup orCurrentChecksumLessThanOrEqualTo(String value) {
            return orCurrentChecksumLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orCurrentChecksumLessThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("current_checksum <=", value, "currentChecksum");
            return or(criterion);
        }

        public CriterionGroup orCurrentChecksumLike(String value) {
            return orCurrentChecksumLike(value, Boolean.TRUE);
        }

        public CriterionGroup orCurrentChecksumLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("current_checksum like", value, "currentChecksum");
            return or(criterion);
        }

        public CriterionGroup orCurrentChecksumLikeLeft(String value) {
            return orCurrentChecksumLikeLeft(value, Boolean.TRUE);
        }

        public CriterionGroup orCurrentChecksumLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            Criterion criterion = new Criterion("current_checksum like", value, "currentChecksum");
            return or(criterion);
        }

        public CriterionGroup orCurrentChecksumLikeRight(String value) {
            return orCurrentChecksumLikeRight(value, Boolean.TRUE);
        }

        public CriterionGroup orCurrentChecksumLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("current_checksum like", value, "currentChecksum");
            return or(criterion);
        }

        public CriterionGroup orCurrentChecksumLikeBoth(String value) {
            return orCurrentChecksumLikeBoth(value, Boolean.TRUE);
        }

        public CriterionGroup orCurrentChecksumLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("current_checksum like", value, "currentChecksum");
            return or(criterion);
        }

        public CriterionGroup orCurrentChecksumNotLike(String value) {
            return orCurrentChecksumNotLike(value, Boolean.TRUE);
        }

        public CriterionGroup orCurrentChecksumNotLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("current_checksum not like", value, "currentChecksum");
            return or(criterion);
        }

        public CriterionGroup orCurrentChecksumNotLikeLeft(String value) {
            return orCurrentChecksumNotLikeLeft(value, Boolean.TRUE);
        }

        public CriterionGroup orCurrentChecksumNotLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            Criterion criterion = new Criterion("current_checksum not like", value, "currentChecksum");
            return or(criterion);
        }

        public CriterionGroup orCurrentChecksumNotLikeRight(String value) {
            return orCurrentChecksumNotLikeRight(value, Boolean.TRUE);
        }

        public CriterionGroup orCurrentChecksumNotLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("current_checksum not like", value, "currentChecksum");
            return or(criterion);
        }

        public CriterionGroup orCurrentChecksumNotLikeBoth(String value) {
            return orCurrentChecksumNotLikeBoth(value, Boolean.TRUE);
        }

        public CriterionGroup orCurrentChecksumNotLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("current_checksum not like", value, "currentChecksum");
            return or(criterion);
        }

        public CriterionGroup orCurrentChecksumIn(Collection<String> values) {
            Criterion criterion = new Criterion("current_checksum in", values, "currentChecksum");
            return or(criterion);
        }

        public CriterionGroup orCurrentChecksumNotIn(Collection<String> values) {
            Criterion criterion = new Criterion("current_checksum not in", values, "currentChecksum");
            return or(criterion);
        }

        public CriterionGroup orCurrentChecksumBetween(String value1, String value2) {
            Criterion criterion = new Criterion("current_checksum between", value1, value2, "currentChecksum");
            return or(criterion);
        }

        public CriterionGroup orCurrentChecksumNotBetween(String value1, String value2) {
            Criterion criterion = new Criterion("current_checksum not between", value1, value2, "currentChecksum");
            return or(criterion);
        }

        public CriterionGroup orCurrentChecksumTimeIsNull() {
            Criterion criterion = new Criterion("current_checksum_time is null");
            return or(criterion);
        }

        public CriterionGroup orCurrentChecksumTimeIsNotNull() {
            Criterion criterion = new Criterion("current_checksum_time is not null");
            return or(criterion);
        }

        public CriterionGroup orCurrentChecksumTimeEqualTo(Date value) {
            return orCurrentChecksumTimeEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orCurrentChecksumTimeEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("current_checksum_time =", value, "currentChecksumTime");
            return or(criterion);
        }

        public CriterionGroup orCurrentChecksumTimeNotEqualTo(Date value) {
            return orCurrentChecksumTimeNotEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orCurrentChecksumTimeNotEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("current_checksum_time <>", value, "currentChecksumTime");
            return or(criterion);
        }

        public CriterionGroup orCurrentChecksumTimeGreaterThan(Date value) {
            return orCurrentChecksumTimeGreaterThan(value, Boolean.TRUE);
        }

        public CriterionGroup orCurrentChecksumTimeGreaterThan(Date value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("current_checksum_time >", value, "currentChecksumTime");
            return or(criterion);
        }

        public CriterionGroup orCurrentChecksumTimeGreaterThanOrEqualTo(Date value) {
            return orCurrentChecksumTimeGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orCurrentChecksumTimeGreaterThanOrEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("current_checksum_time >=", value, "currentChecksumTime");
            return or(criterion);
        }

        public CriterionGroup orCurrentChecksumTimeLessThan(Date value) {
            return orCurrentChecksumTimeLessThan(value, Boolean.TRUE);
        }

        public CriterionGroup orCurrentChecksumTimeLessThan(Date value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("current_checksum_time <", value, "currentChecksumTime");
            return or(criterion);
        }

        public CriterionGroup orCurrentChecksumTimeLessThanOrEqualTo(Date value) {
            return orCurrentChecksumTimeLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orCurrentChecksumTimeLessThanOrEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("current_checksum_time <=", value, "currentChecksumTime");
            return or(criterion);
        }

        public CriterionGroup orCurrentChecksumTimeIn(Collection<Date> values) {
            Criterion criterion = new Criterion("current_checksum_time in", values, "currentChecksumTime");
            return or(criterion);
        }

        public CriterionGroup orCurrentChecksumTimeNotIn(Collection<Date> values) {
            Criterion criterion = new Criterion("current_checksum_time not in", values, "currentChecksumTime");
            return or(criterion);
        }

        public CriterionGroup orCurrentChecksumTimeBetween(Date value1, Date value2) {
            Criterion criterion = new Criterion("current_checksum_time between", value1, value2, "currentChecksumTime");
            return or(criterion);
        }

        public CriterionGroup orCurrentChecksumTimeNotBetween(Date value1, Date value2) {
            Criterion criterion = new Criterion("current_checksum_time not between", value1, value2, "currentChecksumTime");
            return or(criterion);
        }

        public CriterionGroup orVersionIdIsNull() {
            Criterion criterion = new Criterion("version_id is null");
            return or(criterion);
        }

        public CriterionGroup orVersionIdIsNotNull() {
            Criterion criterion = new Criterion("version_id is not null");
            return or(criterion);
        }

        public CriterionGroup orVersionIdEqualTo(Long value) {
            return orVersionIdEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orVersionIdEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("version_id =", value, "versionId");
            return or(criterion);
        }

        public CriterionGroup orVersionIdNotEqualTo(Long value) {
            return orVersionIdNotEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orVersionIdNotEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("version_id <>", value, "versionId");
            return or(criterion);
        }

        public CriterionGroup orVersionIdGreaterThan(Long value) {
            return orVersionIdGreaterThan(value, Boolean.TRUE);
        }

        public CriterionGroup orVersionIdGreaterThan(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("version_id >", value, "versionId");
            return or(criterion);
        }

        public CriterionGroup orVersionIdGreaterThanOrEqualTo(Long value) {
            return orVersionIdGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orVersionIdGreaterThanOrEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("version_id >=", value, "versionId");
            return or(criterion);
        }

        public CriterionGroup orVersionIdLessThan(Long value) {
            return orVersionIdLessThan(value, Boolean.TRUE);
        }

        public CriterionGroup orVersionIdLessThan(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("version_id <", value, "versionId");
            return or(criterion);
        }

        public CriterionGroup orVersionIdLessThanOrEqualTo(Long value) {
            return orVersionIdLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orVersionIdLessThanOrEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("version_id <=", value, "versionId");
            return or(criterion);
        }

        public CriterionGroup orVersionIdIn(Collection<Long> values) {
            Criterion criterion = new Criterion("version_id in", values, "versionId");
            return or(criterion);
        }

        public CriterionGroup orVersionIdNotIn(Collection<Long> values) {
            Criterion criterion = new Criterion("version_id not in", values, "versionId");
            return or(criterion);
        }

        public CriterionGroup orVersionIdBetween(Long value1, Long value2) {
            Criterion criterion = new Criterion("version_id between", value1, value2, "versionId");
            return or(criterion);
        }

        public CriterionGroup orVersionIdNotBetween(Long value1, Long value2) {
            Criterion criterion = new Criterion("version_id not between", value1, value2, "versionId");
            return or(criterion);
        }

        public CriterionGroup orNetCostIsNull() {
            Criterion criterion = new Criterion("net_cost is null");
            return or(criterion);
        }

        public CriterionGroup orNetCostIsNotNull() {
            Criterion criterion = new Criterion("net_cost is not null");
            return or(criterion);
        }

        public CriterionGroup orNetCostEqualTo(Integer value) {
            return orNetCostEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orNetCostEqualTo(Integer value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("net_cost =", value, "netCost");
            return or(criterion);
        }

        public CriterionGroup orNetCostNotEqualTo(Integer value) {
            return orNetCostNotEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orNetCostNotEqualTo(Integer value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("net_cost <>", value, "netCost");
            return or(criterion);
        }

        public CriterionGroup orNetCostGreaterThan(Integer value) {
            return orNetCostGreaterThan(value, Boolean.TRUE);
        }

        public CriterionGroup orNetCostGreaterThan(Integer value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("net_cost >", value, "netCost");
            return or(criterion);
        }

        public CriterionGroup orNetCostGreaterThanOrEqualTo(Integer value) {
            return orNetCostGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orNetCostGreaterThanOrEqualTo(Integer value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("net_cost >=", value, "netCost");
            return or(criterion);
        }

        public CriterionGroup orNetCostLessThan(Integer value) {
            return orNetCostLessThan(value, Boolean.TRUE);
        }

        public CriterionGroup orNetCostLessThan(Integer value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("net_cost <", value, "netCost");
            return or(criterion);
        }

        public CriterionGroup orNetCostLessThanOrEqualTo(Integer value) {
            return orNetCostLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orNetCostLessThanOrEqualTo(Integer value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("net_cost <=", value, "netCost");
            return or(criterion);
        }

        public CriterionGroup orNetCostIn(Collection<Integer> values) {
            Criterion criterion = new Criterion("net_cost in", values, "netCost");
            return or(criterion);
        }

        public CriterionGroup orNetCostNotIn(Collection<Integer> values) {
            Criterion criterion = new Criterion("net_cost not in", values, "netCost");
            return or(criterion);
        }

        public CriterionGroup orNetCostBetween(Integer value1, Integer value2) {
            Criterion criterion = new Criterion("net_cost between", value1, value2, "netCost");
            return or(criterion);
        }

        public CriterionGroup orNetCostNotBetween(Integer value1, Integer value2) {
            Criterion criterion = new Criterion("net_cost not between", value1, value2, "netCost");
            return or(criterion);
        }

        public CriterionGroup orHeartbeatTimeIsNull() {
            Criterion criterion = new Criterion("heartbeat_time is null");
            return or(criterion);
        }

        public CriterionGroup orHeartbeatTimeIsNotNull() {
            Criterion criterion = new Criterion("heartbeat_time is not null");
            return or(criterion);
        }

        public CriterionGroup orHeartbeatTimeEqualTo(Date value) {
            return orHeartbeatTimeEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orHeartbeatTimeEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("heartbeat_time =", value, "heartbeatTime");
            return or(criterion);
        }

        public CriterionGroup orHeartbeatTimeNotEqualTo(Date value) {
            return orHeartbeatTimeNotEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orHeartbeatTimeNotEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("heartbeat_time <>", value, "heartbeatTime");
            return or(criterion);
        }

        public CriterionGroup orHeartbeatTimeGreaterThan(Date value) {
            return orHeartbeatTimeGreaterThan(value, Boolean.TRUE);
        }

        public CriterionGroup orHeartbeatTimeGreaterThan(Date value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("heartbeat_time >", value, "heartbeatTime");
            return or(criterion);
        }

        public CriterionGroup orHeartbeatTimeGreaterThanOrEqualTo(Date value) {
            return orHeartbeatTimeGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orHeartbeatTimeGreaterThanOrEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("heartbeat_time >=", value, "heartbeatTime");
            return or(criterion);
        }

        public CriterionGroup orHeartbeatTimeLessThan(Date value) {
            return orHeartbeatTimeLessThan(value, Boolean.TRUE);
        }

        public CriterionGroup orHeartbeatTimeLessThan(Date value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("heartbeat_time <", value, "heartbeatTime");
            return or(criterion);
        }

        public CriterionGroup orHeartbeatTimeLessThanOrEqualTo(Date value) {
            return orHeartbeatTimeLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orHeartbeatTimeLessThanOrEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("heartbeat_time <=", value, "heartbeatTime");
            return or(criterion);
        }

        public CriterionGroup orHeartbeatTimeIn(Collection<Date> values) {
            Criterion criterion = new Criterion("heartbeat_time in", values, "heartbeatTime");
            return or(criterion);
        }

        public CriterionGroup orHeartbeatTimeNotIn(Collection<Date> values) {
            Criterion criterion = new Criterion("heartbeat_time not in", values, "heartbeatTime");
            return or(criterion);
        }

        public CriterionGroup orHeartbeatTimeBetween(Date value1, Date value2) {
            Criterion criterion = new Criterion("heartbeat_time between", value1, value2, "heartbeatTime");
            return or(criterion);
        }

        public CriterionGroup orHeartbeatTimeNotBetween(Date value1, Date value2) {
            Criterion criterion = new Criterion("heartbeat_time not between", value1, value2, "heartbeatTime");
            return or(criterion);
        }

        public CriterionGroup orCreateTimeIsNull() {
            Criterion criterion = new Criterion("create_time is null");
            return or(criterion);
        }

        public CriterionGroup orCreateTimeIsNotNull() {
            Criterion criterion = new Criterion("create_time is not null");
            return or(criterion);
        }

        public CriterionGroup orCreateTimeEqualTo(Date value) {
            return orCreateTimeEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orCreateTimeEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("create_time =", value, "createTime");
            return or(criterion);
        }

        public CriterionGroup orCreateTimeNotEqualTo(Date value) {
            return orCreateTimeNotEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orCreateTimeNotEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("create_time <>", value, "createTime");
            return or(criterion);
        }

        public CriterionGroup orCreateTimeGreaterThan(Date value) {
            return orCreateTimeGreaterThan(value, Boolean.TRUE);
        }

        public CriterionGroup orCreateTimeGreaterThan(Date value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("create_time >", value, "createTime");
            return or(criterion);
        }

        public CriterionGroup orCreateTimeGreaterThanOrEqualTo(Date value) {
            return orCreateTimeGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orCreateTimeGreaterThanOrEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("create_time >=", value, "createTime");
            return or(criterion);
        }

        public CriterionGroup orCreateTimeLessThan(Date value) {
            return orCreateTimeLessThan(value, Boolean.TRUE);
        }

        public CriterionGroup orCreateTimeLessThan(Date value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("create_time <", value, "createTime");
            return or(criterion);
        }

        public CriterionGroup orCreateTimeLessThanOrEqualTo(Date value) {
            return orCreateTimeLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orCreateTimeLessThanOrEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("create_time <=", value, "createTime");
            return or(criterion);
        }

        public CriterionGroup orCreateTimeIn(Collection<Date> values) {
            Criterion criterion = new Criterion("create_time in", values, "createTime");
            return or(criterion);
        }

        public CriterionGroup orCreateTimeNotIn(Collection<Date> values) {
            Criterion criterion = new Criterion("create_time not in", values, "createTime");
            return or(criterion);
        }

        public CriterionGroup orCreateTimeBetween(Date value1, Date value2) {
            Criterion criterion = new Criterion("create_time between", value1, value2, "createTime");
            return or(criterion);
        }

        public CriterionGroup orCreateTimeNotBetween(Date value1, Date value2) {
            Criterion criterion = new Criterion("create_time not between", value1, value2, "createTime");
            return or(criterion);
        }
    }

    public static final class Builder extends BaseExampleBuilder<Builder, BrccInstanceExample> {

        protected List<Criteria> oredCriteria;

        private Builder() {
            
        }

        public Builder oredCriteria(List<Criteria> oredCriteria) {
            this.oredCriteria = oredCriteria;
            return this;
        }

        @Override
        public BrccInstanceExample build() {
            return new BrccInstanceExample(this);
        }
    }
}
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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import com.baidu.brcc.domain.base.BaseExample;
import com.baidu.brcc.domain.base.BaseExampleBuilder;

public class ConfigChangeLogExample extends BaseExample {

    protected List<Criteria> oredCriteria;

    private ConfigChangeLogExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * 配置变更记录
     */
    private ConfigChangeLogExample(Builder builder) {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            return andUserIdEqualTo(value, Boolean.TRUE);
        }

        public Criteria andUserIdEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            return andUserIdNotEqualTo(value, Boolean.TRUE);
        }

        public Criteria andUserIdNotEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            return andUserIdGreaterThan(value, Boolean.TRUE);
        }

        public Criteria andUserIdGreaterThan(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            return andUserIdGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            return andUserIdLessThan(value, Boolean.TRUE);
        }

        public Criteria andUserIdLessThan(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            return andUserIdLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(Collection<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(Collection<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Long value) {
            return andProductIdEqualTo(value, Boolean.TRUE);
        }

        public Criteria andProductIdEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Long value) {
            return andProductIdNotEqualTo(value, Boolean.TRUE);
        }

        public Criteria andProductIdNotEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Long value) {
            return andProductIdGreaterThan(value, Boolean.TRUE);
        }

        public Criteria andProductIdGreaterThan(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Long value) {
            return andProductIdGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Long value) {
            return andProductIdLessThan(value, Boolean.TRUE);
        }

        public Criteria andProductIdLessThan(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Long value) {
            return andProductIdLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andProductIdLessThanOrEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(Collection<Long> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(Collection<Long> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Long value1, Long value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Long value1, Long value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNull() {
            addCriterion("project_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("project_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(Long value) {
            return andProjectIdEqualTo(value, Boolean.TRUE);
        }

        public Criteria andProjectIdEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("project_id =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(Long value) {
            return andProjectIdNotEqualTo(value, Boolean.TRUE);
        }

        public Criteria andProjectIdNotEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("project_id <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(Long value) {
            return andProjectIdGreaterThan(value, Boolean.TRUE);
        }

        public Criteria andProjectIdGreaterThan(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("project_id >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(Long value) {
            return andProjectIdGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("project_id >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(Long value) {
            return andProjectIdLessThan(value, Boolean.TRUE);
        }

        public Criteria andProjectIdLessThan(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("project_id <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(Long value) {
            return andProjectIdLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andProjectIdLessThanOrEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("project_id <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(Collection<Long> values) {
            addCriterion("project_id in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(Collection<Long> values) {
            addCriterion("project_id not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(Long value1, Long value2) {
            addCriterion("project_id between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(Long value1, Long value2) {
            addCriterion("project_id not between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andEnvironmentIdIsNull() {
            addCriterion("environment_id is null");
            return (Criteria) this;
        }

        public Criteria andEnvironmentIdIsNotNull() {
            addCriterion("environment_id is not null");
            return (Criteria) this;
        }

        public Criteria andEnvironmentIdEqualTo(Long value) {
            return andEnvironmentIdEqualTo(value, Boolean.TRUE);
        }

        public Criteria andEnvironmentIdEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("environment_id =", value, "environmentId");
            return (Criteria) this;
        }

        public Criteria andEnvironmentIdNotEqualTo(Long value) {
            return andEnvironmentIdNotEqualTo(value, Boolean.TRUE);
        }

        public Criteria andEnvironmentIdNotEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("environment_id <>", value, "environmentId");
            return (Criteria) this;
        }

        public Criteria andEnvironmentIdGreaterThan(Long value) {
            return andEnvironmentIdGreaterThan(value, Boolean.TRUE);
        }

        public Criteria andEnvironmentIdGreaterThan(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("environment_id >", value, "environmentId");
            return (Criteria) this;
        }

        public Criteria andEnvironmentIdGreaterThanOrEqualTo(Long value) {
            return andEnvironmentIdGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andEnvironmentIdGreaterThanOrEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("environment_id >=", value, "environmentId");
            return (Criteria) this;
        }

        public Criteria andEnvironmentIdLessThan(Long value) {
            return andEnvironmentIdLessThan(value, Boolean.TRUE);
        }

        public Criteria andEnvironmentIdLessThan(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("environment_id <", value, "environmentId");
            return (Criteria) this;
        }

        public Criteria andEnvironmentIdLessThanOrEqualTo(Long value) {
            return andEnvironmentIdLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andEnvironmentIdLessThanOrEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("environment_id <=", value, "environmentId");
            return (Criteria) this;
        }

        public Criteria andEnvironmentIdIn(Collection<Long> values) {
            addCriterion("environment_id in", values, "environmentId");
            return (Criteria) this;
        }

        public Criteria andEnvironmentIdNotIn(Collection<Long> values) {
            addCriterion("environment_id not in", values, "environmentId");
            return (Criteria) this;
        }

        public Criteria andEnvironmentIdBetween(Long value1, Long value2) {
            addCriterion("environment_id between", value1, value2, "environmentId");
            return (Criteria) this;
        }

        public Criteria andEnvironmentIdNotBetween(Long value1, Long value2) {
            addCriterion("environment_id not between", value1, value2, "environmentId");
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

        public Criteria andGroupIdIsNull() {
            addCriterion("group_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("group_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(Long value) {
            return andGroupIdEqualTo(value, Boolean.TRUE);
        }

        public Criteria andGroupIdEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("group_id =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(Long value) {
            return andGroupIdNotEqualTo(value, Boolean.TRUE);
        }

        public Criteria andGroupIdNotEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("group_id <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(Long value) {
            return andGroupIdGreaterThan(value, Boolean.TRUE);
        }

        public Criteria andGroupIdGreaterThan(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("group_id >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(Long value) {
            return andGroupIdGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("group_id >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(Long value) {
            return andGroupIdLessThan(value, Boolean.TRUE);
        }

        public Criteria andGroupIdLessThan(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("group_id <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(Long value) {
            return andGroupIdLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andGroupIdLessThanOrEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("group_id <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(Collection<Long> values) {
            addCriterion("group_id in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(Collection<Long> values) {
            addCriterion("group_id not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(Long value1, Long value2) {
            addCriterion("group_id between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(Long value1, Long value2) {
            addCriterion("group_id not between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupNameIsNull() {
            addCriterion("group_name is null");
            return (Criteria) this;
        }

        public Criteria andGroupNameIsNotNull() {
            addCriterion("group_name is not null");
            return (Criteria) this;
        }

        public Criteria andGroupNameEqualTo(String value) {
            return andGroupNameEqualTo(value, Boolean.TRUE);
        }

        public Criteria andGroupNameEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("group_name =", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotEqualTo(String value) {
            return andGroupNameNotEqualTo(value, Boolean.TRUE);
        }

        public Criteria andGroupNameNotEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("group_name <>", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThan(String value) {
            return andGroupNameGreaterThan(value, Boolean.TRUE);
        }

        public Criteria andGroupNameGreaterThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("group_name >", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThanOrEqualTo(String value) {
            return andGroupNameGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andGroupNameGreaterThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("group_name >=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThan(String value) {
            return andGroupNameLessThan(value, Boolean.TRUE);
        }

        public Criteria andGroupNameLessThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("group_name <", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThanOrEqualTo(String value) {
            return andGroupNameLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andGroupNameLessThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("group_name <=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLike(String value) {
            return andGroupNameLike(value, Boolean.TRUE);
        }

        public Criteria andGroupNameLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("group_name like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLikeLeft(String value) {
            return andGroupNameLikeLeft(value, Boolean.TRUE);
        }

        public Criteria andGroupNameLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            addCriterion("group_name like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLikeRight(String value) {
            return andGroupNameLikeRight(value, Boolean.TRUE);
        }

        public Criteria andGroupNameLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("group_name like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLikeBoth(String value) {
            return andGroupNameLikeBoth(value, Boolean.TRUE);
        }

        public Criteria andGroupNameLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("group_name like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotLike(String value) {
            return andGroupNameNotLike(value, Boolean.TRUE);
        }

        public Criteria andGroupNameNotLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("group_name not like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotLikeLeft(String value) {
            return andGroupNameNotLikeLeft(value, Boolean.TRUE);
        }

        public Criteria andGroupNameNotLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            addCriterion("group_name not like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotLikeRight(String value) {
            return andGroupNameNotLikeRight(value, Boolean.TRUE);
        }

        public Criteria andGroupNameNotLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("group_name not like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotLikeBoth(String value) {
            return andGroupNameNotLikeBoth(value, Boolean.TRUE);
        }

        public Criteria andGroupNameNotLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("group_name not like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameIn(Collection<String> values) {
            addCriterion("group_name in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotIn(Collection<String> values) {
            addCriterion("group_name not in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameBetween(String value1, String value2) {
            addCriterion("group_name between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotBetween(String value1, String value2) {
            addCriterion("group_name not between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("operator is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("operator is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            return andOperatorEqualTo(value, Boolean.TRUE);
        }

        public Criteria andOperatorEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("operator =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            return andOperatorNotEqualTo(value, Boolean.TRUE);
        }

        public Criteria andOperatorNotEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("operator <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            return andOperatorGreaterThan(value, Boolean.TRUE);
        }

        public Criteria andOperatorGreaterThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("operator >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            return andOperatorGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("operator >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            return andOperatorLessThan(value, Boolean.TRUE);
        }

        public Criteria andOperatorLessThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("operator <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            return andOperatorLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andOperatorLessThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("operator <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            return andOperatorLike(value, Boolean.TRUE);
        }

        public Criteria andOperatorLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("operator like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLikeLeft(String value) {
            return andOperatorLikeLeft(value, Boolean.TRUE);
        }

        public Criteria andOperatorLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            addCriterion("operator like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLikeRight(String value) {
            return andOperatorLikeRight(value, Boolean.TRUE);
        }

        public Criteria andOperatorLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("operator like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLikeBoth(String value) {
            return andOperatorLikeBoth(value, Boolean.TRUE);
        }

        public Criteria andOperatorLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("operator like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            return andOperatorNotLike(value, Boolean.TRUE);
        }

        public Criteria andOperatorNotLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("operator not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLikeLeft(String value) {
            return andOperatorNotLikeLeft(value, Boolean.TRUE);
        }

        public Criteria andOperatorNotLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            addCriterion("operator not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLikeRight(String value) {
            return andOperatorNotLikeRight(value, Boolean.TRUE);
        }

        public Criteria andOperatorNotLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("operator not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLikeBoth(String value) {
            return andOperatorNotLikeBoth(value, Boolean.TRUE);
        }

        public Criteria andOperatorNotLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("operator not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(Collection<String> values) {
            addCriterion("operator in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(Collection<String> values) {
            addCriterion("operator not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("operator between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("operator not between", value1, value2, "operator");
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

        private ConfigChangeLogExample example;

        protected Criteria(ConfigChangeLogExample example) {
            super();
            this.example = example;
        }

        public ConfigChangeLogExample toExample() {
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

        public CriterionGroup orUserIdIsNull() {
            Criterion criterion = new Criterion("user_id is null");
            return or(criterion);
        }

        public CriterionGroup orUserIdIsNotNull() {
            Criterion criterion = new Criterion("user_id is not null");
            return or(criterion);
        }

        public CriterionGroup orUserIdEqualTo(Long value) {
            return orUserIdEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orUserIdEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("user_id =", value, "userId");
            return or(criterion);
        }

        public CriterionGroup orUserIdNotEqualTo(Long value) {
            return orUserIdNotEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orUserIdNotEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("user_id <>", value, "userId");
            return or(criterion);
        }

        public CriterionGroup orUserIdGreaterThan(Long value) {
            return orUserIdGreaterThan(value, Boolean.TRUE);
        }

        public CriterionGroup orUserIdGreaterThan(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("user_id >", value, "userId");
            return or(criterion);
        }

        public CriterionGroup orUserIdGreaterThanOrEqualTo(Long value) {
            return orUserIdGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orUserIdGreaterThanOrEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("user_id >=", value, "userId");
            return or(criterion);
        }

        public CriterionGroup orUserIdLessThan(Long value) {
            return orUserIdLessThan(value, Boolean.TRUE);
        }

        public CriterionGroup orUserIdLessThan(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("user_id <", value, "userId");
            return or(criterion);
        }

        public CriterionGroup orUserIdLessThanOrEqualTo(Long value) {
            return orUserIdLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orUserIdLessThanOrEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("user_id <=", value, "userId");
            return or(criterion);
        }

        public CriterionGroup orUserIdIn(Collection<Long> values) {
            Criterion criterion = new Criterion("user_id in", values, "userId");
            return or(criterion);
        }

        public CriterionGroup orUserIdNotIn(Collection<Long> values) {
            Criterion criterion = new Criterion("user_id not in", values, "userId");
            return or(criterion);
        }

        public CriterionGroup orUserIdBetween(Long value1, Long value2) {
            Criterion criterion = new Criterion("user_id between", value1, value2, "userId");
            return or(criterion);
        }

        public CriterionGroup orUserIdNotBetween(Long value1, Long value2) {
            Criterion criterion = new Criterion("user_id not between", value1, value2, "userId");
            return or(criterion);
        }

        public CriterionGroup orProductIdIsNull() {
            Criterion criterion = new Criterion("product_id is null");
            return or(criterion);
        }

        public CriterionGroup orProductIdIsNotNull() {
            Criterion criterion = new Criterion("product_id is not null");
            return or(criterion);
        }

        public CriterionGroup orProductIdEqualTo(Long value) {
            return orProductIdEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orProductIdEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("product_id =", value, "productId");
            return or(criterion);
        }

        public CriterionGroup orProductIdNotEqualTo(Long value) {
            return orProductIdNotEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orProductIdNotEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("product_id <>", value, "productId");
            return or(criterion);
        }

        public CriterionGroup orProductIdGreaterThan(Long value) {
            return orProductIdGreaterThan(value, Boolean.TRUE);
        }

        public CriterionGroup orProductIdGreaterThan(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("product_id >", value, "productId");
            return or(criterion);
        }

        public CriterionGroup orProductIdGreaterThanOrEqualTo(Long value) {
            return orProductIdGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orProductIdGreaterThanOrEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("product_id >=", value, "productId");
            return or(criterion);
        }

        public CriterionGroup orProductIdLessThan(Long value) {
            return orProductIdLessThan(value, Boolean.TRUE);
        }

        public CriterionGroup orProductIdLessThan(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("product_id <", value, "productId");
            return or(criterion);
        }

        public CriterionGroup orProductIdLessThanOrEqualTo(Long value) {
            return orProductIdLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orProductIdLessThanOrEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("product_id <=", value, "productId");
            return or(criterion);
        }

        public CriterionGroup orProductIdIn(Collection<Long> values) {
            Criterion criterion = new Criterion("product_id in", values, "productId");
            return or(criterion);
        }

        public CriterionGroup orProductIdNotIn(Collection<Long> values) {
            Criterion criterion = new Criterion("product_id not in", values, "productId");
            return or(criterion);
        }

        public CriterionGroup orProductIdBetween(Long value1, Long value2) {
            Criterion criterion = new Criterion("product_id between", value1, value2, "productId");
            return or(criterion);
        }

        public CriterionGroup orProductIdNotBetween(Long value1, Long value2) {
            Criterion criterion = new Criterion("product_id not between", value1, value2, "productId");
            return or(criterion);
        }

        public CriterionGroup orProjectIdIsNull() {
            Criterion criterion = new Criterion("project_id is null");
            return or(criterion);
        }

        public CriterionGroup orProjectIdIsNotNull() {
            Criterion criterion = new Criterion("project_id is not null");
            return or(criterion);
        }

        public CriterionGroup orProjectIdEqualTo(Long value) {
            return orProjectIdEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orProjectIdEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("project_id =", value, "projectId");
            return or(criterion);
        }

        public CriterionGroup orProjectIdNotEqualTo(Long value) {
            return orProjectIdNotEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orProjectIdNotEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("project_id <>", value, "projectId");
            return or(criterion);
        }

        public CriterionGroup orProjectIdGreaterThan(Long value) {
            return orProjectIdGreaterThan(value, Boolean.TRUE);
        }

        public CriterionGroup orProjectIdGreaterThan(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("project_id >", value, "projectId");
            return or(criterion);
        }

        public CriterionGroup orProjectIdGreaterThanOrEqualTo(Long value) {
            return orProjectIdGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orProjectIdGreaterThanOrEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("project_id >=", value, "projectId");
            return or(criterion);
        }

        public CriterionGroup orProjectIdLessThan(Long value) {
            return orProjectIdLessThan(value, Boolean.TRUE);
        }

        public CriterionGroup orProjectIdLessThan(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("project_id <", value, "projectId");
            return or(criterion);
        }

        public CriterionGroup orProjectIdLessThanOrEqualTo(Long value) {
            return orProjectIdLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orProjectIdLessThanOrEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("project_id <=", value, "projectId");
            return or(criterion);
        }

        public CriterionGroup orProjectIdIn(Collection<Long> values) {
            Criterion criterion = new Criterion("project_id in", values, "projectId");
            return or(criterion);
        }

        public CriterionGroup orProjectIdNotIn(Collection<Long> values) {
            Criterion criterion = new Criterion("project_id not in", values, "projectId");
            return or(criterion);
        }

        public CriterionGroup orProjectIdBetween(Long value1, Long value2) {
            Criterion criterion = new Criterion("project_id between", value1, value2, "projectId");
            return or(criterion);
        }

        public CriterionGroup orProjectIdNotBetween(Long value1, Long value2) {
            Criterion criterion = new Criterion("project_id not between", value1, value2, "projectId");
            return or(criterion);
        }

        public CriterionGroup orEnvironmentIdIsNull() {
            Criterion criterion = new Criterion("environment_id is null");
            return or(criterion);
        }

        public CriterionGroup orEnvironmentIdIsNotNull() {
            Criterion criterion = new Criterion("environment_id is not null");
            return or(criterion);
        }

        public CriterionGroup orEnvironmentIdEqualTo(Long value) {
            return orEnvironmentIdEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orEnvironmentIdEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("environment_id =", value, "environmentId");
            return or(criterion);
        }

        public CriterionGroup orEnvironmentIdNotEqualTo(Long value) {
            return orEnvironmentIdNotEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orEnvironmentIdNotEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("environment_id <>", value, "environmentId");
            return or(criterion);
        }

        public CriterionGroup orEnvironmentIdGreaterThan(Long value) {
            return orEnvironmentIdGreaterThan(value, Boolean.TRUE);
        }

        public CriterionGroup orEnvironmentIdGreaterThan(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("environment_id >", value, "environmentId");
            return or(criterion);
        }

        public CriterionGroup orEnvironmentIdGreaterThanOrEqualTo(Long value) {
            return orEnvironmentIdGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orEnvironmentIdGreaterThanOrEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("environment_id >=", value, "environmentId");
            return or(criterion);
        }

        public CriterionGroup orEnvironmentIdLessThan(Long value) {
            return orEnvironmentIdLessThan(value, Boolean.TRUE);
        }

        public CriterionGroup orEnvironmentIdLessThan(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("environment_id <", value, "environmentId");
            return or(criterion);
        }

        public CriterionGroup orEnvironmentIdLessThanOrEqualTo(Long value) {
            return orEnvironmentIdLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orEnvironmentIdLessThanOrEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("environment_id <=", value, "environmentId");
            return or(criterion);
        }

        public CriterionGroup orEnvironmentIdIn(Collection<Long> values) {
            Criterion criterion = new Criterion("environment_id in", values, "environmentId");
            return or(criterion);
        }

        public CriterionGroup orEnvironmentIdNotIn(Collection<Long> values) {
            Criterion criterion = new Criterion("environment_id not in", values, "environmentId");
            return or(criterion);
        }

        public CriterionGroup orEnvironmentIdBetween(Long value1, Long value2) {
            Criterion criterion = new Criterion("environment_id between", value1, value2, "environmentId");
            return or(criterion);
        }

        public CriterionGroup orEnvironmentIdNotBetween(Long value1, Long value2) {
            Criterion criterion = new Criterion("environment_id not between", value1, value2, "environmentId");
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

        public CriterionGroup orGroupIdIsNull() {
            Criterion criterion = new Criterion("group_id is null");
            return or(criterion);
        }

        public CriterionGroup orGroupIdIsNotNull() {
            Criterion criterion = new Criterion("group_id is not null");
            return or(criterion);
        }

        public CriterionGroup orGroupIdEqualTo(Long value) {
            return orGroupIdEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orGroupIdEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("group_id =", value, "groupId");
            return or(criterion);
        }

        public CriterionGroup orGroupIdNotEqualTo(Long value) {
            return orGroupIdNotEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orGroupIdNotEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("group_id <>", value, "groupId");
            return or(criterion);
        }

        public CriterionGroup orGroupIdGreaterThan(Long value) {
            return orGroupIdGreaterThan(value, Boolean.TRUE);
        }

        public CriterionGroup orGroupIdGreaterThan(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("group_id >", value, "groupId");
            return or(criterion);
        }

        public CriterionGroup orGroupIdGreaterThanOrEqualTo(Long value) {
            return orGroupIdGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orGroupIdGreaterThanOrEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("group_id >=", value, "groupId");
            return or(criterion);
        }

        public CriterionGroup orGroupIdLessThan(Long value) {
            return orGroupIdLessThan(value, Boolean.TRUE);
        }

        public CriterionGroup orGroupIdLessThan(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("group_id <", value, "groupId");
            return or(criterion);
        }

        public CriterionGroup orGroupIdLessThanOrEqualTo(Long value) {
            return orGroupIdLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orGroupIdLessThanOrEqualTo(Long value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("group_id <=", value, "groupId");
            return or(criterion);
        }

        public CriterionGroup orGroupIdIn(Collection<Long> values) {
            Criterion criterion = new Criterion("group_id in", values, "groupId");
            return or(criterion);
        }

        public CriterionGroup orGroupIdNotIn(Collection<Long> values) {
            Criterion criterion = new Criterion("group_id not in", values, "groupId");
            return or(criterion);
        }

        public CriterionGroup orGroupIdBetween(Long value1, Long value2) {
            Criterion criterion = new Criterion("group_id between", value1, value2, "groupId");
            return or(criterion);
        }

        public CriterionGroup orGroupIdNotBetween(Long value1, Long value2) {
            Criterion criterion = new Criterion("group_id not between", value1, value2, "groupId");
            return or(criterion);
        }

        public CriterionGroup orGroupNameIsNull() {
            Criterion criterion = new Criterion("group_name is null");
            return or(criterion);
        }

        public CriterionGroup orGroupNameIsNotNull() {
            Criterion criterion = new Criterion("group_name is not null");
            return or(criterion);
        }

        public CriterionGroup orGroupNameEqualTo(String value) {
            return orGroupNameEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orGroupNameEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("group_name =", value, "groupName");
            return or(criterion);
        }

        public CriterionGroup orGroupNameNotEqualTo(String value) {
            return orGroupNameNotEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orGroupNameNotEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("group_name <>", value, "groupName");
            return or(criterion);
        }

        public CriterionGroup orGroupNameGreaterThan(String value) {
            return orGroupNameGreaterThan(value, Boolean.TRUE);
        }

        public CriterionGroup orGroupNameGreaterThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("group_name >", value, "groupName");
            return or(criterion);
        }

        public CriterionGroup orGroupNameGreaterThanOrEqualTo(String value) {
            return orGroupNameGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orGroupNameGreaterThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("group_name >=", value, "groupName");
            return or(criterion);
        }

        public CriterionGroup orGroupNameLessThan(String value) {
            return orGroupNameLessThan(value, Boolean.TRUE);
        }

        public CriterionGroup orGroupNameLessThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("group_name <", value, "groupName");
            return or(criterion);
        }

        public CriterionGroup orGroupNameLessThanOrEqualTo(String value) {
            return orGroupNameLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orGroupNameLessThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("group_name <=", value, "groupName");
            return or(criterion);
        }

        public CriterionGroup orGroupNameLike(String value) {
            return orGroupNameLike(value, Boolean.TRUE);
        }

        public CriterionGroup orGroupNameLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("group_name like", value, "groupName");
            return or(criterion);
        }

        public CriterionGroup orGroupNameLikeLeft(String value) {
            return orGroupNameLikeLeft(value, Boolean.TRUE);
        }

        public CriterionGroup orGroupNameLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            Criterion criterion = new Criterion("group_name like", value, "groupName");
            return or(criterion);
        }

        public CriterionGroup orGroupNameLikeRight(String value) {
            return orGroupNameLikeRight(value, Boolean.TRUE);
        }

        public CriterionGroup orGroupNameLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("group_name like", value, "groupName");
            return or(criterion);
        }

        public CriterionGroup orGroupNameLikeBoth(String value) {
            return orGroupNameLikeBoth(value, Boolean.TRUE);
        }

        public CriterionGroup orGroupNameLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("group_name like", value, "groupName");
            return or(criterion);
        }

        public CriterionGroup orGroupNameNotLike(String value) {
            return orGroupNameNotLike(value, Boolean.TRUE);
        }

        public CriterionGroup orGroupNameNotLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("group_name not like", value, "groupName");
            return or(criterion);
        }

        public CriterionGroup orGroupNameNotLikeLeft(String value) {
            return orGroupNameNotLikeLeft(value, Boolean.TRUE);
        }

        public CriterionGroup orGroupNameNotLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            Criterion criterion = new Criterion("group_name not like", value, "groupName");
            return or(criterion);
        }

        public CriterionGroup orGroupNameNotLikeRight(String value) {
            return orGroupNameNotLikeRight(value, Boolean.TRUE);
        }

        public CriterionGroup orGroupNameNotLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("group_name not like", value, "groupName");
            return or(criterion);
        }

        public CriterionGroup orGroupNameNotLikeBoth(String value) {
            return orGroupNameNotLikeBoth(value, Boolean.TRUE);
        }

        public CriterionGroup orGroupNameNotLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("group_name not like", value, "groupName");
            return or(criterion);
        }

        public CriterionGroup orGroupNameIn(Collection<String> values) {
            Criterion criterion = new Criterion("group_name in", values, "groupName");
            return or(criterion);
        }

        public CriterionGroup orGroupNameNotIn(Collection<String> values) {
            Criterion criterion = new Criterion("group_name not in", values, "groupName");
            return or(criterion);
        }

        public CriterionGroup orGroupNameBetween(String value1, String value2) {
            Criterion criterion = new Criterion("group_name between", value1, value2, "groupName");
            return or(criterion);
        }

        public CriterionGroup orGroupNameNotBetween(String value1, String value2) {
            Criterion criterion = new Criterion("group_name not between", value1, value2, "groupName");
            return or(criterion);
        }

        public CriterionGroup orOperatorIsNull() {
            Criterion criterion = new Criterion("operator is null");
            return or(criterion);
        }

        public CriterionGroup orOperatorIsNotNull() {
            Criterion criterion = new Criterion("operator is not null");
            return or(criterion);
        }

        public CriterionGroup orOperatorEqualTo(String value) {
            return orOperatorEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orOperatorEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("operator =", value, "operator");
            return or(criterion);
        }

        public CriterionGroup orOperatorNotEqualTo(String value) {
            return orOperatorNotEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orOperatorNotEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("operator <>", value, "operator");
            return or(criterion);
        }

        public CriterionGroup orOperatorGreaterThan(String value) {
            return orOperatorGreaterThan(value, Boolean.TRUE);
        }

        public CriterionGroup orOperatorGreaterThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("operator >", value, "operator");
            return or(criterion);
        }

        public CriterionGroup orOperatorGreaterThanOrEqualTo(String value) {
            return orOperatorGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orOperatorGreaterThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("operator >=", value, "operator");
            return or(criterion);
        }

        public CriterionGroup orOperatorLessThan(String value) {
            return orOperatorLessThan(value, Boolean.TRUE);
        }

        public CriterionGroup orOperatorLessThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("operator <", value, "operator");
            return or(criterion);
        }

        public CriterionGroup orOperatorLessThanOrEqualTo(String value) {
            return orOperatorLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orOperatorLessThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("operator <=", value, "operator");
            return or(criterion);
        }

        public CriterionGroup orOperatorLike(String value) {
            return orOperatorLike(value, Boolean.TRUE);
        }

        public CriterionGroup orOperatorLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("operator like", value, "operator");
            return or(criterion);
        }

        public CriterionGroup orOperatorLikeLeft(String value) {
            return orOperatorLikeLeft(value, Boolean.TRUE);
        }

        public CriterionGroup orOperatorLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            Criterion criterion = new Criterion("operator like", value, "operator");
            return or(criterion);
        }

        public CriterionGroup orOperatorLikeRight(String value) {
            return orOperatorLikeRight(value, Boolean.TRUE);
        }

        public CriterionGroup orOperatorLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("operator like", value, "operator");
            return or(criterion);
        }

        public CriterionGroup orOperatorLikeBoth(String value) {
            return orOperatorLikeBoth(value, Boolean.TRUE);
        }

        public CriterionGroup orOperatorLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("operator like", value, "operator");
            return or(criterion);
        }

        public CriterionGroup orOperatorNotLike(String value) {
            return orOperatorNotLike(value, Boolean.TRUE);
        }

        public CriterionGroup orOperatorNotLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("operator not like", value, "operator");
            return or(criterion);
        }

        public CriterionGroup orOperatorNotLikeLeft(String value) {
            return orOperatorNotLikeLeft(value, Boolean.TRUE);
        }

        public CriterionGroup orOperatorNotLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            Criterion criterion = new Criterion("operator not like", value, "operator");
            return or(criterion);
        }

        public CriterionGroup orOperatorNotLikeRight(String value) {
            return orOperatorNotLikeRight(value, Boolean.TRUE);
        }

        public CriterionGroup orOperatorNotLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("operator not like", value, "operator");
            return or(criterion);
        }

        public CriterionGroup orOperatorNotLikeBoth(String value) {
            return orOperatorNotLikeBoth(value, Boolean.TRUE);
        }

        public CriterionGroup orOperatorNotLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("operator not like", value, "operator");
            return or(criterion);
        }

        public CriterionGroup orOperatorIn(Collection<String> values) {
            Criterion criterion = new Criterion("operator in", values, "operator");
            return or(criterion);
        }

        public CriterionGroup orOperatorNotIn(Collection<String> values) {
            Criterion criterion = new Criterion("operator not in", values, "operator");
            return or(criterion);
        }

        public CriterionGroup orOperatorBetween(String value1, String value2) {
            Criterion criterion = new Criterion("operator between", value1, value2, "operator");
            return or(criterion);
        }

        public CriterionGroup orOperatorNotBetween(String value1, String value2) {
            Criterion criterion = new Criterion("operator not between", value1, value2, "operator");
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

    public static final class Builder extends BaseExampleBuilder<Builder, ConfigChangeLogExample> {

        protected List<Criteria> oredCriteria;

        private Builder() {

        }

        public Builder oredCriteria(List<Criteria> oredCriteria) {
            this.oredCriteria = oredCriteria;
            return this;
        }

        @Override
        public ConfigChangeLogExample build() {
            return new ConfigChangeLogExample(this);
        }
    }
}

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

public class EnvironmentUserExample extends BaseExample {

    protected List<Criteria> oredCriteria;

    private EnvironmentUserExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * 环境用户关系
     */
    private EnvironmentUserExample(Builder builder) {
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

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            return andUserNameEqualTo(value, Boolean.TRUE);
        }

        public Criteria andUserNameEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            return andUserNameNotEqualTo(value, Boolean.TRUE);
        }

        public Criteria andUserNameNotEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            return andUserNameGreaterThan(value, Boolean.TRUE);
        }

        public Criteria andUserNameGreaterThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            return andUserNameGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            return andUserNameLessThan(value, Boolean.TRUE);
        }

        public Criteria andUserNameLessThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            return andUserNameLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andUserNameLessThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            return andUserNameLike(value, Boolean.TRUE);
        }

        public Criteria andUserNameLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLikeLeft(String value) {
            return andUserNameLikeLeft(value, Boolean.TRUE);
        }

        public Criteria andUserNameLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLikeRight(String value) {
            return andUserNameLikeRight(value, Boolean.TRUE);
        }

        public Criteria andUserNameLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLikeBoth(String value) {
            return andUserNameLikeBoth(value, Boolean.TRUE);
        }

        public Criteria andUserNameLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            return andUserNameNotLike(value, Boolean.TRUE);
        }

        public Criteria andUserNameNotLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLikeLeft(String value) {
            return andUserNameNotLikeLeft(value, Boolean.TRUE);
        }

        public Criteria andUserNameNotLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLikeRight(String value) {
            return andUserNameNotLikeRight(value, Boolean.TRUE);
        }

        public Criteria andUserNameNotLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLikeBoth(String value) {
            return andUserNameNotLikeBoth(value, Boolean.TRUE);
        }

        public Criteria andUserNameNotLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(Collection<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(Collection<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andPriTypeIsNull() {
            addCriterion("pri_type is null");
            return (Criteria) this;
        }

        public Criteria andPriTypeIsNotNull() {
            addCriterion("pri_type is not null");
            return (Criteria) this;
        }

        public Criteria andPriTypeEqualTo(Byte value) {
            return andPriTypeEqualTo(value, Boolean.TRUE);
        }

        public Criteria andPriTypeEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("pri_type =", value, "priType");
            return (Criteria) this;
        }

        public Criteria andPriTypeNotEqualTo(Byte value) {
            return andPriTypeNotEqualTo(value, Boolean.TRUE);
        }

        public Criteria andPriTypeNotEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("pri_type <>", value, "priType");
            return (Criteria) this;
        }

        public Criteria andPriTypeGreaterThan(Byte value) {
            return andPriTypeGreaterThan(value, Boolean.TRUE);
        }

        public Criteria andPriTypeGreaterThan(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("pri_type >", value, "priType");
            return (Criteria) this;
        }

        public Criteria andPriTypeGreaterThanOrEqualTo(Byte value) {
            return andPriTypeGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andPriTypeGreaterThanOrEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("pri_type >=", value, "priType");
            return (Criteria) this;
        }

        public Criteria andPriTypeLessThan(Byte value) {
            return andPriTypeLessThan(value, Boolean.TRUE);
        }

        public Criteria andPriTypeLessThan(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("pri_type <", value, "priType");
            return (Criteria) this;
        }

        public Criteria andPriTypeLessThanOrEqualTo(Byte value) {
            return andPriTypeLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andPriTypeLessThanOrEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("pri_type <=", value, "priType");
            return (Criteria) this;
        }

        public Criteria andPriTypeIn(Collection<Byte> values) {
            addCriterion("pri_type in", values, "priType");
            return (Criteria) this;
        }

        public Criteria andPriTypeNotIn(Collection<Byte> values) {
            addCriterion("pri_type not in", values, "priType");
            return (Criteria) this;
        }

        public Criteria andPriTypeBetween(Byte value1, Byte value2) {
            addCriterion("pri_type between", value1, value2, "priType");
            return (Criteria) this;
        }

        public Criteria andPriTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("pri_type not between", value1, value2, "priType");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            return andUpdateTimeEqualTo(value, Boolean.TRUE);
        }

        public Criteria andUpdateTimeEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            return andUpdateTimeNotEqualTo(value, Boolean.TRUE);
        }

        public Criteria andUpdateTimeNotEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            return andUpdateTimeGreaterThan(value, Boolean.TRUE);
        }

        public Criteria andUpdateTimeGreaterThan(Date value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            return andUpdateTimeGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            return andUpdateTimeLessThan(value, Boolean.TRUE);
        }

        public Criteria andUpdateTimeLessThan(Date value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            return andUpdateTimeLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(Collection<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(Collection<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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

        private EnvironmentUserExample example;

        protected Criteria(EnvironmentUserExample example) {
            super();
            this.example = example;
        }

        public EnvironmentUserExample toExample() {
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

        public CriterionGroup orUserNameIsNull() {
            Criterion criterion = new Criterion("user_name is null");
            return or(criterion);
        }

        public CriterionGroup orUserNameIsNotNull() {
            Criterion criterion = new Criterion("user_name is not null");
            return or(criterion);
        }

        public CriterionGroup orUserNameEqualTo(String value) {
            return orUserNameEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orUserNameEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("user_name =", value, "userName");
            return or(criterion);
        }

        public CriterionGroup orUserNameNotEqualTo(String value) {
            return orUserNameNotEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orUserNameNotEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("user_name <>", value, "userName");
            return or(criterion);
        }

        public CriterionGroup orUserNameGreaterThan(String value) {
            return orUserNameGreaterThan(value, Boolean.TRUE);
        }

        public CriterionGroup orUserNameGreaterThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("user_name >", value, "userName");
            return or(criterion);
        }

        public CriterionGroup orUserNameGreaterThanOrEqualTo(String value) {
            return orUserNameGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orUserNameGreaterThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("user_name >=", value, "userName");
            return or(criterion);
        }

        public CriterionGroup orUserNameLessThan(String value) {
            return orUserNameLessThan(value, Boolean.TRUE);
        }

        public CriterionGroup orUserNameLessThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("user_name <", value, "userName");
            return or(criterion);
        }

        public CriterionGroup orUserNameLessThanOrEqualTo(String value) {
            return orUserNameLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orUserNameLessThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("user_name <=", value, "userName");
            return or(criterion);
        }

        public CriterionGroup orUserNameLike(String value) {
            return orUserNameLike(value, Boolean.TRUE);
        }

        public CriterionGroup orUserNameLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("user_name like", value, "userName");
            return or(criterion);
        }

        public CriterionGroup orUserNameLikeLeft(String value) {
            return orUserNameLikeLeft(value, Boolean.TRUE);
        }

        public CriterionGroup orUserNameLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            Criterion criterion = new Criterion("user_name like", value, "userName");
            return or(criterion);
        }

        public CriterionGroup orUserNameLikeRight(String value) {
            return orUserNameLikeRight(value, Boolean.TRUE);
        }

        public CriterionGroup orUserNameLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("user_name like", value, "userName");
            return or(criterion);
        }

        public CriterionGroup orUserNameLikeBoth(String value) {
            return orUserNameLikeBoth(value, Boolean.TRUE);
        }

        public CriterionGroup orUserNameLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("user_name like", value, "userName");
            return or(criterion);
        }

        public CriterionGroup orUserNameNotLike(String value) {
            return orUserNameNotLike(value, Boolean.TRUE);
        }

        public CriterionGroup orUserNameNotLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("user_name not like", value, "userName");
            return or(criterion);
        }

        public CriterionGroup orUserNameNotLikeLeft(String value) {
            return orUserNameNotLikeLeft(value, Boolean.TRUE);
        }

        public CriterionGroup orUserNameNotLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            Criterion criterion = new Criterion("user_name not like", value, "userName");
            return or(criterion);
        }

        public CriterionGroup orUserNameNotLikeRight(String value) {
            return orUserNameNotLikeRight(value, Boolean.TRUE);
        }

        public CriterionGroup orUserNameNotLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("user_name not like", value, "userName");
            return or(criterion);
        }

        public CriterionGroup orUserNameNotLikeBoth(String value) {
            return orUserNameNotLikeBoth(value, Boolean.TRUE);
        }

        public CriterionGroup orUserNameNotLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("user_name not like", value, "userName");
            return or(criterion);
        }

        public CriterionGroup orUserNameIn(Collection<String> values) {
            Criterion criterion = new Criterion("user_name in", values, "userName");
            return or(criterion);
        }

        public CriterionGroup orUserNameNotIn(Collection<String> values) {
            Criterion criterion = new Criterion("user_name not in", values, "userName");
            return or(criterion);
        }

        public CriterionGroup orUserNameBetween(String value1, String value2) {
            Criterion criterion = new Criterion("user_name between", value1, value2, "userName");
            return or(criterion);
        }

        public CriterionGroup orUserNameNotBetween(String value1, String value2) {
            Criterion criterion = new Criterion("user_name not between", value1, value2, "userName");
            return or(criterion);
        }

        public CriterionGroup orPriTypeIsNull() {
            Criterion criterion = new Criterion("pri_type is null");
            return or(criterion);
        }

        public CriterionGroup orPriTypeIsNotNull() {
            Criterion criterion = new Criterion("pri_type is not null");
            return or(criterion);
        }

        public CriterionGroup orPriTypeEqualTo(Byte value) {
            return orPriTypeEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orPriTypeEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("pri_type =", value, "priType");
            return or(criterion);
        }

        public CriterionGroup orPriTypeNotEqualTo(Byte value) {
            return orPriTypeNotEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orPriTypeNotEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("pri_type <>", value, "priType");
            return or(criterion);
        }

        public CriterionGroup orPriTypeGreaterThan(Byte value) {
            return orPriTypeGreaterThan(value, Boolean.TRUE);
        }

        public CriterionGroup orPriTypeGreaterThan(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("pri_type >", value, "priType");
            return or(criterion);
        }

        public CriterionGroup orPriTypeGreaterThanOrEqualTo(Byte value) {
            return orPriTypeGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orPriTypeGreaterThanOrEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("pri_type >=", value, "priType");
            return or(criterion);
        }

        public CriterionGroup orPriTypeLessThan(Byte value) {
            return orPriTypeLessThan(value, Boolean.TRUE);
        }

        public CriterionGroup orPriTypeLessThan(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("pri_type <", value, "priType");
            return or(criterion);
        }

        public CriterionGroup orPriTypeLessThanOrEqualTo(Byte value) {
            return orPriTypeLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orPriTypeLessThanOrEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("pri_type <=", value, "priType");
            return or(criterion);
        }

        public CriterionGroup orPriTypeIn(Collection<Byte> values) {
            Criterion criterion = new Criterion("pri_type in", values, "priType");
            return or(criterion);
        }

        public CriterionGroup orPriTypeNotIn(Collection<Byte> values) {
            Criterion criterion = new Criterion("pri_type not in", values, "priType");
            return or(criterion);
        }

        public CriterionGroup orPriTypeBetween(Byte value1, Byte value2) {
            Criterion criterion = new Criterion("pri_type between", value1, value2, "priType");
            return or(criterion);
        }

        public CriterionGroup orPriTypeNotBetween(Byte value1, Byte value2) {
            Criterion criterion = new Criterion("pri_type not between", value1, value2, "priType");
            return or(criterion);
        }

        public CriterionGroup orUpdateTimeIsNull() {
            Criterion criterion = new Criterion("update_time is null");
            return or(criterion);
        }

        public CriterionGroup orUpdateTimeIsNotNull() {
            Criterion criterion = new Criterion("update_time is not null");
            return or(criterion);
        }

        public CriterionGroup orUpdateTimeEqualTo(Date value) {
            return orUpdateTimeEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orUpdateTimeEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("update_time =", value, "updateTime");
            return or(criterion);
        }

        public CriterionGroup orUpdateTimeNotEqualTo(Date value) {
            return orUpdateTimeNotEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orUpdateTimeNotEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("update_time <>", value, "updateTime");
            return or(criterion);
        }

        public CriterionGroup orUpdateTimeGreaterThan(Date value) {
            return orUpdateTimeGreaterThan(value, Boolean.TRUE);
        }

        public CriterionGroup orUpdateTimeGreaterThan(Date value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("update_time >", value, "updateTime");
            return or(criterion);
        }

        public CriterionGroup orUpdateTimeGreaterThanOrEqualTo(Date value) {
            return orUpdateTimeGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orUpdateTimeGreaterThanOrEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("update_time >=", value, "updateTime");
            return or(criterion);
        }

        public CriterionGroup orUpdateTimeLessThan(Date value) {
            return orUpdateTimeLessThan(value, Boolean.TRUE);
        }

        public CriterionGroup orUpdateTimeLessThan(Date value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("update_time <", value, "updateTime");
            return or(criterion);
        }

        public CriterionGroup orUpdateTimeLessThanOrEqualTo(Date value) {
            return orUpdateTimeLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orUpdateTimeLessThanOrEqualTo(Date value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("update_time <=", value, "updateTime");
            return or(criterion);
        }

        public CriterionGroup orUpdateTimeIn(Collection<Date> values) {
            Criterion criterion = new Criterion("update_time in", values, "updateTime");
            return or(criterion);
        }

        public CriterionGroup orUpdateTimeNotIn(Collection<Date> values) {
            Criterion criterion = new Criterion("update_time not in", values, "updateTime");
            return or(criterion);
        }

        public CriterionGroup orUpdateTimeBetween(Date value1, Date value2) {
            Criterion criterion = new Criterion("update_time between", value1, value2, "updateTime");
            return or(criterion);
        }

        public CriterionGroup orUpdateTimeNotBetween(Date value1, Date value2) {
            Criterion criterion = new Criterion("update_time not between", value1, value2, "updateTime");
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

    public static final class Builder extends BaseExampleBuilder<Builder, EnvironmentUserExample> {

        protected List<Criteria> oredCriteria;

        private Builder() {

        }

        public Builder oredCriteria(List<Criteria> oredCriteria) {
            this.oredCriteria = oredCriteria;
            return this;
        }

        @Override
        public EnvironmentUserExample build() {
            return new EnvironmentUserExample(this);
        }
    }
}

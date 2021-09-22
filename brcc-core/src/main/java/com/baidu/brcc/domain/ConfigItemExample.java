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

public class ConfigItemExample extends BaseExample {

    protected List<Criteria> oredCriteria;

    private ConfigItemExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * 配置项
     */
    private ConfigItemExample(Builder builder) {
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
        criteria.and = false;
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        criteria.and = false;
        oredCriteria.add(criteria);
        return criteria;
    }

    public void and(Criteria criteria) {
        criteria.and = true;
        oredCriteria.add(criteria);
    }

    public Criteria and() {
        Criteria criteria = createCriteriaInternal();
        criteria.and = true;
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            return andNameEqualTo(value, Boolean.TRUE);
        }

        public Criteria andNameEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            return andNameNotEqualTo(value, Boolean.TRUE);
        }

        public Criteria andNameNotEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            return andNameGreaterThan(value, Boolean.TRUE);
        }

        public Criteria andNameGreaterThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            return andNameGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andNameGreaterThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            return andNameLessThan(value, Boolean.TRUE);
        }

        public Criteria andNameLessThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            return andNameLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andNameLessThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            return andNameLike(value, Boolean.TRUE);
        }

        public Criteria andNameLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLikeLeft(String value) {
            return andNameLikeLeft(value, Boolean.TRUE);
        }

        public Criteria andNameLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLikeRight(String value) {
            return andNameLikeRight(value, Boolean.TRUE);
        }

        public Criteria andNameLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLikeBoth(String value) {
            return andNameLikeBoth(value, Boolean.TRUE);
        }

        public Criteria andNameLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            return andNameNotLike(value, Boolean.TRUE);
        }

        public Criteria andNameNotLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLikeLeft(String value) {
            return andNameNotLikeLeft(value, Boolean.TRUE);
        }

        public Criteria andNameNotLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLikeRight(String value) {
            return andNameNotLikeRight(value, Boolean.TRUE);
        }

        public Criteria andNameNotLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLikeBoth(String value) {
            return andNameNotLikeBoth(value, Boolean.TRUE);
        }

        public Criteria andNameNotLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(Collection<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(Collection<String> values, Boolean condition) {
            if (condition == null || !condition) {
                return (Criteria) this;
            }
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(Collection<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("memo is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("memo is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            return andMemoEqualTo(value, Boolean.TRUE);
        }

        public Criteria andMemoEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("memo =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            return andMemoNotEqualTo(value, Boolean.TRUE);
        }

        public Criteria andMemoNotEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("memo <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            return andMemoGreaterThan(value, Boolean.TRUE);
        }

        public Criteria andMemoGreaterThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("memo >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            return andMemoGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("memo >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            return andMemoLessThan(value, Boolean.TRUE);
        }

        public Criteria andMemoLessThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("memo <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            return andMemoLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andMemoLessThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("memo <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            return andMemoLike(value, Boolean.TRUE);
        }

        public Criteria andMemoLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLikeLeft(String value) {
            return andMemoLikeLeft(value, Boolean.TRUE);
        }

        public Criteria andMemoLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            addCriterion("memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLikeRight(String value) {
            return andMemoLikeRight(value, Boolean.TRUE);
        }

        public Criteria andMemoLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLikeBoth(String value) {
            return andMemoLikeBoth(value, Boolean.TRUE);
        }

        public Criteria andMemoLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            return andMemoNotLike(value, Boolean.TRUE);
        }

        public Criteria andMemoNotLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLikeLeft(String value) {
            return andMemoNotLikeLeft(value, Boolean.TRUE);
        }

        public Criteria andMemoNotLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            addCriterion("memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLikeRight(String value) {
            return andMemoNotLikeRight(value, Boolean.TRUE);
        }

        public Criteria andMemoNotLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLikeBoth(String value) {
            return andMemoNotLikeBoth(value, Boolean.TRUE);
        }

        public Criteria andMemoNotLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(Collection<String> values) {
            addCriterion("memo in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(Collection<String> values) {
            addCriterion("memo not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("memo between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("memo not between", value1, value2, "memo");
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

        public Criteria andTypeIdIsNull() {
            addCriterion("type_id is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(Integer value) {
            return andTypeIdEqualTo(value, Boolean.TRUE);
        }

        public Criteria andTypeIdEqualTo(Integer value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("type_id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(Integer value) {
            return andTypeIdNotEqualTo(value, Boolean.TRUE);
        }

        public Criteria andTypeIdNotEqualTo(Integer value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("type_id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(Integer value) {
            return andTypeIdGreaterThan(value, Boolean.TRUE);
        }

        public Criteria andTypeIdGreaterThan(Integer value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("type_id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(Integer value) {
            return andTypeIdGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(Integer value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("type_id >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(Integer value) {
            return andTypeIdLessThan(value, Boolean.TRUE);
        }

        public Criteria andTypeIdLessThan(Integer value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("type_id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(Integer value) {
            return andTypeIdLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andTypeIdLessThanOrEqualTo(Integer value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("type_id <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(Collection<Integer> values) {
            addCriterion("type_id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(Collection<Integer> values) {
            addCriterion("type_id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("type_id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("type_id not between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andValIsNull() {
            addCriterion("val is null");
            return (Criteria) this;
        }

        public Criteria andValIsNotNull() {
            addCriterion("val is not null");
            return (Criteria) this;
        }

        public Criteria andValEqualTo(String value) {
            return andValEqualTo(value, Boolean.TRUE);
        }

        public Criteria andValEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("val =", value, "val");
            return (Criteria) this;
        }

        public Criteria andValNotEqualTo(String value) {
            return andValNotEqualTo(value, Boolean.TRUE);
        }

        public Criteria andValNotEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("val <>", value, "val");
            return (Criteria) this;
        }

        public Criteria andValGreaterThan(String value) {
            return andValGreaterThan(value, Boolean.TRUE);
        }

        public Criteria andValGreaterThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("val >", value, "val");
            return (Criteria) this;
        }

        public Criteria andValGreaterThanOrEqualTo(String value) {
            return andValGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andValGreaterThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("val >=", value, "val");
            return (Criteria) this;
        }

        public Criteria andValLessThan(String value) {
            return andValLessThan(value, Boolean.TRUE);
        }

        public Criteria andValLessThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("val <", value, "val");
            return (Criteria) this;
        }

        public Criteria andValLessThanOrEqualTo(String value) {
            return andValLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andValLessThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("val <=", value, "val");
            return (Criteria) this;
        }

        public Criteria andValLike(String value) {
            return andValLike(value, Boolean.TRUE);
        }

        public Criteria andValLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("val like", value, "val");
            return (Criteria) this;
        }

        public Criteria andValLikeLeft(String value) {
            return andValLikeLeft(value, Boolean.TRUE);
        }

        public Criteria andValLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            addCriterion("val like", value, "val");
            return (Criteria) this;
        }

        public Criteria andValLikeRight(String value) {
            return andValLikeRight(value, Boolean.TRUE);
        }

        public Criteria andValLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("val like", value, "val");
            return (Criteria) this;
        }

        public Criteria andValLikeBoth(String value) {
            return andValLikeBoth(value, Boolean.TRUE);
        }

        public Criteria andValLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("val like", value, "val");
            return (Criteria) this;
        }

        public Criteria andValNotLike(String value) {
            return andValNotLike(value, Boolean.TRUE);
        }

        public Criteria andValNotLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("val not like", value, "val");
            return (Criteria) this;
        }

        public Criteria andValNotLikeLeft(String value) {
            return andValNotLikeLeft(value, Boolean.TRUE);
        }

        public Criteria andValNotLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            addCriterion("val not like", value, "val");
            return (Criteria) this;
        }

        public Criteria andValNotLikeRight(String value) {
            return andValNotLikeRight(value, Boolean.TRUE);
        }

        public Criteria andValNotLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("val not like", value, "val");
            return (Criteria) this;
        }

        public Criteria andValNotLikeBoth(String value) {
            return andValNotLikeBoth(value, Boolean.TRUE);
        }

        public Criteria andValNotLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("val not like", value, "val");
            return (Criteria) this;
        }

        public Criteria andValIn(Collection<String> values) {
            addCriterion("val in", values, "val");
            return (Criteria) this;
        }

        public Criteria andValNotIn(Collection<String> values) {
            addCriterion("val not in", values, "val");
            return (Criteria) this;
        }

        public Criteria andValBetween(String value1, String value2) {
            addCriterion("val between", value1, value2, "val");
            return (Criteria) this;
        }

        public Criteria andValNotBetween(String value1, String value2) {
            addCriterion("val not between", value1, value2, "val");
            return (Criteria) this;
        }

        public Criteria andShareableIsNull() {
            addCriterion("shareable is null");
            return (Criteria) this;
        }

        public Criteria andShareableIsNotNull() {
            addCriterion("shareable is not null");
            return (Criteria) this;
        }

        public Criteria andShareableEqualTo(Byte value) {
            return andShareableEqualTo(value, Boolean.TRUE);
        }

        public Criteria andShareableEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("shareable =", value, "shareable");
            return (Criteria) this;
        }

        public Criteria andShareableNotEqualTo(Byte value) {
            return andShareableNotEqualTo(value, Boolean.TRUE);
        }

        public Criteria andShareableNotEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("shareable <>", value, "shareable");
            return (Criteria) this;
        }

        public Criteria andShareableGreaterThan(Byte value) {
            return andShareableGreaterThan(value, Boolean.TRUE);
        }

        public Criteria andShareableGreaterThan(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("shareable >", value, "shareable");
            return (Criteria) this;
        }

        public Criteria andShareableGreaterThanOrEqualTo(Byte value) {
            return andShareableGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andShareableGreaterThanOrEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("shareable >=", value, "shareable");
            return (Criteria) this;
        }

        public Criteria andShareableLessThan(Byte value) {
            return andShareableLessThan(value, Boolean.TRUE);
        }

        public Criteria andShareableLessThan(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("shareable <", value, "shareable");
            return (Criteria) this;
        }

        public Criteria andShareableLessThanOrEqualTo(Byte value) {
            return andShareableLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andShareableLessThanOrEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("shareable <=", value, "shareable");
            return (Criteria) this;
        }

        public Criteria andShareableIn(Collection<Byte> values) {
            addCriterion("shareable in", values, "shareable");
            return (Criteria) this;
        }

        public Criteria andShareableNotIn(Collection<Byte> values) {
            addCriterion("shareable not in", values, "shareable");
            return (Criteria) this;
        }

        public Criteria andShareableBetween(Byte value1, Byte value2) {
            addCriterion("shareable between", value1, value2, "shareable");
            return (Criteria) this;
        }

        public Criteria andShareableNotBetween(Byte value1, Byte value2) {
            addCriterion("shareable not between", value1, value2, "shareable");
            return (Criteria) this;
        }

        public Criteria andRefIsNull() {
            addCriterion("ref is null");
            return (Criteria) this;
        }

        public Criteria andRefIsNotNull() {
            addCriterion("ref is not null");
            return (Criteria) this;
        }

        public Criteria andRefEqualTo(Byte value) {
            return andRefEqualTo(value, Boolean.TRUE);
        }

        public Criteria andRefEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("ref =", value, "ref");
            return (Criteria) this;
        }

        public Criteria andRefNotEqualTo(Byte value) {
            return andRefNotEqualTo(value, Boolean.TRUE);
        }

        public Criteria andRefNotEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("ref <>", value, "ref");
            return (Criteria) this;
        }

        public Criteria andRefGreaterThan(Byte value) {
            return andRefGreaterThan(value, Boolean.TRUE);
        }

        public Criteria andRefGreaterThan(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("ref >", value, "ref");
            return (Criteria) this;
        }

        public Criteria andRefGreaterThanOrEqualTo(Byte value) {
            return andRefGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andRefGreaterThanOrEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("ref >=", value, "ref");
            return (Criteria) this;
        }

        public Criteria andRefLessThan(Byte value) {
            return andRefLessThan(value, Boolean.TRUE);
        }

        public Criteria andRefLessThan(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("ref <", value, "ref");
            return (Criteria) this;
        }

        public Criteria andRefLessThanOrEqualTo(Byte value) {
            return andRefLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andRefLessThanOrEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("ref <=", value, "ref");
            return (Criteria) this;
        }

        public Criteria andRefIn(Collection<Byte> values) {
            addCriterion("ref in", values, "ref");
            return (Criteria) this;
        }

        public Criteria andRefNotIn(Collection<Byte> values) {
            addCriterion("ref not in", values, "ref");
            return (Criteria) this;
        }

        public Criteria andRefBetween(Byte value1, Byte value2) {
            addCriterion("ref between", value1, value2, "ref");
            return (Criteria) this;
        }

        public Criteria andRefNotBetween(Byte value1, Byte value2) {
            addCriterion("ref not between", value1, value2, "ref");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNull() {
            addCriterion("deleted is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("deleted is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(Byte value) {
            return andDeletedEqualTo(value, Boolean.TRUE);
        }

        public Criteria andDeletedEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("deleted =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Byte value) {
            return andDeletedNotEqualTo(value, Boolean.TRUE);
        }

        public Criteria andDeletedNotEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Byte value) {
            return andDeletedGreaterThan(value, Boolean.TRUE);
        }

        public Criteria andDeletedGreaterThan(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Byte value) {
            return andDeletedGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Byte value) {
            return andDeletedLessThan(value, Boolean.TRUE);
        }

        public Criteria andDeletedLessThan(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Byte value) {
            return andDeletedLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andDeletedLessThanOrEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedIn(Collection<Byte> values) {
            addCriterion("deleted in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(Collection<Byte> values) {
            addCriterion("deleted not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(Byte value1, Byte value2) {
            addCriterion("deleted between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(Byte value1, Byte value2) {
            addCriterion("deleted not between", value1, value2, "deleted");
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

        private boolean and;

        private ConfigItemExample example;

        protected Criteria(ConfigItemExample example) {
            super();
            this.example = example;
        }

        public ConfigItemExample toExample() {
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

        public boolean isAnd() {
            return and;
        }

        public void setAnd(boolean and) {
            this.and = and;
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

        public CriterionGroup orNameIsNull() {
            Criterion criterion = new Criterion("name is null");
            return or(criterion);
        }

        public CriterionGroup orNameIsNotNull() {
            Criterion criterion = new Criterion("name is not null");
            return or(criterion);
        }

        public CriterionGroup orNameEqualTo(String value) {
            return orNameEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orNameEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("name =", value, "name");
            return or(criterion);
        }

        public CriterionGroup orNameNotEqualTo(String value) {
            return orNameNotEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orNameNotEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("name <>", value, "name");
            return or(criterion);
        }

        public CriterionGroup orNameGreaterThan(String value) {
            return orNameGreaterThan(value, Boolean.TRUE);
        }

        public CriterionGroup orNameGreaterThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("name >", value, "name");
            return or(criterion);
        }

        public CriterionGroup orNameGreaterThanOrEqualTo(String value) {
            return orNameGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orNameGreaterThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("name >=", value, "name");
            return or(criterion);
        }

        public CriterionGroup orNameLessThan(String value) {
            return orNameLessThan(value, Boolean.TRUE);
        }

        public CriterionGroup orNameLessThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("name <", value, "name");
            return or(criterion);
        }

        public CriterionGroup orNameLessThanOrEqualTo(String value) {
            return orNameLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orNameLessThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("name <=", value, "name");
            return or(criterion);
        }

        public CriterionGroup orNameLike(String value) {
            return orNameLike(value, Boolean.TRUE);
        }

        public CriterionGroup orNameLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("name like", value, "name");
            return or(criterion);
        }

        public CriterionGroup orNameLikeLeft(String value) {
            return orNameLikeLeft(value, Boolean.TRUE);
        }

        public CriterionGroup orNameLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            Criterion criterion = new Criterion("name like", value, "name");
            return or(criterion);
        }

        public CriterionGroup orNameLikeRight(String value) {
            return orNameLikeRight(value, Boolean.TRUE);
        }

        public CriterionGroup orNameLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("name like", value, "name");
            return or(criterion);
        }

        public CriterionGroup orNameLikeBoth(String value) {
            return orNameLikeBoth(value, Boolean.TRUE);
        }

        public CriterionGroup orNameLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("name like", value, "name");
            return or(criterion);
        }

        public CriterionGroup orNameNotLike(String value) {
            return orNameNotLike(value, Boolean.TRUE);
        }

        public CriterionGroup orNameNotLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("name not like", value, "name");
            return or(criterion);
        }

        public CriterionGroup orNameNotLikeLeft(String value) {
            return orNameNotLikeLeft(value, Boolean.TRUE);
        }

        public CriterionGroup orNameNotLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            Criterion criterion = new Criterion("name not like", value, "name");
            return or(criterion);
        }

        public CriterionGroup orNameNotLikeRight(String value) {
            return orNameNotLikeRight(value, Boolean.TRUE);
        }

        public CriterionGroup orNameNotLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("name not like", value, "name");
            return or(criterion);
        }

        public CriterionGroup orNameNotLikeBoth(String value) {
            return orNameNotLikeBoth(value, Boolean.TRUE);
        }

        public CriterionGroup orNameNotLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("name not like", value, "name");
            return or(criterion);
        }

        public CriterionGroup orNameIn(Collection<String> values) {
            Criterion criterion = new Criterion("name in", values, "name");
            return or(criterion);
        }

        public CriterionGroup orNameNotIn(Collection<String> values) {
            Criterion criterion = new Criterion("name not in", values, "name");
            return or(criterion);
        }

        public CriterionGroup orNameBetween(String value1, String value2) {
            Criterion criterion = new Criterion("name between", value1, value2, "name");
            return or(criterion);
        }

        public CriterionGroup orNameNotBetween(String value1, String value2) {
            Criterion criterion = new Criterion("name not between", value1, value2, "name");
            return or(criterion);
        }

        public CriterionGroup orMemoIsNull() {
            Criterion criterion = new Criterion("memo is null");
            return or(criterion);
        }

        public CriterionGroup orMemoIsNotNull() {
            Criterion criterion = new Criterion("memo is not null");
            return or(criterion);
        }

        public CriterionGroup orMemoEqualTo(String value) {
            return orMemoEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orMemoEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("memo =", value, "memo");
            return or(criterion);
        }

        public CriterionGroup orMemoNotEqualTo(String value) {
            return orMemoNotEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orMemoNotEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("memo <>", value, "memo");
            return or(criterion);
        }

        public CriterionGroup orMemoGreaterThan(String value) {
            return orMemoGreaterThan(value, Boolean.TRUE);
        }

        public CriterionGroup orMemoGreaterThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("memo >", value, "memo");
            return or(criterion);
        }

        public CriterionGroup orMemoGreaterThanOrEqualTo(String value) {
            return orMemoGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orMemoGreaterThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("memo >=", value, "memo");
            return or(criterion);
        }

        public CriterionGroup orMemoLessThan(String value) {
            return orMemoLessThan(value, Boolean.TRUE);
        }

        public CriterionGroup orMemoLessThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("memo <", value, "memo");
            return or(criterion);
        }

        public CriterionGroup orMemoLessThanOrEqualTo(String value) {
            return orMemoLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orMemoLessThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("memo <=", value, "memo");
            return or(criterion);
        }

        public CriterionGroup orMemoLike(String value) {
            return orMemoLike(value, Boolean.TRUE);
        }

        public CriterionGroup orMemoLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("memo like", value, "memo");
            return or(criterion);
        }

        public CriterionGroup orMemoLikeLeft(String value) {
            return orMemoLikeLeft(value, Boolean.TRUE);
        }

        public CriterionGroup orMemoLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            Criterion criterion = new Criterion("memo like", value, "memo");
            return or(criterion);
        }

        public CriterionGroup orMemoLikeRight(String value) {
            return orMemoLikeRight(value, Boolean.TRUE);
        }

        public CriterionGroup orMemoLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("memo like", value, "memo");
            return or(criterion);
        }

        public CriterionGroup orMemoLikeBoth(String value) {
            return orMemoLikeBoth(value, Boolean.TRUE);
        }

        public CriterionGroup orMemoLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("memo like", value, "memo");
            return or(criterion);
        }

        public CriterionGroup orMemoNotLike(String value) {
            return orMemoNotLike(value, Boolean.TRUE);
        }

        public CriterionGroup orMemoNotLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("memo not like", value, "memo");
            return or(criterion);
        }

        public CriterionGroup orMemoNotLikeLeft(String value) {
            return orMemoNotLikeLeft(value, Boolean.TRUE);
        }

        public CriterionGroup orMemoNotLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            Criterion criterion = new Criterion("memo not like", value, "memo");
            return or(criterion);
        }

        public CriterionGroup orMemoNotLikeRight(String value) {
            return orMemoNotLikeRight(value, Boolean.TRUE);
        }

        public CriterionGroup orMemoNotLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("memo not like", value, "memo");
            return or(criterion);
        }

        public CriterionGroup orMemoNotLikeBoth(String value) {
            return orMemoNotLikeBoth(value, Boolean.TRUE);
        }

        public CriterionGroup orMemoNotLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("memo not like", value, "memo");
            return or(criterion);
        }

        public CriterionGroup orMemoIn(Collection<String> values) {
            Criterion criterion = new Criterion("memo in", values, "memo");
            return or(criterion);
        }

        public CriterionGroup orMemoNotIn(Collection<String> values) {
            Criterion criterion = new Criterion("memo not in", values, "memo");
            return or(criterion);
        }

        public CriterionGroup orMemoBetween(String value1, String value2) {
            Criterion criterion = new Criterion("memo between", value1, value2, "memo");
            return or(criterion);
        }

        public CriterionGroup orMemoNotBetween(String value1, String value2) {
            Criterion criterion = new Criterion("memo not between", value1, value2, "memo");
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

        public CriterionGroup orTypeIdIsNull() {
            Criterion criterion = new Criterion("type_id is null");
            return or(criterion);
        }

        public CriterionGroup orTypeIdIsNotNull() {
            Criterion criterion = new Criterion("type_id is not null");
            return or(criterion);
        }

        public CriterionGroup orTypeIdEqualTo(Integer value) {
            return orTypeIdEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orTypeIdEqualTo(Integer value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("type_id =", value, "typeId");
            return or(criterion);
        }

        public CriterionGroup orTypeIdNotEqualTo(Integer value) {
            return orTypeIdNotEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orTypeIdNotEqualTo(Integer value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("type_id <>", value, "typeId");
            return or(criterion);
        }

        public CriterionGroup orTypeIdGreaterThan(Integer value) {
            return orTypeIdGreaterThan(value, Boolean.TRUE);
        }

        public CriterionGroup orTypeIdGreaterThan(Integer value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("type_id >", value, "typeId");
            return or(criterion);
        }

        public CriterionGroup orTypeIdGreaterThanOrEqualTo(Integer value) {
            return orTypeIdGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orTypeIdGreaterThanOrEqualTo(Integer value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("type_id >=", value, "typeId");
            return or(criterion);
        }

        public CriterionGroup orTypeIdLessThan(Integer value) {
            return orTypeIdLessThan(value, Boolean.TRUE);
        }

        public CriterionGroup orTypeIdLessThan(Integer value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("type_id <", value, "typeId");
            return or(criterion);
        }

        public CriterionGroup orTypeIdLessThanOrEqualTo(Integer value) {
            return orTypeIdLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orTypeIdLessThanOrEqualTo(Integer value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("type_id <=", value, "typeId");
            return or(criterion);
        }

        public CriterionGroup orTypeIdIn(Collection<Integer> values) {
            Criterion criterion = new Criterion("type_id in", values, "typeId");
            return or(criterion);
        }

        public CriterionGroup orTypeIdNotIn(Collection<Integer> values) {
            Criterion criterion = new Criterion("type_id not in", values, "typeId");
            return or(criterion);
        }

        public CriterionGroup orTypeIdBetween(Integer value1, Integer value2) {
            Criterion criterion = new Criterion("type_id between", value1, value2, "typeId");
            return or(criterion);
        }

        public CriterionGroup orTypeIdNotBetween(Integer value1, Integer value2) {
            Criterion criterion = new Criterion("type_id not between", value1, value2, "typeId");
            return or(criterion);
        }

        public CriterionGroup orValIsNull() {
            Criterion criterion = new Criterion("val is null");
            return or(criterion);
        }

        public CriterionGroup orValIsNotNull() {
            Criterion criterion = new Criterion("val is not null");
            return or(criterion);
        }

        public CriterionGroup orValEqualTo(String value) {
            return orValEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orValEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("val =", value, "val");
            return or(criterion);
        }

        public CriterionGroup orValNotEqualTo(String value) {
            return orValNotEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orValNotEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("val <>", value, "val");
            return or(criterion);
        }

        public CriterionGroup orValGreaterThan(String value) {
            return orValGreaterThan(value, Boolean.TRUE);
        }

        public CriterionGroup orValGreaterThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("val >", value, "val");
            return or(criterion);
        }

        public CriterionGroup orValGreaterThanOrEqualTo(String value) {
            return orValGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orValGreaterThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("val >=", value, "val");
            return or(criterion);
        }

        public CriterionGroup orValLessThan(String value) {
            return orValLessThan(value, Boolean.TRUE);
        }

        public CriterionGroup orValLessThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("val <", value, "val");
            return or(criterion);
        }

        public CriterionGroup orValLessThanOrEqualTo(String value) {
            return orValLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orValLessThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("val <=", value, "val");
            return or(criterion);
        }

        public CriterionGroup orValLike(String value) {
            return orValLike(value, Boolean.TRUE);
        }

        public CriterionGroup orValLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("val like", value, "val");
            return or(criterion);
        }

        public CriterionGroup orValLikeLeft(String value) {
            return orValLikeLeft(value, Boolean.TRUE);
        }

        public CriterionGroup orValLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            Criterion criterion = new Criterion("val like", value, "val");
            return or(criterion);
        }

        public CriterionGroup orValLikeRight(String value) {
            return orValLikeRight(value, Boolean.TRUE);
        }

        public CriterionGroup orValLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("val like", value, "val");
            return or(criterion);
        }

        public CriterionGroup orValLikeBoth(String value) {
            return orValLikeBoth(value, Boolean.TRUE);
        }

        public CriterionGroup orValLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("val like", value, "val");
            return or(criterion);
        }

        public CriterionGroup orValNotLike(String value) {
            return orValNotLike(value, Boolean.TRUE);
        }

        public CriterionGroup orValNotLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("val not like", value, "val");
            return or(criterion);
        }

        public CriterionGroup orValNotLikeLeft(String value) {
            return orValNotLikeLeft(value, Boolean.TRUE);
        }

        public CriterionGroup orValNotLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            Criterion criterion = new Criterion("val not like", value, "val");
            return or(criterion);
        }

        public CriterionGroup orValNotLikeRight(String value) {
            return orValNotLikeRight(value, Boolean.TRUE);
        }

        public CriterionGroup orValNotLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("val not like", value, "val");
            return or(criterion);
        }

        public CriterionGroup orValNotLikeBoth(String value) {
            return orValNotLikeBoth(value, Boolean.TRUE);
        }

        public CriterionGroup orValNotLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("val not like", value, "val");
            return or(criterion);
        }

        public CriterionGroup orValIn(Collection<String> values) {
            Criterion criterion = new Criterion("val in", values, "val");
            return or(criterion);
        }

        public CriterionGroup orValNotIn(Collection<String> values) {
            Criterion criterion = new Criterion("val not in", values, "val");
            return or(criterion);
        }

        public CriterionGroup orValBetween(String value1, String value2) {
            Criterion criterion = new Criterion("val between", value1, value2, "val");
            return or(criterion);
        }

        public CriterionGroup orValNotBetween(String value1, String value2) {
            Criterion criterion = new Criterion("val not between", value1, value2, "val");
            return or(criterion);
        }

        public CriterionGroup orShareableIsNull() {
            Criterion criterion = new Criterion("shareable is null");
            return or(criterion);
        }

        public CriterionGroup orShareableIsNotNull() {
            Criterion criterion = new Criterion("shareable is not null");
            return or(criterion);
        }

        public CriterionGroup orShareableEqualTo(Byte value) {
            return orShareableEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orShareableEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("shareable =", value, "shareable");
            return or(criterion);
        }

        public CriterionGroup orShareableNotEqualTo(Byte value) {
            return orShareableNotEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orShareableNotEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("shareable <>", value, "shareable");
            return or(criterion);
        }

        public CriterionGroup orShareableGreaterThan(Byte value) {
            return orShareableGreaterThan(value, Boolean.TRUE);
        }

        public CriterionGroup orShareableGreaterThan(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("shareable >", value, "shareable");
            return or(criterion);
        }

        public CriterionGroup orShareableGreaterThanOrEqualTo(Byte value) {
            return orShareableGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orShareableGreaterThanOrEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("shareable >=", value, "shareable");
            return or(criterion);
        }

        public CriterionGroup orShareableLessThan(Byte value) {
            return orShareableLessThan(value, Boolean.TRUE);
        }

        public CriterionGroup orShareableLessThan(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("shareable <", value, "shareable");
            return or(criterion);
        }

        public CriterionGroup orShareableLessThanOrEqualTo(Byte value) {
            return orShareableLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orShareableLessThanOrEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("shareable <=", value, "shareable");
            return or(criterion);
        }

        public CriterionGroup orShareableIn(Collection<Byte> values) {
            Criterion criterion = new Criterion("shareable in", values, "shareable");
            return or(criterion);
        }

        public CriterionGroup orShareableNotIn(Collection<Byte> values) {
            Criterion criterion = new Criterion("shareable not in", values, "shareable");
            return or(criterion);
        }

        public CriterionGroup orShareableBetween(Byte value1, Byte value2) {
            Criterion criterion = new Criterion("shareable between", value1, value2, "shareable");
            return or(criterion);
        }

        public CriterionGroup orShareableNotBetween(Byte value1, Byte value2) {
            Criterion criterion = new Criterion("shareable not between", value1, value2, "shareable");
            return or(criterion);
        }

        public CriterionGroup orRefIsNull() {
            Criterion criterion = new Criterion("ref is null");
            return or(criterion);
        }

        public CriterionGroup orRefIsNotNull() {
            Criterion criterion = new Criterion("ref is not null");
            return or(criterion);
        }

        public CriterionGroup orRefEqualTo(Byte value) {
            return orRefEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orRefEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("ref =", value, "ref");
            return or(criterion);
        }

        public CriterionGroup orRefNotEqualTo(Byte value) {
            return orRefNotEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orRefNotEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("ref <>", value, "ref");
            return or(criterion);
        }

        public CriterionGroup orRefGreaterThan(Byte value) {
            return orRefGreaterThan(value, Boolean.TRUE);
        }

        public CriterionGroup orRefGreaterThan(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("ref >", value, "ref");
            return or(criterion);
        }

        public CriterionGroup orRefGreaterThanOrEqualTo(Byte value) {
            return orRefGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orRefGreaterThanOrEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("ref >=", value, "ref");
            return or(criterion);
        }

        public CriterionGroup orRefLessThan(Byte value) {
            return orRefLessThan(value, Boolean.TRUE);
        }

        public CriterionGroup orRefLessThan(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("ref <", value, "ref");
            return or(criterion);
        }

        public CriterionGroup orRefLessThanOrEqualTo(Byte value) {
            return orRefLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orRefLessThanOrEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("ref <=", value, "ref");
            return or(criterion);
        }

        public CriterionGroup orRefIn(Collection<Byte> values) {
            Criterion criterion = new Criterion("ref in", values, "ref");
            return or(criterion);
        }

        public CriterionGroup orRefNotIn(Collection<Byte> values) {
            Criterion criterion = new Criterion("ref not in", values, "ref");
            return or(criterion);
        }

        public CriterionGroup orRefBetween(Byte value1, Byte value2) {
            Criterion criterion = new Criterion("ref between", value1, value2, "ref");
            return or(criterion);
        }

        public CriterionGroup orRefNotBetween(Byte value1, Byte value2) {
            Criterion criterion = new Criterion("ref not between", value1, value2, "ref");
            return or(criterion);
        }

        public CriterionGroup orDeletedIsNull() {
            Criterion criterion = new Criterion("deleted is null");
            return or(criterion);
        }

        public CriterionGroup orDeletedIsNotNull() {
            Criterion criterion = new Criterion("deleted is not null");
            return or(criterion);
        }

        public CriterionGroup orDeletedEqualTo(Byte value) {
            return orDeletedEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orDeletedEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("deleted =", value, "deleted");
            return or(criterion);
        }

        public CriterionGroup orDeletedNotEqualTo(Byte value) {
            return orDeletedNotEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orDeletedNotEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("deleted <>", value, "deleted");
            return or(criterion);
        }

        public CriterionGroup orDeletedGreaterThan(Byte value) {
            return orDeletedGreaterThan(value, Boolean.TRUE);
        }

        public CriterionGroup orDeletedGreaterThan(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("deleted >", value, "deleted");
            return or(criterion);
        }

        public CriterionGroup orDeletedGreaterThanOrEqualTo(Byte value) {
            return orDeletedGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orDeletedGreaterThanOrEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("deleted >=", value, "deleted");
            return or(criterion);
        }

        public CriterionGroup orDeletedLessThan(Byte value) {
            return orDeletedLessThan(value, Boolean.TRUE);
        }

        public CriterionGroup orDeletedLessThan(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("deleted <", value, "deleted");
            return or(criterion);
        }

        public CriterionGroup orDeletedLessThanOrEqualTo(Byte value) {
            return orDeletedLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orDeletedLessThanOrEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("deleted <=", value, "deleted");
            return or(criterion);
        }

        public CriterionGroup orDeletedIn(Collection<Byte> values) {
            Criterion criterion = new Criterion("deleted in", values, "deleted");
            return or(criterion);
        }

        public CriterionGroup orDeletedNotIn(Collection<Byte> values) {
            Criterion criterion = new Criterion("deleted not in", values, "deleted");
            return or(criterion);
        }

        public CriterionGroup orDeletedBetween(Byte value1, Byte value2) {
            Criterion criterion = new Criterion("deleted between", value1, value2, "deleted");
            return or(criterion);
        }

        public CriterionGroup orDeletedNotBetween(Byte value1, Byte value2) {
            Criterion criterion = new Criterion("deleted not between", value1, value2, "deleted");
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

    public static final class Builder extends BaseExampleBuilder<Builder, ConfigItemExample> {

        protected List<Criteria> oredCriteria;

        private Builder() {

        }

        public Builder oredCriteria(List<Criteria> oredCriteria) {
            this.oredCriteria = oredCriteria;
            return this;
        }

        @Override
        public ConfigItemExample build() {
            return new ConfigItemExample(this);
        }
    }
}

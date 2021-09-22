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

public class ProjectExample extends BaseExample {

    protected List<Criteria> oredCriteria;

    private ProjectExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * 工程
     */
    private ProjectExample(Builder builder) {
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
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("id in", values, "id");
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

        public Criteria andProjectTypeIsNull() {
            addCriterion("project_type is null");
            return (Criteria) this;
        }

        public Criteria andProjectTypeIsNotNull() {
            addCriterion("project_type is not null");
            return (Criteria) this;
        }

        public Criteria andProjectTypeEqualTo(Byte value) {
            return andProjectTypeEqualTo(value, Boolean.TRUE);
        }

        public Criteria andProjectTypeEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("project_type =", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeNotEqualTo(Byte value) {
            return andProjectTypeNotEqualTo(value, Boolean.TRUE);
        }

        public Criteria andProjectTypeNotEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("project_type <>", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeGreaterThan(Byte value) {
            return andProjectTypeGreaterThan(value, Boolean.TRUE);
        }

        public Criteria andProjectTypeGreaterThan(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("project_type >", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeGreaterThanOrEqualTo(Byte value) {
            return andProjectTypeGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andProjectTypeGreaterThanOrEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("project_type >=", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeLessThan(Byte value) {
            return andProjectTypeLessThan(value, Boolean.TRUE);
        }

        public Criteria andProjectTypeLessThan(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("project_type <", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeLessThanOrEqualTo(Byte value) {
            return andProjectTypeLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andProjectTypeLessThanOrEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("project_type <=", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeIn(Collection<Byte> values) {
            addCriterion("project_type in", values, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeNotIn(Collection<Byte> values) {
            addCriterion("project_type not in", values, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeBetween(Byte value1, Byte value2) {
            addCriterion("project_type between", value1, value2, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("project_type not between", value1, value2, "projectType");
            return (Criteria) this;
        }

        public Criteria andDependencyIdsIsNull() {
            addCriterion("dependency_ids is null");
            return (Criteria) this;
        }

        public Criteria andDependencyIdsIsNotNull() {
            addCriterion("dependency_ids is not null");
            return (Criteria) this;
        }

        public Criteria andDependencyIdsEqualTo(String value) {
            return andDependencyIdsEqualTo(value, Boolean.TRUE);
        }

        public Criteria andDependencyIdsEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("dependency_ids =", value, "dependencyIds");
            return (Criteria) this;
        }

        public Criteria andDependencyIdsNotEqualTo(String value) {
            return andDependencyIdsNotEqualTo(value, Boolean.TRUE);
        }

        public Criteria andDependencyIdsNotEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("dependency_ids <>", value, "dependencyIds");
            return (Criteria) this;
        }

        public Criteria andDependencyIdsGreaterThan(String value) {
            return andDependencyIdsGreaterThan(value, Boolean.TRUE);
        }

        public Criteria andDependencyIdsGreaterThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("dependency_ids >", value, "dependencyIds");
            return (Criteria) this;
        }

        public Criteria andDependencyIdsGreaterThanOrEqualTo(String value) {
            return andDependencyIdsGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andDependencyIdsGreaterThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("dependency_ids >=", value, "dependencyIds");
            return (Criteria) this;
        }

        public Criteria andDependencyIdsLessThan(String value) {
            return andDependencyIdsLessThan(value, Boolean.TRUE);
        }

        public Criteria andDependencyIdsLessThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("dependency_ids <", value, "dependencyIds");
            return (Criteria) this;
        }

        public Criteria andDependencyIdsLessThanOrEqualTo(String value) {
            return andDependencyIdsLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andDependencyIdsLessThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("dependency_ids <=", value, "dependencyIds");
            return (Criteria) this;
        }

        public Criteria andDependencyIdsLike(String value) {
            return andDependencyIdsLike(value, Boolean.TRUE);
        }

        public Criteria andDependencyIdsLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("dependency_ids like", value, "dependencyIds");
            return (Criteria) this;
        }

        public Criteria andDependencyIdsLikeLeft(String value) {
            return andDependencyIdsLikeLeft(value, Boolean.TRUE);
        }

        public Criteria andDependencyIdsLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            addCriterion("dependency_ids like", value, "dependencyIds");
            return (Criteria) this;
        }

        public Criteria andDependencyIdsLikeRight(String value) {
            return andDependencyIdsLikeRight(value, Boolean.TRUE);
        }

        public Criteria andDependencyIdsLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("dependency_ids like", value, "dependencyIds");
            return (Criteria) this;
        }

        public Criteria andDependencyIdsLikeBoth(String value) {
            return andDependencyIdsLikeBoth(value, Boolean.TRUE);
        }

        public Criteria andDependencyIdsLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("dependency_ids like", value, "dependencyIds");
            return (Criteria) this;
        }

        public Criteria andDependencyIdsNotLike(String value) {
            return andDependencyIdsNotLike(value, Boolean.TRUE);
        }

        public Criteria andDependencyIdsNotLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("dependency_ids not like", value, "dependencyIds");
            return (Criteria) this;
        }

        public Criteria andDependencyIdsNotLikeLeft(String value) {
            return andDependencyIdsNotLikeLeft(value, Boolean.TRUE);
        }

        public Criteria andDependencyIdsNotLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            addCriterion("dependency_ids not like", value, "dependencyIds");
            return (Criteria) this;
        }

        public Criteria andDependencyIdsNotLikeRight(String value) {
            return andDependencyIdsNotLikeRight(value, Boolean.TRUE);
        }

        public Criteria andDependencyIdsNotLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("dependency_ids not like", value, "dependencyIds");
            return (Criteria) this;
        }

        public Criteria andDependencyIdsNotLikeBoth(String value) {
            return andDependencyIdsNotLikeBoth(value, Boolean.TRUE);
        }

        public Criteria andDependencyIdsNotLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("dependency_ids not like", value, "dependencyIds");
            return (Criteria) this;
        }

        public Criteria andDependencyIdsIn(Collection<String> values) {
            addCriterion("dependency_ids in", values, "dependencyIds");
            return (Criteria) this;
        }

        public Criteria andDependencyIdsNotIn(Collection<String> values) {
            addCriterion("dependency_ids not in", values, "dependencyIds");
            return (Criteria) this;
        }

        public Criteria andDependencyIdsBetween(String value1, String value2) {
            addCriterion("dependency_ids between", value1, value2, "dependencyIds");
            return (Criteria) this;
        }

        public Criteria andDependencyIdsNotBetween(String value1, String value2) {
            addCriterion("dependency_ids not between", value1, value2, "dependencyIds");
            return (Criteria) this;
        }

        public Criteria andDependencyNamesIsNull() {
            addCriterion("dependency_names is null");
            return (Criteria) this;
        }

        public Criteria andDependencyNamesIsNotNull() {
            addCriterion("dependency_names is not null");
            return (Criteria) this;
        }

        public Criteria andDependencyNamesEqualTo(String value) {
            return andDependencyNamesEqualTo(value, Boolean.TRUE);
        }

        public Criteria andDependencyNamesEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("dependency_names =", value, "dependencyNames");
            return (Criteria) this;
        }

        public Criteria andDependencyNamesNotEqualTo(String value) {
            return andDependencyNamesNotEqualTo(value, Boolean.TRUE);
        }

        public Criteria andDependencyNamesNotEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("dependency_names <>", value, "dependencyNames");
            return (Criteria) this;
        }

        public Criteria andDependencyNamesGreaterThan(String value) {
            return andDependencyNamesGreaterThan(value, Boolean.TRUE);
        }

        public Criteria andDependencyNamesGreaterThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("dependency_names >", value, "dependencyNames");
            return (Criteria) this;
        }

        public Criteria andDependencyNamesGreaterThanOrEqualTo(String value) {
            return andDependencyNamesGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andDependencyNamesGreaterThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("dependency_names >=", value, "dependencyNames");
            return (Criteria) this;
        }

        public Criteria andDependencyNamesLessThan(String value) {
            return andDependencyNamesLessThan(value, Boolean.TRUE);
        }

        public Criteria andDependencyNamesLessThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("dependency_names <", value, "dependencyNames");
            return (Criteria) this;
        }

        public Criteria andDependencyNamesLessThanOrEqualTo(String value) {
            return andDependencyNamesLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andDependencyNamesLessThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("dependency_names <=", value, "dependencyNames");
            return (Criteria) this;
        }

        public Criteria andDependencyNamesLike(String value) {
            return andDependencyNamesLike(value, Boolean.TRUE);
        }

        public Criteria andDependencyNamesLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("dependency_names like", value, "dependencyNames");
            return (Criteria) this;
        }

        public Criteria andDependencyNamesLikeLeft(String value) {
            return andDependencyNamesLikeLeft(value, Boolean.TRUE);
        }

        public Criteria andDependencyNamesLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            addCriterion("dependency_names like", value, "dependencyNames");
            return (Criteria) this;
        }

        public Criteria andDependencyNamesLikeRight(String value) {
            return andDependencyNamesLikeRight(value, Boolean.TRUE);
        }

        public Criteria andDependencyNamesLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("dependency_names like", value, "dependencyNames");
            return (Criteria) this;
        }

        public Criteria andDependencyNamesLikeBoth(String value) {
            return andDependencyNamesLikeBoth(value, Boolean.TRUE);
        }

        public Criteria andDependencyNamesLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("dependency_names like", value, "dependencyNames");
            return (Criteria) this;
        }

        public Criteria andDependencyNamesNotLike(String value) {
            return andDependencyNamesNotLike(value, Boolean.TRUE);
        }

        public Criteria andDependencyNamesNotLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("dependency_names not like", value, "dependencyNames");
            return (Criteria) this;
        }

        public Criteria andDependencyNamesNotLikeLeft(String value) {
            return andDependencyNamesNotLikeLeft(value, Boolean.TRUE);
        }

        public Criteria andDependencyNamesNotLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            addCriterion("dependency_names not like", value, "dependencyNames");
            return (Criteria) this;
        }

        public Criteria andDependencyNamesNotLikeRight(String value) {
            return andDependencyNamesNotLikeRight(value, Boolean.TRUE);
        }

        public Criteria andDependencyNamesNotLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("dependency_names not like", value, "dependencyNames");
            return (Criteria) this;
        }

        public Criteria andDependencyNamesNotLikeBoth(String value) {
            return andDependencyNamesNotLikeBoth(value, Boolean.TRUE);
        }

        public Criteria andDependencyNamesNotLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("dependency_names not like", value, "dependencyNames");
            return (Criteria) this;
        }

        public Criteria andDependencyNamesIn(Collection<String> values) {
            addCriterion("dependency_names in", values, "dependencyNames");
            return (Criteria) this;
        }

        public Criteria andDependencyNamesNotIn(Collection<String> values) {
            addCriterion("dependency_names not in", values, "dependencyNames");
            return (Criteria) this;
        }

        public Criteria andDependencyNamesBetween(String value1, String value2) {
            addCriterion("dependency_names between", value1, value2, "dependencyNames");
            return (Criteria) this;
        }

        public Criteria andDependencyNamesNotBetween(String value1, String value2) {
            addCriterion("dependency_names not between", value1, value2, "dependencyNames");
            return (Criteria) this;
        }

        public Criteria andMailReceiverIsNull() {
            addCriterion("mail_receiver is null");
            return (Criteria) this;
        }

        public Criteria andMailReceiverIsNotNull() {
            addCriterion("mail_receiver is not null");
            return (Criteria) this;
        }

        public Criteria andMailReceiverEqualTo(String value) {
            return andMailReceiverEqualTo(value, Boolean.TRUE);
        }

        public Criteria andMailReceiverEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("mail_receiver =", value, "mailReceiver");
            return (Criteria) this;
        }

        public Criteria andMailReceiverNotEqualTo(String value) {
            return andMailReceiverNotEqualTo(value, Boolean.TRUE);
        }

        public Criteria andMailReceiverNotEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("mail_receiver <>", value, "mailReceiver");
            return (Criteria) this;
        }

        public Criteria andMailReceiverGreaterThan(String value) {
            return andMailReceiverGreaterThan(value, Boolean.TRUE);
        }

        public Criteria andMailReceiverGreaterThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("mail_receiver >", value, "mailReceiver");
            return (Criteria) this;
        }

        public Criteria andMailReceiverGreaterThanOrEqualTo(String value) {
            return andMailReceiverGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andMailReceiverGreaterThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("mail_receiver >=", value, "mailReceiver");
            return (Criteria) this;
        }

        public Criteria andMailReceiverLessThan(String value) {
            return andMailReceiverLessThan(value, Boolean.TRUE);
        }

        public Criteria andMailReceiverLessThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("mail_receiver <", value, "mailReceiver");
            return (Criteria) this;
        }

        public Criteria andMailReceiverLessThanOrEqualTo(String value) {
            return andMailReceiverLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andMailReceiverLessThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("mail_receiver <=", value, "mailReceiver");
            return (Criteria) this;
        }

        public Criteria andMailReceiverLike(String value) {
            return andMailReceiverLike(value, Boolean.TRUE);
        }

        public Criteria andMailReceiverLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("mail_receiver like", value, "mailReceiver");
            return (Criteria) this;
        }

        public Criteria andMailReceiverLikeLeft(String value) {
            return andMailReceiverLikeLeft(value, Boolean.TRUE);
        }

        public Criteria andMailReceiverLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            addCriterion("mail_receiver like", value, "mailReceiver");
            return (Criteria) this;
        }

        public Criteria andMailReceiverLikeRight(String value) {
            return andMailReceiverLikeRight(value, Boolean.TRUE);
        }

        public Criteria andMailReceiverLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("mail_receiver like", value, "mailReceiver");
            return (Criteria) this;
        }

        public Criteria andMailReceiverLikeBoth(String value) {
            return andMailReceiverLikeBoth(value, Boolean.TRUE);
        }

        public Criteria andMailReceiverLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("mail_receiver like", value, "mailReceiver");
            return (Criteria) this;
        }

        public Criteria andMailReceiverNotLike(String value) {
            return andMailReceiverNotLike(value, Boolean.TRUE);
        }

        public Criteria andMailReceiverNotLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("mail_receiver not like", value, "mailReceiver");
            return (Criteria) this;
        }

        public Criteria andMailReceiverNotLikeLeft(String value) {
            return andMailReceiverNotLikeLeft(value, Boolean.TRUE);
        }

        public Criteria andMailReceiverNotLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            addCriterion("mail_receiver not like", value, "mailReceiver");
            return (Criteria) this;
        }

        public Criteria andMailReceiverNotLikeRight(String value) {
            return andMailReceiverNotLikeRight(value, Boolean.TRUE);
        }

        public Criteria andMailReceiverNotLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("mail_receiver not like", value, "mailReceiver");
            return (Criteria) this;
        }

        public Criteria andMailReceiverNotLikeBoth(String value) {
            return andMailReceiverNotLikeBoth(value, Boolean.TRUE);
        }

        public Criteria andMailReceiverNotLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("mail_receiver not like", value, "mailReceiver");
            return (Criteria) this;
        }

        public Criteria andMailReceiverIn(Collection<String> values) {
            addCriterion("mail_receiver in", values, "mailReceiver");
            return (Criteria) this;
        }

        public Criteria andMailReceiverNotIn(Collection<String> values) {
            addCriterion("mail_receiver not in", values, "mailReceiver");
            return (Criteria) this;
        }

        public Criteria andMailReceiverBetween(String value1, String value2) {
            addCriterion("mail_receiver between", value1, value2, "mailReceiver");
            return (Criteria) this;
        }

        public Criteria andMailReceiverNotBetween(String value1, String value2) {
            addCriterion("mail_receiver not between", value1, value2, "mailReceiver");
            return (Criteria) this;
        }

        public Criteria andApiPasswordIsNull() {
            addCriterion("api_password is null");
            return (Criteria) this;
        }

        public Criteria andApiPasswordIsNotNull() {
            addCriterion("api_password is not null");
            return (Criteria) this;
        }

        public Criteria andApiPasswordEqualTo(String value) {
            return andApiPasswordEqualTo(value, Boolean.TRUE);
        }

        public Criteria andApiPasswordEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("api_password =", value, "apiPassword");
            return (Criteria) this;
        }

        public Criteria andApiPasswordNotEqualTo(String value) {
            return andApiPasswordNotEqualTo(value, Boolean.TRUE);
        }

        public Criteria andApiPasswordNotEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("api_password <>", value, "apiPassword");
            return (Criteria) this;
        }

        public Criteria andApiPasswordGreaterThan(String value) {
            return andApiPasswordGreaterThan(value, Boolean.TRUE);
        }

        public Criteria andApiPasswordGreaterThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("api_password >", value, "apiPassword");
            return (Criteria) this;
        }

        public Criteria andApiPasswordGreaterThanOrEqualTo(String value) {
            return andApiPasswordGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andApiPasswordGreaterThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("api_password >=", value, "apiPassword");
            return (Criteria) this;
        }

        public Criteria andApiPasswordLessThan(String value) {
            return andApiPasswordLessThan(value, Boolean.TRUE);
        }

        public Criteria andApiPasswordLessThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("api_password <", value, "apiPassword");
            return (Criteria) this;
        }

        public Criteria andApiPasswordLessThanOrEqualTo(String value) {
            return andApiPasswordLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andApiPasswordLessThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("api_password <=", value, "apiPassword");
            return (Criteria) this;
        }

        public Criteria andApiPasswordLike(String value) {
            return andApiPasswordLike(value, Boolean.TRUE);
        }

        public Criteria andApiPasswordLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("api_password like", value, "apiPassword");
            return (Criteria) this;
        }

        public Criteria andApiPasswordLikeLeft(String value) {
            return andApiPasswordLikeLeft(value, Boolean.TRUE);
        }

        public Criteria andApiPasswordLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            addCriterion("api_password like", value, "apiPassword");
            return (Criteria) this;
        }

        public Criteria andApiPasswordLikeRight(String value) {
            return andApiPasswordLikeRight(value, Boolean.TRUE);
        }

        public Criteria andApiPasswordLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("api_password like", value, "apiPassword");
            return (Criteria) this;
        }

        public Criteria andApiPasswordLikeBoth(String value) {
            return andApiPasswordLikeBoth(value, Boolean.TRUE);
        }

        public Criteria andApiPasswordLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("api_password like", value, "apiPassword");
            return (Criteria) this;
        }

        public Criteria andApiPasswordNotLike(String value) {
            return andApiPasswordNotLike(value, Boolean.TRUE);
        }

        public Criteria andApiPasswordNotLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("api_password not like", value, "apiPassword");
            return (Criteria) this;
        }

        public Criteria andApiPasswordNotLikeLeft(String value) {
            return andApiPasswordNotLikeLeft(value, Boolean.TRUE);
        }

        public Criteria andApiPasswordNotLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            addCriterion("api_password not like", value, "apiPassword");
            return (Criteria) this;
        }

        public Criteria andApiPasswordNotLikeRight(String value) {
            return andApiPasswordNotLikeRight(value, Boolean.TRUE);
        }

        public Criteria andApiPasswordNotLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("api_password not like", value, "apiPassword");
            return (Criteria) this;
        }

        public Criteria andApiPasswordNotLikeBoth(String value) {
            return andApiPasswordNotLikeBoth(value, Boolean.TRUE);
        }

        public Criteria andApiPasswordNotLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("api_password not like", value, "apiPassword");
            return (Criteria) this;
        }

        public Criteria andApiPasswordIn(Collection<String> values) {
            addCriterion("api_password in", values, "apiPassword");
            return (Criteria) this;
        }

        public Criteria andApiPasswordNotIn(Collection<String> values) {
            addCriterion("api_password not in", values, "apiPassword");
            return (Criteria) this;
        }

        public Criteria andApiPasswordBetween(String value1, String value2) {
            addCriterion("api_password between", value1, value2, "apiPassword");
            return (Criteria) this;
        }

        public Criteria andApiPasswordNotBetween(String value1, String value2) {
            addCriterion("api_password not between", value1, value2, "apiPassword");
            return (Criteria) this;
        }

        public Criteria andApiTokenIsNull() {
            addCriterion("api_token is null");
            return (Criteria) this;
        }

        public Criteria andApiTokenIsNotNull() {
            addCriterion("api_token is not null");
            return (Criteria) this;
        }

        public Criteria andApiTokenEqualTo(String value) {
            return andApiTokenEqualTo(value, Boolean.TRUE);
        }

        public Criteria andApiTokenEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("api_token =", value, "apiToken");
            return (Criteria) this;
        }

        public Criteria andApiTokenNotEqualTo(String value) {
            return andApiTokenNotEqualTo(value, Boolean.TRUE);
        }

        public Criteria andApiTokenNotEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("api_token <>", value, "apiToken");
            return (Criteria) this;
        }

        public Criteria andApiTokenGreaterThan(String value) {
            return andApiTokenGreaterThan(value, Boolean.TRUE);
        }

        public Criteria andApiTokenGreaterThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("api_token >", value, "apiToken");
            return (Criteria) this;
        }

        public Criteria andApiTokenGreaterThanOrEqualTo(String value) {
            return andApiTokenGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andApiTokenGreaterThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("api_token >=", value, "apiToken");
            return (Criteria) this;
        }

        public Criteria andApiTokenLessThan(String value) {
            return andApiTokenLessThan(value, Boolean.TRUE);
        }

        public Criteria andApiTokenLessThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("api_token <", value, "apiToken");
            return (Criteria) this;
        }

        public Criteria andApiTokenLessThanOrEqualTo(String value) {
            return andApiTokenLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andApiTokenLessThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("api_token <=", value, "apiToken");
            return (Criteria) this;
        }

        public Criteria andApiTokenLike(String value) {
            return andApiTokenLike(value, Boolean.TRUE);
        }

        public Criteria andApiTokenLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("api_token like", value, "apiToken");
            return (Criteria) this;
        }

        public Criteria andApiTokenLikeLeft(String value) {
            return andApiTokenLikeLeft(value, Boolean.TRUE);
        }

        public Criteria andApiTokenLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            addCriterion("api_token like", value, "apiToken");
            return (Criteria) this;
        }

        public Criteria andApiTokenLikeRight(String value) {
            return andApiTokenLikeRight(value, Boolean.TRUE);
        }

        public Criteria andApiTokenLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("api_token like", value, "apiToken");
            return (Criteria) this;
        }

        public Criteria andApiTokenLikeBoth(String value) {
            return andApiTokenLikeBoth(value, Boolean.TRUE);
        }

        public Criteria andApiTokenLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("api_token like", value, "apiToken");
            return (Criteria) this;
        }

        public Criteria andApiTokenNotLike(String value) {
            return andApiTokenNotLike(value, Boolean.TRUE);
        }

        public Criteria andApiTokenNotLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("api_token not like", value, "apiToken");
            return (Criteria) this;
        }

        public Criteria andApiTokenNotLikeLeft(String value) {
            return andApiTokenNotLikeLeft(value, Boolean.TRUE);
        }

        public Criteria andApiTokenNotLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            addCriterion("api_token not like", value, "apiToken");
            return (Criteria) this;
        }

        public Criteria andApiTokenNotLikeRight(String value) {
            return andApiTokenNotLikeRight(value, Boolean.TRUE);
        }

        public Criteria andApiTokenNotLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("api_token not like", value, "apiToken");
            return (Criteria) this;
        }

        public Criteria andApiTokenNotLikeBoth(String value) {
            return andApiTokenNotLikeBoth(value, Boolean.TRUE);
        }

        public Criteria andApiTokenNotLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("api_token not like", value, "apiToken");
            return (Criteria) this;
        }

        public Criteria andApiTokenIn(Collection<String> values) {
            addCriterion("api_token in", values, "apiToken");
            return (Criteria) this;
        }

        public Criteria andApiTokenNotIn(Collection<String> values) {
            addCriterion("api_token not in", values, "apiToken");
            return (Criteria) this;
        }

        public Criteria andApiTokenBetween(String value1, String value2) {
            addCriterion("api_token between", value1, value2, "apiToken");
            return (Criteria) this;
        }

        public Criteria andApiTokenNotBetween(String value1, String value2) {
            addCriterion("api_token not between", value1, value2, "apiToken");
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

        private ProjectExample example;

        protected Criteria(ProjectExample example) {
            super();
            this.example = example;
        }

        public ProjectExample toExample() {
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

        public CriterionGroup orProjectTypeIsNull() {
            Criterion criterion = new Criterion("project_type is null");
            return or(criterion);
        }

        public CriterionGroup orProjectTypeIsNotNull() {
            Criterion criterion = new Criterion("project_type is not null");
            return or(criterion);
        }

        public CriterionGroup orProjectTypeEqualTo(Byte value) {
            return orProjectTypeEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orProjectTypeEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("project_type =", value, "projectType");
            return or(criterion);
        }

        public CriterionGroup orProjectTypeNotEqualTo(Byte value) {
            return orProjectTypeNotEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orProjectTypeNotEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("project_type <>", value, "projectType");
            return or(criterion);
        }

        public CriterionGroup orProjectTypeGreaterThan(Byte value) {
            return orProjectTypeGreaterThan(value, Boolean.TRUE);
        }

        public CriterionGroup orProjectTypeGreaterThan(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("project_type >", value, "projectType");
            return or(criterion);
        }

        public CriterionGroup orProjectTypeGreaterThanOrEqualTo(Byte value) {
            return orProjectTypeGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orProjectTypeGreaterThanOrEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("project_type >=", value, "projectType");
            return or(criterion);
        }

        public CriterionGroup orProjectTypeLessThan(Byte value) {
            return orProjectTypeLessThan(value, Boolean.TRUE);
        }

        public CriterionGroup orProjectTypeLessThan(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("project_type <", value, "projectType");
            return or(criterion);
        }

        public CriterionGroup orProjectTypeLessThanOrEqualTo(Byte value) {
            return orProjectTypeLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orProjectTypeLessThanOrEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("project_type <=", value, "projectType");
            return or(criterion);
        }

        public CriterionGroup orProjectTypeIn(Collection<Byte> values) {
            Criterion criterion = new Criterion("project_type in", values, "projectType");
            return or(criterion);
        }

        public CriterionGroup orProjectTypeNotIn(Collection<Byte> values) {
            Criterion criterion = new Criterion("project_type not in", values, "projectType");
            return or(criterion);
        }

        public CriterionGroup orProjectTypeBetween(Byte value1, Byte value2) {
            Criterion criterion = new Criterion("project_type between", value1, value2, "projectType");
            return or(criterion);
        }

        public CriterionGroup orProjectTypeNotBetween(Byte value1, Byte value2) {
            Criterion criterion = new Criterion("project_type not between", value1, value2, "projectType");
            return or(criterion);
        }

        public CriterionGroup orDependencyIdsIsNull() {
            Criterion criterion = new Criterion("dependency_ids is null");
            return or(criterion);
        }

        public CriterionGroup orDependencyIdsIsNotNull() {
            Criterion criterion = new Criterion("dependency_ids is not null");
            return or(criterion);
        }

        public CriterionGroup orDependencyIdsEqualTo(String value) {
            return orDependencyIdsEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orDependencyIdsEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("dependency_ids =", value, "dependencyIds");
            return or(criterion);
        }

        public CriterionGroup orDependencyIdsNotEqualTo(String value) {
            return orDependencyIdsNotEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orDependencyIdsNotEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("dependency_ids <>", value, "dependencyIds");
            return or(criterion);
        }

        public CriterionGroup orDependencyIdsGreaterThan(String value) {
            return orDependencyIdsGreaterThan(value, Boolean.TRUE);
        }

        public CriterionGroup orDependencyIdsGreaterThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("dependency_ids >", value, "dependencyIds");
            return or(criterion);
        }

        public CriterionGroup orDependencyIdsGreaterThanOrEqualTo(String value) {
            return orDependencyIdsGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orDependencyIdsGreaterThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("dependency_ids >=", value, "dependencyIds");
            return or(criterion);
        }

        public CriterionGroup orDependencyIdsLessThan(String value) {
            return orDependencyIdsLessThan(value, Boolean.TRUE);
        }

        public CriterionGroup orDependencyIdsLessThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("dependency_ids <", value, "dependencyIds");
            return or(criterion);
        }

        public CriterionGroup orDependencyIdsLessThanOrEqualTo(String value) {
            return orDependencyIdsLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orDependencyIdsLessThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("dependency_ids <=", value, "dependencyIds");
            return or(criterion);
        }

        public CriterionGroup orDependencyIdsLike(String value) {
            return orDependencyIdsLike(value, Boolean.TRUE);
        }

        public CriterionGroup orDependencyIdsLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("dependency_ids like", value, "dependencyIds");
            return or(criterion);
        }

        public CriterionGroup orDependencyIdsLikeLeft(String value) {
            return orDependencyIdsLikeLeft(value, Boolean.TRUE);
        }

        public CriterionGroup orDependencyIdsLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            Criterion criterion = new Criterion("dependency_ids like", value, "dependencyIds");
            return or(criterion);
        }

        public CriterionGroup orDependencyIdsLikeRight(String value) {
            return orDependencyIdsLikeRight(value, Boolean.TRUE);
        }

        public CriterionGroup orDependencyIdsLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("dependency_ids like", value, "dependencyIds");
            return or(criterion);
        }

        public CriterionGroup orDependencyIdsLikeBoth(String value) {
            return orDependencyIdsLikeBoth(value, Boolean.TRUE);
        }

        public CriterionGroup orDependencyIdsLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("dependency_ids like", value, "dependencyIds");
            return or(criterion);
        }

        public CriterionGroup orDependencyIdsNotLike(String value) {
            return orDependencyIdsNotLike(value, Boolean.TRUE);
        }

        public CriterionGroup orDependencyIdsNotLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("dependency_ids not like", value, "dependencyIds");
            return or(criterion);
        }

        public CriterionGroup orDependencyIdsNotLikeLeft(String value) {
            return orDependencyIdsNotLikeLeft(value, Boolean.TRUE);
        }

        public CriterionGroup orDependencyIdsNotLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            Criterion criterion = new Criterion("dependency_ids not like", value, "dependencyIds");
            return or(criterion);
        }

        public CriterionGroup orDependencyIdsNotLikeRight(String value) {
            return orDependencyIdsNotLikeRight(value, Boolean.TRUE);
        }

        public CriterionGroup orDependencyIdsNotLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("dependency_ids not like", value, "dependencyIds");
            return or(criterion);
        }

        public CriterionGroup orDependencyIdsNotLikeBoth(String value) {
            return orDependencyIdsNotLikeBoth(value, Boolean.TRUE);
        }

        public CriterionGroup orDependencyIdsNotLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("dependency_ids not like", value, "dependencyIds");
            return or(criterion);
        }

        public CriterionGroup orDependencyIdsIn(Collection<String> values) {
            Criterion criterion = new Criterion("dependency_ids in", values, "dependencyIds");
            return or(criterion);
        }

        public CriterionGroup orDependencyIdsNotIn(Collection<String> values) {
            Criterion criterion = new Criterion("dependency_ids not in", values, "dependencyIds");
            return or(criterion);
        }

        public CriterionGroup orDependencyIdsBetween(String value1, String value2) {
            Criterion criterion = new Criterion("dependency_ids between", value1, value2, "dependencyIds");
            return or(criterion);
        }

        public CriterionGroup orDependencyIdsNotBetween(String value1, String value2) {
            Criterion criterion = new Criterion("dependency_ids not between", value1, value2, "dependencyIds");
            return or(criterion);
        }

        public CriterionGroup orDependencyNamesIsNull() {
            Criterion criterion = new Criterion("dependency_names is null");
            return or(criterion);
        }

        public CriterionGroup orDependencyNamesIsNotNull() {
            Criterion criterion = new Criterion("dependency_names is not null");
            return or(criterion);
        }

        public CriterionGroup orDependencyNamesEqualTo(String value) {
            return orDependencyNamesEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orDependencyNamesEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("dependency_names =", value, "dependencyNames");
            return or(criterion);
        }

        public CriterionGroup orDependencyNamesNotEqualTo(String value) {
            return orDependencyNamesNotEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orDependencyNamesNotEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("dependency_names <>", value, "dependencyNames");
            return or(criterion);
        }

        public CriterionGroup orDependencyNamesGreaterThan(String value) {
            return orDependencyNamesGreaterThan(value, Boolean.TRUE);
        }

        public CriterionGroup orDependencyNamesGreaterThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("dependency_names >", value, "dependencyNames");
            return or(criterion);
        }

        public CriterionGroup orDependencyNamesGreaterThanOrEqualTo(String value) {
            return orDependencyNamesGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orDependencyNamesGreaterThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("dependency_names >=", value, "dependencyNames");
            return or(criterion);
        }

        public CriterionGroup orDependencyNamesLessThan(String value) {
            return orDependencyNamesLessThan(value, Boolean.TRUE);
        }

        public CriterionGroup orDependencyNamesLessThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("dependency_names <", value, "dependencyNames");
            return or(criterion);
        }

        public CriterionGroup orDependencyNamesLessThanOrEqualTo(String value) {
            return orDependencyNamesLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orDependencyNamesLessThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("dependency_names <=", value, "dependencyNames");
            return or(criterion);
        }

        public CriterionGroup orDependencyNamesLike(String value) {
            return orDependencyNamesLike(value, Boolean.TRUE);
        }

        public CriterionGroup orDependencyNamesLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("dependency_names like", value, "dependencyNames");
            return or(criterion);
        }

        public CriterionGroup orDependencyNamesLikeLeft(String value) {
            return orDependencyNamesLikeLeft(value, Boolean.TRUE);
        }

        public CriterionGroup orDependencyNamesLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            Criterion criterion = new Criterion("dependency_names like", value, "dependencyNames");
            return or(criterion);
        }

        public CriterionGroup orDependencyNamesLikeRight(String value) {
            return orDependencyNamesLikeRight(value, Boolean.TRUE);
        }

        public CriterionGroup orDependencyNamesLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("dependency_names like", value, "dependencyNames");
            return or(criterion);
        }

        public CriterionGroup orDependencyNamesLikeBoth(String value) {
            return orDependencyNamesLikeBoth(value, Boolean.TRUE);
        }

        public CriterionGroup orDependencyNamesLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("dependency_names like", value, "dependencyNames");
            return or(criterion);
        }

        public CriterionGroup orDependencyNamesNotLike(String value) {
            return orDependencyNamesNotLike(value, Boolean.TRUE);
        }

        public CriterionGroup orDependencyNamesNotLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("dependency_names not like", value, "dependencyNames");
            return or(criterion);
        }

        public CriterionGroup orDependencyNamesNotLikeLeft(String value) {
            return orDependencyNamesNotLikeLeft(value, Boolean.TRUE);
        }

        public CriterionGroup orDependencyNamesNotLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            Criterion criterion = new Criterion("dependency_names not like", value, "dependencyNames");
            return or(criterion);
        }

        public CriterionGroup orDependencyNamesNotLikeRight(String value) {
            return orDependencyNamesNotLikeRight(value, Boolean.TRUE);
        }

        public CriterionGroup orDependencyNamesNotLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("dependency_names not like", value, "dependencyNames");
            return or(criterion);
        }

        public CriterionGroup orDependencyNamesNotLikeBoth(String value) {
            return orDependencyNamesNotLikeBoth(value, Boolean.TRUE);
        }

        public CriterionGroup orDependencyNamesNotLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("dependency_names not like", value, "dependencyNames");
            return or(criterion);
        }

        public CriterionGroup orDependencyNamesIn(Collection<String> values) {
            Criterion criterion = new Criterion("dependency_names in", values, "dependencyNames");
            return or(criterion);
        }

        public CriterionGroup orDependencyNamesNotIn(Collection<String> values) {
            Criterion criterion = new Criterion("dependency_names not in", values, "dependencyNames");
            return or(criterion);
        }

        public CriterionGroup orDependencyNamesBetween(String value1, String value2) {
            Criterion criterion = new Criterion("dependency_names between", value1, value2, "dependencyNames");
            return or(criterion);
        }

        public CriterionGroup orDependencyNamesNotBetween(String value1, String value2) {
            Criterion criterion = new Criterion("dependency_names not between", value1, value2, "dependencyNames");
            return or(criterion);
        }

        public CriterionGroup orMailReceiverIsNull() {
            Criterion criterion = new Criterion("mail_receiver is null");
            return or(criterion);
        }

        public CriterionGroup orMailReceiverIsNotNull() {
            Criterion criterion = new Criterion("mail_receiver is not null");
            return or(criterion);
        }

        public CriterionGroup orMailReceiverEqualTo(String value) {
            return orMailReceiverEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orMailReceiverEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("mail_receiver =", value, "mailReceiver");
            return or(criterion);
        }

        public CriterionGroup orMailReceiverNotEqualTo(String value) {
            return orMailReceiverNotEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orMailReceiverNotEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("mail_receiver <>", value, "mailReceiver");
            return or(criterion);
        }

        public CriterionGroup orMailReceiverGreaterThan(String value) {
            return orMailReceiverGreaterThan(value, Boolean.TRUE);
        }

        public CriterionGroup orMailReceiverGreaterThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("mail_receiver >", value, "mailReceiver");
            return or(criterion);
        }

        public CriterionGroup orMailReceiverGreaterThanOrEqualTo(String value) {
            return orMailReceiverGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orMailReceiverGreaterThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("mail_receiver >=", value, "mailReceiver");
            return or(criterion);
        }

        public CriterionGroup orMailReceiverLessThan(String value) {
            return orMailReceiverLessThan(value, Boolean.TRUE);
        }

        public CriterionGroup orMailReceiverLessThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("mail_receiver <", value, "mailReceiver");
            return or(criterion);
        }

        public CriterionGroup orMailReceiverLessThanOrEqualTo(String value) {
            return orMailReceiverLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orMailReceiverLessThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("mail_receiver <=", value, "mailReceiver");
            return or(criterion);
        }

        public CriterionGroup orMailReceiverLike(String value) {
            return orMailReceiverLike(value, Boolean.TRUE);
        }

        public CriterionGroup orMailReceiverLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("mail_receiver like", value, "mailReceiver");
            return or(criterion);
        }

        public CriterionGroup orMailReceiverLikeLeft(String value) {
            return orMailReceiverLikeLeft(value, Boolean.TRUE);
        }

        public CriterionGroup orMailReceiverLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            Criterion criterion = new Criterion("mail_receiver like", value, "mailReceiver");
            return or(criterion);
        }

        public CriterionGroup orMailReceiverLikeRight(String value) {
            return orMailReceiverLikeRight(value, Boolean.TRUE);
        }

        public CriterionGroup orMailReceiverLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("mail_receiver like", value, "mailReceiver");
            return or(criterion);
        }

        public CriterionGroup orMailReceiverLikeBoth(String value) {
            return orMailReceiverLikeBoth(value, Boolean.TRUE);
        }

        public CriterionGroup orMailReceiverLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("mail_receiver like", value, "mailReceiver");
            return or(criterion);
        }

        public CriterionGroup orMailReceiverNotLike(String value) {
            return orMailReceiverNotLike(value, Boolean.TRUE);
        }

        public CriterionGroup orMailReceiverNotLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("mail_receiver not like", value, "mailReceiver");
            return or(criterion);
        }

        public CriterionGroup orMailReceiverNotLikeLeft(String value) {
            return orMailReceiverNotLikeLeft(value, Boolean.TRUE);
        }

        public CriterionGroup orMailReceiverNotLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            Criterion criterion = new Criterion("mail_receiver not like", value, "mailReceiver");
            return or(criterion);
        }

        public CriterionGroup orMailReceiverNotLikeRight(String value) {
            return orMailReceiverNotLikeRight(value, Boolean.TRUE);
        }

        public CriterionGroup orMailReceiverNotLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("mail_receiver not like", value, "mailReceiver");
            return or(criterion);
        }

        public CriterionGroup orMailReceiverNotLikeBoth(String value) {
            return orMailReceiverNotLikeBoth(value, Boolean.TRUE);
        }

        public CriterionGroup orMailReceiverNotLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("mail_receiver not like", value, "mailReceiver");
            return or(criterion);
        }

        public CriterionGroup orMailReceiverIn(Collection<String> values) {
            Criterion criterion = new Criterion("mail_receiver in", values, "mailReceiver");
            return or(criterion);
        }

        public CriterionGroup orMailReceiverNotIn(Collection<String> values) {
            Criterion criterion = new Criterion("mail_receiver not in", values, "mailReceiver");
            return or(criterion);
        }

        public CriterionGroup orMailReceiverBetween(String value1, String value2) {
            Criterion criterion = new Criterion("mail_receiver between", value1, value2, "mailReceiver");
            return or(criterion);
        }

        public CriterionGroup orMailReceiverNotBetween(String value1, String value2) {
            Criterion criterion = new Criterion("mail_receiver not between", value1, value2, "mailReceiver");
            return or(criterion);
        }

        public CriterionGroup orApiPasswordIsNull() {
            Criterion criterion = new Criterion("api_password is null");
            return or(criterion);
        }

        public CriterionGroup orApiPasswordIsNotNull() {
            Criterion criterion = new Criterion("api_password is not null");
            return or(criterion);
        }

        public CriterionGroup orApiPasswordEqualTo(String value) {
            return orApiPasswordEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orApiPasswordEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("api_password =", value, "apiPassword");
            return or(criterion);
        }

        public CriterionGroup orApiPasswordNotEqualTo(String value) {
            return orApiPasswordNotEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orApiPasswordNotEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("api_password <>", value, "apiPassword");
            return or(criterion);
        }

        public CriterionGroup orApiPasswordGreaterThan(String value) {
            return orApiPasswordGreaterThan(value, Boolean.TRUE);
        }

        public CriterionGroup orApiPasswordGreaterThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("api_password >", value, "apiPassword");
            return or(criterion);
        }

        public CriterionGroup orApiPasswordGreaterThanOrEqualTo(String value) {
            return orApiPasswordGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orApiPasswordGreaterThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("api_password >=", value, "apiPassword");
            return or(criterion);
        }

        public CriterionGroup orApiPasswordLessThan(String value) {
            return orApiPasswordLessThan(value, Boolean.TRUE);
        }

        public CriterionGroup orApiPasswordLessThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("api_password <", value, "apiPassword");
            return or(criterion);
        }

        public CriterionGroup orApiPasswordLessThanOrEqualTo(String value) {
            return orApiPasswordLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orApiPasswordLessThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("api_password <=", value, "apiPassword");
            return or(criterion);
        }

        public CriterionGroup orApiPasswordLike(String value) {
            return orApiPasswordLike(value, Boolean.TRUE);
        }

        public CriterionGroup orApiPasswordLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("api_password like", value, "apiPassword");
            return or(criterion);
        }

        public CriterionGroup orApiPasswordLikeLeft(String value) {
            return orApiPasswordLikeLeft(value, Boolean.TRUE);
        }

        public CriterionGroup orApiPasswordLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            Criterion criterion = new Criterion("api_password like", value, "apiPassword");
            return or(criterion);
        }

        public CriterionGroup orApiPasswordLikeRight(String value) {
            return orApiPasswordLikeRight(value, Boolean.TRUE);
        }

        public CriterionGroup orApiPasswordLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("api_password like", value, "apiPassword");
            return or(criterion);
        }

        public CriterionGroup orApiPasswordLikeBoth(String value) {
            return orApiPasswordLikeBoth(value, Boolean.TRUE);
        }

        public CriterionGroup orApiPasswordLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("api_password like", value, "apiPassword");
            return or(criterion);
        }

        public CriterionGroup orApiPasswordNotLike(String value) {
            return orApiPasswordNotLike(value, Boolean.TRUE);
        }

        public CriterionGroup orApiPasswordNotLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("api_password not like", value, "apiPassword");
            return or(criterion);
        }

        public CriterionGroup orApiPasswordNotLikeLeft(String value) {
            return orApiPasswordNotLikeLeft(value, Boolean.TRUE);
        }

        public CriterionGroup orApiPasswordNotLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            Criterion criterion = new Criterion("api_password not like", value, "apiPassword");
            return or(criterion);
        }

        public CriterionGroup orApiPasswordNotLikeRight(String value) {
            return orApiPasswordNotLikeRight(value, Boolean.TRUE);
        }

        public CriterionGroup orApiPasswordNotLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("api_password not like", value, "apiPassword");
            return or(criterion);
        }

        public CriterionGroup orApiPasswordNotLikeBoth(String value) {
            return orApiPasswordNotLikeBoth(value, Boolean.TRUE);
        }

        public CriterionGroup orApiPasswordNotLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("api_password not like", value, "apiPassword");
            return or(criterion);
        }

        public CriterionGroup orApiPasswordIn(Collection<String> values) {
            Criterion criterion = new Criterion("api_password in", values, "apiPassword");
            return or(criterion);
        }

        public CriterionGroup orApiPasswordNotIn(Collection<String> values) {
            Criterion criterion = new Criterion("api_password not in", values, "apiPassword");
            return or(criterion);
        }

        public CriterionGroup orApiPasswordBetween(String value1, String value2) {
            Criterion criterion = new Criterion("api_password between", value1, value2, "apiPassword");
            return or(criterion);
        }

        public CriterionGroup orApiPasswordNotBetween(String value1, String value2) {
            Criterion criterion = new Criterion("api_password not between", value1, value2, "apiPassword");
            return or(criterion);
        }

        public CriterionGroup orApiTokenIsNull() {
            Criterion criterion = new Criterion("api_token is null");
            return or(criterion);
        }

        public CriterionGroup orApiTokenIsNotNull() {
            Criterion criterion = new Criterion("api_token is not null");
            return or(criterion);
        }

        public CriterionGroup orApiTokenEqualTo(String value) {
            return orApiTokenEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orApiTokenEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("api_token =", value, "apiToken");
            return or(criterion);
        }

        public CriterionGroup orApiTokenNotEqualTo(String value) {
            return orApiTokenNotEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orApiTokenNotEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("api_token <>", value, "apiToken");
            return or(criterion);
        }

        public CriterionGroup orApiTokenGreaterThan(String value) {
            return orApiTokenGreaterThan(value, Boolean.TRUE);
        }

        public CriterionGroup orApiTokenGreaterThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("api_token >", value, "apiToken");
            return or(criterion);
        }

        public CriterionGroup orApiTokenGreaterThanOrEqualTo(String value) {
            return orApiTokenGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orApiTokenGreaterThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("api_token >=", value, "apiToken");
            return or(criterion);
        }

        public CriterionGroup orApiTokenLessThan(String value) {
            return orApiTokenLessThan(value, Boolean.TRUE);
        }

        public CriterionGroup orApiTokenLessThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("api_token <", value, "apiToken");
            return or(criterion);
        }

        public CriterionGroup orApiTokenLessThanOrEqualTo(String value) {
            return orApiTokenLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orApiTokenLessThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("api_token <=", value, "apiToken");
            return or(criterion);
        }

        public CriterionGroup orApiTokenLike(String value) {
            return orApiTokenLike(value, Boolean.TRUE);
        }

        public CriterionGroup orApiTokenLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("api_token like", value, "apiToken");
            return or(criterion);
        }

        public CriterionGroup orApiTokenLikeLeft(String value) {
            return orApiTokenLikeLeft(value, Boolean.TRUE);
        }

        public CriterionGroup orApiTokenLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            Criterion criterion = new Criterion("api_token like", value, "apiToken");
            return or(criterion);
        }

        public CriterionGroup orApiTokenLikeRight(String value) {
            return orApiTokenLikeRight(value, Boolean.TRUE);
        }

        public CriterionGroup orApiTokenLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("api_token like", value, "apiToken");
            return or(criterion);
        }

        public CriterionGroup orApiTokenLikeBoth(String value) {
            return orApiTokenLikeBoth(value, Boolean.TRUE);
        }

        public CriterionGroup orApiTokenLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("api_token like", value, "apiToken");
            return or(criterion);
        }

        public CriterionGroup orApiTokenNotLike(String value) {
            return orApiTokenNotLike(value, Boolean.TRUE);
        }

        public CriterionGroup orApiTokenNotLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("api_token not like", value, "apiToken");
            return or(criterion);
        }

        public CriterionGroup orApiTokenNotLikeLeft(String value) {
            return orApiTokenNotLikeLeft(value, Boolean.TRUE);
        }

        public CriterionGroup orApiTokenNotLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            Criterion criterion = new Criterion("api_token not like", value, "apiToken");
            return or(criterion);
        }

        public CriterionGroup orApiTokenNotLikeRight(String value) {
            return orApiTokenNotLikeRight(value, Boolean.TRUE);
        }

        public CriterionGroup orApiTokenNotLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("api_token not like", value, "apiToken");
            return or(criterion);
        }

        public CriterionGroup orApiTokenNotLikeBoth(String value) {
            return orApiTokenNotLikeBoth(value, Boolean.TRUE);
        }

        public CriterionGroup orApiTokenNotLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("api_token not like", value, "apiToken");
            return or(criterion);
        }

        public CriterionGroup orApiTokenIn(Collection<String> values) {
            Criterion criterion = new Criterion("api_token in", values, "apiToken");
            return or(criterion);
        }

        public CriterionGroup orApiTokenNotIn(Collection<String> values) {
            Criterion criterion = new Criterion("api_token not in", values, "apiToken");
            return or(criterion);
        }

        public CriterionGroup orApiTokenBetween(String value1, String value2) {
            Criterion criterion = new Criterion("api_token between", value1, value2, "apiToken");
            return or(criterion);
        }

        public CriterionGroup orApiTokenNotBetween(String value1, String value2) {
            Criterion criterion = new Criterion("api_token not between", value1, value2, "apiToken");
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

    public static final class Builder extends BaseExampleBuilder<Builder, ProjectExample> {

        protected List<Criteria> oredCriteria;

        private Builder() {

        }

        public Builder oredCriteria(List<Criteria> oredCriteria) {
            this.oredCriteria = oredCriteria;
            return this;
        }

        @Override
        public ProjectExample build() {
            return new ProjectExample(this);
        }
    }
}

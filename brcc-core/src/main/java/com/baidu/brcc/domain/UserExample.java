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

public class UserExample extends BaseExample {

    protected List<Criteria> oredCriteria;

    private UserExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * 用户
     */
    private UserExample(Builder builder) {
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

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            return andPasswordEqualTo(value, Boolean.TRUE);
        }

        public Criteria andPasswordEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            return andPasswordNotEqualTo(value, Boolean.TRUE);
        }

        public Criteria andPasswordNotEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            return andPasswordGreaterThan(value, Boolean.TRUE);
        }

        public Criteria andPasswordGreaterThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            return andPasswordGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            return andPasswordLessThan(value, Boolean.TRUE);
        }

        public Criteria andPasswordLessThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            return andPasswordLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andPasswordLessThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            return andPasswordLike(value, Boolean.TRUE);
        }

        public Criteria andPasswordLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLikeLeft(String value) {
            return andPasswordLikeLeft(value, Boolean.TRUE);
        }

        public Criteria andPasswordLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLikeRight(String value) {
            return andPasswordLikeRight(value, Boolean.TRUE);
        }

        public Criteria andPasswordLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLikeBoth(String value) {
            return andPasswordLikeBoth(value, Boolean.TRUE);
        }

        public Criteria andPasswordLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            return andPasswordNotLike(value, Boolean.TRUE);
        }

        public Criteria andPasswordNotLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLikeLeft(String value) {
            return andPasswordNotLikeLeft(value, Boolean.TRUE);
        }

        public Criteria andPasswordNotLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLikeRight(String value) {
            return andPasswordNotLikeRight(value, Boolean.TRUE);
        }

        public Criteria andPasswordNotLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLikeBoth(String value) {
            return andPasswordNotLikeBoth(value, Boolean.TRUE);
        }

        public Criteria andPasswordNotLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(Collection<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(Collection<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
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

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            return andStatusEqualTo(value, Boolean.TRUE);
        }

        public Criteria andStatusEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            return andStatusNotEqualTo(value, Boolean.TRUE);
        }

        public Criteria andStatusNotEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            return andStatusGreaterThan(value, Boolean.TRUE);
        }

        public Criteria andStatusGreaterThan(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            return andStatusGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            return andStatusLessThan(value, Boolean.TRUE);
        }

        public Criteria andStatusLessThan(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            return andStatusLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(Collection<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(Collection<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Byte value) {
            return andTypeEqualTo(value, Boolean.TRUE);
        }

        public Criteria andTypeEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Byte value) {
            return andTypeNotEqualTo(value, Boolean.TRUE);
        }

        public Criteria andTypeNotEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Byte value) {
            return andTypeGreaterThan(value, Boolean.TRUE);
        }

        public Criteria andTypeGreaterThan(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Byte value) {
            return andTypeGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andTypeGreaterThanOrEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Byte value) {
            return andTypeLessThan(value, Boolean.TRUE);
        }

        public Criteria andTypeLessThan(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Byte value) {
            return andTypeLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andTypeLessThanOrEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(Collection<Byte> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(Collection<Byte> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Byte value1, Byte value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andRoleIsNull() {
            addCriterion("role is null");
            return (Criteria) this;
        }

        public Criteria andRoleIsNotNull() {
            addCriterion("role is not null");
            return (Criteria) this;
        }

        public Criteria andRoleEqualTo(Byte value) {
            return andRoleEqualTo(value, Boolean.TRUE);
        }

        public Criteria andRoleEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("role =", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotEqualTo(Byte value) {
            return andRoleNotEqualTo(value, Boolean.TRUE);
        }

        public Criteria andRoleNotEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("role <>", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThan(Byte value) {
            return andRoleGreaterThan(value, Boolean.TRUE);
        }

        public Criteria andRoleGreaterThan(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("role >", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThanOrEqualTo(Byte value) {
            return andRoleGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andRoleGreaterThanOrEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("role >=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThan(Byte value) {
            return andRoleLessThan(value, Boolean.TRUE);
        }

        public Criteria andRoleLessThan(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("role <", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThanOrEqualTo(Byte value) {
            return andRoleLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andRoleLessThanOrEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("role <=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleIn(Collection<Byte> values) {
            addCriterion("role in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotIn(Collection<Byte> values) {
            addCriterion("role not in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleBetween(Byte value1, Byte value2) {
            addCriterion("role between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotBetween(Byte value1, Byte value2) {
            addCriterion("role not between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andTokenIsNull() {
            addCriterion("token is null");
            return (Criteria) this;
        }

        public Criteria andTokenIsNotNull() {
            addCriterion("token is not null");
            return (Criteria) this;
        }

        public Criteria andTokenEqualTo(String value) {
            return andTokenEqualTo(value, Boolean.TRUE);
        }

        public Criteria andTokenEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("token =", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotEqualTo(String value) {
            return andTokenNotEqualTo(value, Boolean.TRUE);
        }

        public Criteria andTokenNotEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("token <>", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThan(String value) {
            return andTokenGreaterThan(value, Boolean.TRUE);
        }

        public Criteria andTokenGreaterThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("token >", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThanOrEqualTo(String value) {
            return andTokenGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andTokenGreaterThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("token >=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThan(String value) {
            return andTokenLessThan(value, Boolean.TRUE);
        }

        public Criteria andTokenLessThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("token <", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThanOrEqualTo(String value) {
            return andTokenLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andTokenLessThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("token <=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLike(String value) {
            return andTokenLike(value, Boolean.TRUE);
        }

        public Criteria andTokenLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("token like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLikeLeft(String value) {
            return andTokenLikeLeft(value, Boolean.TRUE);
        }

        public Criteria andTokenLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            addCriterion("token like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLikeRight(String value) {
            return andTokenLikeRight(value, Boolean.TRUE);
        }

        public Criteria andTokenLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("token like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLikeBoth(String value) {
            return andTokenLikeBoth(value, Boolean.TRUE);
        }

        public Criteria andTokenLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("token like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotLike(String value) {
            return andTokenNotLike(value, Boolean.TRUE);
        }

        public Criteria andTokenNotLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("token not like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotLikeLeft(String value) {
            return andTokenNotLikeLeft(value, Boolean.TRUE);
        }

        public Criteria andTokenNotLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            addCriterion("token not like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotLikeRight(String value) {
            return andTokenNotLikeRight(value, Boolean.TRUE);
        }

        public Criteria andTokenNotLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("token not like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotLikeBoth(String value) {
            return andTokenNotLikeBoth(value, Boolean.TRUE);
        }

        public Criteria andTokenNotLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("token not like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenIn(Collection<String> values) {
            addCriterion("token in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotIn(Collection<String> values) {
            addCriterion("token not in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenBetween(String value1, String value2) {
            addCriterion("token between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotBetween(String value1, String value2) {
            addCriterion("token not between", value1, value2, "token");
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

        private UserExample example;

        protected Criteria(UserExample example) {
            super();
            this.example = example;
        }

        public UserExample toExample() {
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

        public CriterionGroup orPasswordIsNull() {
            Criterion criterion = new Criterion("password is null");
            return or(criterion);
        }

        public CriterionGroup orPasswordIsNotNull() {
            Criterion criterion = new Criterion("password is not null");
            return or(criterion);
        }

        public CriterionGroup orPasswordEqualTo(String value) {
            return orPasswordEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orPasswordEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("password =", value, "password");
            return or(criterion);
        }

        public CriterionGroup orPasswordNotEqualTo(String value) {
            return orPasswordNotEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orPasswordNotEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("password <>", value, "password");
            return or(criterion);
        }

        public CriterionGroup orPasswordGreaterThan(String value) {
            return orPasswordGreaterThan(value, Boolean.TRUE);
        }

        public CriterionGroup orPasswordGreaterThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("password >", value, "password");
            return or(criterion);
        }

        public CriterionGroup orPasswordGreaterThanOrEqualTo(String value) {
            return orPasswordGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orPasswordGreaterThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("password >=", value, "password");
            return or(criterion);
        }

        public CriterionGroup orPasswordLessThan(String value) {
            return orPasswordLessThan(value, Boolean.TRUE);
        }

        public CriterionGroup orPasswordLessThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("password <", value, "password");
            return or(criterion);
        }

        public CriterionGroup orPasswordLessThanOrEqualTo(String value) {
            return orPasswordLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orPasswordLessThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("password <=", value, "password");
            return or(criterion);
        }

        public CriterionGroup orPasswordLike(String value) {
            return orPasswordLike(value, Boolean.TRUE);
        }

        public CriterionGroup orPasswordLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("password like", value, "password");
            return or(criterion);
        }

        public CriterionGroup orPasswordLikeLeft(String value) {
            return orPasswordLikeLeft(value, Boolean.TRUE);
        }

        public CriterionGroup orPasswordLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            Criterion criterion = new Criterion("password like", value, "password");
            return or(criterion);
        }

        public CriterionGroup orPasswordLikeRight(String value) {
            return orPasswordLikeRight(value, Boolean.TRUE);
        }

        public CriterionGroup orPasswordLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("password like", value, "password");
            return or(criterion);
        }

        public CriterionGroup orPasswordLikeBoth(String value) {
            return orPasswordLikeBoth(value, Boolean.TRUE);
        }

        public CriterionGroup orPasswordLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("password like", value, "password");
            return or(criterion);
        }

        public CriterionGroup orPasswordNotLike(String value) {
            return orPasswordNotLike(value, Boolean.TRUE);
        }

        public CriterionGroup orPasswordNotLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("password not like", value, "password");
            return or(criterion);
        }

        public CriterionGroup orPasswordNotLikeLeft(String value) {
            return orPasswordNotLikeLeft(value, Boolean.TRUE);
        }

        public CriterionGroup orPasswordNotLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            Criterion criterion = new Criterion("password not like", value, "password");
            return or(criterion);
        }

        public CriterionGroup orPasswordNotLikeRight(String value) {
            return orPasswordNotLikeRight(value, Boolean.TRUE);
        }

        public CriterionGroup orPasswordNotLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("password not like", value, "password");
            return or(criterion);
        }

        public CriterionGroup orPasswordNotLikeBoth(String value) {
            return orPasswordNotLikeBoth(value, Boolean.TRUE);
        }

        public CriterionGroup orPasswordNotLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("password not like", value, "password");
            return or(criterion);
        }

        public CriterionGroup orPasswordIn(Collection<String> values) {
            Criterion criterion = new Criterion("password in", values, "password");
            return or(criterion);
        }

        public CriterionGroup orPasswordNotIn(Collection<String> values) {
            Criterion criterion = new Criterion("password not in", values, "password");
            return or(criterion);
        }

        public CriterionGroup orPasswordBetween(String value1, String value2) {
            Criterion criterion = new Criterion("password between", value1, value2, "password");
            return or(criterion);
        }

        public CriterionGroup orPasswordNotBetween(String value1, String value2) {
            Criterion criterion = new Criterion("password not between", value1, value2, "password");
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

        public CriterionGroup orStatusIsNull() {
            Criterion criterion = new Criterion("status is null");
            return or(criterion);
        }

        public CriterionGroup orStatusIsNotNull() {
            Criterion criterion = new Criterion("status is not null");
            return or(criterion);
        }

        public CriterionGroup orStatusEqualTo(Byte value) {
            return orStatusEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orStatusEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("status =", value, "status");
            return or(criterion);
        }

        public CriterionGroup orStatusNotEqualTo(Byte value) {
            return orStatusNotEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orStatusNotEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("status <>", value, "status");
            return or(criterion);
        }

        public CriterionGroup orStatusGreaterThan(Byte value) {
            return orStatusGreaterThan(value, Boolean.TRUE);
        }

        public CriterionGroup orStatusGreaterThan(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("status >", value, "status");
            return or(criterion);
        }

        public CriterionGroup orStatusGreaterThanOrEqualTo(Byte value) {
            return orStatusGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orStatusGreaterThanOrEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("status >=", value, "status");
            return or(criterion);
        }

        public CriterionGroup orStatusLessThan(Byte value) {
            return orStatusLessThan(value, Boolean.TRUE);
        }

        public CriterionGroup orStatusLessThan(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("status <", value, "status");
            return or(criterion);
        }

        public CriterionGroup orStatusLessThanOrEqualTo(Byte value) {
            return orStatusLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orStatusLessThanOrEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("status <=", value, "status");
            return or(criterion);
        }

        public CriterionGroup orStatusIn(Collection<Byte> values) {
            Criterion criterion = new Criterion("status in", values, "status");
            return or(criterion);
        }

        public CriterionGroup orStatusNotIn(Collection<Byte> values) {
            Criterion criterion = new Criterion("status not in", values, "status");
            return or(criterion);
        }

        public CriterionGroup orStatusBetween(Byte value1, Byte value2) {
            Criterion criterion = new Criterion("status between", value1, value2, "status");
            return or(criterion);
        }

        public CriterionGroup orStatusNotBetween(Byte value1, Byte value2) {
            Criterion criterion = new Criterion("status not between", value1, value2, "status");
            return or(criterion);
        }

        public CriterionGroup orTypeIsNull() {
            Criterion criterion = new Criterion("type is null");
            return or(criterion);
        }

        public CriterionGroup orTypeIsNotNull() {
            Criterion criterion = new Criterion("type is not null");
            return or(criterion);
        }

        public CriterionGroup orTypeEqualTo(Byte value) {
            return orTypeEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orTypeEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("type =", value, "type");
            return or(criterion);
        }

        public CriterionGroup orTypeNotEqualTo(Byte value) {
            return orTypeNotEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orTypeNotEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("type <>", value, "type");
            return or(criterion);
        }

        public CriterionGroup orTypeGreaterThan(Byte value) {
            return orTypeGreaterThan(value, Boolean.TRUE);
        }

        public CriterionGroup orTypeGreaterThan(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("type >", value, "type");
            return or(criterion);
        }

        public CriterionGroup orTypeGreaterThanOrEqualTo(Byte value) {
            return orTypeGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orTypeGreaterThanOrEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("type >=", value, "type");
            return or(criterion);
        }

        public CriterionGroup orTypeLessThan(Byte value) {
            return orTypeLessThan(value, Boolean.TRUE);
        }

        public CriterionGroup orTypeLessThan(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("type <", value, "type");
            return or(criterion);
        }

        public CriterionGroup orTypeLessThanOrEqualTo(Byte value) {
            return orTypeLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orTypeLessThanOrEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("type <=", value, "type");
            return or(criterion);
        }

        public CriterionGroup orTypeIn(Collection<Byte> values) {
            Criterion criterion = new Criterion("type in", values, "type");
            return or(criterion);
        }

        public CriterionGroup orTypeNotIn(Collection<Byte> values) {
            Criterion criterion = new Criterion("type not in", values, "type");
            return or(criterion);
        }

        public CriterionGroup orTypeBetween(Byte value1, Byte value2) {
            Criterion criterion = new Criterion("type between", value1, value2, "type");
            return or(criterion);
        }

        public CriterionGroup orTypeNotBetween(Byte value1, Byte value2) {
            Criterion criterion = new Criterion("type not between", value1, value2, "type");
            return or(criterion);
        }

        public CriterionGroup orRoleIsNull() {
            Criterion criterion = new Criterion("role is null");
            return or(criterion);
        }

        public CriterionGroup orRoleIsNotNull() {
            Criterion criterion = new Criterion("role is not null");
            return or(criterion);
        }

        public CriterionGroup orRoleEqualTo(Byte value) {
            return orRoleEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orRoleEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("role =", value, "role");
            return or(criterion);
        }

        public CriterionGroup orRoleNotEqualTo(Byte value) {
            return orRoleNotEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orRoleNotEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("role <>", value, "role");
            return or(criterion);
        }

        public CriterionGroup orRoleGreaterThan(Byte value) {
            return orRoleGreaterThan(value, Boolean.TRUE);
        }

        public CriterionGroup orRoleGreaterThan(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("role >", value, "role");
            return or(criterion);
        }

        public CriterionGroup orRoleGreaterThanOrEqualTo(Byte value) {
            return orRoleGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orRoleGreaterThanOrEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("role >=", value, "role");
            return or(criterion);
        }

        public CriterionGroup orRoleLessThan(Byte value) {
            return orRoleLessThan(value, Boolean.TRUE);
        }

        public CriterionGroup orRoleLessThan(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("role <", value, "role");
            return or(criterion);
        }

        public CriterionGroup orRoleLessThanOrEqualTo(Byte value) {
            return orRoleLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orRoleLessThanOrEqualTo(Byte value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("role <=", value, "role");
            return or(criterion);
        }

        public CriterionGroup orRoleIn(Collection<Byte> values) {
            Criterion criterion = new Criterion("role in", values, "role");
            return or(criterion);
        }

        public CriterionGroup orRoleNotIn(Collection<Byte> values) {
            Criterion criterion = new Criterion("role not in", values, "role");
            return or(criterion);
        }

        public CriterionGroup orRoleBetween(Byte value1, Byte value2) {
            Criterion criterion = new Criterion("role between", value1, value2, "role");
            return or(criterion);
        }

        public CriterionGroup orRoleNotBetween(Byte value1, Byte value2) {
            Criterion criterion = new Criterion("role not between", value1, value2, "role");
            return or(criterion);
        }

        public CriterionGroup orTokenIsNull() {
            Criterion criterion = new Criterion("token is null");
            return or(criterion);
        }

        public CriterionGroup orTokenIsNotNull() {
            Criterion criterion = new Criterion("token is not null");
            return or(criterion);
        }

        public CriterionGroup orTokenEqualTo(String value) {
            return orTokenEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orTokenEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("token =", value, "token");
            return or(criterion);
        }

        public CriterionGroup orTokenNotEqualTo(String value) {
            return orTokenNotEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orTokenNotEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("token <>", value, "token");
            return or(criterion);
        }

        public CriterionGroup orTokenGreaterThan(String value) {
            return orTokenGreaterThan(value, Boolean.TRUE);
        }

        public CriterionGroup orTokenGreaterThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("token >", value, "token");
            return or(criterion);
        }

        public CriterionGroup orTokenGreaterThanOrEqualTo(String value) {
            return orTokenGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orTokenGreaterThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("token >=", value, "token");
            return or(criterion);
        }

        public CriterionGroup orTokenLessThan(String value) {
            return orTokenLessThan(value, Boolean.TRUE);
        }

        public CriterionGroup orTokenLessThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("token <", value, "token");
            return or(criterion);
        }

        public CriterionGroup orTokenLessThanOrEqualTo(String value) {
            return orTokenLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orTokenLessThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("token <=", value, "token");
            return or(criterion);
        }

        public CriterionGroup orTokenLike(String value) {
            return orTokenLike(value, Boolean.TRUE);
        }

        public CriterionGroup orTokenLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("token like", value, "token");
            return or(criterion);
        }

        public CriterionGroup orTokenLikeLeft(String value) {
            return orTokenLikeLeft(value, Boolean.TRUE);
        }

        public CriterionGroup orTokenLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            Criterion criterion = new Criterion("token like", value, "token");
            return or(criterion);
        }

        public CriterionGroup orTokenLikeRight(String value) {
            return orTokenLikeRight(value, Boolean.TRUE);
        }

        public CriterionGroup orTokenLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("token like", value, "token");
            return or(criterion);
        }

        public CriterionGroup orTokenLikeBoth(String value) {
            return orTokenLikeBoth(value, Boolean.TRUE);
        }

        public CriterionGroup orTokenLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("token like", value, "token");
            return or(criterion);
        }

        public CriterionGroup orTokenNotLike(String value) {
            return orTokenNotLike(value, Boolean.TRUE);
        }

        public CriterionGroup orTokenNotLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("token not like", value, "token");
            return or(criterion);
        }

        public CriterionGroup orTokenNotLikeLeft(String value) {
            return orTokenNotLikeLeft(value, Boolean.TRUE);
        }

        public CriterionGroup orTokenNotLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            Criterion criterion = new Criterion("token not like", value, "token");
            return or(criterion);
        }

        public CriterionGroup orTokenNotLikeRight(String value) {
            return orTokenNotLikeRight(value, Boolean.TRUE);
        }

        public CriterionGroup orTokenNotLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("token not like", value, "token");
            return or(criterion);
        }

        public CriterionGroup orTokenNotLikeBoth(String value) {
            return orTokenNotLikeBoth(value, Boolean.TRUE);
        }

        public CriterionGroup orTokenNotLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("token not like", value, "token");
            return or(criterion);
        }

        public CriterionGroup orTokenIn(Collection<String> values) {
            Criterion criterion = new Criterion("token in", values, "token");
            return or(criterion);
        }

        public CriterionGroup orTokenNotIn(Collection<String> values) {
            Criterion criterion = new Criterion("token not in", values, "token");
            return or(criterion);
        }

        public CriterionGroup orTokenBetween(String value1, String value2) {
            Criterion criterion = new Criterion("token between", value1, value2, "token");
            return or(criterion);
        }

        public CriterionGroup orTokenNotBetween(String value1, String value2) {
            Criterion criterion = new Criterion("token not between", value1, value2, "token");
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

    public static final class Builder extends BaseExampleBuilder<Builder, UserExample> {

        protected List<Criteria> oredCriteria;

        private Builder() {

        }

        public Builder oredCriteria(List<Criteria> oredCriteria) {
            this.oredCriteria = oredCriteria;
            return this;
        }

        @Override
        public UserExample build() {
            return new UserExample(this);
        }
    }
}

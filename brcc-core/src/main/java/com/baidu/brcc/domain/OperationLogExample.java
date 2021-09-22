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

public class OperationLogExample extends BaseExample {

    protected List<Criteria> oredCriteria;

    private OperationLogExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * 操作日志表
     */
    private OperationLogExample(Builder builder) {
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

        public Criteria andSceneIsNull() {
            addCriterion("scene is null");
            return (Criteria) this;
        }

        public Criteria andSceneIsNotNull() {
            addCriterion("scene is not null");
            return (Criteria) this;
        }

        public Criteria andSceneEqualTo(String value) {
            return andSceneEqualTo(value, Boolean.TRUE);
        }

        public Criteria andSceneEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("scene =", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneNotEqualTo(String value) {
            return andSceneNotEqualTo(value, Boolean.TRUE);
        }

        public Criteria andSceneNotEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("scene <>", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneGreaterThan(String value) {
            return andSceneGreaterThan(value, Boolean.TRUE);
        }

        public Criteria andSceneGreaterThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("scene >", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneGreaterThanOrEqualTo(String value) {
            return andSceneGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andSceneGreaterThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("scene >=", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneLessThan(String value) {
            return andSceneLessThan(value, Boolean.TRUE);
        }

        public Criteria andSceneLessThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("scene <", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneLessThanOrEqualTo(String value) {
            return andSceneLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andSceneLessThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("scene <=", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneLike(String value) {
            return andSceneLike(value, Boolean.TRUE);
        }

        public Criteria andSceneLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("scene like", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneLikeLeft(String value) {
            return andSceneLikeLeft(value, Boolean.TRUE);
        }

        public Criteria andSceneLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            addCriterion("scene like", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneLikeRight(String value) {
            return andSceneLikeRight(value, Boolean.TRUE);
        }

        public Criteria andSceneLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("scene like", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneLikeBoth(String value) {
            return andSceneLikeBoth(value, Boolean.TRUE);
        }

        public Criteria andSceneLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("scene like", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneNotLike(String value) {
            return andSceneNotLike(value, Boolean.TRUE);
        }

        public Criteria andSceneNotLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("scene not like", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneNotLikeLeft(String value) {
            return andSceneNotLikeLeft(value, Boolean.TRUE);
        }

        public Criteria andSceneNotLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            addCriterion("scene not like", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneNotLikeRight(String value) {
            return andSceneNotLikeRight(value, Boolean.TRUE);
        }

        public Criteria andSceneNotLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("scene not like", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneNotLikeBoth(String value) {
            return andSceneNotLikeBoth(value, Boolean.TRUE);
        }

        public Criteria andSceneNotLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("scene not like", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneIn(Collection<String> values) {
            addCriterion("scene in", values, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneNotIn(Collection<String> values) {
            addCriterion("scene not in", values, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneBetween(String value1, String value2) {
            addCriterion("scene between", value1, value2, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneNotBetween(String value1, String value2) {
            addCriterion("scene not between", value1, value2, "scene");
            return (Criteria) this;
        }

        public Criteria andResponseIsNull() {
            addCriterion("response is null");
            return (Criteria) this;
        }

        public Criteria andResponseIsNotNull() {
            addCriterion("response is not null");
            return (Criteria) this;
        }

        public Criteria andResponseEqualTo(String value) {
            return andResponseEqualTo(value, Boolean.TRUE);
        }

        public Criteria andResponseEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("response =", value, "response");
            return (Criteria) this;
        }

        public Criteria andResponseNotEqualTo(String value) {
            return andResponseNotEqualTo(value, Boolean.TRUE);
        }

        public Criteria andResponseNotEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("response <>", value, "response");
            return (Criteria) this;
        }

        public Criteria andResponseGreaterThan(String value) {
            return andResponseGreaterThan(value, Boolean.TRUE);
        }

        public Criteria andResponseGreaterThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("response >", value, "response");
            return (Criteria) this;
        }

        public Criteria andResponseGreaterThanOrEqualTo(String value) {
            return andResponseGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andResponseGreaterThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("response >=", value, "response");
            return (Criteria) this;
        }

        public Criteria andResponseLessThan(String value) {
            return andResponseLessThan(value, Boolean.TRUE);
        }

        public Criteria andResponseLessThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("response <", value, "response");
            return (Criteria) this;
        }

        public Criteria andResponseLessThanOrEqualTo(String value) {
            return andResponseLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andResponseLessThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("response <=", value, "response");
            return (Criteria) this;
        }

        public Criteria andResponseLike(String value) {
            return andResponseLike(value, Boolean.TRUE);
        }

        public Criteria andResponseLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("response like", value, "response");
            return (Criteria) this;
        }

        public Criteria andResponseLikeLeft(String value) {
            return andResponseLikeLeft(value, Boolean.TRUE);
        }

        public Criteria andResponseLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            addCriterion("response like", value, "response");
            return (Criteria) this;
        }

        public Criteria andResponseLikeRight(String value) {
            return andResponseLikeRight(value, Boolean.TRUE);
        }

        public Criteria andResponseLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("response like", value, "response");
            return (Criteria) this;
        }

        public Criteria andResponseLikeBoth(String value) {
            return andResponseLikeBoth(value, Boolean.TRUE);
        }

        public Criteria andResponseLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("response like", value, "response");
            return (Criteria) this;
        }

        public Criteria andResponseNotLike(String value) {
            return andResponseNotLike(value, Boolean.TRUE);
        }

        public Criteria andResponseNotLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("response not like", value, "response");
            return (Criteria) this;
        }

        public Criteria andResponseNotLikeLeft(String value) {
            return andResponseNotLikeLeft(value, Boolean.TRUE);
        }

        public Criteria andResponseNotLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            addCriterion("response not like", value, "response");
            return (Criteria) this;
        }

        public Criteria andResponseNotLikeRight(String value) {
            return andResponseNotLikeRight(value, Boolean.TRUE);
        }

        public Criteria andResponseNotLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("response not like", value, "response");
            return (Criteria) this;
        }

        public Criteria andResponseNotLikeBoth(String value) {
            return andResponseNotLikeBoth(value, Boolean.TRUE);
        }

        public Criteria andResponseNotLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("response not like", value, "response");
            return (Criteria) this;
        }

        public Criteria andResponseIn(Collection<String> values) {
            addCriterion("response in", values, "response");
            return (Criteria) this;
        }

        public Criteria andResponseNotIn(Collection<String> values) {
            addCriterion("response not in", values, "response");
            return (Criteria) this;
        }

        public Criteria andResponseBetween(String value1, String value2) {
            addCriterion("response between", value1, value2, "response");
            return (Criteria) this;
        }

        public Criteria andResponseNotBetween(String value1, String value2) {
            addCriterion("response not between", value1, value2, "response");
            return (Criteria) this;
        }

        public Criteria andRemoteAddressIsNull() {
            addCriterion("remote_address is null");
            return (Criteria) this;
        }

        public Criteria andRemoteAddressIsNotNull() {
            addCriterion("remote_address is not null");
            return (Criteria) this;
        }

        public Criteria andRemoteAddressEqualTo(String value) {
            return andRemoteAddressEqualTo(value, Boolean.TRUE);
        }

        public Criteria andRemoteAddressEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("remote_address =", value, "remoteAddress");
            return (Criteria) this;
        }

        public Criteria andRemoteAddressNotEqualTo(String value) {
            return andRemoteAddressNotEqualTo(value, Boolean.TRUE);
        }

        public Criteria andRemoteAddressNotEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("remote_address <>", value, "remoteAddress");
            return (Criteria) this;
        }

        public Criteria andRemoteAddressGreaterThan(String value) {
            return andRemoteAddressGreaterThan(value, Boolean.TRUE);
        }

        public Criteria andRemoteAddressGreaterThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("remote_address >", value, "remoteAddress");
            return (Criteria) this;
        }

        public Criteria andRemoteAddressGreaterThanOrEqualTo(String value) {
            return andRemoteAddressGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andRemoteAddressGreaterThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("remote_address >=", value, "remoteAddress");
            return (Criteria) this;
        }

        public Criteria andRemoteAddressLessThan(String value) {
            return andRemoteAddressLessThan(value, Boolean.TRUE);
        }

        public Criteria andRemoteAddressLessThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("remote_address <", value, "remoteAddress");
            return (Criteria) this;
        }

        public Criteria andRemoteAddressLessThanOrEqualTo(String value) {
            return andRemoteAddressLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public Criteria andRemoteAddressLessThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("remote_address <=", value, "remoteAddress");
            return (Criteria) this;
        }

        public Criteria andRemoteAddressLike(String value) {
            return andRemoteAddressLike(value, Boolean.TRUE);
        }

        public Criteria andRemoteAddressLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("remote_address like", value, "remoteAddress");
            return (Criteria) this;
        }

        public Criteria andRemoteAddressLikeLeft(String value) {
            return andRemoteAddressLikeLeft(value, Boolean.TRUE);
        }

        public Criteria andRemoteAddressLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            addCriterion("remote_address like", value, "remoteAddress");
            return (Criteria) this;
        }

        public Criteria andRemoteAddressLikeRight(String value) {
            return andRemoteAddressLikeRight(value, Boolean.TRUE);
        }

        public Criteria andRemoteAddressLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("remote_address like", value, "remoteAddress");
            return (Criteria) this;
        }

        public Criteria andRemoteAddressLikeBoth(String value) {
            return andRemoteAddressLikeBoth(value, Boolean.TRUE);
        }

        public Criteria andRemoteAddressLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("remote_address like", value, "remoteAddress");
            return (Criteria) this;
        }

        public Criteria andRemoteAddressNotLike(String value) {
            return andRemoteAddressNotLike(value, Boolean.TRUE);
        }

        public Criteria andRemoteAddressNotLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            addCriterion("remote_address not like", value, "remoteAddress");
            return (Criteria) this;
        }

        public Criteria andRemoteAddressNotLikeLeft(String value) {
            return andRemoteAddressNotLikeLeft(value, Boolean.TRUE);
        }

        public Criteria andRemoteAddressNotLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            addCriterion("remote_address not like", value, "remoteAddress");
            return (Criteria) this;
        }

        public Criteria andRemoteAddressNotLikeRight(String value) {
            return andRemoteAddressNotLikeRight(value, Boolean.TRUE);
        }

        public Criteria andRemoteAddressNotLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("remote_address not like", value, "remoteAddress");
            return (Criteria) this;
        }

        public Criteria andRemoteAddressNotLikeBoth(String value) {
            return andRemoteAddressNotLikeBoth(value, Boolean.TRUE);
        }

        public Criteria andRemoteAddressNotLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return (Criteria) this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            addCriterion("remote_address not like", value, "remoteAddress");
            return (Criteria) this;
        }

        public Criteria andRemoteAddressIn(Collection<String> values) {
            addCriterion("remote_address in", values, "remoteAddress");
            return (Criteria) this;
        }

        public Criteria andRemoteAddressNotIn(Collection<String> values) {
            addCriterion("remote_address not in", values, "remoteAddress");
            return (Criteria) this;
        }

        public Criteria andRemoteAddressBetween(String value1, String value2) {
            addCriterion("remote_address between", value1, value2, "remoteAddress");
            return (Criteria) this;
        }

        public Criteria andRemoteAddressNotBetween(String value1, String value2) {
            addCriterion("remote_address not between", value1, value2, "remoteAddress");
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

        private OperationLogExample example;

        protected Criteria(OperationLogExample example) {
            super();
            this.example = example;
        }

        public OperationLogExample toExample() {
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

        public CriterionGroup orSceneIsNull() {
            Criterion criterion = new Criterion("scene is null");
            return or(criterion);
        }

        public CriterionGroup orSceneIsNotNull() {
            Criterion criterion = new Criterion("scene is not null");
            return or(criterion);
        }

        public CriterionGroup orSceneEqualTo(String value) {
            return orSceneEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orSceneEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("scene =", value, "scene");
            return or(criterion);
        }

        public CriterionGroup orSceneNotEqualTo(String value) {
            return orSceneNotEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orSceneNotEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("scene <>", value, "scene");
            return or(criterion);
        }

        public CriterionGroup orSceneGreaterThan(String value) {
            return orSceneGreaterThan(value, Boolean.TRUE);
        }

        public CriterionGroup orSceneGreaterThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("scene >", value, "scene");
            return or(criterion);
        }

        public CriterionGroup orSceneGreaterThanOrEqualTo(String value) {
            return orSceneGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orSceneGreaterThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("scene >=", value, "scene");
            return or(criterion);
        }

        public CriterionGroup orSceneLessThan(String value) {
            return orSceneLessThan(value, Boolean.TRUE);
        }

        public CriterionGroup orSceneLessThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("scene <", value, "scene");
            return or(criterion);
        }

        public CriterionGroup orSceneLessThanOrEqualTo(String value) {
            return orSceneLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orSceneLessThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("scene <=", value, "scene");
            return or(criterion);
        }

        public CriterionGroup orSceneLike(String value) {
            return orSceneLike(value, Boolean.TRUE);
        }

        public CriterionGroup orSceneLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("scene like", value, "scene");
            return or(criterion);
        }

        public CriterionGroup orSceneLikeLeft(String value) {
            return orSceneLikeLeft(value, Boolean.TRUE);
        }

        public CriterionGroup orSceneLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            Criterion criterion = new Criterion("scene like", value, "scene");
            return or(criterion);
        }

        public CriterionGroup orSceneLikeRight(String value) {
            return orSceneLikeRight(value, Boolean.TRUE);
        }

        public CriterionGroup orSceneLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("scene like", value, "scene");
            return or(criterion);
        }

        public CriterionGroup orSceneLikeBoth(String value) {
            return orSceneLikeBoth(value, Boolean.TRUE);
        }

        public CriterionGroup orSceneLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("scene like", value, "scene");
            return or(criterion);
        }

        public CriterionGroup orSceneNotLike(String value) {
            return orSceneNotLike(value, Boolean.TRUE);
        }

        public CriterionGroup orSceneNotLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("scene not like", value, "scene");
            return or(criterion);
        }

        public CriterionGroup orSceneNotLikeLeft(String value) {
            return orSceneNotLikeLeft(value, Boolean.TRUE);
        }

        public CriterionGroup orSceneNotLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            Criterion criterion = new Criterion("scene not like", value, "scene");
            return or(criterion);
        }

        public CriterionGroup orSceneNotLikeRight(String value) {
            return orSceneNotLikeRight(value, Boolean.TRUE);
        }

        public CriterionGroup orSceneNotLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("scene not like", value, "scene");
            return or(criterion);
        }

        public CriterionGroup orSceneNotLikeBoth(String value) {
            return orSceneNotLikeBoth(value, Boolean.TRUE);
        }

        public CriterionGroup orSceneNotLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("scene not like", value, "scene");
            return or(criterion);
        }

        public CriterionGroup orSceneIn(Collection<String> values) {
            Criterion criterion = new Criterion("scene in", values, "scene");
            return or(criterion);
        }

        public CriterionGroup orSceneNotIn(Collection<String> values) {
            Criterion criterion = new Criterion("scene not in", values, "scene");
            return or(criterion);
        }

        public CriterionGroup orSceneBetween(String value1, String value2) {
            Criterion criterion = new Criterion("scene between", value1, value2, "scene");
            return or(criterion);
        }

        public CriterionGroup orSceneNotBetween(String value1, String value2) {
            Criterion criterion = new Criterion("scene not between", value1, value2, "scene");
            return or(criterion);
        }

        public CriterionGroup orResponseIsNull() {
            Criterion criterion = new Criterion("response is null");
            return or(criterion);
        }

        public CriterionGroup orResponseIsNotNull() {
            Criterion criterion = new Criterion("response is not null");
            return or(criterion);
        }

        public CriterionGroup orResponseEqualTo(String value) {
            return orResponseEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orResponseEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("response =", value, "response");
            return or(criterion);
        }

        public CriterionGroup orResponseNotEqualTo(String value) {
            return orResponseNotEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orResponseNotEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("response <>", value, "response");
            return or(criterion);
        }

        public CriterionGroup orResponseGreaterThan(String value) {
            return orResponseGreaterThan(value, Boolean.TRUE);
        }

        public CriterionGroup orResponseGreaterThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("response >", value, "response");
            return or(criterion);
        }

        public CriterionGroup orResponseGreaterThanOrEqualTo(String value) {
            return orResponseGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orResponseGreaterThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("response >=", value, "response");
            return or(criterion);
        }

        public CriterionGroup orResponseLessThan(String value) {
            return orResponseLessThan(value, Boolean.TRUE);
        }

        public CriterionGroup orResponseLessThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("response <", value, "response");
            return or(criterion);
        }

        public CriterionGroup orResponseLessThanOrEqualTo(String value) {
            return orResponseLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orResponseLessThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("response <=", value, "response");
            return or(criterion);
        }

        public CriterionGroup orResponseLike(String value) {
            return orResponseLike(value, Boolean.TRUE);
        }

        public CriterionGroup orResponseLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("response like", value, "response");
            return or(criterion);
        }

        public CriterionGroup orResponseLikeLeft(String value) {
            return orResponseLikeLeft(value, Boolean.TRUE);
        }

        public CriterionGroup orResponseLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            Criterion criterion = new Criterion("response like", value, "response");
            return or(criterion);
        }

        public CriterionGroup orResponseLikeRight(String value) {
            return orResponseLikeRight(value, Boolean.TRUE);
        }

        public CriterionGroup orResponseLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("response like", value, "response");
            return or(criterion);
        }

        public CriterionGroup orResponseLikeBoth(String value) {
            return orResponseLikeBoth(value, Boolean.TRUE);
        }

        public CriterionGroup orResponseLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("response like", value, "response");
            return or(criterion);
        }

        public CriterionGroup orResponseNotLike(String value) {
            return orResponseNotLike(value, Boolean.TRUE);
        }

        public CriterionGroup orResponseNotLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("response not like", value, "response");
            return or(criterion);
        }

        public CriterionGroup orResponseNotLikeLeft(String value) {
            return orResponseNotLikeLeft(value, Boolean.TRUE);
        }

        public CriterionGroup orResponseNotLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            Criterion criterion = new Criterion("response not like", value, "response");
            return or(criterion);
        }

        public CriterionGroup orResponseNotLikeRight(String value) {
            return orResponseNotLikeRight(value, Boolean.TRUE);
        }

        public CriterionGroup orResponseNotLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("response not like", value, "response");
            return or(criterion);
        }

        public CriterionGroup orResponseNotLikeBoth(String value) {
            return orResponseNotLikeBoth(value, Boolean.TRUE);
        }

        public CriterionGroup orResponseNotLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("response not like", value, "response");
            return or(criterion);
        }

        public CriterionGroup orResponseIn(Collection<String> values) {
            Criterion criterion = new Criterion("response in", values, "response");
            return or(criterion);
        }

        public CriterionGroup orResponseNotIn(Collection<String> values) {
            Criterion criterion = new Criterion("response not in", values, "response");
            return or(criterion);
        }

        public CriterionGroup orResponseBetween(String value1, String value2) {
            Criterion criterion = new Criterion("response between", value1, value2, "response");
            return or(criterion);
        }

        public CriterionGroup orResponseNotBetween(String value1, String value2) {
            Criterion criterion = new Criterion("response not between", value1, value2, "response");
            return or(criterion);
        }

        public CriterionGroup orRemoteAddressIsNull() {
            Criterion criterion = new Criterion("remote_address is null");
            return or(criterion);
        }

        public CriterionGroup orRemoteAddressIsNotNull() {
            Criterion criterion = new Criterion("remote_address is not null");
            return or(criterion);
        }

        public CriterionGroup orRemoteAddressEqualTo(String value) {
            return orRemoteAddressEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orRemoteAddressEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("remote_address =", value, "remoteAddress");
            return or(criterion);
        }

        public CriterionGroup orRemoteAddressNotEqualTo(String value) {
            return orRemoteAddressNotEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orRemoteAddressNotEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("remote_address <>", value, "remoteAddress");
            return or(criterion);
        }

        public CriterionGroup orRemoteAddressGreaterThan(String value) {
            return orRemoteAddressGreaterThan(value, Boolean.TRUE);
        }

        public CriterionGroup orRemoteAddressGreaterThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("remote_address >", value, "remoteAddress");
            return or(criterion);
        }

        public CriterionGroup orRemoteAddressGreaterThanOrEqualTo(String value) {
            return orRemoteAddressGreaterThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orRemoteAddressGreaterThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("remote_address >=", value, "remoteAddress");
            return or(criterion);
        }

        public CriterionGroup orRemoteAddressLessThan(String value) {
            return orRemoteAddressLessThan(value, Boolean.TRUE);
        }

        public CriterionGroup orRemoteAddressLessThan(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("remote_address <", value, "remoteAddress");
            return or(criterion);
        }

        public CriterionGroup orRemoteAddressLessThanOrEqualTo(String value) {
            return orRemoteAddressLessThanOrEqualTo(value, Boolean.TRUE);
        }

        public CriterionGroup orRemoteAddressLessThanOrEqualTo(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("remote_address <=", value, "remoteAddress");
            return or(criterion);
        }

        public CriterionGroup orRemoteAddressLike(String value) {
            return orRemoteAddressLike(value, Boolean.TRUE);
        }

        public CriterionGroup orRemoteAddressLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("remote_address like", value, "remoteAddress");
            return or(criterion);
        }

        public CriterionGroup orRemoteAddressLikeLeft(String value) {
            return orRemoteAddressLikeLeft(value, Boolean.TRUE);
        }

        public CriterionGroup orRemoteAddressLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            Criterion criterion = new Criterion("remote_address like", value, "remoteAddress");
            return or(criterion);
        }

        public CriterionGroup orRemoteAddressLikeRight(String value) {
            return orRemoteAddressLikeRight(value, Boolean.TRUE);
        }

        public CriterionGroup orRemoteAddressLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("remote_address like", value, "remoteAddress");
            return or(criterion);
        }

        public CriterionGroup orRemoteAddressLikeBoth(String value) {
            return orRemoteAddressLikeBoth(value, Boolean.TRUE);
        }

        public CriterionGroup orRemoteAddressLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("remote_address like", value, "remoteAddress");
            return or(criterion);
        }

        public CriterionGroup orRemoteAddressNotLike(String value) {
            return orRemoteAddressNotLike(value, Boolean.TRUE);
        }

        public CriterionGroup orRemoteAddressNotLike(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            Criterion criterion = new Criterion("remote_address not like", value, "remoteAddress");
            return or(criterion);
        }

        public CriterionGroup orRemoteAddressNotLikeLeft(String value) {
            return orRemoteAddressNotLikeLeft(value, Boolean.TRUE);
        }

        public CriterionGroup orRemoteAddressNotLikeLeft(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            Criterion criterion = new Criterion("remote_address not like", value, "remoteAddress");
            return or(criterion);
        }

        public CriterionGroup orRemoteAddressNotLikeRight(String value) {
            return orRemoteAddressNotLikeRight(value, Boolean.TRUE);
        }

        public CriterionGroup orRemoteAddressNotLikeRight(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("remote_address not like", value, "remoteAddress");
            return or(criterion);
        }

        public CriterionGroup orRemoteAddressNotLikeBoth(String value) {
            return orRemoteAddressNotLikeBoth(value, Boolean.TRUE);
        }

        public CriterionGroup orRemoteAddressNotLikeBoth(String value, Boolean condition) {
            if (condition == null || !condition){
                return this;
            }
            if (value != null && !value.startsWith("%")) {
                value = "%".concat(value);
            }
            if (value != null && !value.endsWith("%")) {
                value = value.concat("%");
            }
            Criterion criterion = new Criterion("remote_address not like", value, "remoteAddress");
            return or(criterion);
        }

        public CriterionGroup orRemoteAddressIn(Collection<String> values) {
            Criterion criterion = new Criterion("remote_address in", values, "remoteAddress");
            return or(criterion);
        }

        public CriterionGroup orRemoteAddressNotIn(Collection<String> values) {
            Criterion criterion = new Criterion("remote_address not in", values, "remoteAddress");
            return or(criterion);
        }

        public CriterionGroup orRemoteAddressBetween(String value1, String value2) {
            Criterion criterion = new Criterion("remote_address between", value1, value2, "remoteAddress");
            return or(criterion);
        }

        public CriterionGroup orRemoteAddressNotBetween(String value1, String value2) {
            Criterion criterion = new Criterion("remote_address not between", value1, value2, "remoteAddress");
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

    public static final class Builder extends BaseExampleBuilder<Builder, OperationLogExample> {

        protected List<Criteria> oredCriteria;

        private Builder() {

        }

        public Builder oredCriteria(List<Criteria> oredCriteria) {
            this.oredCriteria = oredCriteria;
            return this;
        }

        @Override
        public OperationLogExample build() {
            return new OperationLogExample(this);
        }
    }
}

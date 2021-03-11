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

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Before;
import org.junit.Test;

public class UserExampleCriterionGroupTest {

    UserExample.CriterionGroup criterionGroup = UserExample.newBuilder().build().createCriteria()
            .andGroupCriterion();

    @Before
    public void setUp() {

    }

    @Test
    public void testOr() throws Exception {
        UserExample.CriterionGroup result =
                criterionGroup.or(new UserExample.Criterion("condition", "value", "secondValue", "typeHandler"));

    }

    @Test
    public void testToCriteria() throws Exception {
        UserExample.Criteria result = criterionGroup.toCriteria();

    }

    @Test
    public void testOrIdIsNull() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orIdIsNull();

    }

    @Test
    public void testOrIdIsNotNull() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orIdIsNotNull();

    }

    @Test
    public void testOrIdEqualTo() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrIdEqualTo2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdNotEqualTo() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrIdNotEqualTo2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdGreaterThan() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testOrIdGreaterThan2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdGreaterThanOrEqualTo() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrIdGreaterThanOrEqualTo2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdLessThan() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testOrIdLessThan2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdLessThanOrEqualTo() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrIdLessThanOrEqualTo2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdIn() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrIdNotIn() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrIdBetween() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrIdNotBetween() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrNameIsNull() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orNameIsNull();

    }

    @Test
    public void testOrNameIsNotNull() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orNameIsNotNull();

    }

    @Test
    public void testOrNameEqualTo() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orNameEqualTo("value");

    }

    @Test
    public void testOrNameEqualTo2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orNameEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameNotEqualTo() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orNameNotEqualTo("value");

    }

    @Test
    public void testOrNameNotEqualTo2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orNameNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameGreaterThan() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orNameGreaterThan("value");

    }

    @Test
    public void testOrNameGreaterThan2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orNameGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameGreaterThanOrEqualTo() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orNameGreaterThanOrEqualTo("value");

    }

    @Test
    public void testOrNameGreaterThanOrEqualTo2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orNameGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameLessThan() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orNameLessThan("value");

    }

    @Test
    public void testOrNameLessThan2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orNameLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameLessThanOrEqualTo() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orNameLessThanOrEqualTo("value");

    }

    @Test
    public void testOrNameLessThanOrEqualTo2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orNameLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameLike() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orNameLike("value");

    }

    @Test
    public void testOrNameLike2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orNameLike("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameLikeLeft() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orNameLikeLeft("value");

    }

    @Test
    public void testOrNameLikeLeft2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orNameLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameLikeRight() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orNameLikeRight("value");

    }

    @Test
    public void testOrNameLikeRight2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orNameLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameLikeBoth() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orNameLikeBoth("value");

    }

    @Test
    public void testOrNameLikeBoth2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orNameLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameNotLike() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orNameNotLike("value");

    }

    @Test
    public void testOrNameNotLike2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orNameNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameNotLikeLeft() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orNameNotLikeLeft("value");

    }

    @Test
    public void testOrNameNotLikeLeft2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orNameNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameNotLikeRight() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orNameNotLikeRight("value");

    }

    @Test
    public void testOrNameNotLikeRight2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orNameNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameNotLikeBoth() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orNameNotLikeBoth("value");

    }

    @Test
    public void testOrNameNotLikeBoth2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orNameNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameIn() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orNameIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testOrNameNotIn() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orNameNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testOrNameBetween() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orNameBetween("value1", "value2");

    }

    @Test
    public void testOrNameNotBetween() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orNameNotBetween("value1", "value2");

    }

    @Test
    public void testOrPasswordIsNull() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orPasswordIsNull();

    }

    @Test
    public void testOrPasswordIsNotNull() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orPasswordIsNotNull();

    }

    @Test
    public void testOrPasswordEqualTo() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orPasswordEqualTo("value");

    }

    @Test
    public void testOrPasswordEqualTo2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orPasswordEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrPasswordNotEqualTo() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orPasswordNotEqualTo("value");

    }

    @Test
    public void testOrPasswordNotEqualTo2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orPasswordNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrPasswordGreaterThan() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orPasswordGreaterThan("value");

    }

    @Test
    public void testOrPasswordGreaterThan2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orPasswordGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testOrPasswordGreaterThanOrEqualTo() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orPasswordGreaterThanOrEqualTo("value");

    }

    @Test
    public void testOrPasswordGreaterThanOrEqualTo2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orPasswordGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrPasswordLessThan() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orPasswordLessThan("value");

    }

    @Test
    public void testOrPasswordLessThan2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orPasswordLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testOrPasswordLessThanOrEqualTo() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orPasswordLessThanOrEqualTo("value");

    }

    @Test
    public void testOrPasswordLessThanOrEqualTo2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orPasswordLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrPasswordLike() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orPasswordLike("value");

    }

    @Test
    public void testOrPasswordLike2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orPasswordLike("value", Boolean.TRUE);

    }

    @Test
    public void testOrPasswordLikeLeft() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orPasswordLikeLeft("value");

    }

    @Test
    public void testOrPasswordLikeLeft2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orPasswordLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testOrPasswordLikeRight() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orPasswordLikeRight("value");

    }

    @Test
    public void testOrPasswordLikeRight2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orPasswordLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testOrPasswordLikeBoth() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orPasswordLikeBoth("value");

    }

    @Test
    public void testOrPasswordLikeBoth2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orPasswordLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testOrPasswordNotLike() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orPasswordNotLike("value");

    }

    @Test
    public void testOrPasswordNotLike2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orPasswordNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testOrPasswordNotLikeLeft() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orPasswordNotLikeLeft("value");

    }

    @Test
    public void testOrPasswordNotLikeLeft2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orPasswordNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testOrPasswordNotLikeRight() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orPasswordNotLikeRight("value");

    }

    @Test
    public void testOrPasswordNotLikeRight2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orPasswordNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testOrPasswordNotLikeBoth() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orPasswordNotLikeBoth("value");

    }

    @Test
    public void testOrPasswordNotLikeBoth2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orPasswordNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testOrPasswordIn() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orPasswordIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testOrPasswordNotIn() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orPasswordNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testOrPasswordBetween() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orPasswordBetween("value1", "value2");

    }

    @Test
    public void testOrPasswordNotBetween() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orPasswordNotBetween("value1", "value2");

    }

    @Test
    public void testOrApiPasswordIsNull() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orApiPasswordIsNull();

    }

    @Test
    public void testOrApiPasswordIsNotNull() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orApiPasswordIsNotNull();

    }

    @Test
    public void testOrApiPasswordEqualTo() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orApiPasswordEqualTo("value");

    }

    @Test
    public void testOrApiPasswordEqualTo2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orApiPasswordEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrApiPasswordNotEqualTo() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orApiPasswordNotEqualTo("value");

    }

    @Test
    public void testOrApiPasswordNotEqualTo2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orApiPasswordNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrApiPasswordGreaterThan() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orApiPasswordGreaterThan("value");

    }

    @Test
    public void testOrApiPasswordGreaterThan2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orApiPasswordGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testOrApiPasswordGreaterThanOrEqualTo() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orApiPasswordGreaterThanOrEqualTo("value");

    }

    @Test
    public void testOrApiPasswordGreaterThanOrEqualTo2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orApiPasswordGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrApiPasswordLessThan() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orApiPasswordLessThan("value");

    }

    @Test
    public void testOrApiPasswordLessThan2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orApiPasswordLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testOrApiPasswordLessThanOrEqualTo() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orApiPasswordLessThanOrEqualTo("value");

    }

    @Test
    public void testOrApiPasswordLessThanOrEqualTo2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orApiPasswordLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrApiPasswordLike() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orApiPasswordLike("value");

    }

    @Test
    public void testOrApiPasswordLike2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orApiPasswordLike("value", Boolean.TRUE);

    }

    @Test
    public void testOrApiPasswordLikeLeft() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orApiPasswordLikeLeft("value");

    }

    @Test
    public void testOrApiPasswordLikeLeft2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orApiPasswordLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testOrApiPasswordLikeRight() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orApiPasswordLikeRight("value");

    }

    @Test
    public void testOrApiPasswordLikeRight2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orApiPasswordLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testOrApiPasswordLikeBoth() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orApiPasswordLikeBoth("value");

    }

    @Test
    public void testOrApiPasswordLikeBoth2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orApiPasswordLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testOrApiPasswordNotLike() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orApiPasswordNotLike("value");

    }

    @Test
    public void testOrApiPasswordNotLike2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orApiPasswordNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testOrApiPasswordNotLikeLeft() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orApiPasswordNotLikeLeft("value");

    }

    @Test
    public void testOrApiPasswordNotLikeLeft2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orApiPasswordNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testOrApiPasswordNotLikeRight() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orApiPasswordNotLikeRight("value");

    }

    @Test
    public void testOrApiPasswordNotLikeRight2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orApiPasswordNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testOrApiPasswordNotLikeBoth() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orApiPasswordNotLikeBoth("value");

    }

    @Test
    public void testOrApiPasswordNotLikeBoth2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orApiPasswordNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testOrApiPasswordIn() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orApiPasswordIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testOrApiPasswordNotIn() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orApiPasswordNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testOrApiPasswordBetween() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orApiPasswordBetween("value1", "value2");

    }

    @Test
    public void testOrApiPasswordNotBetween() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orApiPasswordNotBetween("value1", "value2");

    }

    @Test
    public void testOrStatusIsNull() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orStatusIsNull();

    }

    @Test
    public void testOrStatusIsNotNull() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orStatusIsNotNull();

    }

    @Test
    public void testOrStatusEqualTo() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orStatusEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrStatusEqualTo2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orStatusEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrStatusNotEqualTo() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orStatusNotEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrStatusNotEqualTo2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orStatusNotEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrStatusGreaterThan() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orStatusGreaterThan(Byte.valueOf("00110"));

    }

    @Test
    public void testOrStatusGreaterThan2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orStatusGreaterThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrStatusGreaterThanOrEqualTo() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orStatusGreaterThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrStatusGreaterThanOrEqualTo2() throws Exception {
        UserExample.CriterionGroup result =
                criterionGroup.orStatusGreaterThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrStatusLessThan() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orStatusLessThan(Byte.valueOf("00110"));

    }

    @Test
    public void testOrStatusLessThan2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orStatusLessThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrStatusLessThanOrEqualTo() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orStatusLessThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrStatusLessThanOrEqualTo2() throws Exception {
        UserExample.CriterionGroup result =
                criterionGroup.orStatusLessThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrStatusIn() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orStatusIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testOrStatusNotIn() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orStatusNotIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testOrStatusBetween() throws Exception {
        UserExample.CriterionGroup result =
                criterionGroup.orStatusBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testOrStatusNotBetween() throws Exception {
        UserExample.CriterionGroup result =
                criterionGroup.orStatusNotBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testOrTypeIsNull() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orTypeIsNull();

    }

    @Test
    public void testOrTypeIsNotNull() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orTypeIsNotNull();

    }

    @Test
    public void testOrTypeEqualTo() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orTypeEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrTypeEqualTo2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orTypeEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrTypeNotEqualTo() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orTypeNotEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrTypeNotEqualTo2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orTypeNotEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrTypeGreaterThan() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orTypeGreaterThan(Byte.valueOf("00110"));

    }

    @Test
    public void testOrTypeGreaterThan2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orTypeGreaterThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrTypeGreaterThanOrEqualTo() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orTypeGreaterThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrTypeGreaterThanOrEqualTo2() throws Exception {
        UserExample.CriterionGroup result =
                criterionGroup.orTypeGreaterThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrTypeLessThan() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orTypeLessThan(Byte.valueOf("00110"));

    }

    @Test
    public void testOrTypeLessThan2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orTypeLessThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrTypeLessThanOrEqualTo() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orTypeLessThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrTypeLessThanOrEqualTo2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orTypeLessThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrTypeIn() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orTypeIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testOrTypeNotIn() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orTypeNotIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testOrTypeBetween() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orTypeBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testOrTypeNotBetween() throws Exception {
        UserExample.CriterionGroup result =
                criterionGroup.orTypeNotBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testOrRoleIsNull() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orRoleIsNull();

    }

    @Test
    public void testOrRoleIsNotNull() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orRoleIsNotNull();

    }

    @Test
    public void testOrRoleEqualTo() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orRoleEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrRoleEqualTo2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orRoleEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrRoleNotEqualTo() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orRoleNotEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrRoleNotEqualTo2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orRoleNotEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrRoleGreaterThan() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orRoleGreaterThan(Byte.valueOf("00110"));

    }

    @Test
    public void testOrRoleGreaterThan2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orRoleGreaterThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrRoleGreaterThanOrEqualTo() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orRoleGreaterThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrRoleGreaterThanOrEqualTo2() throws Exception {
        UserExample.CriterionGroup result =
                criterionGroup.orRoleGreaterThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrRoleLessThan() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orRoleLessThan(Byte.valueOf("00110"));

    }

    @Test
    public void testOrRoleLessThan2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orRoleLessThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrRoleLessThanOrEqualTo() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orRoleLessThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrRoleLessThanOrEqualTo2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orRoleLessThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrRoleIn() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orRoleIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testOrRoleNotIn() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orRoleNotIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testOrRoleBetween() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orRoleBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testOrRoleNotBetween() throws Exception {
        UserExample.CriterionGroup result =
                criterionGroup.orRoleNotBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testOrTokenIsNull() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orTokenIsNull();

    }

    @Test
    public void testOrTokenIsNotNull() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orTokenIsNotNull();

    }

    @Test
    public void testOrTokenEqualTo() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orTokenEqualTo("value");

    }

    @Test
    public void testOrTokenEqualTo2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orTokenEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrTokenNotEqualTo() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orTokenNotEqualTo("value");

    }

    @Test
    public void testOrTokenNotEqualTo2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orTokenNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrTokenGreaterThan() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orTokenGreaterThan("value");

    }

    @Test
    public void testOrTokenGreaterThan2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orTokenGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testOrTokenGreaterThanOrEqualTo() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orTokenGreaterThanOrEqualTo("value");

    }

    @Test
    public void testOrTokenGreaterThanOrEqualTo2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orTokenGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrTokenLessThan() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orTokenLessThan("value");

    }

    @Test
    public void testOrTokenLessThan2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orTokenLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testOrTokenLessThanOrEqualTo() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orTokenLessThanOrEqualTo("value");

    }

    @Test
    public void testOrTokenLessThanOrEqualTo2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orTokenLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrTokenLike() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orTokenLike("value");

    }

    @Test
    public void testOrTokenLike2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orTokenLike("value", Boolean.TRUE);

    }

    @Test
    public void testOrTokenLikeLeft() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orTokenLikeLeft("value");

    }

    @Test
    public void testOrTokenLikeLeft2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orTokenLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testOrTokenLikeRight() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orTokenLikeRight("value");

    }

    @Test
    public void testOrTokenLikeRight2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orTokenLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testOrTokenLikeBoth() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orTokenLikeBoth("value");

    }

    @Test
    public void testOrTokenLikeBoth2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orTokenLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testOrTokenNotLike() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orTokenNotLike("value");

    }

    @Test
    public void testOrTokenNotLike2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orTokenNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testOrTokenNotLikeLeft() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orTokenNotLikeLeft("value");

    }

    @Test
    public void testOrTokenNotLikeLeft2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orTokenNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testOrTokenNotLikeRight() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orTokenNotLikeRight("value");

    }

    @Test
    public void testOrTokenNotLikeRight2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orTokenNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testOrTokenNotLikeBoth() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orTokenNotLikeBoth("value");

    }

    @Test
    public void testOrTokenNotLikeBoth2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orTokenNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testOrTokenIn() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orTokenIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testOrTokenNotIn() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orTokenNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testOrTokenBetween() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orTokenBetween("value1", "value2");

    }

    @Test
    public void testOrTokenNotBetween() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orTokenNotBetween("value1", "value2");

    }

    @Test
    public void testOrUpdateTimeIsNull() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orUpdateTimeIsNull();

    }

    @Test
    public void testOrUpdateTimeIsNotNull() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orUpdateTimeIsNotNull();

    }

    @Test
    public void testOrUpdateTimeEqualTo() throws Exception {
        UserExample.CriterionGroup result =
                criterionGroup.orUpdateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 17).getTime());

    }

    @Test
    public void testOrUpdateTimeEqualTo2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup
                .orUpdateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 17).getTime(), Boolean.TRUE);

    }

    @Test
    public void testOrUpdateTimeNotEqualTo() throws Exception {
        UserExample.CriterionGroup result = criterionGroup
                .orUpdateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 17).getTime());

    }

    @Test
    public void testOrUpdateTimeNotEqualTo2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup
                .orUpdateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 17).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrUpdateTimeGreaterThan() throws Exception {
        UserExample.CriterionGroup result = criterionGroup
                .orUpdateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 17).getTime());

    }

    @Test
    public void testOrUpdateTimeGreaterThan2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup
                .orUpdateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 17).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrUpdateTimeGreaterThanOrEqualTo() throws Exception {
        UserExample.CriterionGroup result = criterionGroup
                .orUpdateTimeGreaterThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 17).getTime());

    }

    @Test
    public void testOrUpdateTimeGreaterThanOrEqualTo2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup
                .orUpdateTimeGreaterThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 17).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrUpdateTimeLessThan() throws Exception {
        UserExample.CriterionGroup result =
                criterionGroup.orUpdateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 17).getTime());

    }

    @Test
    public void testOrUpdateTimeLessThan2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup
                .orUpdateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 17).getTime(), Boolean.TRUE);

    }

    @Test
    public void testOrUpdateTimeLessThanOrEqualTo() throws Exception {
        UserExample.CriterionGroup result = criterionGroup
                .orUpdateTimeLessThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 17).getTime());

    }

    @Test
    public void testOrUpdateTimeLessThanOrEqualTo2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup
                .orUpdateTimeLessThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 17).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrUpdateTimeIn() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orUpdateTimeIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 17).getTime()));

    }

    @Test
    public void testOrUpdateTimeNotIn() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orUpdateTimeNotIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 17).getTime()));

    }

    @Test
    public void testOrUpdateTimeBetween() throws Exception {
        UserExample.CriterionGroup result = criterionGroup
                .orUpdateTimeBetween(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 17).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 17).getTime());

    }

    @Test
    public void testOrUpdateTimeNotBetween() throws Exception {
        UserExample.CriterionGroup result = criterionGroup
                .orUpdateTimeNotBetween(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 17).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 17).getTime());

    }

    @Test
    public void testOrCreateTimeIsNull() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orCreateTimeIsNull();

    }

    @Test
    public void testOrCreateTimeIsNotNull() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orCreateTimeIsNotNull();

    }

    @Test
    public void testOrCreateTimeEqualTo() throws Exception {
        UserExample.CriterionGroup result =
                criterionGroup.orCreateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 17).getTime());

    }

    @Test
    public void testOrCreateTimeEqualTo2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup
                .orCreateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 17).getTime(), Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeNotEqualTo() throws Exception {
        UserExample.CriterionGroup result = criterionGroup
                .orCreateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 17).getTime());

    }

    @Test
    public void testOrCreateTimeNotEqualTo2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup
                .orCreateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 17).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeGreaterThan() throws Exception {
        UserExample.CriterionGroup result = criterionGroup
                .orCreateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 17).getTime());

    }

    @Test
    public void testOrCreateTimeGreaterThan2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup
                .orCreateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 17).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeGreaterThanOrEqualTo() throws Exception {
        UserExample.CriterionGroup result = criterionGroup
                .orCreateTimeGreaterThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 17).getTime());

    }

    @Test
    public void testOrCreateTimeGreaterThanOrEqualTo2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup
                .orCreateTimeGreaterThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 17).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeLessThan() throws Exception {
        UserExample.CriterionGroup result =
                criterionGroup.orCreateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 17).getTime());

    }

    @Test
    public void testOrCreateTimeLessThan2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup
                .orCreateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 17).getTime(), Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeLessThanOrEqualTo() throws Exception {
        UserExample.CriterionGroup result = criterionGroup
                .orCreateTimeLessThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 17).getTime());

    }

    @Test
    public void testOrCreateTimeLessThanOrEqualTo2() throws Exception {
        UserExample.CriterionGroup result = criterionGroup
                .orCreateTimeLessThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 17).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeIn() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orCreateTimeIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 17).getTime()));

    }

    @Test
    public void testOrCreateTimeNotIn() throws Exception {
        UserExample.CriterionGroup result = criterionGroup.orCreateTimeNotIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 17).getTime()));

    }

    @Test
    public void testOrCreateTimeBetween() throws Exception {
        UserExample.CriterionGroup result = criterionGroup
                .orCreateTimeBetween(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 17).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 17).getTime());

    }

    @Test
    public void testOrCreateTimeNotBetween() throws Exception {
        UserExample.CriterionGroup result = criterionGroup
                .orCreateTimeNotBetween(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 17).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 17).getTime());

    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev
// .com/forum#!/testme

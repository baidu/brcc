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

public class ProjectExampleCriterionGroupTest {

    ProjectExample.CriterionGroup criterionGroup = ProjectExample.newBuilder().build().createCriteria()
            .andGroupCriterion();

    @Before
    public void setUp() {

    }

    @Test
    public void testOr() throws Exception {
        ProjectExample.CriterionGroup result =
                criterionGroup.or(new ProjectExample.Criterion("condition", "value", "secondValue", "typeHandler"));

    }

    @Test
    public void testToCriteria() throws Exception {
        ProjectExample.Criteria result = criterionGroup.toCriteria();

    }

    @Test
    public void testOrIdIsNull() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orIdIsNull();

    }

    @Test
    public void testOrIdIsNotNull() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orIdIsNotNull();

    }

    @Test
    public void testOrIdEqualTo() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrIdEqualTo2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdNotEqualTo() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrIdNotEqualTo2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdGreaterThan() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testOrIdGreaterThan2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdGreaterThanOrEqualTo() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrIdGreaterThanOrEqualTo2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdLessThan() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testOrIdLessThan2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdLessThanOrEqualTo() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrIdLessThanOrEqualTo2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdIn() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrIdNotIn() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrIdBetween() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrIdNotBetween() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrNameIsNull() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orNameIsNull();

    }

    @Test
    public void testOrNameIsNotNull() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orNameIsNotNull();

    }

    @Test
    public void testOrNameEqualTo() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orNameEqualTo("value");

    }

    @Test
    public void testOrNameEqualTo2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orNameEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameNotEqualTo() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orNameNotEqualTo("value");

    }

    @Test
    public void testOrNameNotEqualTo2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orNameNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameGreaterThan() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orNameGreaterThan("value");

    }

    @Test
    public void testOrNameGreaterThan2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orNameGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameGreaterThanOrEqualTo() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orNameGreaterThanOrEqualTo("value");

    }

    @Test
    public void testOrNameGreaterThanOrEqualTo2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orNameGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameLessThan() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orNameLessThan("value");

    }

    @Test
    public void testOrNameLessThan2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orNameLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameLessThanOrEqualTo() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orNameLessThanOrEqualTo("value");

    }

    @Test
    public void testOrNameLessThanOrEqualTo2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orNameLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameLike() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orNameLike("value");

    }

    @Test
    public void testOrNameLike2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orNameLike("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameLikeLeft() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orNameLikeLeft("value");

    }

    @Test
    public void testOrNameLikeLeft2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orNameLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameLikeRight() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orNameLikeRight("value");

    }

    @Test
    public void testOrNameLikeRight2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orNameLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameLikeBoth() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orNameLikeBoth("value");

    }

    @Test
    public void testOrNameLikeBoth2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orNameLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameNotLike() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orNameNotLike("value");

    }

    @Test
    public void testOrNameNotLike2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orNameNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameNotLikeLeft() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orNameNotLikeLeft("value");

    }

    @Test
    public void testOrNameNotLikeLeft2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orNameNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameNotLikeRight() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orNameNotLikeRight("value");

    }

    @Test
    public void testOrNameNotLikeRight2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orNameNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameNotLikeBoth() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orNameNotLikeBoth("value");

    }

    @Test
    public void testOrNameNotLikeBoth2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orNameNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameIn() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orNameIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testOrNameNotIn() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orNameNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testOrNameBetween() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orNameBetween("value1", "value2");

    }

    @Test
    public void testOrNameNotBetween() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orNameNotBetween("value1", "value2");

    }

    @Test
    public void testOrProductIdIsNull() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orProductIdIsNull();

    }

    @Test
    public void testOrProductIdIsNotNull() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orProductIdIsNotNull();

    }

    @Test
    public void testOrProductIdEqualTo() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orProductIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrProductIdEqualTo2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orProductIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProductIdNotEqualTo() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orProductIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrProductIdNotEqualTo2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orProductIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProductIdGreaterThan() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orProductIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testOrProductIdGreaterThan2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orProductIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProductIdGreaterThanOrEqualTo() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orProductIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrProductIdGreaterThanOrEqualTo2() throws Exception {
        ProjectExample.CriterionGroup result =
                criterionGroup.orProductIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProductIdLessThan() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orProductIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testOrProductIdLessThan2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orProductIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProductIdLessThanOrEqualTo() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orProductIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrProductIdLessThanOrEqualTo2() throws Exception {
        ProjectExample.CriterionGroup result =
                criterionGroup.orProductIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProductIdIn() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orProductIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrProductIdNotIn() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orProductIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrProductIdBetween() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orProductIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrProductIdNotBetween() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orProductIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrMemoIsNull() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMemoIsNull();

    }

    @Test
    public void testOrMemoIsNotNull() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMemoIsNotNull();

    }

    @Test
    public void testOrMemoEqualTo() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMemoEqualTo("value");

    }

    @Test
    public void testOrMemoEqualTo2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMemoEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoNotEqualTo() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMemoNotEqualTo("value");

    }

    @Test
    public void testOrMemoNotEqualTo2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMemoNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoGreaterThan() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMemoGreaterThan("value");

    }

    @Test
    public void testOrMemoGreaterThan2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMemoGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoGreaterThanOrEqualTo() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMemoGreaterThanOrEqualTo("value");

    }

    @Test
    public void testOrMemoGreaterThanOrEqualTo2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMemoGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoLessThan() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMemoLessThan("value");

    }

    @Test
    public void testOrMemoLessThan2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMemoLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoLessThanOrEqualTo() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMemoLessThanOrEqualTo("value");

    }

    @Test
    public void testOrMemoLessThanOrEqualTo2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMemoLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoLike() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMemoLike("value");

    }

    @Test
    public void testOrMemoLike2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMemoLike("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoLikeLeft() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMemoLikeLeft("value");

    }

    @Test
    public void testOrMemoLikeLeft2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMemoLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoLikeRight() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMemoLikeRight("value");

    }

    @Test
    public void testOrMemoLikeRight2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMemoLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoLikeBoth() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMemoLikeBoth("value");

    }

    @Test
    public void testOrMemoLikeBoth2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMemoLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoNotLike() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMemoNotLike("value");

    }

    @Test
    public void testOrMemoNotLike2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMemoNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoNotLikeLeft() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMemoNotLikeLeft("value");

    }

    @Test
    public void testOrMemoNotLikeLeft2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMemoNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoNotLikeRight() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMemoNotLikeRight("value");

    }

    @Test
    public void testOrMemoNotLikeRight2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMemoNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoNotLikeBoth() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMemoNotLikeBoth("value");

    }

    @Test
    public void testOrMemoNotLikeBoth2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMemoNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoIn() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMemoIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testOrMemoNotIn() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMemoNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testOrMemoBetween() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMemoBetween("value1", "value2");

    }

    @Test
    public void testOrMemoNotBetween() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMemoNotBetween("value1", "value2");

    }

    @Test
    public void testOrProjectTypeIsNull() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orProjectTypeIsNull();

    }

    @Test
    public void testOrProjectTypeIsNotNull() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orProjectTypeIsNotNull();

    }

    @Test
    public void testOrProjectTypeEqualTo() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orProjectTypeEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrProjectTypeEqualTo2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orProjectTypeEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrProjectTypeNotEqualTo() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orProjectTypeNotEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrProjectTypeNotEqualTo2() throws Exception {
        ProjectExample.CriterionGroup result =
                criterionGroup.orProjectTypeNotEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrProjectTypeGreaterThan() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orProjectTypeGreaterThan(Byte.valueOf("00110"));

    }

    @Test
    public void testOrProjectTypeGreaterThan2() throws Exception {
        ProjectExample.CriterionGroup result =
                criterionGroup.orProjectTypeGreaterThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrProjectTypeGreaterThanOrEqualTo() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orProjectTypeGreaterThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrProjectTypeGreaterThanOrEqualTo2() throws Exception {
        ProjectExample.CriterionGroup result =
                criterionGroup.orProjectTypeGreaterThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrProjectTypeLessThan() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orProjectTypeLessThan(Byte.valueOf("00110"));

    }

    @Test
    public void testOrProjectTypeLessThan2() throws Exception {
        ProjectExample.CriterionGroup result =
                criterionGroup.orProjectTypeLessThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrProjectTypeLessThanOrEqualTo() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orProjectTypeLessThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrProjectTypeLessThanOrEqualTo2() throws Exception {
        ProjectExample.CriterionGroup result =
                criterionGroup.orProjectTypeLessThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrProjectTypeIn() throws Exception {
        ProjectExample.CriterionGroup result =
                criterionGroup.orProjectTypeIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testOrProjectTypeNotIn() throws Exception {
        ProjectExample.CriterionGroup result =
                criterionGroup.orProjectTypeNotIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testOrProjectTypeBetween() throws Exception {
        ProjectExample.CriterionGroup result =
                criterionGroup.orProjectTypeBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testOrProjectTypeNotBetween() throws Exception {
        ProjectExample.CriterionGroup result =
                criterionGroup.orProjectTypeNotBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testOrDependencyIdsIsNull() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDependencyIdsIsNull();

    }

    @Test
    public void testOrDependencyIdsIsNotNull() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDependencyIdsIsNotNull();

    }

    @Test
    public void testOrDependencyIdsEqualTo() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDependencyIdsEqualTo("value");

    }

    @Test
    public void testOrDependencyIdsEqualTo2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDependencyIdsEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrDependencyIdsNotEqualTo() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDependencyIdsNotEqualTo("value");

    }

    @Test
    public void testOrDependencyIdsNotEqualTo2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDependencyIdsNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrDependencyIdsGreaterThan() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDependencyIdsGreaterThan("value");

    }

    @Test
    public void testOrDependencyIdsGreaterThan2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDependencyIdsGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testOrDependencyIdsGreaterThanOrEqualTo() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDependencyIdsGreaterThanOrEqualTo("value");

    }

    @Test
    public void testOrDependencyIdsGreaterThanOrEqualTo2() throws Exception {
        ProjectExample.CriterionGroup result =
                criterionGroup.orDependencyIdsGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrDependencyIdsLessThan() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDependencyIdsLessThan("value");

    }

    @Test
    public void testOrDependencyIdsLessThan2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDependencyIdsLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testOrDependencyIdsLessThanOrEqualTo() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDependencyIdsLessThanOrEqualTo("value");

    }

    @Test
    public void testOrDependencyIdsLessThanOrEqualTo2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDependencyIdsLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrDependencyIdsLike() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDependencyIdsLike("value");

    }

    @Test
    public void testOrDependencyIdsLike2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDependencyIdsLike("value", Boolean.TRUE);

    }

    @Test
    public void testOrDependencyIdsLikeLeft() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDependencyIdsLikeLeft("value");

    }

    @Test
    public void testOrDependencyIdsLikeLeft2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDependencyIdsLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testOrDependencyIdsLikeRight() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDependencyIdsLikeRight("value");

    }

    @Test
    public void testOrDependencyIdsLikeRight2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDependencyIdsLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testOrDependencyIdsLikeBoth() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDependencyIdsLikeBoth("value");

    }

    @Test
    public void testOrDependencyIdsLikeBoth2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDependencyIdsLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testOrDependencyIdsNotLike() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDependencyIdsNotLike("value");

    }

    @Test
    public void testOrDependencyIdsNotLike2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDependencyIdsNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testOrDependencyIdsNotLikeLeft() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDependencyIdsNotLikeLeft("value");

    }

    @Test
    public void testOrDependencyIdsNotLikeLeft2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDependencyIdsNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testOrDependencyIdsNotLikeRight() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDependencyIdsNotLikeRight("value");

    }

    @Test
    public void testOrDependencyIdsNotLikeRight2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDependencyIdsNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testOrDependencyIdsNotLikeBoth() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDependencyIdsNotLikeBoth("value");

    }

    @Test
    public void testOrDependencyIdsNotLikeBoth2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDependencyIdsNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testOrDependencyIdsIn() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDependencyIdsIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testOrDependencyIdsNotIn() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDependencyIdsNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testOrDependencyIdsBetween() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDependencyIdsBetween("value1", "value2");

    }

    @Test
    public void testOrDependencyIdsNotBetween() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDependencyIdsNotBetween("value1", "value2");

    }

    @Test
    public void testOrDependencyNamesIsNull() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDependencyNamesIsNull();

    }

    @Test
    public void testOrDependencyNamesIsNotNull() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDependencyNamesIsNotNull();

    }

    @Test
    public void testOrDependencyNamesEqualTo() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDependencyNamesEqualTo("value");

    }

    @Test
    public void testOrDependencyNamesEqualTo2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDependencyNamesEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrDependencyNamesNotEqualTo() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDependencyNamesNotEqualTo("value");

    }

    @Test
    public void testOrDependencyNamesNotEqualTo2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDependencyNamesNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrDependencyNamesGreaterThan() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDependencyNamesGreaterThan("value");

    }

    @Test
    public void testOrDependencyNamesGreaterThan2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDependencyNamesGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testOrDependencyNamesGreaterThanOrEqualTo() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDependencyNamesGreaterThanOrEqualTo("value");

    }

    @Test
    public void testOrDependencyNamesGreaterThanOrEqualTo2() throws Exception {
        ProjectExample.CriterionGroup result =
                criterionGroup.orDependencyNamesGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrDependencyNamesLessThan() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDependencyNamesLessThan("value");

    }

    @Test
    public void testOrDependencyNamesLessThan2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDependencyNamesLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testOrDependencyNamesLessThanOrEqualTo() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDependencyNamesLessThanOrEqualTo("value");

    }

    @Test
    public void testOrDependencyNamesLessThanOrEqualTo2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDependencyNamesLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrDependencyNamesLike() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDependencyNamesLike("value");

    }

    @Test
    public void testOrDependencyNamesLike2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDependencyNamesLike("value", Boolean.TRUE);

    }

    @Test
    public void testOrDependencyNamesLikeLeft() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDependencyNamesLikeLeft("value");

    }

    @Test
    public void testOrDependencyNamesLikeLeft2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDependencyNamesLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testOrDependencyNamesLikeRight() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDependencyNamesLikeRight("value");

    }

    @Test
    public void testOrDependencyNamesLikeRight2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDependencyNamesLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testOrDependencyNamesLikeBoth() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDependencyNamesLikeBoth("value");

    }

    @Test
    public void testOrDependencyNamesLikeBoth2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDependencyNamesLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testOrDependencyNamesNotLike() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDependencyNamesNotLike("value");

    }

    @Test
    public void testOrDependencyNamesNotLike2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDependencyNamesNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testOrDependencyNamesNotLikeLeft() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDependencyNamesNotLikeLeft("value");

    }

    @Test
    public void testOrDependencyNamesNotLikeLeft2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDependencyNamesNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testOrDependencyNamesNotLikeRight() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDependencyNamesNotLikeRight("value");

    }

    @Test
    public void testOrDependencyNamesNotLikeRight2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDependencyNamesNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testOrDependencyNamesNotLikeBoth() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDependencyNamesNotLikeBoth("value");

    }

    @Test
    public void testOrDependencyNamesNotLikeBoth2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDependencyNamesNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testOrDependencyNamesIn() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDependencyNamesIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testOrDependencyNamesNotIn() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDependencyNamesNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testOrDependencyNamesBetween() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDependencyNamesBetween("value1", "value2");

    }

    @Test
    public void testOrDependencyNamesNotBetween() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDependencyNamesNotBetween("value1", "value2");

    }

    @Test
    public void testOrMailReceiverIsNull() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMailReceiverIsNull();

    }

    @Test
    public void testOrMailReceiverIsNotNull() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMailReceiverIsNotNull();

    }

    @Test
    public void testOrMailReceiverEqualTo() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMailReceiverEqualTo("value");

    }

    @Test
    public void testOrMailReceiverEqualTo2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMailReceiverEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrMailReceiverNotEqualTo() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMailReceiverNotEqualTo("value");

    }

    @Test
    public void testOrMailReceiverNotEqualTo2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMailReceiverNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrMailReceiverGreaterThan() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMailReceiverGreaterThan("value");

    }

    @Test
    public void testOrMailReceiverGreaterThan2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMailReceiverGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testOrMailReceiverGreaterThanOrEqualTo() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMailReceiverGreaterThanOrEqualTo("value");

    }

    @Test
    public void testOrMailReceiverGreaterThanOrEqualTo2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMailReceiverGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrMailReceiverLessThan() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMailReceiverLessThan("value");

    }

    @Test
    public void testOrMailReceiverLessThan2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMailReceiverLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testOrMailReceiverLessThanOrEqualTo() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMailReceiverLessThanOrEqualTo("value");

    }

    @Test
    public void testOrMailReceiverLessThanOrEqualTo2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMailReceiverLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrMailReceiverLike() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMailReceiverLike("value");

    }

    @Test
    public void testOrMailReceiverLike2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMailReceiverLike("value", Boolean.TRUE);

    }

    @Test
    public void testOrMailReceiverLikeLeft() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMailReceiverLikeLeft("value");

    }

    @Test
    public void testOrMailReceiverLikeLeft2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMailReceiverLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testOrMailReceiverLikeRight() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMailReceiverLikeRight("value");

    }

    @Test
    public void testOrMailReceiverLikeRight2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMailReceiverLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testOrMailReceiverLikeBoth() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMailReceiverLikeBoth("value");

    }

    @Test
    public void testOrMailReceiverLikeBoth2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMailReceiverLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testOrMailReceiverNotLike() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMailReceiverNotLike("value");

    }

    @Test
    public void testOrMailReceiverNotLike2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMailReceiverNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testOrMailReceiverNotLikeLeft() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMailReceiverNotLikeLeft("value");

    }

    @Test
    public void testOrMailReceiverNotLikeLeft2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMailReceiverNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testOrMailReceiverNotLikeRight() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMailReceiverNotLikeRight("value");

    }

    @Test
    public void testOrMailReceiverNotLikeRight2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMailReceiverNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testOrMailReceiverNotLikeBoth() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMailReceiverNotLikeBoth("value");

    }

    @Test
    public void testOrMailReceiverNotLikeBoth2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMailReceiverNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testOrMailReceiverIn() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMailReceiverIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testOrMailReceiverNotIn() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMailReceiverNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testOrMailReceiverBetween() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMailReceiverBetween("value1", "value2");

    }

    @Test
    public void testOrMailReceiverNotBetween() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orMailReceiverNotBetween("value1", "value2");

    }

    @Test
    public void testOrApiPasswordIsNull() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiPasswordIsNull();

    }

    @Test
    public void testOrApiPasswordIsNotNull() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiPasswordIsNotNull();

    }

    @Test
    public void testOrApiPasswordEqualTo() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiPasswordEqualTo("value");

    }

    @Test
    public void testOrApiPasswordEqualTo2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiPasswordEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrApiPasswordNotEqualTo() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiPasswordNotEqualTo("value");

    }

    @Test
    public void testOrApiPasswordNotEqualTo2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiPasswordNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrApiPasswordGreaterThan() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiPasswordGreaterThan("value");

    }

    @Test
    public void testOrApiPasswordGreaterThan2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiPasswordGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testOrApiPasswordGreaterThanOrEqualTo() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiPasswordGreaterThanOrEqualTo("value");

    }

    @Test
    public void testOrApiPasswordGreaterThanOrEqualTo2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiPasswordGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrApiPasswordLessThan() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiPasswordLessThan("value");

    }

    @Test
    public void testOrApiPasswordLessThan2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiPasswordLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testOrApiPasswordLessThanOrEqualTo() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiPasswordLessThanOrEqualTo("value");

    }

    @Test
    public void testOrApiPasswordLessThanOrEqualTo2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiPasswordLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrApiPasswordLike() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiPasswordLike("value");

    }

    @Test
    public void testOrApiPasswordLike2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiPasswordLike("value", Boolean.TRUE);

    }

    @Test
    public void testOrApiPasswordLikeLeft() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiPasswordLikeLeft("value");

    }

    @Test
    public void testOrApiPasswordLikeLeft2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiPasswordLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testOrApiPasswordLikeRight() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiPasswordLikeRight("value");

    }

    @Test
    public void testOrApiPasswordLikeRight2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiPasswordLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testOrApiPasswordLikeBoth() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiPasswordLikeBoth("value");

    }

    @Test
    public void testOrApiPasswordLikeBoth2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiPasswordLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testOrApiPasswordNotLike() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiPasswordNotLike("value");

    }

    @Test
    public void testOrApiPasswordNotLike2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiPasswordNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testOrApiPasswordNotLikeLeft() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiPasswordNotLikeLeft("value");

    }

    @Test
    public void testOrApiPasswordNotLikeLeft2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiPasswordNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testOrApiPasswordNotLikeRight() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiPasswordNotLikeRight("value");

    }

    @Test
    public void testOrApiPasswordNotLikeRight2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiPasswordNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testOrApiPasswordNotLikeBoth() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiPasswordNotLikeBoth("value");

    }

    @Test
    public void testOrApiPasswordNotLikeBoth2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiPasswordNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testOrApiPasswordIn() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiPasswordIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testOrApiPasswordNotIn() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiPasswordNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testOrApiPasswordBetween() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiPasswordBetween("value1", "value2");

    }

    @Test
    public void testOrApiPasswordNotBetween() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiPasswordNotBetween("value1", "value2");

    }

    @Test
    public void testOrApiTokenIsNull() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiTokenIsNull();

    }

    @Test
    public void testOrApiTokenIsNotNull() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiTokenIsNotNull();

    }

    @Test
    public void testOrApiTokenEqualTo() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiTokenEqualTo("value");

    }

    @Test
    public void testOrApiTokenEqualTo2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiTokenEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrApiTokenNotEqualTo() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiTokenNotEqualTo("value");

    }

    @Test
    public void testOrApiTokenNotEqualTo2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiTokenNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrApiTokenGreaterThan() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiTokenGreaterThan("value");

    }

    @Test
    public void testOrApiTokenGreaterThan2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiTokenGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testOrApiTokenGreaterThanOrEqualTo() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiTokenGreaterThanOrEqualTo("value");

    }

    @Test
    public void testOrApiTokenGreaterThanOrEqualTo2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiTokenGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrApiTokenLessThan() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiTokenLessThan("value");

    }

    @Test
    public void testOrApiTokenLessThan2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiTokenLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testOrApiTokenLessThanOrEqualTo() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiTokenLessThanOrEqualTo("value");

    }

    @Test
    public void testOrApiTokenLessThanOrEqualTo2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiTokenLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrApiTokenLike() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiTokenLike("value");

    }

    @Test
    public void testOrApiTokenLike2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiTokenLike("value", Boolean.TRUE);

    }

    @Test
    public void testOrApiTokenLikeLeft() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiTokenLikeLeft("value");

    }

    @Test
    public void testOrApiTokenLikeLeft2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiTokenLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testOrApiTokenLikeRight() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiTokenLikeRight("value");

    }

    @Test
    public void testOrApiTokenLikeRight2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiTokenLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testOrApiTokenLikeBoth() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiTokenLikeBoth("value");

    }

    @Test
    public void testOrApiTokenLikeBoth2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiTokenLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testOrApiTokenNotLike() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiTokenNotLike("value");

    }

    @Test
    public void testOrApiTokenNotLike2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiTokenNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testOrApiTokenNotLikeLeft() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiTokenNotLikeLeft("value");

    }

    @Test
    public void testOrApiTokenNotLikeLeft2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiTokenNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testOrApiTokenNotLikeRight() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiTokenNotLikeRight("value");

    }

    @Test
    public void testOrApiTokenNotLikeRight2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiTokenNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testOrApiTokenNotLikeBoth() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiTokenNotLikeBoth("value");

    }

    @Test
    public void testOrApiTokenNotLikeBoth2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiTokenNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testOrApiTokenIn() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiTokenIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testOrApiTokenNotIn() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiTokenNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testOrApiTokenBetween() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiTokenBetween("value1", "value2");

    }

    @Test
    public void testOrApiTokenNotBetween() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orApiTokenNotBetween("value1", "value2");

    }

    @Test
    public void testOrDeletedIsNull() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDeletedIsNull();

    }

    @Test
    public void testOrDeletedIsNotNull() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDeletedIsNotNull();

    }

    @Test
    public void testOrDeletedEqualTo() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDeletedEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrDeletedEqualTo2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDeletedEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrDeletedNotEqualTo() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDeletedNotEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrDeletedNotEqualTo2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDeletedNotEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrDeletedGreaterThan() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDeletedGreaterThan(Byte.valueOf("00110"));

    }

    @Test
    public void testOrDeletedGreaterThan2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDeletedGreaterThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrDeletedGreaterThanOrEqualTo() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDeletedGreaterThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrDeletedGreaterThanOrEqualTo2() throws Exception {
        ProjectExample.CriterionGroup result =
                criterionGroup.orDeletedGreaterThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrDeletedLessThan() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDeletedLessThan(Byte.valueOf("00110"));

    }

    @Test
    public void testOrDeletedLessThan2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDeletedLessThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrDeletedLessThanOrEqualTo() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDeletedLessThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrDeletedLessThanOrEqualTo2() throws Exception {
        ProjectExample.CriterionGroup result =
                criterionGroup.orDeletedLessThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrDeletedIn() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orDeletedIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testOrDeletedNotIn() throws Exception {
        ProjectExample.CriterionGroup result =
                criterionGroup.orDeletedNotIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testOrDeletedBetween() throws Exception {
        ProjectExample.CriterionGroup result =
                criterionGroup.orDeletedBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testOrDeletedNotBetween() throws Exception {
        ProjectExample.CriterionGroup result =
                criterionGroup.orDeletedNotBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testOrUpdateTimeIsNull() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orUpdateTimeIsNull();

    }

    @Test
    public void testOrUpdateTimeIsNotNull() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orUpdateTimeIsNotNull();

    }

    @Test
    public void testOrUpdateTimeEqualTo() throws Exception {
        ProjectExample.CriterionGroup result =
                criterionGroup.orUpdateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime());

    }

    @Test
    public void testOrUpdateTimeEqualTo2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup
                .orUpdateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime(), Boolean.TRUE);

    }

    @Test
    public void testOrUpdateTimeNotEqualTo() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup
                .orUpdateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime());

    }

    @Test
    public void testOrUpdateTimeNotEqualTo2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup
                .orUpdateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrUpdateTimeGreaterThan() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup
                .orUpdateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime());

    }

    @Test
    public void testOrUpdateTimeGreaterThan2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup
                .orUpdateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrUpdateTimeGreaterThanOrEqualTo() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup
                .orUpdateTimeGreaterThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime());

    }

    @Test
    public void testOrUpdateTimeGreaterThanOrEqualTo2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup
                .orUpdateTimeGreaterThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrUpdateTimeLessThan() throws Exception {
        ProjectExample.CriterionGroup result =
                criterionGroup.orUpdateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime());

    }

    @Test
    public void testOrUpdateTimeLessThan2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup
                .orUpdateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime(), Boolean.TRUE);

    }

    @Test
    public void testOrUpdateTimeLessThanOrEqualTo() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup
                .orUpdateTimeLessThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime());

    }

    @Test
    public void testOrUpdateTimeLessThanOrEqualTo2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup
                .orUpdateTimeLessThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrUpdateTimeIn() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orUpdateTimeIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime()));

    }

    @Test
    public void testOrUpdateTimeNotIn() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orUpdateTimeNotIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime()));

    }

    @Test
    public void testOrUpdateTimeBetween() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup
                .orUpdateTimeBetween(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime());

    }

    @Test
    public void testOrUpdateTimeNotBetween() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup
                .orUpdateTimeNotBetween(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime());

    }

    @Test
    public void testOrCreateTimeIsNull() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orCreateTimeIsNull();

    }

    @Test
    public void testOrCreateTimeIsNotNull() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orCreateTimeIsNotNull();

    }

    @Test
    public void testOrCreateTimeEqualTo() throws Exception {
        ProjectExample.CriterionGroup result =
                criterionGroup.orCreateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime());

    }

    @Test
    public void testOrCreateTimeEqualTo2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup
                .orCreateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime(), Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeNotEqualTo() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup
                .orCreateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime());

    }

    @Test
    public void testOrCreateTimeNotEqualTo2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup
                .orCreateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeGreaterThan() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup
                .orCreateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime());

    }

    @Test
    public void testOrCreateTimeGreaterThan2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup
                .orCreateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeGreaterThanOrEqualTo() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup
                .orCreateTimeGreaterThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime());

    }

    @Test
    public void testOrCreateTimeGreaterThanOrEqualTo2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup
                .orCreateTimeGreaterThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeLessThan() throws Exception {
        ProjectExample.CriterionGroup result =
                criterionGroup.orCreateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime());

    }

    @Test
    public void testOrCreateTimeLessThan2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup
                .orCreateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime(), Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeLessThanOrEqualTo() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup
                .orCreateTimeLessThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime());

    }

    @Test
    public void testOrCreateTimeLessThanOrEqualTo2() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup
                .orCreateTimeLessThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeIn() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orCreateTimeIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime()));

    }

    @Test
    public void testOrCreateTimeNotIn() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup.orCreateTimeNotIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime()));

    }

    @Test
    public void testOrCreateTimeBetween() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup
                .orCreateTimeBetween(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime());

    }

    @Test
    public void testOrCreateTimeNotBetween() throws Exception {
        ProjectExample.CriterionGroup result = criterionGroup
                .orCreateTimeNotBetween(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 14).getTime());

    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev
// .com/forum#!/testme

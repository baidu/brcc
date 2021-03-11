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

public class VersionExampleCriterionGroupTest {

    VersionExample.CriterionGroup criterionGroup = VersionExample.newBuilder().build().createCriteria()
            .andGroupCriterion();

    @Before
    public void setUp() {

    }

    @Test
    public void testOr() throws Exception {
        VersionExample.CriterionGroup result =
                criterionGroup.or(new VersionExample.Criterion("condition", "value", "secondValue", "typeHandler"));

    }

    @Test
    public void testToCriteria() throws Exception {
        VersionExample.Criteria result = criterionGroup.toCriteria();

    }

    @Test
    public void testOrIdIsNull() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orIdIsNull();

    }

    @Test
    public void testOrIdIsNotNull() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orIdIsNotNull();

    }

    @Test
    public void testOrIdEqualTo() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrIdEqualTo2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdNotEqualTo() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrIdNotEqualTo2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdGreaterThan() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testOrIdGreaterThan2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdGreaterThanOrEqualTo() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrIdGreaterThanOrEqualTo2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdLessThan() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testOrIdLessThan2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdLessThanOrEqualTo() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrIdLessThanOrEqualTo2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdIn() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrIdNotIn() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrIdBetween() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrIdNotBetween() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrNameIsNull() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orNameIsNull();

    }

    @Test
    public void testOrNameIsNotNull() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orNameIsNotNull();

    }

    @Test
    public void testOrNameEqualTo() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orNameEqualTo("value");

    }

    @Test
    public void testOrNameEqualTo2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orNameEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameNotEqualTo() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orNameNotEqualTo("value");

    }

    @Test
    public void testOrNameNotEqualTo2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orNameNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameGreaterThan() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orNameGreaterThan("value");

    }

    @Test
    public void testOrNameGreaterThan2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orNameGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameGreaterThanOrEqualTo() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orNameGreaterThanOrEqualTo("value");

    }

    @Test
    public void testOrNameGreaterThanOrEqualTo2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orNameGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameLessThan() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orNameLessThan("value");

    }

    @Test
    public void testOrNameLessThan2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orNameLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameLessThanOrEqualTo() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orNameLessThanOrEqualTo("value");

    }

    @Test
    public void testOrNameLessThanOrEqualTo2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orNameLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameLike() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orNameLike("value");

    }

    @Test
    public void testOrNameLike2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orNameLike("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameLikeLeft() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orNameLikeLeft("value");

    }

    @Test
    public void testOrNameLikeLeft2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orNameLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameLikeRight() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orNameLikeRight("value");

    }

    @Test
    public void testOrNameLikeRight2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orNameLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameLikeBoth() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orNameLikeBoth("value");

    }

    @Test
    public void testOrNameLikeBoth2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orNameLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameNotLike() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orNameNotLike("value");

    }

    @Test
    public void testOrNameNotLike2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orNameNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameNotLikeLeft() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orNameNotLikeLeft("value");

    }

    @Test
    public void testOrNameNotLikeLeft2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orNameNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameNotLikeRight() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orNameNotLikeRight("value");

    }

    @Test
    public void testOrNameNotLikeRight2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orNameNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameNotLikeBoth() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orNameNotLikeBoth("value");

    }

    @Test
    public void testOrNameNotLikeBoth2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orNameNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameIn() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orNameIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testOrNameNotIn() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orNameNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testOrNameBetween() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orNameBetween("value1", "value2");

    }

    @Test
    public void testOrNameNotBetween() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orNameNotBetween("value1", "value2");

    }

    @Test
    public void testOrProductIdIsNull() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orProductIdIsNull();

    }

    @Test
    public void testOrProductIdIsNotNull() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orProductIdIsNotNull();

    }

    @Test
    public void testOrProductIdEqualTo() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orProductIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrProductIdEqualTo2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orProductIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProductIdNotEqualTo() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orProductIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrProductIdNotEqualTo2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orProductIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProductIdGreaterThan() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orProductIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testOrProductIdGreaterThan2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orProductIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProductIdGreaterThanOrEqualTo() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orProductIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrProductIdGreaterThanOrEqualTo2() throws Exception {
        VersionExample.CriterionGroup result =
                criterionGroup.orProductIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProductIdLessThan() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orProductIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testOrProductIdLessThan2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orProductIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProductIdLessThanOrEqualTo() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orProductIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrProductIdLessThanOrEqualTo2() throws Exception {
        VersionExample.CriterionGroup result =
                criterionGroup.orProductIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProductIdIn() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orProductIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrProductIdNotIn() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orProductIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrProductIdBetween() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orProductIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrProductIdNotBetween() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orProductIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrMemoIsNull() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orMemoIsNull();

    }

    @Test
    public void testOrMemoIsNotNull() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orMemoIsNotNull();

    }

    @Test
    public void testOrMemoEqualTo() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orMemoEqualTo("value");

    }

    @Test
    public void testOrMemoEqualTo2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orMemoEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoNotEqualTo() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orMemoNotEqualTo("value");

    }

    @Test
    public void testOrMemoNotEqualTo2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orMemoNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoGreaterThan() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orMemoGreaterThan("value");

    }

    @Test
    public void testOrMemoGreaterThan2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orMemoGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoGreaterThanOrEqualTo() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orMemoGreaterThanOrEqualTo("value");

    }

    @Test
    public void testOrMemoGreaterThanOrEqualTo2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orMemoGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoLessThan() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orMemoLessThan("value");

    }

    @Test
    public void testOrMemoLessThan2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orMemoLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoLessThanOrEqualTo() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orMemoLessThanOrEqualTo("value");

    }

    @Test
    public void testOrMemoLessThanOrEqualTo2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orMemoLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoLike() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orMemoLike("value");

    }

    @Test
    public void testOrMemoLike2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orMemoLike("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoLikeLeft() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orMemoLikeLeft("value");

    }

    @Test
    public void testOrMemoLikeLeft2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orMemoLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoLikeRight() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orMemoLikeRight("value");

    }

    @Test
    public void testOrMemoLikeRight2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orMemoLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoLikeBoth() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orMemoLikeBoth("value");

    }

    @Test
    public void testOrMemoLikeBoth2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orMemoLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoNotLike() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orMemoNotLike("value");

    }

    @Test
    public void testOrMemoNotLike2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orMemoNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoNotLikeLeft() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orMemoNotLikeLeft("value");

    }

    @Test
    public void testOrMemoNotLikeLeft2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orMemoNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoNotLikeRight() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orMemoNotLikeRight("value");

    }

    @Test
    public void testOrMemoNotLikeRight2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orMemoNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoNotLikeBoth() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orMemoNotLikeBoth("value");

    }

    @Test
    public void testOrMemoNotLikeBoth2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orMemoNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoIn() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orMemoIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testOrMemoNotIn() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orMemoNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testOrMemoBetween() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orMemoBetween("value1", "value2");

    }

    @Test
    public void testOrMemoNotBetween() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orMemoNotBetween("value1", "value2");

    }

    @Test
    public void testOrProjectIdIsNull() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orProjectIdIsNull();

    }

    @Test
    public void testOrProjectIdIsNotNull() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orProjectIdIsNotNull();

    }

    @Test
    public void testOrProjectIdEqualTo() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orProjectIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrProjectIdEqualTo2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orProjectIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProjectIdNotEqualTo() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orProjectIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrProjectIdNotEqualTo2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orProjectIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProjectIdGreaterThan() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orProjectIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testOrProjectIdGreaterThan2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orProjectIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProjectIdGreaterThanOrEqualTo() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orProjectIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrProjectIdGreaterThanOrEqualTo2() throws Exception {
        VersionExample.CriterionGroup result =
                criterionGroup.orProjectIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProjectIdLessThan() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orProjectIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testOrProjectIdLessThan2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orProjectIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProjectIdLessThanOrEqualTo() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orProjectIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrProjectIdLessThanOrEqualTo2() throws Exception {
        VersionExample.CriterionGroup result =
                criterionGroup.orProjectIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProjectIdIn() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orProjectIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrProjectIdNotIn() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orProjectIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrProjectIdBetween() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orProjectIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrProjectIdNotBetween() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orProjectIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrEnvironmentIdIsNull() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orEnvironmentIdIsNull();

    }

    @Test
    public void testOrEnvironmentIdIsNotNull() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orEnvironmentIdIsNotNull();

    }

    @Test
    public void testOrEnvironmentIdEqualTo() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orEnvironmentIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrEnvironmentIdEqualTo2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orEnvironmentIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrEnvironmentIdNotEqualTo() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orEnvironmentIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrEnvironmentIdNotEqualTo2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orEnvironmentIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrEnvironmentIdGreaterThan() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orEnvironmentIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testOrEnvironmentIdGreaterThan2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orEnvironmentIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrEnvironmentIdGreaterThanOrEqualTo() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orEnvironmentIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrEnvironmentIdGreaterThanOrEqualTo2() throws Exception {
        VersionExample.CriterionGroup result =
                criterionGroup.orEnvironmentIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrEnvironmentIdLessThan() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orEnvironmentIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testOrEnvironmentIdLessThan2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orEnvironmentIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrEnvironmentIdLessThanOrEqualTo() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orEnvironmentIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrEnvironmentIdLessThanOrEqualTo2() throws Exception {
        VersionExample.CriterionGroup result =
                criterionGroup.orEnvironmentIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrEnvironmentIdIn() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orEnvironmentIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrEnvironmentIdNotIn() throws Exception {
        VersionExample.CriterionGroup result =
                criterionGroup.orEnvironmentIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrEnvironmentIdBetween() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orEnvironmentIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrEnvironmentIdNotBetween() throws Exception {
        VersionExample.CriterionGroup result =
                criterionGroup.orEnvironmentIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrCheckSumIsNull() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orCheckSumIsNull();

    }

    @Test
    public void testOrCheckSumIsNotNull() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orCheckSumIsNotNull();

    }

    @Test
    public void testOrCheckSumEqualTo() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orCheckSumEqualTo("value");

    }

    @Test
    public void testOrCheckSumEqualTo2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orCheckSumEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrCheckSumNotEqualTo() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orCheckSumNotEqualTo("value");

    }

    @Test
    public void testOrCheckSumNotEqualTo2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orCheckSumNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrCheckSumGreaterThan() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orCheckSumGreaterThan("value");

    }

    @Test
    public void testOrCheckSumGreaterThan2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orCheckSumGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testOrCheckSumGreaterThanOrEqualTo() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orCheckSumGreaterThanOrEqualTo("value");

    }

    @Test
    public void testOrCheckSumGreaterThanOrEqualTo2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orCheckSumGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrCheckSumLessThan() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orCheckSumLessThan("value");

    }

    @Test
    public void testOrCheckSumLessThan2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orCheckSumLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testOrCheckSumLessThanOrEqualTo() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orCheckSumLessThanOrEqualTo("value");

    }

    @Test
    public void testOrCheckSumLessThanOrEqualTo2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orCheckSumLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrCheckSumLike() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orCheckSumLike("value");

    }

    @Test
    public void testOrCheckSumLike2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orCheckSumLike("value", Boolean.TRUE);

    }

    @Test
    public void testOrCheckSumLikeLeft() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orCheckSumLikeLeft("value");

    }

    @Test
    public void testOrCheckSumLikeLeft2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orCheckSumLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testOrCheckSumLikeRight() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orCheckSumLikeRight("value");

    }

    @Test
    public void testOrCheckSumLikeRight2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orCheckSumLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testOrCheckSumLikeBoth() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orCheckSumLikeBoth("value");

    }

    @Test
    public void testOrCheckSumLikeBoth2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orCheckSumLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testOrCheckSumNotLike() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orCheckSumNotLike("value");

    }

    @Test
    public void testOrCheckSumNotLike2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orCheckSumNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testOrCheckSumNotLikeLeft() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orCheckSumNotLikeLeft("value");

    }

    @Test
    public void testOrCheckSumNotLikeLeft2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orCheckSumNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testOrCheckSumNotLikeRight() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orCheckSumNotLikeRight("value");

    }

    @Test
    public void testOrCheckSumNotLikeRight2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orCheckSumNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testOrCheckSumNotLikeBoth() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orCheckSumNotLikeBoth("value");

    }

    @Test
    public void testOrCheckSumNotLikeBoth2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orCheckSumNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testOrCheckSumIn() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orCheckSumIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testOrCheckSumNotIn() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orCheckSumNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testOrCheckSumBetween() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orCheckSumBetween("value1", "value2");

    }

    @Test
    public void testOrCheckSumNotBetween() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orCheckSumNotBetween("value1", "value2");

    }

    @Test
    public void testOrCheckSumDateIsNull() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orCheckSumDateIsNull();

    }

    @Test
    public void testOrCheckSumDateIsNotNull() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orCheckSumDateIsNotNull();

    }

    @Test
    public void testOrCheckSumDateEqualTo() throws Exception {
        VersionExample.CriterionGroup result =
                criterionGroup.orCheckSumDateEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime());

    }

    @Test
    public void testOrCheckSumDateEqualTo2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup
                .orCheckSumDateEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime(), Boolean.TRUE);

    }

    @Test
    public void testOrCheckSumDateNotEqualTo() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup
                .orCheckSumDateNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime());

    }

    @Test
    public void testOrCheckSumDateNotEqualTo2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup
                .orCheckSumDateNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrCheckSumDateGreaterThan() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup
                .orCheckSumDateGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime());

    }

    @Test
    public void testOrCheckSumDateGreaterThan2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup
                .orCheckSumDateGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrCheckSumDateGreaterThanOrEqualTo() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup
                .orCheckSumDateGreaterThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime());

    }

    @Test
    public void testOrCheckSumDateGreaterThanOrEqualTo2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup
                .orCheckSumDateGreaterThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrCheckSumDateLessThan() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup
                .orCheckSumDateLessThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime());

    }

    @Test
    public void testOrCheckSumDateLessThan2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup
                .orCheckSumDateLessThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrCheckSumDateLessThanOrEqualTo() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup
                .orCheckSumDateLessThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime());

    }

    @Test
    public void testOrCheckSumDateLessThanOrEqualTo2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup
                .orCheckSumDateLessThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrCheckSumDateIn() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orCheckSumDateIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime()));

    }

    @Test
    public void testOrCheckSumDateNotIn() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orCheckSumDateNotIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime()));

    }

    @Test
    public void testOrCheckSumDateBetween() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup
                .orCheckSumDateBetween(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime());

    }

    @Test
    public void testOrCheckSumDateNotBetween() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup
                .orCheckSumDateNotBetween(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime());

    }

    @Test
    public void testOrCheckSumEnableIsNull() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orCheckSumEnableIsNull();

    }

    @Test
    public void testOrCheckSumEnableIsNotNull() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orCheckSumEnableIsNotNull();

    }

    @Test
    public void testOrCheckSumEnableEqualTo() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orCheckSumEnableEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrCheckSumEnableEqualTo2() throws Exception {
        VersionExample.CriterionGroup result =
                criterionGroup.orCheckSumEnableEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrCheckSumEnableNotEqualTo() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orCheckSumEnableNotEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrCheckSumEnableNotEqualTo2() throws Exception {
        VersionExample.CriterionGroup result =
                criterionGroup.orCheckSumEnableNotEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrCheckSumEnableGreaterThan() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orCheckSumEnableGreaterThan(Byte.valueOf("00110"));

    }

    @Test
    public void testOrCheckSumEnableGreaterThan2() throws Exception {
        VersionExample.CriterionGroup result =
                criterionGroup.orCheckSumEnableGreaterThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrCheckSumEnableGreaterThanOrEqualTo() throws Exception {
        VersionExample.CriterionGroup result =
                criterionGroup.orCheckSumEnableGreaterThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrCheckSumEnableGreaterThanOrEqualTo2() throws Exception {
        VersionExample.CriterionGroup result =
                criterionGroup.orCheckSumEnableGreaterThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrCheckSumEnableLessThan() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orCheckSumEnableLessThan(Byte.valueOf("00110"));

    }

    @Test
    public void testOrCheckSumEnableLessThan2() throws Exception {
        VersionExample.CriterionGroup result =
                criterionGroup.orCheckSumEnableLessThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrCheckSumEnableLessThanOrEqualTo() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orCheckSumEnableLessThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrCheckSumEnableLessThanOrEqualTo2() throws Exception {
        VersionExample.CriterionGroup result =
                criterionGroup.orCheckSumEnableLessThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrCheckSumEnableIn() throws Exception {
        VersionExample.CriterionGroup result =
                criterionGroup.orCheckSumEnableIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testOrCheckSumEnableNotIn() throws Exception {
        VersionExample.CriterionGroup result =
                criterionGroup.orCheckSumEnableNotIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testOrCheckSumEnableBetween() throws Exception {
        VersionExample.CriterionGroup result =
                criterionGroup.orCheckSumEnableBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testOrCheckSumEnableNotBetween() throws Exception {
        VersionExample.CriterionGroup result =
                criterionGroup.orCheckSumEnableNotBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testOrDeletedIsNull() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orDeletedIsNull();

    }

    @Test
    public void testOrDeletedIsNotNull() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orDeletedIsNotNull();

    }

    @Test
    public void testOrDeletedEqualTo() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orDeletedEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrDeletedEqualTo2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orDeletedEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrDeletedNotEqualTo() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orDeletedNotEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrDeletedNotEqualTo2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orDeletedNotEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrDeletedGreaterThan() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orDeletedGreaterThan(Byte.valueOf("00110"));

    }

    @Test
    public void testOrDeletedGreaterThan2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orDeletedGreaterThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrDeletedGreaterThanOrEqualTo() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orDeletedGreaterThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrDeletedGreaterThanOrEqualTo2() throws Exception {
        VersionExample.CriterionGroup result =
                criterionGroup.orDeletedGreaterThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrDeletedLessThan() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orDeletedLessThan(Byte.valueOf("00110"));

    }

    @Test
    public void testOrDeletedLessThan2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orDeletedLessThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrDeletedLessThanOrEqualTo() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orDeletedLessThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrDeletedLessThanOrEqualTo2() throws Exception {
        VersionExample.CriterionGroup result =
                criterionGroup.orDeletedLessThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrDeletedIn() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orDeletedIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testOrDeletedNotIn() throws Exception {
        VersionExample.CriterionGroup result =
                criterionGroup.orDeletedNotIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testOrDeletedBetween() throws Exception {
        VersionExample.CriterionGroup result =
                criterionGroup.orDeletedBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testOrDeletedNotBetween() throws Exception {
        VersionExample.CriterionGroup result =
                criterionGroup.orDeletedNotBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testOrUpdateTimeIsNull() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orUpdateTimeIsNull();

    }

    @Test
    public void testOrUpdateTimeIsNotNull() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orUpdateTimeIsNotNull();

    }

    @Test
    public void testOrUpdateTimeEqualTo() throws Exception {
        VersionExample.CriterionGroup result =
                criterionGroup.orUpdateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime());

    }

    @Test
    public void testOrUpdateTimeEqualTo2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup
                .orUpdateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime(), Boolean.TRUE);

    }

    @Test
    public void testOrUpdateTimeNotEqualTo() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup
                .orUpdateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime());

    }

    @Test
    public void testOrUpdateTimeNotEqualTo2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup
                .orUpdateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrUpdateTimeGreaterThan() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup
                .orUpdateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime());

    }

    @Test
    public void testOrUpdateTimeGreaterThan2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup
                .orUpdateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrUpdateTimeGreaterThanOrEqualTo() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup
                .orUpdateTimeGreaterThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime());

    }

    @Test
    public void testOrUpdateTimeGreaterThanOrEqualTo2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup
                .orUpdateTimeGreaterThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrUpdateTimeLessThan() throws Exception {
        VersionExample.CriterionGroup result =
                criterionGroup.orUpdateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime());

    }

    @Test
    public void testOrUpdateTimeLessThan2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup
                .orUpdateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime(), Boolean.TRUE);

    }

    @Test
    public void testOrUpdateTimeLessThanOrEqualTo() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup
                .orUpdateTimeLessThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime());

    }

    @Test
    public void testOrUpdateTimeLessThanOrEqualTo2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup
                .orUpdateTimeLessThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrUpdateTimeIn() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orUpdateTimeIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime()));

    }

    @Test
    public void testOrUpdateTimeNotIn() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orUpdateTimeNotIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime()));

    }

    @Test
    public void testOrUpdateTimeBetween() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup
                .orUpdateTimeBetween(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime());

    }

    @Test
    public void testOrUpdateTimeNotBetween() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup
                .orUpdateTimeNotBetween(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime());

    }

    @Test
    public void testOrCreateTimeIsNull() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orCreateTimeIsNull();

    }

    @Test
    public void testOrCreateTimeIsNotNull() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orCreateTimeIsNotNull();

    }

    @Test
    public void testOrCreateTimeEqualTo() throws Exception {
        VersionExample.CriterionGroup result =
                criterionGroup.orCreateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime());

    }

    @Test
    public void testOrCreateTimeEqualTo2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup
                .orCreateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime(), Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeNotEqualTo() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup
                .orCreateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime());

    }

    @Test
    public void testOrCreateTimeNotEqualTo2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup
                .orCreateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeGreaterThan() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup
                .orCreateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime());

    }

    @Test
    public void testOrCreateTimeGreaterThan2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup
                .orCreateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeGreaterThanOrEqualTo() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup
                .orCreateTimeGreaterThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime());

    }

    @Test
    public void testOrCreateTimeGreaterThanOrEqualTo2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup
                .orCreateTimeGreaterThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeLessThan() throws Exception {
        VersionExample.CriterionGroup result =
                criterionGroup.orCreateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime());

    }

    @Test
    public void testOrCreateTimeLessThan2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup
                .orCreateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime(), Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeLessThanOrEqualTo() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup
                .orCreateTimeLessThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime());

    }

    @Test
    public void testOrCreateTimeLessThanOrEqualTo2() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup
                .orCreateTimeLessThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeIn() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orCreateTimeIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime()));

    }

    @Test
    public void testOrCreateTimeNotIn() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup.orCreateTimeNotIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime()));

    }

    @Test
    public void testOrCreateTimeBetween() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup
                .orCreateTimeBetween(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime());

    }

    @Test
    public void testOrCreateTimeNotBetween() throws Exception {
        VersionExample.CriterionGroup result = criterionGroup
                .orCreateTimeNotBetween(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime());

    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev
// .com/forum#!/testme

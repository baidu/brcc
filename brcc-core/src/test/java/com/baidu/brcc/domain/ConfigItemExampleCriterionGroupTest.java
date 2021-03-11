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

public class ConfigItemExampleCriterionGroupTest {

    ConfigItemExample.CriterionGroup criterionGroup = ConfigItemExample.newBuilder().build().createCriteria()
            .andGroupCriterion();

    @Before
    public void setUp() {
    }

    @Test
    public void testOr() throws Exception {
        ConfigItemExample.CriterionGroup result =
                criterionGroup.or(new ConfigItemExample.Criterion("condition", "value", "secondValue", "typeHandler"));

    }

    @Test
    public void testToCriteria() throws Exception {
        ConfigItemExample.Criteria result = criterionGroup.toCriteria();

    }

    @Test
    public void testOrIdIsNull() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orIdIsNull();

    }

    @Test
    public void testOrIdIsNotNull() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orIdIsNotNull();

    }

    @Test
    public void testOrIdEqualTo() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrIdEqualTo2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdNotEqualTo() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrIdNotEqualTo2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdGreaterThan() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testOrIdGreaterThan2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdGreaterThanOrEqualTo() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrIdGreaterThanOrEqualTo2() throws Exception {
        ConfigItemExample.CriterionGroup result =
                criterionGroup.orIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdLessThan() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testOrIdLessThan2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdLessThanOrEqualTo() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrIdLessThanOrEqualTo2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdIn() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrIdNotIn() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrIdBetween() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrIdNotBetween() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrNameIsNull() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orNameIsNull();

    }

    @Test
    public void testOrNameIsNotNull() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orNameIsNotNull();

    }

    @Test
    public void testOrNameEqualTo() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orNameEqualTo("value");

    }

    @Test
    public void testOrNameEqualTo2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orNameEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameNotEqualTo() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orNameNotEqualTo("value");

    }

    @Test
    public void testOrNameNotEqualTo2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orNameNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameGreaterThan() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orNameGreaterThan("value");

    }

    @Test
    public void testOrNameGreaterThan2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orNameGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameGreaterThanOrEqualTo() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orNameGreaterThanOrEqualTo("value");

    }

    @Test
    public void testOrNameGreaterThanOrEqualTo2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orNameGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameLessThan() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orNameLessThan("value");

    }

    @Test
    public void testOrNameLessThan2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orNameLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameLessThanOrEqualTo() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orNameLessThanOrEqualTo("value");

    }

    @Test
    public void testOrNameLessThanOrEqualTo2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orNameLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameLike() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orNameLike("value");

    }

    @Test
    public void testOrNameLike2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orNameLike("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameLikeLeft() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orNameLikeLeft("value");

    }

    @Test
    public void testOrNameLikeLeft2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orNameLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameLikeRight() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orNameLikeRight("value");

    }

    @Test
    public void testOrNameLikeRight2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orNameLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameLikeBoth() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orNameLikeBoth("value");

    }

    @Test
    public void testOrNameLikeBoth2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orNameLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameNotLike() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orNameNotLike("value");

    }

    @Test
    public void testOrNameNotLike2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orNameNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameNotLikeLeft() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orNameNotLikeLeft("value");

    }

    @Test
    public void testOrNameNotLikeLeft2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orNameNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameNotLikeRight() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orNameNotLikeRight("value");

    }

    @Test
    public void testOrNameNotLikeRight2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orNameNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameNotLikeBoth() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orNameNotLikeBoth("value");

    }

    @Test
    public void testOrNameNotLikeBoth2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orNameNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testOrNameIn() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orNameIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testOrNameNotIn() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orNameNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testOrNameBetween() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orNameBetween("value1", "value2");

    }

    @Test
    public void testOrNameNotBetween() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orNameNotBetween("value1", "value2");

    }

    @Test
    public void testOrMemoIsNull() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orMemoIsNull();

    }

    @Test
    public void testOrMemoIsNotNull() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orMemoIsNotNull();

    }

    @Test
    public void testOrMemoEqualTo() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orMemoEqualTo("value");

    }

    @Test
    public void testOrMemoEqualTo2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orMemoEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoNotEqualTo() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orMemoNotEqualTo("value");

    }

    @Test
    public void testOrMemoNotEqualTo2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orMemoNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoGreaterThan() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orMemoGreaterThan("value");

    }

    @Test
    public void testOrMemoGreaterThan2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orMemoGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoGreaterThanOrEqualTo() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orMemoGreaterThanOrEqualTo("value");

    }

    @Test
    public void testOrMemoGreaterThanOrEqualTo2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orMemoGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoLessThan() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orMemoLessThan("value");

    }

    @Test
    public void testOrMemoLessThan2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orMemoLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoLessThanOrEqualTo() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orMemoLessThanOrEqualTo("value");

    }

    @Test
    public void testOrMemoLessThanOrEqualTo2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orMemoLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoLike() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orMemoLike("value");

    }

    @Test
    public void testOrMemoLike2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orMemoLike("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoLikeLeft() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orMemoLikeLeft("value");

    }

    @Test
    public void testOrMemoLikeLeft2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orMemoLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoLikeRight() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orMemoLikeRight("value");

    }

    @Test
    public void testOrMemoLikeRight2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orMemoLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoLikeBoth() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orMemoLikeBoth("value");

    }

    @Test
    public void testOrMemoLikeBoth2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orMemoLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoNotLike() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orMemoNotLike("value");

    }

    @Test
    public void testOrMemoNotLike2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orMemoNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoNotLikeLeft() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orMemoNotLikeLeft("value");

    }

    @Test
    public void testOrMemoNotLikeLeft2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orMemoNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoNotLikeRight() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orMemoNotLikeRight("value");

    }

    @Test
    public void testOrMemoNotLikeRight2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orMemoNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoNotLikeBoth() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orMemoNotLikeBoth("value");

    }

    @Test
    public void testOrMemoNotLikeBoth2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orMemoNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testOrMemoIn() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orMemoIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testOrMemoNotIn() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orMemoNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testOrMemoBetween() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orMemoBetween("value1", "value2");

    }

    @Test
    public void testOrMemoNotBetween() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orMemoNotBetween("value1", "value2");

    }

    @Test
    public void testOrProductIdIsNull() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orProductIdIsNull();

    }

    @Test
    public void testOrProductIdIsNotNull() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orProductIdIsNotNull();

    }

    @Test
    public void testOrProductIdEqualTo() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orProductIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrProductIdEqualTo2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orProductIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProductIdNotEqualTo() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orProductIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrProductIdNotEqualTo2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orProductIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProductIdGreaterThan() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orProductIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testOrProductIdGreaterThan2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orProductIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProductIdGreaterThanOrEqualTo() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orProductIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrProductIdGreaterThanOrEqualTo2() throws Exception {
        ConfigItemExample.CriterionGroup result =
                criterionGroup.orProductIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProductIdLessThan() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orProductIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testOrProductIdLessThan2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orProductIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProductIdLessThanOrEqualTo() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orProductIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrProductIdLessThanOrEqualTo2() throws Exception {
        ConfigItemExample.CriterionGroup result =
                criterionGroup.orProductIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProductIdIn() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orProductIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrProductIdNotIn() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orProductIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrProductIdBetween() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orProductIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrProductIdNotBetween() throws Exception {
        ConfigItemExample.CriterionGroup result =
                criterionGroup.orProductIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrProjectIdIsNull() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orProjectIdIsNull();

    }

    @Test
    public void testOrProjectIdIsNotNull() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orProjectIdIsNotNull();

    }

    @Test
    public void testOrProjectIdEqualTo() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orProjectIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrProjectIdEqualTo2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orProjectIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProjectIdNotEqualTo() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orProjectIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrProjectIdNotEqualTo2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orProjectIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProjectIdGreaterThan() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orProjectIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testOrProjectIdGreaterThan2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orProjectIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProjectIdGreaterThanOrEqualTo() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orProjectIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrProjectIdGreaterThanOrEqualTo2() throws Exception {
        ConfigItemExample.CriterionGroup result =
                criterionGroup.orProjectIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProjectIdLessThan() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orProjectIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testOrProjectIdLessThan2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orProjectIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProjectIdLessThanOrEqualTo() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orProjectIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrProjectIdLessThanOrEqualTo2() throws Exception {
        ConfigItemExample.CriterionGroup result =
                criterionGroup.orProjectIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProjectIdIn() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orProjectIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrProjectIdNotIn() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orProjectIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrProjectIdBetween() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orProjectIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrProjectIdNotBetween() throws Exception {
        ConfigItemExample.CriterionGroup result =
                criterionGroup.orProjectIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrEnvironmentIdIsNull() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orEnvironmentIdIsNull();

    }

    @Test
    public void testOrEnvironmentIdIsNotNull() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orEnvironmentIdIsNotNull();

    }

    @Test
    public void testOrEnvironmentIdEqualTo() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orEnvironmentIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrEnvironmentIdEqualTo2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orEnvironmentIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrEnvironmentIdNotEqualTo() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orEnvironmentIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrEnvironmentIdNotEqualTo2() throws Exception {
        ConfigItemExample.CriterionGroup result =
                criterionGroup.orEnvironmentIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrEnvironmentIdGreaterThan() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orEnvironmentIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testOrEnvironmentIdGreaterThan2() throws Exception {
        ConfigItemExample.CriterionGroup result =
                criterionGroup.orEnvironmentIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrEnvironmentIdGreaterThanOrEqualTo() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orEnvironmentIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrEnvironmentIdGreaterThanOrEqualTo2() throws Exception {
        ConfigItemExample.CriterionGroup result =
                criterionGroup.orEnvironmentIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrEnvironmentIdLessThan() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orEnvironmentIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testOrEnvironmentIdLessThan2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orEnvironmentIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrEnvironmentIdLessThanOrEqualTo() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orEnvironmentIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrEnvironmentIdLessThanOrEqualTo2() throws Exception {
        ConfigItemExample.CriterionGroup result =
                criterionGroup.orEnvironmentIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrEnvironmentIdIn() throws Exception {
        ConfigItemExample.CriterionGroup result =
                criterionGroup.orEnvironmentIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrEnvironmentIdNotIn() throws Exception {
        ConfigItemExample.CriterionGroup result =
                criterionGroup.orEnvironmentIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrEnvironmentIdBetween() throws Exception {
        ConfigItemExample.CriterionGroup result =
                criterionGroup.orEnvironmentIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrEnvironmentIdNotBetween() throws Exception {
        ConfigItemExample.CriterionGroup result =
                criterionGroup.orEnvironmentIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrVersionIdIsNull() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orVersionIdIsNull();

    }

    @Test
    public void testOrVersionIdIsNotNull() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orVersionIdIsNotNull();

    }

    @Test
    public void testOrVersionIdEqualTo() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orVersionIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrVersionIdEqualTo2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orVersionIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrVersionIdNotEqualTo() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orVersionIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrVersionIdNotEqualTo2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orVersionIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrVersionIdGreaterThan() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orVersionIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testOrVersionIdGreaterThan2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orVersionIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrVersionIdGreaterThanOrEqualTo() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orVersionIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrVersionIdGreaterThanOrEqualTo2() throws Exception {
        ConfigItemExample.CriterionGroup result =
                criterionGroup.orVersionIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrVersionIdLessThan() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orVersionIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testOrVersionIdLessThan2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orVersionIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrVersionIdLessThanOrEqualTo() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orVersionIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrVersionIdLessThanOrEqualTo2() throws Exception {
        ConfigItemExample.CriterionGroup result =
                criterionGroup.orVersionIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrVersionIdIn() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orVersionIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrVersionIdNotIn() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orVersionIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrVersionIdBetween() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orVersionIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrVersionIdNotBetween() throws Exception {
        ConfigItemExample.CriterionGroup result =
                criterionGroup.orVersionIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrGroupIdIsNull() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orGroupIdIsNull();

    }

    @Test
    public void testOrGroupIdIsNotNull() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orGroupIdIsNotNull();

    }

    @Test
    public void testOrGroupIdEqualTo() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orGroupIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrGroupIdEqualTo2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orGroupIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrGroupIdNotEqualTo() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orGroupIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrGroupIdNotEqualTo2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orGroupIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrGroupIdGreaterThan() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orGroupIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testOrGroupIdGreaterThan2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orGroupIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrGroupIdGreaterThanOrEqualTo() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orGroupIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrGroupIdGreaterThanOrEqualTo2() throws Exception {
        ConfigItemExample.CriterionGroup result =
                criterionGroup.orGroupIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrGroupIdLessThan() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orGroupIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testOrGroupIdLessThan2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orGroupIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrGroupIdLessThanOrEqualTo() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orGroupIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrGroupIdLessThanOrEqualTo2() throws Exception {
        ConfigItemExample.CriterionGroup result =
                criterionGroup.orGroupIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrGroupIdIn() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orGroupIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrGroupIdNotIn() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orGroupIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrGroupIdBetween() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orGroupIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrGroupIdNotBetween() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orGroupIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrTypeIdIsNull() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orTypeIdIsNull();

    }

    @Test
    public void testOrTypeIdIsNotNull() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orTypeIdIsNotNull();

    }

    @Test
    public void testOrTypeIdEqualTo() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orTypeIdEqualTo(Integer.valueOf(0));

    }

    @Test
    public void testOrTypeIdEqualTo2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orTypeIdEqualTo(Integer.valueOf(0), Boolean.TRUE);

    }

    @Test
    public void testOrTypeIdNotEqualTo() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orTypeIdNotEqualTo(Integer.valueOf(0));

    }

    @Test
    public void testOrTypeIdNotEqualTo2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orTypeIdNotEqualTo(Integer.valueOf(0), Boolean.TRUE);

    }

    @Test
    public void testOrTypeIdGreaterThan() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orTypeIdGreaterThan(Integer.valueOf(0));

    }

    @Test
    public void testOrTypeIdGreaterThan2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orTypeIdGreaterThan(Integer.valueOf(0), Boolean.TRUE);

    }

    @Test
    public void testOrTypeIdGreaterThanOrEqualTo() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orTypeIdGreaterThanOrEqualTo(Integer.valueOf(0));

    }

    @Test
    public void testOrTypeIdGreaterThanOrEqualTo2() throws Exception {
        ConfigItemExample.CriterionGroup result =
                criterionGroup.orTypeIdGreaterThanOrEqualTo(Integer.valueOf(0), Boolean.TRUE);

    }

    @Test
    public void testOrTypeIdLessThan() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orTypeIdLessThan(Integer.valueOf(0));

    }

    @Test
    public void testOrTypeIdLessThan2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orTypeIdLessThan(Integer.valueOf(0), Boolean.TRUE);

    }

    @Test
    public void testOrTypeIdLessThanOrEqualTo() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orTypeIdLessThanOrEqualTo(Integer.valueOf(0));

    }

    @Test
    public void testOrTypeIdLessThanOrEqualTo2() throws Exception {
        ConfigItemExample.CriterionGroup result =
                criterionGroup.orTypeIdLessThanOrEqualTo(Integer.valueOf(0), Boolean.TRUE);

    }

    @Test
    public void testOrTypeIdIn() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orTypeIdIn(Arrays.<Integer>asList(Integer.valueOf(0)));

    }

    @Test
    public void testOrTypeIdNotIn() throws Exception {
        ConfigItemExample.CriterionGroup result =
                criterionGroup.orTypeIdNotIn(Arrays.<Integer>asList(Integer.valueOf(0)));

    }

    @Test
    public void testOrTypeIdBetween() throws Exception {
        ConfigItemExample.CriterionGroup result =
                criterionGroup.orTypeIdBetween(Integer.valueOf(0), Integer.valueOf(0));

    }

    @Test
    public void testOrTypeIdNotBetween() throws Exception {
        ConfigItemExample.CriterionGroup result =
                criterionGroup.orTypeIdNotBetween(Integer.valueOf(0), Integer.valueOf(0));

    }

    @Test
    public void testOrValIsNull() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orValIsNull();

    }

    @Test
    public void testOrValIsNotNull() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orValIsNotNull();

    }

    @Test
    public void testOrValEqualTo() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orValEqualTo("value");

    }

    @Test
    public void testOrValEqualTo2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orValEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrValNotEqualTo() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orValNotEqualTo("value");

    }

    @Test
    public void testOrValNotEqualTo2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orValNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrValGreaterThan() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orValGreaterThan("value");

    }

    @Test
    public void testOrValGreaterThan2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orValGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testOrValGreaterThanOrEqualTo() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orValGreaterThanOrEqualTo("value");

    }

    @Test
    public void testOrValGreaterThanOrEqualTo2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orValGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrValLessThan() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orValLessThan("value");

    }

    @Test
    public void testOrValLessThan2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orValLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testOrValLessThanOrEqualTo() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orValLessThanOrEqualTo("value");

    }

    @Test
    public void testOrValLessThanOrEqualTo2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orValLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrValLike() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orValLike("value");

    }

    @Test
    public void testOrValLike2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orValLike("value", Boolean.TRUE);

    }

    @Test
    public void testOrValLikeLeft() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orValLikeLeft("value");

    }

    @Test
    public void testOrValLikeLeft2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orValLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testOrValLikeRight() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orValLikeRight("value");

    }

    @Test
    public void testOrValLikeRight2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orValLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testOrValLikeBoth() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orValLikeBoth("value");

    }

    @Test
    public void testOrValLikeBoth2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orValLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testOrValNotLike() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orValNotLike("value");

    }

    @Test
    public void testOrValNotLike2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orValNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testOrValNotLikeLeft() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orValNotLikeLeft("value");

    }

    @Test
    public void testOrValNotLikeLeft2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orValNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testOrValNotLikeRight() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orValNotLikeRight("value");

    }

    @Test
    public void testOrValNotLikeRight2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orValNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testOrValNotLikeBoth() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orValNotLikeBoth("value");

    }

    @Test
    public void testOrValNotLikeBoth2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orValNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testOrValIn() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orValIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testOrValNotIn() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orValNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testOrValBetween() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orValBetween("value1", "value2");

    }

    @Test
    public void testOrValNotBetween() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orValNotBetween("value1", "value2");

    }

    @Test
    public void testOrShareableIsNull() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orShareableIsNull();

    }

    @Test
    public void testOrShareableIsNotNull() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orShareableIsNotNull();

    }

    @Test
    public void testOrShareableEqualTo() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orShareableEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrShareableEqualTo2() throws Exception {
        ConfigItemExample.CriterionGroup result =
                criterionGroup.orShareableEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrShareableNotEqualTo() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orShareableNotEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrShareableNotEqualTo2() throws Exception {
        ConfigItemExample.CriterionGroup result =
                criterionGroup.orShareableNotEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrShareableGreaterThan() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orShareableGreaterThan(Byte.valueOf("00110"));

    }

    @Test
    public void testOrShareableGreaterThan2() throws Exception {
        ConfigItemExample.CriterionGroup result =
                criterionGroup.orShareableGreaterThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrShareableGreaterThanOrEqualTo() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orShareableGreaterThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrShareableGreaterThanOrEqualTo2() throws Exception {
        ConfigItemExample.CriterionGroup result =
                criterionGroup.orShareableGreaterThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrShareableLessThan() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orShareableLessThan(Byte.valueOf("00110"));

    }

    @Test
    public void testOrShareableLessThan2() throws Exception {
        ConfigItemExample.CriterionGroup result =
                criterionGroup.orShareableLessThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrShareableLessThanOrEqualTo() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orShareableLessThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrShareableLessThanOrEqualTo2() throws Exception {
        ConfigItemExample.CriterionGroup result =
                criterionGroup.orShareableLessThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrShareableIn() throws Exception {
        ConfigItemExample.CriterionGroup result =
                criterionGroup.orShareableIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testOrShareableNotIn() throws Exception {
        ConfigItemExample.CriterionGroup result =
                criterionGroup.orShareableNotIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testOrShareableBetween() throws Exception {
        ConfigItemExample.CriterionGroup result =
                criterionGroup.orShareableBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testOrShareableNotBetween() throws Exception {
        ConfigItemExample.CriterionGroup result =
                criterionGroup.orShareableNotBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testOrRefIsNull() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orRefIsNull();

    }

    @Test
    public void testOrRefIsNotNull() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orRefIsNotNull();

    }

    @Test
    public void testOrRefEqualTo() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orRefEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrRefEqualTo2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orRefEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrRefNotEqualTo() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orRefNotEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrRefNotEqualTo2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orRefNotEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrRefGreaterThan() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orRefGreaterThan(Byte.valueOf("00110"));

    }

    @Test
    public void testOrRefGreaterThan2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orRefGreaterThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrRefGreaterThanOrEqualTo() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orRefGreaterThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrRefGreaterThanOrEqualTo2() throws Exception {
        ConfigItemExample.CriterionGroup result =
                criterionGroup.orRefGreaterThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrRefLessThan() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orRefLessThan(Byte.valueOf("00110"));

    }

    @Test
    public void testOrRefLessThan2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orRefLessThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrRefLessThanOrEqualTo() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orRefLessThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrRefLessThanOrEqualTo2() throws Exception {
        ConfigItemExample.CriterionGroup result =
                criterionGroup.orRefLessThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrRefIn() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orRefIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testOrRefNotIn() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orRefNotIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testOrRefBetween() throws Exception {
        ConfigItemExample.CriterionGroup result =
                criterionGroup.orRefBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testOrRefNotBetween() throws Exception {
        ConfigItemExample.CriterionGroup result =
                criterionGroup.orRefNotBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testOrDeletedIsNull() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orDeletedIsNull();

    }

    @Test
    public void testOrDeletedIsNotNull() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orDeletedIsNotNull();

    }

    @Test
    public void testOrDeletedEqualTo() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orDeletedEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrDeletedEqualTo2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orDeletedEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrDeletedNotEqualTo() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orDeletedNotEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrDeletedNotEqualTo2() throws Exception {
        ConfigItemExample.CriterionGroup result =
                criterionGroup.orDeletedNotEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrDeletedGreaterThan() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orDeletedGreaterThan(Byte.valueOf("00110"));

    }

    @Test
    public void testOrDeletedGreaterThan2() throws Exception {
        ConfigItemExample.CriterionGroup result =
                criterionGroup.orDeletedGreaterThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrDeletedGreaterThanOrEqualTo() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orDeletedGreaterThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrDeletedGreaterThanOrEqualTo2() throws Exception {
        ConfigItemExample.CriterionGroup result =
                criterionGroup.orDeletedGreaterThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrDeletedLessThan() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orDeletedLessThan(Byte.valueOf("00110"));

    }

    @Test
    public void testOrDeletedLessThan2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orDeletedLessThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrDeletedLessThanOrEqualTo() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orDeletedLessThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testOrDeletedLessThanOrEqualTo2() throws Exception {
        ConfigItemExample.CriterionGroup result =
                criterionGroup.orDeletedLessThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testOrDeletedIn() throws Exception {
        ConfigItemExample.CriterionGroup result =
                criterionGroup.orDeletedIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testOrDeletedNotIn() throws Exception {
        ConfigItemExample.CriterionGroup result =
                criterionGroup.orDeletedNotIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testOrDeletedBetween() throws Exception {
        ConfigItemExample.CriterionGroup result =
                criterionGroup.orDeletedBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testOrDeletedNotBetween() throws Exception {
        ConfigItemExample.CriterionGroup result =
                criterionGroup.orDeletedNotBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testOrUpdateTimeIsNull() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orUpdateTimeIsNull();

    }

    @Test
    public void testOrUpdateTimeIsNotNull() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orUpdateTimeIsNotNull();

    }

    @Test
    public void testOrUpdateTimeEqualTo() throws Exception {
        ConfigItemExample.CriterionGroup result =
                criterionGroup.orUpdateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 9).getTime());

    }

    @Test
    public void testOrUpdateTimeEqualTo2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup
                .orUpdateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 9).getTime(), Boolean.TRUE);

    }

    @Test
    public void testOrUpdateTimeNotEqualTo() throws Exception {
        ConfigItemExample.CriterionGroup result =
                criterionGroup.orUpdateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 9).getTime());

    }

    @Test
    public void testOrUpdateTimeNotEqualTo2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup
                .orUpdateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 9).getTime(), Boolean.TRUE);

    }

    @Test
    public void testOrUpdateTimeGreaterThan() throws Exception {
        ConfigItemExample.CriterionGroup result =
                criterionGroup.orUpdateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 9).getTime());

    }

    @Test
    public void testOrUpdateTimeGreaterThan2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup
                .orUpdateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 9).getTime(), Boolean.TRUE);

    }

    @Test
    public void testOrUpdateTimeGreaterThanOrEqualTo() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup
                .orUpdateTimeGreaterThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 9).getTime());

    }

    @Test
    public void testOrUpdateTimeGreaterThanOrEqualTo2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup
                .orUpdateTimeGreaterThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 9).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrUpdateTimeLessThan() throws Exception {
        ConfigItemExample.CriterionGroup result =
                criterionGroup.orUpdateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 9).getTime());

    }

    @Test
    public void testOrUpdateTimeLessThan2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup
                .orUpdateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 9).getTime(), Boolean.TRUE);

    }

    @Test
    public void testOrUpdateTimeLessThanOrEqualTo() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup
                .orUpdateTimeLessThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 9).getTime());

    }

    @Test
    public void testOrUpdateTimeLessThanOrEqualTo2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup
                .orUpdateTimeLessThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 9).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrUpdateTimeIn() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orUpdateTimeIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 9).getTime()));

    }

    @Test
    public void testOrUpdateTimeNotIn() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orUpdateTimeNotIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 9).getTime()));

    }

    @Test
    public void testOrUpdateTimeBetween() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup
                .orUpdateTimeBetween(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 9).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 9).getTime());

    }

    @Test
    public void testOrUpdateTimeNotBetween() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup
                .orUpdateTimeNotBetween(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 9).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 9).getTime());

    }

    @Test
    public void testOrCreateTimeIsNull() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orCreateTimeIsNull();

    }

    @Test
    public void testOrCreateTimeIsNotNull() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orCreateTimeIsNotNull();

    }

    @Test
    public void testOrCreateTimeEqualTo() throws Exception {
        ConfigItemExample.CriterionGroup result =
                criterionGroup.orCreateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 9).getTime());

    }

    @Test
    public void testOrCreateTimeEqualTo2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup
                .orCreateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 9).getTime(), Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeNotEqualTo() throws Exception {
        ConfigItemExample.CriterionGroup result =
                criterionGroup.orCreateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 9).getTime());

    }

    @Test
    public void testOrCreateTimeNotEqualTo2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup
                .orCreateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 9).getTime(), Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeGreaterThan() throws Exception {
        ConfigItemExample.CriterionGroup result =
                criterionGroup.orCreateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 9).getTime());

    }

    @Test
    public void testOrCreateTimeGreaterThan2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup
                .orCreateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 9).getTime(), Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeGreaterThanOrEqualTo() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup
                .orCreateTimeGreaterThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 9).getTime());

    }

    @Test
    public void testOrCreateTimeGreaterThanOrEqualTo2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup
                .orCreateTimeGreaterThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 9).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeLessThan() throws Exception {
        ConfigItemExample.CriterionGroup result =
                criterionGroup.orCreateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 9).getTime());

    }

    @Test
    public void testOrCreateTimeLessThan2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup
                .orCreateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 9).getTime(), Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeLessThanOrEqualTo() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup
                .orCreateTimeLessThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 9).getTime());

    }

    @Test
    public void testOrCreateTimeLessThanOrEqualTo2() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup
                .orCreateTimeLessThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 9).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeIn() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orCreateTimeIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 9).getTime()));

    }

    @Test
    public void testOrCreateTimeNotIn() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup.orCreateTimeNotIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 9).getTime()));

    }

    @Test
    public void testOrCreateTimeBetween() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup
                .orCreateTimeBetween(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 9).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 9).getTime());

    }

    @Test
    public void testOrCreateTimeNotBetween() throws Exception {
        ConfigItemExample.CriterionGroup result = criterionGroup
                .orCreateTimeNotBetween(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 9).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 9).getTime());

    }
}


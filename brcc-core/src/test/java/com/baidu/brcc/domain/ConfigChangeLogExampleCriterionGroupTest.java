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

public class ConfigChangeLogExampleCriterionGroupTest {

    ConfigChangeLogExample.CriterionGroup criterionGroup = ConfigChangeLogExample.newBuilder().build().createCriteria()
            .andGroupCriterion();

    @Before
    public void setUp() {
    }

    @Test
    public void testOr() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup
                .or(new ConfigChangeLogExample.Criterion("condition", "value", "secondValue", "typeHandler"));

    }

    @Test
    public void testToCriteria() throws Exception {
        ConfigChangeLogExample.Criteria result = criterionGroup.toCriteria();

    }

    @Test
    public void testOrIdIsNull() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orIdIsNull();

    }

    @Test
    public void testOrIdIsNotNull() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orIdIsNotNull();

    }

    @Test
    public void testOrIdEqualTo() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrIdEqualTo2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdNotEqualTo() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrIdNotEqualTo2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdGreaterThan() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testOrIdGreaterThan2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdGreaterThanOrEqualTo() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrIdGreaterThanOrEqualTo2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result =
                criterionGroup.orIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdLessThan() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testOrIdLessThan2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdLessThanOrEqualTo() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrIdLessThanOrEqualTo2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result =
                criterionGroup.orIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdIn() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrIdNotIn() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrIdBetween() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrIdNotBetween() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrUserIdIsNull() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orUserIdIsNull();

    }

    @Test
    public void testOrUserIdIsNotNull() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orUserIdIsNotNull();

    }

    @Test
    public void testOrUserIdEqualTo() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orUserIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrUserIdEqualTo2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orUserIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrUserIdNotEqualTo() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orUserIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrUserIdNotEqualTo2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orUserIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrUserIdGreaterThan() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orUserIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testOrUserIdGreaterThan2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result =
                criterionGroup.orUserIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrUserIdGreaterThanOrEqualTo() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orUserIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrUserIdGreaterThanOrEqualTo2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result =
                criterionGroup.orUserIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrUserIdLessThan() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orUserIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testOrUserIdLessThan2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orUserIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrUserIdLessThanOrEqualTo() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orUserIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrUserIdLessThanOrEqualTo2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result =
                criterionGroup.orUserIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrUserIdIn() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orUserIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrUserIdNotIn() throws Exception {
        ConfigChangeLogExample.CriterionGroup result =
                criterionGroup.orUserIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrUserIdBetween() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orUserIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrUserIdNotBetween() throws Exception {
        ConfigChangeLogExample.CriterionGroup result =
                criterionGroup.orUserIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrProductIdIsNull() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orProductIdIsNull();

    }

    @Test
    public void testOrProductIdIsNotNull() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orProductIdIsNotNull();

    }

    @Test
    public void testOrProductIdEqualTo() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orProductIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrProductIdEqualTo2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orProductIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProductIdNotEqualTo() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orProductIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrProductIdNotEqualTo2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result =
                criterionGroup.orProductIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProductIdGreaterThan() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orProductIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testOrProductIdGreaterThan2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result =
                criterionGroup.orProductIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProductIdGreaterThanOrEqualTo() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orProductIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrProductIdGreaterThanOrEqualTo2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result =
                criterionGroup.orProductIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProductIdLessThan() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orProductIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testOrProductIdLessThan2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result =
                criterionGroup.orProductIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProductIdLessThanOrEqualTo() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orProductIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrProductIdLessThanOrEqualTo2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result =
                criterionGroup.orProductIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProductIdIn() throws Exception {
        ConfigChangeLogExample.CriterionGroup result =
                criterionGroup.orProductIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrProductIdNotIn() throws Exception {
        ConfigChangeLogExample.CriterionGroup result =
                criterionGroup.orProductIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrProductIdBetween() throws Exception {
        ConfigChangeLogExample.CriterionGroup result =
                criterionGroup.orProductIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrProductIdNotBetween() throws Exception {
        ConfigChangeLogExample.CriterionGroup result =
                criterionGroup.orProductIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrProjectIdIsNull() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orProjectIdIsNull();

    }

    @Test
    public void testOrProjectIdIsNotNull() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orProjectIdIsNotNull();

    }

    @Test
    public void testOrProjectIdEqualTo() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orProjectIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrProjectIdEqualTo2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orProjectIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProjectIdNotEqualTo() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orProjectIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrProjectIdNotEqualTo2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result =
                criterionGroup.orProjectIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProjectIdGreaterThan() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orProjectIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testOrProjectIdGreaterThan2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result =
                criterionGroup.orProjectIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProjectIdGreaterThanOrEqualTo() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orProjectIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrProjectIdGreaterThanOrEqualTo2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result =
                criterionGroup.orProjectIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProjectIdLessThan() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orProjectIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testOrProjectIdLessThan2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result =
                criterionGroup.orProjectIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProjectIdLessThanOrEqualTo() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orProjectIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrProjectIdLessThanOrEqualTo2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result =
                criterionGroup.orProjectIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrProjectIdIn() throws Exception {
        ConfigChangeLogExample.CriterionGroup result =
                criterionGroup.orProjectIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrProjectIdNotIn() throws Exception {
        ConfigChangeLogExample.CriterionGroup result =
                criterionGroup.orProjectIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrProjectIdBetween() throws Exception {
        ConfigChangeLogExample.CriterionGroup result =
                criterionGroup.orProjectIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrProjectIdNotBetween() throws Exception {
        ConfigChangeLogExample.CriterionGroup result =
                criterionGroup.orProjectIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrEnvironmentIdIsNull() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orEnvironmentIdIsNull();

    }

    @Test
    public void testOrEnvironmentIdIsNotNull() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orEnvironmentIdIsNotNull();

    }

    @Test
    public void testOrEnvironmentIdEqualTo() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orEnvironmentIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrEnvironmentIdEqualTo2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result =
                criterionGroup.orEnvironmentIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrEnvironmentIdNotEqualTo() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orEnvironmentIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrEnvironmentIdNotEqualTo2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result =
                criterionGroup.orEnvironmentIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrEnvironmentIdGreaterThan() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orEnvironmentIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testOrEnvironmentIdGreaterThan2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result =
                criterionGroup.orEnvironmentIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrEnvironmentIdGreaterThanOrEqualTo() throws Exception {
        ConfigChangeLogExample.CriterionGroup result =
                criterionGroup.orEnvironmentIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrEnvironmentIdGreaterThanOrEqualTo2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result =
                criterionGroup.orEnvironmentIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrEnvironmentIdLessThan() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orEnvironmentIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testOrEnvironmentIdLessThan2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result =
                criterionGroup.orEnvironmentIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrEnvironmentIdLessThanOrEqualTo() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orEnvironmentIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrEnvironmentIdLessThanOrEqualTo2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result =
                criterionGroup.orEnvironmentIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrEnvironmentIdIn() throws Exception {
        ConfigChangeLogExample.CriterionGroup result =
                criterionGroup.orEnvironmentIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrEnvironmentIdNotIn() throws Exception {
        ConfigChangeLogExample.CriterionGroup result =
                criterionGroup.orEnvironmentIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrEnvironmentIdBetween() throws Exception {
        ConfigChangeLogExample.CriterionGroup result =
                criterionGroup.orEnvironmentIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrEnvironmentIdNotBetween() throws Exception {
        ConfigChangeLogExample.CriterionGroup result =
                criterionGroup.orEnvironmentIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrVersionIdIsNull() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orVersionIdIsNull();

    }

    @Test
    public void testOrVersionIdIsNotNull() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orVersionIdIsNotNull();

    }

    @Test
    public void testOrVersionIdEqualTo() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orVersionIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrVersionIdEqualTo2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orVersionIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrVersionIdNotEqualTo() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orVersionIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrVersionIdNotEqualTo2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result =
                criterionGroup.orVersionIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrVersionIdGreaterThan() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orVersionIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testOrVersionIdGreaterThan2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result =
                criterionGroup.orVersionIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrVersionIdGreaterThanOrEqualTo() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orVersionIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrVersionIdGreaterThanOrEqualTo2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result =
                criterionGroup.orVersionIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrVersionIdLessThan() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orVersionIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testOrVersionIdLessThan2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result =
                criterionGroup.orVersionIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrVersionIdLessThanOrEqualTo() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orVersionIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrVersionIdLessThanOrEqualTo2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result =
                criterionGroup.orVersionIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrVersionIdIn() throws Exception {
        ConfigChangeLogExample.CriterionGroup result =
                criterionGroup.orVersionIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrVersionIdNotIn() throws Exception {
        ConfigChangeLogExample.CriterionGroup result =
                criterionGroup.orVersionIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrVersionIdBetween() throws Exception {
        ConfigChangeLogExample.CriterionGroup result =
                criterionGroup.orVersionIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrVersionIdNotBetween() throws Exception {
        ConfigChangeLogExample.CriterionGroup result =
                criterionGroup.orVersionIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrGroupIdIsNull() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orGroupIdIsNull();

    }

    @Test
    public void testOrGroupIdIsNotNull() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orGroupIdIsNotNull();

    }

    @Test
    public void testOrGroupIdEqualTo() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orGroupIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrGroupIdEqualTo2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orGroupIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrGroupIdNotEqualTo() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orGroupIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrGroupIdNotEqualTo2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result =
                criterionGroup.orGroupIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrGroupIdGreaterThan() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orGroupIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testOrGroupIdGreaterThan2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result =
                criterionGroup.orGroupIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrGroupIdGreaterThanOrEqualTo() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orGroupIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrGroupIdGreaterThanOrEqualTo2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result =
                criterionGroup.orGroupIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrGroupIdLessThan() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orGroupIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testOrGroupIdLessThan2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orGroupIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrGroupIdLessThanOrEqualTo() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orGroupIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrGroupIdLessThanOrEqualTo2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result =
                criterionGroup.orGroupIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrGroupIdIn() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orGroupIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrGroupIdNotIn() throws Exception {
        ConfigChangeLogExample.CriterionGroup result =
                criterionGroup.orGroupIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrGroupIdBetween() throws Exception {
        ConfigChangeLogExample.CriterionGroup result =
                criterionGroup.orGroupIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrGroupIdNotBetween() throws Exception {
        ConfigChangeLogExample.CriterionGroup result =
                criterionGroup.orGroupIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrGroupNameIsNull() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orGroupNameIsNull();

    }

    @Test
    public void testOrGroupNameIsNotNull() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orGroupNameIsNotNull();

    }

    @Test
    public void testOrGroupNameEqualTo() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orGroupNameEqualTo("value");

    }

    @Test
    public void testOrGroupNameEqualTo2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orGroupNameEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrGroupNameNotEqualTo() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orGroupNameNotEqualTo("value");

    }

    @Test
    public void testOrGroupNameNotEqualTo2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orGroupNameNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrGroupNameGreaterThan() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orGroupNameGreaterThan("value");

    }

    @Test
    public void testOrGroupNameGreaterThan2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orGroupNameGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testOrGroupNameGreaterThanOrEqualTo() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orGroupNameGreaterThanOrEqualTo("value");

    }

    @Test
    public void testOrGroupNameGreaterThanOrEqualTo2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result =
                criterionGroup.orGroupNameGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrGroupNameLessThan() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orGroupNameLessThan("value");

    }

    @Test
    public void testOrGroupNameLessThan2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orGroupNameLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testOrGroupNameLessThanOrEqualTo() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orGroupNameLessThanOrEqualTo("value");

    }

    @Test
    public void testOrGroupNameLessThanOrEqualTo2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result =
                criterionGroup.orGroupNameLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrGroupNameLike() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orGroupNameLike("value");

    }

    @Test
    public void testOrGroupNameLike2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orGroupNameLike("value", Boolean.TRUE);

    }

    @Test
    public void testOrGroupNameLikeLeft() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orGroupNameLikeLeft("value");

    }

    @Test
    public void testOrGroupNameLikeLeft2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orGroupNameLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testOrGroupNameLikeRight() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orGroupNameLikeRight("value");

    }

    @Test
    public void testOrGroupNameLikeRight2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orGroupNameLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testOrGroupNameLikeBoth() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orGroupNameLikeBoth("value");

    }

    @Test
    public void testOrGroupNameLikeBoth2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orGroupNameLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testOrGroupNameNotLike() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orGroupNameNotLike("value");

    }

    @Test
    public void testOrGroupNameNotLike2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orGroupNameNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testOrGroupNameNotLikeLeft() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orGroupNameNotLikeLeft("value");

    }

    @Test
    public void testOrGroupNameNotLikeLeft2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orGroupNameNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testOrGroupNameNotLikeRight() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orGroupNameNotLikeRight("value");

    }

    @Test
    public void testOrGroupNameNotLikeRight2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orGroupNameNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testOrGroupNameNotLikeBoth() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orGroupNameNotLikeBoth("value");

    }

    @Test
    public void testOrGroupNameNotLikeBoth2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orGroupNameNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testOrGroupNameIn() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orGroupNameIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testOrGroupNameNotIn() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orGroupNameNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testOrGroupNameBetween() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orGroupNameBetween("value1", "value2");

    }

    @Test
    public void testOrGroupNameNotBetween() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orGroupNameNotBetween("value1", "value2");

    }

    @Test
    public void testOrOperatorIsNull() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orOperatorIsNull();

    }

    @Test
    public void testOrOperatorIsNotNull() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orOperatorIsNotNull();

    }

    @Test
    public void testOrOperatorEqualTo() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orOperatorEqualTo("value");

    }

    @Test
    public void testOrOperatorEqualTo2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orOperatorEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrOperatorNotEqualTo() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orOperatorNotEqualTo("value");

    }

    @Test
    public void testOrOperatorNotEqualTo2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orOperatorNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrOperatorGreaterThan() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orOperatorGreaterThan("value");

    }

    @Test
    public void testOrOperatorGreaterThan2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orOperatorGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testOrOperatorGreaterThanOrEqualTo() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orOperatorGreaterThanOrEqualTo("value");

    }

    @Test
    public void testOrOperatorGreaterThanOrEqualTo2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result =
                criterionGroup.orOperatorGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrOperatorLessThan() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orOperatorLessThan("value");

    }

    @Test
    public void testOrOperatorLessThan2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orOperatorLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testOrOperatorLessThanOrEqualTo() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orOperatorLessThanOrEqualTo("value");

    }

    @Test
    public void testOrOperatorLessThanOrEqualTo2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result =
                criterionGroup.orOperatorLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrOperatorLike() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orOperatorLike("value");

    }

    @Test
    public void testOrOperatorLike2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orOperatorLike("value", Boolean.TRUE);

    }

    @Test
    public void testOrOperatorLikeLeft() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orOperatorLikeLeft("value");

    }

    @Test
    public void testOrOperatorLikeLeft2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orOperatorLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testOrOperatorLikeRight() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orOperatorLikeRight("value");

    }

    @Test
    public void testOrOperatorLikeRight2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orOperatorLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testOrOperatorLikeBoth() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orOperatorLikeBoth("value");

    }

    @Test
    public void testOrOperatorLikeBoth2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orOperatorLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testOrOperatorNotLike() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orOperatorNotLike("value");

    }

    @Test
    public void testOrOperatorNotLike2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orOperatorNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testOrOperatorNotLikeLeft() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orOperatorNotLikeLeft("value");

    }

    @Test
    public void testOrOperatorNotLikeLeft2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orOperatorNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testOrOperatorNotLikeRight() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orOperatorNotLikeRight("value");

    }

    @Test
    public void testOrOperatorNotLikeRight2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orOperatorNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testOrOperatorNotLikeBoth() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orOperatorNotLikeBoth("value");

    }

    @Test
    public void testOrOperatorNotLikeBoth2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orOperatorNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testOrOperatorIn() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orOperatorIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testOrOperatorNotIn() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orOperatorNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testOrOperatorBetween() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orOperatorBetween("value1", "value2");

    }

    @Test
    public void testOrOperatorNotBetween() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orOperatorNotBetween("value1", "value2");

    }

    @Test
    public void testOrCreateTimeIsNull() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orCreateTimeIsNull();

    }

    @Test
    public void testOrCreateTimeIsNotNull() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orCreateTimeIsNotNull();

    }

    @Test
    public void testOrCreateTimeEqualTo() throws Exception {
        ConfigChangeLogExample.CriterionGroup result =
                criterionGroup.orCreateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 55).getTime());

    }

    @Test
    public void testOrCreateTimeEqualTo2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup
                .orCreateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 55).getTime(), Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeNotEqualTo() throws Exception {
        ConfigChangeLogExample.CriterionGroup result =
                criterionGroup.orCreateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 55).getTime());

    }

    @Test
    public void testOrCreateTimeNotEqualTo2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup
                .orCreateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 55).getTime(), Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeGreaterThan() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup
                .orCreateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 55).getTime());

    }

    @Test
    public void testOrCreateTimeGreaterThan2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup
                .orCreateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 55).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeGreaterThanOrEqualTo() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup
                .orCreateTimeGreaterThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 55).getTime());

    }

    @Test
    public void testOrCreateTimeGreaterThanOrEqualTo2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup
                .orCreateTimeGreaterThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 55).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeLessThan() throws Exception {
        ConfigChangeLogExample.CriterionGroup result =
                criterionGroup.orCreateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 55).getTime());

    }

    @Test
    public void testOrCreateTimeLessThan2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup
                .orCreateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 55).getTime(), Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeLessThanOrEqualTo() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup
                .orCreateTimeLessThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 55).getTime());

    }

    @Test
    public void testOrCreateTimeLessThanOrEqualTo2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup
                .orCreateTimeLessThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 55).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeIn() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orCreateTimeIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 55).getTime()));

    }

    @Test
    public void testOrCreateTimeNotIn() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup.orCreateTimeNotIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 55).getTime()));

    }

    @Test
    public void testOrCreateTimeBetween() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup
                .orCreateTimeBetween(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 55).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 55).getTime());

    }

    @Test
    public void testOrCreateTimeNotBetween() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criterionGroup
                .orCreateTimeNotBetween(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 55).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 55).getTime());

    }
}

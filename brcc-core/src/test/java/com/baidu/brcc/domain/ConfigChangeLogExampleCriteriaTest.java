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

public class ConfigChangeLogExampleCriteriaTest {

    ConfigChangeLogExample.Criteria criteria = ConfigChangeLogExample.newBuilder().build().createCriteria();

    @Before
    public void setUp() {
    }

    @Test
    public void testToExample() throws Exception {
        ConfigChangeLogExample result = criteria.toExample();

    }

    @Test
    public void testAddCustomerCriteria() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.addCustomerCriteria("condition");

    }

    @Test
    public void testAddCustomerCriteria2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.addCustomerCriteria("condition", Boolean.TRUE);

    }

    @Test
    public void testAddCustomerCriteria3() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.addCustomerCriteria("condition", "value");

    }

    @Test
    public void testAndGroupCriterion() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criteria.andGroupCriterion();

    }

    @Test
    public void testAndGroupCriterion2() throws Exception {
        ConfigChangeLogExample.CriterionGroup result = criteria.andGroupCriterion(Boolean.TRUE);

    }

    @Test
    public void testIsValid() throws Exception {
        boolean result = criteria.isValid();

    }

    @Test
    public void testAndIdIsNull() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andIdIsNull();

    }

    @Test
    public void testAndIdIsNotNull() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andIdIsNotNull();

    }

    @Test
    public void testAndIdEqualTo() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndIdEqualTo2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdNotEqualTo() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndIdNotEqualTo2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdGreaterThan() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testAndIdGreaterThan2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdGreaterThanOrEqualTo() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndIdGreaterThanOrEqualTo2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdLessThan() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testAndIdLessThan2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdLessThanOrEqualTo() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndIdLessThanOrEqualTo2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdIn() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndIdNotIn() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndIdBetween() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndIdNotBetween() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndUserIdIsNull() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andUserIdIsNull();

    }

    @Test
    public void testAndUserIdIsNotNull() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andUserIdIsNotNull();

    }

    @Test
    public void testAndUserIdEqualTo() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andUserIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndUserIdEqualTo2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andUserIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndUserIdNotEqualTo() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andUserIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndUserIdNotEqualTo2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andUserIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndUserIdGreaterThan() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andUserIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testAndUserIdGreaterThan2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andUserIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndUserIdGreaterThanOrEqualTo() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andUserIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndUserIdGreaterThanOrEqualTo2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andUserIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndUserIdLessThan() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andUserIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testAndUserIdLessThan2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andUserIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndUserIdLessThanOrEqualTo() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andUserIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndUserIdLessThanOrEqualTo2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andUserIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndUserIdIn() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andUserIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndUserIdNotIn() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andUserIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndUserIdBetween() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andUserIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndUserIdNotBetween() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andUserIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndProductIdIsNull() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andProductIdIsNull();

    }

    @Test
    public void testAndProductIdIsNotNull() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andProductIdIsNotNull();

    }

    @Test
    public void testAndProductIdEqualTo() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andProductIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndProductIdEqualTo2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andProductIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProductIdNotEqualTo() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andProductIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndProductIdNotEqualTo2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andProductIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProductIdGreaterThan() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andProductIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testAndProductIdGreaterThan2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andProductIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProductIdGreaterThanOrEqualTo() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andProductIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndProductIdGreaterThanOrEqualTo2() throws Exception {
        ConfigChangeLogExample.Criteria result =
                criteria.andProductIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProductIdLessThan() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andProductIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testAndProductIdLessThan2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andProductIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProductIdLessThanOrEqualTo() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andProductIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndProductIdLessThanOrEqualTo2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andProductIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProductIdIn() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andProductIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndProductIdNotIn() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andProductIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndProductIdBetween() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andProductIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndProductIdNotBetween() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andProductIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndProjectIdIsNull() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andProjectIdIsNull();

    }

    @Test
    public void testAndProjectIdIsNotNull() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andProjectIdIsNotNull();

    }

    @Test
    public void testAndProjectIdEqualTo() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andProjectIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndProjectIdEqualTo2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andProjectIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProjectIdNotEqualTo() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andProjectIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndProjectIdNotEqualTo2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andProjectIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProjectIdGreaterThan() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andProjectIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testAndProjectIdGreaterThan2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andProjectIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProjectIdGreaterThanOrEqualTo() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andProjectIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndProjectIdGreaterThanOrEqualTo2() throws Exception {
        ConfigChangeLogExample.Criteria result =
                criteria.andProjectIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProjectIdLessThan() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andProjectIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testAndProjectIdLessThan2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andProjectIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProjectIdLessThanOrEqualTo() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andProjectIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndProjectIdLessThanOrEqualTo2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andProjectIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProjectIdIn() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andProjectIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndProjectIdNotIn() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andProjectIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndProjectIdBetween() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andProjectIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndProjectIdNotBetween() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andProjectIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndEnvironmentIdIsNull() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andEnvironmentIdIsNull();

    }

    @Test
    public void testAndEnvironmentIdIsNotNull() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andEnvironmentIdIsNotNull();

    }

    @Test
    public void testAndEnvironmentIdEqualTo() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andEnvironmentIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndEnvironmentIdEqualTo2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andEnvironmentIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndEnvironmentIdNotEqualTo() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andEnvironmentIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndEnvironmentIdNotEqualTo2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andEnvironmentIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndEnvironmentIdGreaterThan() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andEnvironmentIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testAndEnvironmentIdGreaterThan2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andEnvironmentIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndEnvironmentIdGreaterThanOrEqualTo() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andEnvironmentIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndEnvironmentIdGreaterThanOrEqualTo2() throws Exception {
        ConfigChangeLogExample.Criteria result =
                criteria.andEnvironmentIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndEnvironmentIdLessThan() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andEnvironmentIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testAndEnvironmentIdLessThan2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andEnvironmentIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndEnvironmentIdLessThanOrEqualTo() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andEnvironmentIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndEnvironmentIdLessThanOrEqualTo2() throws Exception {
        ConfigChangeLogExample.Criteria result =
                criteria.andEnvironmentIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndEnvironmentIdIn() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andEnvironmentIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndEnvironmentIdNotIn() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andEnvironmentIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndEnvironmentIdBetween() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andEnvironmentIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndEnvironmentIdNotBetween() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andEnvironmentIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndVersionIdIsNull() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andVersionIdIsNull();

    }

    @Test
    public void testAndVersionIdIsNotNull() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andVersionIdIsNotNull();

    }

    @Test
    public void testAndVersionIdEqualTo() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andVersionIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndVersionIdEqualTo2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andVersionIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndVersionIdNotEqualTo() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andVersionIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndVersionIdNotEqualTo2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andVersionIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndVersionIdGreaterThan() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andVersionIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testAndVersionIdGreaterThan2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andVersionIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndVersionIdGreaterThanOrEqualTo() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andVersionIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndVersionIdGreaterThanOrEqualTo2() throws Exception {
        ConfigChangeLogExample.Criteria result =
                criteria.andVersionIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndVersionIdLessThan() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andVersionIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testAndVersionIdLessThan2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andVersionIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndVersionIdLessThanOrEqualTo() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andVersionIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndVersionIdLessThanOrEqualTo2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andVersionIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndVersionIdIn() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andVersionIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndVersionIdNotIn() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andVersionIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndVersionIdBetween() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andVersionIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndVersionIdNotBetween() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andVersionIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndGroupIdIsNull() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andGroupIdIsNull();

    }

    @Test
    public void testAndGroupIdIsNotNull() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andGroupIdIsNotNull();

    }

    @Test
    public void testAndGroupIdEqualTo() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andGroupIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndGroupIdEqualTo2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andGroupIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndGroupIdNotEqualTo() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andGroupIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndGroupIdNotEqualTo2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andGroupIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndGroupIdGreaterThan() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andGroupIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testAndGroupIdGreaterThan2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andGroupIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndGroupIdGreaterThanOrEqualTo() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andGroupIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndGroupIdGreaterThanOrEqualTo2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andGroupIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndGroupIdLessThan() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andGroupIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testAndGroupIdLessThan2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andGroupIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndGroupIdLessThanOrEqualTo() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andGroupIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndGroupIdLessThanOrEqualTo2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andGroupIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndGroupIdIn() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andGroupIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndGroupIdNotIn() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andGroupIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndGroupIdBetween() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andGroupIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndGroupIdNotBetween() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andGroupIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndGroupNameIsNull() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andGroupNameIsNull();

    }

    @Test
    public void testAndGroupNameIsNotNull() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andGroupNameIsNotNull();

    }

    @Test
    public void testAndGroupNameEqualTo() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andGroupNameEqualTo("value");

    }

    @Test
    public void testAndGroupNameEqualTo2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andGroupNameEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndGroupNameNotEqualTo() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andGroupNameNotEqualTo("value");

    }

    @Test
    public void testAndGroupNameNotEqualTo2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andGroupNameNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndGroupNameGreaterThan() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andGroupNameGreaterThan("value");

    }

    @Test
    public void testAndGroupNameGreaterThan2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andGroupNameGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndGroupNameGreaterThanOrEqualTo() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andGroupNameGreaterThanOrEqualTo("value");

    }

    @Test
    public void testAndGroupNameGreaterThanOrEqualTo2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andGroupNameGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndGroupNameLessThan() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andGroupNameLessThan("value");

    }

    @Test
    public void testAndGroupNameLessThan2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andGroupNameLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndGroupNameLessThanOrEqualTo() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andGroupNameLessThanOrEqualTo("value");

    }

    @Test
    public void testAndGroupNameLessThanOrEqualTo2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andGroupNameLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndGroupNameLike() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andGroupNameLike("value");

    }

    @Test
    public void testAndGroupNameLike2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andGroupNameLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndGroupNameLikeLeft() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andGroupNameLikeLeft("value");

    }

    @Test
    public void testAndGroupNameLikeLeft2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andGroupNameLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndGroupNameLikeRight() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andGroupNameLikeRight("value");

    }

    @Test
    public void testAndGroupNameLikeRight2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andGroupNameLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndGroupNameLikeBoth() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andGroupNameLikeBoth("value");

    }

    @Test
    public void testAndGroupNameLikeBoth2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andGroupNameLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndGroupNameNotLike() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andGroupNameNotLike("value");

    }

    @Test
    public void testAndGroupNameNotLike2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andGroupNameNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndGroupNameNotLikeLeft() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andGroupNameNotLikeLeft("value");

    }

    @Test
    public void testAndGroupNameNotLikeLeft2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andGroupNameNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndGroupNameNotLikeRight() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andGroupNameNotLikeRight("value");

    }

    @Test
    public void testAndGroupNameNotLikeRight2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andGroupNameNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndGroupNameNotLikeBoth() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andGroupNameNotLikeBoth("value");

    }

    @Test
    public void testAndGroupNameNotLikeBoth2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andGroupNameNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndGroupNameIn() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andGroupNameIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndGroupNameNotIn() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andGroupNameNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndGroupNameBetween() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andGroupNameBetween("value1", "value2");

    }

    @Test
    public void testAndGroupNameNotBetween() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andGroupNameNotBetween("value1", "value2");

    }

    @Test
    public void testAndOperatorIsNull() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andOperatorIsNull();

    }

    @Test
    public void testAndOperatorIsNotNull() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andOperatorIsNotNull();

    }

    @Test
    public void testAndOperatorEqualTo() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andOperatorEqualTo("value");

    }

    @Test
    public void testAndOperatorEqualTo2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andOperatorEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndOperatorNotEqualTo() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andOperatorNotEqualTo("value");

    }

    @Test
    public void testAndOperatorNotEqualTo2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andOperatorNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndOperatorGreaterThan() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andOperatorGreaterThan("value");

    }

    @Test
    public void testAndOperatorGreaterThan2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andOperatorGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndOperatorGreaterThanOrEqualTo() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andOperatorGreaterThanOrEqualTo("value");

    }

    @Test
    public void testAndOperatorGreaterThanOrEqualTo2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andOperatorGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndOperatorLessThan() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andOperatorLessThan("value");

    }

    @Test
    public void testAndOperatorLessThan2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andOperatorLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndOperatorLessThanOrEqualTo() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andOperatorLessThanOrEqualTo("value");

    }

    @Test
    public void testAndOperatorLessThanOrEqualTo2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andOperatorLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndOperatorLike() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andOperatorLike("value");

    }

    @Test
    public void testAndOperatorLike2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andOperatorLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndOperatorLikeLeft() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andOperatorLikeLeft("value");

    }

    @Test
    public void testAndOperatorLikeLeft2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andOperatorLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndOperatorLikeRight() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andOperatorLikeRight("value");

    }

    @Test
    public void testAndOperatorLikeRight2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andOperatorLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndOperatorLikeBoth() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andOperatorLikeBoth("value");

    }

    @Test
    public void testAndOperatorLikeBoth2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andOperatorLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndOperatorNotLike() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andOperatorNotLike("value");

    }

    @Test
    public void testAndOperatorNotLike2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andOperatorNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndOperatorNotLikeLeft() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andOperatorNotLikeLeft("value");

    }

    @Test
    public void testAndOperatorNotLikeLeft2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andOperatorNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndOperatorNotLikeRight() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andOperatorNotLikeRight("value");

    }

    @Test
    public void testAndOperatorNotLikeRight2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andOperatorNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndOperatorNotLikeBoth() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andOperatorNotLikeBoth("value");

    }

    @Test
    public void testAndOperatorNotLikeBoth2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andOperatorNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndOperatorIn() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andOperatorIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndOperatorNotIn() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andOperatorNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndOperatorBetween() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andOperatorBetween("value1", "value2");

    }

    @Test
    public void testAndOperatorNotBetween() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andOperatorNotBetween("value1", "value2");

    }

    @Test
    public void testAndCreateTimeIsNull() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andCreateTimeIsNull();

    }

    @Test
    public void testAndCreateTimeIsNotNull() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andCreateTimeIsNotNull();

    }

    @Test
    public void testAndCreateTimeEqualTo() throws Exception {
        ConfigChangeLogExample.Criteria result =
                criteria.andCreateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 54).getTime());

    }

    @Test
    public void testAndCreateTimeEqualTo2() throws Exception {
        ConfigChangeLogExample.Criteria result =
                criteria.andCreateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 54).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeNotEqualTo() throws Exception {
        ConfigChangeLogExample.Criteria result =
                criteria.andCreateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 54).getTime());

    }

    @Test
    public void testAndCreateTimeNotEqualTo2() throws Exception {
        ConfigChangeLogExample.Criteria result =
                criteria.andCreateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 54).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeGreaterThan() throws Exception {
        ConfigChangeLogExample.Criteria result =
                criteria.andCreateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 54).getTime());

    }

    @Test
    public void testAndCreateTimeGreaterThan2() throws Exception {
        ConfigChangeLogExample.Criteria result =
                criteria.andCreateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 54).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeGreaterThanOrEqualTo() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andCreateTimeGreaterThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 54).getTime());

    }

    @Test
    public void testAndCreateTimeGreaterThanOrEqualTo2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andCreateTimeGreaterThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 54).getTime(), Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeLessThan() throws Exception {
        ConfigChangeLogExample.Criteria result =
                criteria.andCreateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 54).getTime());

    }

    @Test
    public void testAndCreateTimeLessThan2() throws Exception {
        ConfigChangeLogExample.Criteria result =
                criteria.andCreateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 54).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeLessThanOrEqualTo() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andCreateTimeLessThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 54).getTime());

    }

    @Test
    public void testAndCreateTimeLessThanOrEqualTo2() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andCreateTimeLessThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 54).getTime(), Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeIn() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andCreateTimeIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 54).getTime()));

    }

    @Test
    public void testAndCreateTimeNotIn() throws Exception {
        ConfigChangeLogExample.Criteria result = criteria.andCreateTimeNotIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 54).getTime()));

    }

    @Test
    public void testAndCreateTimeBetween() throws Exception {
        ConfigChangeLogExample.Criteria result =
                criteria.andCreateTimeBetween(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 54).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 54).getTime());

    }

    @Test
    public void testAndCreateTimeNotBetween() throws Exception {
        ConfigChangeLogExample.Criteria result =
                criteria.andCreateTimeNotBetween(new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 54).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 9, 14, 54).getTime());

    }
}


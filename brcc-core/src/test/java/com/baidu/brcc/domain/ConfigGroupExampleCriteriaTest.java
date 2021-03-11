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

public class ConfigGroupExampleCriteriaTest {

    ConfigGroupExample.Criteria criteria = ConfigGroupExample.newBuilder().build().createCriteria();

    @Before
    public void setUp() {
    }

    @Test
    public void testToExample() throws Exception {
        ConfigGroupExample result = criteria.toExample();

    }

    @Test
    public void testAddCustomerCriteria() throws Exception {
        ConfigGroupExample.Criteria result = criteria.addCustomerCriteria("condition");

    }

    @Test
    public void testAddCustomerCriteria2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.addCustomerCriteria("condition", Boolean.TRUE);

    }

    @Test
    public void testAddCustomerCriteria3() throws Exception {
        ConfigGroupExample.Criteria result = criteria.addCustomerCriteria("condition", "value");

    }

    @Test
    public void testAndGroupCriterion() throws Exception {
        ConfigGroupExample.CriterionGroup result = criteria.andGroupCriterion();

    }

    @Test
    public void testAndGroupCriterion2() throws Exception {
        ConfigGroupExample.CriterionGroup result = criteria.andGroupCriterion(Boolean.TRUE);

    }

    @Test
    public void testIsValid() throws Exception {
        boolean result = criteria.isValid();

    }

    @Test
    public void testAndIdIsNull() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andIdIsNull();

    }

    @Test
    public void testAndIdIsNotNull() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andIdIsNotNull();

    }

    @Test
    public void testAndIdEqualTo() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndIdEqualTo2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdNotEqualTo() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndIdNotEqualTo2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdGreaterThan() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testAndIdGreaterThan2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdGreaterThanOrEqualTo() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndIdGreaterThanOrEqualTo2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdLessThan() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testAndIdLessThan2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdLessThanOrEqualTo() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndIdLessThanOrEqualTo2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdIn() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndIdNotIn() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndIdBetween() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndIdNotBetween() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndNameIsNull() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andNameIsNull();

    }

    @Test
    public void testAndNameIsNotNull() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andNameIsNotNull();

    }

    @Test
    public void testAndNameEqualTo() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andNameEqualTo("value");

    }

    @Test
    public void testAndNameEqualTo2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andNameEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameNotEqualTo() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andNameNotEqualTo("value");

    }

    @Test
    public void testAndNameNotEqualTo2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andNameNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameGreaterThan() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andNameGreaterThan("value");

    }

    @Test
    public void testAndNameGreaterThan2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andNameGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameGreaterThanOrEqualTo() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andNameGreaterThanOrEqualTo("value");

    }

    @Test
    public void testAndNameGreaterThanOrEqualTo2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andNameGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameLessThan() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andNameLessThan("value");

    }

    @Test
    public void testAndNameLessThan2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andNameLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameLessThanOrEqualTo() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andNameLessThanOrEqualTo("value");

    }

    @Test
    public void testAndNameLessThanOrEqualTo2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andNameLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameLike() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andNameLike("value");

    }

    @Test
    public void testAndNameLike2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andNameLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameLikeLeft() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andNameLikeLeft("value");

    }

    @Test
    public void testAndNameLikeLeft2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andNameLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameLikeRight() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andNameLikeRight("value");

    }

    @Test
    public void testAndNameLikeRight2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andNameLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameLikeBoth() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andNameLikeBoth("value");

    }

    @Test
    public void testAndNameLikeBoth2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andNameLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameNotLike() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andNameNotLike("value");

    }

    @Test
    public void testAndNameNotLike2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andNameNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameNotLikeLeft() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andNameNotLikeLeft("value");

    }

    @Test
    public void testAndNameNotLikeLeft2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andNameNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameNotLikeRight() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andNameNotLikeRight("value");

    }

    @Test
    public void testAndNameNotLikeRight2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andNameNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameNotLikeBoth() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andNameNotLikeBoth("value");

    }

    @Test
    public void testAndNameNotLikeBoth2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andNameNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameIn() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andNameIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndNameNotIn() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andNameNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndNameBetween() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andNameBetween("value1", "value2");

    }

    @Test
    public void testAndNameNotBetween() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andNameNotBetween("value1", "value2");

    }

    @Test
    public void testAndMemoIsNull() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andMemoIsNull();

    }

    @Test
    public void testAndMemoIsNotNull() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andMemoIsNotNull();

    }

    @Test
    public void testAndMemoEqualTo() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andMemoEqualTo("value");

    }

    @Test
    public void testAndMemoEqualTo2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andMemoEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoNotEqualTo() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andMemoNotEqualTo("value");

    }

    @Test
    public void testAndMemoNotEqualTo2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andMemoNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoGreaterThan() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andMemoGreaterThan("value");

    }

    @Test
    public void testAndMemoGreaterThan2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andMemoGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoGreaterThanOrEqualTo() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andMemoGreaterThanOrEqualTo("value");

    }

    @Test
    public void testAndMemoGreaterThanOrEqualTo2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andMemoGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoLessThan() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andMemoLessThan("value");

    }

    @Test
    public void testAndMemoLessThan2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andMemoLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoLessThanOrEqualTo() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andMemoLessThanOrEqualTo("value");

    }

    @Test
    public void testAndMemoLessThanOrEqualTo2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andMemoLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoLike() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andMemoLike("value");

    }

    @Test
    public void testAndMemoLike2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andMemoLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoLikeLeft() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andMemoLikeLeft("value");

    }

    @Test
    public void testAndMemoLikeLeft2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andMemoLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoLikeRight() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andMemoLikeRight("value");

    }

    @Test
    public void testAndMemoLikeRight2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andMemoLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoLikeBoth() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andMemoLikeBoth("value");

    }

    @Test
    public void testAndMemoLikeBoth2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andMemoLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoNotLike() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andMemoNotLike("value");

    }

    @Test
    public void testAndMemoNotLike2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andMemoNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoNotLikeLeft() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andMemoNotLikeLeft("value");

    }

    @Test
    public void testAndMemoNotLikeLeft2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andMemoNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoNotLikeRight() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andMemoNotLikeRight("value");

    }

    @Test
    public void testAndMemoNotLikeRight2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andMemoNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoNotLikeBoth() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andMemoNotLikeBoth("value");

    }

    @Test
    public void testAndMemoNotLikeBoth2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andMemoNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoIn() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andMemoIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndMemoNotIn() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andMemoNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndMemoBetween() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andMemoBetween("value1", "value2");

    }

    @Test
    public void testAndMemoNotBetween() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andMemoNotBetween("value1", "value2");

    }

    @Test
    public void testAndProductIdIsNull() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andProductIdIsNull();

    }

    @Test
    public void testAndProductIdIsNotNull() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andProductIdIsNotNull();

    }

    @Test
    public void testAndProductIdEqualTo() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andProductIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndProductIdEqualTo2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andProductIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProductIdNotEqualTo() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andProductIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndProductIdNotEqualTo2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andProductIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProductIdGreaterThan() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andProductIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testAndProductIdGreaterThan2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andProductIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProductIdGreaterThanOrEqualTo() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andProductIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndProductIdGreaterThanOrEqualTo2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andProductIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProductIdLessThan() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andProductIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testAndProductIdLessThan2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andProductIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProductIdLessThanOrEqualTo() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andProductIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndProductIdLessThanOrEqualTo2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andProductIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProductIdIn() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andProductIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndProductIdNotIn() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andProductIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndProductIdBetween() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andProductIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndProductIdNotBetween() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andProductIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndProjectIdIsNull() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andProjectIdIsNull();

    }

    @Test
    public void testAndProjectIdIsNotNull() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andProjectIdIsNotNull();

    }

    @Test
    public void testAndProjectIdEqualTo() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andProjectIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndProjectIdEqualTo2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andProjectIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProjectIdNotEqualTo() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andProjectIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndProjectIdNotEqualTo2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andProjectIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProjectIdGreaterThan() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andProjectIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testAndProjectIdGreaterThan2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andProjectIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProjectIdGreaterThanOrEqualTo() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andProjectIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndProjectIdGreaterThanOrEqualTo2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andProjectIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProjectIdLessThan() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andProjectIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testAndProjectIdLessThan2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andProjectIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProjectIdLessThanOrEqualTo() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andProjectIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndProjectIdLessThanOrEqualTo2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andProjectIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProjectIdIn() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andProjectIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndProjectIdNotIn() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andProjectIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndProjectIdBetween() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andProjectIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndProjectIdNotBetween() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andProjectIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndEnvironmentIdIsNull() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andEnvironmentIdIsNull();

    }

    @Test
    public void testAndEnvironmentIdIsNotNull() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andEnvironmentIdIsNotNull();

    }

    @Test
    public void testAndEnvironmentIdEqualTo() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andEnvironmentIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndEnvironmentIdEqualTo2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andEnvironmentIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndEnvironmentIdNotEqualTo() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andEnvironmentIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndEnvironmentIdNotEqualTo2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andEnvironmentIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndEnvironmentIdGreaterThan() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andEnvironmentIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testAndEnvironmentIdGreaterThan2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andEnvironmentIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndEnvironmentIdGreaterThanOrEqualTo() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andEnvironmentIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndEnvironmentIdGreaterThanOrEqualTo2() throws Exception {
        ConfigGroupExample.Criteria result =
                criteria.andEnvironmentIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndEnvironmentIdLessThan() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andEnvironmentIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testAndEnvironmentIdLessThan2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andEnvironmentIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndEnvironmentIdLessThanOrEqualTo() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andEnvironmentIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndEnvironmentIdLessThanOrEqualTo2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andEnvironmentIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndEnvironmentIdIn() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andEnvironmentIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndEnvironmentIdNotIn() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andEnvironmentIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndEnvironmentIdBetween() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andEnvironmentIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndEnvironmentIdNotBetween() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andEnvironmentIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndVersionIdIsNull() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andVersionIdIsNull();

    }

    @Test
    public void testAndVersionIdIsNotNull() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andVersionIdIsNotNull();

    }

    @Test
    public void testAndVersionIdEqualTo() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andVersionIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndVersionIdEqualTo2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andVersionIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndVersionIdNotEqualTo() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andVersionIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndVersionIdNotEqualTo2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andVersionIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndVersionIdGreaterThan() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andVersionIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testAndVersionIdGreaterThan2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andVersionIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndVersionIdGreaterThanOrEqualTo() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andVersionIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndVersionIdGreaterThanOrEqualTo2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andVersionIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndVersionIdLessThan() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andVersionIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testAndVersionIdLessThan2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andVersionIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndVersionIdLessThanOrEqualTo() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andVersionIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndVersionIdLessThanOrEqualTo2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andVersionIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndVersionIdIn() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andVersionIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndVersionIdNotIn() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andVersionIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndVersionIdBetween() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andVersionIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndVersionIdNotBetween() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andVersionIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndDefaultTypeIsNull() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andDefaultTypeIsNull();

    }

    @Test
    public void testAndDefaultTypeIsNotNull() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andDefaultTypeIsNotNull();

    }

    @Test
    public void testAndDefaultTypeEqualTo() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andDefaultTypeEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndDefaultTypeEqualTo2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andDefaultTypeEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndDefaultTypeNotEqualTo() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andDefaultTypeNotEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndDefaultTypeNotEqualTo2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andDefaultTypeNotEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndDefaultTypeGreaterThan() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andDefaultTypeGreaterThan(Byte.valueOf("00110"));

    }

    @Test
    public void testAndDefaultTypeGreaterThan2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andDefaultTypeGreaterThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndDefaultTypeGreaterThanOrEqualTo() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andDefaultTypeGreaterThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndDefaultTypeGreaterThanOrEqualTo2() throws Exception {
        ConfigGroupExample.Criteria result =
                criteria.andDefaultTypeGreaterThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndDefaultTypeLessThan() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andDefaultTypeLessThan(Byte.valueOf("00110"));

    }

    @Test
    public void testAndDefaultTypeLessThan2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andDefaultTypeLessThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndDefaultTypeLessThanOrEqualTo() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andDefaultTypeLessThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndDefaultTypeLessThanOrEqualTo2() throws Exception {
        ConfigGroupExample.Criteria result =
                criteria.andDefaultTypeLessThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndDefaultTypeIn() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andDefaultTypeIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testAndDefaultTypeNotIn() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andDefaultTypeNotIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testAndDefaultTypeBetween() throws Exception {
        ConfigGroupExample.Criteria result =
                criteria.andDefaultTypeBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testAndDefaultTypeNotBetween() throws Exception {
        ConfigGroupExample.Criteria result =
                criteria.andDefaultTypeNotBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testAndDeletedIsNull() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andDeletedIsNull();

    }

    @Test
    public void testAndDeletedIsNotNull() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andDeletedIsNotNull();

    }

    @Test
    public void testAndDeletedEqualTo() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andDeletedEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndDeletedEqualTo2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andDeletedEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndDeletedNotEqualTo() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andDeletedNotEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndDeletedNotEqualTo2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andDeletedNotEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndDeletedGreaterThan() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andDeletedGreaterThan(Byte.valueOf("00110"));

    }

    @Test
    public void testAndDeletedGreaterThan2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andDeletedGreaterThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndDeletedGreaterThanOrEqualTo() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andDeletedGreaterThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndDeletedGreaterThanOrEqualTo2() throws Exception {
        ConfigGroupExample.Criteria result =
                criteria.andDeletedGreaterThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndDeletedLessThan() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andDeletedLessThan(Byte.valueOf("00110"));

    }

    @Test
    public void testAndDeletedLessThan2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andDeletedLessThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndDeletedLessThanOrEqualTo() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andDeletedLessThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndDeletedLessThanOrEqualTo2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andDeletedLessThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndDeletedIn() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andDeletedIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testAndDeletedNotIn() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andDeletedNotIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testAndDeletedBetween() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andDeletedBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testAndDeletedNotBetween() throws Exception {
        ConfigGroupExample.Criteria result =
                criteria.andDeletedNotBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testAndUpdateTimeIsNull() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andUpdateTimeIsNull();

    }

    @Test
    public void testAndUpdateTimeIsNotNull() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andUpdateTimeIsNotNull();

    }

    @Test
    public void testAndUpdateTimeEqualTo() throws Exception {
        ConfigGroupExample.Criteria result =
                criteria.andUpdateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 3).getTime());

    }

    @Test
    public void testAndUpdateTimeEqualTo2() throws Exception {
        ConfigGroupExample.Criteria result =
                criteria.andUpdateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 3).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndUpdateTimeNotEqualTo() throws Exception {
        ConfigGroupExample.Criteria result =
                criteria.andUpdateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 3).getTime());

    }

    @Test
    public void testAndUpdateTimeNotEqualTo2() throws Exception {
        ConfigGroupExample.Criteria result =
                criteria.andUpdateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 3).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndUpdateTimeGreaterThan() throws Exception {
        ConfigGroupExample.Criteria result =
                criteria.andUpdateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 3).getTime());

    }

    @Test
    public void testAndUpdateTimeGreaterThan2() throws Exception {
        ConfigGroupExample.Criteria result =
                criteria.andUpdateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 3).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndUpdateTimeGreaterThanOrEqualTo() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andUpdateTimeGreaterThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 3).getTime());

    }

    @Test
    public void testAndUpdateTimeGreaterThanOrEqualTo2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andUpdateTimeGreaterThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 3).getTime(), Boolean.TRUE);

    }

    @Test
    public void testAndUpdateTimeLessThan() throws Exception {
        ConfigGroupExample.Criteria result =
                criteria.andUpdateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 3).getTime());

    }

    @Test
    public void testAndUpdateTimeLessThan2() throws Exception {
        ConfigGroupExample.Criteria result =
                criteria.andUpdateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 3).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndUpdateTimeLessThanOrEqualTo() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andUpdateTimeLessThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 3).getTime());

    }

    @Test
    public void testAndUpdateTimeLessThanOrEqualTo2() throws Exception {
        ConfigGroupExample.Criteria result =
                criteria.andUpdateTimeLessThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 3).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndUpdateTimeIn() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andUpdateTimeIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 3).getTime()));

    }

    @Test
    public void testAndUpdateTimeNotIn() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andUpdateTimeNotIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 3).getTime()));

    }

    @Test
    public void testAndUpdateTimeBetween() throws Exception {
        ConfigGroupExample.Criteria result =
                criteria.andUpdateTimeBetween(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 3).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 3).getTime());

    }

    @Test
    public void testAndUpdateTimeNotBetween() throws Exception {
        ConfigGroupExample.Criteria result =
                criteria.andUpdateTimeNotBetween(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 3).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 3).getTime());

    }

    @Test
    public void testAndCreateTimeIsNull() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andCreateTimeIsNull();

    }

    @Test
    public void testAndCreateTimeIsNotNull() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andCreateTimeIsNotNull();

    }

    @Test
    public void testAndCreateTimeEqualTo() throws Exception {
        ConfigGroupExample.Criteria result =
                criteria.andCreateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 3).getTime());

    }

    @Test
    public void testAndCreateTimeEqualTo2() throws Exception {
        ConfigGroupExample.Criteria result =
                criteria.andCreateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 3).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeNotEqualTo() throws Exception {
        ConfigGroupExample.Criteria result =
                criteria.andCreateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 3).getTime());

    }

    @Test
    public void testAndCreateTimeNotEqualTo2() throws Exception {
        ConfigGroupExample.Criteria result =
                criteria.andCreateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 3).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeGreaterThan() throws Exception {
        ConfigGroupExample.Criteria result =
                criteria.andCreateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 3).getTime());

    }

    @Test
    public void testAndCreateTimeGreaterThan2() throws Exception {
        ConfigGroupExample.Criteria result =
                criteria.andCreateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 3).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeGreaterThanOrEqualTo() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andCreateTimeGreaterThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 3).getTime());

    }

    @Test
    public void testAndCreateTimeGreaterThanOrEqualTo2() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andCreateTimeGreaterThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 3).getTime(), Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeLessThan() throws Exception {
        ConfigGroupExample.Criteria result =
                criteria.andCreateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 3).getTime());

    }

    @Test
    public void testAndCreateTimeLessThan2() throws Exception {
        ConfigGroupExample.Criteria result =
                criteria.andCreateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 3).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeLessThanOrEqualTo() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andCreateTimeLessThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 3).getTime());

    }

    @Test
    public void testAndCreateTimeLessThanOrEqualTo2() throws Exception {
        ConfigGroupExample.Criteria result =
                criteria.andCreateTimeLessThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 3).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeIn() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andCreateTimeIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 3).getTime()));

    }

    @Test
    public void testAndCreateTimeNotIn() throws Exception {
        ConfigGroupExample.Criteria result = criteria.andCreateTimeNotIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 3).getTime()));

    }

    @Test
    public void testAndCreateTimeBetween() throws Exception {
        ConfigGroupExample.Criteria result =
                criteria.andCreateTimeBetween(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 3).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 3).getTime());

    }

    @Test
    public void testAndCreateTimeNotBetween() throws Exception {
        ConfigGroupExample.Criteria result =
                criteria.andCreateTimeNotBetween(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 3).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 3).getTime());

    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev
// .com/forum#!/testme

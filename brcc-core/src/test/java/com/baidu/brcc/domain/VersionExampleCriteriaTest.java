/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.domain;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Before;
import org.junit.Test;

public class VersionExampleCriteriaTest {



    VersionExample.Criteria criteria = VersionExample.newBuilder().build().createCriteria();

    @Before
    public void setUp() {

    }

    @Test
    public void testToExample() throws Exception {
        VersionExample result = criteria.toExample();

    }

    @Test
    public void testAddCustomerCriteria() throws Exception {
        VersionExample.Criteria result = criteria.addCustomerCriteria("condition");

    }

    @Test
    public void testAddCustomerCriteria2() throws Exception {
        VersionExample.Criteria result = criteria.addCustomerCriteria("condition", Boolean.TRUE);

    }

    @Test
    public void testAddCustomerCriteria3() throws Exception {
        VersionExample.Criteria result = criteria.addCustomerCriteria("condition", "value");

    }

    @Test
    public void testAndGroupCriterion() throws Exception {
        VersionExample.CriterionGroup result = criteria.andGroupCriterion();

    }

    @Test
    public void testAndGroupCriterion2() throws Exception {
        VersionExample.CriterionGroup result = criteria.andGroupCriterion(Boolean.TRUE);

    }

    @Test
    public void testIsValid() throws Exception {
        boolean result = criteria.isValid();

    }

    @Test
    public void testAndIdIsNull() throws Exception {
        VersionExample.Criteria result = criteria.andIdIsNull();

    }

    @Test
    public void testAndIdIsNotNull() throws Exception {
        VersionExample.Criteria result = criteria.andIdIsNotNull();

    }

    @Test
    public void testAndIdEqualTo() throws Exception {
        VersionExample.Criteria result = criteria.andIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndIdEqualTo2() throws Exception {
        VersionExample.Criteria result = criteria.andIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdNotEqualTo() throws Exception {
        VersionExample.Criteria result = criteria.andIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndIdNotEqualTo2() throws Exception {
        VersionExample.Criteria result = criteria.andIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdGreaterThan() throws Exception {
        VersionExample.Criteria result = criteria.andIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testAndIdGreaterThan2() throws Exception {
        VersionExample.Criteria result = criteria.andIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdGreaterThanOrEqualTo() throws Exception {
        VersionExample.Criteria result = criteria.andIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndIdGreaterThanOrEqualTo2() throws Exception {
        VersionExample.Criteria result = criteria.andIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdLessThan() throws Exception {
        VersionExample.Criteria result = criteria.andIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testAndIdLessThan2() throws Exception {
        VersionExample.Criteria result = criteria.andIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdLessThanOrEqualTo() throws Exception {
        VersionExample.Criteria result = criteria.andIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndIdLessThanOrEqualTo2() throws Exception {
        VersionExample.Criteria result = criteria.andIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdIn() throws Exception {
        VersionExample.Criteria result = criteria.andIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndIdNotIn() throws Exception {
        VersionExample.Criteria result = criteria.andIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndIdBetween() throws Exception {
        VersionExample.Criteria result = criteria.andIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndIdNotBetween() throws Exception {
        VersionExample.Criteria result = criteria.andIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndNameIsNull() throws Exception {
        VersionExample.Criteria result = criteria.andNameIsNull();

    }

    @Test
    public void testAndNameIsNotNull() throws Exception {
        VersionExample.Criteria result = criteria.andNameIsNotNull();

    }

    @Test
    public void testAndNameEqualTo() throws Exception {
        VersionExample.Criteria result = criteria.andNameEqualTo("value");

    }

    @Test
    public void testAndNameEqualTo2() throws Exception {
        VersionExample.Criteria result = criteria.andNameEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameNotEqualTo() throws Exception {
        VersionExample.Criteria result = criteria.andNameNotEqualTo("value");

    }

    @Test
    public void testAndNameNotEqualTo2() throws Exception {
        VersionExample.Criteria result = criteria.andNameNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameGreaterThan() throws Exception {
        VersionExample.Criteria result = criteria.andNameGreaterThan("value");

    }

    @Test
    public void testAndNameGreaterThan2() throws Exception {
        VersionExample.Criteria result = criteria.andNameGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameGreaterThanOrEqualTo() throws Exception {
        VersionExample.Criteria result = criteria.andNameGreaterThanOrEqualTo("value");

    }

    @Test
    public void testAndNameGreaterThanOrEqualTo2() throws Exception {
        VersionExample.Criteria result = criteria.andNameGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameLessThan() throws Exception {
        VersionExample.Criteria result = criteria.andNameLessThan("value");

    }

    @Test
    public void testAndNameLessThan2() throws Exception {
        VersionExample.Criteria result = criteria.andNameLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameLessThanOrEqualTo() throws Exception {
        VersionExample.Criteria result = criteria.andNameLessThanOrEqualTo("value");

    }

    @Test
    public void testAndNameLessThanOrEqualTo2() throws Exception {
        VersionExample.Criteria result = criteria.andNameLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameLike() throws Exception {
        VersionExample.Criteria result = criteria.andNameLike("value");

    }

    @Test
    public void testAndNameLike2() throws Exception {
        VersionExample.Criteria result = criteria.andNameLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameLikeLeft() throws Exception {
        VersionExample.Criteria result = criteria.andNameLikeLeft("value");

    }

    @Test
    public void testAndNameLikeLeft2() throws Exception {
        VersionExample.Criteria result = criteria.andNameLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameLikeRight() throws Exception {
        VersionExample.Criteria result = criteria.andNameLikeRight("value");

    }

    @Test
    public void testAndNameLikeRight2() throws Exception {
        VersionExample.Criteria result = criteria.andNameLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameLikeBoth() throws Exception {
        VersionExample.Criteria result = criteria.andNameLikeBoth("value");

    }

    @Test
    public void testAndNameLikeBoth2() throws Exception {
        VersionExample.Criteria result = criteria.andNameLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameNotLike() throws Exception {
        VersionExample.Criteria result = criteria.andNameNotLike("value");

    }

    @Test
    public void testAndNameNotLike2() throws Exception {
        VersionExample.Criteria result = criteria.andNameNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameNotLikeLeft() throws Exception {
        VersionExample.Criteria result = criteria.andNameNotLikeLeft("value");

    }

    @Test
    public void testAndNameNotLikeLeft2() throws Exception {
        VersionExample.Criteria result = criteria.andNameNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameNotLikeRight() throws Exception {
        VersionExample.Criteria result = criteria.andNameNotLikeRight("value");

    }

    @Test
    public void testAndNameNotLikeRight2() throws Exception {
        VersionExample.Criteria result = criteria.andNameNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameNotLikeBoth() throws Exception {
        VersionExample.Criteria result = criteria.andNameNotLikeBoth("value");

    }

    @Test
    public void testAndNameNotLikeBoth2() throws Exception {
        VersionExample.Criteria result = criteria.andNameNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameIn() throws Exception {
        VersionExample.Criteria result = criteria.andNameIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndNameNotIn() throws Exception {
        VersionExample.Criteria result = criteria.andNameNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndNameBetween() throws Exception {
        VersionExample.Criteria result = criteria.andNameBetween("value1", "value2");

    }

    @Test
    public void testAndNameNotBetween() throws Exception {
        VersionExample.Criteria result = criteria.andNameNotBetween("value1", "value2");

    }

    @Test
    public void testAndProductIdIsNull() throws Exception {
        VersionExample.Criteria result = criteria.andProductIdIsNull();

    }

    @Test
    public void testAndProductIdIsNotNull() throws Exception {
        VersionExample.Criteria result = criteria.andProductIdIsNotNull();

    }

    @Test
    public void testAndProductIdEqualTo() throws Exception {
        VersionExample.Criteria result = criteria.andProductIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndProductIdEqualTo2() throws Exception {
        VersionExample.Criteria result = criteria.andProductIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProductIdNotEqualTo() throws Exception {
        VersionExample.Criteria result = criteria.andProductIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndProductIdNotEqualTo2() throws Exception {
        VersionExample.Criteria result = criteria.andProductIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProductIdGreaterThan() throws Exception {
        VersionExample.Criteria result = criteria.andProductIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testAndProductIdGreaterThan2() throws Exception {
        VersionExample.Criteria result = criteria.andProductIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProductIdGreaterThanOrEqualTo() throws Exception {
        VersionExample.Criteria result = criteria.andProductIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndProductIdGreaterThanOrEqualTo2() throws Exception {
        VersionExample.Criteria result = criteria.andProductIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProductIdLessThan() throws Exception {
        VersionExample.Criteria result = criteria.andProductIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testAndProductIdLessThan2() throws Exception {
        VersionExample.Criteria result = criteria.andProductIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProductIdLessThanOrEqualTo() throws Exception {
        VersionExample.Criteria result = criteria.andProductIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndProductIdLessThanOrEqualTo2() throws Exception {
        VersionExample.Criteria result = criteria.andProductIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProductIdIn() throws Exception {
        VersionExample.Criteria result = criteria.andProductIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndProductIdNotIn() throws Exception {
        VersionExample.Criteria result = criteria.andProductIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndProductIdBetween() throws Exception {
        VersionExample.Criteria result = criteria.andProductIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndProductIdNotBetween() throws Exception {
        VersionExample.Criteria result = criteria.andProductIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndMemoIsNull() throws Exception {
        VersionExample.Criteria result = criteria.andMemoIsNull();

    }

    @Test
    public void testAndMemoIsNotNull() throws Exception {
        VersionExample.Criteria result = criteria.andMemoIsNotNull();

    }

    @Test
    public void testAndMemoEqualTo() throws Exception {
        VersionExample.Criteria result = criteria.andMemoEqualTo("value");

    }

    @Test
    public void testAndMemoEqualTo2() throws Exception {
        VersionExample.Criteria result = criteria.andMemoEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoNotEqualTo() throws Exception {
        VersionExample.Criteria result = criteria.andMemoNotEqualTo("value");

    }

    @Test
    public void testAndMemoNotEqualTo2() throws Exception {
        VersionExample.Criteria result = criteria.andMemoNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoGreaterThan() throws Exception {
        VersionExample.Criteria result = criteria.andMemoGreaterThan("value");

    }

    @Test
    public void testAndMemoGreaterThan2() throws Exception {
        VersionExample.Criteria result = criteria.andMemoGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoGreaterThanOrEqualTo() throws Exception {
        VersionExample.Criteria result = criteria.andMemoGreaterThanOrEqualTo("value");

    }

    @Test
    public void testAndMemoGreaterThanOrEqualTo2() throws Exception {
        VersionExample.Criteria result = criteria.andMemoGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoLessThan() throws Exception {
        VersionExample.Criteria result = criteria.andMemoLessThan("value");

    }

    @Test
    public void testAndMemoLessThan2() throws Exception {
        VersionExample.Criteria result = criteria.andMemoLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoLessThanOrEqualTo() throws Exception {
        VersionExample.Criteria result = criteria.andMemoLessThanOrEqualTo("value");

    }

    @Test
    public void testAndMemoLessThanOrEqualTo2() throws Exception {
        VersionExample.Criteria result = criteria.andMemoLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoLike() throws Exception {
        VersionExample.Criteria result = criteria.andMemoLike("value");

    }

    @Test
    public void testAndMemoLike2() throws Exception {
        VersionExample.Criteria result = criteria.andMemoLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoLikeLeft() throws Exception {
        VersionExample.Criteria result = criteria.andMemoLikeLeft("value");

    }

    @Test
    public void testAndMemoLikeLeft2() throws Exception {
        VersionExample.Criteria result = criteria.andMemoLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoLikeRight() throws Exception {
        VersionExample.Criteria result = criteria.andMemoLikeRight("value");

    }

    @Test
    public void testAndMemoLikeRight2() throws Exception {
        VersionExample.Criteria result = criteria.andMemoLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoLikeBoth() throws Exception {
        VersionExample.Criteria result = criteria.andMemoLikeBoth("value");

    }

    @Test
    public void testAndMemoLikeBoth2() throws Exception {
        VersionExample.Criteria result = criteria.andMemoLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoNotLike() throws Exception {
        VersionExample.Criteria result = criteria.andMemoNotLike("value");

    }

    @Test
    public void testAndMemoNotLike2() throws Exception {
        VersionExample.Criteria result = criteria.andMemoNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoNotLikeLeft() throws Exception {
        VersionExample.Criteria result = criteria.andMemoNotLikeLeft("value");

    }

    @Test
    public void testAndMemoNotLikeLeft2() throws Exception {
        VersionExample.Criteria result = criteria.andMemoNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoNotLikeRight() throws Exception {
        VersionExample.Criteria result = criteria.andMemoNotLikeRight("value");

    }

    @Test
    public void testAndMemoNotLikeRight2() throws Exception {
        VersionExample.Criteria result = criteria.andMemoNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoNotLikeBoth() throws Exception {
        VersionExample.Criteria result = criteria.andMemoNotLikeBoth("value");

    }

    @Test
    public void testAndMemoNotLikeBoth2() throws Exception {
        VersionExample.Criteria result = criteria.andMemoNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoIn() throws Exception {
        VersionExample.Criteria result = criteria.andMemoIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndMemoNotIn() throws Exception {
        VersionExample.Criteria result = criteria.andMemoNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndMemoBetween() throws Exception {
        VersionExample.Criteria result = criteria.andMemoBetween("value1", "value2");

    }

    @Test
    public void testAndMemoNotBetween() throws Exception {
        VersionExample.Criteria result = criteria.andMemoNotBetween("value1", "value2");

    }

    @Test
    public void testAndProjectIdIsNull() throws Exception {
        VersionExample.Criteria result = criteria.andProjectIdIsNull();

    }

    @Test
    public void testAndProjectIdIsNotNull() throws Exception {
        VersionExample.Criteria result = criteria.andProjectIdIsNotNull();

    }

    @Test
    public void testAndProjectIdEqualTo() throws Exception {
        VersionExample.Criteria result = criteria.andProjectIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndProjectIdEqualTo2() throws Exception {
        VersionExample.Criteria result = criteria.andProjectIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProjectIdNotEqualTo() throws Exception {
        VersionExample.Criteria result = criteria.andProjectIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndProjectIdNotEqualTo2() throws Exception {
        VersionExample.Criteria result = criteria.andProjectIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProjectIdGreaterThan() throws Exception {
        VersionExample.Criteria result = criteria.andProjectIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testAndProjectIdGreaterThan2() throws Exception {
        VersionExample.Criteria result = criteria.andProjectIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProjectIdGreaterThanOrEqualTo() throws Exception {
        VersionExample.Criteria result = criteria.andProjectIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndProjectIdGreaterThanOrEqualTo2() throws Exception {
        VersionExample.Criteria result = criteria.andProjectIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProjectIdLessThan() throws Exception {
        VersionExample.Criteria result = criteria.andProjectIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testAndProjectIdLessThan2() throws Exception {
        VersionExample.Criteria result = criteria.andProjectIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProjectIdLessThanOrEqualTo() throws Exception {
        VersionExample.Criteria result = criteria.andProjectIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndProjectIdLessThanOrEqualTo2() throws Exception {
        VersionExample.Criteria result = criteria.andProjectIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProjectIdIn() throws Exception {
        VersionExample.Criteria result = criteria.andProjectIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndProjectIdNotIn() throws Exception {
        VersionExample.Criteria result = criteria.andProjectIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndProjectIdBetween() throws Exception {
        VersionExample.Criteria result = criteria.andProjectIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndProjectIdNotBetween() throws Exception {
        VersionExample.Criteria result = criteria.andProjectIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndEnvironmentIdIsNull() throws Exception {
        VersionExample.Criteria result = criteria.andEnvironmentIdIsNull();

    }

    @Test
    public void testAndEnvironmentIdIsNotNull() throws Exception {
        VersionExample.Criteria result = criteria.andEnvironmentIdIsNotNull();

    }

    @Test
    public void testAndEnvironmentIdEqualTo() throws Exception {
        VersionExample.Criteria result = criteria.andEnvironmentIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndEnvironmentIdEqualTo2() throws Exception {
        VersionExample.Criteria result = criteria.andEnvironmentIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndEnvironmentIdNotEqualTo() throws Exception {
        VersionExample.Criteria result = criteria.andEnvironmentIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndEnvironmentIdNotEqualTo2() throws Exception {
        VersionExample.Criteria result = criteria.andEnvironmentIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndEnvironmentIdGreaterThan() throws Exception {
        VersionExample.Criteria result = criteria.andEnvironmentIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testAndEnvironmentIdGreaterThan2() throws Exception {
        VersionExample.Criteria result = criteria.andEnvironmentIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndEnvironmentIdGreaterThanOrEqualTo() throws Exception {
        VersionExample.Criteria result = criteria.andEnvironmentIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndEnvironmentIdGreaterThanOrEqualTo2() throws Exception {
        VersionExample.Criteria result = criteria.andEnvironmentIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndEnvironmentIdLessThan() throws Exception {
        VersionExample.Criteria result = criteria.andEnvironmentIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testAndEnvironmentIdLessThan2() throws Exception {
        VersionExample.Criteria result = criteria.andEnvironmentIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndEnvironmentIdLessThanOrEqualTo() throws Exception {
        VersionExample.Criteria result = criteria.andEnvironmentIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndEnvironmentIdLessThanOrEqualTo2() throws Exception {
        VersionExample.Criteria result = criteria.andEnvironmentIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndEnvironmentIdIn() throws Exception {
        VersionExample.Criteria result = criteria.andEnvironmentIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndEnvironmentIdNotIn() throws Exception {
        VersionExample.Criteria result = criteria.andEnvironmentIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndEnvironmentIdBetween() throws Exception {
        VersionExample.Criteria result = criteria.andEnvironmentIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndEnvironmentIdNotBetween() throws Exception {
        VersionExample.Criteria result = criteria.andEnvironmentIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndCheckSumIsNull() throws Exception {
        VersionExample.Criteria result = criteria.andCheckSumIsNull();

    }

    @Test
    public void testAndCheckSumIsNotNull() throws Exception {
        VersionExample.Criteria result = criteria.andCheckSumIsNotNull();

    }

    @Test
    public void testAndCheckSumEqualTo() throws Exception {
        VersionExample.Criteria result = criteria.andCheckSumEqualTo("value");

    }

    @Test
    public void testAndCheckSumEqualTo2() throws Exception {
        VersionExample.Criteria result = criteria.andCheckSumEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndCheckSumNotEqualTo() throws Exception {
        VersionExample.Criteria result = criteria.andCheckSumNotEqualTo("value");

    }

    @Test
    public void testAndCheckSumNotEqualTo2() throws Exception {
        VersionExample.Criteria result = criteria.andCheckSumNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndCheckSumGreaterThan() throws Exception {
        VersionExample.Criteria result = criteria.andCheckSumGreaterThan("value");

    }

    @Test
    public void testAndCheckSumGreaterThan2() throws Exception {
        VersionExample.Criteria result = criteria.andCheckSumGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndCheckSumGreaterThanOrEqualTo() throws Exception {
        VersionExample.Criteria result = criteria.andCheckSumGreaterThanOrEqualTo("value");

    }

    @Test
    public void testAndCheckSumGreaterThanOrEqualTo2() throws Exception {
        VersionExample.Criteria result = criteria.andCheckSumGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndCheckSumLessThan() throws Exception {
        VersionExample.Criteria result = criteria.andCheckSumLessThan("value");

    }

    @Test
    public void testAndCheckSumLessThan2() throws Exception {
        VersionExample.Criteria result = criteria.andCheckSumLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndCheckSumLessThanOrEqualTo() throws Exception {
        VersionExample.Criteria result = criteria.andCheckSumLessThanOrEqualTo("value");

    }

    @Test
    public void testAndCheckSumLessThanOrEqualTo2() throws Exception {
        VersionExample.Criteria result = criteria.andCheckSumLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndCheckSumLike() throws Exception {
        VersionExample.Criteria result = criteria.andCheckSumLike("value");

    }

    @Test
    public void testAndCheckSumLike2() throws Exception {
        VersionExample.Criteria result = criteria.andCheckSumLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndCheckSumLikeLeft() throws Exception {
        VersionExample.Criteria result = criteria.andCheckSumLikeLeft("value");

    }

    @Test
    public void testAndCheckSumLikeLeft2() throws Exception {
        VersionExample.Criteria result = criteria.andCheckSumLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndCheckSumLikeRight() throws Exception {
        VersionExample.Criteria result = criteria.andCheckSumLikeRight("value");

    }

    @Test
    public void testAndCheckSumLikeRight2() throws Exception {
        VersionExample.Criteria result = criteria.andCheckSumLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndCheckSumLikeBoth() throws Exception {
        VersionExample.Criteria result = criteria.andCheckSumLikeBoth("value");

    }

    @Test
    public void testAndCheckSumLikeBoth2() throws Exception {
        VersionExample.Criteria result = criteria.andCheckSumLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndCheckSumNotLike() throws Exception {
        VersionExample.Criteria result = criteria.andCheckSumNotLike("value");

    }

    @Test
    public void testAndCheckSumNotLike2() throws Exception {
        VersionExample.Criteria result = criteria.andCheckSumNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndCheckSumNotLikeLeft() throws Exception {
        VersionExample.Criteria result = criteria.andCheckSumNotLikeLeft("value");

    }

    @Test
    public void testAndCheckSumNotLikeLeft2() throws Exception {
        VersionExample.Criteria result = criteria.andCheckSumNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndCheckSumNotLikeRight() throws Exception {
        VersionExample.Criteria result = criteria.andCheckSumNotLikeRight("value");

    }

    @Test
    public void testAndCheckSumNotLikeRight2() throws Exception {
        VersionExample.Criteria result = criteria.andCheckSumNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndCheckSumNotLikeBoth() throws Exception {
        VersionExample.Criteria result = criteria.andCheckSumNotLikeBoth("value");

    }

    @Test
    public void testAndCheckSumNotLikeBoth2() throws Exception {
        VersionExample.Criteria result = criteria.andCheckSumNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndCheckSumIn() throws Exception {
        VersionExample.Criteria result = criteria.andCheckSumIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndCheckSumNotIn() throws Exception {
        VersionExample.Criteria result = criteria.andCheckSumNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndCheckSumBetween() throws Exception {
        VersionExample.Criteria result = criteria.andCheckSumBetween("value1", "value2");

    }

    @Test
    public void testAndCheckSumNotBetween() throws Exception {
        VersionExample.Criteria result = criteria.andCheckSumNotBetween("value1", "value2");

    }

    @Test
    public void testAndCheckSumDateIsNull() throws Exception {
        VersionExample.Criteria result = criteria.andCheckSumDateIsNull();

    }

    @Test
    public void testAndCheckSumDateIsNotNull() throws Exception {
        VersionExample.Criteria result = criteria.andCheckSumDateIsNotNull();

    }

    @Test
    public void testAndCheckSumDateEqualTo() throws Exception {
        VersionExample.Criteria result =
                criteria.andCheckSumDateEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime());

    }

    @Test
    public void testAndCheckSumDateEqualTo2() throws Exception {
        VersionExample.Criteria result =
                criteria.andCheckSumDateEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndCheckSumDateNotEqualTo() throws Exception {
        VersionExample.Criteria result =
                criteria.andCheckSumDateNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime());

    }

    @Test
    public void testAndCheckSumDateNotEqualTo2() throws Exception {
        VersionExample.Criteria result =
                criteria.andCheckSumDateNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndCheckSumDateGreaterThan() throws Exception {
        VersionExample.Criteria result =
                criteria.andCheckSumDateGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime());

    }

    @Test
    public void testAndCheckSumDateGreaterThan2() throws Exception {
        VersionExample.Criteria result =
                criteria.andCheckSumDateGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndCheckSumDateGreaterThanOrEqualTo() throws Exception {
        VersionExample.Criteria result = criteria.andCheckSumDateGreaterThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime());

    }

    @Test
    public void testAndCheckSumDateGreaterThanOrEqualTo2() throws Exception {
        VersionExample.Criteria result = criteria.andCheckSumDateGreaterThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime(), Boolean.TRUE);

    }

    @Test
    public void testAndCheckSumDateLessThan() throws Exception {
        VersionExample.Criteria result =
                criteria.andCheckSumDateLessThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime());

    }

    @Test
    public void testAndCheckSumDateLessThan2() throws Exception {
        VersionExample.Criteria result =
                criteria.andCheckSumDateLessThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndCheckSumDateLessThanOrEqualTo() throws Exception {
        VersionExample.Criteria result = criteria.andCheckSumDateLessThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime());

    }

    @Test
    public void testAndCheckSumDateLessThanOrEqualTo2() throws Exception {
        VersionExample.Criteria result = criteria.andCheckSumDateLessThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime(), Boolean.TRUE);

    }

    @Test
    public void testAndCheckSumDateIn() throws Exception {
        VersionExample.Criteria result = criteria.andCheckSumDateIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime()));

    }

    @Test
    public void testAndCheckSumDateNotIn() throws Exception {
        VersionExample.Criteria result = criteria.andCheckSumDateNotIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime()));

    }

    @Test
    public void testAndCheckSumDateBetween() throws Exception {
        VersionExample.Criteria result =
                criteria.andCheckSumDateBetween(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime());

    }

    @Test
    public void testAndCheckSumDateNotBetween() throws Exception {
        VersionExample.Criteria result =
                criteria.andCheckSumDateNotBetween(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime());

    }

    @Test
    public void testAndCheckSumEnableIsNull() throws Exception {
        VersionExample.Criteria result = criteria.andCheckSumEnableIsNull();

    }

    @Test
    public void testAndCheckSumEnableIsNotNull() throws Exception {
        VersionExample.Criteria result = criteria.andCheckSumEnableIsNotNull();

    }

    @Test
    public void testAndCheckSumEnableEqualTo() throws Exception {
        VersionExample.Criteria result = criteria.andCheckSumEnableEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndCheckSumEnableEqualTo2() throws Exception {
        VersionExample.Criteria result = criteria.andCheckSumEnableEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndCheckSumEnableNotEqualTo() throws Exception {
        VersionExample.Criteria result = criteria.andCheckSumEnableNotEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndCheckSumEnableNotEqualTo2() throws Exception {
        VersionExample.Criteria result = criteria.andCheckSumEnableNotEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndCheckSumEnableGreaterThan() throws Exception {
        VersionExample.Criteria result = criteria.andCheckSumEnableGreaterThan(Byte.valueOf("00110"));

    }

    @Test
    public void testAndCheckSumEnableGreaterThan2() throws Exception {
        VersionExample.Criteria result = criteria.andCheckSumEnableGreaterThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndCheckSumEnableGreaterThanOrEqualTo() throws Exception {
        VersionExample.Criteria result = criteria.andCheckSumEnableGreaterThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndCheckSumEnableGreaterThanOrEqualTo2() throws Exception {
        VersionExample.Criteria result =
                criteria.andCheckSumEnableGreaterThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndCheckSumEnableLessThan() throws Exception {
        VersionExample.Criteria result = criteria.andCheckSumEnableLessThan(Byte.valueOf("00110"));

    }

    @Test
    public void testAndCheckSumEnableLessThan2() throws Exception {
        VersionExample.Criteria result = criteria.andCheckSumEnableLessThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndCheckSumEnableLessThanOrEqualTo() throws Exception {
        VersionExample.Criteria result = criteria.andCheckSumEnableLessThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndCheckSumEnableLessThanOrEqualTo2() throws Exception {
        VersionExample.Criteria result =
                criteria.andCheckSumEnableLessThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndCheckSumEnableIn() throws Exception {
        VersionExample.Criteria result = criteria.andCheckSumEnableIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testAndCheckSumEnableNotIn() throws Exception {
        VersionExample.Criteria result = criteria.andCheckSumEnableNotIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testAndCheckSumEnableBetween() throws Exception {
        VersionExample.Criteria result =
                criteria.andCheckSumEnableBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testAndCheckSumEnableNotBetween() throws Exception {
        VersionExample.Criteria result =
                criteria.andCheckSumEnableNotBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testAndDeletedIsNull() throws Exception {
        VersionExample.Criteria result = criteria.andDeletedIsNull();

    }

    @Test
    public void testAndDeletedIsNotNull() throws Exception {
        VersionExample.Criteria result = criteria.andDeletedIsNotNull();

    }

    @Test
    public void testAndDeletedEqualTo() throws Exception {
        VersionExample.Criteria result = criteria.andDeletedEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndDeletedEqualTo2() throws Exception {
        VersionExample.Criteria result = criteria.andDeletedEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndDeletedNotEqualTo() throws Exception {
        VersionExample.Criteria result = criteria.andDeletedNotEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndDeletedNotEqualTo2() throws Exception {
        VersionExample.Criteria result = criteria.andDeletedNotEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndDeletedGreaterThan() throws Exception {
        VersionExample.Criteria result = criteria.andDeletedGreaterThan(Byte.valueOf("00110"));

    }

    @Test
    public void testAndDeletedGreaterThan2() throws Exception {
        VersionExample.Criteria result = criteria.andDeletedGreaterThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndDeletedGreaterThanOrEqualTo() throws Exception {
        VersionExample.Criteria result = criteria.andDeletedGreaterThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndDeletedGreaterThanOrEqualTo2() throws Exception {
        VersionExample.Criteria result = criteria.andDeletedGreaterThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndDeletedLessThan() throws Exception {
        VersionExample.Criteria result = criteria.andDeletedLessThan(Byte.valueOf("00110"));

    }

    @Test
    public void testAndDeletedLessThan2() throws Exception {
        VersionExample.Criteria result = criteria.andDeletedLessThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndDeletedLessThanOrEqualTo() throws Exception {
        VersionExample.Criteria result = criteria.andDeletedLessThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndDeletedLessThanOrEqualTo2() throws Exception {
        VersionExample.Criteria result = criteria.andDeletedLessThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndDeletedIn() throws Exception {
        VersionExample.Criteria result = criteria.andDeletedIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testAndDeletedNotIn() throws Exception {
        VersionExample.Criteria result = criteria.andDeletedNotIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testAndDeletedBetween() throws Exception {
        VersionExample.Criteria result = criteria.andDeletedBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testAndDeletedNotBetween() throws Exception {
        VersionExample.Criteria result = criteria.andDeletedNotBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testAndUpdateTimeIsNull() throws Exception {
        VersionExample.Criteria result = criteria.andUpdateTimeIsNull();

    }

    @Test
    public void testAndUpdateTimeIsNotNull() throws Exception {
        VersionExample.Criteria result = criteria.andUpdateTimeIsNotNull();

    }

    @Test
    public void testAndUpdateTimeEqualTo() throws Exception {
        VersionExample.Criteria result =
                criteria.andUpdateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime());

    }

    @Test
    public void testAndUpdateTimeEqualTo2() throws Exception {
        VersionExample.Criteria result =
                criteria.andUpdateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndUpdateTimeNotEqualTo() throws Exception {
        VersionExample.Criteria result =
                criteria.andUpdateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime());

    }

    @Test
    public void testAndUpdateTimeNotEqualTo2() throws Exception {
        VersionExample.Criteria result =
                criteria.andUpdateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndUpdateTimeGreaterThan() throws Exception {
        VersionExample.Criteria result =
                criteria.andUpdateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime());

    }

    @Test
    public void testAndUpdateTimeGreaterThan2() throws Exception {
        VersionExample.Criteria result =
                criteria.andUpdateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndUpdateTimeGreaterThanOrEqualTo() throws Exception {
        VersionExample.Criteria result = criteria.andUpdateTimeGreaterThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime());

    }

    @Test
    public void testAndUpdateTimeGreaterThanOrEqualTo2() throws Exception {
        VersionExample.Criteria result = criteria.andUpdateTimeGreaterThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime(), Boolean.TRUE);

    }

    @Test
    public void testAndUpdateTimeLessThan() throws Exception {
        VersionExample.Criteria result =
                criteria.andUpdateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime());

    }

    @Test
    public void testAndUpdateTimeLessThan2() throws Exception {
        VersionExample.Criteria result =
                criteria.andUpdateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndUpdateTimeLessThanOrEqualTo() throws Exception {
        VersionExample.Criteria result = criteria.andUpdateTimeLessThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime());

    }

    @Test
    public void testAndUpdateTimeLessThanOrEqualTo2() throws Exception {
        VersionExample.Criteria result = criteria.andUpdateTimeLessThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime(), Boolean.TRUE);

    }

    @Test
    public void testAndUpdateTimeIn() throws Exception {
        VersionExample.Criteria result = criteria.andUpdateTimeIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime()));

    }

    @Test
    public void testAndUpdateTimeNotIn() throws Exception {
        VersionExample.Criteria result = criteria.andUpdateTimeNotIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime()));

    }

    @Test
    public void testAndUpdateTimeBetween() throws Exception {
        VersionExample.Criteria result =
                criteria.andUpdateTimeBetween(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime());

    }

    @Test
    public void testAndUpdateTimeNotBetween() throws Exception {
        VersionExample.Criteria result =
                criteria.andUpdateTimeNotBetween(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime());

    }

    @Test
    public void testAndCreateTimeIsNull() throws Exception {
        VersionExample.Criteria result = criteria.andCreateTimeIsNull();

    }

    @Test
    public void testAndCreateTimeIsNotNull() throws Exception {
        VersionExample.Criteria result = criteria.andCreateTimeIsNotNull();

    }

    @Test
    public void testAndCreateTimeEqualTo() throws Exception {
        VersionExample.Criteria result =
                criteria.andCreateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime());

    }

    @Test
    public void testAndCreateTimeEqualTo2() throws Exception {
        VersionExample.Criteria result =
                criteria.andCreateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeNotEqualTo() throws Exception {
        VersionExample.Criteria result =
                criteria.andCreateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime());

    }

    @Test
    public void testAndCreateTimeNotEqualTo2() throws Exception {
        VersionExample.Criteria result =
                criteria.andCreateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeGreaterThan() throws Exception {
        VersionExample.Criteria result =
                criteria.andCreateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime());

    }

    @Test
    public void testAndCreateTimeGreaterThan2() throws Exception {
        VersionExample.Criteria result =
                criteria.andCreateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeGreaterThanOrEqualTo() throws Exception {
        VersionExample.Criteria result = criteria.andCreateTimeGreaterThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime());

    }

    @Test
    public void testAndCreateTimeGreaterThanOrEqualTo2() throws Exception {
        VersionExample.Criteria result = criteria.andCreateTimeGreaterThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime(), Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeLessThan() throws Exception {
        VersionExample.Criteria result =
                criteria.andCreateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime());

    }

    @Test
    public void testAndCreateTimeLessThan2() throws Exception {
        VersionExample.Criteria result =
                criteria.andCreateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeLessThanOrEqualTo() throws Exception {
        VersionExample.Criteria result = criteria.andCreateTimeLessThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime());

    }

    @Test
    public void testAndCreateTimeLessThanOrEqualTo2() throws Exception {
        VersionExample.Criteria result = criteria.andCreateTimeLessThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime(), Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeIn() throws Exception {
        VersionExample.Criteria result = criteria.andCreateTimeIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime()));

    }

    @Test
    public void testAndCreateTimeNotIn() throws Exception {
        VersionExample.Criteria result = criteria.andCreateTimeNotIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime()));

    }

    @Test
    public void testAndCreateTimeBetween() throws Exception {
        VersionExample.Criteria result =
                criteria.andCreateTimeBetween(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime());

    }

    @Test
    public void testAndCreateTimeNotBetween() throws Exception {
        VersionExample.Criteria result =
                criteria.andCreateTimeNotBetween(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 18).getTime());

    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev
// .com/forum#!/testme

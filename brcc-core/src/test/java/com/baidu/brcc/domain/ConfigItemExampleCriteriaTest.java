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

public class ConfigItemExampleCriteriaTest {

    ConfigItemExample.Criteria criteria = ConfigItemExample.newBuilder().build().createCriteria();

    @Before
    public void setUp() {

    }

    @Test
    public void testToExample() throws Exception {
        ConfigItemExample result = criteria.toExample();

    }

    @Test
    public void testAddCustomerCriteria() throws Exception {
        ConfigItemExample.Criteria result = criteria.addCustomerCriteria("condition");

    }

    @Test
    public void testAddCustomerCriteria2() throws Exception {
        ConfigItemExample.Criteria result = criteria.addCustomerCriteria("condition", Boolean.TRUE);

    }

    @Test
    public void testAddCustomerCriteria3() throws Exception {
        ConfigItemExample.Criteria result = criteria.addCustomerCriteria("condition", "value");

    }

    @Test
    public void testAndGroupCriterion() throws Exception {
        ConfigItemExample.CriterionGroup result = criteria.andGroupCriterion();

    }

    @Test
    public void testAndGroupCriterion2() throws Exception {
        ConfigItemExample.CriterionGroup result = criteria.andGroupCriterion(Boolean.TRUE);

    }

    @Test
    public void testIsValid() throws Exception {
        boolean result = criteria.isValid();

    }

    @Test
    public void testAndIdIsNull() throws Exception {
        ConfigItemExample.Criteria result = criteria.andIdIsNull();

    }

    @Test
    public void testAndIdIsNotNull() throws Exception {
        ConfigItemExample.Criteria result = criteria.andIdIsNotNull();

    }

    @Test
    public void testAndIdEqualTo() throws Exception {
        ConfigItemExample.Criteria result = criteria.andIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndIdEqualTo2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdNotEqualTo() throws Exception {
        ConfigItemExample.Criteria result = criteria.andIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndIdNotEqualTo2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdGreaterThan() throws Exception {
        ConfigItemExample.Criteria result = criteria.andIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testAndIdGreaterThan2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdGreaterThanOrEqualTo() throws Exception {
        ConfigItemExample.Criteria result = criteria.andIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndIdGreaterThanOrEqualTo2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdLessThan() throws Exception {
        ConfigItemExample.Criteria result = criteria.andIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testAndIdLessThan2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdLessThanOrEqualTo() throws Exception {
        ConfigItemExample.Criteria result = criteria.andIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndIdLessThanOrEqualTo2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdIn() throws Exception {
        ConfigItemExample.Criteria result = criteria.andIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndIdNotIn() throws Exception {
        ConfigItemExample.Criteria result = criteria.andIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndIdBetween() throws Exception {
        ConfigItemExample.Criteria result = criteria.andIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndIdNotBetween() throws Exception {
        ConfigItemExample.Criteria result = criteria.andIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndNameIsNull() throws Exception {
        ConfigItemExample.Criteria result = criteria.andNameIsNull();

    }

    @Test
    public void testAndNameIsNotNull() throws Exception {
        ConfigItemExample.Criteria result = criteria.andNameIsNotNull();

    }

    @Test
    public void testAndNameEqualTo() throws Exception {
        ConfigItemExample.Criteria result = criteria.andNameEqualTo("value");

    }

    @Test
    public void testAndNameEqualTo2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andNameEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameNotEqualTo() throws Exception {
        ConfigItemExample.Criteria result = criteria.andNameNotEqualTo("value");

    }

    @Test
    public void testAndNameNotEqualTo2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andNameNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameGreaterThan() throws Exception {
        ConfigItemExample.Criteria result = criteria.andNameGreaterThan("value");

    }

    @Test
    public void testAndNameGreaterThan2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andNameGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameGreaterThanOrEqualTo() throws Exception {
        ConfigItemExample.Criteria result = criteria.andNameGreaterThanOrEqualTo("value");

    }

    @Test
    public void testAndNameGreaterThanOrEqualTo2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andNameGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameLessThan() throws Exception {
        ConfigItemExample.Criteria result = criteria.andNameLessThan("value");

    }

    @Test
    public void testAndNameLessThan2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andNameLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameLessThanOrEqualTo() throws Exception {
        ConfigItemExample.Criteria result = criteria.andNameLessThanOrEqualTo("value");

    }

    @Test
    public void testAndNameLessThanOrEqualTo2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andNameLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameLike() throws Exception {
        ConfigItemExample.Criteria result = criteria.andNameLike("value");

    }

    @Test
    public void testAndNameLike2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andNameLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameLikeLeft() throws Exception {
        ConfigItemExample.Criteria result = criteria.andNameLikeLeft("value");

    }

    @Test
    public void testAndNameLikeLeft2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andNameLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameLikeRight() throws Exception {
        ConfigItemExample.Criteria result = criteria.andNameLikeRight("value");

    }

    @Test
    public void testAndNameLikeRight2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andNameLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameLikeBoth() throws Exception {
        ConfigItemExample.Criteria result = criteria.andNameLikeBoth("value");

    }

    @Test
    public void testAndNameLikeBoth2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andNameLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameNotLike() throws Exception {
        ConfigItemExample.Criteria result = criteria.andNameNotLike("value");

    }

    @Test
    public void testAndNameNotLike2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andNameNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameNotLikeLeft() throws Exception {
        ConfigItemExample.Criteria result = criteria.andNameNotLikeLeft("value");

    }

    @Test
    public void testAndNameNotLikeLeft2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andNameNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameNotLikeRight() throws Exception {
        ConfigItemExample.Criteria result = criteria.andNameNotLikeRight("value");

    }

    @Test
    public void testAndNameNotLikeRight2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andNameNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameNotLikeBoth() throws Exception {
        ConfigItemExample.Criteria result = criteria.andNameNotLikeBoth("value");

    }

    @Test
    public void testAndNameNotLikeBoth2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andNameNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameIn() throws Exception {
        ConfigItemExample.Criteria result = criteria.andNameIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndNameIn2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andNameIn(Arrays.<String>asList("String"), Boolean.TRUE);

    }

    @Test
    public void testAndNameNotIn() throws Exception {
        ConfigItemExample.Criteria result = criteria.andNameNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndNameBetween() throws Exception {
        ConfigItemExample.Criteria result = criteria.andNameBetween("value1", "value2");

    }

    @Test
    public void testAndNameNotBetween() throws Exception {
        ConfigItemExample.Criteria result = criteria.andNameNotBetween("value1", "value2");

    }

    @Test
    public void testAndMemoIsNull() throws Exception {
        ConfigItemExample.Criteria result = criteria.andMemoIsNull();

    }

    @Test
    public void testAndMemoIsNotNull() throws Exception {
        ConfigItemExample.Criteria result = criteria.andMemoIsNotNull();

    }

    @Test
    public void testAndMemoEqualTo() throws Exception {
        ConfigItemExample.Criteria result = criteria.andMemoEqualTo("value");

    }

    @Test
    public void testAndMemoEqualTo2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andMemoEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoNotEqualTo() throws Exception {
        ConfigItemExample.Criteria result = criteria.andMemoNotEqualTo("value");

    }

    @Test
    public void testAndMemoNotEqualTo2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andMemoNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoGreaterThan() throws Exception {
        ConfigItemExample.Criteria result = criteria.andMemoGreaterThan("value");

    }

    @Test
    public void testAndMemoGreaterThan2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andMemoGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoGreaterThanOrEqualTo() throws Exception {
        ConfigItemExample.Criteria result = criteria.andMemoGreaterThanOrEqualTo("value");

    }

    @Test
    public void testAndMemoGreaterThanOrEqualTo2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andMemoGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoLessThan() throws Exception {
        ConfigItemExample.Criteria result = criteria.andMemoLessThan("value");

    }

    @Test
    public void testAndMemoLessThan2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andMemoLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoLessThanOrEqualTo() throws Exception {
        ConfigItemExample.Criteria result = criteria.andMemoLessThanOrEqualTo("value");

    }

    @Test
    public void testAndMemoLessThanOrEqualTo2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andMemoLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoLike() throws Exception {
        ConfigItemExample.Criteria result = criteria.andMemoLike("value");

    }

    @Test
    public void testAndMemoLike2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andMemoLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoLikeLeft() throws Exception {
        ConfigItemExample.Criteria result = criteria.andMemoLikeLeft("value");

    }

    @Test
    public void testAndMemoLikeLeft2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andMemoLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoLikeRight() throws Exception {
        ConfigItemExample.Criteria result = criteria.andMemoLikeRight("value");

    }

    @Test
    public void testAndMemoLikeRight2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andMemoLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoLikeBoth() throws Exception {
        ConfigItemExample.Criteria result = criteria.andMemoLikeBoth("value");

    }

    @Test
    public void testAndMemoLikeBoth2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andMemoLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoNotLike() throws Exception {
        ConfigItemExample.Criteria result = criteria.andMemoNotLike("value");

    }

    @Test
    public void testAndMemoNotLike2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andMemoNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoNotLikeLeft() throws Exception {
        ConfigItemExample.Criteria result = criteria.andMemoNotLikeLeft("value");

    }

    @Test
    public void testAndMemoNotLikeLeft2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andMemoNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoNotLikeRight() throws Exception {
        ConfigItemExample.Criteria result = criteria.andMemoNotLikeRight("value");

    }

    @Test
    public void testAndMemoNotLikeRight2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andMemoNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoNotLikeBoth() throws Exception {
        ConfigItemExample.Criteria result = criteria.andMemoNotLikeBoth("value");

    }

    @Test
    public void testAndMemoNotLikeBoth2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andMemoNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndMemoIn() throws Exception {
        ConfigItemExample.Criteria result = criteria.andMemoIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndMemoNotIn() throws Exception {
        ConfigItemExample.Criteria result = criteria.andMemoNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndMemoBetween() throws Exception {
        ConfigItemExample.Criteria result = criteria.andMemoBetween("value1", "value2");

    }

    @Test
    public void testAndMemoNotBetween() throws Exception {
        ConfigItemExample.Criteria result = criteria.andMemoNotBetween("value1", "value2");

    }

    @Test
    public void testAndProductIdIsNull() throws Exception {
        ConfigItemExample.Criteria result = criteria.andProductIdIsNull();

    }

    @Test
    public void testAndProductIdIsNotNull() throws Exception {
        ConfigItemExample.Criteria result = criteria.andProductIdIsNotNull();

    }

    @Test
    public void testAndProductIdEqualTo() throws Exception {
        ConfigItemExample.Criteria result = criteria.andProductIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndProductIdEqualTo2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andProductIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProductIdNotEqualTo() throws Exception {
        ConfigItemExample.Criteria result = criteria.andProductIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndProductIdNotEqualTo2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andProductIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProductIdGreaterThan() throws Exception {
        ConfigItemExample.Criteria result = criteria.andProductIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testAndProductIdGreaterThan2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andProductIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProductIdGreaterThanOrEqualTo() throws Exception {
        ConfigItemExample.Criteria result = criteria.andProductIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndProductIdGreaterThanOrEqualTo2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andProductIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProductIdLessThan() throws Exception {
        ConfigItemExample.Criteria result = criteria.andProductIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testAndProductIdLessThan2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andProductIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProductIdLessThanOrEqualTo() throws Exception {
        ConfigItemExample.Criteria result = criteria.andProductIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndProductIdLessThanOrEqualTo2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andProductIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProductIdIn() throws Exception {
        ConfigItemExample.Criteria result = criteria.andProductIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndProductIdNotIn() throws Exception {
        ConfigItemExample.Criteria result = criteria.andProductIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndProductIdBetween() throws Exception {
        ConfigItemExample.Criteria result = criteria.andProductIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndProductIdNotBetween() throws Exception {
        ConfigItemExample.Criteria result = criteria.andProductIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndProjectIdIsNull() throws Exception {
        ConfigItemExample.Criteria result = criteria.andProjectIdIsNull();

    }

    @Test
    public void testAndProjectIdIsNotNull() throws Exception {
        ConfigItemExample.Criteria result = criteria.andProjectIdIsNotNull();

    }

    @Test
    public void testAndProjectIdEqualTo() throws Exception {
        ConfigItemExample.Criteria result = criteria.andProjectIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndProjectIdEqualTo2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andProjectIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProjectIdNotEqualTo() throws Exception {
        ConfigItemExample.Criteria result = criteria.andProjectIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndProjectIdNotEqualTo2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andProjectIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProjectIdGreaterThan() throws Exception {
        ConfigItemExample.Criteria result = criteria.andProjectIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testAndProjectIdGreaterThan2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andProjectIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProjectIdGreaterThanOrEqualTo() throws Exception {
        ConfigItemExample.Criteria result = criteria.andProjectIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndProjectIdGreaterThanOrEqualTo2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andProjectIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProjectIdLessThan() throws Exception {
        ConfigItemExample.Criteria result = criteria.andProjectIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testAndProjectIdLessThan2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andProjectIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProjectIdLessThanOrEqualTo() throws Exception {
        ConfigItemExample.Criteria result = criteria.andProjectIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndProjectIdLessThanOrEqualTo2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andProjectIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProjectIdIn() throws Exception {
        ConfigItemExample.Criteria result = criteria.andProjectIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndProjectIdNotIn() throws Exception {
        ConfigItemExample.Criteria result = criteria.andProjectIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndProjectIdBetween() throws Exception {
        ConfigItemExample.Criteria result = criteria.andProjectIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndProjectIdNotBetween() throws Exception {
        ConfigItemExample.Criteria result = criteria.andProjectIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndEnvironmentIdIsNull() throws Exception {
        ConfigItemExample.Criteria result = criteria.andEnvironmentIdIsNull();

    }

    @Test
    public void testAndEnvironmentIdIsNotNull() throws Exception {
        ConfigItemExample.Criteria result = criteria.andEnvironmentIdIsNotNull();

    }

    @Test
    public void testAndEnvironmentIdEqualTo() throws Exception {
        ConfigItemExample.Criteria result = criteria.andEnvironmentIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndEnvironmentIdEqualTo2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andEnvironmentIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndEnvironmentIdNotEqualTo() throws Exception {
        ConfigItemExample.Criteria result = criteria.andEnvironmentIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndEnvironmentIdNotEqualTo2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andEnvironmentIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndEnvironmentIdGreaterThan() throws Exception {
        ConfigItemExample.Criteria result = criteria.andEnvironmentIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testAndEnvironmentIdGreaterThan2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andEnvironmentIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndEnvironmentIdGreaterThanOrEqualTo() throws Exception {
        ConfigItemExample.Criteria result = criteria.andEnvironmentIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndEnvironmentIdGreaterThanOrEqualTo2() throws Exception {
        ConfigItemExample.Criteria result =
                criteria.andEnvironmentIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndEnvironmentIdLessThan() throws Exception {
        ConfigItemExample.Criteria result = criteria.andEnvironmentIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testAndEnvironmentIdLessThan2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andEnvironmentIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndEnvironmentIdLessThanOrEqualTo() throws Exception {
        ConfigItemExample.Criteria result = criteria.andEnvironmentIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndEnvironmentIdLessThanOrEqualTo2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andEnvironmentIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndEnvironmentIdIn() throws Exception {
        ConfigItemExample.Criteria result = criteria.andEnvironmentIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndEnvironmentIdNotIn() throws Exception {
        ConfigItemExample.Criteria result = criteria.andEnvironmentIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndEnvironmentIdBetween() throws Exception {
        ConfigItemExample.Criteria result = criteria.andEnvironmentIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndEnvironmentIdNotBetween() throws Exception {
        ConfigItemExample.Criteria result = criteria.andEnvironmentIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndVersionIdIsNull() throws Exception {
        ConfigItemExample.Criteria result = criteria.andVersionIdIsNull();

    }

    @Test
    public void testAndVersionIdIsNotNull() throws Exception {
        ConfigItemExample.Criteria result = criteria.andVersionIdIsNotNull();

    }

    @Test
    public void testAndVersionIdEqualTo() throws Exception {
        ConfigItemExample.Criteria result = criteria.andVersionIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndVersionIdEqualTo2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andVersionIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndVersionIdNotEqualTo() throws Exception {
        ConfigItemExample.Criteria result = criteria.andVersionIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndVersionIdNotEqualTo2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andVersionIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndVersionIdGreaterThan() throws Exception {
        ConfigItemExample.Criteria result = criteria.andVersionIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testAndVersionIdGreaterThan2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andVersionIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndVersionIdGreaterThanOrEqualTo() throws Exception {
        ConfigItemExample.Criteria result = criteria.andVersionIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndVersionIdGreaterThanOrEqualTo2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andVersionIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndVersionIdLessThan() throws Exception {
        ConfigItemExample.Criteria result = criteria.andVersionIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testAndVersionIdLessThan2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andVersionIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndVersionIdLessThanOrEqualTo() throws Exception {
        ConfigItemExample.Criteria result = criteria.andVersionIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndVersionIdLessThanOrEqualTo2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andVersionIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndVersionIdIn() throws Exception {
        ConfigItemExample.Criteria result = criteria.andVersionIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndVersionIdNotIn() throws Exception {
        ConfigItemExample.Criteria result = criteria.andVersionIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndVersionIdBetween() throws Exception {
        ConfigItemExample.Criteria result = criteria.andVersionIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndVersionIdNotBetween() throws Exception {
        ConfigItemExample.Criteria result = criteria.andVersionIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndGroupIdIsNull() throws Exception {
        ConfigItemExample.Criteria result = criteria.andGroupIdIsNull();

    }

    @Test
    public void testAndGroupIdIsNotNull() throws Exception {
        ConfigItemExample.Criteria result = criteria.andGroupIdIsNotNull();

    }

    @Test
    public void testAndGroupIdEqualTo() throws Exception {
        ConfigItemExample.Criteria result = criteria.andGroupIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndGroupIdEqualTo2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andGroupIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndGroupIdNotEqualTo() throws Exception {
        ConfigItemExample.Criteria result = criteria.andGroupIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndGroupIdNotEqualTo2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andGroupIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndGroupIdGreaterThan() throws Exception {
        ConfigItemExample.Criteria result = criteria.andGroupIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testAndGroupIdGreaterThan2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andGroupIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndGroupIdGreaterThanOrEqualTo() throws Exception {
        ConfigItemExample.Criteria result = criteria.andGroupIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndGroupIdGreaterThanOrEqualTo2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andGroupIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndGroupIdLessThan() throws Exception {
        ConfigItemExample.Criteria result = criteria.andGroupIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testAndGroupIdLessThan2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andGroupIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndGroupIdLessThanOrEqualTo() throws Exception {
        ConfigItemExample.Criteria result = criteria.andGroupIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndGroupIdLessThanOrEqualTo2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andGroupIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndGroupIdIn() throws Exception {
        ConfigItemExample.Criteria result = criteria.andGroupIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndGroupIdNotIn() throws Exception {
        ConfigItemExample.Criteria result = criteria.andGroupIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndGroupIdBetween() throws Exception {
        ConfigItemExample.Criteria result = criteria.andGroupIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndGroupIdNotBetween() throws Exception {
        ConfigItemExample.Criteria result = criteria.andGroupIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndTypeIdIsNull() throws Exception {
        ConfigItemExample.Criteria result = criteria.andTypeIdIsNull();

    }

    @Test
    public void testAndTypeIdIsNotNull() throws Exception {
        ConfigItemExample.Criteria result = criteria.andTypeIdIsNotNull();

    }

    @Test
    public void testAndTypeIdEqualTo() throws Exception {
        ConfigItemExample.Criteria result = criteria.andTypeIdEqualTo(Integer.valueOf(0));

    }

    @Test
    public void testAndTypeIdEqualTo2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andTypeIdEqualTo(Integer.valueOf(0), Boolean.TRUE);

    }

    @Test
    public void testAndTypeIdNotEqualTo() throws Exception {
        ConfigItemExample.Criteria result = criteria.andTypeIdNotEqualTo(Integer.valueOf(0));

    }

    @Test
    public void testAndTypeIdNotEqualTo2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andTypeIdNotEqualTo(Integer.valueOf(0), Boolean.TRUE);

    }

    @Test
    public void testAndTypeIdGreaterThan() throws Exception {
        ConfigItemExample.Criteria result = criteria.andTypeIdGreaterThan(Integer.valueOf(0));

    }

    @Test
    public void testAndTypeIdGreaterThan2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andTypeIdGreaterThan(Integer.valueOf(0), Boolean.TRUE);

    }

    @Test
    public void testAndTypeIdGreaterThanOrEqualTo() throws Exception {
        ConfigItemExample.Criteria result = criteria.andTypeIdGreaterThanOrEqualTo(Integer.valueOf(0));

    }

    @Test
    public void testAndTypeIdGreaterThanOrEqualTo2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andTypeIdGreaterThanOrEqualTo(Integer.valueOf(0), Boolean.TRUE);

    }

    @Test
    public void testAndTypeIdLessThan() throws Exception {
        ConfigItemExample.Criteria result = criteria.andTypeIdLessThan(Integer.valueOf(0));

    }

    @Test
    public void testAndTypeIdLessThan2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andTypeIdLessThan(Integer.valueOf(0), Boolean.TRUE);

    }

    @Test
    public void testAndTypeIdLessThanOrEqualTo() throws Exception {
        ConfigItemExample.Criteria result = criteria.andTypeIdLessThanOrEqualTo(Integer.valueOf(0));

    }

    @Test
    public void testAndTypeIdLessThanOrEqualTo2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andTypeIdLessThanOrEqualTo(Integer.valueOf(0), Boolean.TRUE);

    }

    @Test
    public void testAndTypeIdIn() throws Exception {
        ConfigItemExample.Criteria result = criteria.andTypeIdIn(Arrays.<Integer>asList(Integer.valueOf(0)));

    }

    @Test
    public void testAndTypeIdNotIn() throws Exception {
        ConfigItemExample.Criteria result = criteria.andTypeIdNotIn(Arrays.<Integer>asList(Integer.valueOf(0)));

    }

    @Test
    public void testAndTypeIdBetween() throws Exception {
        ConfigItemExample.Criteria result = criteria.andTypeIdBetween(Integer.valueOf(0), Integer.valueOf(0));

    }

    @Test
    public void testAndTypeIdNotBetween() throws Exception {
        ConfigItemExample.Criteria result = criteria.andTypeIdNotBetween(Integer.valueOf(0), Integer.valueOf(0));

    }

    @Test
    public void testAndValIsNull() throws Exception {
        ConfigItemExample.Criteria result = criteria.andValIsNull();

    }

    @Test
    public void testAndValIsNotNull() throws Exception {
        ConfigItemExample.Criteria result = criteria.andValIsNotNull();

    }

    @Test
    public void testAndValEqualTo() throws Exception {
        ConfigItemExample.Criteria result = criteria.andValEqualTo("value");

    }

    @Test
    public void testAndValEqualTo2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andValEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndValNotEqualTo() throws Exception {
        ConfigItemExample.Criteria result = criteria.andValNotEqualTo("value");

    }

    @Test
    public void testAndValNotEqualTo2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andValNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndValGreaterThan() throws Exception {
        ConfigItemExample.Criteria result = criteria.andValGreaterThan("value");

    }

    @Test
    public void testAndValGreaterThan2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andValGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndValGreaterThanOrEqualTo() throws Exception {
        ConfigItemExample.Criteria result = criteria.andValGreaterThanOrEqualTo("value");

    }

    @Test
    public void testAndValGreaterThanOrEqualTo2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andValGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndValLessThan() throws Exception {
        ConfigItemExample.Criteria result = criteria.andValLessThan("value");

    }

    @Test
    public void testAndValLessThan2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andValLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndValLessThanOrEqualTo() throws Exception {
        ConfigItemExample.Criteria result = criteria.andValLessThanOrEqualTo("value");

    }

    @Test
    public void testAndValLessThanOrEqualTo2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andValLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndValLike() throws Exception {
        ConfigItemExample.Criteria result = criteria.andValLike("value");

    }

    @Test
    public void testAndValLike2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andValLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndValLikeLeft() throws Exception {
        ConfigItemExample.Criteria result = criteria.andValLikeLeft("value");

    }

    @Test
    public void testAndValLikeLeft2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andValLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndValLikeRight() throws Exception {
        ConfigItemExample.Criteria result = criteria.andValLikeRight("value");

    }

    @Test
    public void testAndValLikeRight2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andValLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndValLikeBoth() throws Exception {
        ConfigItemExample.Criteria result = criteria.andValLikeBoth("value");

    }

    @Test
    public void testAndValLikeBoth2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andValLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndValNotLike() throws Exception {
        ConfigItemExample.Criteria result = criteria.andValNotLike("value");

    }

    @Test
    public void testAndValNotLike2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andValNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndValNotLikeLeft() throws Exception {
        ConfigItemExample.Criteria result = criteria.andValNotLikeLeft("value");

    }

    @Test
    public void testAndValNotLikeLeft2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andValNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndValNotLikeRight() throws Exception {
        ConfigItemExample.Criteria result = criteria.andValNotLikeRight("value");

    }

    @Test
    public void testAndValNotLikeRight2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andValNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndValNotLikeBoth() throws Exception {
        ConfigItemExample.Criteria result = criteria.andValNotLikeBoth("value");

    }

    @Test
    public void testAndValNotLikeBoth2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andValNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndValIn() throws Exception {
        ConfigItemExample.Criteria result = criteria.andValIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndValNotIn() throws Exception {
        ConfigItemExample.Criteria result = criteria.andValNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndValBetween() throws Exception {
        ConfigItemExample.Criteria result = criteria.andValBetween("value1", "value2");

    }

    @Test
    public void testAndValNotBetween() throws Exception {
        ConfigItemExample.Criteria result = criteria.andValNotBetween("value1", "value2");

    }

    @Test
    public void testAndShareableIsNull() throws Exception {
        ConfigItemExample.Criteria result = criteria.andShareableIsNull();

    }

    @Test
    public void testAndShareableIsNotNull() throws Exception {
        ConfigItemExample.Criteria result = criteria.andShareableIsNotNull();

    }

    @Test
    public void testAndShareableEqualTo() throws Exception {
        ConfigItemExample.Criteria result = criteria.andShareableEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndShareableEqualTo2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andShareableEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndShareableNotEqualTo() throws Exception {
        ConfigItemExample.Criteria result = criteria.andShareableNotEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndShareableNotEqualTo2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andShareableNotEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndShareableGreaterThan() throws Exception {
        ConfigItemExample.Criteria result = criteria.andShareableGreaterThan(Byte.valueOf("00110"));

    }

    @Test
    public void testAndShareableGreaterThan2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andShareableGreaterThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndShareableGreaterThanOrEqualTo() throws Exception {
        ConfigItemExample.Criteria result = criteria.andShareableGreaterThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndShareableGreaterThanOrEqualTo2() throws Exception {
        ConfigItemExample.Criteria result =
                criteria.andShareableGreaterThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndShareableLessThan() throws Exception {
        ConfigItemExample.Criteria result = criteria.andShareableLessThan(Byte.valueOf("00110"));

    }

    @Test
    public void testAndShareableLessThan2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andShareableLessThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndShareableLessThanOrEqualTo() throws Exception {
        ConfigItemExample.Criteria result = criteria.andShareableLessThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndShareableLessThanOrEqualTo2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andShareableLessThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndShareableIn() throws Exception {
        ConfigItemExample.Criteria result = criteria.andShareableIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testAndShareableNotIn() throws Exception {
        ConfigItemExample.Criteria result = criteria.andShareableNotIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testAndShareableBetween() throws Exception {
        ConfigItemExample.Criteria result = criteria.andShareableBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testAndShareableNotBetween() throws Exception {
        ConfigItemExample.Criteria result =
                criteria.andShareableNotBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testAndRefIsNull() throws Exception {
        ConfigItemExample.Criteria result = criteria.andRefIsNull();

    }

    @Test
    public void testAndRefIsNotNull() throws Exception {
        ConfigItemExample.Criteria result = criteria.andRefIsNotNull();

    }

    @Test
    public void testAndRefEqualTo() throws Exception {
        ConfigItemExample.Criteria result = criteria.andRefEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndRefEqualTo2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andRefEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndRefNotEqualTo() throws Exception {
        ConfigItemExample.Criteria result = criteria.andRefNotEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndRefNotEqualTo2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andRefNotEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndRefGreaterThan() throws Exception {
        ConfigItemExample.Criteria result = criteria.andRefGreaterThan(Byte.valueOf("00110"));

    }

    @Test
    public void testAndRefGreaterThan2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andRefGreaterThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndRefGreaterThanOrEqualTo() throws Exception {
        ConfigItemExample.Criteria result = criteria.andRefGreaterThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndRefGreaterThanOrEqualTo2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andRefGreaterThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndRefLessThan() throws Exception {
        ConfigItemExample.Criteria result = criteria.andRefLessThan(Byte.valueOf("00110"));

    }

    @Test
    public void testAndRefLessThan2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andRefLessThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndRefLessThanOrEqualTo() throws Exception {
        ConfigItemExample.Criteria result = criteria.andRefLessThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndRefLessThanOrEqualTo2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andRefLessThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndRefIn() throws Exception {
        ConfigItemExample.Criteria result = criteria.andRefIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testAndRefNotIn() throws Exception {
        ConfigItemExample.Criteria result = criteria.andRefNotIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testAndRefBetween() throws Exception {
        ConfigItemExample.Criteria result = criteria.andRefBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testAndRefNotBetween() throws Exception {
        ConfigItemExample.Criteria result = criteria.andRefNotBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testAndDeletedIsNull() throws Exception {
        ConfigItemExample.Criteria result = criteria.andDeletedIsNull();

    }

    @Test
    public void testAndDeletedIsNotNull() throws Exception {
        ConfigItemExample.Criteria result = criteria.andDeletedIsNotNull();

    }

    @Test
    public void testAndDeletedEqualTo() throws Exception {
        ConfigItemExample.Criteria result = criteria.andDeletedEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndDeletedEqualTo2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andDeletedEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndDeletedNotEqualTo() throws Exception {
        ConfigItemExample.Criteria result = criteria.andDeletedNotEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndDeletedNotEqualTo2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andDeletedNotEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndDeletedGreaterThan() throws Exception {
        ConfigItemExample.Criteria result = criteria.andDeletedGreaterThan(Byte.valueOf("00110"));

    }

    @Test
    public void testAndDeletedGreaterThan2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andDeletedGreaterThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndDeletedGreaterThanOrEqualTo() throws Exception {
        ConfigItemExample.Criteria result = criteria.andDeletedGreaterThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndDeletedGreaterThanOrEqualTo2() throws Exception {
        ConfigItemExample.Criteria result =
                criteria.andDeletedGreaterThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndDeletedLessThan() throws Exception {
        ConfigItemExample.Criteria result = criteria.andDeletedLessThan(Byte.valueOf("00110"));

    }

    @Test
    public void testAndDeletedLessThan2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andDeletedLessThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndDeletedLessThanOrEqualTo() throws Exception {
        ConfigItemExample.Criteria result = criteria.andDeletedLessThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndDeletedLessThanOrEqualTo2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andDeletedLessThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndDeletedIn() throws Exception {
        ConfigItemExample.Criteria result = criteria.andDeletedIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testAndDeletedNotIn() throws Exception {
        ConfigItemExample.Criteria result = criteria.andDeletedNotIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testAndDeletedBetween() throws Exception {
        ConfigItemExample.Criteria result = criteria.andDeletedBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testAndDeletedNotBetween() throws Exception {
        ConfigItemExample.Criteria result = criteria.andDeletedNotBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testAndUpdateTimeIsNull() throws Exception {
        ConfigItemExample.Criteria result = criteria.andUpdateTimeIsNull();

    }

    @Test
    public void testAndUpdateTimeIsNotNull() throws Exception {
        ConfigItemExample.Criteria result = criteria.andUpdateTimeIsNotNull();

    }

    @Test
    public void testAndUpdateTimeEqualTo() throws Exception {
        ConfigItemExample.Criteria result =
                criteria.andUpdateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 8).getTime());

    }

    @Test
    public void testAndUpdateTimeEqualTo2() throws Exception {
        ConfigItemExample.Criteria result =
                criteria.andUpdateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 8).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndUpdateTimeNotEqualTo() throws Exception {
        ConfigItemExample.Criteria result =
                criteria.andUpdateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 8).getTime());

    }

    @Test
    public void testAndUpdateTimeNotEqualTo2() throws Exception {
        ConfigItemExample.Criteria result =
                criteria.andUpdateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 8).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndUpdateTimeGreaterThan() throws Exception {
        ConfigItemExample.Criteria result =
                criteria.andUpdateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 8).getTime());

    }

    @Test
    public void testAndUpdateTimeGreaterThan2() throws Exception {
        ConfigItemExample.Criteria result =
                criteria.andUpdateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 8).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndUpdateTimeGreaterThanOrEqualTo() throws Exception {
        ConfigItemExample.Criteria result = criteria.andUpdateTimeGreaterThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 8).getTime());

    }

    @Test
    public void testAndUpdateTimeGreaterThanOrEqualTo2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andUpdateTimeGreaterThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 8).getTime(), Boolean.TRUE);

    }

    @Test
    public void testAndUpdateTimeLessThan() throws Exception {
        ConfigItemExample.Criteria result =
                criteria.andUpdateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 8).getTime());

    }

    @Test
    public void testAndUpdateTimeLessThan2() throws Exception {
        ConfigItemExample.Criteria result =
                criteria.andUpdateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 8).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndUpdateTimeLessThanOrEqualTo() throws Exception {
        ConfigItemExample.Criteria result = criteria.andUpdateTimeLessThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 8).getTime());

    }

    @Test
    public void testAndUpdateTimeLessThanOrEqualTo2() throws Exception {
        ConfigItemExample.Criteria result =
                criteria.andUpdateTimeLessThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 8).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndUpdateTimeIn() throws Exception {
        ConfigItemExample.Criteria result = criteria.andUpdateTimeIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 8).getTime()));

    }

    @Test
    public void testAndUpdateTimeNotIn() throws Exception {
        ConfigItemExample.Criteria result = criteria.andUpdateTimeNotIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 8).getTime()));

    }

    @Test
    public void testAndUpdateTimeBetween() throws Exception {
        ConfigItemExample.Criteria result =
                criteria.andUpdateTimeBetween(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 8).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 8).getTime());

    }

    @Test
    public void testAndUpdateTimeNotBetween() throws Exception {
        ConfigItemExample.Criteria result =
                criteria.andUpdateTimeNotBetween(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 8).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 8).getTime());

    }

    @Test
    public void testAndCreateTimeIsNull() throws Exception {
        ConfigItemExample.Criteria result = criteria.andCreateTimeIsNull();

    }

    @Test
    public void testAndCreateTimeIsNotNull() throws Exception {
        ConfigItemExample.Criteria result = criteria.andCreateTimeIsNotNull();

    }

    @Test
    public void testAndCreateTimeEqualTo() throws Exception {
        ConfigItemExample.Criteria result =
                criteria.andCreateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 8).getTime());

    }

    @Test
    public void testAndCreateTimeEqualTo2() throws Exception {
        ConfigItemExample.Criteria result =
                criteria.andCreateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 8).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeNotEqualTo() throws Exception {
        ConfigItemExample.Criteria result =
                criteria.andCreateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 8).getTime());

    }

    @Test
    public void testAndCreateTimeNotEqualTo2() throws Exception {
        ConfigItemExample.Criteria result =
                criteria.andCreateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 8).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeGreaterThan() throws Exception {
        ConfigItemExample.Criteria result =
                criteria.andCreateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 8).getTime());

    }

    @Test
    public void testAndCreateTimeGreaterThan2() throws Exception {
        ConfigItemExample.Criteria result =
                criteria.andCreateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 8).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeGreaterThanOrEqualTo() throws Exception {
        ConfigItemExample.Criteria result = criteria.andCreateTimeGreaterThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 8).getTime());

    }

    @Test
    public void testAndCreateTimeGreaterThanOrEqualTo2() throws Exception {
        ConfigItemExample.Criteria result = criteria.andCreateTimeGreaterThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 8).getTime(), Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeLessThan() throws Exception {
        ConfigItemExample.Criteria result =
                criteria.andCreateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 8).getTime());

    }

    @Test
    public void testAndCreateTimeLessThan2() throws Exception {
        ConfigItemExample.Criteria result =
                criteria.andCreateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 8).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeLessThanOrEqualTo() throws Exception {
        ConfigItemExample.Criteria result = criteria.andCreateTimeLessThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 8).getTime());

    }

    @Test
    public void testAndCreateTimeLessThanOrEqualTo2() throws Exception {
        ConfigItemExample.Criteria result =
                criteria.andCreateTimeLessThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 8).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeIn() throws Exception {
        ConfigItemExample.Criteria result = criteria.andCreateTimeIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 8).getTime()));

    }

    @Test
    public void testAndCreateTimeNotIn() throws Exception {
        ConfigItemExample.Criteria result = criteria.andCreateTimeNotIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 8).getTime()));

    }

    @Test
    public void testAndCreateTimeBetween() throws Exception {
        ConfigItemExample.Criteria result =
                criteria.andCreateTimeBetween(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 8).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 8).getTime());

    }

    @Test
    public void testAndCreateTimeNotBetween() throws Exception {
        ConfigItemExample.Criteria result =
                criteria.andCreateTimeNotBetween(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 8).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 8).getTime());

    }
}


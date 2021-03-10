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

public class EnvironmentUserExampleCriteriaTest {

    EnvironmentUserExample.Criteria criteria = EnvironmentUserExample.newBuilder().build().createCriteria();

    @Before
    public void setUp() {
    }

    @Test
    public void testToExample() throws Exception {
        EnvironmentUserExample result = criteria.toExample();

    }

    @Test
    public void testAddCustomerCriteria() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.addCustomerCriteria("condition");

    }

    @Test
    public void testAddCustomerCriteria2() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.addCustomerCriteria("condition", Boolean.TRUE);

    }

    @Test
    public void testAddCustomerCriteria3() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.addCustomerCriteria("condition", "value");

    }

    @Test
    public void testAndGroupCriterion() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criteria.andGroupCriterion();

    }

    @Test
    public void testAndGroupCriterion2() throws Exception {
        EnvironmentUserExample.CriterionGroup result = criteria.andGroupCriterion(Boolean.TRUE);

    }

    @Test
    public void testIsValid() throws Exception {
        boolean result = criteria.isValid();

    }

    @Test
    public void testAndIdIsNull() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andIdIsNull();

    }

    @Test
    public void testAndIdIsNotNull() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andIdIsNotNull();

    }

    @Test
    public void testAndIdEqualTo() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndIdEqualTo2() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdNotEqualTo() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndIdNotEqualTo2() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdGreaterThan() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testAndIdGreaterThan2() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdGreaterThanOrEqualTo() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndIdGreaterThanOrEqualTo2() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdLessThan() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testAndIdLessThan2() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdLessThanOrEqualTo() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndIdLessThanOrEqualTo2() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdIn() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndIdNotIn() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndIdBetween() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndIdNotBetween() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndProductIdIsNull() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andProductIdIsNull();

    }

    @Test
    public void testAndProductIdIsNotNull() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andProductIdIsNotNull();

    }

    @Test
    public void testAndProductIdEqualTo() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andProductIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndProductIdEqualTo2() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andProductIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProductIdNotEqualTo() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andProductIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndProductIdNotEqualTo2() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andProductIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProductIdGreaterThan() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andProductIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testAndProductIdGreaterThan2() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andProductIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProductIdGreaterThanOrEqualTo() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andProductIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndProductIdGreaterThanOrEqualTo2() throws Exception {
        EnvironmentUserExample.Criteria result =
                criteria.andProductIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProductIdLessThan() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andProductIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testAndProductIdLessThan2() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andProductIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProductIdLessThanOrEqualTo() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andProductIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndProductIdLessThanOrEqualTo2() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andProductIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProductIdIn() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andProductIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndProductIdNotIn() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andProductIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndProductIdBetween() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andProductIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndProductIdNotBetween() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andProductIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndProjectIdIsNull() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andProjectIdIsNull();

    }

    @Test
    public void testAndProjectIdIsNotNull() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andProjectIdIsNotNull();

    }

    @Test
    public void testAndProjectIdEqualTo() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andProjectIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndProjectIdEqualTo2() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andProjectIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProjectIdNotEqualTo() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andProjectIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndProjectIdNotEqualTo2() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andProjectIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProjectIdGreaterThan() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andProjectIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testAndProjectIdGreaterThan2() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andProjectIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProjectIdGreaterThanOrEqualTo() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andProjectIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndProjectIdGreaterThanOrEqualTo2() throws Exception {
        EnvironmentUserExample.Criteria result =
                criteria.andProjectIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProjectIdLessThan() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andProjectIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testAndProjectIdLessThan2() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andProjectIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProjectIdLessThanOrEqualTo() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andProjectIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndProjectIdLessThanOrEqualTo2() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andProjectIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndProjectIdIn() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andProjectIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndProjectIdNotIn() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andProjectIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndProjectIdBetween() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andProjectIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndProjectIdNotBetween() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andProjectIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndEnvironmentIdIsNull() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andEnvironmentIdIsNull();

    }

    @Test
    public void testAndEnvironmentIdIsNotNull() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andEnvironmentIdIsNotNull();

    }

    @Test
    public void testAndEnvironmentIdEqualTo() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andEnvironmentIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndEnvironmentIdEqualTo2() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andEnvironmentIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndEnvironmentIdNotEqualTo() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andEnvironmentIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndEnvironmentIdNotEqualTo2() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andEnvironmentIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndEnvironmentIdGreaterThan() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andEnvironmentIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testAndEnvironmentIdGreaterThan2() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andEnvironmentIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndEnvironmentIdGreaterThanOrEqualTo() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andEnvironmentIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndEnvironmentIdGreaterThanOrEqualTo2() throws Exception {
        EnvironmentUserExample.Criteria result =
                criteria.andEnvironmentIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndEnvironmentIdLessThan() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andEnvironmentIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testAndEnvironmentIdLessThan2() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andEnvironmentIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndEnvironmentIdLessThanOrEqualTo() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andEnvironmentIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndEnvironmentIdLessThanOrEqualTo2() throws Exception {
        EnvironmentUserExample.Criteria result =
                criteria.andEnvironmentIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndEnvironmentIdIn() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andEnvironmentIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndEnvironmentIdNotIn() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andEnvironmentIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndEnvironmentIdBetween() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andEnvironmentIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndEnvironmentIdNotBetween() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andEnvironmentIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndUserIdIsNull() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andUserIdIsNull();

    }

    @Test
    public void testAndUserIdIsNotNull() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andUserIdIsNotNull();

    }

    @Test
    public void testAndUserIdEqualTo() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andUserIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndUserIdEqualTo2() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andUserIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndUserIdNotEqualTo() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andUserIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndUserIdNotEqualTo2() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andUserIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndUserIdGreaterThan() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andUserIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testAndUserIdGreaterThan2() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andUserIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndUserIdGreaterThanOrEqualTo() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andUserIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndUserIdGreaterThanOrEqualTo2() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andUserIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndUserIdLessThan() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andUserIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testAndUserIdLessThan2() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andUserIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndUserIdLessThanOrEqualTo() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andUserIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndUserIdLessThanOrEqualTo2() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andUserIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndUserIdIn() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andUserIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndUserIdNotIn() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andUserIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndUserIdBetween() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andUserIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndUserIdNotBetween() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andUserIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndUserNameIsNull() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andUserNameIsNull();

    }

    @Test
    public void testAndUserNameIsNotNull() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andUserNameIsNotNull();

    }

    @Test
    public void testAndUserNameEqualTo() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andUserNameEqualTo("value");

    }

    @Test
    public void testAndUserNameEqualTo2() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andUserNameEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndUserNameNotEqualTo() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andUserNameNotEqualTo("value");

    }

    @Test
    public void testAndUserNameNotEqualTo2() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andUserNameNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndUserNameGreaterThan() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andUserNameGreaterThan("value");

    }

    @Test
    public void testAndUserNameGreaterThan2() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andUserNameGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndUserNameGreaterThanOrEqualTo() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andUserNameGreaterThanOrEqualTo("value");

    }

    @Test
    public void testAndUserNameGreaterThanOrEqualTo2() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andUserNameGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndUserNameLessThan() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andUserNameLessThan("value");

    }

    @Test
    public void testAndUserNameLessThan2() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andUserNameLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndUserNameLessThanOrEqualTo() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andUserNameLessThanOrEqualTo("value");

    }

    @Test
    public void testAndUserNameLessThanOrEqualTo2() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andUserNameLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndUserNameLike() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andUserNameLike("value");

    }

    @Test
    public void testAndUserNameLike2() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andUserNameLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndUserNameLikeLeft() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andUserNameLikeLeft("value");

    }

    @Test
    public void testAndUserNameLikeLeft2() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andUserNameLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndUserNameLikeRight() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andUserNameLikeRight("value");

    }

    @Test
    public void testAndUserNameLikeRight2() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andUserNameLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndUserNameLikeBoth() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andUserNameLikeBoth("value");

    }

    @Test
    public void testAndUserNameLikeBoth2() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andUserNameLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndUserNameNotLike() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andUserNameNotLike("value");

    }

    @Test
    public void testAndUserNameNotLike2() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andUserNameNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndUserNameNotLikeLeft() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andUserNameNotLikeLeft("value");

    }

    @Test
    public void testAndUserNameNotLikeLeft2() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andUserNameNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndUserNameNotLikeRight() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andUserNameNotLikeRight("value");

    }

    @Test
    public void testAndUserNameNotLikeRight2() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andUserNameNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndUserNameNotLikeBoth() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andUserNameNotLikeBoth("value");

    }

    @Test
    public void testAndUserNameNotLikeBoth2() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andUserNameNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndUserNameIn() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andUserNameIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndUserNameNotIn() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andUserNameNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndUserNameBetween() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andUserNameBetween("value1", "value2");

    }

    @Test
    public void testAndUserNameNotBetween() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andUserNameNotBetween("value1", "value2");

    }

    @Test
    public void testAndPriTypeIsNull() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andPriTypeIsNull();

    }

    @Test
    public void testAndPriTypeIsNotNull() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andPriTypeIsNotNull();

    }

    @Test
    public void testAndPriTypeEqualTo() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andPriTypeEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndPriTypeEqualTo2() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andPriTypeEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndPriTypeNotEqualTo() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andPriTypeNotEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndPriTypeNotEqualTo2() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andPriTypeNotEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndPriTypeGreaterThan() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andPriTypeGreaterThan(Byte.valueOf("00110"));

    }

    @Test
    public void testAndPriTypeGreaterThan2() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andPriTypeGreaterThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndPriTypeGreaterThanOrEqualTo() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andPriTypeGreaterThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndPriTypeGreaterThanOrEqualTo2() throws Exception {
        EnvironmentUserExample.Criteria result =
                criteria.andPriTypeGreaterThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndPriTypeLessThan() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andPriTypeLessThan(Byte.valueOf("00110"));

    }

    @Test
    public void testAndPriTypeLessThan2() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andPriTypeLessThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndPriTypeLessThanOrEqualTo() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andPriTypeLessThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndPriTypeLessThanOrEqualTo2() throws Exception {
        EnvironmentUserExample.Criteria result =
                criteria.andPriTypeLessThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndPriTypeIn() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andPriTypeIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testAndPriTypeNotIn() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andPriTypeNotIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testAndPriTypeBetween() throws Exception {
        EnvironmentUserExample.Criteria result =
                criteria.andPriTypeBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testAndPriTypeNotBetween() throws Exception {
        EnvironmentUserExample.Criteria result =
                criteria.andPriTypeNotBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testAndUpdateTimeIsNull() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andUpdateTimeIsNull();

    }

    @Test
    public void testAndUpdateTimeIsNotNull() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andUpdateTimeIsNotNull();

    }

    @Test
    public void testAndUpdateTimeEqualTo() throws Exception {
        EnvironmentUserExample.Criteria result =
                criteria.andUpdateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 16).getTime());

    }

    @Test
    public void testAndUpdateTimeEqualTo2() throws Exception {
        EnvironmentUserExample.Criteria result =
                criteria.andUpdateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 16).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndUpdateTimeNotEqualTo() throws Exception {
        EnvironmentUserExample.Criteria result =
                criteria.andUpdateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 16).getTime());

    }

    @Test
    public void testAndUpdateTimeNotEqualTo2() throws Exception {
        EnvironmentUserExample.Criteria result =
                criteria.andUpdateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 16).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndUpdateTimeGreaterThan() throws Exception {
        EnvironmentUserExample.Criteria result =
                criteria.andUpdateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 16).getTime());

    }

    @Test
    public void testAndUpdateTimeGreaterThan2() throws Exception {
        EnvironmentUserExample.Criteria result =
                criteria.andUpdateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 16).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndUpdateTimeGreaterThanOrEqualTo() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andUpdateTimeGreaterThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 16).getTime());

    }

    @Test
    public void testAndUpdateTimeGreaterThanOrEqualTo2() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andUpdateTimeGreaterThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 16).getTime(), Boolean.TRUE);

    }

    @Test
    public void testAndUpdateTimeLessThan() throws Exception {
        EnvironmentUserExample.Criteria result =
                criteria.andUpdateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 16).getTime());

    }

    @Test
    public void testAndUpdateTimeLessThan2() throws Exception {
        EnvironmentUserExample.Criteria result =
                criteria.andUpdateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 16).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndUpdateTimeLessThanOrEqualTo() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andUpdateTimeLessThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 16).getTime());

    }

    @Test
    public void testAndUpdateTimeLessThanOrEqualTo2() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andUpdateTimeLessThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 16).getTime(), Boolean.TRUE);

    }

    @Test
    public void testAndUpdateTimeIn() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andUpdateTimeIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 16).getTime()));

    }

    @Test
    public void testAndUpdateTimeNotIn() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andUpdateTimeNotIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 16).getTime()));

    }

    @Test
    public void testAndUpdateTimeBetween() throws Exception {
        EnvironmentUserExample.Criteria result =
                criteria.andUpdateTimeBetween(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 16).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 16).getTime());

    }

    @Test
    public void testAndUpdateTimeNotBetween() throws Exception {
        EnvironmentUserExample.Criteria result =
                criteria.andUpdateTimeNotBetween(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 16).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 16).getTime());

    }

    @Test
    public void testAndCreateTimeIsNull() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andCreateTimeIsNull();

    }

    @Test
    public void testAndCreateTimeIsNotNull() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andCreateTimeIsNotNull();

    }

    @Test
    public void testAndCreateTimeEqualTo() throws Exception {
        EnvironmentUserExample.Criteria result =
                criteria.andCreateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 16).getTime());

    }

    @Test
    public void testAndCreateTimeEqualTo2() throws Exception {
        EnvironmentUserExample.Criteria result =
                criteria.andCreateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 16).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeNotEqualTo() throws Exception {
        EnvironmentUserExample.Criteria result =
                criteria.andCreateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 16).getTime());

    }

    @Test
    public void testAndCreateTimeNotEqualTo2() throws Exception {
        EnvironmentUserExample.Criteria result =
                criteria.andCreateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 16).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeGreaterThan() throws Exception {
        EnvironmentUserExample.Criteria result =
                criteria.andCreateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 16).getTime());

    }

    @Test
    public void testAndCreateTimeGreaterThan2() throws Exception {
        EnvironmentUserExample.Criteria result =
                criteria.andCreateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 16).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeGreaterThanOrEqualTo() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andCreateTimeGreaterThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 16).getTime());

    }

    @Test
    public void testAndCreateTimeGreaterThanOrEqualTo2() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andCreateTimeGreaterThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 16).getTime(), Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeLessThan() throws Exception {
        EnvironmentUserExample.Criteria result =
                criteria.andCreateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 16).getTime());

    }

    @Test
    public void testAndCreateTimeLessThan2() throws Exception {
        EnvironmentUserExample.Criteria result =
                criteria.andCreateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 16).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeLessThanOrEqualTo() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andCreateTimeLessThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 16).getTime());

    }

    @Test
    public void testAndCreateTimeLessThanOrEqualTo2() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andCreateTimeLessThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 16).getTime(), Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeIn() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andCreateTimeIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 16).getTime()));

    }

    @Test
    public void testAndCreateTimeNotIn() throws Exception {
        EnvironmentUserExample.Criteria result = criteria.andCreateTimeNotIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 16).getTime()));

    }

    @Test
    public void testAndCreateTimeBetween() throws Exception {
        EnvironmentUserExample.Criteria result =
                criteria.andCreateTimeBetween(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 16).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 16).getTime());

    }

    @Test
    public void testAndCreateTimeNotBetween() throws Exception {
        EnvironmentUserExample.Criteria result =
                criteria.andCreateTimeNotBetween(new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 16).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 9, 15, 16).getTime());

    }
}

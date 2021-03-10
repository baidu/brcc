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

public class UserExampleCriteriaTest {



    UserExample.Criteria criteria = UserExample.newBuilder().build().createCriteria();

    @Before
    public void setUp() {

    }

    @Test
    public void testToExample() throws Exception {
        UserExample result = criteria.toExample();

    }

    @Test
    public void testAddCustomerCriteria() throws Exception {
        UserExample.Criteria result = criteria.addCustomerCriteria("condition");

    }

    @Test
    public void testAddCustomerCriteria2() throws Exception {
        UserExample.Criteria result = criteria.addCustomerCriteria("condition", Boolean.TRUE);

    }

    @Test
    public void testAddCustomerCriteria3() throws Exception {
        UserExample.Criteria result = criteria.addCustomerCriteria("condition", "value");

    }

    @Test
    public void testAndGroupCriterion() throws Exception {
        UserExample.CriterionGroup result = criteria.andGroupCriterion();

    }

    @Test
    public void testAndGroupCriterion2() throws Exception {
        UserExample.CriterionGroup result = criteria.andGroupCriterion(Boolean.TRUE);

    }

    @Test
    public void testIsValid() throws Exception {
        boolean result = criteria.isValid();

    }

    @Test
    public void testAndIdIsNull() throws Exception {
        UserExample.Criteria result = criteria.andIdIsNull();

    }

    @Test
    public void testAndIdIsNotNull() throws Exception {
        UserExample.Criteria result = criteria.andIdIsNotNull();

    }

    @Test
    public void testAndIdEqualTo() throws Exception {
        UserExample.Criteria result = criteria.andIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndIdEqualTo2() throws Exception {
        UserExample.Criteria result = criteria.andIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdNotEqualTo() throws Exception {
        UserExample.Criteria result = criteria.andIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndIdNotEqualTo2() throws Exception {
        UserExample.Criteria result = criteria.andIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdGreaterThan() throws Exception {
        UserExample.Criteria result = criteria.andIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testAndIdGreaterThan2() throws Exception {
        UserExample.Criteria result = criteria.andIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdGreaterThanOrEqualTo() throws Exception {
        UserExample.Criteria result = criteria.andIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndIdGreaterThanOrEqualTo2() throws Exception {
        UserExample.Criteria result = criteria.andIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdLessThan() throws Exception {
        UserExample.Criteria result = criteria.andIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testAndIdLessThan2() throws Exception {
        UserExample.Criteria result = criteria.andIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdLessThanOrEqualTo() throws Exception {
        UserExample.Criteria result = criteria.andIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndIdLessThanOrEqualTo2() throws Exception {
        UserExample.Criteria result = criteria.andIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdIn() throws Exception {
        UserExample.Criteria result = criteria.andIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndIdNotIn() throws Exception {
        UserExample.Criteria result = criteria.andIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndIdBetween() throws Exception {
        UserExample.Criteria result = criteria.andIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndIdNotBetween() throws Exception {
        UserExample.Criteria result = criteria.andIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndNameIsNull() throws Exception {
        UserExample.Criteria result = criteria.andNameIsNull();

    }

    @Test
    public void testAndNameIsNotNull() throws Exception {
        UserExample.Criteria result = criteria.andNameIsNotNull();

    }

    @Test
    public void testAndNameEqualTo() throws Exception {
        UserExample.Criteria result = criteria.andNameEqualTo("value");

    }

    @Test
    public void testAndNameEqualTo2() throws Exception {
        UserExample.Criteria result = criteria.andNameEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameNotEqualTo() throws Exception {
        UserExample.Criteria result = criteria.andNameNotEqualTo("value");

    }

    @Test
    public void testAndNameNotEqualTo2() throws Exception {
        UserExample.Criteria result = criteria.andNameNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameGreaterThan() throws Exception {
        UserExample.Criteria result = criteria.andNameGreaterThan("value");

    }

    @Test
    public void testAndNameGreaterThan2() throws Exception {
        UserExample.Criteria result = criteria.andNameGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameGreaterThanOrEqualTo() throws Exception {
        UserExample.Criteria result = criteria.andNameGreaterThanOrEqualTo("value");

    }

    @Test
    public void testAndNameGreaterThanOrEqualTo2() throws Exception {
        UserExample.Criteria result = criteria.andNameGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameLessThan() throws Exception {
        UserExample.Criteria result = criteria.andNameLessThan("value");

    }

    @Test
    public void testAndNameLessThan2() throws Exception {
        UserExample.Criteria result = criteria.andNameLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameLessThanOrEqualTo() throws Exception {
        UserExample.Criteria result = criteria.andNameLessThanOrEqualTo("value");

    }

    @Test
    public void testAndNameLessThanOrEqualTo2() throws Exception {
        UserExample.Criteria result = criteria.andNameLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameLike() throws Exception {
        UserExample.Criteria result = criteria.andNameLike("value");

    }

    @Test
    public void testAndNameLike2() throws Exception {
        UserExample.Criteria result = criteria.andNameLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameLikeLeft() throws Exception {
        UserExample.Criteria result = criteria.andNameLikeLeft("value");

    }

    @Test
    public void testAndNameLikeLeft2() throws Exception {
        UserExample.Criteria result = criteria.andNameLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameLikeRight() throws Exception {
        UserExample.Criteria result = criteria.andNameLikeRight("value");

    }

    @Test
    public void testAndNameLikeRight2() throws Exception {
        UserExample.Criteria result = criteria.andNameLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameLikeBoth() throws Exception {
        UserExample.Criteria result = criteria.andNameLikeBoth("value");

    }

    @Test
    public void testAndNameLikeBoth2() throws Exception {
        UserExample.Criteria result = criteria.andNameLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameNotLike() throws Exception {
        UserExample.Criteria result = criteria.andNameNotLike("value");

    }

    @Test
    public void testAndNameNotLike2() throws Exception {
        UserExample.Criteria result = criteria.andNameNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameNotLikeLeft() throws Exception {
        UserExample.Criteria result = criteria.andNameNotLikeLeft("value");

    }

    @Test
    public void testAndNameNotLikeLeft2() throws Exception {
        UserExample.Criteria result = criteria.andNameNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameNotLikeRight() throws Exception {
        UserExample.Criteria result = criteria.andNameNotLikeRight("value");

    }

    @Test
    public void testAndNameNotLikeRight2() throws Exception {
        UserExample.Criteria result = criteria.andNameNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameNotLikeBoth() throws Exception {
        UserExample.Criteria result = criteria.andNameNotLikeBoth("value");

    }

    @Test
    public void testAndNameNotLikeBoth2() throws Exception {
        UserExample.Criteria result = criteria.andNameNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndNameIn() throws Exception {
        UserExample.Criteria result = criteria.andNameIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndNameNotIn() throws Exception {
        UserExample.Criteria result = criteria.andNameNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndNameBetween() throws Exception {
        UserExample.Criteria result = criteria.andNameBetween("value1", "value2");

    }

    @Test
    public void testAndNameNotBetween() throws Exception {
        UserExample.Criteria result = criteria.andNameNotBetween("value1", "value2");

    }

    @Test
    public void testAndPasswordIsNull() throws Exception {
        UserExample.Criteria result = criteria.andPasswordIsNull();

    }

    @Test
    public void testAndPasswordIsNotNull() throws Exception {
        UserExample.Criteria result = criteria.andPasswordIsNotNull();

    }

    @Test
    public void testAndPasswordEqualTo() throws Exception {
        UserExample.Criteria result = criteria.andPasswordEqualTo("value");

    }

    @Test
    public void testAndPasswordEqualTo2() throws Exception {
        UserExample.Criteria result = criteria.andPasswordEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndPasswordNotEqualTo() throws Exception {
        UserExample.Criteria result = criteria.andPasswordNotEqualTo("value");

    }

    @Test
    public void testAndPasswordNotEqualTo2() throws Exception {
        UserExample.Criteria result = criteria.andPasswordNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndPasswordGreaterThan() throws Exception {
        UserExample.Criteria result = criteria.andPasswordGreaterThan("value");

    }

    @Test
    public void testAndPasswordGreaterThan2() throws Exception {
        UserExample.Criteria result = criteria.andPasswordGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndPasswordGreaterThanOrEqualTo() throws Exception {
        UserExample.Criteria result = criteria.andPasswordGreaterThanOrEqualTo("value");

    }

    @Test
    public void testAndPasswordGreaterThanOrEqualTo2() throws Exception {
        UserExample.Criteria result = criteria.andPasswordGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndPasswordLessThan() throws Exception {
        UserExample.Criteria result = criteria.andPasswordLessThan("value");

    }

    @Test
    public void testAndPasswordLessThan2() throws Exception {
        UserExample.Criteria result = criteria.andPasswordLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndPasswordLessThanOrEqualTo() throws Exception {
        UserExample.Criteria result = criteria.andPasswordLessThanOrEqualTo("value");

    }

    @Test
    public void testAndPasswordLessThanOrEqualTo2() throws Exception {
        UserExample.Criteria result = criteria.andPasswordLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndPasswordLike() throws Exception {
        UserExample.Criteria result = criteria.andPasswordLike("value");

    }

    @Test
    public void testAndPasswordLike2() throws Exception {
        UserExample.Criteria result = criteria.andPasswordLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndPasswordLikeLeft() throws Exception {
        UserExample.Criteria result = criteria.andPasswordLikeLeft("value");

    }

    @Test
    public void testAndPasswordLikeLeft2() throws Exception {
        UserExample.Criteria result = criteria.andPasswordLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndPasswordLikeRight() throws Exception {
        UserExample.Criteria result = criteria.andPasswordLikeRight("value");

    }

    @Test
    public void testAndPasswordLikeRight2() throws Exception {
        UserExample.Criteria result = criteria.andPasswordLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndPasswordLikeBoth() throws Exception {
        UserExample.Criteria result = criteria.andPasswordLikeBoth("value");

    }

    @Test
    public void testAndPasswordLikeBoth2() throws Exception {
        UserExample.Criteria result = criteria.andPasswordLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndPasswordNotLike() throws Exception {
        UserExample.Criteria result = criteria.andPasswordNotLike("value");

    }

    @Test
    public void testAndPasswordNotLike2() throws Exception {
        UserExample.Criteria result = criteria.andPasswordNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndPasswordNotLikeLeft() throws Exception {
        UserExample.Criteria result = criteria.andPasswordNotLikeLeft("value");

    }

    @Test
    public void testAndPasswordNotLikeLeft2() throws Exception {
        UserExample.Criteria result = criteria.andPasswordNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndPasswordNotLikeRight() throws Exception {
        UserExample.Criteria result = criteria.andPasswordNotLikeRight("value");

    }

    @Test
    public void testAndPasswordNotLikeRight2() throws Exception {
        UserExample.Criteria result = criteria.andPasswordNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndPasswordNotLikeBoth() throws Exception {
        UserExample.Criteria result = criteria.andPasswordNotLikeBoth("value");

    }

    @Test
    public void testAndPasswordNotLikeBoth2() throws Exception {
        UserExample.Criteria result = criteria.andPasswordNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndPasswordIn() throws Exception {
        UserExample.Criteria result = criteria.andPasswordIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndPasswordNotIn() throws Exception {
        UserExample.Criteria result = criteria.andPasswordNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndPasswordBetween() throws Exception {
        UserExample.Criteria result = criteria.andPasswordBetween("value1", "value2");

    }

    @Test
    public void testAndPasswordNotBetween() throws Exception {
        UserExample.Criteria result = criteria.andPasswordNotBetween("value1", "value2");

    }

    @Test
    public void testAndApiPasswordIsNull() throws Exception {
        UserExample.Criteria result = criteria.andApiPasswordIsNull();

    }

    @Test
    public void testAndApiPasswordIsNotNull() throws Exception {
        UserExample.Criteria result = criteria.andApiPasswordIsNotNull();

    }

    @Test
    public void testAndApiPasswordEqualTo() throws Exception {
        UserExample.Criteria result = criteria.andApiPasswordEqualTo("value");

    }

    @Test
    public void testAndApiPasswordEqualTo2() throws Exception {
        UserExample.Criteria result = criteria.andApiPasswordEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndApiPasswordNotEqualTo() throws Exception {
        UserExample.Criteria result = criteria.andApiPasswordNotEqualTo("value");

    }

    @Test
    public void testAndApiPasswordNotEqualTo2() throws Exception {
        UserExample.Criteria result = criteria.andApiPasswordNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndApiPasswordGreaterThan() throws Exception {
        UserExample.Criteria result = criteria.andApiPasswordGreaterThan("value");

    }

    @Test
    public void testAndApiPasswordGreaterThan2() throws Exception {
        UserExample.Criteria result = criteria.andApiPasswordGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndApiPasswordGreaterThanOrEqualTo() throws Exception {
        UserExample.Criteria result = criteria.andApiPasswordGreaterThanOrEqualTo("value");

    }

    @Test
    public void testAndApiPasswordGreaterThanOrEqualTo2() throws Exception {
        UserExample.Criteria result = criteria.andApiPasswordGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndApiPasswordLessThan() throws Exception {
        UserExample.Criteria result = criteria.andApiPasswordLessThan("value");

    }

    @Test
    public void testAndApiPasswordLessThan2() throws Exception {
        UserExample.Criteria result = criteria.andApiPasswordLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndApiPasswordLessThanOrEqualTo() throws Exception {
        UserExample.Criteria result = criteria.andApiPasswordLessThanOrEqualTo("value");

    }

    @Test
    public void testAndApiPasswordLessThanOrEqualTo2() throws Exception {
        UserExample.Criteria result = criteria.andApiPasswordLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndApiPasswordLike() throws Exception {
        UserExample.Criteria result = criteria.andApiPasswordLike("value");

    }

    @Test
    public void testAndApiPasswordLike2() throws Exception {
        UserExample.Criteria result = criteria.andApiPasswordLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndApiPasswordLikeLeft() throws Exception {
        UserExample.Criteria result = criteria.andApiPasswordLikeLeft("value");

    }

    @Test
    public void testAndApiPasswordLikeLeft2() throws Exception {
        UserExample.Criteria result = criteria.andApiPasswordLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndApiPasswordLikeRight() throws Exception {
        UserExample.Criteria result = criteria.andApiPasswordLikeRight("value");

    }

    @Test
    public void testAndApiPasswordLikeRight2() throws Exception {
        UserExample.Criteria result = criteria.andApiPasswordLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndApiPasswordLikeBoth() throws Exception {
        UserExample.Criteria result = criteria.andApiPasswordLikeBoth("value");

    }

    @Test
    public void testAndApiPasswordLikeBoth2() throws Exception {
        UserExample.Criteria result = criteria.andApiPasswordLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndApiPasswordNotLike() throws Exception {
        UserExample.Criteria result = criteria.andApiPasswordNotLike("value");

    }

    @Test
    public void testAndApiPasswordNotLike2() throws Exception {
        UserExample.Criteria result = criteria.andApiPasswordNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndApiPasswordNotLikeLeft() throws Exception {
        UserExample.Criteria result = criteria.andApiPasswordNotLikeLeft("value");

    }

    @Test
    public void testAndApiPasswordNotLikeLeft2() throws Exception {
        UserExample.Criteria result = criteria.andApiPasswordNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndApiPasswordNotLikeRight() throws Exception {
        UserExample.Criteria result = criteria.andApiPasswordNotLikeRight("value");

    }

    @Test
    public void testAndApiPasswordNotLikeRight2() throws Exception {
        UserExample.Criteria result = criteria.andApiPasswordNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndApiPasswordNotLikeBoth() throws Exception {
        UserExample.Criteria result = criteria.andApiPasswordNotLikeBoth("value");

    }

    @Test
    public void testAndApiPasswordNotLikeBoth2() throws Exception {
        UserExample.Criteria result = criteria.andApiPasswordNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndApiPasswordIn() throws Exception {
        UserExample.Criteria result = criteria.andApiPasswordIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndApiPasswordNotIn() throws Exception {
        UserExample.Criteria result = criteria.andApiPasswordNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndApiPasswordBetween() throws Exception {
        UserExample.Criteria result = criteria.andApiPasswordBetween("value1", "value2");

    }

    @Test
    public void testAndApiPasswordNotBetween() throws Exception {
        UserExample.Criteria result = criteria.andApiPasswordNotBetween("value1", "value2");

    }

    @Test
    public void testAndStatusIsNull() throws Exception {
        UserExample.Criteria result = criteria.andStatusIsNull();

    }

    @Test
    public void testAndStatusIsNotNull() throws Exception {
        UserExample.Criteria result = criteria.andStatusIsNotNull();

    }

    @Test
    public void testAndStatusEqualTo() throws Exception {
        UserExample.Criteria result = criteria.andStatusEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndStatusEqualTo2() throws Exception {
        UserExample.Criteria result = criteria.andStatusEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndStatusNotEqualTo() throws Exception {
        UserExample.Criteria result = criteria.andStatusNotEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndStatusNotEqualTo2() throws Exception {
        UserExample.Criteria result = criteria.andStatusNotEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndStatusGreaterThan() throws Exception {
        UserExample.Criteria result = criteria.andStatusGreaterThan(Byte.valueOf("00110"));

    }

    @Test
    public void testAndStatusGreaterThan2() throws Exception {
        UserExample.Criteria result = criteria.andStatusGreaterThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndStatusGreaterThanOrEqualTo() throws Exception {
        UserExample.Criteria result = criteria.andStatusGreaterThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndStatusGreaterThanOrEqualTo2() throws Exception {
        UserExample.Criteria result = criteria.andStatusGreaterThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndStatusLessThan() throws Exception {
        UserExample.Criteria result = criteria.andStatusLessThan(Byte.valueOf("00110"));

    }

    @Test
    public void testAndStatusLessThan2() throws Exception {
        UserExample.Criteria result = criteria.andStatusLessThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndStatusLessThanOrEqualTo() throws Exception {
        UserExample.Criteria result = criteria.andStatusLessThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndStatusLessThanOrEqualTo2() throws Exception {
        UserExample.Criteria result = criteria.andStatusLessThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndStatusIn() throws Exception {
        UserExample.Criteria result = criteria.andStatusIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testAndStatusNotIn() throws Exception {
        UserExample.Criteria result = criteria.andStatusNotIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testAndStatusBetween() throws Exception {
        UserExample.Criteria result = criteria.andStatusBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testAndStatusNotBetween() throws Exception {
        UserExample.Criteria result = criteria.andStatusNotBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testAndTypeIsNull() throws Exception {
        UserExample.Criteria result = criteria.andTypeIsNull();

    }

    @Test
    public void testAndTypeIsNotNull() throws Exception {
        UserExample.Criteria result = criteria.andTypeIsNotNull();

    }

    @Test
    public void testAndTypeEqualTo() throws Exception {
        UserExample.Criteria result = criteria.andTypeEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndTypeEqualTo2() throws Exception {
        UserExample.Criteria result = criteria.andTypeEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndTypeNotEqualTo() throws Exception {
        UserExample.Criteria result = criteria.andTypeNotEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndTypeNotEqualTo2() throws Exception {
        UserExample.Criteria result = criteria.andTypeNotEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndTypeGreaterThan() throws Exception {
        UserExample.Criteria result = criteria.andTypeGreaterThan(Byte.valueOf("00110"));

    }

    @Test
    public void testAndTypeGreaterThan2() throws Exception {
        UserExample.Criteria result = criteria.andTypeGreaterThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndTypeGreaterThanOrEqualTo() throws Exception {
        UserExample.Criteria result = criteria.andTypeGreaterThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndTypeGreaterThanOrEqualTo2() throws Exception {
        UserExample.Criteria result = criteria.andTypeGreaterThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndTypeLessThan() throws Exception {
        UserExample.Criteria result = criteria.andTypeLessThan(Byte.valueOf("00110"));

    }

    @Test
    public void testAndTypeLessThan2() throws Exception {
        UserExample.Criteria result = criteria.andTypeLessThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndTypeLessThanOrEqualTo() throws Exception {
        UserExample.Criteria result = criteria.andTypeLessThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndTypeLessThanOrEqualTo2() throws Exception {
        UserExample.Criteria result = criteria.andTypeLessThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndTypeIn() throws Exception {
        UserExample.Criteria result = criteria.andTypeIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testAndTypeNotIn() throws Exception {
        UserExample.Criteria result = criteria.andTypeNotIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testAndTypeBetween() throws Exception {
        UserExample.Criteria result = criteria.andTypeBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testAndTypeNotBetween() throws Exception {
        UserExample.Criteria result = criteria.andTypeNotBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testAndRoleIsNull() throws Exception {
        UserExample.Criteria result = criteria.andRoleIsNull();

    }

    @Test
    public void testAndRoleIsNotNull() throws Exception {
        UserExample.Criteria result = criteria.andRoleIsNotNull();

    }

    @Test
    public void testAndRoleEqualTo() throws Exception {
        UserExample.Criteria result = criteria.andRoleEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndRoleEqualTo2() throws Exception {
        UserExample.Criteria result = criteria.andRoleEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndRoleNotEqualTo() throws Exception {
        UserExample.Criteria result = criteria.andRoleNotEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndRoleNotEqualTo2() throws Exception {
        UserExample.Criteria result = criteria.andRoleNotEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndRoleGreaterThan() throws Exception {
        UserExample.Criteria result = criteria.andRoleGreaterThan(Byte.valueOf("00110"));

    }

    @Test
    public void testAndRoleGreaterThan2() throws Exception {
        UserExample.Criteria result = criteria.andRoleGreaterThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndRoleGreaterThanOrEqualTo() throws Exception {
        UserExample.Criteria result = criteria.andRoleGreaterThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndRoleGreaterThanOrEqualTo2() throws Exception {
        UserExample.Criteria result = criteria.andRoleGreaterThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndRoleLessThan() throws Exception {
        UserExample.Criteria result = criteria.andRoleLessThan(Byte.valueOf("00110"));

    }

    @Test
    public void testAndRoleLessThan2() throws Exception {
        UserExample.Criteria result = criteria.andRoleLessThan(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndRoleLessThanOrEqualTo() throws Exception {
        UserExample.Criteria result = criteria.andRoleLessThanOrEqualTo(Byte.valueOf("00110"));

    }

    @Test
    public void testAndRoleLessThanOrEqualTo2() throws Exception {
        UserExample.Criteria result = criteria.andRoleLessThanOrEqualTo(Byte.valueOf("00110"), Boolean.TRUE);

    }

    @Test
    public void testAndRoleIn() throws Exception {
        UserExample.Criteria result = criteria.andRoleIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testAndRoleNotIn() throws Exception {
        UserExample.Criteria result = criteria.andRoleNotIn(Arrays.<Byte>asList(Byte.valueOf("00110")));

    }

    @Test
    public void testAndRoleBetween() throws Exception {
        UserExample.Criteria result = criteria.andRoleBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testAndRoleNotBetween() throws Exception {
        UserExample.Criteria result = criteria.andRoleNotBetween(Byte.valueOf("00110"), Byte.valueOf("00110"));

    }

    @Test
    public void testAndTokenIsNull() throws Exception {
        UserExample.Criteria result = criteria.andTokenIsNull();

    }

    @Test
    public void testAndTokenIsNotNull() throws Exception {
        UserExample.Criteria result = criteria.andTokenIsNotNull();

    }

    @Test
    public void testAndTokenEqualTo() throws Exception {
        UserExample.Criteria result = criteria.andTokenEqualTo("value");

    }

    @Test
    public void testAndTokenEqualTo2() throws Exception {
        UserExample.Criteria result = criteria.andTokenEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndTokenNotEqualTo() throws Exception {
        UserExample.Criteria result = criteria.andTokenNotEqualTo("value");

    }

    @Test
    public void testAndTokenNotEqualTo2() throws Exception {
        UserExample.Criteria result = criteria.andTokenNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndTokenGreaterThan() throws Exception {
        UserExample.Criteria result = criteria.andTokenGreaterThan("value");

    }

    @Test
    public void testAndTokenGreaterThan2() throws Exception {
        UserExample.Criteria result = criteria.andTokenGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndTokenGreaterThanOrEqualTo() throws Exception {
        UserExample.Criteria result = criteria.andTokenGreaterThanOrEqualTo("value");

    }

    @Test
    public void testAndTokenGreaterThanOrEqualTo2() throws Exception {
        UserExample.Criteria result = criteria.andTokenGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndTokenLessThan() throws Exception {
        UserExample.Criteria result = criteria.andTokenLessThan("value");

    }

    @Test
    public void testAndTokenLessThan2() throws Exception {
        UserExample.Criteria result = criteria.andTokenLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndTokenLessThanOrEqualTo() throws Exception {
        UserExample.Criteria result = criteria.andTokenLessThanOrEqualTo("value");

    }

    @Test
    public void testAndTokenLessThanOrEqualTo2() throws Exception {
        UserExample.Criteria result = criteria.andTokenLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndTokenLike() throws Exception {
        UserExample.Criteria result = criteria.andTokenLike("value");

    }

    @Test
    public void testAndTokenLike2() throws Exception {
        UserExample.Criteria result = criteria.andTokenLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndTokenLikeLeft() throws Exception {
        UserExample.Criteria result = criteria.andTokenLikeLeft("value");

    }

    @Test
    public void testAndTokenLikeLeft2() throws Exception {
        UserExample.Criteria result = criteria.andTokenLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndTokenLikeRight() throws Exception {
        UserExample.Criteria result = criteria.andTokenLikeRight("value");

    }

    @Test
    public void testAndTokenLikeRight2() throws Exception {
        UserExample.Criteria result = criteria.andTokenLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndTokenLikeBoth() throws Exception {
        UserExample.Criteria result = criteria.andTokenLikeBoth("value");

    }

    @Test
    public void testAndTokenLikeBoth2() throws Exception {
        UserExample.Criteria result = criteria.andTokenLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndTokenNotLike() throws Exception {
        UserExample.Criteria result = criteria.andTokenNotLike("value");

    }

    @Test
    public void testAndTokenNotLike2() throws Exception {
        UserExample.Criteria result = criteria.andTokenNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndTokenNotLikeLeft() throws Exception {
        UserExample.Criteria result = criteria.andTokenNotLikeLeft("value");

    }

    @Test
    public void testAndTokenNotLikeLeft2() throws Exception {
        UserExample.Criteria result = criteria.andTokenNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndTokenNotLikeRight() throws Exception {
        UserExample.Criteria result = criteria.andTokenNotLikeRight("value");

    }

    @Test
    public void testAndTokenNotLikeRight2() throws Exception {
        UserExample.Criteria result = criteria.andTokenNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndTokenNotLikeBoth() throws Exception {
        UserExample.Criteria result = criteria.andTokenNotLikeBoth("value");

    }

    @Test
    public void testAndTokenNotLikeBoth2() throws Exception {
        UserExample.Criteria result = criteria.andTokenNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndTokenIn() throws Exception {
        UserExample.Criteria result = criteria.andTokenIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndTokenNotIn() throws Exception {
        UserExample.Criteria result = criteria.andTokenNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndTokenBetween() throws Exception {
        UserExample.Criteria result = criteria.andTokenBetween("value1", "value2");

    }

    @Test
    public void testAndTokenNotBetween() throws Exception {
        UserExample.Criteria result = criteria.andTokenNotBetween("value1", "value2");

    }

    @Test
    public void testAndUpdateTimeIsNull() throws Exception {
        UserExample.Criteria result = criteria.andUpdateTimeIsNull();

    }

    @Test
    public void testAndUpdateTimeIsNotNull() throws Exception {
        UserExample.Criteria result = criteria.andUpdateTimeIsNotNull();

    }

    @Test
    public void testAndUpdateTimeEqualTo() throws Exception {
        UserExample.Criteria result =
                criteria.andUpdateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 16).getTime());

    }

    @Test
    public void testAndUpdateTimeEqualTo2() throws Exception {
        UserExample.Criteria result =
                criteria.andUpdateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 16).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndUpdateTimeNotEqualTo() throws Exception {
        UserExample.Criteria result =
                criteria.andUpdateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 16).getTime());

    }

    @Test
    public void testAndUpdateTimeNotEqualTo2() throws Exception {
        UserExample.Criteria result =
                criteria.andUpdateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 16).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndUpdateTimeGreaterThan() throws Exception {
        UserExample.Criteria result =
                criteria.andUpdateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 16).getTime());

    }

    @Test
    public void testAndUpdateTimeGreaterThan2() throws Exception {
        UserExample.Criteria result =
                criteria.andUpdateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 16).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndUpdateTimeGreaterThanOrEqualTo() throws Exception {
        UserExample.Criteria result = criteria.andUpdateTimeGreaterThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 16).getTime());

    }

    @Test
    public void testAndUpdateTimeGreaterThanOrEqualTo2() throws Exception {
        UserExample.Criteria result = criteria.andUpdateTimeGreaterThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 16).getTime(), Boolean.TRUE);

    }

    @Test
    public void testAndUpdateTimeLessThan() throws Exception {
        UserExample.Criteria result =
                criteria.andUpdateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 16).getTime());

    }

    @Test
    public void testAndUpdateTimeLessThan2() throws Exception {
        UserExample.Criteria result =
                criteria.andUpdateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 16).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndUpdateTimeLessThanOrEqualTo() throws Exception {
        UserExample.Criteria result = criteria.andUpdateTimeLessThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 16).getTime());

    }

    @Test
    public void testAndUpdateTimeLessThanOrEqualTo2() throws Exception {
        UserExample.Criteria result = criteria.andUpdateTimeLessThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 16).getTime(), Boolean.TRUE);

    }

    @Test
    public void testAndUpdateTimeIn() throws Exception {
        UserExample.Criteria result = criteria.andUpdateTimeIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 16).getTime()));

    }

    @Test
    public void testAndUpdateTimeNotIn() throws Exception {
        UserExample.Criteria result = criteria.andUpdateTimeNotIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 16).getTime()));

    }

    @Test
    public void testAndUpdateTimeBetween() throws Exception {
        UserExample.Criteria result =
                criteria.andUpdateTimeBetween(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 16).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 16).getTime());

    }

    @Test
    public void testAndUpdateTimeNotBetween() throws Exception {
        UserExample.Criteria result =
                criteria.andUpdateTimeNotBetween(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 16).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 16).getTime());

    }

    @Test
    public void testAndCreateTimeIsNull() throws Exception {
        UserExample.Criteria result = criteria.andCreateTimeIsNull();

    }

    @Test
    public void testAndCreateTimeIsNotNull() throws Exception {
        UserExample.Criteria result = criteria.andCreateTimeIsNotNull();

    }

    @Test
    public void testAndCreateTimeEqualTo() throws Exception {
        UserExample.Criteria result =
                criteria.andCreateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 16).getTime());

    }

    @Test
    public void testAndCreateTimeEqualTo2() throws Exception {
        UserExample.Criteria result =
                criteria.andCreateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 16).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeNotEqualTo() throws Exception {
        UserExample.Criteria result =
                criteria.andCreateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 16).getTime());

    }

    @Test
    public void testAndCreateTimeNotEqualTo2() throws Exception {
        UserExample.Criteria result =
                criteria.andCreateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 16).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeGreaterThan() throws Exception {
        UserExample.Criteria result =
                criteria.andCreateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 16).getTime());

    }

    @Test
    public void testAndCreateTimeGreaterThan2() throws Exception {
        UserExample.Criteria result =
                criteria.andCreateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 16).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeGreaterThanOrEqualTo() throws Exception {
        UserExample.Criteria result = criteria.andCreateTimeGreaterThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 16).getTime());

    }

    @Test
    public void testAndCreateTimeGreaterThanOrEqualTo2() throws Exception {
        UserExample.Criteria result = criteria.andCreateTimeGreaterThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 16).getTime(), Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeLessThan() throws Exception {
        UserExample.Criteria result =
                criteria.andCreateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 16).getTime());

    }

    @Test
    public void testAndCreateTimeLessThan2() throws Exception {
        UserExample.Criteria result =
                criteria.andCreateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 16).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeLessThanOrEqualTo() throws Exception {
        UserExample.Criteria result = criteria.andCreateTimeLessThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 16).getTime());

    }

    @Test
    public void testAndCreateTimeLessThanOrEqualTo2() throws Exception {
        UserExample.Criteria result = criteria.andCreateTimeLessThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 16).getTime(), Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeIn() throws Exception {
        UserExample.Criteria result = criteria.andCreateTimeIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 16).getTime()));

    }

    @Test
    public void testAndCreateTimeNotIn() throws Exception {
        UserExample.Criteria result = criteria.andCreateTimeNotIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 16).getTime()));

    }

    @Test
    public void testAndCreateTimeBetween() throws Exception {
        UserExample.Criteria result =
                criteria.andCreateTimeBetween(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 16).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 16).getTime());

    }

    @Test
    public void testAndCreateTimeNotBetween() throws Exception {
        UserExample.Criteria result =
                criteria.andCreateTimeNotBetween(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 16).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 16).getTime());

    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev
// .com/forum#!/testme

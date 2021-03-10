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

public class OperationLogExampleCriteriaTest {



    OperationLogExample.Criteria criteria = OperationLogExample.newBuilder().build().createCriteria();

    @Before
    public void setUp() {

    }

    @Test
    public void testToExample() throws Exception {
        OperationLogExample result = criteria.toExample();

    }

    @Test
    public void testAddCustomerCriteria() throws Exception {
        OperationLogExample.Criteria result = criteria.addCustomerCriteria("condition");

    }

    @Test
    public void testAddCustomerCriteria2() throws Exception {
        OperationLogExample.Criteria result = criteria.addCustomerCriteria("condition", Boolean.TRUE);

    }

    @Test
    public void testAddCustomerCriteria3() throws Exception {
        OperationLogExample.Criteria result = criteria.addCustomerCriteria("condition", "value");

    }

    @Test
    public void testAndGroupCriterion() throws Exception {
        OperationLogExample.CriterionGroup result = criteria.andGroupCriterion();

    }

    @Test
    public void testAndGroupCriterion2() throws Exception {
        OperationLogExample.CriterionGroup result = criteria.andGroupCriterion(Boolean.TRUE);

    }

    @Test
    public void testIsValid() throws Exception {
        boolean result = criteria.isValid();

    }

    @Test
    public void testAndIdIsNull() throws Exception {
        OperationLogExample.Criteria result = criteria.andIdIsNull();

    }

    @Test
    public void testAndIdIsNotNull() throws Exception {
        OperationLogExample.Criteria result = criteria.andIdIsNotNull();

    }

    @Test
    public void testAndIdEqualTo() throws Exception {
        OperationLogExample.Criteria result = criteria.andIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndIdEqualTo2() throws Exception {
        OperationLogExample.Criteria result = criteria.andIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdNotEqualTo() throws Exception {
        OperationLogExample.Criteria result = criteria.andIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndIdNotEqualTo2() throws Exception {
        OperationLogExample.Criteria result = criteria.andIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdGreaterThan() throws Exception {
        OperationLogExample.Criteria result = criteria.andIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testAndIdGreaterThan2() throws Exception {
        OperationLogExample.Criteria result = criteria.andIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdGreaterThanOrEqualTo() throws Exception {
        OperationLogExample.Criteria result = criteria.andIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndIdGreaterThanOrEqualTo2() throws Exception {
        OperationLogExample.Criteria result = criteria.andIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdLessThan() throws Exception {
        OperationLogExample.Criteria result = criteria.andIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testAndIdLessThan2() throws Exception {
        OperationLogExample.Criteria result = criteria.andIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdLessThanOrEqualTo() throws Exception {
        OperationLogExample.Criteria result = criteria.andIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndIdLessThanOrEqualTo2() throws Exception {
        OperationLogExample.Criteria result = criteria.andIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndIdIn() throws Exception {
        OperationLogExample.Criteria result = criteria.andIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndIdNotIn() throws Exception {
        OperationLogExample.Criteria result = criteria.andIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndIdBetween() throws Exception {
        OperationLogExample.Criteria result = criteria.andIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndIdNotBetween() throws Exception {
        OperationLogExample.Criteria result = criteria.andIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndUserIdIsNull() throws Exception {
        OperationLogExample.Criteria result = criteria.andUserIdIsNull();

    }

    @Test
    public void testAndUserIdIsNotNull() throws Exception {
        OperationLogExample.Criteria result = criteria.andUserIdIsNotNull();

    }

    @Test
    public void testAndUserIdEqualTo() throws Exception {
        OperationLogExample.Criteria result = criteria.andUserIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndUserIdEqualTo2() throws Exception {
        OperationLogExample.Criteria result = criteria.andUserIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndUserIdNotEqualTo() throws Exception {
        OperationLogExample.Criteria result = criteria.andUserIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndUserIdNotEqualTo2() throws Exception {
        OperationLogExample.Criteria result = criteria.andUserIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndUserIdGreaterThan() throws Exception {
        OperationLogExample.Criteria result = criteria.andUserIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testAndUserIdGreaterThan2() throws Exception {
        OperationLogExample.Criteria result = criteria.andUserIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndUserIdGreaterThanOrEqualTo() throws Exception {
        OperationLogExample.Criteria result = criteria.andUserIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndUserIdGreaterThanOrEqualTo2() throws Exception {
        OperationLogExample.Criteria result = criteria.andUserIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndUserIdLessThan() throws Exception {
        OperationLogExample.Criteria result = criteria.andUserIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testAndUserIdLessThan2() throws Exception {
        OperationLogExample.Criteria result = criteria.andUserIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndUserIdLessThanOrEqualTo() throws Exception {
        OperationLogExample.Criteria result = criteria.andUserIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testAndUserIdLessThanOrEqualTo2() throws Exception {
        OperationLogExample.Criteria result = criteria.andUserIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testAndUserIdIn() throws Exception {
        OperationLogExample.Criteria result = criteria.andUserIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndUserIdNotIn() throws Exception {
        OperationLogExample.Criteria result = criteria.andUserIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testAndUserIdBetween() throws Exception {
        OperationLogExample.Criteria result = criteria.andUserIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndUserIdNotBetween() throws Exception {
        OperationLogExample.Criteria result = criteria.andUserIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testAndOperatorIsNull() throws Exception {
        OperationLogExample.Criteria result = criteria.andOperatorIsNull();

    }

    @Test
    public void testAndOperatorIsNotNull() throws Exception {
        OperationLogExample.Criteria result = criteria.andOperatorIsNotNull();

    }

    @Test
    public void testAndOperatorEqualTo() throws Exception {
        OperationLogExample.Criteria result = criteria.andOperatorEqualTo("value");

    }

    @Test
    public void testAndOperatorEqualTo2() throws Exception {
        OperationLogExample.Criteria result = criteria.andOperatorEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndOperatorNotEqualTo() throws Exception {
        OperationLogExample.Criteria result = criteria.andOperatorNotEqualTo("value");

    }

    @Test
    public void testAndOperatorNotEqualTo2() throws Exception {
        OperationLogExample.Criteria result = criteria.andOperatorNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndOperatorGreaterThan() throws Exception {
        OperationLogExample.Criteria result = criteria.andOperatorGreaterThan("value");

    }

    @Test
    public void testAndOperatorGreaterThan2() throws Exception {
        OperationLogExample.Criteria result = criteria.andOperatorGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndOperatorGreaterThanOrEqualTo() throws Exception {
        OperationLogExample.Criteria result = criteria.andOperatorGreaterThanOrEqualTo("value");

    }

    @Test
    public void testAndOperatorGreaterThanOrEqualTo2() throws Exception {
        OperationLogExample.Criteria result = criteria.andOperatorGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndOperatorLessThan() throws Exception {
        OperationLogExample.Criteria result = criteria.andOperatorLessThan("value");

    }

    @Test
    public void testAndOperatorLessThan2() throws Exception {
        OperationLogExample.Criteria result = criteria.andOperatorLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndOperatorLessThanOrEqualTo() throws Exception {
        OperationLogExample.Criteria result = criteria.andOperatorLessThanOrEqualTo("value");

    }

    @Test
    public void testAndOperatorLessThanOrEqualTo2() throws Exception {
        OperationLogExample.Criteria result = criteria.andOperatorLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndOperatorLike() throws Exception {
        OperationLogExample.Criteria result = criteria.andOperatorLike("value");

    }

    @Test
    public void testAndOperatorLike2() throws Exception {
        OperationLogExample.Criteria result = criteria.andOperatorLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndOperatorLikeLeft() throws Exception {
        OperationLogExample.Criteria result = criteria.andOperatorLikeLeft("value");

    }

    @Test
    public void testAndOperatorLikeLeft2() throws Exception {
        OperationLogExample.Criteria result = criteria.andOperatorLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndOperatorLikeRight() throws Exception {
        OperationLogExample.Criteria result = criteria.andOperatorLikeRight("value");

    }

    @Test
    public void testAndOperatorLikeRight2() throws Exception {
        OperationLogExample.Criteria result = criteria.andOperatorLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndOperatorLikeBoth() throws Exception {
        OperationLogExample.Criteria result = criteria.andOperatorLikeBoth("value");

    }

    @Test
    public void testAndOperatorLikeBoth2() throws Exception {
        OperationLogExample.Criteria result = criteria.andOperatorLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndOperatorNotLike() throws Exception {
        OperationLogExample.Criteria result = criteria.andOperatorNotLike("value");

    }

    @Test
    public void testAndOperatorNotLike2() throws Exception {
        OperationLogExample.Criteria result = criteria.andOperatorNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndOperatorNotLikeLeft() throws Exception {
        OperationLogExample.Criteria result = criteria.andOperatorNotLikeLeft("value");

    }

    @Test
    public void testAndOperatorNotLikeLeft2() throws Exception {
        OperationLogExample.Criteria result = criteria.andOperatorNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndOperatorNotLikeRight() throws Exception {
        OperationLogExample.Criteria result = criteria.andOperatorNotLikeRight("value");

    }

    @Test
    public void testAndOperatorNotLikeRight2() throws Exception {
        OperationLogExample.Criteria result = criteria.andOperatorNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndOperatorNotLikeBoth() throws Exception {
        OperationLogExample.Criteria result = criteria.andOperatorNotLikeBoth("value");

    }

    @Test
    public void testAndOperatorNotLikeBoth2() throws Exception {
        OperationLogExample.Criteria result = criteria.andOperatorNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndOperatorIn() throws Exception {
        OperationLogExample.Criteria result = criteria.andOperatorIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndOperatorNotIn() throws Exception {
        OperationLogExample.Criteria result = criteria.andOperatorNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndOperatorBetween() throws Exception {
        OperationLogExample.Criteria result = criteria.andOperatorBetween("value1", "value2");

    }

    @Test
    public void testAndOperatorNotBetween() throws Exception {
        OperationLogExample.Criteria result = criteria.andOperatorNotBetween("value1", "value2");

    }

    @Test
    public void testAndSceneIsNull() throws Exception {
        OperationLogExample.Criteria result = criteria.andSceneIsNull();

    }

    @Test
    public void testAndSceneIsNotNull() throws Exception {
        OperationLogExample.Criteria result = criteria.andSceneIsNotNull();

    }

    @Test
    public void testAndSceneEqualTo() throws Exception {
        OperationLogExample.Criteria result = criteria.andSceneEqualTo("value");

    }

    @Test
    public void testAndSceneEqualTo2() throws Exception {
        OperationLogExample.Criteria result = criteria.andSceneEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndSceneNotEqualTo() throws Exception {
        OperationLogExample.Criteria result = criteria.andSceneNotEqualTo("value");

    }

    @Test
    public void testAndSceneNotEqualTo2() throws Exception {
        OperationLogExample.Criteria result = criteria.andSceneNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndSceneGreaterThan() throws Exception {
        OperationLogExample.Criteria result = criteria.andSceneGreaterThan("value");

    }

    @Test
    public void testAndSceneGreaterThan2() throws Exception {
        OperationLogExample.Criteria result = criteria.andSceneGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndSceneGreaterThanOrEqualTo() throws Exception {
        OperationLogExample.Criteria result = criteria.andSceneGreaterThanOrEqualTo("value");

    }

    @Test
    public void testAndSceneGreaterThanOrEqualTo2() throws Exception {
        OperationLogExample.Criteria result = criteria.andSceneGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndSceneLessThan() throws Exception {
        OperationLogExample.Criteria result = criteria.andSceneLessThan("value");

    }

    @Test
    public void testAndSceneLessThan2() throws Exception {
        OperationLogExample.Criteria result = criteria.andSceneLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndSceneLessThanOrEqualTo() throws Exception {
        OperationLogExample.Criteria result = criteria.andSceneLessThanOrEqualTo("value");

    }

    @Test
    public void testAndSceneLessThanOrEqualTo2() throws Exception {
        OperationLogExample.Criteria result = criteria.andSceneLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndSceneLike() throws Exception {
        OperationLogExample.Criteria result = criteria.andSceneLike("value");

    }

    @Test
    public void testAndSceneLike2() throws Exception {
        OperationLogExample.Criteria result = criteria.andSceneLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndSceneLikeLeft() throws Exception {
        OperationLogExample.Criteria result = criteria.andSceneLikeLeft("value");

    }

    @Test
    public void testAndSceneLikeLeft2() throws Exception {
        OperationLogExample.Criteria result = criteria.andSceneLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndSceneLikeRight() throws Exception {
        OperationLogExample.Criteria result = criteria.andSceneLikeRight("value");

    }

    @Test
    public void testAndSceneLikeRight2() throws Exception {
        OperationLogExample.Criteria result = criteria.andSceneLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndSceneLikeBoth() throws Exception {
        OperationLogExample.Criteria result = criteria.andSceneLikeBoth("value");

    }

    @Test
    public void testAndSceneLikeBoth2() throws Exception {
        OperationLogExample.Criteria result = criteria.andSceneLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndSceneNotLike() throws Exception {
        OperationLogExample.Criteria result = criteria.andSceneNotLike("value");

    }

    @Test
    public void testAndSceneNotLike2() throws Exception {
        OperationLogExample.Criteria result = criteria.andSceneNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndSceneNotLikeLeft() throws Exception {
        OperationLogExample.Criteria result = criteria.andSceneNotLikeLeft("value");

    }

    @Test
    public void testAndSceneNotLikeLeft2() throws Exception {
        OperationLogExample.Criteria result = criteria.andSceneNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndSceneNotLikeRight() throws Exception {
        OperationLogExample.Criteria result = criteria.andSceneNotLikeRight("value");

    }

    @Test
    public void testAndSceneNotLikeRight2() throws Exception {
        OperationLogExample.Criteria result = criteria.andSceneNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndSceneNotLikeBoth() throws Exception {
        OperationLogExample.Criteria result = criteria.andSceneNotLikeBoth("value");

    }

    @Test
    public void testAndSceneNotLikeBoth2() throws Exception {
        OperationLogExample.Criteria result = criteria.andSceneNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndSceneIn() throws Exception {
        OperationLogExample.Criteria result = criteria.andSceneIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndSceneNotIn() throws Exception {
        OperationLogExample.Criteria result = criteria.andSceneNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndSceneBetween() throws Exception {
        OperationLogExample.Criteria result = criteria.andSceneBetween("value1", "value2");

    }

    @Test
    public void testAndSceneNotBetween() throws Exception {
        OperationLogExample.Criteria result = criteria.andSceneNotBetween("value1", "value2");

    }

    @Test
    public void testAndResponseIsNull() throws Exception {
        OperationLogExample.Criteria result = criteria.andResponseIsNull();

    }

    @Test
    public void testAndResponseIsNotNull() throws Exception {
        OperationLogExample.Criteria result = criteria.andResponseIsNotNull();

    }

    @Test
    public void testAndResponseEqualTo() throws Exception {
        OperationLogExample.Criteria result = criteria.andResponseEqualTo("value");

    }

    @Test
    public void testAndResponseEqualTo2() throws Exception {
        OperationLogExample.Criteria result = criteria.andResponseEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndResponseNotEqualTo() throws Exception {
        OperationLogExample.Criteria result = criteria.andResponseNotEqualTo("value");

    }

    @Test
    public void testAndResponseNotEqualTo2() throws Exception {
        OperationLogExample.Criteria result = criteria.andResponseNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndResponseGreaterThan() throws Exception {
        OperationLogExample.Criteria result = criteria.andResponseGreaterThan("value");

    }

    @Test
    public void testAndResponseGreaterThan2() throws Exception {
        OperationLogExample.Criteria result = criteria.andResponseGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndResponseGreaterThanOrEqualTo() throws Exception {
        OperationLogExample.Criteria result = criteria.andResponseGreaterThanOrEqualTo("value");

    }

    @Test
    public void testAndResponseGreaterThanOrEqualTo2() throws Exception {
        OperationLogExample.Criteria result = criteria.andResponseGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndResponseLessThan() throws Exception {
        OperationLogExample.Criteria result = criteria.andResponseLessThan("value");

    }

    @Test
    public void testAndResponseLessThan2() throws Exception {
        OperationLogExample.Criteria result = criteria.andResponseLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndResponseLessThanOrEqualTo() throws Exception {
        OperationLogExample.Criteria result = criteria.andResponseLessThanOrEqualTo("value");

    }

    @Test
    public void testAndResponseLessThanOrEqualTo2() throws Exception {
        OperationLogExample.Criteria result = criteria.andResponseLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndResponseLike() throws Exception {
        OperationLogExample.Criteria result = criteria.andResponseLike("value");

    }

    @Test
    public void testAndResponseLike2() throws Exception {
        OperationLogExample.Criteria result = criteria.andResponseLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndResponseLikeLeft() throws Exception {
        OperationLogExample.Criteria result = criteria.andResponseLikeLeft("value");

    }

    @Test
    public void testAndResponseLikeLeft2() throws Exception {
        OperationLogExample.Criteria result = criteria.andResponseLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndResponseLikeRight() throws Exception {
        OperationLogExample.Criteria result = criteria.andResponseLikeRight("value");

    }

    @Test
    public void testAndResponseLikeRight2() throws Exception {
        OperationLogExample.Criteria result = criteria.andResponseLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndResponseLikeBoth() throws Exception {
        OperationLogExample.Criteria result = criteria.andResponseLikeBoth("value");

    }

    @Test
    public void testAndResponseLikeBoth2() throws Exception {
        OperationLogExample.Criteria result = criteria.andResponseLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndResponseNotLike() throws Exception {
        OperationLogExample.Criteria result = criteria.andResponseNotLike("value");

    }

    @Test
    public void testAndResponseNotLike2() throws Exception {
        OperationLogExample.Criteria result = criteria.andResponseNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndResponseNotLikeLeft() throws Exception {
        OperationLogExample.Criteria result = criteria.andResponseNotLikeLeft("value");

    }

    @Test
    public void testAndResponseNotLikeLeft2() throws Exception {
        OperationLogExample.Criteria result = criteria.andResponseNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndResponseNotLikeRight() throws Exception {
        OperationLogExample.Criteria result = criteria.andResponseNotLikeRight("value");

    }

    @Test
    public void testAndResponseNotLikeRight2() throws Exception {
        OperationLogExample.Criteria result = criteria.andResponseNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndResponseNotLikeBoth() throws Exception {
        OperationLogExample.Criteria result = criteria.andResponseNotLikeBoth("value");

    }

    @Test
    public void testAndResponseNotLikeBoth2() throws Exception {
        OperationLogExample.Criteria result = criteria.andResponseNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndResponseIn() throws Exception {
        OperationLogExample.Criteria result = criteria.andResponseIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndResponseNotIn() throws Exception {
        OperationLogExample.Criteria result = criteria.andResponseNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndResponseBetween() throws Exception {
        OperationLogExample.Criteria result = criteria.andResponseBetween("value1", "value2");

    }

    @Test
    public void testAndResponseNotBetween() throws Exception {
        OperationLogExample.Criteria result = criteria.andResponseNotBetween("value1", "value2");

    }

    @Test
    public void testAndRemoteAddressIsNull() throws Exception {
        OperationLogExample.Criteria result = criteria.andRemoteAddressIsNull();

    }

    @Test
    public void testAndRemoteAddressIsNotNull() throws Exception {
        OperationLogExample.Criteria result = criteria.andRemoteAddressIsNotNull();

    }

    @Test
    public void testAndRemoteAddressEqualTo() throws Exception {
        OperationLogExample.Criteria result = criteria.andRemoteAddressEqualTo("value");

    }

    @Test
    public void testAndRemoteAddressEqualTo2() throws Exception {
        OperationLogExample.Criteria result = criteria.andRemoteAddressEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndRemoteAddressNotEqualTo() throws Exception {
        OperationLogExample.Criteria result = criteria.andRemoteAddressNotEqualTo("value");

    }

    @Test
    public void testAndRemoteAddressNotEqualTo2() throws Exception {
        OperationLogExample.Criteria result = criteria.andRemoteAddressNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndRemoteAddressGreaterThan() throws Exception {
        OperationLogExample.Criteria result = criteria.andRemoteAddressGreaterThan("value");

    }

    @Test
    public void testAndRemoteAddressGreaterThan2() throws Exception {
        OperationLogExample.Criteria result = criteria.andRemoteAddressGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndRemoteAddressGreaterThanOrEqualTo() throws Exception {
        OperationLogExample.Criteria result = criteria.andRemoteAddressGreaterThanOrEqualTo("value");

    }

    @Test
    public void testAndRemoteAddressGreaterThanOrEqualTo2() throws Exception {
        OperationLogExample.Criteria result = criteria.andRemoteAddressGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndRemoteAddressLessThan() throws Exception {
        OperationLogExample.Criteria result = criteria.andRemoteAddressLessThan("value");

    }

    @Test
    public void testAndRemoteAddressLessThan2() throws Exception {
        OperationLogExample.Criteria result = criteria.andRemoteAddressLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testAndRemoteAddressLessThanOrEqualTo() throws Exception {
        OperationLogExample.Criteria result = criteria.andRemoteAddressLessThanOrEqualTo("value");

    }

    @Test
    public void testAndRemoteAddressLessThanOrEqualTo2() throws Exception {
        OperationLogExample.Criteria result = criteria.andRemoteAddressLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testAndRemoteAddressLike() throws Exception {
        OperationLogExample.Criteria result = criteria.andRemoteAddressLike("value");

    }

    @Test
    public void testAndRemoteAddressLike2() throws Exception {
        OperationLogExample.Criteria result = criteria.andRemoteAddressLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndRemoteAddressLikeLeft() throws Exception {
        OperationLogExample.Criteria result = criteria.andRemoteAddressLikeLeft("value");

    }

    @Test
    public void testAndRemoteAddressLikeLeft2() throws Exception {
        OperationLogExample.Criteria result = criteria.andRemoteAddressLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndRemoteAddressLikeRight() throws Exception {
        OperationLogExample.Criteria result = criteria.andRemoteAddressLikeRight("value");

    }

    @Test
    public void testAndRemoteAddressLikeRight2() throws Exception {
        OperationLogExample.Criteria result = criteria.andRemoteAddressLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndRemoteAddressLikeBoth() throws Exception {
        OperationLogExample.Criteria result = criteria.andRemoteAddressLikeBoth("value");

    }

    @Test
    public void testAndRemoteAddressLikeBoth2() throws Exception {
        OperationLogExample.Criteria result = criteria.andRemoteAddressLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndRemoteAddressNotLike() throws Exception {
        OperationLogExample.Criteria result = criteria.andRemoteAddressNotLike("value");

    }

    @Test
    public void testAndRemoteAddressNotLike2() throws Exception {
        OperationLogExample.Criteria result = criteria.andRemoteAddressNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testAndRemoteAddressNotLikeLeft() throws Exception {
        OperationLogExample.Criteria result = criteria.andRemoteAddressNotLikeLeft("value");

    }

    @Test
    public void testAndRemoteAddressNotLikeLeft2() throws Exception {
        OperationLogExample.Criteria result = criteria.andRemoteAddressNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testAndRemoteAddressNotLikeRight() throws Exception {
        OperationLogExample.Criteria result = criteria.andRemoteAddressNotLikeRight("value");

    }

    @Test
    public void testAndRemoteAddressNotLikeRight2() throws Exception {
        OperationLogExample.Criteria result = criteria.andRemoteAddressNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testAndRemoteAddressNotLikeBoth() throws Exception {
        OperationLogExample.Criteria result = criteria.andRemoteAddressNotLikeBoth("value");

    }

    @Test
    public void testAndRemoteAddressNotLikeBoth2() throws Exception {
        OperationLogExample.Criteria result = criteria.andRemoteAddressNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testAndRemoteAddressIn() throws Exception {
        OperationLogExample.Criteria result = criteria.andRemoteAddressIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndRemoteAddressNotIn() throws Exception {
        OperationLogExample.Criteria result = criteria.andRemoteAddressNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testAndRemoteAddressBetween() throws Exception {
        OperationLogExample.Criteria result = criteria.andRemoteAddressBetween("value1", "value2");

    }

    @Test
    public void testAndRemoteAddressNotBetween() throws Exception {
        OperationLogExample.Criteria result = criteria.andRemoteAddressNotBetween("value1", "value2");

    }

    @Test
    public void testAndCreateTimeIsNull() throws Exception {
        OperationLogExample.Criteria result = criteria.andCreateTimeIsNull();

    }

    @Test
    public void testAndCreateTimeIsNotNull() throws Exception {
        OperationLogExample.Criteria result = criteria.andCreateTimeIsNotNull();

    }

    @Test
    public void testAndCreateTimeEqualTo() throws Exception {
        OperationLogExample.Criteria result =
                criteria.andCreateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 11).getTime());

    }

    @Test
    public void testAndCreateTimeEqualTo2() throws Exception {
        OperationLogExample.Criteria result =
                criteria.andCreateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 11).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeNotEqualTo() throws Exception {
        OperationLogExample.Criteria result =
                criteria.andCreateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 11).getTime());

    }

    @Test
    public void testAndCreateTimeNotEqualTo2() throws Exception {
        OperationLogExample.Criteria result =
                criteria.andCreateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 11).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeGreaterThan() throws Exception {
        OperationLogExample.Criteria result =
                criteria.andCreateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 11).getTime());

    }

    @Test
    public void testAndCreateTimeGreaterThan2() throws Exception {
        OperationLogExample.Criteria result =
                criteria.andCreateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 11).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeGreaterThanOrEqualTo() throws Exception {
        OperationLogExample.Criteria result = criteria.andCreateTimeGreaterThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 11).getTime());

    }

    @Test
    public void testAndCreateTimeGreaterThanOrEqualTo2() throws Exception {
        OperationLogExample.Criteria result = criteria.andCreateTimeGreaterThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 11).getTime(), Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeLessThan() throws Exception {
        OperationLogExample.Criteria result =
                criteria.andCreateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 11).getTime());

    }

    @Test
    public void testAndCreateTimeLessThan2() throws Exception {
        OperationLogExample.Criteria result =
                criteria.andCreateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 11).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeLessThanOrEqualTo() throws Exception {
        OperationLogExample.Criteria result = criteria.andCreateTimeLessThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 11).getTime());

    }

    @Test
    public void testAndCreateTimeLessThanOrEqualTo2() throws Exception {
        OperationLogExample.Criteria result = criteria.andCreateTimeLessThanOrEqualTo(
                new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 11).getTime(), Boolean.TRUE);

    }

    @Test
    public void testAndCreateTimeIn() throws Exception {
        OperationLogExample.Criteria result = criteria.andCreateTimeIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 11).getTime()));

    }

    @Test
    public void testAndCreateTimeNotIn() throws Exception {
        OperationLogExample.Criteria result = criteria.andCreateTimeNotIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 11).getTime()));

    }

    @Test
    public void testAndCreateTimeBetween() throws Exception {
        OperationLogExample.Criteria result =
                criteria.andCreateTimeBetween(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 11).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 11).getTime());

    }

    @Test
    public void testAndCreateTimeNotBetween() throws Exception {
        OperationLogExample.Criteria result =
                criteria.andCreateTimeNotBetween(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 11).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 11).getTime());

    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev
// .com/forum#!/testme

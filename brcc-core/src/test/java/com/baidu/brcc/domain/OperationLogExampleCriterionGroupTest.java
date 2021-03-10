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

public class OperationLogExampleCriterionGroupTest {





    OperationLogExample.CriterionGroup criterionGroup = OperationLogExample.newBuilder().build().createCriteria()
            .andGroupCriterion();

    @Before
    public void setUp() {

    }

    @Test
    public void testOr() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup
                .or(new OperationLogExample.Criterion("condition", "value", "secondValue", "typeHandler"));

    }

    @Test
    public void testToCriteria() throws Exception {
        OperationLogExample.Criteria result = criterionGroup.toCriteria();

    }

    @Test
    public void testOrIdIsNull() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orIdIsNull();

    }

    @Test
    public void testOrIdIsNotNull() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orIdIsNotNull();

    }

    @Test
    public void testOrIdEqualTo() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrIdEqualTo2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdNotEqualTo() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrIdNotEqualTo2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdGreaterThan() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testOrIdGreaterThan2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdGreaterThanOrEqualTo() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrIdGreaterThanOrEqualTo2() throws Exception {
        OperationLogExample.CriterionGroup result =
                criterionGroup.orIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdLessThan() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testOrIdLessThan2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdLessThanOrEqualTo() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrIdLessThanOrEqualTo2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrIdIn() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrIdNotIn() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrIdBetween() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrIdNotBetween() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrUserIdIsNull() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orUserIdIsNull();

    }

    @Test
    public void testOrUserIdIsNotNull() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orUserIdIsNotNull();

    }

    @Test
    public void testOrUserIdEqualTo() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orUserIdEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrUserIdEqualTo2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orUserIdEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrUserIdNotEqualTo() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orUserIdNotEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrUserIdNotEqualTo2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orUserIdNotEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrUserIdGreaterThan() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orUserIdGreaterThan(Long.valueOf(1));

    }

    @Test
    public void testOrUserIdGreaterThan2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orUserIdGreaterThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrUserIdGreaterThanOrEqualTo() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orUserIdGreaterThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrUserIdGreaterThanOrEqualTo2() throws Exception {
        OperationLogExample.CriterionGroup result =
                criterionGroup.orUserIdGreaterThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrUserIdLessThan() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orUserIdLessThan(Long.valueOf(1));

    }

    @Test
    public void testOrUserIdLessThan2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orUserIdLessThan(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrUserIdLessThanOrEqualTo() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orUserIdLessThanOrEqualTo(Long.valueOf(1));

    }

    @Test
    public void testOrUserIdLessThanOrEqualTo2() throws Exception {
        OperationLogExample.CriterionGroup result =
                criterionGroup.orUserIdLessThanOrEqualTo(Long.valueOf(1), Boolean.TRUE);

    }

    @Test
    public void testOrUserIdIn() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orUserIdIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrUserIdNotIn() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orUserIdNotIn(Arrays.<Long>asList(Long.valueOf(1)));

    }

    @Test
    public void testOrUserIdBetween() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orUserIdBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrUserIdNotBetween() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orUserIdNotBetween(Long.valueOf(1), Long.valueOf(1));

    }

    @Test
    public void testOrOperatorIsNull() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orOperatorIsNull();

    }

    @Test
    public void testOrOperatorIsNotNull() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orOperatorIsNotNull();

    }

    @Test
    public void testOrOperatorEqualTo() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orOperatorEqualTo("value");

    }

    @Test
    public void testOrOperatorEqualTo2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orOperatorEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrOperatorNotEqualTo() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orOperatorNotEqualTo("value");

    }

    @Test
    public void testOrOperatorNotEqualTo2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orOperatorNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrOperatorGreaterThan() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orOperatorGreaterThan("value");

    }

    @Test
    public void testOrOperatorGreaterThan2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orOperatorGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testOrOperatorGreaterThanOrEqualTo() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orOperatorGreaterThanOrEqualTo("value");

    }

    @Test
    public void testOrOperatorGreaterThanOrEqualTo2() throws Exception {
        OperationLogExample.CriterionGroup result =
                criterionGroup.orOperatorGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrOperatorLessThan() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orOperatorLessThan("value");

    }

    @Test
    public void testOrOperatorLessThan2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orOperatorLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testOrOperatorLessThanOrEqualTo() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orOperatorLessThanOrEqualTo("value");

    }

    @Test
    public void testOrOperatorLessThanOrEqualTo2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orOperatorLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrOperatorLike() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orOperatorLike("value");

    }

    @Test
    public void testOrOperatorLike2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orOperatorLike("value", Boolean.TRUE);

    }

    @Test
    public void testOrOperatorLikeLeft() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orOperatorLikeLeft("value");

    }

    @Test
    public void testOrOperatorLikeLeft2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orOperatorLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testOrOperatorLikeRight() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orOperatorLikeRight("value");

    }

    @Test
    public void testOrOperatorLikeRight2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orOperatorLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testOrOperatorLikeBoth() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orOperatorLikeBoth("value");

    }

    @Test
    public void testOrOperatorLikeBoth2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orOperatorLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testOrOperatorNotLike() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orOperatorNotLike("value");

    }

    @Test
    public void testOrOperatorNotLike2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orOperatorNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testOrOperatorNotLikeLeft() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orOperatorNotLikeLeft("value");

    }

    @Test
    public void testOrOperatorNotLikeLeft2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orOperatorNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testOrOperatorNotLikeRight() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orOperatorNotLikeRight("value");

    }

    @Test
    public void testOrOperatorNotLikeRight2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orOperatorNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testOrOperatorNotLikeBoth() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orOperatorNotLikeBoth("value");

    }

    @Test
    public void testOrOperatorNotLikeBoth2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orOperatorNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testOrOperatorIn() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orOperatorIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testOrOperatorNotIn() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orOperatorNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testOrOperatorBetween() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orOperatorBetween("value1", "value2");

    }

    @Test
    public void testOrOperatorNotBetween() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orOperatorNotBetween("value1", "value2");

    }

    @Test
    public void testOrSceneIsNull() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orSceneIsNull();

    }

    @Test
    public void testOrSceneIsNotNull() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orSceneIsNotNull();

    }

    @Test
    public void testOrSceneEqualTo() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orSceneEqualTo("value");

    }

    @Test
    public void testOrSceneEqualTo2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orSceneEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrSceneNotEqualTo() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orSceneNotEqualTo("value");

    }

    @Test
    public void testOrSceneNotEqualTo2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orSceneNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrSceneGreaterThan() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orSceneGreaterThan("value");

    }

    @Test
    public void testOrSceneGreaterThan2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orSceneGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testOrSceneGreaterThanOrEqualTo() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orSceneGreaterThanOrEqualTo("value");

    }

    @Test
    public void testOrSceneGreaterThanOrEqualTo2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orSceneGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrSceneLessThan() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orSceneLessThan("value");

    }

    @Test
    public void testOrSceneLessThan2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orSceneLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testOrSceneLessThanOrEqualTo() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orSceneLessThanOrEqualTo("value");

    }

    @Test
    public void testOrSceneLessThanOrEqualTo2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orSceneLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrSceneLike() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orSceneLike("value");

    }

    @Test
    public void testOrSceneLike2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orSceneLike("value", Boolean.TRUE);

    }

    @Test
    public void testOrSceneLikeLeft() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orSceneLikeLeft("value");

    }

    @Test
    public void testOrSceneLikeLeft2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orSceneLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testOrSceneLikeRight() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orSceneLikeRight("value");

    }

    @Test
    public void testOrSceneLikeRight2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orSceneLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testOrSceneLikeBoth() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orSceneLikeBoth("value");

    }

    @Test
    public void testOrSceneLikeBoth2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orSceneLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testOrSceneNotLike() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orSceneNotLike("value");

    }

    @Test
    public void testOrSceneNotLike2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orSceneNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testOrSceneNotLikeLeft() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orSceneNotLikeLeft("value");

    }

    @Test
    public void testOrSceneNotLikeLeft2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orSceneNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testOrSceneNotLikeRight() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orSceneNotLikeRight("value");

    }

    @Test
    public void testOrSceneNotLikeRight2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orSceneNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testOrSceneNotLikeBoth() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orSceneNotLikeBoth("value");

    }

    @Test
    public void testOrSceneNotLikeBoth2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orSceneNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testOrSceneIn() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orSceneIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testOrSceneNotIn() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orSceneNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testOrSceneBetween() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orSceneBetween("value1", "value2");

    }

    @Test
    public void testOrSceneNotBetween() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orSceneNotBetween("value1", "value2");

    }

    @Test
    public void testOrResponseIsNull() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orResponseIsNull();

    }

    @Test
    public void testOrResponseIsNotNull() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orResponseIsNotNull();

    }

    @Test
    public void testOrResponseEqualTo() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orResponseEqualTo("value");

    }

    @Test
    public void testOrResponseEqualTo2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orResponseEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrResponseNotEqualTo() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orResponseNotEqualTo("value");

    }

    @Test
    public void testOrResponseNotEqualTo2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orResponseNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrResponseGreaterThan() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orResponseGreaterThan("value");

    }

    @Test
    public void testOrResponseGreaterThan2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orResponseGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testOrResponseGreaterThanOrEqualTo() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orResponseGreaterThanOrEqualTo("value");

    }

    @Test
    public void testOrResponseGreaterThanOrEqualTo2() throws Exception {
        OperationLogExample.CriterionGroup result =
                criterionGroup.orResponseGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrResponseLessThan() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orResponseLessThan("value");

    }

    @Test
    public void testOrResponseLessThan2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orResponseLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testOrResponseLessThanOrEqualTo() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orResponseLessThanOrEqualTo("value");

    }

    @Test
    public void testOrResponseLessThanOrEqualTo2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orResponseLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrResponseLike() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orResponseLike("value");

    }

    @Test
    public void testOrResponseLike2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orResponseLike("value", Boolean.TRUE);

    }

    @Test
    public void testOrResponseLikeLeft() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orResponseLikeLeft("value");

    }

    @Test
    public void testOrResponseLikeLeft2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orResponseLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testOrResponseLikeRight() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orResponseLikeRight("value");

    }

    @Test
    public void testOrResponseLikeRight2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orResponseLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testOrResponseLikeBoth() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orResponseLikeBoth("value");

    }

    @Test
    public void testOrResponseLikeBoth2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orResponseLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testOrResponseNotLike() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orResponseNotLike("value");

    }

    @Test
    public void testOrResponseNotLike2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orResponseNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testOrResponseNotLikeLeft() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orResponseNotLikeLeft("value");

    }

    @Test
    public void testOrResponseNotLikeLeft2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orResponseNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testOrResponseNotLikeRight() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orResponseNotLikeRight("value");

    }

    @Test
    public void testOrResponseNotLikeRight2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orResponseNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testOrResponseNotLikeBoth() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orResponseNotLikeBoth("value");

    }

    @Test
    public void testOrResponseNotLikeBoth2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orResponseNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testOrResponseIn() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orResponseIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testOrResponseNotIn() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orResponseNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testOrResponseBetween() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orResponseBetween("value1", "value2");

    }

    @Test
    public void testOrResponseNotBetween() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orResponseNotBetween("value1", "value2");

    }

    @Test
    public void testOrRemoteAddressIsNull() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orRemoteAddressIsNull();

    }

    @Test
    public void testOrRemoteAddressIsNotNull() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orRemoteAddressIsNotNull();

    }

    @Test
    public void testOrRemoteAddressEqualTo() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orRemoteAddressEqualTo("value");

    }

    @Test
    public void testOrRemoteAddressEqualTo2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orRemoteAddressEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrRemoteAddressNotEqualTo() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orRemoteAddressNotEqualTo("value");

    }

    @Test
    public void testOrRemoteAddressNotEqualTo2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orRemoteAddressNotEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrRemoteAddressGreaterThan() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orRemoteAddressGreaterThan("value");

    }

    @Test
    public void testOrRemoteAddressGreaterThan2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orRemoteAddressGreaterThan("value", Boolean.TRUE);

    }

    @Test
    public void testOrRemoteAddressGreaterThanOrEqualTo() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orRemoteAddressGreaterThanOrEqualTo("value");

    }

    @Test
    public void testOrRemoteAddressGreaterThanOrEqualTo2() throws Exception {
        OperationLogExample.CriterionGroup result =
                criterionGroup.orRemoteAddressGreaterThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrRemoteAddressLessThan() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orRemoteAddressLessThan("value");

    }

    @Test
    public void testOrRemoteAddressLessThan2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orRemoteAddressLessThan("value", Boolean.TRUE);

    }

    @Test
    public void testOrRemoteAddressLessThanOrEqualTo() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orRemoteAddressLessThanOrEqualTo("value");

    }

    @Test
    public void testOrRemoteAddressLessThanOrEqualTo2() throws Exception {
        OperationLogExample.CriterionGroup result =
                criterionGroup.orRemoteAddressLessThanOrEqualTo("value", Boolean.TRUE);

    }

    @Test
    public void testOrRemoteAddressLike() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orRemoteAddressLike("value");

    }

    @Test
    public void testOrRemoteAddressLike2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orRemoteAddressLike("value", Boolean.TRUE);

    }

    @Test
    public void testOrRemoteAddressLikeLeft() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orRemoteAddressLikeLeft("value");

    }

    @Test
    public void testOrRemoteAddressLikeLeft2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orRemoteAddressLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testOrRemoteAddressLikeRight() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orRemoteAddressLikeRight("value");

    }

    @Test
    public void testOrRemoteAddressLikeRight2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orRemoteAddressLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testOrRemoteAddressLikeBoth() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orRemoteAddressLikeBoth("value");

    }

    @Test
    public void testOrRemoteAddressLikeBoth2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orRemoteAddressLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testOrRemoteAddressNotLike() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orRemoteAddressNotLike("value");

    }

    @Test
    public void testOrRemoteAddressNotLike2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orRemoteAddressNotLike("value", Boolean.TRUE);

    }

    @Test
    public void testOrRemoteAddressNotLikeLeft() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orRemoteAddressNotLikeLeft("value");

    }

    @Test
    public void testOrRemoteAddressNotLikeLeft2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orRemoteAddressNotLikeLeft("value", Boolean.TRUE);

    }

    @Test
    public void testOrRemoteAddressNotLikeRight() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orRemoteAddressNotLikeRight("value");

    }

    @Test
    public void testOrRemoteAddressNotLikeRight2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orRemoteAddressNotLikeRight("value", Boolean.TRUE);

    }

    @Test
    public void testOrRemoteAddressNotLikeBoth() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orRemoteAddressNotLikeBoth("value");

    }

    @Test
    public void testOrRemoteAddressNotLikeBoth2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orRemoteAddressNotLikeBoth("value", Boolean.TRUE);

    }

    @Test
    public void testOrRemoteAddressIn() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orRemoteAddressIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testOrRemoteAddressNotIn() throws Exception {
        OperationLogExample.CriterionGroup result =
                criterionGroup.orRemoteAddressNotIn(Arrays.<String>asList("String"));

    }

    @Test
    public void testOrRemoteAddressBetween() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orRemoteAddressBetween("value1", "value2");

    }

    @Test
    public void testOrRemoteAddressNotBetween() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orRemoteAddressNotBetween("value1", "value2");

    }

    @Test
    public void testOrCreateTimeIsNull() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orCreateTimeIsNull();

    }

    @Test
    public void testOrCreateTimeIsNotNull() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orCreateTimeIsNotNull();

    }

    @Test
    public void testOrCreateTimeEqualTo() throws Exception {
        OperationLogExample.CriterionGroup result =
                criterionGroup.orCreateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 11).getTime());

    }

    @Test
    public void testOrCreateTimeEqualTo2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup
                .orCreateTimeEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 11).getTime(), Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeNotEqualTo() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup
                .orCreateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 11).getTime());

    }

    @Test
    public void testOrCreateTimeNotEqualTo2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup
                .orCreateTimeNotEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 11).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeGreaterThan() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup
                .orCreateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 11).getTime());

    }

    @Test
    public void testOrCreateTimeGreaterThan2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup
                .orCreateTimeGreaterThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 11).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeGreaterThanOrEqualTo() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup
                .orCreateTimeGreaterThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 11).getTime());

    }

    @Test
    public void testOrCreateTimeGreaterThanOrEqualTo2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup
                .orCreateTimeGreaterThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 11).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeLessThan() throws Exception {
        OperationLogExample.CriterionGroup result =
                criterionGroup.orCreateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 11).getTime());

    }

    @Test
    public void testOrCreateTimeLessThan2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup
                .orCreateTimeLessThan(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 11).getTime(), Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeLessThanOrEqualTo() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup
                .orCreateTimeLessThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 11).getTime());

    }

    @Test
    public void testOrCreateTimeLessThanOrEqualTo2() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup
                .orCreateTimeLessThanOrEqualTo(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 11).getTime(),
                        Boolean.TRUE);

    }

    @Test
    public void testOrCreateTimeIn() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orCreateTimeIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 11).getTime()));

    }

    @Test
    public void testOrCreateTimeNotIn() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup.orCreateTimeNotIn(
                Arrays.<Date>asList(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 11).getTime()));

    }

    @Test
    public void testOrCreateTimeBetween() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup
                .orCreateTimeBetween(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 11).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 11).getTime());

    }

    @Test
    public void testOrCreateTimeNotBetween() throws Exception {
        OperationLogExample.CriterionGroup result = criterionGroup
                .orCreateTimeNotBetween(new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 11).getTime(),
                        new GregorianCalendar(2021, Calendar.MARCH, 10, 11, 11).getTime());

    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev
// .com/forum#!/testme

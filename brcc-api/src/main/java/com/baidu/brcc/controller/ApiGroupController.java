package com.baidu.brcc.controller;

import com.baidu.brcc.annotation.LoginUser;
import com.baidu.brcc.annotation.SaveLog;
import com.baidu.brcc.domain.ApiToken;
import com.baidu.brcc.domain.ConfigGroup;
import com.baidu.brcc.domain.User;
import com.baidu.brcc.domain.base.R;
import com.baidu.brcc.domain.em.Deleted;
import com.baidu.brcc.service.ApiTokenCacheService;
import com.baidu.brcc.service.ConfigGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.baidu.brcc.common.ErrorStatusMsg.GROUP_ID_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.GROUP_ID_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.GROUP_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.GROUP_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.NON_LOGIN_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.NON_LOGIN_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PRIV_MIS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PRIV_MIS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_API_TOKEN_NOT_EMPTY_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_API_TOKEN_NOT_EMPTY_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_API_TOKEN_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_API_TOKEN_NOT_EXISTS_STATUS;
import static org.apache.commons.lang3.StringUtils.isBlank;

/**
 * open api 产品线相关接口
 */
@RestController
@RequestMapping("api")
public class ApiGroupController {

    @Autowired
    ApiTokenCacheService apiTokenCacheService;

    @Autowired
    ConfigGroupService groupService;

    /**
     * 根据分组ID删除分组
     *
     * @param groupId
     * @return
     */
    @SaveLog(scene = "0006",
            paramsIdxes = {0},
            params = {"groupId"})
    @PostMapping("/group/delete/{groupId}")
    public R<Long> deleteGroup(@PathVariable("groupId") Long groupId, String token) {
        if (isBlank(token)) {
            return R.error(PROJECT_API_TOKEN_NOT_EMPTY_STATUS, PROJECT_API_TOKEN_NOT_EMPTY_MSG);
        }
        ApiToken apiToken = apiTokenCacheService.getApiToken(token);
        if (apiToken == null) {
            return R.error(PROJECT_API_TOKEN_NOT_EXISTS_STATUS, PROJECT_API_TOKEN_NOT_EXISTS_MSG);
        }
        if (null == groupId || groupId <= 0) {
            return R.error(GROUP_ID_NOT_EXISTS_STATUS, GROUP_ID_NOT_EXISTS_MSG);
        }
        ConfigGroup configGroup = groupService.selectByPrimaryKey(groupId);
        if (configGroup == null || Deleted.DELETE.getValue().equals(configGroup.getDeleted())) {
            return R.error(GROUP_NOT_EXISTS_STATUS, GROUP_NOT_EXISTS_MSG);
        }
        // 删除分组及失效缓存
        Long del = Long.valueOf(groupService.deleteCascadeByGroupId(groupId));
        return R.ok(del);
    }

}

package com.baidu.brcc.controller;


import com.baidu.brcc.annotation.SaveLog;
import com.baidu.brcc.domain.Product;
import com.baidu.brcc.domain.Project;
import com.baidu.brcc.domain.ProjectExample;
import com.baidu.brcc.domain.User;
import com.baidu.brcc.domain.base.R;
import com.baidu.brcc.domain.em.Deleted;
import com.baidu.brcc.domain.em.ProjectType;
import com.baidu.brcc.domain.em.UserRole;
import com.baidu.brcc.domain.meta.MetaProject;
import com.baidu.brcc.domain.vo.ApiProjectReqVo;
import com.baidu.brcc.service.ApiTokenService;
import com.baidu.brcc.service.ProductService;
import com.baidu.brcc.service.ProductUserService;
import com.baidu.brcc.service.ProjectService;
import com.baidu.brcc.service.UserCache;
import com.baidu.brcc.service.UserService;
import com.baidu.brcc.utils.bcrypt.Md5Util;
import com.baidu.brcc.utils.time.DateTimeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.UUID;

import static com.baidu.brcc.common.ErrorStatusMsg.PRIV_MIS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PRIV_MIS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PRODUCT_NAME_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PRODUCT_NAME_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PRODUCT_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PRODUCT_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_API_PASSWORD_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_API_PASSWORD_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_NAME_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_NAME_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_NAME_NOT_EXISTS_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_NAME_NOT_EXISTS_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_TYPE_NOT_AVAILABLE_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.PROJECT_TYPE_NOT_AVAILABLE_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.TYPE_NULL_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.TYPE_NULL_STATUS;
import static com.baidu.brcc.common.ErrorStatusMsg.USER_NAME_EMPTY_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.USER_NAME_EMPTY_STATUS;
import static org.apache.commons.lang3.StringUtils.isBlank;

/**
 * open api 工程相关接口
 */
@RestController
@RequestMapping("api")
public class ApiProjectController {

    @Value("${rcc.user.type.default}")
    private byte defaultUserType;

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductUserService productUserService;

    @Autowired
    private UserCache userCache;

    @Autowired
    private UserService userService;

    @Autowired
    private ProjectService projectService;

    @Autowired
    private ApiTokenService apiTokenService;

    /**
     * add project by userName
     *
     * @param apiProjectReqVo project info
     * @return
     */
    @SaveLog(scene = "0024",
            paramsIdxes = {0},
            params = {"projectReq"})
    @PostMapping("projectAdd")
    public R<Long> addProject(@RequestBody ApiProjectReqVo apiProjectReqVo) {
        String productName = apiProjectReqVo.getProductName();
        String userName = apiProjectReqVo.getUserName();
        String name = apiProjectReqVo.getName();
        String apiPassword = apiProjectReqVo.getApiPassword();
        Byte projectType = apiProjectReqVo.getProjectType();
        if (projectType == null) {
            return R.error(TYPE_NULL_STATUS, TYPE_NULL_MSG);
        }
        if (!ProjectType.PRIVATE.getValue().equals(projectType) && !ProjectType.PUBLIC.getValue()
                .equals(projectType)) {
            return R.error(PROJECT_TYPE_NOT_AVAILABLE_STATUS, PROJECT_TYPE_NOT_AVAILABLE_MSG);
        }
        if (productName == null || isBlank(productName)) {
            return R.error(PRODUCT_NAME_NOT_EXISTS_STATUS, PRODUCT_NAME_NOT_EXISTS_MSG);
        }
        if (userName == null || isBlank(userName)) {
            return R.error(USER_NAME_EMPTY_STATUS, USER_NAME_EMPTY_MSG);
        }
        if (name == null || isBlank(name)) {
            return R.error(PROJECT_NAME_NOT_EXISTS_STATUS, PROJECT_NAME_NOT_EXISTS_MSG);
        }
        if (apiPassword == null || isBlank(apiPassword)) {
            return R.error(PROJECT_API_PASSWORD_NOT_EXISTS_STATUS, PROJECT_API_PASSWORD_NOT_EXISTS_MSG);
        }
        String token = UUID.randomUUID().toString().replace("-", "");
        Product product = productService.selectByName(productName);
        if (product == null) {
            return R.error(PRODUCT_NOT_EXISTS_STATUS, PRODUCT_NOT_EXISTS_MSG);
        }
        User user = userCache.getUserByName(userName);
        if (user == null) {
            userService.addUserIfNotExist(userName, UserRole.NORMAL.getValue(), defaultUserType);
            user = userCache.getUserByName(userName);
        }
        // only for product manager
        if (!productUserService.checkAuth(product.getId(), user)) {
            return R.error(PRIV_MIS_STATUS, PRIV_MIS_MSG);
        }
        Project project = projectService.selectOneByExample(ProjectExample.newBuilder()
                        .build()
                        .createCriteria()
                        .andDeletedEqualTo(Deleted.OK.getValue())
                        // 工程名全局唯一
                        .andNameEqualTo(name)
                        .toExample(),
                MetaProject.COLUMN_NAME_ID
        );
        if (project != null) {
            return R.error(PROJECT_NAME_EXISTS_STATUS, PROJECT_NAME_EXISTS_MSG);
        }
        Date now = DateTimeUtils.now();
        String pwd = Md5Util.md5(apiPassword);
        Project insert = new Project();
        insert.setUpdateTime(now);
        insert.setCreateTime(now);
        insert.setDeleted(Deleted.OK.getValue());
        insert.setName(name);
        insert.setMemo(apiProjectReqVo.getMemo());
        insert.setProjectType(projectType);
        insert.setProductId(product.getId());
        insert.setApiPassword(pwd);
        insert.setApiToken(token);
        projectService.insertSelective(insert);
        Long id = insert.getId();

        // 保存token
        apiTokenService.save(token, id, name);
        return R.ok(id);
    }

}

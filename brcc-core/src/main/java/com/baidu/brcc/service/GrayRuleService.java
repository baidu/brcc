package com.baidu.brcc.service;

import com.baidu.brcc.domain.GrayRule;
import com.baidu.brcc.domain.GrayRuleExample;
import com.baidu.brcc.domain.User;
import com.baidu.brcc.domain.vo.GrayRuleReq;
import com.baidu.brcc.service.base.GenericService;
import java.util.List;

public interface GrayRuleService extends GenericService<GrayRule, Long, GrayRuleExample> {
    Long saveGrayRule(Long grayVersionId, GrayRuleReq grayRuleReq, User loginUser);

    List<GrayRule> selectByGrayVersionId(Long grayVersionId);


}

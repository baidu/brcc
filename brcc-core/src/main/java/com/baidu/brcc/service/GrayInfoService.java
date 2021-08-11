package com.baidu.brcc.service;

import com.baidu.brcc.domain.GrayInfo;
import com.baidu.brcc.domain.GrayInfoExample;
import com.baidu.brcc.domain.User;
import com.baidu.brcc.domain.vo.GrayRuleReq;
import com.baidu.brcc.service.base.GenericService;

import java.util.List;

public interface GrayInfoService extends GenericService<GrayInfo, Long, GrayInfoExample> {
    List<GrayInfo> selectByIds(List<Long> ids);

    Long saveGrayInfo(GrayRuleReq grayRuleReq, User loginUser);


}

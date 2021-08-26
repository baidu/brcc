package com.baidu.brcc.domain.vo;

import lombok.Data;

import java.util.List;

@Data
public class GrayAddReq {
    // 灰度版本ID
    private Long grayVersionId;

    // 灰度规则详情
    private List<GrayRuleReq> grayRuleReqs;
}

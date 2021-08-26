package com.baidu.brcc.domain.vo;

import lombok.Data;

@Data
public class GrayRuleReq {
    // 规则ID
    private Long grayInfoId;

    // 规则名称
    private String ruleName;

    // 规则内容
    private String ruleContent;
}

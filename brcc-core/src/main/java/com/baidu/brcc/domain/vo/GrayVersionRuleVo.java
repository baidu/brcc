package com.baidu.brcc.domain.vo;

import lombok.Data;

@Data
public class GrayVersionRuleVo {

    // 灰度内容ID
    private Long grayInfoId;

    // 规则名称
    private String ruleName;

    // 规则内容
    private String ruleContent;
}

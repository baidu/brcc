package com.baidu.brcc.rule;

import java.util.Map;

public interface GrayHitRule {

    boolean hit(Long grayVersionId, String ruleContent, Map<String, String> content);
}

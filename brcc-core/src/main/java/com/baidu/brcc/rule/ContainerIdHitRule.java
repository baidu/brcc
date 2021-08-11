package com.baidu.brcc.rule;

import org.springframework.stereotype.Component;

import java.util.Map;

@Component("containerId")
public class ContainerIdHitRule implements GrayHitRule {
    @Override
    public boolean hit(Long grayVersionId, String ruleContent, Map<String, String> content) {
        // containerId判断
        String containerId = content.get("containerId");
        String[] spilt = ruleContent.split(",");
        for (String item : spilt) {
            if (containerId.equals(item)) {
                return true;
            }
        }
        return false;
    }
}


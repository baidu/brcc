package com.baidu.brcc.rule;

import org.springframework.stereotype.Component;

import java.util.Map;

@Component("ip")
public class IpGrayHitRule implements GrayHitRule {
    @Override
    public boolean hit(Long grayVersionId, String ruleContent, Map<String, String> content) {
        // IP判断
        String ip = content.get("ip");
        String[] spilt = ruleContent.split(",");
        for (String item : spilt) {
            if (ip.equals(item)) {
                return true;
            }
        }
            return false;
        }
    }


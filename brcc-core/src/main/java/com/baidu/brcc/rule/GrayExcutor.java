package com.baidu.brcc.rule;

import com.baidu.brcc.domain.GrayInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class GrayExcutor {

    @Autowired
    private GrayHitRuleStrategy grayHitRuleStrategy;

    public boolean hit(List<GrayInfo> grayInfos, Long grayVersionId, Map<String, String> content) {
        return grayInfos.stream().allMatch(grayInfo -> grayHitRuleStrategy.getRule(grayInfo).hit(grayVersionId, grayInfo.getRuleContent(), content));
    }


}

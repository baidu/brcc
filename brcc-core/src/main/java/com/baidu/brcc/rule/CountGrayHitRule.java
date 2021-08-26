package com.baidu.brcc.rule;


import com.baidu.brcc.service.BrccInstanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

import static org.apache.commons.lang3.StringUtils.trim;

@Component("count")
public class CountGrayHitRule implements GrayHitRule {

    @Autowired
    private BrccInstanceService brccInstanceService;

    @Override
    public boolean hit(Long grayVersionId, String ruleContent, Map<String, String> content) {
        // 数量判断
        long max = Long.parseLong(ruleContent);
        long count = brccInstanceService.countByGrayVersionId(grayVersionId);
        return count < max;
    }


}

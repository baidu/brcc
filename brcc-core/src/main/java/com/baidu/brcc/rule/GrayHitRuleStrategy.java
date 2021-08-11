package com.baidu.brcc.rule;

import com.baidu.brcc.domain.GrayInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GrayHitRuleStrategy {

    @Autowired
    private CountGrayHitRule countGrayHitRule;

    @Autowired
    private IpGrayHitRule ipGrayHitRule;

    @Autowired
    private ContainerIdHitRule containerIdHitRule;

    @Autowired
    private IdcGrayHitRule idcGrayHitRule;

    public GrayHitRule getRule(GrayInfo grayInfo) {
        if (grayInfo.getRuleBean().equals("count")) {
            return countGrayHitRule;
        }
        if (grayInfo.getRuleBean().equals("ip")){
        return ipGrayHitRule;
    }
        if (grayInfo.getRuleBean().equals("containerId")) {
            return containerIdHitRule;
        }
        if (grayInfo.getRuleBean().equals("idc")) {
            return idcGrayHitRule;
        }
        return null;
    }

}

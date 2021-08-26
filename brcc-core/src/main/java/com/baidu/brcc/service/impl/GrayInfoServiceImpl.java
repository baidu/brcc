package com.baidu.brcc.service.impl;

import com.baidu.brcc.dao.GrayInfoMapper;
import com.baidu.brcc.dao.base.BaseMapper;
import com.baidu.brcc.domain.GrayInfo;
import com.baidu.brcc.domain.GrayInfoExample;
import com.baidu.brcc.domain.GrayInfo;
import com.baidu.brcc.domain.GrayInfoExample;
import com.baidu.brcc.domain.GrayRule;
import com.baidu.brcc.domain.GrayRuleExample;
import com.baidu.brcc.domain.User;
import com.baidu.brcc.domain.exception.BizException;
import com.baidu.brcc.domain.vo.GrayRuleReq;
import com.baidu.brcc.service.GrayInfoService;
import com.baidu.brcc.service.VersionService;
import com.baidu.brcc.service.base.GenericServiceImpl;
import com.baidu.brcc.utils.time.DateTimeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static com.baidu.brcc.common.ErrorStatusMsg.GRAY_RULE_EXIST_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.GRAY_RULE_EXIST_STATUS;

@Service("grayInfoService")
public class GrayInfoServiceImpl extends GenericServiceImpl<GrayInfo, Long, GrayInfoExample> implements GrayInfoService {
    @Autowired
    private GrayInfoMapper GrayInfoMapper;

    @Autowired
    private VersionService versionService;

    @Override
    public BaseMapper<GrayInfo, Long, GrayInfoExample> getMapper() {
        return GrayInfoMapper;
    }

    @Override
    public GrayInfoExample newExample() {
        return GrayInfoExample.newBuilder().build();
    }

    @Override
    public GrayInfoExample newIdInExample(List<Long> ids) {
        return GrayInfoExample.newBuilder().build().createCriteria().andIdIn(ids).toExample();
    }

    @Override
    public List<GrayInfo> selectByIds(List<Long> ids) {
        List<GrayInfo> grayInfos = new ArrayList<>();
        for (Long id : ids) {
            GrayInfo item = selectByPrimaryKey(id);
            grayInfos.add(item);
        }
        return grayInfos;
    }

    @Override
    public Long saveGrayInfo(GrayRuleReq grayRuleReq, User loginUser) {
        Long grayInfoId = grayRuleReq.getGrayInfoId();
        Long id = null;
        String ruleName = grayRuleReq.getRuleName();
        String ruleContent = grayRuleReq.getRuleContent();
        if (grayInfoId == null || grayInfoId <= 0) {
            // 新增
            Date now = DateTimeUtils.now();
            GrayInfo insert = GrayInfo.newBuilder()
                    .ruleName(ruleName)
                    .ruleContent(ruleContent)
                    .ruleBean(ruleName)
                    .updateTime(now)
                    .createTime(now)
                    .build();
            insert(insert);
            id = insert.getId();
        } else {
            // 更新
            GrayInfo update = selectByPrimaryKey(grayInfoId);
            update.setRuleName(ruleName);
            update.setRuleContent(ruleContent);
            updateByPrimaryKeySelective(update);
            id = update.getId();
        }
        return id;
    }
}

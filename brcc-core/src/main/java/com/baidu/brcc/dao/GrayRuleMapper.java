package com.baidu.brcc.dao;

import com.baidu.brcc.dao.base.BaseMapper;
import com.baidu.brcc.domain.GrayRule;
import com.baidu.brcc.domain.GrayRuleExample;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GrayRuleMapper extends BaseMapper<GrayRule, Long, GrayRuleExample> {
}

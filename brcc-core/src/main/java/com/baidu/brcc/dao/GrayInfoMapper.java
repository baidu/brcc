package com.baidu.brcc.dao;

import com.baidu.brcc.dao.base.BaseMapper;
import com.baidu.brcc.domain.GrayInfo;
import com.baidu.brcc.domain.GrayInfoExample;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GrayInfoMapper extends BaseMapper<GrayInfo, Long, GrayInfoExample> {
}

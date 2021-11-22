package com.baidu.brcc.dao;

import com.baidu.brcc.domain.ApiCount;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ApiCountMapper {

    List<ApiCount> queryByProductCacheKey(@Param("productCacheKey") String productCacheKey);

    int updateApiCount(ApiCount apiCount);

    int insertApiCount(ApiCount apiCount);

    List<ApiCount> queryByProductCacheKeys(@Param("productCacheKeys") List<String> productCacheKeys);
}

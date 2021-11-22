package com.baidu.brcc.service;

import com.baidu.brcc.domain.ApiCount;

import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public interface ApiCountService {

    ApiCount queryByCacheKey(String cacheKey);

    boolean insertOrUpdateApiCount(String productName, String cacheKey, Map<String, AtomicLong> apiCountCache);

    boolean insertApiCount(String productName, String cacheKey, Map<String, AtomicLong> apiCountCache);

    List<ApiCount> queryByProductCacheKeys(List<String> productCacheKeys);
}

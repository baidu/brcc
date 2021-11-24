package com.baidu.brcc.service.impl;

import com.baidu.brcc.dao.ApiCountMapper;
import com.baidu.brcc.domain.ApiCount;
import com.baidu.brcc.service.ApiCountService;
import com.baidu.brcc.utils.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class ApiCountServiceImpl implements ApiCountService {

    private final Logger logger = LoggerFactory.getLogger(ApiCountServiceImpl.class);

    @Autowired
    private ApiCountMapper apiCountMapper;

    @Override
    public ApiCount queryByCacheKey(String cacheKey) {
        List<ApiCount> apiCountList = apiCountMapper.queryByProductCacheKey(cacheKey);
        if (!CollectionUtils.isEmpty(apiCountList)) {
            Optional<ApiCount> apiCount = apiCountList.stream().findFirst();
            return apiCount.get();
        }
        return null;
    }

    @Override
    public boolean insertOrUpdateApiCount(String productName, String cacheKey, Map<String, AtomicLong> apiCountCache) {
        while (true) {
            ApiCount cur = queryByCacheKey(cacheKey);
            if (cur == null) {
                // 尝试insert一下
                try {
                    insertApiCount(productName, cacheKey, apiCountCache);
                    break;
                } catch (DuplicateKeyException e) {
                    // 插入失败，重新查询一次
                    cur = queryByCacheKey(cacheKey);
                }
            }
            AtomicLong curCount = apiCountCache.get(cacheKey);
            cur.setProductCount(cur.getProductCount() + curCount.get());
            int res = apiCountMapper.updateApiCount(cur);
            if (res == 1) {
                break;
            }
            logger.info("cacheKey : {} update failed, will retry", cacheKey);
        }
        return true;
    }

    @Override
    public boolean insertApiCount(String productName, String cacheKey, Map<String, AtomicLong> apiCountCache) {
        ApiCount apiCount = new ApiCount();
        apiCount.setProductName(productName);
        AtomicLong curCount = apiCountCache.get(cacheKey);
        apiCount.setProductCount(curCount.get());
        apiCount.setProductCacheKey(cacheKey);
        apiCount.setVersion(0l);
        apiCount.setCreateTime(new Date());
        int result = apiCountMapper.insertApiCount(apiCount);
        return result == 1;
    }

    @Override
    public List<ApiCount> queryByProductCacheKeys(List<String> productCacheKeys) {
        return apiCountMapper.queryByProductCacheKeys(productCacheKeys);
    }

}

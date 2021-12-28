package com.baidu.brcc.interceptor;

import com.baidu.brcc.domain.ApiToken;
import com.baidu.brcc.domain.Product;
import com.baidu.brcc.domain.Project;
import com.baidu.brcc.service.ApiCountService;
import com.baidu.brcc.service.ApiTokenService;
import com.baidu.brcc.service.ProductService;
import com.baidu.brcc.service.ProjectService;
import com.baidu.brcc.utils.collections.CollectionUtils;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;

public class ApiCountInterceptor implements HandlerInterceptor {

    private final Logger logger = LoggerFactory.getLogger(ApiCountInterceptor.class);

    private boolean enableApiCount;

    public ApiCountInterceptor(boolean enableApiCount) {
        this.enableApiCount = enableApiCount;
    }

    /**
     * 本地缓存一份token与product的映射
     */
    private Map<String, String> token2Product = Maps.newConcurrentMap();

    /**
     * 本地缓存一份产品线的所有api调用次数
     */
    private Map<String, AtomicLong> apiCountCache = Maps.newConcurrentMap();

    private ReentrantLock lock = new ReentrantLock();

    @Autowired
    private ApiTokenService apiTokenService;

    @Autowired
    private ProjectService projectService;

    @Autowired
    private ProductService productService;

    @Autowired
    private ApiCountService apiCountService;

    @Value("${rcc.countInterval:1}")
    private int interval;

    /**
     * 定时线程，用于同步本地缓存至redis
     */
    private ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;

    public void init() {
        if (scheduledThreadPoolExecutor == null) {
            scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactory() {
                @Override
                public Thread newThread(Runnable r) {
                    Thread t = new Thread(r, "brcc-syncApiCount-threadPool");
                    t.setDaemon(true);
                    return t;
                }
            });
        }
        scheduledThreadPoolExecutor.scheduleWithFixedDelay(() -> {
            try {
                insertOrUpdateApiCountInfo();
            } catch (Exception e) {
                logger.warn("thread exception throw, due to {}", e.getMessage(), e);
            }
        }, interval, interval, TimeUnit.MINUTES);
    }

    public void insertOrUpdateApiCountInfo() {
        // 获取当前本地缓存的所有产品线
        if (!CollectionUtils.isEmpty(token2Product)) {
            Collection<String> productNames = token2Product.values();
            for (String productName : productNames) {
                String cacheKey = generateKey(productName);
                if (apiCountCache.containsKey(cacheKey)) {
                    insertOrUpdateApiCount(productName, cacheKey, apiCountCache);
                }
            }
        }
    }

    private void insertOrUpdateApiCount(String productName, String cacheKey, Map<String, AtomicLong> apiCountCache) {
        if (apiCountCache.containsKey(cacheKey)) {
            try {
                apiCountService.insertOrUpdateApiCount(productName, cacheKey, apiCountCache);
                // 更新成功后重置计数
                lock.lock();
                apiCountCache.put(cacheKey, new AtomicLong(0));
            } catch (Exception e) {
                logger.warn("{} insert or update api count failed, due to {}", cacheKey, e.getMessage(), e);
            } finally {
                lock.unlock();
            }
        }
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (enableApiCount) {
            String query = request.getQueryString();
            if (StringUtils.isBlank(query)) {
                return true;
            }
            String[] queryParams = query.split("&");
            if (queryParams == null || queryParams.length == 0) {
                return true;
            }
            String token = null;
            for (int i = 0; i < queryParams.length; i++) {
                if (queryParams[i].startsWith("token")) {
                    String param = queryParams[i];
                    token = param.split("=")[1];
                    break;
                }
            }
            if (StringUtils.isBlank(token)) {
                return true;
            }
            String productName = null;
            if (!token2Product.containsKey(token)) {
                Product product = queryProduct(token);
                if (product == null) {
                    return true;
                }
                productName = product.getName();
                token2Product.put(token, productName);
            } else {
                productName = token2Product.get(token);
            }

            try {
                lock.lock();
                String cacheKey = generateKey(productName);
                AtomicLong count = apiCountCache.get(cacheKey);
                if (count == null) {
                    count = new AtomicLong(1);
                } else {
                    count.incrementAndGet();
                }
                apiCountCache.put(cacheKey, count);
            } catch (Exception e) {
                logger.warn("exception throw, due to : {}", e.getMessage(), e);
            } finally {
                lock.unlock();
            }
        }
        return true;
    }

    private ApiToken queryApiToken(String token) {
        return apiTokenService.selectByToken(token);
    }

    private Project queryProject(Long projectId) {
        List<Project> projectList = projectService.selectByPrimaryKeys(Lists.newArrayList(projectId));
        if (CollectionUtils.isEmpty(projectList)) {
            logger.warn("could not found project by projectId, id : {}", projectId);
            return null;
        }
        Optional<Project> optional = projectList.stream().findFirst();
        return optional.orElse(null);
    }

    private Product queryProduct(String token) {
        ApiToken apiToken = queryApiToken(token);
        if (apiToken == null) {
            return null;
        }
        Project project = queryProject(apiToken.getProjectId());
        if (project == null) {
            return null;
        }
        Long productId = project.getProductId();
        List<Product> productList = productService.selectByPrimaryKeys(Lists.newArrayList(productId));
        if (CollectionUtils.isEmpty(productList)) {
            logger.warn("could not found product by productId, id : {}", productId);
            return null;
        }
        Optional<Product> optional = productList.stream().findFirst();
        return optional.orElse(null);
    }

    private String generateKey(String productName) {
        LocalDateTime localDateTime = LocalDateTime.now();
        String currentTime = localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        return productName + "-" + currentTime;
    }

    public void destroy() {
        if (scheduledThreadPoolExecutor != null) {
            scheduledThreadPoolExecutor.shutdown();
            scheduledThreadPoolExecutor = null;
        }
    }

}

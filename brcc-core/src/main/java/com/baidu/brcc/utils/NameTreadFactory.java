package com.baidu.brcc.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class NameTreadFactory implements ThreadFactory {
    private static final Logger LOGGER = LoggerFactory.getLogger(NameTreadFactory.class);
    private final AtomicInteger myThreadNum = new AtomicInteger(1);

    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r, "my-thread-" + myThreadNum.getAndIncrement());
        LOGGER.info(t.getName() + " has been created");
        return t;
    }
}

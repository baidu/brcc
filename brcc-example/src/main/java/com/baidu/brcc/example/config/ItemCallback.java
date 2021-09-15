package com.baidu.brcc.example.config;

import com.baidu.brcc.ConfigItemChangedCallable;
import com.baidu.brcc.DefaultConfigItemChangedCallable;
import com.baidu.brcc.model.ChangedConfigItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import java.util.List;

public class ItemCallback  implements ConfigItemChangedCallable{

    private static final Logger LOGGER = LoggerFactory.getLogger(ItemCallback.class);

    @Autowired
    private ExampleConfiguration exampleConfiguration;


    @Override
    public void changed(List<ChangedConfigItem> items) {
        if (!CollectionUtils.isEmpty(items)) {
            for (ChangedConfigItem item : items) {
                LOGGER.info("changed key={} oldValue={} newValue={}", item.getKey(), item.getOldValue(),
                        item.getNewValue());

                if (item.getKey().equalsIgnoreCase("abc.name")) {
                    exampleConfiguration.setA(item.getNewValue());
                }
            }
        }
    }
}

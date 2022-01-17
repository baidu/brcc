package com.baidu.brcc.utils;

import com.baidu.brcc.domain.ConfigItem;
import com.baidu.brcc.domain.vo.ApiItemVo;
import com.baidu.brcc.utils.collections.CollectionUtils;
import org.checkerframework.framework.qual.DefaultQualifier;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataTransUtils {
    public static List<Long> string2List(String depIds) {
        List<Long> res = new ArrayList<>();
        if(depIds == null || depIds.isEmpty()) {
            return res;
        }
        String[] depList = depIds.split(",");
        for(String item : depList) {
            res.add(Long.parseLong(item));
        }
        return res;
    }

    public static Map<String, String> list2Map(Map<String, String> res, List<ConfigItem> configItems) {
        for(ConfigItem itemVo : configItems) {
            res.put(itemVo.getName(), itemVo.getVal());
        }
        return res;
    }

    public static List<ApiItemVo> map2List(Map<String, ConfigItem> map) {
        List<ApiItemVo> res = new ArrayList<>();
        if (CollectionUtils.isEmpty(map)) {
            return res;
        }
        for(Map.Entry<String, ConfigItem> entry : map.entrySet()) {
            ApiItemVo itemVo = new ApiItemVo();
            itemVo.setKey(entry.getKey());
            itemVo.setGroupId(entry.getValue().getGroupId());
            itemVo.setValue(entry.getValue().getVal());
            res.add(itemVo);
        }
        return res;

    }
}

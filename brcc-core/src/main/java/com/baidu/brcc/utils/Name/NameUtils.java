package com.baidu.brcc.utils.Name;

import com.baidu.brcc.domain.base.R;

import java.util.regex.Pattern;

import static com.baidu.brcc.common.ErrorStatusMsg.CHINESE_NOT_ALLOWED_MSG;
import static com.baidu.brcc.common.ErrorStatusMsg.CHINESE_NOT_ALLOWED_STATUS;

public class NameUtils {
    public static Boolean containsChinese(String name) {
        Pattern p = Pattern.compile("[\u4e00-\u9fa5]");
        if (p.matcher(name).find()) {
            return true;
        }
        return false;
    }
}

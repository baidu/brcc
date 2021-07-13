package com.baidu.brcc.domain.vo;

import lombok.Data;

@Data
public class APiItemAddReqVo {

    //版本id
    private Long versionId;

    //配置key
    private String key;

    //配置value
    private String value;

    //分组ID
    private Long groupId;

    //配置简介
    private String memo;
}

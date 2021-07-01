package com.baidu.brcc.domain.vo;

import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class BatchEditItemVo {

    // 配置项分组
    @ApiModelProperty(value = "组id", position = 1)
    private Long groupId;

    //版本ID
    @ApiModelProperty(value = "版本id", position = 2)
    private Long versionId;

    // 当前分组下的所有配置
    @ApiModelProperty(value = "分组下的配置列表", position = 3)
    private List<ItemReq> items;

}
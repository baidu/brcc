package com.baidu.brcc.domain;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * 首页树形结构数据
 */
@Data
public class TreeNode implements Serializable {
    @JsonProperty(index = 1)
    private Long id;

    @JsonProperty(index = 2)
    private String name;

    // 类型 1-产品线，2-工程，3-环境，4-版本，5-分组
    @JsonProperty(index = 3)
    private int type;

    @JsonProperty(index = 4)
    private boolean hasChildren = false;

    @JsonProperty(index = 5)
    private List<TreeNode> children;
}

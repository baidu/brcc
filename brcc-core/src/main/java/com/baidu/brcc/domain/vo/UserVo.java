package com.baidu.brcc.domain.vo;

import java.util.Date;

import lombok.Data;

@Data
public class UserVo {

    // 用户ID
    private Long userId;

    // 用户名
    private String userName;

    // 用户角色
    private Byte userRole;

    // 创建时间
    private Date createTime;

    // 更新时间
    private Date updateTime;

    // 状态
    private Byte status;

}

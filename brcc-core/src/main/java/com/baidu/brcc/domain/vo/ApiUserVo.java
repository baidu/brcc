package com.baidu.brcc.domain.vo;

import lombok.Data;

@Data
public class ApiUserVo {
    //用户id
    private Long userId;

    //用户名
    private String userName;

    //用户的token
    private String userToken;

    //角色
    private Byte userRole;

    //状态
    private Byte status;
}

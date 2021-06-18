package com.baidu.brcc.domain.vo;

import lombok.Data;

@Data
public class ResetApiPasswordVo {

    // 产品线ID
    private Long id;

    // 用户密码
    private String apiPassword;
}

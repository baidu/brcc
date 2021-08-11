package com.baidu.brcc.domain.vo;

import lombok.Data;

import java.util.List;

@Data
public class GrayVersionReq {

    private String token;

    private Long environmentId;

    // containerId
    private String containerId;

    // idc
    private String idc;

    // instanceIps
    private String ip;

}

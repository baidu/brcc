package com.baidu.brcc.domain.base;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "通用响应返回对象")
public class R<T> implements Serializable {

    /**
     * 返回状态码
     */
    @ApiModelProperty(value = "返回状态码", position = 0)
    private int status;

    /**
     * 返回信息
     */
    @ApiModelProperty(value = "返回信息", position = 1)
    private String msg;

    /**
     * 返回结果数据
     */
    @ApiModelProperty(value = "结果数据", position = 2 )
    private T data;

    /**
     * 返回扩展数据
     */
    @ApiModelProperty(value = "扩展数据", position = 3 )
    private Object ext;

    @ApiModelProperty(value = "服务器返回时间", position = 4)
    private long sts = System.currentTimeMillis();

    public static <T> R<T> error() {
        return error(500, "fail");
    }

    public static <T> R<T> error(String msg) {
        return error(500, msg);
    }

    public static <T> R<T> error(Integer status, String msg) {
        R<T> r = new R<>();
        r.setStatus(status);
        r.setMsg(msg);
        return r;
    }

    public static <T> R<T> ok() {
        R<T> r = new R<>();
        r.setStatus(0);
        r.setMsg("success");
        return r;
    }

    public static <T> R<T> ok(T data) {
        R<T> r = new R<>();
        r.setStatus(0);
        r.setMsg("success");
        r.setData(data);
        return r;
    }

    public static <T> R<T> ok(T data, Object ext) {
        R<T> r = new R<>();
        r.setStatus(0);
        r.setMsg("success");
        r.setData(data);
        r.setExt(ext);
        return r;
    }

    @ApiModelProperty(value = "返回状态码", position = 0)
    public int getStatus() {
        return status;
    }

    @ApiModelProperty(value = "返回状态码", position = 0)
    public void setStatus(int status) {
        this.status = status;
    }

    @ApiModelProperty(value = "返回信息", position = 1)
    public String getMsg() {
        return msg;
    }

    @ApiModelProperty(value = "返回信息", position = 1)
    public void setMsg(String msg) {
        this.msg = msg;
    }

    @ApiModelProperty(value = "结果数据", position = 2 )
    public T getData() {
        return data;
    }

    @ApiModelProperty(value = "结果数据", position = 2 )
    public void setData(T data) {
        this.data = data;
    }

    @ApiModelProperty(value = "扩展数据", position = 3 )
    public Object getExt() {
        return ext;
    }

    @ApiModelProperty(value = "扩展数据", position = 3 )
    public void setExt(Object ext) {
        this.ext = ext;
    }
}

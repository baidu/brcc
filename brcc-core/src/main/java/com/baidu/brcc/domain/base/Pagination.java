package com.baidu.brcc.domain.base;

import java.io.Serializable;
import java.util.List;
import java.util.function.Consumer;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "通用响应返回对象")
public class Pagination<T> implements Serializable {

    /**
     * 总记录数
     */
    @ApiModelProperty(value = "总记录数", position = 0)
    private Long total;

    /**
     * 数据列表
     */
    @ApiModelProperty(value = "数据列表", position = 1)
    private List<T> dataList;

    @ApiModelProperty(value = "总记录数", position = 0)
    public void setTotal(Long total) {
        this.total = total;
    }

    @ApiModelProperty(value = "总记录数", position = 0)
    public Long getTotal() {
        return total;
    }

    @ApiModelProperty(value = "数据列表", position = 1)
    public void setDataList(List<T> dataList) {
        this.dataList = dataList;
    }

    @ApiModelProperty(value = "数据列表", position = 1)
    public List<T> getDataList() {
        return dataList;
    }

    public void each(Consumer<T> consumer) {
        if (dataList != null && !dataList.isEmpty()) {
            for (T t : dataList) {
                consumer.accept(t);
            }
        }
    }

    public String toString() {
        return "Pagination{" +
                "total = " + total +
                ", dataList = " + dataList +
                '}';
    }
}

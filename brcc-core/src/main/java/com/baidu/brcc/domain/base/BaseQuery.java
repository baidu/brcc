package com.baidu.brcc.domain.base;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "基础查询对象")
public class BaseQuery implements Serializable {

    /**
     * 偏移量
     */
    @ApiModelProperty(value = "偏移量", position = 0)
    private Integer offset;

    /**
     * 每页显示条数
     */
    @ApiModelProperty(value = "每页显示条数", position = 1)
    private Integer limit;

    /**
     * 当前页,从1开始
     */
    @ApiModelProperty(value = "当前页,从1开始", position = 2)
    private Integer currentPage;

    /**
     *
     * 通过当前页计算偏移量,
     * @return 返回偏移量,原来的偏移量将被覆盖
     */
    public Integer calculateOffsetFromCurrentPage() {
        offset = ( currentPage - 1 ) * limit;
        return offset;
    }

    /**
     *
     * 通过偏移量计算当前页,
     * @return 返回当前页,原来的当前页将被覆盖
     */
    public Integer calculateCurrentPageFromOffset() {
        currentPage = offset/limit + 1;
        return currentPage;
    }

    @ApiModelProperty(value = "偏移量", position = 0)
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @ApiModelProperty(value = "偏移量", position = 0)
    public Integer getOffset() {
        return offset;
    }

    @ApiModelProperty(value = "每页显示条数", position = 1)
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @ApiModelProperty(value = "每页显示条数", position = 1)
    public Integer getLimit() {
        return limit;
    }

    @ApiModelProperty(value = "当前页,从1开始", position = 2)
    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    @ApiModelProperty(value = "当前页,从1开始", position = 2)
    public Integer getCurrentPage() {
        return currentPage;
    }

    public String toString() {
        return "BaseQuery{" +
                "offset=" + offset +
                ", limit=" + limit +
                ", currentPage=" + currentPage +
                '}';
    }
}

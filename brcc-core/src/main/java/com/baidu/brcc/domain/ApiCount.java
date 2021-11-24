package com.baidu.brcc.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

@ApiModel(description = "api count")
public class ApiCount implements Serializable {

    @ApiModelProperty(value = "编号", position = 0)
    private Long id;

    @ApiModelProperty(value = "product name", position = 1)
    private String productName;

    @ApiModelProperty(value = "product count", position = 2)
    private Long productCount;

    @ApiModelProperty(value = "product cache key", position = 3)
    private String productCacheKey;

//    @ApiModelProperty(value = "expense time", position = 4)
//    private String expenseTime;

    @ApiModelProperty(value = "version", position = 4)
    private Long version;

    @ApiModelProperty(value = "创建时间", position = 5)
    private Date createTime;

    @ApiModelProperty(value = "更新时间", position = 6)
    private Date updateTime;

    public ApiCount() {}

    private ApiCount(XBuilder builder) {
        this.id = builder.id;
        this.productName = builder.productName;
        this.productCount = builder.productCount;
        this.productCacheKey = builder.productCacheKey;
//        this.expenseTime = builder.expenseTime;
        this.version = builder.version;
        this.createTime = builder.createTime;
        this.updateTime = builder.updateTime;
    }

    public static XBuilder newBuilder() {
        return new XBuilder();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Long getProductCount() {
        return productCount;
    }

    public void setProductCount(Long productCount) {
        this.productCount = productCount;
    }

    public String getProductCacheKey() {
        return productCacheKey;
    }

    public void setProductCacheKey(String productCacheKey) {
        this.productCacheKey = productCacheKey;
    }

//    public String getExpenseTime() {
//        return expenseTime;
//    }
//
//    public void setExpenseTime(String expenseTime) {
//        this.expenseTime = expenseTime;
//    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public ApiCount copyFrom(ApiCount builder) {
        this.id = builder.id;
        this.productName = builder.productName;
        this.productCount = builder.productCount;
        this.productCacheKey = builder.productCacheKey;
//        this.expenseTime = builder.expenseTime;
        this.version = builder.version;
        this.createTime = builder.createTime;
        this.updateTime = builder.updateTime;
        return this;
    }

    public static <T extends ApiCount> T copyFrom(ApiCount from, T to) {
        if (to == null){
            throw new RuntimeException("`to` must not be null");
        }
        to.setId(from.id);
        to.setProductName(from.productName);
        to.setProductCount(from.productCount);
        to.setProductCacheKey(from.productCacheKey);
//        to.setExpenseTime(from.expenseTime);
        to.setVersion(from.version);
        to.setCreateTime(from.createTime);
        to.setUpdateTime(from.updateTime);
        return to;
    }

    public static final class XBuilder {

        private Long id;

        private String productName;

        private Long productCount;

        private String productCacheKey;

//        private String expenseTime;

        private Long version;

        private Date createTime;

        private Date updateTime;

        private XBuilder() {}

        public XBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public XBuilder productName(String productName) {
            this.productName = productName;
            return this;
        }

        public XBuilder productCount(Long productCount) {
            this.productCount = productCount;
            return this;
        }

        public XBuilder productCacheKey(String productCacheKey) {
            this.productCacheKey = productCacheKey;
            return this;
        }

//        public XBuilder expenseTime(String expenseTime) {
//            this.expenseTime = expenseTime;
//            return this;
//        }

        public XBuilder version(Long version) {
            this.version = version;
            return this;
        }

        public XBuilder createTime(Date createTime) {
            this.createTime = createTime;
            return this;
        }

        public XBuilder updateTime(Date updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public ApiCount build() {
            return new ApiCount(this);
        }
    }

}

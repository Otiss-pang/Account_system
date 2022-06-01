package com.ir.account.entity.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class OwnershipQuery {
    @ApiModelProperty(value = "所属名称")
    private String name;

    @ApiModelProperty(value = "状态0：启用 1：禁用")
    private Integer state;
}

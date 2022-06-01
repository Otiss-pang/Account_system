package com.ir.account.entity.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@Data
public class CorrelationDto {

    @ApiModelProperty(value = "发票ID")
    private Integer receiptId;

    @ApiModelProperty(value = "采购商品ID")
    private Integer productId;

    @ApiModelProperty(value = "关联数量")
    private Integer count;

    @ApiModelProperty(value = "关联类型：0成本占用，1补票占用")
    private Integer type;

}

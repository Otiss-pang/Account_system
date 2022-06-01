package com.ir.account.entity.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class PurchaseVo {

    @ApiModelProperty(value = "供应商")
    private String supplier;

    @ApiModelProperty(value = "品名")
    private String tradeName;

    @ApiModelProperty(value = "商品名称")
    private String productName;

    @ApiModelProperty(value = "商品型号")
    private String productType;

    @ApiModelProperty(value = "单价")
    private BigDecimal unitPrice;

    @ApiModelProperty(value = "使用量")
    private Integer useAmount;

    @ApiModelProperty(value = "商品对应发票id")
    private String receiptId;

    @ApiModelProperty(value = "对应合同id")
    private String contractId;
}

package com.ir.account.entity.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

public class ProductStockVo {

    @ApiModelProperty(value = "主键id")
    private Integer id;

    @ApiModelProperty(value = "发票id")
    private String receiptId;

    @ApiModelProperty(value = "合同id")
    private String contractId;

    @ApiModelProperty(value = "品名")
    private String tradeName;

    @ApiModelProperty(value = "商品名称")
    private String productName;

    @ApiModelProperty(value = "商品型号")
    private String productType;

    @ApiModelProperty(value = "采购数量")
    private Integer purchaseNum;

    @ApiModelProperty(value = "单价")
    private BigDecimal unitPrice;

    @ApiModelProperty(value = "使用量")
    private Integer useAmount;

    @ApiModelProperty(value = "剩余数量")
    private Integer stock;

    @ApiModelProperty(value = "总价")
    private BigDecimal totalPrice;

    @ApiModelProperty(value = "发票类型1.1% 2.6% 3. 9% 4.13%")
    private Integer receiptType;

}

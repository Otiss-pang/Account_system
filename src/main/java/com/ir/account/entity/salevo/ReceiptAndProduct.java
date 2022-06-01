package com.ir.account.entity.salevo;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class ReceiptAndProduct {
    @ApiModelProperty(value = "发票编号")
    private String receiptId;

    @ApiModelProperty(value = "合同编号")
    private String contractId;

    @JsonFormat(pattern = "yyyy-MM-dd" ,timezone = "GMT+8")
    @ApiModelProperty(value = "开票日期")
    private Date receiptDate;


    @ApiModelProperty(value = "品名")
    private String tradeName;

    @ApiModelProperty(value = "商品名")
    private String productName;

    @ApiModelProperty(value = "型号")
    private String productType;

    @ApiModelProperty(value = "采购数量")
    private Integer purchaseNum;

    @ApiModelProperty(value = "单价")
    private BigDecimal unitPrice;

    @ApiModelProperty(value = "总价")
    private BigDecimal totalPrice;

    @ApiModelProperty(value = "使用量")
    private Integer useAmount;

    @ApiModelProperty(value = "发票类型1.1% 2.6% 3. 9% 4.13%")
    private Integer receiptType;

    @ApiModelProperty(value = "创建者")
    private String creator;

    @TableField(fill = FieldFill.INSERT)
    @JsonFormat(pattern = "yyyy-MM-dd" ,timezone = "GMT+8")
    @ApiModelProperty(value = "创建日期")
    private Date createDate;
}

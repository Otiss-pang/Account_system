package com.ir.account.entity.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductStockQuery {

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

}

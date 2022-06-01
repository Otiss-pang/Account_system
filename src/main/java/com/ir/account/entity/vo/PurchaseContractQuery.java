package com.ir.account.entity.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
public class PurchaseContractQuery {

    @ApiModelProperty(value = "合同日期")
    private Date date;

    @ApiModelProperty(value = "商品名称")
    private String productName;

    @ApiModelProperty(value = "商品型号")
    private String productType;

    @ApiModelProperty(value = "合同编号")
    private String contractId;

    @ApiModelProperty(value = "供应商名称")
    private String supplier;

    @ApiModelProperty(value = "备注信息")
    private String note;

    @ApiModelProperty(value = "发票状态")
    private Integer state;

    private Integer from;
    private Integer size;
}

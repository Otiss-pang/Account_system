package com.ir.account.entity.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
public class PurchaseContractVo {
    @ApiModelProperty(value = "合同类型")
    private Integer type;

    @ApiModelProperty(value = "合同编号")
    private String contractId;

    @JsonFormat(pattern = "yyyy-MM-dd" ,timezone = "GMT+8")
    @ApiModelProperty(value = "合同日期")
    private Date date;

    @ApiModelProperty(value = "供应商")
    private String supplier;

    @ApiModelProperty(value = "合同金额")
    private Integer amount;

    @ApiModelProperty(value = "备注信息")
    private String note;
}

package com.ir.account.entity.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
public class RelationDetailVo {

    @ApiModelProperty(value = "关联ID")
    private Integer id;

    @ApiModelProperty(value = "合同编号")
    private String contractNum;

    @ApiModelProperty(value = "发票编号")
    private String receiptNum;

    @ApiModelProperty(value = "采购单位")
    private String purchaseUnit;

    @ApiModelProperty(value = "关联数量")
    private Integer count;

    @ApiModelProperty(value = "关联类型：0成本占用，1补票占用")
    private Integer type;

    @ApiModelProperty(value = "创建者")
    private String createBy;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;
}

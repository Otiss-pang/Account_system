package com.ir.account.entity.salevo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class CostManageVo {

    @ApiModelProperty(value = "发票主键")
    private Integer id;

    @ApiModelProperty(value = "采购单位")
    private String buyingUnit;

    @ApiModelProperty(value = "合同编号")
    private String contractId;

    @ApiModelProperty(value = "发票编号")
    private String receiptId;

    @JsonFormat(pattern = "yyyy-MM-dd" ,timezone = "GMT+8")
    @ApiModelProperty(value = "开票日期")
    private Date receiptDate;

    @ApiModelProperty(value = "发票类型1.1% 2.6% 3. 9% 4.13%")
    private Integer receiptType;

    @ApiModelProperty(value = "发票金额")
    private BigDecimal totalPrice;

    @ApiModelProperty(value = "关联率")
    private Double rate;

}

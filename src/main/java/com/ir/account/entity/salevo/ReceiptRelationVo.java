package com.ir.account.entity.salevo;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.ir.account.entity.SaleProduct;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;


@Data
public class ReceiptRelationVo {

    @ApiModelProperty(value = "品名")
    private String tradeName;

    @ApiModelProperty(value = "商品名")
    private String productName;

    @ApiModelProperty(value = "型号")
    private String productType;

    @ApiModelProperty(value = "单价")
    private BigDecimal unitPrice;

    @ApiModelProperty(value = "关联数量")
    private Integer count;

    @ApiModelProperty(value = "发票编号")
    private String receiptId;

    @ApiModelProperty(value = "合同编号")
    private String contractId;

    @ApiModelProperty(value = "创建者")
    private String createBy;

    @TableField(fill = FieldFill.INSERT)
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @ApiModelProperty(value = "创建日期")
    private Date createTime;

    @ApiModelProperty(value = "关联状态：0作废，1正常")
    private Integer status;

    @ApiModelProperty(value = "关联类型：0成本占用，1补票占用")
    private Integer type;


    public ReceiptRelationVo(){
    }

    public ReceiptRelationVo(SaleProduct saleProduct){
        this.tradeName = saleProduct.getTradeName();
        this.productName = saleProduct.getProductName();
        this.productType = saleProduct.getProductType();
        this.unitPrice = saleProduct.getUnitPrice();
        this.count = saleProduct.getPurchaseNum();
    }

}

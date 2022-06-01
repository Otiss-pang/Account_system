package com.ir.account.entity;

import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 *
 * </p>
 *
 * @author pyf
 * @since 2022-04-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SaleReceipt对象", description="")
public class SaleReceipt implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "主键id")
    private Integer id;

    @ApiModelProperty(value = "发票编号")
    private String receiptId;

    @ApiModelProperty(value = "合同编号")
    private String contractId;

    @JsonFormat(pattern = "yyyy-MM-dd" ,timezone = "GMT+8")
    @ApiModelProperty(value = "发票日期")
    private Date receiptDate;

    @ApiModelProperty(value = "附件")
    private String appendix;

    @TableField(fill = FieldFill.INSERT)
    @ApiModelProperty(value = "更新次数")
    private Integer updateTimes;

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

    @TableField(fill = FieldFill.INSERT)
    @ApiModelProperty(value = "发票类型1.1% 2.6% 3. 9% 4.13%")
    private Integer receiptType;

    @TableField(fill = FieldFill.INSERT)
    @ApiModelProperty(value = "创建者")
    private String creator;

    @TableField(fill = FieldFill.INSERT)
    @JsonFormat(pattern = "yyyy-MM-dd" ,timezone = "GMT+8")
    @ApiModelProperty(value = "创建日期")
    private Date createDate;

    @TableField(fill = FieldFill.INSERT)
    @ApiModelProperty(value = "关联率")
    private Double rate;



}

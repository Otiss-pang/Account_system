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
 * @since 2022-04-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="PurchaseReceipt对象", description="")
public class PurchaseReceipt implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "主键id")
    private Integer id;

    @ApiModelProperty(value = "发票编号")
    private String receiptId;

    
    @ApiModelProperty(value = "合同编号")
    private String contractId;

    @JsonFormat(pattern = "yyyy-MM-dd" ,timezone = "GMT+8")
    @ApiModelProperty(value = "开票日期")
    private Date receiptDate;

    @ApiModelProperty(value = "附件")
    private String appendix;

    @TableField(fill = FieldFill.INSERT)
    @ApiModelProperty(value = "更新次数")
    private Integer updateTimes;


    @ApiModelProperty(value = "发票类型1.1% 2.6% 3. 9% 4.13%")
    private Integer receiptType;


    @ApiModelProperty(value = "发票金额")
    private Integer amount;

    @TableField(fill = FieldFill.INSERT)
    @ApiModelProperty(value = "创建者")
    private String creator;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss" ,timezone = "GMT+8")
    @TableField(fill = FieldFill.INSERT)
    @ApiModelProperty(value = "创建日期")
    private Date createDate;


}

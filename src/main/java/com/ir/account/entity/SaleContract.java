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
@ApiModel(value="SaleContract对象", description="销售合同")
public class SaleContract implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "合同编号")
    private String contractId;

    @ApiModelProperty(value = "合同所属")
    private String belong;

    @JsonFormat(pattern = "yyyy-MM-dd" ,timezone = "GMT+8")
    @ApiModelProperty(value = "合同日期")
    private Date date;

    @ApiModelProperty(value = "采购单位")
    private String buyingUnit;

    @ApiModelProperty(value = "合同金额")
    private Long amount;

    @ApiModelProperty(value = "关联率")
    private BigDecimal correlation;

    @ApiModelProperty(value = "发票状态： 0. 未开票 1.部分开票 2.已开票")
    @TableField(fill = FieldFill.INSERT)
    private Integer receiptStatus;

    @ApiModelProperty(value = "附件")
    private String appendix;

    @TableField(fill = FieldFill.INSERT)
    @ApiModelProperty(value = "更新次数")
    private Integer updateTimes;

    @TableField(fill = FieldFill.INSERT)
    @ApiModelProperty(value = "创建者")
    private String creator;

    @TableField(fill = FieldFill.INSERT)
    @JsonFormat(pattern = "yyyy-MM-dd" ,timezone = "GMT+8")
    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "备注信息")
    private String remark;

    @ApiModelProperty(value = "区域标识")
    private String region;

    @ApiModelProperty(value = "发票id")
    private String receiptId;


}

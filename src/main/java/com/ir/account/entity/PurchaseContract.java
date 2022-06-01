package com.ir.account.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

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
@ApiModel(value="PurchaseContract对象", description="")
public class PurchaseContract implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "合同编号")
    private String contractId;

    @ApiModelProperty(value = "合同类型")
    private Integer type;

    @JsonFormat(pattern = "yyyy-MM-dd" ,timezone = "GMT+8")
    @ApiModelProperty(value = "合同日期")
    private Date date;

    @ApiModelProperty(value = "供应商")
    private String supplier;

    @ApiModelProperty(value = "合同金额")
    private Integer amount;

    @ApiModelProperty(value = "发票状态：1未开票2部分开票3已开票")
    @TableField(fill = FieldFill.INSERT)
    private Integer state;

    @ApiModelProperty(value = "附件")
    private String appendix;

    @ApiModelProperty(value = "更新次数")
    @TableField(fill = FieldFill.INSERT)
    @Version
    private Integer updateTimes;

    @TableField(fill = FieldFill.INSERT)
    @ApiModelProperty(value = "创建者")
    private String creator;

    @JsonFormat(pattern = "yyyy-MM-dd" ,timezone = "GMT+8")
    @TableField(fill = FieldFill.INSERT)
    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "备注信息")
    private String note;


}

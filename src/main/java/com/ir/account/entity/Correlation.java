package com.ir.account.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 关联表
 * </p>
 *
 * @author pyf
 * @since 2022-04-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_correlation")
@ApiModel(value="Correlation对象", description="关联表")
public class Correlation implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "关联ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "销售合同ID")
    private Integer contractId;

    @ApiModelProperty(value = "发票ID")
    private Integer receiptId;

    @ApiModelProperty(value = "采购商品ID")
    private Integer productId;

    @ApiModelProperty(value = "关联状态：0作废，1正常")
    private Integer status;

    @ApiModelProperty(value = "关联数量")
    private Integer count;

    @ApiModelProperty(value = "关联类型：0成本占用，1补票占用")
    private Integer type;

    @ApiModelProperty(value = "创建者")
    private String createBy;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;


}

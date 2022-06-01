package com.ir.account.entity.vo;

import lombok.Data;

import java.util.Date;

@Data
public class SaleContractVo {

    private String belong;

    private String region;

    private String contractId;

    private Date date;

    private String buyingUnit;

    private Long amount;

    private String remark;
}

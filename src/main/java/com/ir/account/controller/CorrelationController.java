package com.ir.account.controller;


import cn.dev33.satoken.annotation.SaCheckLogin;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ir.account.entity.Correlation;
import com.ir.account.entity.SaleContract;
import com.ir.account.entity.SaleProduct;
import com.ir.account.entity.SaleReceipt;
import com.ir.account.entity.dto.CorrelationDto;
import com.ir.account.entity.salevo.ReceiptRelationVo;
import com.ir.account.service.impl.*;
import com.ir.account.utils.R;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * 关联表 前端控制器
 * </p>
 *
 * @author pyf
 * @since 2022-04-30
 */
@RestController
@RequestMapping("/account/correlation")
@CrossOrigin
//@SaCheckLogin
public class CorrelationController {

    @Autowired
    private CorrelationServiceImpl correlationService;

    @Autowired
    private SaleProductServiceImpl saleProductService;

    @Autowired
    private SaleReceiptServiceImpl saleReceiptService;

    @Autowired
    private PurchaseProductServiceImpl purchaseProductService;

    @Autowired
    private SaleContractServiceImpl saleContractService;

    // 根据销售发票编号查询关联
    @GetMapping("/{receiptId}")
    public R getReceiptRelationVoByReceiptId(@PathVariable String receiptId){

        List<ReceiptRelationVo> list = new ArrayList<>();
        SaleReceipt receipt = saleReceiptService.getOne(new QueryWrapper<SaleReceipt>().eq("receipt_id", receiptId));
        saleProductService.list(new QueryWrapper<SaleProduct>()
                .eq("receipt_id", receiptId)
        ).forEach(saleProduct -> list.add(new ReceiptRelationVo(saleProduct)));

        list.addAll(correlationService.getReceiptRelationVoByReceiptId(receipt.getId()));
        return R.ok().data("list", list);
    }

    // 创建关联信息
    @PostMapping("/createRelation")
    public R createReceiptRelation(@RequestBody CorrelationDto correlationDto){
        Correlation correlation = new Correlation();
        BeanUtils.copyProperties(correlationDto, correlation);
        correlation.setCreateTime(new Date());
        correlation.setStatus(0);
        correlation.setCreateBy("admin");
        String contractId = saleReceiptService
                .getById(correlationDto.getReceiptId()).getContractId();
        correlation.setContractId(
                saleContractService.getOne(new QueryWrapper<SaleContract>()
                        .eq("contract_id", contractId)
        ).getId());
        Boolean save = correlationService.saveCorrelation(correlation);

        if(save != null && save){
            return R.ok();
        }
        else {
            return R.error();
        }
    }
}


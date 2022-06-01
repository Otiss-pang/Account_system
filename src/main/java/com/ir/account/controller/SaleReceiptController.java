package com.ir.account.controller;


import cn.dev33.satoken.annotation.SaCheckLogin;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ir.account.entity.SaleReceipt;
import com.ir.account.service.SaleReceiptService;
import com.ir.account.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author pyf
 * @since 2022-04-18
 */
@RestController
@RequestMapping("/account/saleReceipt")
@CrossOrigin
//@SaCheckLogin
public class SaleReceiptController {

    @Autowired
    private SaleReceiptService receiptService;

    //添加发票
    @PostMapping("addReceipt")
    public R addReceipt(@RequestBody SaleReceipt receipt){
        receiptService.save(receipt);
        return R.ok();
    }

    //查询所有发票
    @GetMapping("getAllReceipts")
    public R getAllReceipts(){
        List<SaleReceipt> list = receiptService.list(null);
        return R.ok().data("list",list);
    }

    //修改发票
    @PostMapping("updateReceipts")
    public R updateReceipts(@RequestBody SaleReceipt receipt){
        receiptService.updateById(receipt);
        return R.ok();
    }

    //根据合同id查询所有发票信息
    @GetMapping("getReceiptById/{contractId}")
    public R getReceiptById(@PathVariable String contractId){
        QueryWrapper<SaleReceipt> wrapper = new QueryWrapper<>();
        wrapper.eq("contract_id",contractId);
        List<SaleReceipt> list = receiptService.list(wrapper);
        return R.ok().data("list",list);
    }

    //根据发票id查寻发票信息
    @GetMapping("getInfoByReceiptId/{receiptId}")
    public R getInfoByReceiptId(@PathVariable String receiptId){
        QueryWrapper<SaleReceipt> wrapper = new QueryWrapper<>();
        wrapper.eq("receipt_id",receiptId);
        SaleReceipt receipt = receiptService.getOne(wrapper);
        return R.ok().data("receipt",receipt);
    }

}


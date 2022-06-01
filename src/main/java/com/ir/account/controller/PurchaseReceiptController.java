package com.ir.account.controller;


import cn.dev33.satoken.annotation.SaCheckLogin;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ir.account.entity.PurchaseReceipt;
import com.ir.account.service.PurchaseReceiptService;
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
 * @since 2022-04-13
 */
@RestController
@RequestMapping("/account/receipt")
@CrossOrigin
//@SaCheckLogin
public class PurchaseReceiptController {

    @Autowired
    private PurchaseReceiptService purchaseReceiptService;

    //添加发票
    @PostMapping("addReceipt")
    public R addReceipt(@RequestBody PurchaseReceipt receipt ){;
        purchaseReceiptService.save(receipt);
        return R.ok();
    }

    //修改发票信息
    @PostMapping("updateReceipt")
    public R updateReceipt(@RequestBody PurchaseReceipt receipt){
        boolean flag = purchaseReceiptService.updateById(receipt);
        if (flag) {
            return R.ok();
        }else {
            return R.error();
        }

    }

    //根据合同id查询所有发票信息
    @GetMapping("getReceiptById/{contractId}")
    public R getReceiptById(@PathVariable String contractId){
        QueryWrapper<PurchaseReceipt> wrapper = new QueryWrapper<>();
        wrapper.eq("contract_id",contractId);
        List<PurchaseReceipt> list = purchaseReceiptService.list(wrapper);
        return R.ok().data("list",list);
    }

    //根据发票id查寻发票信息
    @GetMapping("getInfoByReceiptId/{receiptId}")
    public R getInfoByReceiptId(@PathVariable String receiptId){
        QueryWrapper<PurchaseReceipt> wrapper = new QueryWrapper<>();
        wrapper.eq("receipt_id",receiptId);
        PurchaseReceipt receipt = purchaseReceiptService.getOne(wrapper);
        return R.ok().data("receipt",receipt);
    }
}


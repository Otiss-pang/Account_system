package com.ir.account.controller;

import cn.dev33.satoken.annotation.SaCheckLogin;
import com.ir.account.entity.salevo.CostManageVo;
import com.ir.account.service.SaleReceiptService;
import com.ir.account.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/account/costManage")
@CrossOrigin
//@SaCheckLogin
public class CostManageController {

    @Autowired
    private SaleReceiptService receiptService;

    //获取所有销售合同的发票信息
    @GetMapping("getAllList")
    public R getAllList(){
       List<CostManageVo> list =  receiptService.getAllList();
       return R.ok().data("list",list);
    }

//    //关联，从采购合同中关联商品
//    @PostMapping("correlation")
//    public R getCorrelation(){
//
//    }
}

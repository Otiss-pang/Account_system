package com.ir.account.controller;


import cn.dev33.satoken.annotation.SaCheckLogin;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ir.account.entity.SaleProduct;
import com.ir.account.service.SaleProductService;
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
@RequestMapping("/account/saleProduct")
@CrossOrigin
//@SaCheckLogin
public class SaleProductController {

    @Autowired
    private SaleProductService productService;

    //添加商品明细
    @PostMapping("addProduct")
    public R addProduct(@RequestBody SaleProduct product){
        productService.save(product);
        return R.ok();
    }

    //查询商品明细
    @GetMapping("getAllProducts")
    public R getAllProducts(){
        List<SaleProduct> list = productService.list(null);
        return R.ok().data("list",list);
    }

    //修改商品明细
    @PostMapping("updateProducts")
    public R updateProducts(@RequestBody SaleProduct product){
        productService.updateById(product);
        return R.ok();
    }

    //根据发票id查询商品明细
    @GetMapping("getInfoByReceiptId/{receiptId}")
    public R getInfoByReceiptId(@PathVariable String receiptId){
        QueryWrapper<SaleProduct> wrapper = new QueryWrapper<>();
        wrapper.eq("receipt_id",receiptId);
        List<SaleProduct> list = productService.list(wrapper);
        return R.ok().data("list",list);
    }

    //根据商品id查询商品明细
    @GetMapping("getInfoByProduct/{productId}")
    public R getInfoByProduct(@PathVariable String productId){
        QueryWrapper<SaleProduct> wrapper = new QueryWrapper<>();
        wrapper.eq("product_id",productId);
        SaleProduct product = productService.getOne(wrapper);
        return R.ok().data("product",product);
    }

}


package com.ir.account.controller;


import cn.dev33.satoken.annotation.SaCheckLogin;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ir.account.entity.PurchaseProduct;
import com.ir.account.entity.vo.ProductStockQuery;
import com.ir.account.entity.vo.ProductStockVo;
import com.ir.account.service.PurchaseProductService;
import com.ir.account.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author pyf
 * @since 2022-04-13
 */
@RestController
@RequestMapping("/account/purchaseProduct")
@CrossOrigin
//@SaCheckLogin
public class PurchaseProductController {


    @Autowired
    private PurchaseProductService purchaseProductService;

    //查询所有采购明细
    @GetMapping("getAllPurchaseProduct")
    public R getAllPurchaseProduct(){
//        List<PurchaseVo> list = purchaseProductService.getAllProducts();
        List<PurchaseProduct> list = purchaseProductService.list(null);
        return R.ok().data("list",list);
    }

    //添加商品
    @PostMapping("addProduct")
    public R addProduct(@RequestBody PurchaseProduct product) {
        purchaseProductService.save(product);
        return R.ok();
    }

    //修改商品明细
    @PostMapping("updateProduct")
    public R updateProduct(@RequestBody PurchaseProduct product) {
        boolean flag = purchaseProductService.updateById(product);
        if (flag) return R.ok();
        else return R.error();
    }

    //根据发票id查询商品明细
    @GetMapping("getInfoByReceiptId/{receiptId}")
    public R getInfoByReceiptId(@PathVariable String receiptId){
        QueryWrapper<PurchaseProduct> wrapper = new QueryWrapper<>();
        wrapper.eq("receipt_id",receiptId);
        List<PurchaseProduct> list = purchaseProductService.list(wrapper);
        return R.ok().data("list",list);
    }

    //根据商品id查询商品明细
    @GetMapping("getInfoByProduct/{productId}")
    public R getInfoByProduct(@PathVariable String productId){
        QueryWrapper<PurchaseProduct> wrapper = new QueryWrapper<>();
        wrapper.eq("product_id",productId);
        PurchaseProduct product = purchaseProductService.getOne(wrapper);
        return R.ok().data("product",product);
    }

    //查询商品库存
    @GetMapping("/getStock")
    public R getStock(@RequestBody ProductStockQuery productStockQuery){

        List<ProductStockVo> list = purchaseProductService.getProductStockVo(productStockQuery);

        return R.ok().data("list", list);
    }

}


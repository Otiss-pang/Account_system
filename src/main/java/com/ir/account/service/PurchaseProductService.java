package com.ir.account.service;

import com.ir.account.entity.PurchaseProduct;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ir.account.entity.vo.ProductStockQuery;
import com.ir.account.entity.vo.ProductStockVo;
import com.ir.account.entity.vo.PurchaseProductVo;
import com.ir.account.entity.vo.PurchaseVo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author pyf
 * @since 2022-04-13
 */
public interface PurchaseProductService extends IService<PurchaseProduct> {
    List<ProductStockVo> getProductStockVo(ProductStockQuery productStockQuery);

    List<PurchaseVo> getAllProducts();
}

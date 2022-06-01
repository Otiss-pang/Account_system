package com.ir.account.mapper;

import com.ir.account.entity.PurchaseProduct;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ir.account.entity.vo.ProductStockQuery;
import com.ir.account.entity.vo.ProductStockVo;
import com.ir.account.entity.vo.PurchaseVo;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author pyf
 * @since 2022-04-13
 */
public interface PurchaseProductMapper extends BaseMapper<PurchaseProduct> {
    List<ProductStockVo> getProductStockVoList(ProductStockQuery productStockQuery);

    List<PurchaseVo> getAllProducts();
}

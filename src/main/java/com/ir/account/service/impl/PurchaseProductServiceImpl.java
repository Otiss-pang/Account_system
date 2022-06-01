package com.ir.account.service.impl;

import com.ir.account.entity.PurchaseProduct;
import com.ir.account.entity.vo.ProductStockQuery;
import com.ir.account.entity.vo.ProductStockVo;
import com.ir.account.entity.vo.PurchaseProductVo;
import com.ir.account.entity.vo.PurchaseVo;
import com.ir.account.mapper.PurchaseProductMapper;
import com.ir.account.service.PurchaseProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author pyf
 * @since 2022-04-13
 */
@Service
public class PurchaseProductServiceImpl extends ServiceImpl<PurchaseProductMapper, PurchaseProduct> implements PurchaseProductService {

    @Resource
    private PurchaseProductMapper purchaseProductMapper;

    @Override
    public List<ProductStockVo> getProductStockVo(ProductStockQuery productStockQuery) {
        return purchaseProductMapper.getProductStockVoList(productStockQuery);
    }

    @Override
    public List<PurchaseVo> getAllProducts() {
        List<PurchaseVo> list = purchaseProductMapper.getAllProducts();
        return list;
    }

}

package com.ir.account.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ir.account.entity.Correlation;
import com.ir.account.entity.PurchaseProduct;
import com.ir.account.entity.SaleReceipt;
import com.ir.account.entity.salevo.ReceiptRelationVo;
import com.ir.account.mapper.CorrelationMapper;
import com.ir.account.mapper.PurchaseProductMapper;
import com.ir.account.mapper.SaleReceiptMapper;
import com.ir.account.service.CorrelationService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 关联表 服务实现类
 * </p>
 *
 * @author pyf
 * @since 2022-04-30
 */
@Service
public class CorrelationServiceImpl extends ServiceImpl<CorrelationMapper, Correlation> implements CorrelationService {

    @Resource
    private CorrelationMapper correlationMapper;

    @Resource
    private PurchaseProductMapper purchaseProductMapper;

    @Resource
    private SaleReceiptMapper saleReceiptMapper;

    @Override
    public List<ReceiptRelationVo> getReceiptRelationVoByReceiptId(Integer receiptId) {
        return correlationMapper.getReceiptRelationVoByReceiptId(receiptId);
    }

    @Transactional
    @Override
    public Boolean saveCorrelation(Correlation correlation) {
        int insert = correlationMapper.insert(correlation);
        if(insert > 0){
            //更新发票关联率和采购商品的使用量
            PurchaseProduct purchaseProduct = purchaseProductMapper.selectById(correlation.getProductId());
            purchaseProduct.setUseAmount(purchaseProduct.getUseAmount() + correlation.getCount());
            SaleReceipt saleReceipt = saleReceiptMapper.selectById(correlation.getReceiptId());
            double total = saleReceipt.getRate() * saleReceipt.getTotalPrice().doubleValue() +
                    correlation.getCount() * purchaseProduct.getUnitPrice().doubleValue();
            saleReceipt.setRate(total / saleReceipt.getTotalPrice().doubleValue());
            saleReceiptMapper.updateById(saleReceipt);
            purchaseProductMapper.updateById(purchaseProduct);
            return true;
        }
        return false;
    }

}

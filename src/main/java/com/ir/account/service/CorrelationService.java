package com.ir.account.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ir.account.entity.Correlation;
import com.ir.account.entity.salevo.ReceiptRelationVo;

import java.util.List;

/**
 * <p>
 * 关联表 服务类
 * </p>
 *
 * @author pyf
 * @since 2022-04-30
 */
public interface CorrelationService extends IService<Correlation> {
    List<ReceiptRelationVo> getReceiptRelationVoByReceiptId(Integer receiptId);
    Boolean saveCorrelation(Correlation correlation);
}

package com.ir.account.service;

import com.ir.account.entity.SaleReceipt;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ir.account.entity.salevo.CostManageVo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author pyf
 * @since 2022-04-18
 */
public interface SaleReceiptService extends IService<SaleReceipt> {

    List<CostManageVo> getAllList();
}

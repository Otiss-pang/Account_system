package com.ir.account.mapper;

import com.ir.account.entity.SaleReceipt;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ir.account.entity.salevo.CostManageVo;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author pyf
 * @since 2022-04-18
 */
public interface SaleReceiptMapper extends BaseMapper<SaleReceipt> {

    List<CostManageVo> getAllList();
}

package com.ir.account.mapper;

import com.ir.account.entity.PurchaseContract;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ir.account.entity.vo.PurchaseContractQuery;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author pyf
 * @since 2022-04-13
 */
public interface PurchaseContractMapper extends BaseMapper<PurchaseContract> {

    List<PurchaseContract> getConditionContract(PurchaseContractQuery query);
}

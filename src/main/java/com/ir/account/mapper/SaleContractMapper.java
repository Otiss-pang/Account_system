package com.ir.account.mapper;

import com.ir.account.entity.SaleContract;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ir.account.entity.vo.SaleContractQuery;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author pyf
 * @since 2022-04-18
 */
public interface SaleContractMapper extends BaseMapper<SaleContract> {
    List<SaleContract> getSaleContractCondition(SaleContractQuery query);
}

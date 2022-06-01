package com.ir.account.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ir.account.entity.SaleContract;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ir.account.entity.vo.SaleContractQuery;
import com.ir.account.entity.vo.SaleContractVo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author pyf
 * @since 2022-04-18
 */
public interface SaleContractService extends IService<SaleContract> {
    List<SaleContract> getConditionContract(SaleContractQuery query);
}

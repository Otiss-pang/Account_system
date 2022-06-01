package com.ir.account.service;

import com.ir.account.entity.ContractOwnership;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ir.account.entity.vo.OwnershipQuery;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author pyf
 * @since 2022-04-22
 */
public interface ContractOwnershipService extends IService<ContractOwnership> {

    ContractOwnership getConditionOwnership(OwnershipQuery query);
}

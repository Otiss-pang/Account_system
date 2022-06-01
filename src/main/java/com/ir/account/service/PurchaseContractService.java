package com.ir.account.service;

import com.ir.account.entity.PurchaseContract;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ir.account.entity.SaleContract;
import com.ir.account.entity.vo.PurchaseContractQuery;
import com.ir.account.entity.vo.PurchaseContractVo;
import com.ir.account.utils.R;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author pyf
 * @since 2022-04-13
 */
public interface PurchaseContractService extends IService<PurchaseContract> {

    int updateContract(PurchaseContractVo contractVo);

    List<PurchaseContract> getConditionContract(PurchaseContractQuery query);
}

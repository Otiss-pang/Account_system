package com.ir.account.service.impl;

import com.ir.account.entity.PurchaseContract;
import com.ir.account.entity.SaleContract;
import com.ir.account.entity.vo.PurchaseContractQuery;
import com.ir.account.entity.vo.PurchaseContractVo;
import com.ir.account.mapper.PurchaseContractMapper;
import com.ir.account.service.PurchaseContractService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ir.account.utils.R;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

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
public class PurchaseContractServiceImpl extends ServiceImpl<PurchaseContractMapper, PurchaseContract> implements PurchaseContractService {

    @Resource
    PurchaseContractMapper contractMapper;

    @Override
    public int updateContract(PurchaseContractVo contractVo) {
        PurchaseContract contract = new PurchaseContract();
        BeanUtils.copyProperties(contractVo,contract);
        int res = baseMapper.updateById(contract);
        return res;


    }

    @Override
    public List<PurchaseContract> getConditionContract(PurchaseContractQuery query) {
        List<PurchaseContract> list =  contractMapper.getConditionContract(query);
        return list;
    }
}

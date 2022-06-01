package com.ir.account.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ir.account.entity.ContractOwnership;
import com.ir.account.entity.vo.OwnershipQuery;
import com.ir.account.mapper.ContractOwnershipMapper;
import com.ir.account.service.ContractOwnershipService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author pyf
 * @since 2022-04-22
 */
@Service
public class ContractOwnershipServiceImpl extends ServiceImpl<ContractOwnershipMapper, ContractOwnership> implements ContractOwnershipService {


    @Override
    public ContractOwnership getConditionOwnership(OwnershipQuery query) {
        QueryWrapper<ContractOwnership> wrapper = new QueryWrapper<>();
        String name = query.getName();
        Integer state = query.getState();
        if (!StringUtils.hasLength(name)){
            wrapper.like("name",name);
        }
        if (state != null){
            wrapper.eq("state",state);
        }
        ContractOwnership ownership = this.getOne(wrapper);
        return ownership;
    }
}

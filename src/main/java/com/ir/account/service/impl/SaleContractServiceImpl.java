package com.ir.account.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ir.account.entity.SaleContract;
import com.ir.account.entity.SaleProduct;
import com.ir.account.entity.vo.SaleContractQuery;
import com.ir.account.entity.vo.SaleContractVo;
import com.ir.account.mapper.SaleContractMapper;
import com.ir.account.service.SaleContractService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ir.account.service.SaleProductService;
import com.ir.account.service.SaleReceiptService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author pyf
 * @since 2022-04-18
 */
@Service
public class SaleContractServiceImpl extends ServiceImpl<SaleContractMapper, SaleContract> implements SaleContractService {

    // 使用@Resource不爆红

    @Resource
    private SaleContractMapper saleContractMapper;

    @Override
    public List<SaleContract> getConditionContract(SaleContractQuery query) {

        List<SaleContract> list = saleContractMapper.getSaleContractCondition(query);
        return  list;

    }
}

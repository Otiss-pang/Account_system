package com.ir.account.service.impl;

import com.ir.account.entity.SaleReceipt;
import com.ir.account.entity.salevo.CostManageVo;
import com.ir.account.mapper.SaleReceiptMapper;
import com.ir.account.service.SaleReceiptService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

import javax.annotation.Resource;
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
public class SaleReceiptServiceImpl extends ServiceImpl<SaleReceiptMapper, SaleReceipt> implements SaleReceiptService {

    @Resource
    private SaleReceiptMapper receiptMapper;

    @Override
    public List<CostManageVo> getAllList() {
        List<CostManageVo> list =  receiptMapper.getAllList();
        return list;
    }
}

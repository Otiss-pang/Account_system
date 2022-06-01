package com.ir.account.controller;


import cn.dev33.satoken.annotation.SaCheckLogin;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ir.account.entity.PurchaseContract;
import com.ir.account.entity.SaleContract;
import com.ir.account.entity.vo.PurchaseContractQuery;
import com.ir.account.service.PurchaseContractService;
import com.ir.account.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author pyf
 * @since 2022-04-13
 */
@RestController
@RequestMapping("/account/contract")
@CrossOrigin
//@SaCheckLogin
public class PurchaseContractController {

    @Autowired
    private PurchaseContractService purchaseContractService;

    //查找所有采购合同
    @GetMapping("findAll")
    public R getAllContract() {
        List<PurchaseContract> list = purchaseContractService.list(null);
        return R.ok().data("list", list);
    }

    //添加采购合同
    @PostMapping("addContract")
    public R addContract(@RequestBody PurchaseContract contract) {
        purchaseContractService.save(contract);
        return R.ok();
    }

    //修改采购合同
    @PostMapping("updateContract")
    public R updateContract(@RequestBody PurchaseContract contract) {
        purchaseContractService.updateById(contract);
        return R.ok();
    }

    //分页查询采购合同
    @GetMapping("pageContract/{current}/{limit}")
    @ResponseBody
    public R pageListContract(@PathVariable long current,
                              @PathVariable long limit){
        //创建page对象
        Page<PurchaseContract> pageContract = new Page<>(current,limit);
        //查询所有的contract
        //将所有数据封装在pageContract中
        purchaseContractService.page(pageContract,null);
        long total = pageContract.getTotal();//总记录数
        List<PurchaseContract> records = pageContract.getRecords();

        return R.ok().data("total",total).data("rows",records);
    }

    //根据id查询合同编号
    @GetMapping("{id}")
    public R getContractById(@PathVariable Integer id){
//        QueryWrapper<PurchaseContract> wrapper = new QueryWrapper<>();
//        wrapper.eq("contract_id",id);
//        PurchaseContract contract = purchaseContractService.getOne(wrapper);
        PurchaseContract contract = purchaseContractService.getById(id);
        return R.ok().data("contract",contract);
    }

    //条件查询采购合同
    @PostMapping("getConditionContract/{current}/{limit}")
    public R getConditionContract(@PathVariable Integer current,
                                  @PathVariable Integer limit,
                                  @RequestBody PurchaseContractQuery query){
        // 实现分页
        query.setFrom((current-1)*limit);
        query.setSize(limit);
        List<PurchaseContract> list = purchaseContractService.getConditionContract(query);
        // 实现total
        query.setFrom(0);
        query.setSize(1000000);
        return R.ok().data("total",purchaseContractService.getConditionContract(query).size()).data("data",list);

    }

}


package com.ir.account.controller;


import cn.dev33.satoken.annotation.SaCheckLogin;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ir.account.entity.SaleContract;
import com.ir.account.entity.vo.SaleContractQuery;
import com.ir.account.service.SaleContractService;
import com.ir.account.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author pyf
 * @since 2022-04-18
 */
@RestController
@RequestMapping("/account/saleContract")
@CrossOrigin
//@SaCheckLogin
public class SaleContractController {

    @Autowired
    private SaleContractService contractService;


    @GetMapping("findAll")
    public R getAllContracts(){
        List<SaleContract> list = contractService.list(null);
        return R.ok().data("list",list);
    }

    //添加销售合同
    @PostMapping("addContract")
    public R addContract(@RequestBody SaleContract contract){
        boolean flag = contractService.save(contract);
        return R.ok();
    }

    //修改销售合同
    @PostMapping("updateContract")
    public R updateContract(@RequestBody SaleContract contract){
        contractService.updateById(contract);
        return R.ok();
    }

    //分页查找所有销售合同
    @GetMapping("pageSaleContract/{current}/{limit}")
    public R pageSaleContract(@PathVariable long current,
                              @PathVariable long limit){
        //创建page对象
        Page<SaleContract> pageContract = new Page<>(current,limit);
        //查询所有的contract
        //将所有数据封装在pageContract中
        contractService.page(pageContract,null);
        long total = pageContract.getTotal();//总记录数
        List<SaleContract> records = pageContract.getRecords();

        return R.ok().data("rows",records).data("total",total);
    }

    //根据id查找合同
    @GetMapping("getContractById/{id}")
    public R getContractById(@PathVariable Integer id){
        SaleContract contract = contractService.getById(id);
        return R.ok().data("contract",contract);
    }

    //分页按条件查询合同
    @PostMapping("getConditionContract/{current}/{limit}")
    public R getConditionContract(@PathVariable Integer current,
                                  @PathVariable Integer limit,
                                  @RequestBody(required = false) SaleContractQuery query){

        // 实现分页
        query.setFrom((current-1)*limit);
        query.setSize(limit);
        List<SaleContract> list = contractService.getConditionContract(query);
        // 实现total
        query.setFrom(0);
        query.setSize(1000000);
        return R.ok().data("total",contractService.getConditionContract(query).size()).data("data",list);
    }

}


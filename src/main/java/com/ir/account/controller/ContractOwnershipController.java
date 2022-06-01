package com.ir.account.controller;


import cn.dev33.satoken.annotation.SaCheckLogin;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ir.account.entity.ContractOwnership;
import com.ir.account.entity.vo.OwnershipQuery;
import com.ir.account.service.ContractOwnershipService;
import com.ir.account.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  合同所属管理
 * </p>
 *
 * @author pyf
 * @since 2022-04-22
 */

@RestController
@RequestMapping("/account/contractOwnership")
@CrossOrigin
//@SaCheckLogin
public class ContractOwnershipController {

    @Autowired
    private ContractOwnershipService ownershipService;

    //分页查询合同所属
    @GetMapping("pageOwnership/{current}/{limit}")
    public R pageOwnership(@PathVariable Integer current,
                           @PathVariable Integer limit){
        Page<ContractOwnership> page = new Page<>(current,limit);
        ownershipService.page(page,null);
        long total = page.getTotal();
        List<ContractOwnership> records = page.getRecords();
        return R.ok().data("total",total).data("rows",records);
    }

    //添加合同所属
    @PostMapping("addOwnership")
    public R addOwnership(@RequestBody ContractOwnership contractOwnership){
        ownershipService.save(contractOwnership);
        return R.ok();
    }
    //修改合同所属

    @PostMapping("updateOwnership")
    public R updateOwnership(@RequestBody ContractOwnership contractOwnership){
        ownershipService.updateById(contractOwnership);
        return R.ok();
    }

    //根据所属名称和状态查找合同所属
    @PostMapping("getConditionOwnership")
    public R getConditionOwnership(@RequestBody(required = false) OwnershipQuery query){
        ContractOwnership conditionOwnership = ownershipService.getConditionOwnership(query);
        return R.ok().data("ownership",conditionOwnership);
    }

    //根据id查询合同所属
    @GetMapping("getInfoById/{id}")
    public R getInfoById(@PathVariable Integer id){
        ContractOwnership contractOwnership = ownershipService.getById(id);
        return R.ok().data("ownership",contractOwnership);
    }
}


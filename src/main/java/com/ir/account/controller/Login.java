package com.ir.account.controller;

import cn.dev33.satoken.stp.StpUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ir.account.entity.User;
import com.ir.account.service.UserService;
import com.ir.account.utils.R;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin//解决跨域问题
public class Login {

    @Autowired
    private UserService userService;

    //login
    @PostMapping("login")
    public R login(@RequestBody User user){
//        if(StringUtils.isAllBlank(user.getUsername()) || StringUtils.isAllBlank(user.getPassword())){
//            return R.error().message("用户名或密码不能为空");
//        }
//        User one = userService.getOne(new QueryWrapper<User>().eq("username", user.getUsername()));
//        if(one == null ||
//                !user.getPassword().equals(one.getPassword())){
//            return R.error().message("用户名或密码错误");
//        }
//        StpUtil.login(one.getId());
//        List<String> roleList = StpUtil.getRoleList();
//        return R.ok().darota("les",roleList).data("permissions", StpUtil.getPermissionList());
        return R.ok();
    }

    //info
    @GetMapping("info")
    public R info(){
//        if (!StpUtil.isLogin()){
//            return R.error().message("未登录");
//        }
//        List<String> roleList = StpUtil.getRoleList();
//        return R.ok().data("roles",roleList).data("permissions", StpUtil.getPermissionList());
        return R.ok();
    }
}

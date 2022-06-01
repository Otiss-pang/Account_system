package com.ir.account.service.impl;

import com.ir.account.entity.Permission;
import com.ir.account.entity.Role;
import com.ir.account.entity.User;
import com.ir.account.mapper.UserMapper;
import com.ir.account.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 用户信息 服务实现类
 * </p>
 *
 * @author pyf
 * @since 2022-05-10
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<Role> listRoleByUserId(int parseInt) {
        return userMapper.listRoleByUserId(parseInt);
    }

    @Override
    public List<Permission> listPermission(int uid) {
        return userMapper.listPermissionByUserId(uid);
    }
}

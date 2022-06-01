package com.ir.account.service;

import com.ir.account.entity.Permission;
import com.ir.account.entity.Role;
import com.ir.account.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 用户信息 服务类
 * </p>
 *
 * @author pyf
 * @since 2022-05-10
 */
public interface UserService extends IService<User> {

    List<Role> listRoleByUserId(int uid);

    List<Permission> listPermission(int uid);
}

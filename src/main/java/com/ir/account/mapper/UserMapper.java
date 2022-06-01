package com.ir.account.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ir.account.entity.Permission;
import com.ir.account.entity.Role;
import com.ir.account.entity.User;

import java.util.List;

/**
 * <p>
 * 用户信息 Mapper 接口
 * </p>
 *
 * @author pyf
 * @since 2022-05-10
 */
public interface UserMapper extends BaseMapper<User> {
    List<Role> listRoleByUserId(Integer uid);
    List<Permission> listPermissionByUserId(Integer uid);
}

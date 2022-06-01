package com.ir.account.service.impl;

import com.ir.account.entity.UserRole;
import com.ir.account.mapper.UserRoleMapper;
import com.ir.account.service.UserRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户-角色表 服务实现类
 * </p>
 *
 * @author pyf
 * @since 2022-05-10
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements UserRoleService {

}

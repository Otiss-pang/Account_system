package com.ir.account.service.impl;

import com.ir.account.entity.Role;
import com.ir.account.mapper.RoleMapper;
import com.ir.account.service.RoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色表 服务实现类
 * </p>
 *
 * @author pyf
 * @since 2022-05-10
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {

}

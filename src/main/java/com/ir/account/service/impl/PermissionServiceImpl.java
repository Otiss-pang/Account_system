package com.ir.account.service.impl;

import com.ir.account.entity.Permission;
import com.ir.account.mapper.PermissionMapper;
import com.ir.account.service.PermissionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 权限资源表 服务实现类
 * </p>
 *
 * @author pyf
 * @since 2022-05-10
 */
@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements PermissionService {

}

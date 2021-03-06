package com.ir.account.config;

import cn.dev33.satoken.stp.StpInterface;
import com.ir.account.entity.Permission;
import com.ir.account.entity.Role;
import com.ir.account.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 自定义权限验证接口扩展
 */
@Component    // 保证此类被SpringBoot扫描，完成Sa-Token的自定义权限验证扩展
public class StpInterfaceImpl implements StpInterface {


    @Autowired
    private UserService userService;

    /**
     * 返回一个账号所拥有的权限码集合
     */
    @Override
    public List<String> getPermissionList(Object loginId, String loginType) {

        return userService.listPermission(Integer.parseInt((String) loginId))
                .stream()
                .map(Permission::getPerm)
                .collect(Collectors.toList());
    }

    /**
     * 返回一个账号所拥有的角色标识集合 (权限与角色可分开校验)
     */
    @Override
    public List<String> getRoleList(Object loginId, String loginType) {

        return userService.listRoleByUserId(Integer.parseInt((String) loginId))
                .stream()
                .map(Role::getRoleName)
                .collect(Collectors.toList());
    }

}

package com.ir.account.utils;

import cn.dev33.satoken.interceptor.SaRouteInterceptor;
import cn.dev33.satoken.router.SaRouter;
import cn.dev33.satoken.stp.StpUtil;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SaTokenConfig implements WebMvcConfigurer {

    // 注册Sa-Token的注解拦截器，打开注解式鉴权功能
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        // 注册注解拦截器，并排除不需要注解鉴权的接口地址 (与登录拦截器无关)
//        registry.addInterceptor(new SaRouteInterceptor((req, res, handler) -> {
//
//            // 登录认证 -- 拦截所有路由，并排除/user/doLogin 用于开放登录
//            SaRouter.match("/**", "/acc/login", r -> StpUtil.checkLogin());
//            // 拥有/user/atCheck权限的用户才能访问该接口
//            SaRouter.match("/acc/atCheck", r -> StpUtil.checkPermission("/user/atCheck"));
//
//        })).addPathPatterns("/**");
//    }


}

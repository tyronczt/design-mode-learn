package com.tyron.design.mode.learn.method1.service;

import com.tyron.design.mode.learn.entity.UserInfo;

/**
 * @description: 用户操作接口实现类
 * @author: tyron
 * @create: 2023-01-30
 */
public class UserOperateServiceImpl implements IUserOperateService {
    @Override
    public void login(UserInfo userInfo) {
        // 用户登录
    }

    @Override
    public void register(UserInfo userInfo) {
        // 用户注册
    }

    @Override
    public void logout(UserInfo userInfo) {
        // 用户登出
    }
}
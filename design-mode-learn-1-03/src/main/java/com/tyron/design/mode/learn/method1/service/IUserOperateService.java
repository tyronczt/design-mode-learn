package com.tyron.design.mode.learn.method1.service;

import com.tyron.design.mode.learn.entity.UserInfo;

/**
 * @description: 用户操作接口
 * @author: tyron
 * @create: 2023-01-30
 */
public interface IUserOperateService {

    // 用户登录
    void login(UserInfo userInfo);

    // 用户注册
    void register(UserInfo userInfo);

    // 用户登出
    void logout(UserInfo userInfo);
}

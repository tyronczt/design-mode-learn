package com.tyron.design.mode.learn.method2.service;

import com.tyron.design.mode.learn.entity.UserInfo;

/**
 * @description: 用户操作接口
 * @author: tyron
 * @create: 2023-01-30
 */
public interface IUserOperateService {

    /**
     * 修改用户名
     *
     * @param userInfo 用户信息
     */
    void updateUserName(UserInfo userInfo);

    /**
     * 修改密码
     *
     * @param userInfo 用户信息
     */
    void updateUserPassword(UserInfo userInfo);
}

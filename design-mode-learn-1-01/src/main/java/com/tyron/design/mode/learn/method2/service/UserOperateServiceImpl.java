package com.tyron.design.mode.learn.method2.service;

import com.tyron.design.mode.learn.entity.UserInfo;

/**
 * @description: 用户操作接口实现类
 * @author: tyron
 * @create: 2023-01-30
 */
public class UserOperateServiceImpl implements IUserOperateService {
    @Override
    public void updateUserName(UserInfo userInfo) {
        System.out.println("正在修改用户名");
    }

    @Override
    public void updateUserPassword(UserInfo userInfo) {
        System.out.println("正在修改密码");
    }
}

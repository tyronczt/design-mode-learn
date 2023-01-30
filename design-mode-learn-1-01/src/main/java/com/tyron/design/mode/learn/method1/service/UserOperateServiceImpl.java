package com.tyron.design.mode.learn.method1.service;

import com.tyron.design.mode.learn.entity.UserInfo;
import com.tyron.design.mode.learn.method1.enums.OperateEnum;

/**
 * @description: 用户操作接口实现类
 * @author: tyron
 * @create: 2023-01-30
 */
public class UserOperateServiceImpl implements IUserOperateService {

    @Override
    public void updateUserInfo(OperateEnum type, UserInfo userInfo) {
        if (type == OperateEnum.UPDATE_PASSWORD) {
            // 修改密码
            System.out.println("正在修改密码");
        } else if (type == OperateEnum.UPDATE_USERNAME) {
            // 修改用户名
            System.out.println("正在修改用户名");
        }
    }
}

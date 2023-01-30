package com.tyron.design.mode.learn.method1.service;

import com.tyron.design.mode.learn.entity.UserInfo;
import com.tyron.design.mode.learn.method1.enums.OperateEnum;

/**
 * @description: 用户操作接口
 * @author: tyron
 * @create: 2023-01-30
 */
public interface IUserOperateService {

    /**
     * 修改用户信息
     *
     * @param type     操作类型
     * @param userInfo 用户信息
     */
    void updateUserInfo(OperateEnum type, UserInfo userInfo);
}

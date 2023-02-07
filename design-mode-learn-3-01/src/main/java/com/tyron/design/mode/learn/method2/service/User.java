package com.tyron.design.mode.learn.method2.service;

/**
 * @description: 用户抽象类
 * @author: tyron
 * @create: 2023-02-06
 */
public abstract class User {

    private String userId;
    private String userName;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}

package com.tyron.design.mode.learn.method1;

/**
 * @description: 客户端
 * @author: tyron
 * @create: 2023-02-12
 */
public class Client {

    public static void main(String[] args) {
        // 老师
        TeacherImpl teacher = new TeacherImpl();
        // 班长
        GroupLeaderImpl groupLeader = new GroupLeaderImpl();
        // 老师叫班长点名
        teacher.command(groupLeader);
    }
}

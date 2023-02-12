package com.tyron.design.mode.learn.method2;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 客户端
 * @author: tyron
 * @create: 2023-02-12
 */
public class Client {

    public static void main(String[] args) {
        // 全班同学
        List<Student> allStudent = new ArrayList<>();
        allStudent.add(new Student());
        allStudent.add(new Student());
        allStudent.add(new Student());
        allStudent.add(new Student());
        allStudent.add(new Student());
        allStudent.add(new Student());

        // 老师
        TeacherImpl teacher = new TeacherImpl();
        // 班长
        GroupLeaderImpl groupLeader = new GroupLeaderImpl(allStudent);
        // 老师叫班长点名
        teacher.command(groupLeader);
    }
}

package com.tyron.design.mode.learn.method2;

import java.util.List;

/**
 * @description: 班长接口实现
 * @author: tyron
 * @create: 2023-02-12
 */
public class GroupLeaderImpl implements IGroupLeader {
    private List<Student> students;

    public GroupLeaderImpl(List<Student> students) {
        this.students = students;
    }
    @Override
    public void count() {
        if (null != students && students.size() > 0) {
            System.out.println("上课的学生人数是：" + students.size());
        }
    }
}
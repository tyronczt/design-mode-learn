package com.tyron.design.mode.learn.method1;

import java.util.List;

/**
 * @description: 班长接口实现
 * @author: tyron
 * @create: 2023-02-12
 */
public class GroupLeaderImpl implements IGroupLeader {

    @Override
    public void count(List<Student> students) {
        if (null != students && students.size() > 0) {
            System.out.println("上课的学生人数是：" + students.size());
        }
    }
}
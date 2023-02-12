package com.tyron.design.mode.learn.method1;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 老师接口实现
 * @author: tyron
 * @create: 2023-02-12
 */
public class TeacherImpl implements ITeacher {
    @Override
    public void command(IGroupLeader iGroupLeader) {
        // 全班同学
        List<Student> allStudent = new ArrayList<>();
        allStudent.add(new Student());
        allStudent.add(new Student());
        allStudent.add(new Student());
        allStudent.add(new Student());
        allStudent.add(new Student());
        // 班长清点人数
        iGroupLeader.count(allStudent);
    }
}
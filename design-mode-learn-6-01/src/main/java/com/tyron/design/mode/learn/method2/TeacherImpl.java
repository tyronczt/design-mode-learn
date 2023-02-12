package com.tyron.design.mode.learn.method2;

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
        // 班长清点人数
        iGroupLeader.count();
    }
}
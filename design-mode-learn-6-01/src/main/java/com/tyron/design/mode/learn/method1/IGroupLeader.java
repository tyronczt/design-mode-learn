package com.tyron.design.mode.learn.method1;

import java.util.List;

/**
 * @description: 班长接口
 * @author: tyron
 * @create: 2023-02-12
 */
public interface IGroupLeader {
    // 清点人数
    void count(List<Student> students);
}

package com.tyron.design.mode.learn.principle2;

import java.util.List;

/**
 * @description: 抽奖接口
 * @author: tyron
 * @create: 2023-02-08
 */
public interface IDraw {
    List<BetUser> prize(List<BetUser> list, int count);
}
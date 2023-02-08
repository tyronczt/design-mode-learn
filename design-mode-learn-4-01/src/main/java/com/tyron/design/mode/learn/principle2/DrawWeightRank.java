package com.tyron.design.mode.learn.principle2;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 权重抽奖
 * @author: tyron
 * @create: 2023-02-08
 */
public class DrawWeightRank implements IDraw {

    @Override
    public List<BetUser> prize(List<BetUser> list, int count) {
        // 按照权重排序
        list.sort((o1, o2) -> {
            int e = o2.getUserWeight() - o1.getUserWeight();
            if (0 == e) return 0;
            return e > 0 ? 1 : -1;
        });
        // 取出指定数量的中奖用户
        List<BetUser> prizeList = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            prizeList.add(list.get(i));
        }
        return prizeList;
    }
}
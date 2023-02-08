package com.tyron.design.mode.learn.principle2;

import com.tyron.design.mode.learn.principle2.BetUser;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @description: 抽奖控制
 * @author: tyron
 * @create: 2023-02-08
 */
public class DrawControl {

    private IDraw draw;

    public List<BetUser> doDraw(IDraw draw, List<BetUser> betUserList, int count) {
        return draw.prize(betUserList, count);
    }
}
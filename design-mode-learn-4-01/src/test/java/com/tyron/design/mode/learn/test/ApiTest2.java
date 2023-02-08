package com.tyron.design.mode.learn.test;

import com.alibaba.fastjson.JSON;
import com.tyron.design.mode.learn.principle2.BetUser;
import com.tyron.design.mode.learn.principle2.DrawControl;
import com.tyron.design.mode.learn.principle2.DrawRandom;
import com.tyron.design.mode.learn.principle2.DrawWeightRank;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 测试2
 * @author: tyron
 * @create: 2023-02-08
 */
public class ApiTest2 {
    private Logger logger = LoggerFactory.getLogger(ApiTest2.class);

    @Test
    public void test_DrawControl() {
        List<BetUser> betUserList = new ArrayList<>();
        betUserList.add(new BetUser("花花", 65));
        betUserList.add(new BetUser("豆豆", 43));
        betUserList.add(new BetUser("小白", 72));
        betUserList.add(new BetUser("笨笨", 89));
        betUserList.add(new BetUser("丑蛋", 10));

        DrawControl drawControl = new DrawControl();
        List<BetUser> prizeRandomUserList = drawControl.doDraw(new DrawRandom(), betUserList, 3);
        logger.info("随机抽奖，中奖用户名单：{}", JSON.toJSON(prizeRandomUserList));

        List<BetUser> prizeWeightUserList = drawControl.doDraw(new DrawWeightRank(), betUserList, 3);
        logger.info("权重抽奖，中奖用户名单：{}", JSON.toJSON(prizeWeightUserList));
    }
}
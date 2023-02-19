package com.tyron.design.mode.learn.simpledesign;

import com.tyron.design.mode.learn.nodesign.AliPay;
import com.tyron.design.mode.learn.nodesign.IPay;
import com.tyron.design.mode.learn.nodesign.UnionPay;
import com.tyron.design.mode.learn.nodesign.WeChatPay;

/**
 * @description: 简单工厂
 * @author: tyron
 * @create: 2023-02-18
 */
public class SimpleFactory {

    public static IPay createPayMethod(String patMethod) {
        switch (patMethod) {
            case "wechat":
                return new WeChatPay();
            case "aliPay":
                return new AliPay();
            default:
                return new UnionPay();
        }
    }
}

package com.tyron.design.mode.learn.nodesign;

/**
 * @description: 支付接口
 * @author: tyron
 * @create: 2023-02-18
 */
public interface IPay {
    String getName();
    Double queryBalance();

    default void pay(Double price) {
        Double currentAmount = queryBalance();
        if (currentAmount < price) {
            System.out.println(getName() + "余额不足");
        } else {
            System.out.println(getName() + "支付成功");
        }
    }
}
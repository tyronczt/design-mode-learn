package com.tyron.design.mode.learn.easy.impl;

import com.tyron.design.mode.learn.easy.strategy.IPaymentStrategy;

/**
 * 具体策略类（微信支付）
 */

public class WeChatPayStrategy implements IPaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("微信支付：" + amount + "元");
    }
}

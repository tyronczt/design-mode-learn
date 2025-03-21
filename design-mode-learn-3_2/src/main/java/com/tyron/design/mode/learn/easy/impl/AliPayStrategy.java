package com.tyron.design.mode.learn.easy.impl;

import com.tyron.design.mode.learn.easy.strategy.IPaymentStrategy;

/**
 * 具体策略类（支付宝支付）
 */
public class AliPayStrategy implements IPaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("支付宝支付：" + amount + "元");
    }
}

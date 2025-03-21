package com.tyron.design.mode.learn.advanced.impl;

import com.tyron.design.mode.learn.advanced.strategy.IPaymentHandleStrategy;
import org.springframework.stereotype.Service;

@Service
public class AliPayHandleStrategyImpl implements IPaymentHandleStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("【策略+工厂】支付宝支付：" + amount + "元");
    }
}

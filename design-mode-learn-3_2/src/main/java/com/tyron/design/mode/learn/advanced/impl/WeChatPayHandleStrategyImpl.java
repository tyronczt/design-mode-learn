package com.tyron.design.mode.learn.advanced.impl;

import com.tyron.design.mode.learn.advanced.strategy.IPaymentHandleStrategy;
import org.springframework.stereotype.Service;

/**
 * 具体策略类（微信支付）
 */
@Service
public class WeChatPayHandleStrategyImpl implements IPaymentHandleStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("【策略+工厂】微信支付：" + amount + "元");
    }
}
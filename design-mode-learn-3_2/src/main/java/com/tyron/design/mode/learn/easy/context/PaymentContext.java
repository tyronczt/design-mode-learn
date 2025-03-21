package com.tyron.design.mode.learn.easy.context;

import com.tyron.design.mode.learn.easy.strategy.IPaymentStrategy;

/**
 * 上下文类（管理策略）
 */
public class PaymentContext {
    private IPaymentStrategy strategy;

    public void setStrategy(IPaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void executePayment(double amount) {
        if (strategy != null) {
            strategy.pay(amount);
        } else {
            throw new IllegalStateException("未选择支付方式");
        }
    }
}


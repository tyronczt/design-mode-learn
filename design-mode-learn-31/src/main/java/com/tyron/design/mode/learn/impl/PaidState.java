package com.tyron.design.mode.learn.impl;

import com.tyron.design.mode.learn.context.OrderContext;
import com.tyron.design.mode.learn.strategy.IOrderState;

/**
 * 已支付，待发货状态
 */
public class PaidState implements IOrderState {
    @Override
    public void handle(OrderContext context) {
        System.out.println("订单已支付，准备发货...");
        context.setState(new ShippedState());
    }
}

package com.tyron.design.mode.learn.impl;

import com.tyron.design.mode.learn.context.OrderContext;
import com.tyron.design.mode.learn.strategy.IOrderState;

/**
 * 已发货状态
 */
public class ShippedState implements IOrderState {
    @Override
    public void handle(OrderContext context) {
        System.out.println("订单已发货，待收货...");
    }
}

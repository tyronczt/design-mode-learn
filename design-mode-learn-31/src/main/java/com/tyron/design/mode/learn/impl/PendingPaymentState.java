package com.tyron.design.mode.learn.impl;

import com.tyron.design.mode.learn.context.OrderContext;
import com.tyron.design.mode.learn.state.IOrderState;

/**
 * 待处理付款状态
 */
public class PendingPaymentState implements IOrderState {
    // 实现接口中的handle方法
    @Override
    public void handle(OrderContext context) {
        // 打印订单待支付信息
        System.out.println("订单待支付，跳转支付页面...");
        context.setState(new PaidState()); // 状态切换
    }
}

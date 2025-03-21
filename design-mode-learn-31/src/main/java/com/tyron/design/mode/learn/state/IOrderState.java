package com.tyron.design.mode.learn.state;

import com.tyron.design.mode.learn.context.OrderContext;

/**
 * 订单状态接口
 *
 * 此接口定义了订单在不同阶段可能所处的状态它提供了一种标准来规范订单状态的管理，
 * 包括但不限于创建、支付、发货、完成和取消等状态通过实现此接口，可以确保不同类型的
 */
public interface IOrderState {
    /**
     * 处理订单上下文
     */
    void handle(OrderContext context);
}


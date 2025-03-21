package com.tyron.design.mode.learn.context;

import com.tyron.design.mode.learn.strategy.IOrderState;

/**
 * OrderContext 类用于管理订单的状态和状态转换。
 * 它通过调用当前状态对象的方法来处理订单。
 *
 * 核心功能：
 * - 设置订单状态
 * - 处理订单
 */
public class OrderContext {
    private IOrderState state;

    public void setState(IOrderState state) {
        this.state = state;
    }

    public void process() {
        state.handle(this);
    }
}


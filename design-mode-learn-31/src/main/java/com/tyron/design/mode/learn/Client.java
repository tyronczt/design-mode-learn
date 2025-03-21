package com.tyron.design.mode.learn;

import com.tyron.design.mode.learn.context.OrderContext;
import com.tyron.design.mode.learn.impl.PendingPaymentState;

// 客户端测试
public class Client {
    /**
     * 程序的入口点
     * 演示了一个订单状态的转换过程，从待支付状态到已发货状态
     */
    public static void main(String[] args) {
        // 创建一个订单上下文实例
        OrderContext order = new OrderContext();
        // 设置订单的初始状态为待支付
        order.setState(new PendingPaymentState());

        order.process(); // 输出：订单待支付，跳转支付页面...
        order.process(); // 输出：订单已支付，准备发货...
        order.process(); // 输出：订单已发货，待收货...
    }
}
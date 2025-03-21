package com.tyron.design.mode.learn.easy;

import com.tyron.design.mode.learn.easy.context.PaymentContext;
import com.tyron.design.mode.learn.easy.impl.AliPayStrategy;
import com.tyron.design.mode.learn.easy.impl.WeChatPayStrategy;

// 客户端测试
public class Client {
    /**
     * 程序的入口点
     * 演示了一个订单状态的转换过程，从待支付状态到已发货状态
     */
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();
        context.setStrategy(new WeChatPayStrategy());
        context.executePayment(100.0);  // 输出：微信支付：100.0元

        context.setStrategy(new AliPayStrategy());
        context.executePayment(200.0);  // 输出：支付宝支付：200.0元
    }
}
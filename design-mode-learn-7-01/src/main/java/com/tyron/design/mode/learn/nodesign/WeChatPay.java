package com.tyron.design.mode.learn.nodesign;

/**
 * @description: 微信支付
 * @author: tyron
 * @create: 2023-02-18
 */
public class WeChatPay implements IPay {
    @Override
    public String getName() {
        return "微信支付";
    }

    @Override
    public Double queryBalance() {
        return 200.0;
    }
}
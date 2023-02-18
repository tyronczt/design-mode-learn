package com.tyron.design.mode.learn.nodesign;

/**
 * @description: 支付宝支付
 * @author: tyron
 * @create: 2023-02-18
 */
public class AliPay implements IPay {
    @Override
    public String getName() {
        return "支付宝";
    }

    @Override
    public Double queryBalance() {
        return 900.0;
    }
}
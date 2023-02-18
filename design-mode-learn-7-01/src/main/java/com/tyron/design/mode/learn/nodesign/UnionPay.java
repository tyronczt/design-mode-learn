package com.tyron.design.mode.learn.nodesign;

/**
 * @description: 银行卡支付
 * @author: tyron
 * @create: 2023-02-18
 */
public class UnionPay implements IPay {
    @Override
    public String getName() {
        return "银行卡";
    }
    @Override
    public Double queryBalance() {
        return 10000.0;
    }
}
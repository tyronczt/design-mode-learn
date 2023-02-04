package com.tyron.design.mode.learn.method2.service;

import com.tyron.design.mode.learn.method2.entity.Pay;

/**
 * @description: 支付宝接口实现
 * @author: tyron
 * @create: 2023-02-03
 */
public class AliPaymentServiceImpl implements IPaymentService{
    @Override
    public void pay(Pay pay) {
        System.out.println("正在支付宝付款...");
    }
}

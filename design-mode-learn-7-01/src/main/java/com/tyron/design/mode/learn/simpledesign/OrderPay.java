package com.tyron.design.mode.learn.simpledesign;

import com.tyron.design.mode.learn.nodesign.AliPay;
import com.tyron.design.mode.learn.nodesign.IPay;
import com.tyron.design.mode.learn.nodesign.UnionPay;
import com.tyron.design.mode.learn.nodesign.WeChatPay;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @description: 支付工厂
 * @author: tyron
 * @create: 2023-02-18
 */
public class OrderPay {
    public OrderPay() {
        String method = getMethod();
        IPay pay = SimpleFactory.createPayMethod(method);
        pay.pay(500.0);
    }

    private String getMethod() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入支付方式：");
        try {
            return bufferedReader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
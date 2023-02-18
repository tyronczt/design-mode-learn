package com.tyron.design.mode.learn.nodesign;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @description: 客户端
 * @author: tyron
 * @create: 2023-02-18
 */
public class Client {

    public static void main(String[] args) throws IOException {
        double price = 500.0;
        String payMethod = getMethod();
        if ("aliPay".equals(payMethod)) {
            AliPay aliPay = new AliPay();
            aliPay.pay(price);
        } else if ("union".equals(payMethod)) {
            UnionPay unionPay = new UnionPay();
            unionPay.pay(price);
        } else if ("wechat".equals(payMethod)) {
            WeChatPay weChatPay = new WeChatPay();
            weChatPay.pay(price);
        } else {
            System.out.println("请输入正确的支付方式：aliPay | union | wechat");
        }
    }

    private static String getMethod() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入支付方式：");
        return bufferedReader.readLine();
    }
}

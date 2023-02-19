package com.tyron.design.mode.learn.simpledesign;

import com.tyron.design.mode.learn.nodesign.IPay;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @description: 客户端
 * @author: tyron
 * @create: 2023-02-18
 */
public class Client {

//    public static void main(String[] args) throws IOException {
//        double price = 500.0;
//        String payMethod = getMethod();
//        IPay pay = payFactory.createPayMethod(payMethod);
//        pay.pay(price);
//    }

    private static String getMethod() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入支付方式：");
        return bufferedReader.readLine();
    }
}

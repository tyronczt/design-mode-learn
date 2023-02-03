package com.tyron.design.mode.learn.method1.service;

import com.tyron.design.mode.learn.method1.entity.PaymentMethodsEnum;
import com.tyron.design.mode.learn.method1.entity.UserInfo;

/**
 * @description: 支付业务接口实现
 * @author: tyron
 * @create: 2023-02-03
 */
public class PayBusinessSerivceImpl implements IPayBusinessService {

    @Override
    public void payOperate(PaymentMethodsEnum type, UserInfo userInfo) {
        // 支付宝
        if (type == PaymentMethodsEnum.ALI_PAY) {
            System.out.println("正在支付宝付款...");
        } else if (type == PaymentMethodsEnum.WECHAT_PAY) {
            System.out.println("正在微信付款...");
        } else if (type == PaymentMethodsEnum.BANK_PAY) {
            System.out.println("正在银行卡付款...");
        }
    }
}
package com.tyron.design.mode.learn.method2.entity;

import com.tyron.design.mode.learn.PaymentTypeEnum;

/**
 * @description: 支付对象
 * @author: tyron
 * @create: 2023-02-03
 */
public class Pay {

    private PaymentTypeEnum paymentTypeEnum;

    public PaymentTypeEnum getPaymentTypeEnum() {
        return paymentTypeEnum;
    }

    public void setPaymentTypeEnum(PaymentTypeEnum paymentTypeEnum) {
        this.paymentTypeEnum = paymentTypeEnum;
    }
}

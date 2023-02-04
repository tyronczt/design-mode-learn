package com.tyron.design.mode.learn;

/**
 * @description: 支付方式枚举
 * @author: tyron
 * @create: 2023-02-03
 */
public enum PaymentTypeEnum {
    ALI_PAY("AliPayment"),
    WECHAT_PAY("WechatPayment"),
    BANK_PAY("BankPayment");

    private String type;

    PaymentTypeEnum(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
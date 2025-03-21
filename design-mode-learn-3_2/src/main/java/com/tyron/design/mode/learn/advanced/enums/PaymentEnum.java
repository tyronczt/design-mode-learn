package com.tyron.design.mode.learn.advanced.enums;

public enum PaymentEnum {

    // 微信支付
    WE_CHAT_PAY(1, "weChatPay", "微信支付"),
    // 支付宝支付
    ALI_PAY(2, "aliPay", "支付宝支付");


    private int code;
    private String name;
    private String desc;

    PaymentEnum(int code, String name, String desc) {
        this.code = code;
        this.name = name;
        this.desc = desc;
    }

    // 获取枚举常量的code属性
    public int getCode() {
        return code;
    }

    // 获取枚举常量的name属性
    public String getName() {
        return name;
    }

    // 获取枚举常量的desc属性
    public String getDesc() {
        return desc;
    }

    /**
     * 根据code获取枚举常量
     */

    public static PaymentEnum getPaymentEnumByCode(int code) {
        for (PaymentEnum paymentEnum : PaymentEnum.values()) {
            if (paymentEnum.getCode() == code) {
                return paymentEnum;
            }
        }
        return null;
    }

    /**
     * 根据code获取枚举常量的name属性
     *
     * @param code
     * @return
     */
    public static String getPaymentNameByCode(int code) {
        for (PaymentEnum paymentEnum : PaymentEnum.values()) {
            if (paymentEnum.getCode() == code) {
                return paymentEnum.getName();
            }
        }
        return null;
    }

}

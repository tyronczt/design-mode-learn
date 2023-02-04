package com.tyron.design.mode.learn.method1.service;

import com.tyron.design.mode.learn.PaymentTypeEnum;
import com.tyron.design.mode.learn.method1.entity.UserInfo;

/**
 * @description: 支付业务
 * @author: tyron
 * @create: 2023-02-03
 */
public interface IPayBusinessService {

    void payOperate(PaymentTypeEnum type, UserInfo userInfo);
}

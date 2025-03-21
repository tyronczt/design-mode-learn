package com.tyron.design.mode.learn.advanced;

import com.tyron.design.mode.learn.advanced.enums.PaymentEnum;
import com.tyron.design.mode.learn.advanced.factory.PaymentHandleStrategyFactory;
import com.tyron.design.mode.learn.advanced.strategy.IPaymentHandleStrategy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 进阶版客户端
 */
@RestController
public class AdvancedClientController {
    @Resource
    private PaymentHandleStrategyFactory paymentHandlerFactory;

    @GetMapping("/pay")
    public void pay(int code, double amount) {
        String paymentType = PaymentEnum.getPaymentNameByCode(code);
        if (paymentType != null) {
            // 根据支付方式选择支付处理器
            IPaymentHandleStrategy paymentHandleStrategy = paymentHandlerFactory.getPaymentHandleStrategy(paymentType);
            paymentHandleStrategy.pay(amount);
        }
    }
}

package com.tyron.design.mode.learn.advanced.factory;

import com.tyron.design.mode.learn.advanced.strategy.IPaymentHandleStrategy;
import com.tyron.design.mode.learn.util.SpringContextUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * 支付处理策略工厂
 */
@Slf4j
@Service
public class PaymentHandleStrategyFactory {

    /**
     * 根据支付类型获取相应的处理策略
     *
     * @param type 支付类型，用于确定使用哪种策略处理支付请求
     * @return IPaymentHandleStrategy 实现类，用于处理特定支付类型的策略
     */
    public IPaymentHandleStrategy getPaymentHandleStrategy(String type) {
        // 根据传入的类型参数选择并返回对应的支付处理策略
        // AliPay+HandleStrategyImpl
        IPaymentHandleStrategy iPaymentHandleStrategy = SpringContextUtil.getBean(type + "HandleStrategyImpl");
        // 检查 iPaymentHandleStrategy 是否为空，并增加防御性编程
        if (iPaymentHandleStrategy == null || StringUtils.isEmpty(iPaymentHandleStrategy)) {
            log.warn("getDatasetHandleStrategy error. type:{}", type);
            throw new RuntimeException("getDatasetHandleStrategy error. type:" + type);
        }
        return iPaymentHandleStrategy;
    }
}

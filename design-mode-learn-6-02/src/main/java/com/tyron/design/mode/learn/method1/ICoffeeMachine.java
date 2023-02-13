package com.tyron.design.mode.learn.method1;

/**
 * @description: 咖啡机抽象接口
 * @author: tyron
 * @create: 2023-02-14
 */
public interface ICoffeeMachine {

    //加咖啡豆
    void addCoffeeBean();

    //加水
    void addWater();

    //制作咖啡
    void makeCoffee();
}

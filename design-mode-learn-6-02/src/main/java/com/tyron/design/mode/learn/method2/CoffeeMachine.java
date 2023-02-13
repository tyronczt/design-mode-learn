package com.tyron.design.mode.learn.method2;

/**
 * @description: 咖啡机
 * @author: tyron
 * @create: 2023-02-14
 */
public class CoffeeMachine implements ICoffeeMachine {
    //加咖啡豆
    public void addCoffeeBean() {
        System.out.println("加咖啡豆");
    }

    //加水
    public void addWater() {
        System.out.println("加水");
    }

    //制作咖啡
    public void makeCoffee() {
        System.out.println("制作咖啡");
    }

    @Override
    public void work() {
        addWater();
        addCoffeeBean();
        makeCoffee();
    }
}

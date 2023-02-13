package com.tyron.design.mode.learn.method1;

/**
 * @description: 咖啡机
 * @author: tyron
 * @create: 2023-02-14
 */
public class CoffeeMachine implements ICoffeeMachine{
    @Override
    public void addCoffeeBean() {
        System.out.println("加咖啡豆");
    }

    @Override
    public void addWater() {
        System.out.println("加水");
    }

    @Override
    public void makeCoffee() {
        System.out.println("制作咖啡");
    }
}

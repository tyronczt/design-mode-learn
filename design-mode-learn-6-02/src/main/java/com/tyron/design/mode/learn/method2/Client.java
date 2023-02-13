package com.tyron.design.mode.learn.method2;

/**
 * @description: 客户端
 * @author: tyron
 * @create: 2023-02-14
 */
public class Client {
    public static void main(String[] args) {
        ICoffeeMachine coffeeMachine = new CoffeeMachine();

        IMan man = new Man(coffeeMachine);
        man.makeCoffee();
    }
}

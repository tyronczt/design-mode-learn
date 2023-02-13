package com.tyron.design.mode.learn.method2;

/**
 * @description: 人制作咖啡
 * @author: tyron
 * @create: 2023-02-14
 */
public class Man implements IMan {
    private ICoffeeMachine coffeeMachine;

    public Man(ICoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    /**
     * 制作咖啡
     */
    @Override
    public void makeCoffee() {
        coffeeMachine.work();
    }
}

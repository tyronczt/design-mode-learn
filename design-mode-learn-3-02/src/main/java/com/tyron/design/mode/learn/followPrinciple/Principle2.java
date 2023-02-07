package com.tyron.design.mode.learn.followPrinciple;

/**
 * @description: 原则2：子类可以实现自己特有的方法
 * @author: tyron
 * @create: 2023-02-07
 */
public class Principle2 {

}

class Calculator2 {
    public int calculate(int n1, int n2) {
        return n1 + n2;
    }
}

class SonCalculator2 extends Calculator2 {
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int subtract(int n1, int n2) {
        return n1 - n2;
    }
}

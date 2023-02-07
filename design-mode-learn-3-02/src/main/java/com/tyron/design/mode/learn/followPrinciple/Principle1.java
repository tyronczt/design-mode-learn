package com.tyron.design.mode.learn.followPrinciple;

/**
 * @description: 原则1:子类必须完全实现父类的抽象方法，但不能覆盖父类的非抽象方法
 * @author: tyron
 * @create: 2023-02-07
 */
public class Principle1 {
    public static void main(String[] args) {
        Calculator1 c1 = new Calculator1();
        int sum = c1.calculate(5, 10);
        System.out.println(sum);
        SonCalculator1 c2 = new SonCalculator1();
        System.out.println(c2.calculate(5, 10));
    }
}

class Calculator1 {
    public int calculate(int n1, int n2) {
        return n1 + n2;
    }
}

class SonCalculator1 extends Calculator1 {
    public int calculate(int n1, int n2) {
        return n1 - n2;
    }
}
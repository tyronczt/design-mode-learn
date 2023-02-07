package com.tyron.design.mode.learn.followPrinciple;

/**
 * @description: 原则4 子类的实例可以替换任何父类的实例，但反之不成立
 * @author: tyron
 * @create: 2023-02-07
 */
public class Principle4 {
    public static void main(String[] args) {
        Calculator4 c1 = new Calculator4();
        int x = 1;
        int y = 2;
        int addResult = c1.calculate(x, y);
        System.out.println(addResult);

        SonCalculator4 c2 = new SonCalculator4();
        int subtractResult = c2.subtract(x, y);
        System.out.println(subtractResult);
    }
}

class Calculator4 {
    public int calculate(int n1, int n2) {
        return n1 + n2;
    }
}

class SonCalculator4 extends Calculator4 {
    public int subtract(int n1, int n2) {
        return n1 - n2;
    }
}

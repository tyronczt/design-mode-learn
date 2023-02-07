package com.tyron.design.mode.learn.followPrinciple;

import java.util.ArrayList;

/**
 * @description: 原则3：当子类的方法实现父类的抽象方法时，方法的后置条件（即方法的返回值）要比父类更严格
 * @author: tyron
 * @create: 2023-02-07
 */
public class Principle3 {
    public static ArrayList<String> stringToList(Calculator3 c, String s) {
        return c.stringToList(s);
    }
}

abstract class Calculator3 {
    public abstract ArrayList<String> stringToList(String s);
}

class SonCalculator3 extends Calculator3 {
    @Override
    public ArrayList<String> stringToList(String s) {
        return null;
    }
    // 代码报错！
//    public List<String> stringToList(String s) {
//        // do something
//    }
}

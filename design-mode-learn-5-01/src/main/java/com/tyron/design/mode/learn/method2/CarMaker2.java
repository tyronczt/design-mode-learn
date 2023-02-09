package com.tyron.design.mode.learn.method2;

/**
 * @description: 汽车工厂
 * @author: tyron
 * @create: 2023-02-09
 */
public class CarMaker2 {
    public static void main(String[] args) {
        Car c = new Car(new Gasoline(), new Blue());
        c.move();
    }
}

class Car {
    private Energy energy;
    private Color color;

    public Car(Energy e, Color c) {
        this.energy = e;
        this.color = c;
    }

    public void move() {
        System.out.println(energy.toString() + color.toString() + "move");
    }
}

interface Energy {
}

class Gasoline implements Energy {
    public String toString() {
        return "gasoline";
    }
}

class Electric implements Energy {
    public String toString() {
        return "electric";
    }
}

interface Color {
}

class Red implements Color {
    public String toString() {
        return "red";
    }
}

class Blue implements Color {
    public String toString() {
        return "blue";
    }
}
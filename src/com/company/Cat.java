package com.company;

public class Cat extends Animal {

    @Override
    public void move() {
        super.move();
        System.out.println(4);
    }

    @Override
    public void sleep() {

        System.out.println("Кот с весом " + getWeight() + " и скоростью " + getSpeed() + " уснул");

    }
}

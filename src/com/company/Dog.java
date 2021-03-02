package com.company;

public class Dog extends Animal
{
    @Override
    public void move() {
        super.move();
        System.out.println(5);
    }

    @Override
    public void sleep() {
        System.out.println("Пес с весом " + getWeight() + " и скоростью " + getSpeed() + " уснул");
    }
}

package com.company;

public class Main {

    private static int count = 0;

    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.move();
        Animal animal = new Animal();
        Dog dog = new Dog();

        System.out.println();


        dog.move();


    }


    public static void processAnimal(Animal animal) {


    }

    public static void processAnimal() {
        System.out.println("Метод без параметра");

    }


}

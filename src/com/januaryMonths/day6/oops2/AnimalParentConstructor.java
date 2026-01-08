package com.januaryMonths.day6.oops2;

class Animla {
    void Animal() {
        System.out.println("Dog is Great..");
    }
}

class Cat extends Animal {
    Cat() {
        super();
        System.out.println("Cat is Great...");
    }
}
public class AnimalParentConstructor {

    public static void main(String[] args) {
        Cat cat = new Cat();
    }
}

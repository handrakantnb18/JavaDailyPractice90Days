package com.januaryMonths.generics;

class Animal {
    void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    void makesound() { // Typo here!
        System.out.println("Woof!");
    }
}

public class AnnotationsMain {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound();
    }
}

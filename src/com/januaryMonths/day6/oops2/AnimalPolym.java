package com.januaryMonths.day6.oops2;

import java.util.ArrayList;
import java.util.List;

class Animal {
    public void animalSound() {
        System.out.println("Animal make sound...");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("Wee, Wee");
    }
}

class Dog extends Pig {
    public void animalSound() {
        System.out.println("Bho, Bho...");
    }
}

public class AnimalPolym  extends Dog {
    public static void main(String[] args) {
        AnimalPolym a = new AnimalPolym();
        Animal animal = new Animal();
        Dog dog = new Dog();
        Pig pig = new Pig();

        a.animalSound();
        animal.animalSound();
        dog.animalSound();
        pig.animalSound();
    }
}

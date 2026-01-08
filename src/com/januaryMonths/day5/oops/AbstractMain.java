package com.januaryMonths.day5.oops;

abstract class Animal {
    public abstract void animalName();
    public void sheep() {
        System.out.println("Dog");
    }
}
class Pig extends Animal{
    public void animalName(){
        System.out.println("AAAA");
    }
}
public class AbstractMain {

    public static void main(String[] args) {
        Pig p = new Pig();
        p.sheep();
        p.animalName();
    }
}

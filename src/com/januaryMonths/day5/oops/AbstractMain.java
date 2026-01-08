package com.januaryMonths.day5.oops;

abstract class Animal {
    public abstract void animalName();
    public void type() {
        System.out.println("Dog");
    }
}
class Pig extends Animal{
    public void type(){
        System.out.println("AAAA");
    }
}
public class AbstractMain extends Animal {

    public static void main(String[] args) {
        Animal a = new Animal("AAAA");
        System.out.println(a);
    }
}

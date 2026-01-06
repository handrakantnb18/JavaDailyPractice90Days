package com.januaryMonths.day5.oops;

public class ClassMethods {
    static void display() {
        System.out.println("Chandrakant");
    }

    public void fullThrottle() {
        System.out.println("Car is going fast");
    }

    public void speed( int maxSpeed) {
        System.out.println("MAx speed : "+maxSpeed);
    }

    public static void main(String[] args) {
        ClassMethods cm = new ClassMethods();
        cm.fullThrottle();
        cm.speed(100);
        System.out.println("Chandrakant bhosale");
        display();
    }
}

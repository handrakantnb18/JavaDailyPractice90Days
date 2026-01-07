package com.januaryMonths.day5.oops;

public class AccessModifi {

    final int x = 10;
    final double PI = 3.14;

    static void display() {
        System.out.println("Static method");
    }
    public static void main(String[] args) {
        AccessModifi af = new AccessModifi();
        // af.x = 100;
        // af.PI = 25;
        System.out.println(af.x);
        display();

    }
}

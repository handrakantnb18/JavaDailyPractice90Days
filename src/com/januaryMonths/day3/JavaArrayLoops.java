package com.januaryMonths.day3;

public class JavaArrayLoops {
    public static void main(String[] args) {
        String[] cars = {"BMW", "Maruthi", "Ford", "Valvo"};
        System.out.println(cars[1]);

        String[] cars1 = {"BMW", "Maruthi", "Ford", "Valvo"};
        cars1[0] = "Leyland";
        System.out.println(cars[1]);

        System.out.println(cars1.length);
    }
}

package com.januaryMonths.day12.collections.List;

import java.util.ArrayList;
// access elements
public class CarsArrayList {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("TATA");
        cars.add("SUZUKI");
        cars.add("YAMAHA");

        cars.add(2, "Hundai");

        System.out.println(cars);
    }
}

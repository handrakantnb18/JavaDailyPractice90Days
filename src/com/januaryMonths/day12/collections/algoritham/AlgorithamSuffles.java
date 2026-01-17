package com.januaryMonths.day12.collections.algoritham;

import java.util.ArrayList;
import java.util.Collections;

public class AlgorithamSuffles {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("TATA");
        cars.add("BMW");
        cars.add("Bajaj");
        cars.add("Honda");
        cars.add("Mahindra");

        Collections.shuffle(cars);
        System.out.println(cars);
    }
}

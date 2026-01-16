package com.januaryMonths.day12.collections.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String > cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("TATA");
        cars.add("Suzuki");
        cars.add("Bajaj");

        Iterator<String > it = cars.iterator();

        System.out.println(it.next());
    }
}

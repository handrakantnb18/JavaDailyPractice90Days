package com.januaryMonths.day12.collections.algoritham;

import java.util.ArrayList;
import java.util.Collections;

public class AlgorithamSwap {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Graps");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Orange");

        Collections.swap(fruits, 0, 2);
        System.out.println(fruits);
    }
}

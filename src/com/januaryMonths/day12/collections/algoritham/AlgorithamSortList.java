package com.januaryMonths.day12.collections.algoritham;

import java.util.ArrayList;
import java.util.Collections;

public class AlgorithamSortList {
    public static void main(String[] args) {
        ArrayList<String> city = new ArrayList<>();
        city.add("Mumbai");
        city.add("Pune");
        city.add("Banglore");
        city.add("Dilhi");
        city.add("Panjab");

        Collections.sort(city);
        int a = Collections.binarySearch(city, "Chennai");
        System.out.println("By name : " +a);
        System.out.println("Name of cities : " +city);
    }
}

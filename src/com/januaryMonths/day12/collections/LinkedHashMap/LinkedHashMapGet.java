package com.januaryMonths.day12.collections.LinkedHashMap;

import java.util.LinkedHashMap;

public class LinkedHashMapGet {
    public static void main(String[] args) {
        LinkedHashMap<String, String> capitlas = new LinkedHashMap<>();
        capitlas.put("Maharashtra ", " Mumbai");
        capitlas.put("Karnataka ", " Banglore");
        capitlas.put("Andra pradesh ", " Hydrabad");
        capitlas.put("Goa ", " Panaji");
        capitlas.put("Tamilnadu ", " Chennai");

        capitlas.remove("Andra pradesh ", " Hydrabad");
        System.out.println(capitlas.size());
    }
}

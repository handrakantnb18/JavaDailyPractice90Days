package com.januaryMonths.day12.collections.map;

import java.util.TreeMap;

public class AddTreeMapSize {
    public static void main(String[] args) {
        TreeMap<String, String> capitlas = new TreeMap<>();
        capitlas.put("Maharashtra ", " Mumbai");
        capitlas.put("Karnataka ", " Banglore");
        capitlas.put("Andra pradesh ", " Hydrabad");
        capitlas.put("Goa ", " Panaji");
        capitlas.put("Tamilnadu ", " Chennai");

        System.out.println(capitlas);
        System.out.println(capitlas.size());
    }
}

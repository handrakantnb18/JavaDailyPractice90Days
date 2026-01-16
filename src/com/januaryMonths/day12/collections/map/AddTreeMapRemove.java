package com.januaryMonths.day12.collections.map;

import java.util.TreeMap;

public class AddTreeMapRemove {
    public static void main(String[] args) {
        TreeMap<String, String> capitlas = new TreeMap<>();
        capitlas.put("Maharashtra ", " Mumbai");
        capitlas.put("Karnataka ", " Banglore");
        capitlas.put("Andra pradesh ", " Hydrabad");
        capitlas.put("Goa ", " Panaji");
        capitlas.put("Tamilnadu ", " Chennai");

        capitlas.remove("Karnataka ", " Banglore");
        System.out.println(capitlas);
    }
}

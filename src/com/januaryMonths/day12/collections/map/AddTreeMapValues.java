package com.januaryMonths.day12.collections.map;

import java.util.TreeMap;

public class AddTreeMapValues {
    public static void main(String[] args) {
        TreeMap<String, String> capitlas = new TreeMap<>();
        capitlas.put("Maharashtra ", " Mumbai");
        capitlas.put("Karnataka ", " Banglore");
        capitlas.put("Andra pradesh ", " Hydrabad");
        capitlas.put("Goa ", " Panaji");
        capitlas.put("Tamilnadu ", " Chennai");

        for (String a : capitlas.keySet()) {
            System.out.println(a);
        }
        System.out.println(capitlas);
        System.out.println(capitlas.size());
    }
}

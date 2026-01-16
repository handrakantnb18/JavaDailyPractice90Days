package com.januaryMonths.day12.collections.map;

import java.util.HashMap;

public class CityandCapitalsValues {
    public static void main(String[] args) {
        HashMap<String, String> capitlas = new HashMap<String, String>();
        capitlas.put("Maharashtra ", " Mumbai");
        capitlas.put("Karnataka ", " Banglore");
        capitlas.put("Andra pradesh ", " Hydrabad");
        capitlas.put("Goa ", " Panaji");
        capitlas.put("Tamilnadu ", " Chennai");

        for (String i : capitlas.values()) {
            System.out.println(i);
        }
        System.out.println(capitlas);

        System.out.println(capitlas.size());
    }
}

package com.januaryMonths.day12.collections.map;

import java.util.HashMap;

public class CityandCapitalsRemove {
    public static void main(String[] args) {
        HashMap<String, String> capitlas = new HashMap<String, String>();
        capitlas.put("Maharashtra ", " Mumbai");
        capitlas.put("Karnataka ", " Banglore");
        capitlas.put("Andra pradesh ", " Hydrabad");
        capitlas.put("Goa ", " Panaji");
        capitlas.put("Tamilnadu ", " Chennai");

        capitlas.remove("Goa ", " Panaji");

        System.out.println(capitlas);
    }
}

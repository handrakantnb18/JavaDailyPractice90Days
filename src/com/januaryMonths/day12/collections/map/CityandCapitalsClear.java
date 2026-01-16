package com.januaryMonths.day12.collections.map;

import java.util.HashMap;

public class CityandCapitalsClear {
    public static void main(String[] args) {
        HashMap<String, String> capitlas = new HashMap<String, String>();
        capitlas.put("Maharashtra ", " Mumbai");
        capitlas.put("Karnataka ", " Banglore");
        capitlas.put("Andra pradesh ", " Hydrabad");
        capitlas.put("Goa ", " Panaji");
        capitlas.put("Tamilnadu ", " Chennai");

        capitlas.clear();

        System.out.println(capitlas);
    }
}

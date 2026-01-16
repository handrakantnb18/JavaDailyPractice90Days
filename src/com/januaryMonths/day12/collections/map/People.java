package com.januaryMonths.day12.collections.map;

import java.util.HashMap;

public class People {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(101, "Ram");
        hm.put(201, "Shyam");
        hm.put(301, "Chandrakant");
        hm.put(401, "Rohit");
        hm.put(501, "Virat");

        for (Integer a : hm.keySet()) {
            System.out.println("Key : "+ a + ", Values -: "+hm.get(a));
        }
    }
}

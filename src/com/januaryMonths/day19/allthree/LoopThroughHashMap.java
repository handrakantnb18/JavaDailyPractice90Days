package com.januaryMonths.day19.allthree;

import java.util.HashMap;

public class LoopThroughHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> name = new HashMap<>();
        name.put("Chandraaknt", 101);
        name.put("Priyanka", 102);
        name.put("Ram", 103);
        name.put("Vijay", 104);

        for (String i : name.keySet()) {
            System.out.println(i);
        }

        for (String j : name.keySet()) {
            System.out.println("Keys : " +j + " Values " +name);
        }

//        for (String z : name.values()) {
//            System.out.println(z);
//        }
    }
}

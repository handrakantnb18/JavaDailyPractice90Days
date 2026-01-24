package com.januaryMonths.day19.allthree;

import java.util.ArrayList;

public class LoopThroughArrayList {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("Chandrakant");
        name.add("Priyanka");
        name.add("Ram");
        name.add("Vijay");

        for (String i : name) {
            System.out.println(i);
        }
    }
}

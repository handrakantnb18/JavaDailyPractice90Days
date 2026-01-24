package com.januaryMonths.day19.allthree;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        String[] emp = {"Chandrakant", "Priyanka", "Ram", "Vijay", "Shyam", "Subhash", "Sachin"};
        Arrays.sort(emp);

        for (String i : emp) {
            System.out.println(i);
        }
    }
}

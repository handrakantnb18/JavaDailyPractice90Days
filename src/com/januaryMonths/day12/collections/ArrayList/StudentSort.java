package com.januaryMonths.day12.collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class StudentSort {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Sachin");
        arrayList.add("Vijay");
        arrayList.add("Sam");
        arrayList.add("Shan");

        Collections.sort(arrayList);

        for (String i : arrayList) {
            System.out.println(i);
        }
    }
}

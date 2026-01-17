package com.januaryMonths.day12.collections.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorMethod {
    public static void main(String[] args) {
        ArrayList<String> emp = new ArrayList<>();
        emp.add("Seema");
        emp.add("Samay");
        emp.add("Sayali");
        emp.add("Siva");
        emp.add("Sagar");

        Iterator<String> it = emp.iterator();

        System.out.println(it.next());
    }
}

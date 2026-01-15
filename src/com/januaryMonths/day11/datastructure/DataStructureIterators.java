package com.januaryMonths.day11.datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class DataStructureIterators {
    public static void main(String[] args) {

        ArrayList<String> cricketer = new ArrayList<>();
        cricketer.add("Rohit");
        cricketer.add("Virat");
        cricketer.add("Vrushabh");
        cricketer.add("Smruthi");
        cricketer.add("Rahul");

        Iterator<String> it = cricketer.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

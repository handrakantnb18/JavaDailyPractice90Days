package com.januaryMonths.day12.collections.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorRemoveItem {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(25);
        numbers.add(55);

        Iterator<Integer> it = numbers.iterator();

        while (it.hasNext()) {
            Integer i = it.next();
            if (i < 26) {
                it.remove();
            }
        }
        System.out.println(numbers);

    }
}

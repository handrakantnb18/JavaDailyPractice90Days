package com.januaryMonths.day12.collections.List;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeListinSort {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(12);
        num.add(5);
        num.add(100);
        num.add(55);
        num.add(85);
        num.add(78);

        Collections.sort(num);

        for (int i : num) {
            System.out.println(i);
        }
    }
}

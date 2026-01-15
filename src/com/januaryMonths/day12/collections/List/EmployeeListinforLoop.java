package com.januaryMonths.day12.collections.List;

import java.util.ArrayList;

public class EmployeeListinforLoop {
    public static void main(String[] args) {
        ArrayList<String> emp = new ArrayList<>();
        emp.add("Ajit");
        emp.add("Shyam");
        emp.add("Ram");
        emp.add("Virat");

        for (String i : emp) {
            System.out.println(i);
        }
    }
}

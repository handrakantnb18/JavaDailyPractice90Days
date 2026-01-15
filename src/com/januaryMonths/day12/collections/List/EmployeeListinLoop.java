package com.januaryMonths.day12.collections.List;

import java.util.ArrayList;

public class EmployeeListinLoop {
    public static void main(String[] args) {
        ArrayList<String> emp = new ArrayList<>();
        emp.add("Rohit");
        emp.add("Sachin");
        emp.add("Rahul");
        emp.add("Sameer");
        emp.add("Sourabh");

        for (int i = 0; i < emp.size(); i++) {
            System.out.println(emp.get(i));
        }
    }
}

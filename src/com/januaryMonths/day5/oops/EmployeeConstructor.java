package com.januaryMonths.day5.oops;

public class EmployeeConstructor {

    String fName;
    String lName;
    int age = 34;

    public EmployeeConstructor(String firstName, String lastName, int a) {
        fName = firstName;
        lName = lastName;
        age = a;
    }

    public static void main(String[] args) {
        EmployeeConstructor emp = new EmployeeConstructor("Chandrakant ", "Bhosale", 34);
        System.out.println(emp.fName + " " + emp.lName + " " + emp.age);
    }
}

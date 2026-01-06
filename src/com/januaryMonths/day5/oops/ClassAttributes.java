package com.januaryMonths.day5.oops;

public class ClassAttributes {
    String fName = "Chandrakant";
    String lName = "Bhosale";
    int age = 25;

    public static void main(String[] args) {
        ClassAttributes ca = new ClassAttributes();
        System.out.println("Name : "+ ca.fName + " " + ca.lName);
        System.out.println("Age : " +ca.age);
    }
}

package com.januaryMonths.day5.oops;

 class Person {
     public String fName = "Chandrakant";
     private int age = 30;

 }
public class AccessModifires {

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.fName);
        //System.out.println(person.age);
    }
}

package com.januaryMonths.day16.advancedsorting;

import java.util.ArrayList;
import java.util.Collections;

class Person implements Comparable {
    public String name;
    public String address;
    public int age;

    public Person(String n, String d, int a) {
        name = n;
        address = d;
        age = a;
    }

    public int compareTo(Object obj) {
        Person ot = (Person) obj;

        if (age < ot.age)
            return -1;
        if (age > ot.age)
            return -1;

        return 0;
    }
}

public class ComparableMain {
    public static void main(String[] args) {
        ArrayList<Person> myperson = new ArrayList<Person>();

        myperson.add(new Person("Chandrakant", "Sangli", 33));
        myperson.add(new Person("Priyanka", "Kolhapur", 27));
        myperson.add(new Person("Vijay", "Sangli", 30));

        Collections.sort(myperson);

        for (Person c : myperson) {
            System.out.println(c.name+ " " + c.address + " " + c.age);

        }
    }
}

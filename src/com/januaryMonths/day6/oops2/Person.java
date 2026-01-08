package com.januaryMonths.day6.oops2;

public class Person {

    private String name;

    public String getName() {
        return name;
    }

    public String setName(String newName) {
        this.name = newName;
        return newName;
    }

    class Main {
        public static void main(String[] args) {
            Person p = new Person();
            p.setName("Chandrakant");
            System.out.println(p.getName());
        }
    }
}


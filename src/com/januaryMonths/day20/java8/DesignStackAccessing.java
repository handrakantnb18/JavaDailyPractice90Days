package com.januaryMonths.day20.java8;

import java.util.Stack;

public class DesignStackAccessing {
    public static void main(String[] args) {
        Stack<String> stack3 = new Stack<>();

        stack3.push("Welcome");
        stack3.push("To");
        stack3.push("Chandraknt");
        stack3.push("and");
        stack3.push("Priyanka");

        System.out.println("Initioal stack : " +stack3);
        System.out.println("The element at the top of the "+ "stack is : " + stack3.peek());
        System.out.println("Final stack : " + stack3);
    }
}

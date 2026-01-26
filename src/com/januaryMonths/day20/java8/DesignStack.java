package com.januaryMonths.day20.java8;

import java.util.Stack;

public class DesignStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());

            Stack<String> stack1 = new Stack<>();

            Stack<String> stack2 = new Stack<>();

            stack1.push("1");
            stack1.push("Chandrakant");
            stack1.push("Bhosale");

            stack2.push("2");
            stack2.push("Priyanka");
            stack2.push("Bhosale");

            System.out.println(stack1);
            System.out.println(stack2);

        }
    }
}

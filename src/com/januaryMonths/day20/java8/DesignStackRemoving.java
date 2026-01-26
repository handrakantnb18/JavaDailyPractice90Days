package com.januaryMonths.day20.java8;

import java.util.Stack;

public class DesignStackRemoving {
    public static void main(String[] args) {

        //  Removing Elements  pop() method we can delete and return the top element from the stack.

        Stack<Integer> stack4 = new Stack<Integer>();

        stack4.push(101);
        stack4.push(102);
        stack4.push(107);
        stack4.push(103);
        stack4.push(5);

        System.out.println("Initial stack : "+stack4);

        System.out.println("Popped element : " + stack4.pop());

        System.out.println("Stack after pop operation : " +stack4);

        System.out.println("Stack is Empty : " + stack4.empty());

        stack4.pop();
        stack4.pop();
        stack4.pop();

        System.out.println("Stack is empty : "+stack4.empty());
    }
}

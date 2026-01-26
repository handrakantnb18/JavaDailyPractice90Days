package com.januaryMonths.day20.java8;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class DesignStackPrioritize {
    public static void main(String[] args) {

        // Prioritize Use of Deque over Stack

        Stack<Integer> stack5 = new Stack<>();
        Deque<Integer> deque = new ArrayDeque<>();

        stack5.push(1);
        deque.push(2);
        stack5.push(3);
        deque.push(4);

        List<Integer> list2 = stack5.stream()
                .collect(Collectors.toList());
        System.out.println("Using stack : ");

        for (int i = 0; i < list2.size(); i++){
            System.out.println(list2.get(i) + " ");
        }
        System.out.println();

        List<Integer> list3 = deque.stream()
                .collect(Collectors.toList());
        System.out.println("Using Deque : ");

        for (int i = 0; i < list3.size(); i++) {
            System.out.println(list3.get(i) + " ");
        }
        System.out.println();
    }
}

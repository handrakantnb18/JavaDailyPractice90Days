package com.januaryMonths.generics;

public class MainGene {

    public static <T> void printArray(T[] array) {
        for (T item : array) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        String[] names = {"Chandrakant", "Bhosale"};

        Integer[] numbers = {1, 2, 3, 4};

        printArray(names);
        printArray(numbers);
    }
}

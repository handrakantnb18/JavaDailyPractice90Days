package com.januaryMonths.generics;

class State<T extends Number> {
    T[] nums;

    State(T[] nums) {
        this.nums = nums;
    }

    double average() {
        double sum = 0;
        for (T num : nums) {
            sum += num.doubleValue();
        }
        return sum / nums.length;
    }
}

public class BoundedType {

    public static void main(String[] args) {
        Integer[] numbers = {10, 20, 30, 40, 50, 60};
        State<Integer> intState = new State<>(numbers);
        System.out.println("Integer averages : " + intState.average());

        Double[] doubleNums = {1.5, 2.5, 3.5, 4.5, 5.5};
        State<Double> doubleState = new State<>(doubleNums);
        System.out.println("Double average : " + doubleState.average());
    }
}

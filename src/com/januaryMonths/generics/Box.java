package com.januaryMonths.generics;

class Main<T> {
    T value;

    void set(T value) {
        this.value = value;
    }

    T get() {
        return value;
    }
}

public class Box {
    public static void main(String[] args) {
        Main<String> stringMain = new Main<>();
        stringMain.set("Chandrakant");
        System.out.println("Value : " + stringMain.get());

        Main<Integer> integerMain = new Main<>();
        integerMain.set(50);
        System.out.println("Value : " + integerMain.get());

    }
}

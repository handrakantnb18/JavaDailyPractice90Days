package com.januaryMonths.day5.oops;

public class ManyConstructor {
    int modelYear;
    String modelName;

    public ManyConstructor(int year, String name) {
        modelYear = year;
        modelName = name;
    }
    public static void main(String[] args) {
        ManyConstructor mcs = new ManyConstructor(1996, "TATA");
        System.out.println(mcs.modelYear + " " + mcs.modelName);
    }
}

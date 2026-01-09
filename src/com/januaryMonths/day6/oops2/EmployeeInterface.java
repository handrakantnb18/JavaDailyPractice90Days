package com.januaryMonths.day6.oops2;

interface Admin1 {
    public void juniorAdmin();
    public void SiniorAdmin();
}

class Engineer1 implements Admin1 {
    public void juniorAdmin() {
        System.out.println("Good work...");
    }
    public void SiniorAdmin() {
        System.out.println("ABCDEF...");
    }
}

public class EmployeeInterface {

    public static void main(String[] args) {
        Engineer1 e = new Engineer1();
        e.juniorAdmin();
        e.SiniorAdmin();
    }
}

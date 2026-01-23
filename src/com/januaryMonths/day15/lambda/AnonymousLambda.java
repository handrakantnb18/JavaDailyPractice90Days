package com.januaryMonths.day15.lambda;

interface Greeting {
    void sayHello();
}

public class AnonymousLambda {
    public static void main(String[] args) {
Greeting g = new Greeting() {
    public void sayHello() {
        System.out.println("Hello from anonymous class");
    }
};
g.sayHello();
    }
}

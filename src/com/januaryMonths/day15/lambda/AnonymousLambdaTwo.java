package com.januaryMonths.day15.lambda;
interface Greetingg {
    void Welcome();
}

public class AnonymousLambdaTwo {
    public static void main(String[] args) {
        Greetingg g = () ->
                System.out.println("Welcome to india");
        g.Welcome();
    }
}

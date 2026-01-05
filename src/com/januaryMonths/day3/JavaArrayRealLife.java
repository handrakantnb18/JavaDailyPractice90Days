package com.januaryMonths.day3;

public class JavaArrayRealLife {
    public static void main(String[] args) {
        int ages[] = {20, 25, 35, 65, 59, 58 ,78};

        float avg, sum = 0;

        int length = ages.length;

        for (int age : ages){
            sum += age;
        }
        avg = sum / length;

        int lowestAge = 0;

        for (int age : ages) {
            if (lowestAge > age) {
                lowestAge = age;
            }
            System.out.println("Lowest Age : "+lowestAge);
        }

        System.out.println("The average age is : "+avg);
    }
}

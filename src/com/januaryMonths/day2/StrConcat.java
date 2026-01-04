package com.januaryMonths.day2;

// 1) String Concat with simple way
public class StrConcat {
    public static void main(String[] args) {
        String firstName = "Chandrakant";
        String lastName = "Bhosale";

        System.out.println(firstName+ " " +lastName);

        // 2) concat with sentence

        String name = "Priyanka";
        int age = 25;
        String city = "Pune";

        System.out.println("My name is "+name+" and I am "+age+" years old and my current city is "+city);

        // 3) we have used concat() method created multiple concat string

        String fName = "Rahul";
        String lName = " Patil ";
        String city1  = "Mumbai";

        System.out.println(fName.concat(lName).concat(city1));

        // 4) onle one concat() method

        String fullName = "Sharad Bhosale";
        String state = " MH";

        System.out.println(fullName.concat(state));

    }
}

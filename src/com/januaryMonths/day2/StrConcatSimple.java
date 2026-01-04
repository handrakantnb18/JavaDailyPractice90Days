package com.januaryMonths.day2;

// string concatination
public class StrConcatSimple {
    public static void main(String[] args) {
        String firstName = "Chandraknt";
        String lastName = "Bhosale";

        System.out.println(firstName+ " " +lastName);

        // concatination in sentance

        String name = "Priyanka";
        int age = 25;

        System.out.println("My name is "+name+ " and i am "+age+" years old");

        // concat methods

        String fName = "Priyanka";
        String lName = " Bhosale";

        System.out.println(fName.concat(lName));

        // multiple words concat

        String a = "java";
        String b = " is";
        String c = " OOPS";
        String d = " Language";

        String result = a.concat(b).concat(c).concat(d);
        System.out.println(result);
    }
}

package com.allCodingPracticeOnlyByLinkedIn;

public class CountOccurrenceEachCharactor {
    public static void main(String[] args) {

        String string = "Chandraakant bhosale kjkjfchciedjhfciuedh";
        char[] ch = string.toCharArray();
        boolean[] booleans = new boolean[string.length()];

        System.out.println("Charactor Occurrence : ");

        for (int i = 0; i < ch.length; i++) {
            if (booleans[i])
                continue;

            int c = 1;

            for (int j = i +1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    c++;
                    booleans[j] =true;
                }
            }
            System.out.println(ch[i] + " : " +c);
        }
    }
}

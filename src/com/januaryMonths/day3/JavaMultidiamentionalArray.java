package com.januaryMonths.day3;

public class JavaMultidiamentionalArray {
    public static void main(String[] args) {
        int[][] numbers = {{1, 4, 7}, {2, 5, 8}};
        System.out.println(numbers[1][1]);

        int [][] num = {{3, 6, 9},{2, 4, 8}};
        num[1][2] = 9;
        System.out.println(num[1][2]);

        int[][] n = {{1, 4, 5},{2, 3, 6, 7, 9, 8}};

        System.out.println("Rows : "+n.length);
        System.out.println("Columns in row 0 : "+n[0].length);
        System.out.println("Columns in row 1 : "+n[1].length);

        for (int row = 0; row < n.length; row++) {
            for (int col = 0; col < n[row].length; col++) {
                System.out.println("Numbers : [" + row + "] ["+ col + "] =" + n[row][col]);
            }


        }
    }
}

package com.januaryMonths.day10.inputoutputstreem;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("xyz.txt"))){
            bw.write("First line");
            bw.newLine();
            bw.write("Second line");
            System.out.println("Successfully wrote to the file.");
        }catch (IOException e) {
            System.out.println("Error writing file.");
        }
    }
}

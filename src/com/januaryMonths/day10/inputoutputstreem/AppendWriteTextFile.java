package com.januaryMonths.day10.inputoutputstreem;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AppendWriteTextFile {
    public static void main(String[] args) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("abc.txt", true))){
            bufferedWriter.newLine();
            bufferedWriter.write("Appended line.");
            System.out.println("Successfully appended to the file");
        }catch (IOException e) {
            System.out.println("Error writing file.");
        }
    }
}

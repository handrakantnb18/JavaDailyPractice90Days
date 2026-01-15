package com.januaryMonths.day9.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {
    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("append.txt")){
            fileWriter.write("\nAppended text!.");
            System.out.println("Successfully appended...");
        }catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

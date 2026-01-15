package com.januaryMonths.day10.inputoutputstreem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("abc.txt"))){
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}

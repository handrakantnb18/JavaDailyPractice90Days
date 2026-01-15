package com.januaryMonths.day9.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileHandling {
    public static void main(String[] args) {
        File obj = new File("abc.txt");

        try (Scanner scanner = new Scanner(obj)){
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);
            }
        }catch (FileNotFoundException e) {
            System.out.println("An error found...");
            e.printStackTrace();
        }
    }
}

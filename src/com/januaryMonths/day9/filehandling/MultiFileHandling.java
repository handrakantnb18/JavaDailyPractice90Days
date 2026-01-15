package com.januaryMonths.day9.filehandling;

import java.io.File;
import java.io.IOException;

public class MultiFileHandling {
    public static void main(String[] args) {
        System.out.println("Multiple file handling...");
        try {
            File obj = new File("index.txt");
            if (obj.createNewFile()) {
                System.out.println("File created : "+obj.getName());
            }else
            {
                System.out.println("File already existed.");
            }
        }catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        System.out.println("Please check again...");
    }
}

package com.januaryMonths.day9.filehandling;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("abc1.txt");
        if (file.delete()) {
            System.out.println("Deleted the file : " +file.getName());
        }else  {
            System.out.println("Failed to delete the file.");
        }
    }
}

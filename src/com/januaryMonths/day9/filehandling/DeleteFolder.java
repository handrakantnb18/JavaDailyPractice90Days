package com.januaryMonths.day9.filehandling;

import java.io.File;

public class DeleteFolder {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\abc\\abc");
        if (file.delete()) {
            System.out.println("Deleted to folder : " +file.getName());
        }else {
            System.out.println("Failed to delete the foulder.");
        }
    }
}

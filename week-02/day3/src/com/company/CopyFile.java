package com.company;

import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CopyFile {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the whole path to the file which content you want to copy:");
        String fileNameOne = scanner.next();
        System.out.println("Write the whole path to the file where you want to copy the content of the first file:");
        String fileNameTwo= scanner.next();
        System.out.println(copy(fileNameOne, fileNameTwo));
    }
    public static boolean copy (String filenameOne, String filenameTwo) throws IOException {
           try {
               Path myPath = Paths.get(filenameOne);
        Files.copy(myPath, Path.of(filenameTwo));
        return true;
           } catch (IOException e) {
            return false;
           }
    }
}

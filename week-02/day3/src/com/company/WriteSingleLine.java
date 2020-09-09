package com.company;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Zuzana");
        try {
            Path myPath = Paths.get("my-file.txt");
            Files.write(myPath, myList);
        } catch (IOException e) {
            System.out.println("Unable to write file: my-file.txt");
        }
    }
}
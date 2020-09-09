package com.company;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class PrintEachLine {

    public static void main(String[] args) throws IOException {
        try {
            Path myPath = Paths.get("my-file.txt");

            List<String> myList = Files.readAllLines(myPath);
            for (String item : myList) {
                System.out.println(item);
            }
        } catch (IOException e){
            System.out.println("Unable to read file: my-file.txt");
        }
    }
}

package WikiCount;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) throws IOException {
        String article = "";
        try{
            article = Files.readString(Paths.get("src/WikiCount/article.txt"));
        } catch (IOException e) {
        System.out.println("No such file!");
        }

        List<String> words = Arrays.asList(article.split(" "));

        Map<String, Long> allWords = words.stream()
                .filter(Objects::nonNull)
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        allWords.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(10)
                .forEach(System.out::println);
    }
}

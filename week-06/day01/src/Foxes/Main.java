package Foxes;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Fox> foxes = new ArrayList<>();
        foxes.add(new Fox("Foxie","blue", 12));
        foxes.add(new Fox("Moxie","green", 3));
        foxes.add(new Fox("Toxie","yellow", 10));
        foxes.add(new Fox("Roxie","green", 15));
        foxes.add(new Fox("Choxie","pink", 5));

        foxes.stream().filter(fox -> fox.getColor().equals("green")).map(Fox::getName).forEach(System.out::println);

        foxes.stream().filter(fox -> fox.getColor().equals("green") && fox.getAge() < 5).map(Fox::getName).forEach(System.out::println);

        Map<String, Long> selectedFoxes = foxes.stream().collect(Collectors.groupingBy(Fox::getColor, Collectors.counting()));

        System.out.println(selectedFoxes);
    }
}

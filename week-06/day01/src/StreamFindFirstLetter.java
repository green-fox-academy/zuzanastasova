import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StreamFindFirstLetter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, insert character: ");
        String input = scanner.nextLine();

        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");

        String chosenCities = cities.stream().filter(city -> city.startsWith(input.toUpperCase())).collect(Collectors.joining(", "));

        System.out.println(chosenCities);
    }
}

